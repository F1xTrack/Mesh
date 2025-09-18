package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: com.my.tracker.obfuscated.e1 */
/* loaded from: classes2.dex */
public final class C2310e1 {

    /* renamed from: y */
    static long f19890y = -1;

    /* renamed from: a */
    private final String[] f19891a = new String[1];

    /* renamed from: b */
    private final h f19892b = new h();

    /* renamed from: c */
    private final SQLiteStatement f19893c;

    /* renamed from: d */
    private final SQLiteStatement f19894d;

    /* renamed from: e */
    private final SQLiteStatement f19895e;

    /* renamed from: f */
    private final SQLiteStatement f19896f;

    /* renamed from: g */
    private final SQLiteStatement f19897g;

    /* renamed from: h */
    private final SQLiteStatement f19898h;

    /* renamed from: i */
    private final SQLiteStatement f19899i;

    /* renamed from: j */
    private final SQLiteStatement f19900j;

    /* renamed from: k */
    private final SQLiteStatement f19901k;

    /* renamed from: l */
    private final SQLiteStatement f19902l;

    /* renamed from: m */
    private final SQLiteStatement f19903m;

    /* renamed from: n */
    private final SQLiteStatement f19904n;

    /* renamed from: o */
    private final SQLiteStatement f19905o;

    /* renamed from: p */
    private final SQLiteStatement f19906p;

    /* renamed from: q */
    private final SQLiteStatement f19907q;

    /* renamed from: r */
    private final SQLiteStatement f19908r;

    /* renamed from: s */
    private final SQLiteStatement f19909s;

    /* renamed from: t */
    private final SQLiteStatement f19910t;

    /* renamed from: u */
    private final SQLiteStatement f19911u;

    /* renamed from: v */
    private final SQLiteStatement f19912v;

    /* renamed from: w */
    private final C2342m1 f19913w;

    /* renamed from: x */
    protected final SQLiteDatabase f19914x;

    /* renamed from: com.my.tracker.obfuscated.e1$a */
    public static abstract class a implements Closeable {

        /* renamed from: a */
        final Cursor f19915a;

        public a(Cursor cursor) {
            this.f19915a = cursor;
        }

        /* renamed from: b */
        public final boolean m12930b() {
            return this.f19915a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f19915a.close();
            } catch (Throwable th) {
                AbstractC2391y2.m13573b("AbstractReader error: error while closing cursor", th);
            }
        }

