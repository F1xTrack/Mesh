package p000;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: aZ */
/* loaded from: classes.dex */
public final class C1672aZ extends SQLiteOpenHelper {

    /* renamed from: h */
    public static final /* synthetic */ int f15556h = 0;

    /* renamed from: a */
    public final Context f15557a;

    /* renamed from: b */
    public final C8170Qm0 f15558b;

    /* renamed from: c */
    public final C8875bc1 f15559c;

    /* renamed from: d */
    public final boolean f15560d;

    /* renamed from: e */
    public boolean f15561e;

    /* renamed from: f */
    public final HD0 f15562f;

    /* renamed from: g */
    public boolean f15563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672aZ(Context context, String str, final C8170Qm0 c8170Qm0, final C8875bc1 c8875bc1, boolean z) {
        super(context, str, null, c8875bc1.f17088a, new DatabaseErrorHandler() { // from class: YY
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                O90.m5968f(c8875bc1, "$callback");
                C8170Qm0 c8170Qm02 = c8170Qm0;
                int i = C1672aZ.f15556h;
                O90.m5967e(sQLiteDatabase, "dbObj");
                C1482XY c1482xyM26032a = AbstractC11746y12.m26032a(c8170Qm02, sQLiteDatabase);
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) c1482xyM26032a.f13844b;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C8875bc1.m10464c(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = (List) c1482xyM26032a.f13845c;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c1482xyM26032a.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            O90.m5967e(obj, "p.second");
                            C8875bc1.m10464c((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            C8875bc1.m10464c(path2);
                        }
                    }
                }
            }
        });
        O90.m5968f(context, "context");
        O90.m5968f(c8875bc1, "callback");
        this.f15557a = context;
        this.f15558b = c8170Qm0;
        this.f15559c = c8875bc1;
        this.f15560d = z;
        if (str == null) {
            str = UUID.randomUUID().toString();
            O90.m5967e(str, "randomUUID().toString()");
        }
        File cacheDir = context.getCacheDir();
        O90.m5967e(cacheDir, "context.cacheDir");
        this.f15562f = new HD0(str, cacheDir, false);
    }

    /* renamed from: a */
    public final C1482XY m9758a(boolean z) throws IOException {
        HD0 hd0 = this.f15562f;
        try {
            hd0.m3330a((this.f15563g || getDatabaseName() == null) ? false : true);
            this.f15561e = false;
            SQLiteDatabase sQLiteDatabaseM9761f = m9761f(z);
            if (!this.f15561e) {
                C1482XY c1482xyM9759c = m9759c(sQLiteDatabaseM9761f);
                hd0.m3331b();
                return c1482xyM9759c;
            }
            close();
            C1482XY c1482xyM9758a = m9758a(z);
            hd0.m3331b();
            return c1482xyM9758a;
        } catch (Throwable th) {
            hd0.m3331b();
            throw th;
        }
    }

    /* renamed from: c */
    public final C1482XY m9759c(SQLiteDatabase sQLiteDatabase) {
        O90.m5968f(sQLiteDatabase, "sqLiteDatabase");
        return AbstractC11746y12.m26032a(this.f15558b, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() throws IOException {
        HD0 hd0 = this.f15562f;
        try {
            hd0.m3330a(hd0.f4174a);
            super.close();
            this.f15558b.f9780b = null;
            this.f15563g = false;
        } finally {
            hd0.m3331b();
        }
    }

    /* renamed from: e */
    public final SQLiteDatabase m9760e(boolean z) {
        if (z) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            O90.m5967e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        O90.m5967e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    /* renamed from: f */
    public final SQLiteDatabase m9761f(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f15557a;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            return m9760e(z);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return m9760e(z);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C1608ZY) {
                    C1608ZY c1608zy = th;
                    int iM26247x = AbstractC7222ym.m26247x(c1608zy.f14962a);
                    Throwable th2 = c1608zy.f14963b;
                    if (iM26247x == 0 || iM26247x == 1 || iM26247x == 2 || iM26247x == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f15560d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return m9760e(z);
                } catch (C1608ZY e) {
                    throw e.f14963b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        O90.m5968f(sQLiteDatabase, "db");
        try {
            C8875bc1 c8875bc1 = this.f15559c;
            m9759c(sQLiteDatabase);
            c8875bc1.getClass();
        } catch (Throwable th) {
            throw new C1608ZY(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        O90.m5968f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f15559c.m10469i(m9759c(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C1608ZY(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        O90.m5968f(sQLiteDatabase, "db");
        this.f15561e = true;
        try {
            this.f15559c.m10471k(m9759c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1608ZY(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        O90.m5968f(sQLiteDatabase, "db");
        if (!this.f15561e) {
            try {
                this.f15559c.m10470j(m9759c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C1608ZY(5, th);
            }
        }
        this.f15563g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        O90.m5968f(sQLiteDatabase, "sqLiteDatabase");
        this.f15561e = true;
        try {
            this.f15559c.m10471k(m9759c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1608ZY(3, th);
        }
    }
}
