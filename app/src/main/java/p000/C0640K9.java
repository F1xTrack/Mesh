package p000;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.KotlinVersion;

/* renamed from: K9 */
/* loaded from: classes.dex */
public class C0640K9 implements InterfaceC0514I9 {

    /* renamed from: a */
    public final /* synthetic */ int f5919a = 1;

    /* renamed from: b */
    public int f5920b;

    /* renamed from: c */
    public final int f5921c;

    /* renamed from: d */
    public int f5922d;

    /* renamed from: e */
    public int f5923e;

    /* renamed from: f */
    public final Object f5924f;

    public C0640K9(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5921c = i;
        this.f5924f = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: g */
    private final synchronized String m4570g() {
        int i;
        int i2;
        int i3;
        try {
            i = this.f5922d;
            i2 = this.f5923e;
            int i4 = i + i2;
            i3 = i4 != 0 ? (i * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f5921c + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }

    @Override // p000.InterfaceC0514I9
    /* renamed from: a */
    public int mo3762a() {
        return -1;
    }

    @Override // p000.InterfaceC0514I9
    /* renamed from: b */
    public int mo3763b() {
        return this.f5920b;
    }

    @Override // p000.InterfaceC0514I9
    /* renamed from: c */
    public int mo3764c() {
        C9591hA0 c9591hA0 = (C9591hA0) this.f5924f;
        int i = this.f5921c;
        if (i == 8) {
            return c9591hA0.m18763u();
        }
        if (i == 16) {
            return c9591hA0.m18735A();
        }
        int i2 = this.f5922d;
        this.f5922d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f5923e & 15;
        }
        int iM18763u = c9591hA0.m18763u();
        this.f5923e = iM18763u;
        return (iM18763u & 240) >> 4;
    }

    /* renamed from: d */
    public Object mo4571d(Object obj) {
        return null;
    }

    /* renamed from: e */
    public Object m4572e(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = ((LinkedHashMap) this.f5924f).get(obj);
                if (obj2 != null) {
                    this.f5922d++;
                    return obj2;
                }
                this.f5923e++;
                Object objMo4571d = mo4571d(obj);
                if (objMo4571d == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        objPut = ((LinkedHashMap) this.f5924f).put(obj, objMo4571d);
                        if (objPut != null) {
                            ((LinkedHashMap) this.f5924f).put(obj, objPut);
                        } else {
                            this.f5920b++;
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    return objPut;
                }
                m4574h(this.f5921c);
                return objMo4571d;
            } finally {
            }
        }
    }

    /* renamed from: f */
    public Object m4573f(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f5920b++;
                objPut = ((LinkedHashMap) this.f5924f).put(obj, obj2);
                if (objPut != null) {
                    this.f5920b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m4574h(this.f5921c);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4574h(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f5920b     // Catch: java.lang.Throwable -> L14
            if (r0 < 0) goto L4f
            java.lang.Object r0 = r2.f5924f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            int r0 = r2.f5920b     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L4f
            goto L16
        L14:
            r3 = move-exception
            goto L6e
        L16:
            int r0 = r2.f5920b     // Catch: java.lang.Throwable -> L14
            if (r0 <= r3) goto L4d
            java.lang.Object r0 = r2.f5924f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L25
            goto L4d
        L25:
            java.lang.Object r0 = r2.f5924f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L14
            r0.getValue()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r2.f5924f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            r0.remove(r1)     // Catch: java.lang.Throwable -> L14
            int r0 = r2.f5920b     // Catch: java.lang.Throwable -> L14
            int r0 = r0 + (-1)
            r2.f5920b = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            goto L0
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L4f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L14
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L14
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L6e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0640K9.m4574h(int):void");
    }

    public synchronized String toString() {
        switch (this.f5919a) {
            case 1:
                return m4570g();
            default:
                return super.toString();
        }
    }

    public C0640K9(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f5920b = i2;
        this.f5921c = i3;
        this.f5922d = i4;
        this.f5923e = i5;
        this.f5924f = bArr;
    }

    public C0640K9(C0262E9 c0262e9) {
        C9591hA0 c9591hA0 = c0262e9.f2511c;
        this.f5924f = c9591hA0;
        c9591hA0.m18741G(12);
        this.f5921c = c9591hA0.m18767y() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.f5920b = c9591hA0.m18767y();
    }
}
