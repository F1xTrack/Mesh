package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import defpackage.AbstractC8235ym;
import java.io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k2 {
    private final String[] a = new String[1];
    private final SQLiteDatabase b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final SQLiteStatement e;
    private final SQLiteStatement f;

    public static abstract class a implements Closeable {
        final Cursor a;

        public a(Cursor cursor) {
            this.a = cursor;
        }

        public final boolean b() {
            return this.a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.a.close();
            } catch (Throwable th) {
                y2.b("TimeSpentDataBaseSQL: AbstractReader error: error while closing cursor", th);
            }
        }

        public void finalize() throws Throwable {
            super.finalize();
            close();
        }
    }

    public static final class b extends a {
        public b(Cursor cursor) {
            super(cursor);
        }

        public byte[] m() {
            return this.a.getBlob(2);
        }

        public long n() {
            return this.a.getLong(0);
        }
    }

    private k2(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        this.d = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM table_tick_packet");
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_tick_packet(timestamp, content) VALUES (?, ?)");
        this.e = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id = ?");
        this.f = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id IN (SELECT packet_id FROM table_tick_packet ORDER BY timestamp ASC LIMIT ?)");
    }

    public int a(int i) {
        this.f.clearBindings();
        this.f.bindLong(1, i);
        int iExecuteUpdateDelete = this.f.executeUpdateDelete();
        y2.a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " oldest tick packet(s) removed from database (reason: delete " + i + " oldest tick packets)");
        return iExecuteUpdateDelete;
    }

    public b b(int i) {
        this.a[0] = String.valueOf(i);
        return new b(this.b.rawQuery("SELECT packet_id, timestamp, content FROM table_tick_packet ORDER BY timestamp DESC LIMIT ?", this.a));
    }

    public int a(long j) {
        this.e.clearBindings();
        this.e.bindLong(1, j);
        int iExecuteUpdateDelete = this.e.executeUpdateDelete();
        y2.a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " tick packet removed from database (reason: delete tick packet with packetId = " + j + ")");
        return iExecuteUpdateDelete;
    }

    public void a(long[] jArr) {
        this.b.beginTransaction();
        try {
            int iA = 0;
            for (long j : jArr) {
                iA += a(j);
            }
            y2.a("TimeSpentDataBaseSQL: " + iA + " tick packet(s) removed from database (reason: delete " + jArr.length + " tick packets)");
            this.b.setTransactionSuccessful();
            this.b.endTransaction();
        } catch (Throwable th) {
            this.b.endTransaction();
            throw th;
        }
    }

    public int a() {
        return (int) this.d.simpleQueryForLong();
    }

    public static k2 a(String str, Context context) throws Exception {
        String strK = AbstractC8235ym.k("mytracker_timespent_", str, ".db");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(strK, 0, null);
        if (sQLiteDatabaseOpenOrCreateDatabase == null) {
            throw new Exception("TimeSpentDataBaseSQL: context.openOrCreateDatabase failed");
        }
        if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 1) {
            sQLiteDatabaseOpenOrCreateDatabase.close();
            context.deleteDatabase(strK);
            sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(strK, 0, null);
            sQLiteDatabaseOpenOrCreateDatabase.setVersion(1);
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_tick_packet(packet_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, content BLOB NOT NULL)");
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_tick_packettimestamp ON table_tick_packet(timestamp)");
        }
        return new k2(sQLiteDatabaseOpenOrCreateDatabase);
    }

    public long a(long j, byte[] bArr) {
        this.b.beginTransaction();
        try {
            this.c.clearBindings();
            this.c.bindLong(1, j);
            this.c.bindBlob(2, bArr);
            long jExecuteInsert = this.c.executeInsert();
            if (jExecuteInsert < 0) {
                throw new Exception("TimeSpentDataBaseSQL: sql insert failed");
            }
            this.b.setTransactionSuccessful();
            y2.a("TimeSpentDataBaseSQL: 1 tick packet (packetId = " + jExecuteInsert + ") inserted to database (reason: store tick packet)");
            return jExecuteInsert;
        } finally {
            this.b.endTransaction();
        }
    }
}