        public void finalize() throws Throwable {
            super.finalize();
            close();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$b */
    public static final class b extends a {
        public b(Cursor cursor) {
            super(cursor);
        }

        /* renamed from: a */
        public long m12931a() {
            return this.f19915a.getLong(0);
        }

        /* renamed from: e */
        public long m12932e() {
            return this.f19915a.getLong(5);
        }

        /* renamed from: m */
        public String m12933m() {
            return this.f19915a.getString(1);
        }

        /* renamed from: n */
        public String m12934n() {
            return this.f19915a.getString(2);
        }

        /* renamed from: o */
        public String m12935o() {
            return this.f19915a.getString(3);
        }

        /* renamed from: p */
        public int m12936p() {
            return this.f19915a.getInt(4);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$c */
    public static final class c extends a {
        public c(Cursor cursor) {
            super(cursor);
        }

        /* renamed from: a */
        public long m12937a() {
            return this.f19915a.getLong(0);
        }

        /* renamed from: c */
        public long m12938c() {
            return this.f19915a.getLong(4);
        }

        /* renamed from: g */
        public long m12939g() {
            return this.f19915a.getLong(1);
        }

        /* renamed from: l */
        public byte[] m12940l() {
            return this.f19915a.getBlob(3);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$d */
    public static final class d extends a {
        public d(Cursor cursor) {
            super(cursor);
        }

        /* renamed from: e */
        public long m12941e() {
            return this.f19915a.getLong(1);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$e */
    public static final class e extends a {
        public e(Cursor cursor) {
            super(cursor);
        }

        /* renamed from: a */
        public long m12942a() {
            return this.f19915a.getLong(0);
        }

        /* renamed from: e */
        public long m12943e() {
            return this.f19915a.getLong(3);
        }

        /* renamed from: m */
        public String m12944m() {
            return this.f19915a.getString(1);
        }

        /* renamed from: n */
        public String m12945n() {
            return this.f19915a.getString(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$f */
    public static final class f extends a {
        public f(Cursor cursor) {
            super(cursor);
        }

        /* renamed from: a */
        public long m12946a() {
            return this.f19915a.getLong(0);
        }

        /* renamed from: c */
        public long m12947c() {
            return this.f19915a.getLong(3);
        }

        /* renamed from: k */
        public String m12948k() {
            return this.f19915a.getString(1);
        }

        /* renamed from: m */
        public long m12949m() {
            return this.f19915a.isNull(2) ? C2310e1.f19890y : this.f19915a.getLong(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$g */
    public static final class g extends a {
        public g(Cursor cursor) {
            super(cursor);
        }

        /* renamed from: m */
        public long m12950m() {
            return this.f19915a.getLong(2);
        }

        /* renamed from: n */
        public long m12951n() {
            return this.f19915a.getLong(1);
        }

        /* renamed from: o */
        public boolean m12952o() {
            return this.f19915a.isNull(2);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.e1$h */
    public static final class h implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        long f19916a;

        /* renamed from: b */
        byte[] f19917b;

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f19916a);
            sQLiteQuery.bindBlob(2, this.f19917b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private C2310e1(SQLiteDatabase sQLiteDatabase) {
        this.f19914x = sQLiteDatabase;
        this.f19893c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.f19894d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f19895e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f19896f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.f19897g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.f19898h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.f19899i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.f19900j = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.f19901k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.f19902l = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.f19903m = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.f19904n = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.f19908r = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.f19905o = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.f19906p = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.f19909s = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.f19907q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.f19910t = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.f19911u = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.f19912v = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
        this.f19913w = new C2342m1(sQLiteDatabase);
    }

    /* renamed from: a */
    public void m12900a() {
        this.f19903m.execute();
    }

    /* renamed from: b */
    public void m12909b() {
        this.f19904n.execute();
    }

    /* renamed from: c */
    public void m12911c() {
        this.f19905o.execute();
    }

    /* renamed from: d */
    public void m12915d() {
        this.f19906p.execute();
    }

    /* renamed from: e */
    public void m12918e() {
        this.f19907q.execute();
    }

    /* renamed from: f */
    public InterfaceC2294b m12920f() {
        return this.f19913w.m13301a();
    }

    /* renamed from: g */
    public long m12921g() {
        Cursor cursorRawQuery = this.f19914x.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", null);
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

    /* renamed from: h */
    public b m12923h() {
        return new b(this.f19914x.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", null));
    }

    /* renamed from: i */
    public c m12925i() {
        return new c(this.f19914x.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    /* renamed from: j */
    public long m12927j() {
        Cursor cursorRawQuery = this.f19914x.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", null);
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

    /* renamed from: k */
    public e m12928k() {
        return new e(this.f19914x.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", null));
    }

    /* renamed from: l */
    public long m12929l() {
        Cursor cursorRawQuery = this.f19914x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
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

    /* renamed from: a */
    public void m12901a(long j) {
        this.f19912v.bindLong(1, j);
        this.f19912v.execute();
    }

    /* renamed from: b */
    public void m12910b(long j) {
        this.f19911u.bindLong(1, j);
        this.f19911u.execute();
    }

    /* renamed from: c */
    public void m12912c(long j) {
        this.f19913w.m13302a(j);
    }

    /* renamed from: d */
    public long m12914d(long j) {
        this.f19891a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.f19914x.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f19891a);
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

    /* renamed from: e */
    public d m12917e(long j) {
        this.f19891a[0] = String.valueOf(j);
        return new d(this.f19914x.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f19891a));
    }

    /* renamed from: f */
    public long m12919f(long j) {
        this.f19891a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.f19914x.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f19891a);
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

    /* renamed from: g */
    public long m12922g(long j) {
        this.f19891a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.f19914x.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f19891a);
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

    /* renamed from: h */
    public g m12924h(long j) {
        this.f19891a[0] = String.valueOf(j);
        return new g(this.f19914x.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f19891a));
    }

    /* renamed from: i */
    public void m12926i(long j) {
        this.f19913w.m13304b(j);
    }

    /* renamed from: a */
    public long m12894a(long j, long j2) {
        this.f19908r.bindLong(1, j);
        this.f19908r.bindLong(2, j2);
        return this.f19908r.executeUpdateDelete();
    }

    /* renamed from: b */
    public long m12906b(long j, long j2) {
        this.f19909s.bindLong(1, j);
        this.f19909s.bindLong(2, j2);
        return this.f19909s.executeUpdateDelete();
    }

    /* renamed from: c */
    public void m12913c(long j, long j2) {
        this.f19894d.bindLong(1, j);
        this.f19894d.bindLong(2, j2);
        this.f19894d.execute();
    }

    /* renamed from: d */
    public void m12916d(long j, long j2) {
        this.f19900j.bindLong(1, j2);
        this.f19900j.bindLong(2, j);
        this.f19900j.execute();
    }

    /* renamed from: a */
    public long m12895a(long j, byte[] bArr) {
        h hVar = this.f19892b;
        hVar.f19916a = j;
        hVar.f19917b = bArr;
        Cursor cursorRawQueryWithFactory = this.f19914x.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, null);
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

    /* renamed from: b */
    public c m12907b(long j, byte[] bArr) {
        h hVar = this.f19892b;
        hVar.f19916a = j;
        hVar.f19917b = bArr;
        return new c(this.f19914x.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    /* renamed from: a */
    public f m12899a(String str) {
        String[] strArr = this.f19891a;
        strArr[0] = str;
        return new f(this.f19914x.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    /* renamed from: b */
    public Long m12908b(String str) {
        String[] strArr = this.f19891a;
        strArr[0] = str;
        Cursor cursorRawQuery = this.f19914x.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
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

    /* renamed from: a */
    public long m12898a(String str, String str2, String str3, int i, long j) {
        this.f19899i.bindString(1, str);
        this.f19899i.bindString(2, str2);
        this.f19899i.bindString(3, str3);
        this.f19899i.bindLong(4, i);
        this.f19899i.bindLong(5, j);
        return this.f19899i.executeInsert();
    }

    /* renamed from: a */
    public long m12893a(int i, byte[] bArr, boolean z) {
        this.f19893c.bindLong(1, i);
        this.f19893c.bindLong(2, z ? 1L : 0L);
        this.f19893c.bindBlob(3, bArr);
        return this.f19893c.executeInsert();
    }

    /* renamed from: a */
    public long m12897a(String str, String str2, long j) {
        this.f19898h.bindString(1, str);
        this.f19898h.bindString(2, str2);
        this.f19898h.bindLong(3, j);
        return this.f19898h.executeInsert();
    }

    /* renamed from: a */
    public void m12905a(byte[] bArr) {
        this.f19913w.m13303a(bArr);
    }

    /* renamed from: a */
    public long m12896a(String str, long j) {
        this.f19895e.bindString(1, str);
        this.f19895e.bindLong(2, j);
        return this.f19895e.executeInsert();
    }

    /* renamed from: a */
    public void m12903a(long j, long j2, boolean z, long j3) {
        this.f19896f.bindLong(1, j);
        this.f19896f.bindLong(2, j2);
        SQLiteStatement sQLiteStatement = this.f19896f;
        if (z) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j3);
        }
        this.f19896f.execute();
    }

    /* renamed from: a */
    public static C2310e1 m12892a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                AbstractC2391y2.m13572b("MyTrackerDatabase error: can't open database");
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
                C2342m1.m13300a(sQLiteDatabaseOpenOrCreateDatabase);
            }
            return new C2310e1(sQLiteDatabaseOpenOrCreateDatabase);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    /* renamed from: a */
    public void m12904a(String str, Long l) {
        SQLiteStatement sQLiteStatement;
        if (l == null) {
            this.f19910t.bindString(1, str);
            sQLiteStatement = this.f19910t;
        } else {
            long jLongValue = l.longValue();
            this.f19897g.bindString(1, str);
            this.f19897g.bindLong(2, jLongValue);
            if (this.f19897g.executeInsert() != f19890y) {
                return;
            }
            this.f19902l.bindLong(1, jLongValue);
            this.f19902l.bindString(2, str);
            sQLiteStatement = this.f19902l;
        }
        sQLiteStatement.execute();
    }

    /* renamed from: a */
    public void m12902a(long j, long j2, long j3) {
        if (j2 != f19890y) {
            this.f19901k.bindLong(1, j2);
        } else {
            this.f19901k.bindNull(1);
        }
        this.f19901k.bindLong(2, j3);
        this.f19901k.bindLong(3, j);
        this.f19901k.execute();
    }
}
