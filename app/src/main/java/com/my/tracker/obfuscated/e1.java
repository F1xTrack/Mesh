package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class e1 {
    static long y = -1;
    private final String[] a = new String[1];
    private final h b = new h();
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final SQLiteStatement e;
    private final SQLiteStatement f;
    private final SQLiteStatement g;
    private final SQLiteStatement h;
    private final SQLiteStatement i;
    private final SQLiteStatement j;
    private final SQLiteStatement k;
    private final SQLiteStatement l;
    private final SQLiteStatement m;
    private final SQLiteStatement n;
    private final SQLiteStatement o;
    private final SQLiteStatement p;
    private final SQLiteStatement q;
    private final SQLiteStatement r;
    private final SQLiteStatement s;
    private final SQLiteStatement t;
    private final SQLiteStatement u;
    private final SQLiteStatement v;
    private final m1 w;
    protected final SQLiteDatabase x;

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
                y2.b("AbstractReader error: error while closing cursor", th);
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

        public long a() {
            return this.a.getLong(0);
        }

        public long e() {
            return this.a.getLong(5);
        }

        public String m() {
            return this.a.getString(1);
        }

        public String n() {
            return this.a.getString(2);
        }

        public String o() {
            return this.a.getString(3);
        }

        public int p() {
            return this.a.getInt(4);
        }
    }

    public static final class c extends a {
        public c(Cursor cursor) {
            super(cursor);
        }

        public long a() {
            return this.a.getLong(0);
        }

        public long c() {
            return this.a.getLong(4);
        }

        public long g() {
            return this.a.getLong(1);
        }

        public byte[] l() {
            return this.a.getBlob(3);
        }
    }

    public static final class d extends a {
        public d(Cursor cursor) {
            super(cursor);
        }

        public long e() {
            return this.a.getLong(1);
        }
    }

    public static final class e extends a {
        public e(Cursor cursor) {
            super(cursor);
        }

        public long a() {
            return this.a.getLong(0);
        }

        public long e() {
            return this.a.getLong(3);
        }

        public String m() {
            return this.a.getString(1);
        }

        public String n() {
            return this.a.getString(2);
        }
    }

    public static final class f extends a {
        public f(Cursor cursor) {
            super(cursor);
        }

        public long a() {
            return this.a.getLong(0);
        }

        public long c() {
            return this.a.getLong(3);
        }

        public String k() {
            return this.a.getString(1);
        }

        public long m() {
            return this.a.isNull(2) ? e1.y : this.a.getLong(2);
        }
    }

    public static final class g extends a {
        public g(Cursor cursor) {
            super(cursor);
        }

        public long m() {
            return this.a.getLong(2);
        }

        public long n() {
            return this.a.getLong(1);
        }

        public boolean o() {
            return this.a.isNull(2);
        }
    }

    public static final class h implements SQLiteDatabase.CursorFactory {
        long a;
        byte[] b;

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.a);
            sQLiteQuery.bindBlob(2, this.b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private e1(SQLiteDatabase sQLiteDatabase) {
        this.x = sQLiteDatabase;
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.n = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.v = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
        this.w = new m1(sQLiteDatabase);
    }

    public void a() {
        this.m.execute();
    }

    public void b() {
        this.n.execute();
    }

    public void c() {
        this.o.execute();
    }

    public void d() {
        this.p.execute();
    }

    public void e() {
        this.q.execute();
    }

    public InterfaceC2613b f() {
        return this.w.a();
    }

    public long g() {
        Cursor cursorRawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public b h() {
        return new b(this.x.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", null));
    }

    public c i() {
        return new c(this.x.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    public long j() {
        Cursor cursorRawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public e k() {
        return new e(this.x.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", null));
    }

    public long l() {
        Cursor cursorRawQuery = this.x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void a(long j) {
        this.v.bindLong(1, j);
        this.v.execute();
    }

    public void b(long j) {
        this.u.bindLong(1, j);
        this.u.execute();
    }

    public void c(long j) {
        this.w.a(j);
    }

    public long d(long j) {
        this.a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public d e(long j) {
        this.a[0] = String.valueOf(j);
        return new d(this.x.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.a));
    }

    public long f(long j) {
        this.a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long g(long j) {
        this.a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.x.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public g h(long j) {
        this.a[0] = String.valueOf(j);
        return new g(this.x.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.a));
    }

    public void i(long j) {
        this.w.b(j);
    }

    public long a(long j, long j2) {
        this.r.bindLong(1, j);
        this.r.bindLong(2, j2);
        return this.r.executeUpdateDelete();
    }

    public long b(long j, long j2) {
        this.s.bindLong(1, j);
        this.s.bindLong(2, j2);
        return this.s.executeUpdateDelete();
    }

    public void c(long j, long j2) {
        this.d.bindLong(1, j);
        this.d.bindLong(2, j2);
        this.d.execute();
    }

    public void d(long j, long j2) {
        this.j.bindLong(1, j2);
        this.j.bindLong(2, j);
        this.j.execute();
    }

    public long a(long j, byte[] bArr) {
        h hVar = this.b;
        hVar.a = j;
        hVar.b = bArr;
        Cursor cursorRawQueryWithFactory = this.x.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, null);
        try {
            if (!cursorRawQueryWithFactory.moveToNext()) {
                cursorRawQueryWithFactory.close();
                return 0L;
            }
            long j2 = cursorRawQueryWithFactory.getLong(0);
            cursorRawQueryWithFactory.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public c b(long j, byte[] bArr) {
        h hVar = this.b;
        hVar.a = j;
        hVar.b = bArr;
        return new c(this.x.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    public f a(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        return new f(this.x.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    public Long b(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        Cursor cursorRawQuery = this.x.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return null;
            }
            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            cursorRawQuery.close();
            return lValueOf;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long a(String str, String str2, String str3, int i, long j) {
        this.i.bindString(1, str);
        this.i.bindString(2, str2);
        this.i.bindString(3, str3);
        this.i.bindLong(4, i);
        this.i.bindLong(5, j);
        return this.i.executeInsert();
    }

    public long a(int i, byte[] bArr, boolean z) {
        this.c.bindLong(1, i);
        this.c.bindLong(2, z ? 1L : 0L);
        this.c.bindBlob(3, bArr);
        return this.c.executeInsert();
    }

    public long a(String str, String str2, long j) {
        this.h.bindString(1, str);
        this.h.bindString(2, str2);
        this.h.bindLong(3, j);
        return this.h.executeInsert();
    }

    public void a(byte[] bArr) {
        this.w.a(bArr);
    }

    public long a(String str, long j) {
        this.e.bindString(1, str);
        this.e.bindLong(2, j);
        return this.e.executeInsert();
    }

    public void a(long j, long j2, boolean z, long j3) {
        this.f.bindLong(1, j);
        this.f.bindLong(2, j2);
        SQLiteStatement sQLiteStatement = this.f;
        if (z) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j3);
        }
        this.f.execute();
    }

    public static e1 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                y2.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 10) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
                context.deleteDatabase(str2);
                sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(10);
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
                m1.a(sQLiteDatabaseOpenOrCreateDatabase);
            }
            return new e1(sQLiteDatabaseOpenOrCreateDatabase);
        } catch (Throwable th) {
            y2.b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    public void a(String str, Long l) {
        SQLiteStatement sQLiteStatement;
        if (l == null) {
            this.t.bindString(1, str);
            sQLiteStatement = this.t;
        } else {
            long jLongValue = l.longValue();
            this.g.bindString(1, str);
            this.g.bindLong(2, jLongValue);
            if (this.g.executeInsert() != y) {
                return;
            }
            this.l.bindLong(1, jLongValue);
            this.l.bindString(2, str);
            sQLiteStatement = this.l;
        }
        sQLiteStatement.execute();
    }

    public void a(long j, long j2, long j3) {
        if (j2 != y) {
            this.k.bindLong(1, j2);
        } else {
            this.k.bindNull(1);
        }
        this.k.bindLong(2, j3);
        this.k.bindLong(3, j);
        this.k.execute();
    }
}
