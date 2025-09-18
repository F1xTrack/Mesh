package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O11 implements InterfaceC8435zp0, InterfaceC5369jk0 {
    public final C3538eD a;
    public final WC b;
    public final InterfaceC4188hc1 c;
    public final C3547eG d;
    public final VY e;
    public final C1350Rb1 f;
    public final long h;
    public final C6666qX j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;
    public final ArrayList g = new ArrayList();
    public final C1857Xo1 i = new C1857Xo1("SingleSampleMediaPeriod", 2);

    public O11(C3538eD c3538eD, WC wc, InterfaceC4188hc1 interfaceC4188hc1, C6666qX c6666qX, long j, C3547eG c3547eG, VY vy, boolean z) {
        this.a = c3538eD;
        this.b = wc;
        this.c = interfaceC4188hc1;
        this.j = c6666qX;
        this.h = j;
        this.d = c3547eG;
        this.e = vy;
        this.k = z;
        this.f = new C1350Rb1(new C1272Qb1("", c6666qX));
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long d(InterfaceC5311jR[] interfaceC5311jRArr, boolean[] zArr, InterfaceC3403dV0[] interfaceC3403dV0Arr, boolean[] zArr2, long j) {
        for (int i = 0; i < interfaceC5311jRArr.length; i++) {
            InterfaceC3403dV0 interfaceC3403dV0 = interfaceC3403dV0Arr[i];
            ArrayList arrayList = this.g;
            if (interfaceC3403dV0 != null && (interfaceC5311jRArr[i] == null || !zArr[i])) {
                arrayList.remove(interfaceC3403dV0);
                interfaceC3403dV0Arr[i] = null;
            }
            if (interfaceC3403dV0Arr[i] == null && interfaceC5311jRArr[i] != null) {
                M11 m11 = new M11(this);
                arrayList.add(m11);
                interfaceC3403dV0Arr[i] = m11;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        return (this.l || this.i.I()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return j;
            }
            M11 m11 = (M11) arrayList.get(i);
            if (m11.a == 2) {
                m11.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.i.I();
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        Uri uri = ((N11) interfaceC5751lk0).c.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.d.getClass();
        this.e.J(c4020gk0, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        interfaceC8245yp0.a(this);
    }

    @Override // defpackage.InterfaceC5369jk0
    public final C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        C3829fk0 c3829fk0;
        Uri uri = ((N11) interfaceC5751lk0).c.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        AbstractC0277Dh1.d0(this.h);
        C1204Pf c1204Pf = new C1204Pf(iOException, i, 9);
        C3547eG c3547eG = this.d;
        long jE = c3547eG.e(c1204Pf);
        boolean z = jE == -9223372036854775807L || i >= c3547eG.d(1);
        if (this.k && z) {
            AbstractC6789rA1.i("Loading failed, treating as end-of-stream.", iOException);
            this.l = true;
            c3829fk0 = C1857Xo1.h;
        } else {
            c3829fk0 = jE != -9223372036854775807L ? new C3829fk0(0, jE, false) : C1857Xo1.i;
        }
        C3829fk0 c3829fk02 = c3829fk0;
        this.e.O(c4020gk0, 1, -1, this.j, 0, null, 0L, this.h, iOException, !c3829fk02.a());
        return c3829fk02;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        return this.f;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        if (this.l) {
            return false;
        }
        C1857Xo1 c1857Xo1 = this.i;
        if (c1857Xo1.I() || c1857Xo1.G()) {
            return false;
        }
        ZC zcS0 = this.b.s0();
        InterfaceC4188hc1 interfaceC4188hc1 = this.c;
        if (interfaceC4188hc1 != null) {
            zcS0.d(interfaceC4188hc1);
        }
        N11 n11 = new N11(zcS0, this.a);
        this.e.S(new C4020gk0(n11.a, this.a, c1857Xo1.S(n11, this, this.d.d(1))), 1, -1, this.j, 0, null, 0L, this.h);
        return true;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        N11 n11 = (N11) interfaceC5751lk0;
        this.n = (int) n11.c.b;
        byte[] bArr = n11.d;
        bArr.getClass();
        this.m = bArr;
        this.l = true;
        Uri uri = n11.c.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.d.getClass();
        this.e.M(c4020gk0, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() {
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        return j;
    }
}
