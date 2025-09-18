package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.r8 */
/* loaded from: classes2.dex */
public abstract class AbstractC3566r8 {

    /* renamed from: a */
    private final C3696w8 f24602a;

    /* renamed from: b */
    private final C2650H8 f24603b;

    /* renamed from: f */
    private final ContentValues f24607f = new ContentValues();

    /* renamed from: c */
    private final AtomicLong f24604c = new AtomicLong(m16674d());

    /* renamed from: d */
    private final AtomicLong f24605d = new AtomicLong(m16675a(Long.MAX_VALUE));

    /* renamed from: e */
    private final AtomicLong f24606e = new AtomicLong(mo13848a());

    public AbstractC3566r8(C3696w8 c3696w8, C2650H8 c2650h8) {
        this.f24602a = c3696w8;
        this.f24603b = c2650h8;
    }

    /* renamed from: d */
    private long m16674d() {
        try {
            SQLiteDatabase readableDatabase = this.f24602a.getReadableDatabase();
            if (readableDatabase != null) {
                return C3323i.m16060a(readableDatabase, mo13850e());
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public abstract long mo13848a();

    /* renamed from: a */
    public synchronized void m16677a(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = this.f24602a.getWritableDatabase();
            if (writableDatabase != null) {
                this.f24607f.clear();
                this.f24607f.put("incremental_id", Long.valueOf(this.f24606e.get() + 1));
                this.f24607f.put("timestamp", Long.valueOf(j));
                this.f24607f.put("data", str);
                if (writableDatabase.insert(mo13850e(), null, this.f24607f) != -1) {
                    this.f24604c.incrementAndGet();
                    this.f24606e.incrementAndGet();
                    mo13849b(this.f24606e.get());
                    if (this.f24605d.get() > j) {
                        this.f24605d.set(j);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public long m16679b() {
        return this.f24605d.get();
    }

    /* renamed from: b */
    public abstract void mo13849b(long j);

    /* renamed from: c */
    public long m16681c() {
        return this.f24604c.get();
    }

    /* renamed from: e */
    public abstract String mo13850e();

    /* renamed from: f */
    public C2650H8 m16682f() {
        return this.f24603b;
    }

    /* renamed from: b */
    public synchronized int m16678b(int i) {
        int iDelete = 0;
        synchronized (this) {
            if (i < 1) {
                return 0;
            }
            String str = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", "incremental_id", mo13850e());
            try {
                SQLiteDatabase writableDatabase = this.f24602a.getWritableDatabase();
                if (writableDatabase != null && (iDelete = writableDatabase.delete(mo13850e(), str, new String[]{String.valueOf(i)})) > 0) {
                    this.f24604c.getAndAdd(-iDelete);
                    this.f24605d.set(m16675a(Long.MAX_VALUE));
                }
            } catch (Throwable unused) {
            }
            return iDelete;
        }
    }

    /* renamed from: c */
    public synchronized int m16680c(long j) {
        int iDelete;
        Locale locale = Locale.US;
        iDelete = 0;
        try {
            SQLiteDatabase writableDatabase = this.f24602a.getWritableDatabase();
            if (writableDatabase != null && (iDelete = writableDatabase.delete(mo13850e(), "incremental_id <= ?", new String[]{String.valueOf(j)})) > 0) {
                this.f24604c.getAndAdd(-iDelete);
                this.f24605d.set(m16675a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return iDelete;
    }

    /* renamed from: a */
    public long m16675a(long j) {
        Locale locale = Locale.US;
        String strM26245v = AbstractC7222ym.m26245v("Select min(timestamp) from ", mo13850e());
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f24602a.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(strM26245v, null);
                if (cursorRawQuery.moveToFirst()) {
                    long j2 = cursorRawQuery.getLong(0);
                    if (j2 != 0) {
                        j = j2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        C2968U2.m15239a(cursorRawQuery);
        return j;
    }

    /* renamed from: a */
    public synchronized Map<Long, String> m16676a(int i) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f24602a.getReadableDatabase();
            if (readableDatabase != null) {
                cursorQuery = readableDatabase.query(mo13850e(), new String[]{"incremental_id", "data"}, null, null, null, null, "incremental_id ASC", String.valueOf(i));
                while (cursorQuery.moveToNext()) {
                    this.f24607f.clear();
                    try {
                        C3323i.m16066a(cursorQuery, this.f24607f);
                    } catch (Throwable unused) {
                    }
                    Long asLong = this.f24607f.getAsLong("incremental_id");
                    String asString = this.f24607f.getAsString("data");
                    if (asLong != null && asString != null) {
                        linkedHashMap.put(asLong, asString);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        C2968U2.m15239a(cursorQuery);
        return linkedHashMap;
    }
}
