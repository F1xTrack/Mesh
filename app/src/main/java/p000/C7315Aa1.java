package p000;

/* renamed from: Aa1 */
/* loaded from: classes.dex */
public final class C7315Aa1 {

    /* renamed from: a */
    public Object f256a;

    /* renamed from: b */
    public Object f257b;

    /* renamed from: c */
    public int f258c;

    /* renamed from: d */
    public long f259d;

    /* renamed from: e */
    public long f260e;

    /* renamed from: f */
    public boolean f261f;

    /* renamed from: g */
    public C3966e3 f262g = C3966e3.f26513c;

    static {
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
    }

    /* renamed from: a */
    public final long m236a(int i, int i2) {
        C3904d3 c3904d3M17827a = this.f262g.m17827a(i);
        if (c3904d3M17827a.f25777a != -1) {
            return c3904d3M17827a.f25782f[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public final int m237b(long j) {
        int i;
        C3904d3 c3904d3M17827a;
        int i2;
        C3966e3 c3966e3 = this.f262g;
        long j2 = this.f259d;
        c3966e3.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            i = c3966e3.f26515a;
            if (i3 >= i) {
                break;
            }
            c3966e3.m17827a(i3).getClass();
            c3966e3.m17827a(i3).getClass();
            if (0 > j && ((i2 = (c3904d3M17827a = c3966e3.m17827a(i3)).f25777a) == -1 || c3904d3M17827a.m17481a(-1) < i2)) {
                break;
            }
            i3++;
        }
        if (i3 < i) {
            return i3;
        }
        return -1;
    }

    /* renamed from: c */
    public final int m238c(long j) {
        C3966e3 c3966e3 = this.f262g;
        int i = c3966e3.f26515a - 1;
        c3966e3.m17828b(i);
        while (i >= 0 && j != Long.MIN_VALUE) {
            c3966e3.m17827a(i).getClass();
            if (j >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            C3904d3 c3904d3M17827a = c3966e3.m17827a(i);
            int i2 = c3904d3M17827a.f25777a;
            if (i2 == -1) {
                return i;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = c3904d3M17827a.f25781e[i3];
                if (i4 == 0 || i4 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final long m239d(int i) {
        this.f262g.m17827a(i).getClass();
        return 0L;
    }

    /* renamed from: e */
    public final int m240e(int i) {
        return this.f262g.m17827a(i).m17481a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C7315Aa1.class.equals(obj.getClass())) {
            return false;
        }
        C7315Aa1 c7315Aa1 = (C7315Aa1) obj;
        return AbstractC7485Dh1.m1812a(this.f256a, c7315Aa1.f256a) && AbstractC7485Dh1.m1812a(this.f257b, c7315Aa1.f257b) && this.f258c == c7315Aa1.f258c && this.f259d == c7315Aa1.f259d && this.f260e == c7315Aa1.f260e && this.f261f == c7315Aa1.f261f && AbstractC7485Dh1.m1812a(this.f262g, c7315Aa1.f262g);
    }

    /* renamed from: f */
    public final boolean m241f(int i) {
        C3966e3 c3966e3 = this.f262g;
        if (i != c3966e3.f26515a - 1) {
            return false;
        }
        c3966e3.m17828b(i);
        return false;
    }

    /* renamed from: g */
    public final boolean m242g(int i) {
        this.f262g.m17827a(i).getClass();
        return false;
    }

    /* renamed from: h */
    public final void m243h(Object obj, Object obj2, int i, long j, long j2, C3966e3 c3966e3, boolean z) {
        this.f256a = obj;
        this.f257b = obj2;
        this.f258c = i;
        this.f259d = j;
        this.f260e = j2;
        this.f262g = c3966e3;
        this.f261f = z;
    }

    public final int hashCode() {
        Object obj = this.f256a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f257b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f258c) * 31;
        long j = this.f259d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f260e;
        return this.f262g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f261f ? 1 : 0)) * 31);
    }
}
