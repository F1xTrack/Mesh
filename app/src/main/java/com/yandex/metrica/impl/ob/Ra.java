package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import defpackage.AbstractC7209tN0;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class Ra implements InterfaceC3251z8, Closeable {
    private final Map<String, Object> a;
    private final Map<String, Object> b;
    private final String c;
    private final a d;
    private volatile boolean e;
    private final L8 f;

    public class a extends C3166vn {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            HashMap map;
            synchronized (Ra.this.a) {
                Ra.b(Ra.this);
                Ra.this.e = true;
                Ra.this.a.notifyAll();
            }
            while (c()) {
                synchronized (this) {
                    if (Ra.this.b.size() == 0) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    map = new HashMap(Ra.this.b);
                    Ra.this.b.clear();
                }
                if (map.size() > 0) {
                    Ra.a(Ra.this, map);
                    map.clear();
                }
            }
        }
    }

    public Ra(C3176w8 c3176w8, String str) {
        this(str, new N8(c3176w8));
    }

    public static void a(Ra ra, Map map) {
        SQLiteDatabase sQLiteDatabaseA;
        ra.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == ra) {
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
            sQLiteDatabaseA = ra.f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(ra.c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(ra.c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                    U2.a(sQLiteDatabaseA);
                    ra.f.a(sQLiteDatabaseA);
                }
            }
        } catch (Throwable unused2) {
        }
        U2.a(sQLiteDatabaseA);
        ra.f.a(sQLiteDatabaseA);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.yandex.metrica.impl.ob.Ra r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            com.yandex.metrica.impl.ob.L8 r4 = r13.f     // Catch: java.lang.Throwable -> L92
            android.database.sqlite.SQLiteDatabase r4 = r4.a()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L93
            java.lang.String r6 = r13.c     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L93
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L93
        L22:
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L90
            if (r6 == 0) goto L90
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L90
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L90
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L90
            int r8 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L90
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
            r9 = 1
            if (r8 == r9) goto L71
            r9 = 2
            if (r8 == r9) goto L68
            r9 = 3
            if (r8 == r9) goto L5f
            r9 = 4
            if (r8 == r9) goto L88
            r9 = 5
            if (r8 == r9) goto L56
            goto L87
        L56:
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            goto L88
        L5f:
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            goto L88
        L68:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L87 java.lang.Throwable -> L90
            goto L88
        L71:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L90
            if (r8 == 0) goto L7c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L90
            goto L88
        L7c:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L90
            if (r7 == 0) goto L87
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L90
            goto L88
        L87:
            r7 = r3
        L88:
            if (r7 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.a     // Catch: java.lang.Throwable -> L90
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L90
            goto L22
        L90:
            r3 = r5
            goto L93
        L92:
            r4 = r3
        L93:
            com.yandex.metrica.impl.ob.U2.a(r3)
            com.yandex.metrica.impl.ob.L8 r13 = r13.f
            r13.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ra.b(com.yandex.metrica.impl.ob.Ra):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.d.c()) {
            this.d.d();
        }
    }

    public Ra(String str, L8 l8) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.f = l8;
        this.c = str;
        Locale locale = Locale.US;
        a aVar = new a(AbstractC7209tN0.u(ThreadFactoryC3191wn.c(), "YMM-DW-"));
        this.d = aVar;
        aVar.start();
    }

    private Object c(String str) {
        Object obj;
        synchronized (this.a) {
            c();
            obj = this.a.get(str);
        }
        return obj;
    }

    private void c() throws InterruptedException {
        if (this.e) {
            return;
        }
        try {
            this.a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public void b() {
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public String b(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public boolean b(String str, boolean z) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 b(String str) {
        synchronized (this.a) {
            c();
            this.a.remove(str);
        }
        synchronized (this.d) {
            this.b.put(str, this);
            this.d.notifyAll();
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 b(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public synchronized InterfaceC3251z8 b(String str, int i) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public int a(String str, int i) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public long a(String str, long j) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public synchronized InterfaceC3251z8 a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public InterfaceC3251z8 a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.a) {
            c();
            zContainsKey = this.a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3251z8
    public Set<String> a() {
        HashSet hashSet;
        synchronized (this.a) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }

    public void a(String str, Object obj) {
        synchronized (this.a) {
            c();
            this.a.put(str, obj);
        }
        synchronized (this.d) {
            this.b.put(str, obj);
            this.d.notifyAll();
        }
    }
}
