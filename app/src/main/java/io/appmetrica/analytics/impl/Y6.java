package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Y6 extends SQLiteOpenHelper implements Closeable {
    public final String a;
    public final PublicLogger b;
    public final C4584gm c;

    public Y6(Context context, String str, C4584gm c4584gm, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, C5.b);
        this.c = c4584gm;
        this.a = str;
        this.b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            C4557fj c4557fj = Fi.a;
            c4557fj.getClass();
            c4557fj.a(new C4533ej("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            C4557fj c4557fj = Fi.a;
            c4557fj.getClass();
            c4557fj.a(new C4533ej("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C4584gm c4584gm = this.c;
        if (i <= i2) {
            c4584gm.getClass();
            return;
        }
        try {
            c4584gm.b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c4584gm.a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C4584gm c4584gm = this.c;
        c4584gm.getClass();
        try {
            C4608hm c4608hm = c4584gm.d;
            if (c4608hm == null || c4608hm.a(sQLiteDatabase)) {
                return;
            }
            try {
                c4584gm.b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c4584gm.a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        C4584gm c4584gm = this.c;
        c4584gm.getClass();
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    Collection collection = (Collection) c4584gm.c.a.get(Integer.valueOf(i3));
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
        if (z || (!c4584gm.d.a(sQLiteDatabase))) {
            try {
                c4584gm.b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c4584gm.a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
