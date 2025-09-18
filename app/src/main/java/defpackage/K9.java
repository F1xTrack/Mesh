package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class K9 implements I9 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final int c;
    public int d;
    public int e;
    public final Object f;

    public K9(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.f = new LinkedHashMap(0, 0.75f, true);
    }

    private final synchronized String g() {
        int i;
        int i2;
        int i3;
        try {
            i = this.d;
            i2 = this.e;
            int i4 = i + i2;
            i3 = i4 != 0 ? (i * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.c + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }

    @Override // defpackage.I9
    public int a() {
        return -1;
    }

    @Override // defpackage.I9
    public int b() {
        return this.b;
    }

    @Override // defpackage.I9
    public int c() {
        C4103hA0 c4103hA0 = (C4103hA0) this.f;
        int i = this.c;
        if (i == 8) {
            return c4103hA0.u();
        }
        if (i == 16) {
            return c4103hA0.A();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iU = c4103hA0.u();
        this.e = iU;
        return (iU & 240) >> 4;
    }

    public Object d(Object obj) {
        return null;
    }

    public Object e(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = ((LinkedHashMap) this.f).get(obj);
                if (obj2 != null) {
                    this.d++;
                    return obj2;
                }
                this.e++;
                Object objD = d(obj);
                if (objD == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        objPut = ((LinkedHashMap) this.f).put(obj, objD);
                        if (objPut != null) {
                            ((LinkedHashMap) this.f).put(obj, objPut);
                        } else {
                            this.b++;
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    return objPut;
                }
                h(this.c);
                return objD;
            } finally {
            }
        }
    }

    public Object f(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.b++;
                objPut = ((LinkedHashMap) this.f).put(obj, obj2);
                if (objPut != null) {
                    this.b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h(this.c);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.b     // Catch: java.lang.Throwable -> L14
            if (r0 < 0) goto L4f
            java.lang.Object r0 = r2.f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            int r0 = r2.b     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L4f
            goto L16
        L14:
            r3 = move-exception
            goto L6e
        L16:
            int r0 = r2.b     // Catch: java.lang.Throwable -> L14
            if (r0 <= r3) goto L4d
            java.lang.Object r0 = r2.f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L25
            goto L4d
        L25:
            java.lang.Object r0 = r2.f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L14
            r0.getValue()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r2.f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            r0.remove(r1)     // Catch: java.lang.Throwable -> L14
            int r0 = r2.b     // Catch: java.lang.Throwable -> L14
            int r0 = r0 + (-1)
            r2.b = r0     // Catch: java.lang.Throwable -> L14
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K9.h(int):void");
    }

    public synchronized String toString() {
        switch (this.a) {
            case 1:
                return g();
            default:
                return super.toString();
        }
    }

    public K9(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bArr;
    }

    public K9(E9 e9) {
        C4103hA0 c4103hA0 = e9.c;
        this.f = c4103hA0;
        c4103hA0.G(12);
        this.c = c4103hA0.y() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.b = c4103hA0.y();
    }
}
