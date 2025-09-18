package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class K11 implements WR {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public YR f;
    public InterfaceC1584Ub1 g;

    public K11(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.g;
        interfaceC1584Ub1.getClass();
        int iE = interfaceC1584Ub1.e(xr, 1024, true);
        if (iE == -1) {
            this.e = 2;
            this.g.a(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += iE;
        }
        return 0;
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        int i = this.b;
        int i2 = this.a;
        YN1.f((i2 == -1 || i == -1) ? false : true);
        C4103hA0 c4103hA0 = new C4103hA0(i);
        ((C7566vF) xr).f(c4103hA0.a, 0, i, false);
        return c4103hA0.A() == i2;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.f = yr;
        InterfaceC1584Ub1 interfaceC1584Ub1W = yr.w(1024, 4);
        this.g = interfaceC1584Ub1W;
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n(this.c);
        F91.B(c6475pX, interfaceC1584Ub1W);
        this.f.p();
        this.f.x(new Q11());
        this.e = 1;
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
