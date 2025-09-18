package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class E30 implements InterfaceC5369jk0, InterfaceC5942mk0, InterfaceC3984gY0, YR, InterfaceC2337bV0 {
    public static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public C6666qX F;
    public C6666qX G;
    public boolean H;
    public C1350Rb1 I;
    public Set J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public JL W;
    public C5239j30 X;
    public final String a;
    public final int b;
    public final C1304Qm0 c;
    public final C4081h30 d;
    public final C5272jE e;
    public final C6666qX f;
    public final RL g;
    public final OL h;
    public final C3547eG i;
    public final C1857Xo1 j = new C1857Xo1("Loader:HlsSampleStreamWrapper", 2);
    public final VY k;
    public final int l;
    public final X11 m;
    public final ArrayList n;
    public final List o;
    public final B30 p;
    public final B30 q;
    public final Handler r;
    public final ArrayList s;
    public final Map t;
    public AbstractC1318Qr u;
    public D30[] v;
    public int[] w;
    public final HashSet x;
    public final SparseIntArray y;
    public C30 z;

    /* JADX WARN: Type inference failed for: r1v12, types: [B30] */
    /* JADX WARN: Type inference failed for: r1v13, types: [B30] */
    public E30(String str, int i, C1304Qm0 c1304Qm0, C4081h30 c4081h30, Map map, C5272jE c5272jE, long j, C6666qX c6666qX, RL rl, OL ol, C3547eG c3547eG, VY vy, int i2) {
        this.a = str;
        this.b = i;
        this.c = c1304Qm0;
        this.d = c4081h30;
        this.t = map;
        this.e = c5272jE;
        this.f = c6666qX;
        this.g = rl;
        this.h = ol;
        this.i = c3547eG;
        this.k = vy;
        this.l = i2;
        X11 x11 = new X11(8);
        x11.c = null;
        x11.b = false;
        x11.d = null;
        this.m = x11;
        this.w = new int[0];
        Set set = Y;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new D30[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        final int i3 = 0;
        this.p = new Runnable(this) { // from class: B30
            public final /* synthetic */ E30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        E30 e30 = this.b;
                        e30.C = true;
                        e30.C();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.q = new Runnable(this) { // from class: B30
            public final /* synthetic */ E30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        E30 e30 = this.b;
                        e30.C = true;
                        e30.C();
                        break;
                }
            }
        };
        this.r = AbstractC0277Dh1.n(null);
        this.P = j;
        this.Q = j;
    }

    public static int A(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static WJ j(int i, int i2) {
        AbstractC6789rA1.h("Unmapped track with id " + i + " of type " + i2);
        return new WJ();
    }

    public static C6666qX u(C6666qX c6666qX, C6666qX c6666qX2, boolean z) {
        String strD;
        String strT;
        if (c6666qX == null) {
            return c6666qX2;
        }
        String str = c6666qX2.m;
        int iH = AbstractC1865Xr0.h(str);
        String str2 = c6666qX.j;
        if (AbstractC0277Dh1.s(iH, str2) == 1) {
            strT = AbstractC0277Dh1.t(iH, str2);
            strD = AbstractC1865Xr0.d(strT);
        } else {
            String strB = AbstractC1865Xr0.b(str2, str);
            strD = str;
            strT = strB;
        }
        C6475pX c6475pXA = c6666qX2.a();
        c6475pXA.a = c6666qX.a;
        c6475pXA.b = c6666qX.b;
        c6475pXA.c = P70.u(c6666qX.c);
        c6475pXA.d = c6666qX.d;
        c6475pXA.e = c6666qX.e;
        c6475pXA.f = c6666qX.f;
        c6475pXA.g = z ? c6666qX.g : -1;
        c6475pXA.h = z ? c6666qX.h : -1;
        c6475pXA.i = strT;
        if (iH == 2) {
            c6475pXA.r = c6666qX.s;
            c6475pXA.s = c6666qX.t;
            c6475pXA.t = c6666qX.u;
        }
        if (strD != null) {
            c6475pXA.l = AbstractC1865Xr0.n(strD);
        }
        int i = c6666qX.A;
        if (i != -1 && iH == 1) {
            c6475pXA.z = i;
        }
        C0540Gr0 c0540Gr0B = c6666qX.k;
        if (c0540Gr0B != null) {
            C0540Gr0 c0540Gr0 = c6666qX2.k;
            if (c0540Gr0 != null) {
                c0540Gr0B = c0540Gr0.b(c0540Gr0B);
            }
            c6475pXA.j = c0540Gr0B;
        }
        return new C6666qX(c6475pXA);
    }

    public final boolean B() {
        return this.Q != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        int i;
        int i2 = 0;
        if (!this.H && this.K == null && this.C) {
            for (D30 d30 : this.v) {
                if (d30.u() == null) {
                    return;
                }
            }
            C1350Rb1 c1350Rb1 = this.I;
            if (c1350Rb1 != null) {
                int i3 = c1350Rb1.a;
                int[] iArr = new int[i3];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        D30[] d30Arr = this.v;
                        if (i5 < d30Arr.length) {
                            C6666qX c6666qXU = d30Arr[i5].u();
                            YN1.h(c6666qXU);
                            C6666qX c6666qX = this.I.a(i4).d[0];
                            String str = c6666qX.m;
                            String str2 = c6666qXU.m;
                            int iH = AbstractC1865Xr0.h(str2);
                            if (iH != 3) {
                                if (iH == AbstractC1865Xr0.h(str)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (AbstractC0277Dh1.a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || c6666qXU.F == c6666qX.F)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.K[i4] = i5;
                }
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((A30) it.next()).b();
                }
                return;
            }
            int length = this.v.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                C6666qX c6666qXU2 = this.v[i6].u();
                YN1.h(c6666qXU2);
                String str3 = c6666qXU2.m;
                int i9 = AbstractC1865Xr0.m(str3) ? 2 : AbstractC1865Xr0.j(str3) ? 1 : AbstractC1865Xr0.l(str3) ? 3 : -2;
                if (A(i9) > A(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            C1272Qb1 c1272Qb1 = this.d.h;
            int i10 = c1272Qb1.a;
            this.L = -1;
            this.K = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.K[i11] = i11;
            }
            C1272Qb1[] c1272Qb1Arr = new C1272Qb1[length];
            int i12 = 0;
            while (i12 < length) {
                C6666qX c6666qXU3 = this.v[i12].u();
                YN1.h(c6666qXU3);
                String str4 = this.a;
                C6666qX c6666qX2 = this.f;
                if (i12 == i7) {
                    C6666qX[] c6666qXArr = new C6666qX[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        C6666qX c6666qXE = c1272Qb1.d[i13];
                        if (i8 == 1 && c6666qX2 != null) {
                            c6666qXE = c6666qXE.e(c6666qX2);
                        }
                        c6666qXArr[i13] = i10 == 1 ? c6666qXU3.e(c6666qXE) : u(c6666qXE, c6666qXU3, true);
                    }
                    c1272Qb1Arr[i12] = new C1272Qb1(str4, c6666qXArr);
                    this.L = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !AbstractC1865Xr0.j(c6666qXU3.m)) {
                        c6666qX2 = null;
                    }
                    StringBuilder sbK = NX.k(str4, ":muxed:");
                    sbK.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    c1272Qb1Arr[i12] = new C1272Qb1(sbK.toString(), u(c6666qX2, c6666qXU3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.I = k(c1272Qb1Arr);
            YN1.f(this.J == null ? 1 : i14);
            this.J = Collections.emptySet();
            this.D = true;
            this.c.x();
        }
    }

    public final void D() throws IOException {
        this.j.a();
        C4081h30 c4081h30 = this.d;
        C2562ch c2562ch = c4081h30.o;
        if (c2562ch != null) {
            throw c2562ch;
        }
        Uri uri = c4081h30.p;
        if (uri == null || !c4081h30.t) {
            return;
        }
        EF ef = (EF) c4081h30.g.d.get(uri);
        ef.b.a();
        IOException iOException = ef.j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void E(C1272Qb1[] c1272Qb1Arr, int... iArr) {
        this.I = k(c1272Qb1Arr);
        this.J = new HashSet();
        for (int i : iArr) {
            this.J.add(this.I.a(i));
        }
        this.L = 0;
        this.r.post(new DE(16, this.c));
        this.D = true;
    }

    public final void F() {
        for (D30 d30 : this.v) {
            d30.C(this.R);
        }
        this.R = false;
    }

    public final boolean G(long j, boolean z) {
        C5239j30 c5239j30;
        boolean z2;
        this.P = j;
        if (B()) {
            this.Q = j;
            return true;
        }
        boolean z3 = this.d.q;
        ArrayList arrayList = this.n;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                c5239j30 = (C5239j30) arrayList.get(i);
                if (c5239j30.g == j) {
                    break;
                }
            }
            c5239j30 = null;
        } else {
            c5239j30 = null;
        }
        if (this.C && !z) {
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                D30 d30 = this.v[i2];
                if (!(c5239j30 != null ? d30.E(c5239j30.f(i2)) : d30.F(j, false)) && (this.O[i2] || !this.M)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.Q = j;
        this.T = false;
        arrayList.clear();
        C1857Xo1 c1857Xo1 = this.j;
        if (c1857Xo1.I()) {
            if (this.C) {
                for (D30 d302 : this.v) {
                    d302.j();
                }
            }
            c1857Xo1.p();
        } else {
            c1857Xo1.d = null;
            F();
        }
        return true;
    }

    @Override // defpackage.InterfaceC2337bV0
    public final void a() {
        this.r.post(this.p);
    }

    @Override // defpackage.InterfaceC5942mk0
    public final void c() {
        for (D30 d30 : this.v) {
            d30.C(true);
            LL ll = d30.h;
            if (ll != null) {
                ll.d(d30.e);
                d30.h = null;
                d30.g = null;
            }
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        if (B()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return z().h;
    }

    public final void f() {
        YN1.f(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    public final C1350Rb1 k(C1272Qb1[] c1272Qb1Arr) {
        for (int i = 0; i < c1272Qb1Arr.length; i++) {
            C1272Qb1 c1272Qb1 = c1272Qb1Arr[i];
            C6666qX[] c6666qXArr = new C6666qX[c1272Qb1.a];
            for (int i2 = 0; i2 < c1272Qb1.a; i2++) {
                C6666qX c6666qX = c1272Qb1.d[i2];
                int iJ = this.g.j(c6666qX);
                C6475pX c6475pXA = c6666qX.a();
                c6475pXA.I = iJ;
                c6666qXArr[i2] = new C6666qX(c6475pXA);
            }
            c1272Qb1Arr[i] = new C1272Qb1(c1272Qb1.b, c6666qXArr);
        }
        return new C1350Rb1(c1272Qb1Arr);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.j.I();
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        AbstractC1318Qr abstractC1318Qr = (AbstractC1318Qr) interfaceC5751lk0;
        this.u = null;
        long j3 = abstractC1318Qr.a;
        Uri uri = abstractC1318Qr.i.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.i.getClass();
        this.k.J(c4020gk0, abstractC1318Qr.c, this.b, abstractC1318Qr.d, abstractC1318Qr.e, abstractC1318Qr.f, abstractC1318Qr.g, abstractC1318Qr.h);
        if (z) {
            return;
        }
        if (B() || this.E == 0) {
            F();
        }
        if (this.E > 0) {
            this.c.m(this);
        }
    }

    @Override // defpackage.InterfaceC5369jk0
    public final C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        boolean zO;
        C3829fk0 c3829fk0;
        int i2;
        AbstractC1318Qr abstractC1318Qr = (AbstractC1318Qr) interfaceC5751lk0;
        boolean z = abstractC1318Qr instanceof C5239j30;
        if (z && !((C5239j30) abstractC1318Qr).K && (iOException instanceof C7343u40) && ((i2 = ((C7343u40) iOException).d) == 410 || i2 == 404)) {
            return C1857Xo1.g;
        }
        long j3 = abstractC1318Qr.i.b;
        Uri uri = abstractC1318Qr.i.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        AbstractC0277Dh1.d0(abstractC1318Qr.g);
        AbstractC0277Dh1.d0(abstractC1318Qr.h);
        C1204Pf c1204Pf = new C1204Pf(iOException, i, 9);
        C4081h30 c4081h30 = this.d;
        C3638ek0 c3638ek0A = RY1.a(c4081h30.r);
        C3547eG c3547eG = this.i;
        c3547eG.getClass();
        C3829fk0 c3829fk0C = C3547eG.c(c3638ek0A, c1204Pf);
        if (c3829fk0C == null || c3829fk0C.a != 2) {
            zO = false;
        } else {
            InterfaceC5311jR interfaceC5311jR = c4081h30.r;
            zO = interfaceC5311jR.o(interfaceC5311jR.t(c4081h30.h.b(abstractC1318Qr.d)), c3829fk0C.b);
        }
        if (zO) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.n;
                YN1.f(((C5239j30) arrayList.remove(arrayList.size() - 1)) == abstractC1318Qr);
                if (arrayList.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((C5239j30) AbstractC7337u22.b(arrayList)).J = true;
                }
            }
            c3829fk0 = C1857Xo1.h;
        } else {
            long jE = c3547eG.e(c1204Pf);
            c3829fk0 = jE != -9223372036854775807L ? new C3829fk0(0, jE, false) : C1857Xo1.i;
        }
        boolean zA = c3829fk0.a();
        this.k.O(c4020gk0, abstractC1318Qr.c, this.b, abstractC1318Qr.d, abstractC1318Qr.e, abstractC1318Qr.f, abstractC1318Qr.g, abstractC1318Qr.h, iOException, !zA);
        if (!zA) {
            this.u = null;
        }
        if (zO) {
            if (this.D) {
                this.c.m(this);
            } else {
                C7469uk0 c7469uk0 = new C7469uk0();
                c7469uk0.a = this.P;
                r(new C7660vk0(c7469uk0));
            }
        }
        return c3829fk0;
    }

    @Override // defpackage.YR
    public final void p() {
        this.U = true;
        this.r.post(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:338:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x052e  */
    @Override // defpackage.InterfaceC3984gY0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(defpackage.C7660vk0 r66) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E30.r(vk0):boolean");
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (B()) {
            return this.Q;
        }
        long jMax = this.P;
        C5239j30 c5239j30Z = z();
        if (!c5239j30Z.H) {
            ArrayList arrayList = this.n;
            c5239j30Z = arrayList.size() > 1 ? (C5239j30) AbstractC8235ym.e(2, arrayList) : null;
        }
        if (c5239j30Z != null) {
            jMax = Math.max(jMax, c5239j30Z.h);
        }
        if (this.C) {
            for (D30 d30 : this.v) {
                jMax = Math.max(jMax, d30.o());
            }
        }
        return jMax;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        C1857Xo1 c1857Xo1 = this.j;
        if (c1857Xo1.G() || B()) {
            return;
        }
        boolean zI = c1857Xo1.I();
        C4081h30 c4081h30 = this.d;
        List list = this.o;
        if (zI) {
            this.u.getClass();
            if (c4081h30.o != null ? false : c4081h30.r.g(j, this.u, list)) {
                c1857Xo1.p();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && c4081h30.b((C5239j30) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            y(size);
        }
        int size2 = (c4081h30.o != null || c4081h30.r.length() < 2) ? list.size() : c4081h30.r.k(j, list);
        if (size2 < this.n.size()) {
            y(size2);
        }
    }

    @Override // defpackage.InterfaceC5369jk0
    public final void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        AbstractC1318Qr abstractC1318Qr = (AbstractC1318Qr) interfaceC5751lk0;
        this.u = null;
        C4081h30 c4081h30 = this.d;
        if (abstractC1318Qr instanceof C3318d30) {
            C3318d30 c3318d30 = (C3318d30) abstractC1318Qr;
            c4081h30.n = c3318d30.j;
            Uri uri = c3318d30.b.a;
            byte[] bArr = c3318d30.l;
            bArr.getClass();
            QQ0 qq0 = c4081h30.j;
            qq0.getClass();
            uri.getClass();
        }
        long j3 = abstractC1318Qr.a;
        Uri uri2 = abstractC1318Qr.i.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.i.getClass();
        this.k.M(c4020gk0, abstractC1318Qr.c, this.b, abstractC1318Qr.d, abstractC1318Qr.e, abstractC1318Qr.f, abstractC1318Qr.g, abstractC1318Qr.h);
        if (this.D) {
            this.c.m(this);
            return;
        }
        C7469uk0 c7469uk0 = new C7469uk0();
        c7469uk0.a = this.P;
        r(new C7660vk0(c7469uk0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [WJ] */
    @Override // defpackage.YR
    public final InterfaceC1584Ub1 w(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = Y;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        D30 d30 = null;
        if (zContains) {
            YN1.c(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                d30 = this.w[i3] == i ? this.v[i3] : j(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                D30[] d30Arr = this.v;
                if (i4 >= d30Arr.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    d30 = d30Arr[i4];
                    break;
                }
                i4++;
            }
        }
        if (d30 == null) {
            if (this.U) {
                return j(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            d30 = new D30(this.e, this.g, this.h, this.t);
            d30.t = this.P;
            if (z) {
                d30.I = this.W;
                d30.z = true;
            }
            long j = this.V;
            if (d30.F != j) {
                d30.F = j;
                d30.z = true;
            }
            if (this.X != null) {
                d30.C = r2.k;
            }
            d30.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.w, i5);
            this.w = iArrCopyOf;
            iArrCopyOf[length] = i;
            D30[] d30Arr2 = this.v;
            int i6 = AbstractC0277Dh1.a;
            Object[] objArrCopyOf = Arrays.copyOf(d30Arr2, d30Arr2.length + 1);
            objArrCopyOf[d30Arr2.length] = d30;
            this.v = (D30[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.O, i5);
            this.O = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.M |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (A(i2) > A(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.N = Arrays.copyOf(this.N, i5);
        }
        if (i2 != 5) {
            return d30;
        }
        if (this.z == null) {
            this.z = new C30(d30, this.l);
        }
        return this.z;
    }

    public final void y(int i) {
        ArrayList arrayList;
        YN1.f(!this.j.I());
        int i2 = i;
        loop0: while (true) {
            arrayList = this.n;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    C5239j30 c5239j30 = (C5239j30) arrayList.get(i2);
                    for (int i4 = 0; i4 < this.v.length; i4++) {
                        if (this.v[i4].r() > c5239j30.f(i4)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((C5239j30) arrayList.get(i3)).n) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return;
        }
        long j = z().h;
        C5239j30 c5239j302 = (C5239j30) arrayList.get(i2);
        AbstractC0277Dh1.V(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.v.length; i5++) {
            this.v[i5].l(c5239j302.f(i5));
        }
        if (arrayList.isEmpty()) {
            this.Q = this.P;
        } else {
            ((C5239j30) AbstractC7337u22.b(arrayList)).J = true;
        }
        this.T = false;
        this.k.h0(new C7102sp0(1, this.A, null, 3, null, AbstractC0277Dh1.d0(c5239j302.g), AbstractC0277Dh1.d0(j)));
    }

    public final C5239j30 z() {
        return (C5239j30) AbstractC8235ym.e(1, this.n);
    }

    @Override // defpackage.YR
    public final void x(CX0 cx0) {
    }
}
