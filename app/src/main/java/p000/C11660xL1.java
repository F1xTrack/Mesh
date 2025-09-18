package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* renamed from: xL1 */
/* loaded from: classes.dex */
public final class C11660xL1 extends AbstractC9608hI1 {

    /* renamed from: d */
    public final AA1 f45554d;

    /* renamed from: e */
    public boolean f45555e;

    public C11660xL1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f45554d = new AA1(this, ((C9110dP1) this.f11615b).f26031a);
    }

    /* renamed from: C1 */
    public static long m25842C1(SQLiteDatabase sQLiteDatabase) {
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
    /* renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m25843D1(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11660xL1.m25843D1(int, byte[]):boolean");
    }

    /* renamed from: E1 */
    public final void m25844E1() {
        int iDelete;
        mo7681v1();
        try {
            SQLiteDatabase sQLiteDatabaseM25846G1 = m25846G1();
            if (sQLiteDatabaseM25846G1 == null || (iDelete = sQLiteDatabaseM25846G1.delete("messages", null, null)) <= 0) {
                return;
            }
            mo6070n().f8386o.m24554c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24554c(e, "Error resetting local analytics data. error");
        }
    }

    /* renamed from: F1 */
    public final boolean m25845F1() {
        mo7681v1();
        if (this.f45555e || !((C9110dP1) this.f11615b).f26031a.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM25846G1 = m25846G1();
                        if (sQLiteDatabaseM25846G1 == null) {
                            this.f45555e = true;
                            if (sQLiteDatabaseM25846G1 != null) {
                                sQLiteDatabaseM25846G1.close();
                            }
                            return false;
                        }
                        sQLiteDatabaseM25846G1.beginTransaction();
                        sQLiteDatabaseM25846G1.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM25846G1.setTransactionSuccessful();
                        sQLiteDatabaseM25846G1.endTransaction();
                        sQLiteDatabaseM25846G1.close();
                        return true;
                    } catch (SQLiteFullException e) {
                        mo6070n().f8378g.m24554c(e, "Error deleting app launch break from local database");
                        this.f45555e = true;
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
                mo6070n().f8378g.m24554c(e2, "Error deleting app launch break from local database");
                this.f45555e = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        mo6070n().f8381j.m24555d("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* renamed from: G1 */
    public final SQLiteDatabase m25846G1() {
        if (this.f45555e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f45554d.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f45555e = true;
        return null;
    }

    @Override // p000.AbstractC9608hI1
    /* renamed from: z1 */
    public final boolean mo2654z1() {
        return false;
    }
}
