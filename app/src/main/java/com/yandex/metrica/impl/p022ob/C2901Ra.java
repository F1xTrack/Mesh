package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Ra */
/* loaded from: classes2.dex */
class C2901Ra implements InterfaceC3774z8, Closeable {

    /* renamed from: a */
    private final Map<String, Object> f22115a;

    /* renamed from: b */
    private final Map<String, Object> f22116b;

    /* renamed from: c */
    private final String f22117c;

    /* renamed from: d */
    private final a f22118d;

    /* renamed from: e */
    private volatile boolean f22119e;

    /* renamed from: f */
    private final InterfaceC2750L8 f22120f;

    /* renamed from: com.yandex.metrica.impl.ob.Ra$a */
    public class a extends C3685vn {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            HashMap map;
            synchronized (C2901Ra.this.f22115a) {
                C2901Ra.m14978b(C2901Ra.this);
                C2901Ra.this.f22119e = true;
                C2901Ra.this.f22115a.notifyAll();
            }
            while (mo16707c()) {
                synchronized (this) {
                    if (C2901Ra.this.f22116b.size() == 0) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    map = new HashMap(C2901Ra.this.f22116b);
                    C2901Ra.this.f22116b.clear();
                }
                if (map.size() > 0) {
                    C2901Ra.m14976a(C2901Ra.this, map);
                    map.clear();
                }
            }
        }
    }

    public C2901Ra(C3696w8 c3696w8, String str) {
        this(str, new C2800N8(c3696w8));
    }

    /* renamed from: a */
    public static void m14976a(C2901Ra c2901Ra, Map map) {
        SQLiteDatabase sQLiteDatabaseMo14512a;
        c2901Ra.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c2901Ra) {
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
            sQLiteDatabaseMo14512a = c2901Ra.f22120f.mo14512a();
            if (sQLiteDatabaseMo14512a != null) {
                try {
                    sQLiteDatabaseMo14512a.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseMo14512a.delete(c2901Ra.f22117c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseMo14512a.insertWithOnConflict(c2901Ra.f22117c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseMo14512a.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo14512a;
                    sQLiteDatabaseMo14512a = sQLiteDatabase;
                    C2968U2.m15240a(sQLiteDatabaseMo14512a);
                    c2901Ra.f22120f.mo14513a(sQLiteDatabaseMo14512a);
                }
            }
        } catch (Throwable unused2) {
        }
        C2968U2.m15240a(sQLiteDatabaseMo14512a);
        c2901Ra.f22120f.mo14513a(sQLiteDatabaseMo14512a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0022 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m14978b(com.yandex.metrica.impl.p022ob.C2901Ra r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            com.yandex.metrica.impl.ob.L8 r4 = r13.f22120f     // Catch: java.lang.Throwable -> L92
            android.database.sqlite.SQLiteDatabase r4 = r4.mo14512a()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L93
            java.lang.String r6 = r13.f22117c     // Catch: java.lang.Throwable -> L93
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
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.f22115a     // Catch: java.lang.Throwable -> L90
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L90
            goto L22
        L90:
            r3 = r5
            goto L93
        L92:
            r4 = r3
        L93:
            com.yandex.metrica.impl.p022ob.C2968U2.m15239a(r3)
            com.yandex.metrica.impl.ob.L8 r13 = r13.f22120f
            r13.mo14513a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2901Ra.m14978b(com.yandex.metrica.impl.ob.Ra):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f22118d.mo16707c()) {
            this.f22118d.m17100d();
        }
    }

    public C2901Ra(String str, InterfaceC2750L8 interfaceC2750L8) {
        this.f22115a = new HashMap();
        this.f22116b = new HashMap();
        this.f22120f = interfaceC2750L8;
        this.f22117c = str;
        Locale locale = Locale.US;
        a aVar = new a(AbstractC11153tN0.m24909u(ThreadFactoryC3711wn.m17153c(), "YMM-DW-"));
        this.f22118d = aVar;
        aVar.start();
    }

    /* renamed from: c */
    private Object m14979c(String str) {
        Object obj;
        synchronized (this.f22115a) {
            m14981c();
            obj = this.f22115a.get(str);
        }
        return obj;
    }

    /* renamed from: c */
    private void m14981c() throws InterruptedException {
        if (this.f22119e) {
            return;
        }
        try {
            this.f22115a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: b */
    public void mo14993b() {
        synchronized (this.f22118d) {
            this.f22118d.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: b */
    public String mo14992b(String str, String str2) {
        Object objM14979c = m14979c(str);
        return objM14979c instanceof String ? (String) objM14979c : str2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: b */
    public boolean mo14994b(String str, boolean z) {
        Object objM14979c = m14979c(str);
        return objM14979c instanceof Boolean ? ((Boolean) objM14979c).booleanValue() : z;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: b */
    public InterfaceC3774z8 mo14989b(String str) {
        synchronized (this.f22115a) {
            m14981c();
            this.f22115a.remove(str);
        }
        synchronized (this.f22118d) {
            this.f22116b.put(str, this);
            this.f22118d.notifyAll();
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: b */
    public InterfaceC3774z8 mo14991b(String str, long j) {
        m14987a(str, Long.valueOf(j));
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: b */
    public synchronized InterfaceC3774z8 mo14990b(String str, int i) {
        m14987a(str, Integer.valueOf(i));
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: a */
    public int mo14982a(String str, int i) {
        Object objM14979c = m14979c(str);
        return objM14979c instanceof Integer ? ((Integer) objM14979c).intValue() : i;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: a */
    public long mo14983a(String str, long j) {
        Object objM14979c = m14979c(str);
        return objM14979c instanceof Long ? ((Long) objM14979c).longValue() : j;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: a */
    public synchronized InterfaceC3774z8 mo14984a(String str, String str2) {
        m14987a(str, (Object) str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: a */
    public InterfaceC3774z8 mo14985a(String str, boolean z) {
        m14987a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: a */
    public boolean mo14988a(String str) {
        boolean zContainsKey;
        synchronized (this.f22115a) {
            m14981c();
            zContainsKey = this.f22115a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3774z8
    /* renamed from: a */
    public Set<String> mo14986a() {
        HashSet hashSet;
        synchronized (this.f22115a) {
            hashSet = new HashSet(this.f22115a.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    public void m14987a(String str, Object obj) {
        synchronized (this.f22115a) {
            m14981c();
            this.f22115a.put(str, obj);
        }
        synchronized (this.f22118d) {
            this.f22116b.put(str, obj);
            this.f22118d.notifyAll();
        }
    }
}
