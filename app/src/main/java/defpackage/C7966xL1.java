package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* renamed from: xL1 */
/* loaded from: classes.dex */
public final class C7966xL1 extends AbstractC4128hI1 {
    public final AA1 d;
    public boolean e;

    public C7966xL1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.d = new AA1(this, ((C3386dP1) this.b).a);
    }

    public static long C1(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0120  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D1(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7966xL1.D1(int, byte[]):boolean");
    }

    public final void E1() {
        int iDelete;
        v1();
        try {
            SQLiteDatabase sQLiteDatabaseG1 = G1();
            if (sQLiteDatabaseG1 == null || (iDelete = sQLiteDatabaseG1.delete("messages", null, null)) <= 0) {
                return;
            }
            n().o.c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            n().g.c(e, "Error resetting local analytics data. error");
        }
    }

    public final boolean F1() {
        v1();
        if (this.e || !((C3386dP1) this.b).a.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseG1 = G1();
                        if (sQLiteDatabaseG1 == null) {
                            this.e = true;
                            if (sQLiteDatabaseG1 != null) {
                                sQLiteDatabaseG1.close();
                            }
                            return false;
                        }
                        sQLiteDatabaseG1.beginTransaction();
                        sQLiteDatabaseG1.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseG1.setTransactionSuccessful();
                        sQLiteDatabaseG1.endTransaction();
                        sQLiteDatabaseG1.close();
                        return true;
                    } catch (SQLiteFullException e) {
                        n().g.c(e, "Error deleting app launch break from local database");
                        this.e = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteException e2) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                n().g.c(e2, "Error deleting app launch break from local database");
                this.e = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        n().j.d("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase G1() {
        if (this.e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.e = true;
        return null;
    }

    @Override // defpackage.AbstractC4128hI1
    public final boolean z1() {
        return false;
    }
}
