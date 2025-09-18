package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Y6 */
/* loaded from: classes2.dex */
public final class C4942Y6 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    public final String f31096a;

    /* renamed from: b */
    public final PublicLogger f31097b;

    /* renamed from: c */
    public final C5156gm f31098c;

    public C4942Y6(Context context, String str, C5156gm c5156gm, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC4412C5.f29952b);
        this.f31098c = c5156gm;
        this.f31096a = str;
        this.f31097b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f31097b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f31096a);
            C5128fj c5128fj = AbstractC4499Fi.f30148a;
            c5128fj.getClass();
            c5128fj.m20394a(new C5103ej("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f31097b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f31096a);
            C5128fj c5128fj = AbstractC4499Fi.f30148a;
            c5128fj.getClass();
            c5128fj.m20394a(new C5103ej("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f31098c.f31808a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C5156gm c5156gm = this.f31098c;
        if (i <= i2) {
            c5156gm.getClass();
            return;
        }
        try {
            c5156gm.f31809b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c5156gm.f31808a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C5156gm c5156gm = this.f31098c;
        c5156gm.getClass();
        try {
            C5181hm c5181hm = c5156gm.f31811d;
            if (c5181hm == null || c5181hm.m20506a(sQLiteDatabase)) {
                return;
            }
            try {
                c5156gm.f31809b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c5156gm.f31808a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        C5156gm c5156gm = this.f31098c;
        c5156gm.getClass();
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    Collection collection = (Collection) c5156gm.f31810c.f32190a.get(Integer.valueOf(i3));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (z || (!c5156gm.f31811d.m20506a(sQLiteDatabase))) {
            try {
                c5156gm.f31809b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c5156gm.f31808a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
