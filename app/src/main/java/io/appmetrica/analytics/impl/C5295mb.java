package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.mb */
/* loaded from: classes2.dex */
public final class C5295mb implements InterfaceC4467Ea, Closeable {

    /* renamed from: a */
    public final HashMap f32192a = new HashMap();

    /* renamed from: b */
    public final HashMap f32193b = new HashMap();

    /* renamed from: c */
    public final String f32194c = "preferences";

    /* renamed from: d */
    public final C5270lb f32195d;

    /* renamed from: e */
    public volatile boolean f32196e;

    /* renamed from: f */
    public final InterfaceC5590y6 f32197f;

    public C5295mb(InterfaceC5590y6 interfaceC5590y6) {
        this.f32197f = interfaceC5590y6;
        Locale locale = Locale.US;
        C5270lb c5270lb = new C5270lb(this, AbstractC11153tN0.m24909u(ThreadFactoryC5047cd.m20234a(), "IAA-DW-"));
        this.f32195d = c5270lb;
        c5270lb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m20706a(io.appmetrica.analytics.impl.C5295mb r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.y6 r4 = r13.f32197f     // Catch: java.lang.Throwable -> L85
            android.database.sqlite.SQLiteDatabase r4 = r4.mo19759a()     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L86
            java.lang.String r6 = r13.f32194c     // Catch: java.lang.Throwable -> L86
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L86
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L86
        L22:
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L83
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L83
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L83
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L22
            r9 = 1
            if (r8 == r9) goto L66
            r9 = 2
            if (r8 == r9) goto L61
            r9 = 3
            if (r8 == r9) goto L5c
            r9 = 4
            if (r8 == r9) goto L7b
            r9 = 5
            if (r8 == r9) goto L57
        L55:
            r7 = r3
            goto L7b
        L57:
            java.lang.Float r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L5c:
            java.lang.Long r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L61:
            java.lang.Integer r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L66:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r8 == 0) goto L71
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L83
            goto L7b
        L71:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L55
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L83
        L7b:
            if (r7 == 0) goto L22
            java.util.HashMap r8 = r13.f32192a     // Catch: java.lang.Throwable -> L83
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            goto L22
        L83:
            r3 = r5
            goto L86
        L85:
            r4 = r3
        L86:
            io.appmetrica.analytics.impl.AbstractC5182hn.m20509a(r3)
            io.appmetrica.analytics.impl.y6 r13 = r13.f32197f
            r13.mo19760a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5295mb.m20706a(io.appmetrica.analytics.impl.mb):void");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: b */
    public final void mo19349b() {
        synchronized (this.f32195d) {
            this.f32195d.notifyAll();
        }
    }

    /* renamed from: c */
    public final void m20710c() throws InterruptedException {
        if (this.f32196e) {
            return;
        }
        try {
            this.f32192a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f32195d.isRunning()) {
            this.f32195d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    public final boolean getBoolean(String str, boolean z) {
        Object objM20709b = m20709b(str);
        return objM20709b instanceof Boolean ? ((Boolean) objM20709b).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    public final int getInt(String str, int i) {
        Object objM20709b = m20709b(str);
        return objM20709b instanceof Integer ? ((Integer) objM20709b).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    public final long getLong(String str, long j) {
        Object objM20709b = m20709b(str);
        return objM20709b instanceof Long ? ((Long) objM20709b).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    public final String getString(String str, String str2) {
        Object objM20709b = m20709b(str);
        return objM20709b instanceof String ? (String) objM20709b : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    public final InterfaceC4467Ea remove(String str) {
        synchronized (this.f32192a) {
            m20710c();
            this.f32192a.remove(str);
        }
        synchronized (this.f32195d) {
            this.f32193b.put(str, this);
            this.f32195d.notifyAll();
        }
        return this;
    }

    /* renamed from: b */
    public final Object m20709b(String str) {
        Object obj;
        synchronized (this.f32192a) {
            m20710c();
            obj = this.f32192a.get(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m20707a(C5295mb c5295mb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseMo19759a;
        c5295mb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c5295mb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseMo19759a = c5295mb.f32197f.mo19759a();
            if (sQLiteDatabaseMo19759a != null) {
                try {
                    sQLiteDatabaseMo19759a.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseMo19759a.delete(c5295mb.f32194c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseMo19759a.insertWithOnConflict(c5295mb.f32194c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseMo19759a.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo19759a;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseMo19759a = sQLiteDatabase;
                    c5295mb.f32197f.mo19760a(sQLiteDatabaseMo19759a);
                }
            }
            if (sQLiteDatabaseMo19759a != null) {
                try {
                    sQLiteDatabaseMo19759a.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c5295mb.f32197f.mo19760a(sQLiteDatabaseMo19759a);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: a */
    public final synchronized InterfaceC4467Ea mo19345a(String str, String str2) {
        m20708a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: a */
    public final InterfaceC4467Ea mo19344a(String str, long j) {
        m20708a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: a */
    public final synchronized InterfaceC4467Ea mo19342a(int i, String str) {
        m20708a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: a */
    public final InterfaceC4467Ea mo19346a(String str, boolean z) {
        m20708a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: a */
    public final InterfaceC4467Ea mo19343a(String str, float f) {
        m20708a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: a */
    public final boolean mo19348a(String str) {
        boolean zContainsKey;
        synchronized (this.f32192a) {
            m20710c();
            zContainsKey = this.f32192a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4467Ea
    /* renamed from: a */
    public final Set mo19347a() {
        HashSet hashSet;
        synchronized (this.f32192a) {
            hashSet = new HashSet(this.f32192a.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void m20708a(String str, Object obj) {
        synchronized (this.f32192a) {
            m20710c();
            this.f32192a.put(str, obj);
        }
        synchronized (this.f32195d) {
            this.f32193b.put(str, obj);
            this.f32195d.notifyAll();
        }
    }
}
