package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6419pE0 implements InterfaceC8435zp0, YR, InterfaceC5369jk0, InterfaceC5942mk0, InterfaceC2337bV0 {
    public static final Map N;
    public static final C6666qX O;
    public long A;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public final Uri a;
    public final ZC b;
    public final RL c;
    public final C3547eG d;
    public final VY e;
    public final OL f;
    public final C6991sE0 g;
    public final C5272jE h;
    public final long i;
    public final long j;
    public final C6846rT1 l;
    public InterfaceC8245yp0 q;
    public Q50 r;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public C1155Oo1 y;
    public CX0 z;
    public final C1857Xo1 k = new C1857Xo1("ProgressiveMediaPeriod", 2);
    public final FC m = new FC();
    public final RunnableC5464kE0 n = new RunnableC5464kE0(this, 1);
    public final RunnableC5464kE0 o = new RunnableC5464kE0(this, 2);
    public final Handler p = AbstractC0277Dh1.n(null);
    public C6228oE0[] t = new C6228oE0[0];
    public C2527cV0[] s = new C2527cV0[0];
    public long I = -9223372036854775807L;
    public int C = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(map);
        C6475pX c6475pX = new C6475pX();
        c6475pX.a = "icy";
        c6475pX.l = AbstractC1865Xr0.n("application/x-icy");
        O = new C6666qX(c6475pX);
    }

    public C6419pE0(Uri uri, ZC zc, C6846rT1 c6846rT1, RL rl, OL ol, C3547eG c3547eG, VY vy, C6991sE0 c6991sE0, C5272jE c5272jE, int i, long j) {
        this.a = uri;
        this.b = zc;
        this.c = rl;
        this.f = ol;
        this.d = c3547eG;
        this.e = vy;
        this.g = c6991sE0;
        this.h = c5272jE;
        this.i = i;
        this.l = c6846rT1;
        this.j = j;
    }

    public final void A(int i) {
        f();
        boolean[] zArr = (boolean[]) this.y.b;
        if (this.J && zArr[i] && !this.s[i].w(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (C2527cV0 c2527cV0 : this.s) {
                c2527cV0.C(false);
            }
            InterfaceC8245yp0 interfaceC8245yp0 = this.q;
            interfaceC8245yp0.getClass();
            interfaceC8245yp0.m(this);
        }
    }

    public final InterfaceC1584Ub1 B(C6228oE0 c6228oE0) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (c6228oE0.equals(this.t[i])) {
                return this.s[i];
            }
        }
        if (this.u) {
            AbstractC6789rA1.h("Extractor added new track (id=" + c6228oE0.a + ") after finishing tracks.");
            return new WJ();
        }
        OL ol = this.f;
        RL rl = this.c;
        rl.getClass();
        C2527cV0 c2527cV0 = new C2527cV0(this.h, rl, ol);
        c2527cV0.f = this;
        int i2 = length + 1;
        C6228oE0[] c6228oE0Arr = (C6228oE0[]) Arrays.copyOf(this.t, i2);
        c6228oE0Arr[length] = c6228oE0;
        int i3 = AbstractC0277Dh1.a;
        this.t = c6228oE0Arr;
        C2527cV0[] c2527cV0Arr = (C2527cV0[]) Arrays.copyOf(this.s, i2);
        c2527cV0Arr[length] = c2527cV0;
        this.s = c2527cV0Arr;
        return c2527cV0;
    }

    public final void C() {
        C5846mE0 c5846mE0 = new C5846mE0(this, this.a, this.b, this.l, this, this.m);
        if (this.v) {
            YN1.f(u());
            long j = this.A;
            if (j != -9223372036854775807L && this.I > j) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            CX0 cx0 = this.z;
            cx0.getClass();
            long j2 = cx0.i(this.I).a.b;
            long j3 = this.I;
            c5846mE0.g.a = j2;
            c5846mE0.j = j3;
            c5846mE0.i = true;
            c5846mE0.m = false;
            for (C2527cV0 c2527cV0 : this.s) {
                c2527cV0.t = this.I;
            }
            this.I = -9223372036854775807L;
        }
        this.K = j();
        this.e.S(new C4020gk0(c5846mE0.a, c5846mE0.k, this.k.S(c5846mE0, this, this.d.d(this.C))), 1, -1, null, 0, null, c5846mE0.j, this.A);
    }

    public final boolean D() {
        return this.E || u();
    }

    @Override // defpackage.InterfaceC2337bV0
    public final void a() {
        this.p.post(this.n);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        f();
        if (!this.z.e()) {
            return 0L;
        }
        BX0 bx0I = this.z.i(j);
        return dx0.a(j, bx0I.a.a, bx0I.b.a);
    }

    @Override // defpackage.InterfaceC5942mk0
    public final void c() {
        for (C2527cV0 c2527cV0 : this.s) {
            c2527cV0.C(true);
            LL ll = c2527cV0.h;
            if (ll != null) {
                ll.d(c2527cV0.e);
                c2527cV0.h = null;
                c2527cV0.g = null;
            }
        }
        C6846rT1 c6846rT1 = this.l;
        WR wr = (WR) c6846rT1.c;
        if (wr != null) {
            wr.release();
            c6846rT1.c = null;
        }
        c6846rT1.d = null;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long d(InterfaceC5311jR[] interfaceC5311jRArr, boolean[] zArr, InterfaceC3403dV0[] interfaceC3403dV0Arr, boolean[] zArr2, long j) {
        InterfaceC5311jR interfaceC5311jR;
        f();
        C1155Oo1 c1155Oo1 = this.y;
        C1350Rb1 c1350Rb1 = (C1350Rb1) c1155Oo1.a;
        boolean[] zArr3 = (boolean[]) c1155Oo1.c;
        int i = this.F;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC5311jRArr.length; i3++) {
            InterfaceC3403dV0 interfaceC3403dV0 = interfaceC3403dV0Arr[i3];
            if (interfaceC3403dV0 != null && (interfaceC5311jRArr[i3] == null || !zArr[i3])) {
                int i4 = ((C6037nE0) interfaceC3403dV0).a;
                YN1.f(zArr3[i4]);
                this.F--;
                zArr3[i4] = false;
                interfaceC3403dV0Arr[i3] = null;
            }
        }
        boolean z = !this.D ? j == 0 || this.x : i != 0;
        for (int i5 = 0; i5 < interfaceC5311jRArr.length; i5++) {
            if (interfaceC3403dV0Arr[i5] == null && (interfaceC5311jR = interfaceC5311jRArr[i5]) != null) {
                YN1.f(interfaceC5311jR.length() == 1);
                YN1.f(interfaceC5311jR.j(0) == 0);
                int iB = c1350Rb1.b(interfaceC5311jR.d());
                YN1.f(!zArr3[iB]);
                this.F++;
                zArr3[iB] = true;
                interfaceC3403dV0Arr[i5] = new C6037nE0(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    C2527cV0 c2527cV0 = this.s[iB];
                    z = (c2527cV0.r() == 0 || c2527cV0.F(j, true)) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            C1857Xo1 c1857Xo1 = this.k;
            if (c1857Xo1.I()) {
                C2527cV0[] c2527cV0Arr = this.s;
                int length = c2527cV0Arr.length;
                while (i2 < length) {
                    c2527cV0Arr[i2].j();
                    i2++;
                }
                c1857Xo1.p();
            } else {
                this.L = false;
                for (C2527cV0 c2527cV02 : this.s) {
                    c2527cV02.C(false);
                }
            }
        } else if (z) {
            j = h(j);
            while (i2 < interfaceC3403dV0Arr.length) {
                if (interfaceC3403dV0Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.D = true;
        return j;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        return s();
    }

    public final void f() {
        YN1.f(this.v);
        this.y.getClass();
        this.z.getClass();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() throws IOException {
        int iD = this.d.d(this.C);
        C1857Xo1 c1857Xo1 = this.k;
        IOException iOException = (IOException) c1857Xo1.d;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC5560kk0 handlerC5560kk0 = (HandlerC5560kk0) c1857Xo1.c;
        if (handlerC5560kk0 != null) {
            if (iD == Integer.MIN_VALUE) {
                iD = handlerC5560kk0.a;
            }
            IOException iOException2 = handlerC5560kk0.e;
            if (iOException2 != null && handlerC5560kk0.f > iD) {
                throw iOException2;
            }
        }
        if (this.L && !this.v) {
            throw C5643lA0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        boolean z;
        f();
        boolean[] zArr = (boolean[]) this.y.b;
        if (!this.z.e()) {
            j = 0;
        }
        this.E = false;
        this.H = j;
        if (u()) {
            this.I = j;
            return j;
        }
        int i = this.C;
        C1857Xo1 c1857Xo1 = this.k;
        if (i != 7 && (this.L || c1857Xo1.I())) {
            int length = this.s.length;
            for (int i2 = 0; i2 < length; i2++) {
                C2527cV0 c2527cV0 = this.s[i2];
                if (!(this.x ? c2527cV0.E(c2527cV0.q) : c2527cV0.F(j, false)) && (zArr[i2] || !this.w)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j;
            }
        }
        this.J = false;
        this.I = j;
        this.L = false;
        if (c1857Xo1.I()) {
            for (C2527cV0 c2527cV02 : this.s) {
                c2527cV02.j();
            }
            c1857Xo1.p();
        } else {
            c1857Xo1.d = null;
            for (C2527cV0 c2527cV03 : this.s) {
                c2527cV03.C(false);
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        if (this.x) {
            return;
        }
        f();
        if (u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.y.c;
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            this.s[i].i(j, zArr[i]);
        }
    }

    public final int j() {
        int i = 0;
        for (C2527cV0 c2527cV0 : this.s) {
            i += c2527cV0.q + c2527cV0.p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            cV0[] r3 = r5.s
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            Oo1 r3 = r5.y
            r3.getClass()
            java.lang.Object r3 = r3.c
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            cV0[] r3 = r5.s
            r3 = r3[r2]
            long r3 = r3.o()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6419pE0.k(boolean):long");
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        boolean z;
        if (this.k.I()) {
            FC fc = this.m;
            synchronized (fc) {
                z = fc.a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        C5846mE0 c5846mE0 = (C5846mE0) interfaceC5751lk0;
        Uri uri = c5846mE0.c.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.d.getClass();
        this.e.J(c4020gk0, 1, -1, null, 0, null, c5846mE0.j, this.A);
        if (z) {
            return;
        }
        for (C2527cV0 c2527cV0 : this.s) {
            c2527cV0.C(false);
        }
        if (this.F > 0) {
            InterfaceC8245yp0 interfaceC8245yp0 = this.q;
            interfaceC8245yp0.getClass();
            interfaceC8245yp0.m(this);
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && j() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void o(InterfaceC8245yp0 interfaceC8245yp0, long j) {
        this.q = interfaceC8245yp0;
        this.m.g();
        C();
    }

    @Override // defpackage.InterfaceC5369jk0
    public final C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        C3829fk0 c3829fk0;
        CX0 cx0;
        C5846mE0 c5846mE0 = (C5846mE0) interfaceC5751lk0;
        Uri uri = c5846mE0.c.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        AbstractC0277Dh1.d0(c5846mE0.j);
        AbstractC0277Dh1.d0(this.A);
        long jE = this.d.e(new C1204Pf(iOException, i, 9));
        if (jE == -9223372036854775807L) {
            c3829fk0 = C1857Xo1.i;
        } else {
            int iJ = j();
            int i2 = iJ > this.K ? 1 : 0;
            if (this.G || !((cx0 = this.z) == null || cx0.k() == -9223372036854775807L)) {
                this.K = iJ;
            } else if (!this.v || D()) {
                this.E = this.v;
                this.H = 0L;
                this.K = 0;
                for (C2527cV0 c2527cV0 : this.s) {
                    c2527cV0.C(false);
                }
                c5846mE0.g.a = 0L;
                c5846mE0.j = 0L;
                c5846mE0.i = true;
                c5846mE0.m = false;
            } else {
                this.J = true;
                c3829fk0 = C1857Xo1.h;
            }
            c3829fk0 = new C3829fk0(i2, jE, false);
        }
        this.e.O(c4020gk0, 1, -1, null, 0, null, c5846mE0.j, this.A, iOException, !c3829fk0.a());
        return c3829fk0;
    }

    @Override // defpackage.YR
    public final void p() {
        this.u = true;
        this.p.post(this.n);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        f();
        return (C1350Rb1) this.y.a;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        if (this.L) {
            return false;
        }
        C1857Xo1 c1857Xo1 = this.k;
        if (c1857Xo1.G() || this.J) {
            return false;
        }
        if (this.v && this.F == 0) {
            return false;
        }
        boolean zG = this.m.g();
        if (c1857Xo1.I()) {
            return zG;
        }
        C();
        return true;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        long jK;
        boolean z;
        f();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.I;
        }
        if (this.w) {
            int length = this.s.length;
            jK = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C1155Oo1 c1155Oo1 = this.y;
                if (((boolean[]) c1155Oo1.b)[i] && ((boolean[]) c1155Oo1.c)[i]) {
                    C2527cV0 c2527cV0 = this.s[i];
                    synchronized (c2527cV0) {
                        z = c2527cV0.w;
                    }
                    if (!z) {
                        jK = Math.min(jK, this.s[i].o());
                    }
                }
            }
        } else {
            jK = Long.MAX_VALUE;
        }
        if (jK == Long.MAX_VALUE) {
            jK = k(false);
        }
        return jK == Long.MIN_VALUE ? this.H : jK;
    }

    public final boolean u() {
        return this.I != -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        CX0 cx0;
        C5846mE0 c5846mE0 = (C5846mE0) interfaceC5751lk0;
        if (this.A == -9223372036854775807L && (cx0 = this.z) != null) {
            boolean zE = cx0.e();
            long jK = k(true);
            long j3 = jK == Long.MIN_VALUE ? 0L : jK + 10000;
            this.A = j3;
            this.g.w(j3, zE, this.B);
        }
        Uri uri = c5846mE0.c.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.d.getClass();
        this.e.M(c4020gk0, 1, -1, null, 0, null, c5846mE0.j, this.A);
        this.L = true;
        InterfaceC8245yp0 interfaceC8245yp0 = this.q;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.m(this);
    }

    @Override // defpackage.YR
    public final InterfaceC1584Ub1 w(int i, int i2) {
        return B(new C6228oE0(i, false));
    }

    @Override // defpackage.YR
    public final void x(CX0 cx0) {
        this.p.post(new MD0(this, 3, cx0));
    }

    public final void y() {
        long j;
        int i;
        if (this.M || this.v || !this.u || this.z == null) {
            return;
        }
        for (C2527cV0 c2527cV0 : this.s) {
            if (c2527cV0.u() == null) {
                return;
            }
        }
        this.m.d();
        int length = this.s.length;
        C1272Qb1[] c1272Qb1Arr = new C1272Qb1[length];
        boolean[] zArr = new boolean[length];
        int i2 = 0;
        while (true) {
            j = this.j;
            if (i2 >= length) {
                break;
            }
            C6666qX c6666qXU = this.s[i2].u();
            c6666qXU.getClass();
            String str = c6666qXU.m;
            boolean zJ = AbstractC1865Xr0.j(str);
            boolean z = zJ || AbstractC1865Xr0.m(str);
            zArr[i2] = z;
            this.w = z | this.w;
            this.x = j != -9223372036854775807L && length == 1 && AbstractC1865Xr0.k(str);
            Q50 q50 = this.r;
            if (q50 != null) {
                if (zJ || this.t[i2].b) {
                    C0540Gr0 c0540Gr0 = c6666qXU.k;
                    C0540Gr0 c0540Gr02 = c0540Gr0 == null ? new C0540Gr0(q50) : c0540Gr0.a(q50);
                    C6475pX c6475pXA = c6666qXU.a();
                    c6475pXA.j = c0540Gr02;
                    c6666qXU = new C6666qX(c6475pXA);
                }
                if (zJ && c6666qXU.g == -1 && c6666qXU.h == -1 && (i = q50.a) != -1) {
                    C6475pX c6475pXA2 = c6666qXU.a();
                    c6475pXA2.g = i;
                    c6666qXU = new C6666qX(c6475pXA2);
                }
            }
            int iJ = this.c.j(c6666qXU);
            C6475pX c6475pXA3 = c6666qXU.a();
            c6475pXA3.I = iJ;
            c1272Qb1Arr[i2] = new C1272Qb1(Integer.toString(i2), new C6666qX(c6475pXA3));
            i2++;
        }
        C1350Rb1 c1350Rb1 = new C1350Rb1(c1272Qb1Arr);
        C1155Oo1 c1155Oo1 = new C1155Oo1();
        c1155Oo1.a = c1350Rb1;
        c1155Oo1.b = zArr;
        int i3 = c1350Rb1.a;
        c1155Oo1.c = new boolean[i3];
        c1155Oo1.d = new boolean[i3];
        this.y = c1155Oo1;
        if (this.x && this.A == -9223372036854775807L) {
            this.A = j;
            this.z = new C5655lE0(this, this.z);
        }
        this.g.w(this.A, this.z.e(), this.B);
        this.v = true;
        InterfaceC8245yp0 interfaceC8245yp0 = this.q;
        interfaceC8245yp0.getClass();
        interfaceC8245yp0.a(this);
    }

    public final void z(int i) {
        f();
        C1155Oo1 c1155Oo1 = this.y;
        boolean[] zArr = (boolean[]) c1155Oo1.d;
        if (zArr[i]) {
            return;
        }
        C6666qX c6666qX = ((C1350Rb1) c1155Oo1.a).a(i).d[0];
        this.e.x(AbstractC1865Xr0.h(c6666qX.m), c6666qX, 0, null, this.H);
        zArr[i] = true;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
    }
}
