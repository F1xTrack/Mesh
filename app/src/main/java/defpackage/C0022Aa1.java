package defpackage;

/* renamed from: Aa1 */
/* loaded from: classes.dex */
public final class C0022Aa1 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public C3507e3 g = C3507e3.c;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        C3317d3 c3317d3A = this.g.a(i);
        if (c3317d3A.a != -1) {
            return c3317d3A.f[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i;
        C3317d3 c3317d3A;
        int i2;
        C3507e3 c3507e3 = this.g;
        long j2 = this.d;
        c3507e3.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            i = c3507e3.a;
            if (i3 >= i) {
                break;
            }
            c3507e3.a(i3).getClass();
            c3507e3.a(i3).getClass();
            if (0 > j && ((i2 = (c3317d3A = c3507e3.a(i3)).a) == -1 || c3317d3A.a(-1) < i2)) {
                break;
            }
            i3++;
        }
        if (i3 < i) {
            return i3;
        }
        return -1;
    }

    public final int c(long j) {
        C3507e3 c3507e3 = this.g;
        int i = c3507e3.a - 1;
        c3507e3.b(i);
        while (i >= 0 && j != Long.MIN_VALUE) {
            c3507e3.a(i).getClass();
            if (j >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            C3317d3 c3317d3A = c3507e3.a(i);
            int i2 = c3317d3A.a;
            if (i2 == -1) {
                return i;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = c3317d3A.e[i3];
                if (i4 == 0 || i4 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0022Aa1.class.equals(obj.getClass())) {
            return false;
        }
        C0022Aa1 c0022Aa1 = (C0022Aa1) obj;
        return AbstractC0277Dh1.a(this.a, c0022Aa1.a) && AbstractC0277Dh1.a(this.b, c0022Aa1.b) && this.c == c0022Aa1.c && this.d == c0022Aa1.d && this.e == c0022Aa1.e && this.f == c0022Aa1.f && AbstractC0277Dh1.a(this.g, c0022Aa1.g);
    }

    public final boolean f(int i) {
        C3507e3 c3507e3 = this.g;
        if (i != c3507e3.a - 1) {
            return false;
        }
        c3507e3.b(i);
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, C3507e3 c3507e3, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = c3507e3;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
