package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Q31 implements InterfaceC8435zp0, InterfaceC3793fY0 {
    public final X11 a;
    public final InterfaceC4188hc1 b;
    public final InterfaceC6515pk0 c;
    public final RL d;
    public final C22 e;
    public final OL f;
    public final C3547eG g;
    public final VY h;
    public final C5272jE i;
    public final C1350Rb1 j;
    public final C7304tt k;
    public InterfaceC8245yp0 l;
    public J31 m;
    public C1708Vr[] n;
    public C1954Yv o;

    public Q31(J31 j31, X11 x11, InterfaceC4188hc1 interfaceC4188hc1, C7304tt c7304tt, C22 c22, RL rl, OL ol, C3547eG c3547eG, VY vy, InterfaceC6515pk0 interfaceC6515pk0, C5272jE c5272jE) {
        this.m = j31;
        this.a = x11;
        this.b = interfaceC4188hc1;
        this.c = interfaceC6515pk0;
        this.e = c22;
        this.d = rl;
        this.f = ol;
        this.g = c3547eG;
        this.h = vy;
        this.i = c5272jE;
        this.k = c7304tt;
        C1272Qb1[] c1272Qb1Arr = new C1272Qb1[j31.f.length];
        int i = 0;
        while (true) {
            I31[] i31Arr = j31.f;
            if (i >= i31Arr.length) {
                this.j = new C1350Rb1(c1272Qb1Arr);
                this.n = new C1708Vr[0];
                c7304tt.getClass();
                N70 n70 = P70.b;
                C3769fQ0 c3769fQ0 = C3769fQ0.e;
                this.o = new C1954Yv(c3769fQ0, c3769fQ0);
                return;
            }
            C6666qX[] c6666qXArr = i31Arr[i].j;
            C6666qX[] c6666qXArr2 = new C6666qX[c6666qXArr.length];
            for (int i2 = 0; i2 < c6666qXArr.length; i2++) {
                C6666qX c6666qX = c6666qXArr[i2];
                C6475pX c6475pXA = c6666qX.a();
                c6475pXA.I = rl.j(c6666qX);
                C6666qX c6666qX2 = new C6666qX(c6475pXA);
                if (x11.b && ((C0162Bv0) x11.d).b(c6666qX2)) {
                    C6475pX c6475pXA2 = c6666qX2.a();
                    c6475pXA2.l = AbstractC1865Xr0.n("application/x-media3-cues");
                    c6475pXA2.F = ((C0162Bv0) x11.d).h(c6666qX2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(c6666qX2.m);
                    String str = c6666qX2.j;
                    sb.append(str != null ? " ".concat(str) : "");
                    c6475pXA2.i = sb.toString();
                    c6475pXA2.q = Long.MAX_VALUE;
                    c6666qX2 = new C6666qX(c6475pXA2);
                }
                c6666qXArr2[i2] = c6666qX2;
            }
            c1272Qb1Arr[i] = new C1272Qb1(Integer.toString(i), c6666qXArr2);
            i++;
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        for (C1708Vr c1708Vr : this.n) {
            if (c1708Vr.a == 2) {
                return c1708Vr.e.b(j, dx0);
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long d(InterfaceC5311jR[] interfaceC5311jRArr, boolean[] zArr, InterfaceC3403dV0[] interfaceC3403dV0Arr, boolean[] zArr2, long j) {
        int i;
        InterfaceC5311jR interfaceC5311jR;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < interfaceC5311jRArr.length) {
            InterfaceC3403dV0 interfaceC3403dV0 = interfaceC3403dV0Arr[i2];
            if (interfaceC3403dV0 != null) {
                C1708Vr c1708Vr = (C1708Vr) interfaceC3403dV0;
                InterfaceC5311jR interfaceC5311jR2 = interfaceC5311jRArr[i2];
                if (interfaceC5311jR2 == null || !zArr[i2]) {
                    c1708Vr.A(null);
                    interfaceC3403dV0Arr[i2] = null;
                } else {
                    ((FG) c1708Vr.e).f = interfaceC5311jR2;
                    arrayList.add(c1708Vr);
                }
            }
            if (interfaceC3403dV0Arr[i2] != null || (interfaceC5311jR = interfaceC5311jRArr[i2]) == null) {
                i = i2;
            } else {
                int iB = this.j.b(interfaceC5311jR.d());
                J31 j31 = this.m;
                X11 x11 = this.a;
                ZC zcS0 = ((WC) x11.c).s0();
                InterfaceC4188hc1 interfaceC4188hc1 = this.b;
                if (interfaceC4188hc1 != null) {
                    zcS0.d(interfaceC4188hc1);
                }
                i = i2;
                C1708Vr c1708Vr2 = new C1708Vr(this.m.f[iB].a, null, null, new FG(this.c, j31, iB, interfaceC5311jR, zcS0, this.e, (C0162Bv0) x11.d, x11.b), this, this.i, j, this.d, this.f, this.g, this.h);
                arrayList.add(c1708Vr2);
                interfaceC3403dV0Arr[i] = c1708Vr2;
                zArr2[i] = true;
            }
            i2 = i + 1;
        }
        C1708Vr[] c1708VrArr = new C1708Vr[arrayList.size()];
        this.n = c1708VrArr;
        arrayList.toArray(c1708VrArr);
        AbstractList abstractListB = AbstractC6949s10.b(arrayList, new C0681Im0(21));
        this.k.getClass();
        this.o = new C1954Yv(arrayList, abstractListB);
        return j;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        return this.o.e();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() {
        this.c.a();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        for (C1708Vr c1708Vr : this.n) {
            c1708Vr.B(j);
        }
        return j;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        for (C1708Vr c1708Vr : this.n) {
            c1708Vr.i(j);
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.o.l();
    }

    @Override // defpackage.InterfaceC3793fY0
    public final void m(InterfaceC3984gY0 interfaceC3984gY0) {
        InterfaceC8245yp0 interfaceC8245yp0 = this.l;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.m(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        this.l = interfaceC8245yp0;
        interfaceC8245yp0.a(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        return this.j;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        return this.o.r(c7660vk0);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        return this.o.s();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        this.o.t(j);
    }
}
