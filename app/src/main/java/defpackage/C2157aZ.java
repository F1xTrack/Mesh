package defpackage;

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
public final class C2157aZ extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final C1304Qm0 b;
    public final C2359bc1 c;
    public final boolean d;
    public boolean e;
    public final HD0 f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2157aZ(Context context, String str, final C1304Qm0 c1304Qm0, final C2359bc1 c2359bc1, boolean z) {
        super(context, str, null, c2359bc1.a, new DatabaseErrorHandler() { // from class: YY
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                O90.f(c2359bc1, "$callback");
                C1304Qm0 c1304Qm02 = c1304Qm0;
                int i = C2157aZ.h;
                O90.e(sQLiteDatabase, "dbObj");
                XY xyA = AbstractC8095y12.a(c1304Qm02, sQLiteDatabase);
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) xyA.b;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C2359bc1.c(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = (List) xyA.c;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        xyA.close();
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
                            O90.e(obj, "p.second");
                            C2359bc1.c((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            C2359bc1.c(path2);
                        }
                    }
                }
            }
        });
        O90.f(context, "context");
        O90.f(c2359bc1, "callback");
        this.a = context;
        this.b = c1304Qm0;
        this.c = c2359bc1;
        this.d = z;
        if (str == null) {
            str = UUID.randomUUID().toString();
            O90.e(str, "randomUUID().toString()");
        }
        File cacheDir = context.getCacheDir();
        O90.e(cacheDir, "context.cacheDir");
        this.f = new HD0(str, cacheDir, false);
    }

    public final XY a(boolean z) throws IOException {
        HD0 hd0 = this.f;
        try {
            hd0.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase sQLiteDatabaseF = f(z);
            if (!this.e) {
                XY xyC = c(sQLiteDatabaseF);
                hd0.b();
                return xyC;
            }
            close();
            XY xyA = a(z);
            hd0.b();
            return xyA;
        } catch (Throwable th) {
            hd0.b();
            throw th;
        }
    }

    public final XY c(SQLiteDatabase sQLiteDatabase) {
        O90.f(sQLiteDatabase, "sqLiteDatabase");
        return AbstractC8095y12.a(this.b, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() throws IOException {
        HD0 hd0 = this.f;
        try {
            hd0.a(hd0.a);
            super.close();
            this.b.b = null;
            this.g = false;
        } finally {
            hd0.b();
        }
    }

    public final SQLiteDatabase e(boolean z) {
        if (z) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            O90.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        O90.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase f(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.a;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            return e(z);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return e(z);
            } catch (Throwable th) {
                super.close();
                if (th instanceof ZY) {
                    ZY zy = th;
                    int iX = AbstractC8235ym.x(zy.a);
                    Throwable th2 = zy.b;
                    if (iX == 0 || iX == 1 || iX == 2 || iX == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return e(z);
                } catch (ZY e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        O90.f(sQLiteDatabase, "db");
        try {
            C2359bc1 c2359bc1 = this.c;
            c(sQLiteDatabase);
            c2359bc1.getClass();
        } catch (Throwable th) {
            throw new ZY(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        O90.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.c.i(c(sQLiteDatabase));
        } catch (Throwable th) {
            throw new ZY(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        O90.f(sQLiteDatabase, "db");
        this.e = true;
        try {
            this.c.k(c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ZY(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        O90.f(sQLiteDatabase, "db");
        if (!this.e) {
            try {
                this.c.j(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new ZY(5, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        O90.f(sQLiteDatabase, "sqLiteDatabase");
        this.e = true;
        try {
            this.c.k(c(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ZY(3, th);
        }
    }
}
