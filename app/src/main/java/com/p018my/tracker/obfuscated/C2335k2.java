package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import p000.AbstractC7222ym;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.my.tracker.obfuscated.k2 */
/* loaded from: classes2.dex */
public final class C2335k2 {

    /* renamed from: a */
    private final String[] f20008a = new String[1];

    /* renamed from: b */
    private final SQLiteDatabase f20009b;

    /* renamed from: c */
    private final SQLiteStatement f20010c;

    /* renamed from: d */
    private final SQLiteStatement f20011d;

    /* renamed from: e */
    private final SQLiteStatement f20012e;

    /* renamed from: f */
    private final SQLiteStatement f20013f;

    /* renamed from: com.my.tracker.obfuscated.k2$a */
    public static abstract class a implements Closeable {

        /* renamed from: a */
        final Cursor f20014a;

        public a(Cursor cursor) {
            this.f20014a = cursor;
        }

        /* renamed from: b */
        public final boolean m13282b() {
            return this.f20014a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f20014a.close();
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("TimeSpentDataBaseSQL: AbstractReader error: error while closing cursor", th);
            }
        }

        public void finalize() throws Throwable {
            super.finalize();
            close();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.k2$b */
    public static final class b extends a {
        public b(Cursor cursor) {
            super(cursor);
        }

        /* renamed from: m */
        public byte[] m13283m() {
            return this.f20014a.getBlob(2);
        }

        /* renamed from: n */
        public long m13284n() {
            return this.f20014a.getLong(0);
        }
    }

    private C2335k2(SQLiteDatabase sQLiteDatabase) {
        this.f20009b = sQLiteDatabase;
        this.f20011d = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM table_tick_packet");
        this.f20010c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_tick_packet(timestamp, content) VALUES (?, ?)");
        this.f20012e = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id = ?");
        this.f20013f = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id IN (SELECT packet_id FROM table_tick_packet ORDER BY timestamp ASC LIMIT ?)");
    }

    /* renamed from: a */
    public int m13277a(int i) {
        this.f20013f.clearBindings();
        this.f20013f.bindLong(1, i);
        int iExecuteUpdateDelete = this.f20013f.executeUpdateDelete();
        AbstractC2391y2.m13568a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " oldest tick packet(s) removed from database (reason: delete " + i + " oldest tick packets)");
        return iExecuteUpdateDelete;
    }

    /* renamed from: b */
    public b m13281b(int i) {
        this.f20008a[0] = String.valueOf(i);
        return new b(this.f20009b.rawQuery("SELECT packet_id, timestamp, content FROM table_tick_packet ORDER BY timestamp DESC LIMIT ?", this.f20008a));
    }

    /* renamed from: a */
    public int m13278a(long j) {
        this.f20012e.clearBindings();
        this.f20012e.bindLong(1, j);
        int iExecuteUpdateDelete = this.f20012e.executeUpdateDelete();
        AbstractC2391y2.m13568a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " tick packet removed from database (reason: delete tick packet with packetId = " + j + ")");
        return iExecuteUpdateDelete;
    }

    /* renamed from: a */
    public void m13280a(long[] jArr) {
        this.f20009b.beginTransaction();
        try {
            int iM13278a = 0;
            for (long j : jArr) {
                iM13278a += m13278a(j);
            }
            AbstractC2391y2.m13568a("TimeSpentDataBaseSQL: " + iM13278a + " tick packet(s) removed from database (reason: delete " + jArr.length + " tick packets)");
            this.f20009b.setTransactionSuccessful();
            this.f20009b.endTransaction();
        } catch (Throwable th) {
            this.f20009b.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public int m13276a() {
        return (int) this.f20011d.simpleQueryForLong();
    }

    /* renamed from: a */
    public static C2335k2 m13275a(String str, Context context) throws Exception {
        String strM26234k = AbstractC7222ym.m26234k("mytracker_timespent_", str, ".db");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(strM26234k, 0, null);
        if (sQLiteDatabaseOpenOrCreateDatabase == null) {
            throw new Exception("TimeSpentDataBaseSQL: context.openOrCreateDatabase failed");
        }
        if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 1) {
            sQLiteDatabaseOpenOrCreateDatabase.close();
            context.deleteDatabase(strM26234k);
            sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(strM26234k, 0, null);
            sQLiteDatabaseOpenOrCreateDatabase.setVersion(1);
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_tick_packet(packet_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, content BLOB NOT NULL)");
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_tick_packettimestamp ON table_tick_packet(timestamp)");
        }
        return new C2335k2(sQLiteDatabaseOpenOrCreateDatabase);
    }

    /* renamed from: a */
    public long m13279a(long j, byte[] bArr) {
        this.f20009b.beginTransaction();
        try {
            this.f20010c.clearBindings();
            this.f20010c.bindLong(1, j);
            this.f20010c.bindBlob(2, bArr);
            long jExecuteInsert = this.f20010c.executeInsert();
            if (jExecuteInsert < 0) {
                throw new Exception("TimeSpentDataBaseSQL: sql insert failed");
            }
            this.f20009b.setTransactionSuccessful();
            AbstractC2391y2.m13568a("TimeSpentDataBaseSQL: 1 tick packet (packetId = " + jExecuteInsert + ") inserted to database (reason: store tick packet)");
            return jExecuteInsert;
        } finally {
            this.f20009b.endTransaction();
        }
    }
}
