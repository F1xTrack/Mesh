package com.p018my.tracker.obfuscated;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* renamed from: com.my.tracker.obfuscated.m1 */
/* loaded from: classes2.dex */
final class C2342m1 {

    /* renamed from: a */
    private final SQLiteDatabase f20035a;

    /* renamed from: b */
    private final SQLiteStatement f20036b;

    /* renamed from: c */
    private final SQLiteStatement f20037c;

    /* renamed from: d */
    private final SQLiteStatement f20038d;

    /* renamed from: com.my.tracker.obfuscated.m1$a */
    public static class a implements InterfaceC2294b {

        /* renamed from: a */
        private final Cursor f20039a;

        public a(Cursor cursor) {
            this.f20039a = cursor;
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2294b
        /* renamed from: a */
        public long mo12786a() {
            return this.f20039a.getLong(0);
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2294b
        /* renamed from: b */
        public boolean mo12787b() {
            return this.f20039a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f20039a.close();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2294b
        /* renamed from: i */
        public byte[] mo12788i() {
            return this.f20039a.getBlob(1);
        }
    }

    public C2342m1(SQLiteDatabase sQLiteDatabase) {
        this.f20035a = sQLiteDatabase;
        this.f20036b = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id not in   (SELECT id    FROM table_partial_proto_packet    ORDER BY TS DESC    LIMIT ?  )");
        this.f20037c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_partial_proto_packet(data, ts) VALUES (?, ?)");
        this.f20038d = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id = ?");
    }

    /* renamed from: a */
    public static void m13300a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_partial_proto_packet(id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, ts INTEGER(8))");
    }

    /* renamed from: b */
    public void m13304b(long j) {
        this.f20036b.bindLong(1, j);
        this.f20036b.executeUpdateDelete();
    }

    /* renamed from: a */
    public void m13302a(long j) {
        this.f20038d.bindLong(1, j);
        this.f20038d.executeUpdateDelete();
    }

    /* renamed from: a */
    public InterfaceC2294b m13301a() {
        return new a(this.f20035a.rawQuery("SELECT id, data FROM table_partial_proto_packet ORDER BY ts", null));
    }

    /* renamed from: a */
    public void m13303a(byte[] bArr) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f20037c.bindBlob(1, bArr);
            this.f20037c.bindLong(2, jCurrentTimeMillis);
            this.f20037c.executeInsert();
        } finally {
            this.f20037c.clearBindings();
        }
    }
}
