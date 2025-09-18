package defpackage;

/* renamed from: Zb1 */
/* loaded from: classes.dex */
public class C1974Zb1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final C3769fQ0 h;
    public final C3769fQ0 i;
    public final int j;
    public final int k;
    public final C3769fQ0 l;
    public final C1818Xb1 m;
    public final C3769fQ0 n;
    public final int o;
    public final C5500kQ0 p;
    public final V70 q;

    static {
        new C1974Zb1(new C1896Yb1());
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
        AbstractC0277Dh1.L(3);
        AbstractC0277Dh1.L(4);
        AbstractC8235ym.t(5, 6, 7, 8, 9);
        AbstractC8235ym.t(10, 11, 12, 13, 14);
        AbstractC8235ym.t(15, 16, 17, 18, 19);
        AbstractC8235ym.t(20, 21, 22, 23, 24);
        AbstractC8235ym.t(25, 26, 27, 28, 29);
        AbstractC0277Dh1.L(30);
        AbstractC0277Dh1.L(31);
    }

    public C1974Zb1(C1896Yb1 c1896Yb1) {
        this.a = c1896Yb1.a;
        this.b = c1896Yb1.b;
        this.c = c1896Yb1.c;
        this.d = c1896Yb1.d;
        this.e = c1896Yb1.e;
        this.f = c1896Yb1.f;
        this.g = c1896Yb1.g;
        this.h = c1896Yb1.h;
        this.i = c1896Yb1.i;
        this.j = c1896Yb1.j;
        this.k = c1896Yb1.k;
        this.l = c1896Yb1.l;
        this.m = c1896Yb1.m;
        this.n = c1896Yb1.n;
        this.o = c1896Yb1.o;
        this.p = C5500kQ0.b(c1896Yb1.p);
        this.q = V70.u(c1896Yb1.q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1974Zb1 c1974Zb1 = (C1974Zb1) obj;
        if (this.a == c1974Zb1.a && this.b == c1974Zb1.b && this.c == c1974Zb1.c && this.d == c1974Zb1.d && this.g == c1974Zb1.g && this.e == c1974Zb1.e && this.f == c1974Zb1.f && this.h.equals(c1974Zb1.h) && this.i.equals(c1974Zb1.i) && this.j == c1974Zb1.j && this.k == c1974Zb1.k && this.l.equals(c1974Zb1.l) && this.m.equals(c1974Zb1.m) && this.n.equals(c1974Zb1.n) && this.o == c1974Zb1.o) {
            C5500kQ0 c5500kQ0 = this.p;
            c5500kQ0.getClass();
            if (EU0.b(c5500kQ0, c1974Zb1.p) && this.q.equals(c1974Zb1.q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.l.hashCode() + ((((((this.i.hashCode() + ((this.h.hashCode() + ((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.g ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31)) * 961)) * 961) + this.j) * 31) + this.k) * 31)) * 31;
        this.m.getClass();
        return this.q.hashCode() + ((this.p.hashCode() + ((((this.n.hashCode() + ((iHashCode + 29791) * 31)) * 31) + this.o) * 887503681)) * 31);
    }
}
