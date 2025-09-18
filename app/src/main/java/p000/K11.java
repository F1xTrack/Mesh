package p000;

import java.util.List;

/* loaded from: classes.dex */
public final class K11 implements InterfaceC1412WR {

    /* renamed from: a */
    public final int f5877a;

    /* renamed from: b */
    public final int f5878b;

    /* renamed from: c */
    public final String f5879c;

    /* renamed from: d */
    public int f5880d;

    /* renamed from: e */
    public int f5881e;

    /* renamed from: f */
    public InterfaceC1538YR f5882f;

    /* renamed from: g */
    public InterfaceC8357Ub1 f5883g;

    public K11(int i, int i2, String str) {
        this.f5877a = i;
        this.f5878b = i2;
        this.f5879c = str;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) {
        int i = this.f5881e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f5883g;
        interfaceC8357Ub1.getClass();
        int iMo964e = interfaceC8357Ub1.mo964e(interfaceC1475XR, 1024, true);
        if (iMo964e == -1) {
            this.f5881e = 2;
            this.f5883g.mo960a(0L, 1, this.f5880d, 0, null);
            this.f5880d = 0;
        } else {
            this.f5880d += iMo964e;
        }
        return 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        int i = this.f5878b;
        int i2 = this.f5877a;
        YN1.m9281f((i2 == -1 || i == -1) ? false : true);
        C9591hA0 c9591hA0 = new C9591hA0(i);
        ((C7000vF) interfaceC1475XR).mo3620f(c9591hA0.f28293a, 0, i, false);
        return c9591hA0.m18735A() == i2;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        if (j == 0 || this.f5881e == 1) {
            this.f5881e = 1;
            this.f5880d = 0;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        this.f5882f = interfaceC1538YR;
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(1024, 4);
        this.f5883g = interfaceC8357Ub1Mo2005w;
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n(this.f5879c);
        F91.m2512B(c6623pX, interfaceC8357Ub1Mo2005w);
        this.f5882f.mo2003p();
        this.f5882f.mo2006x(new Q11());
        this.f5881e = 1;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
