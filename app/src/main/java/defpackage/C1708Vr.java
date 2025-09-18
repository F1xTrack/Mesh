package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Vr */
/* loaded from: classes.dex */
public final class C1708Vr implements InterfaceC3403dV0, InterfaceC3984gY0, InterfaceC5369jk0, InterfaceC5942mk0 {
    public final int a;
    public final int[] b;
    public final C6666qX[] c;
    public final boolean[] d;
    public final InterfaceC1786Wr e;
    public final Object f;
    public final VY g;
    public final C3547eG h;
    public final C1857Xo1 i;
    public final C1135Oi j;
    public final ArrayList k;
    public final List l;
    public final C2527cV0 m;
    public final C2527cV0[] n;
    public final VH o;
    public AbstractC1318Qr p;
    public C6666qX q;
    public C7175tC r;
    public long s;
    public long t;
    public int u;
    public AbstractC6502pg v;
    public boolean w;

    public C1708Vr(int i, int[] iArr, C6666qX[] c6666qXArr, InterfaceC1786Wr interfaceC1786Wr, InterfaceC3793fY0 interfaceC3793fY0, C5272jE c5272jE, long j, RL rl, OL ol, C3547eG c3547eG, VY vy) {
        this.a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.b = iArr;
        this.c = c6666qXArr == null ? new C6666qX[0] : c6666qXArr;
        this.e = interfaceC1786Wr;
        this.f = interfaceC3793fY0;
        this.g = vy;
        this.h = c3547eG;
        this.i = new C1857Xo1("ChunkSampleStream", 2);
        this.j = new C1135Oi(1, false);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new C2527cV0[length];
        this.d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C2527cV0[] c2527cV0Arr = new C2527cV0[i3];
        rl.getClass();
        C2527cV0 c2527cV0 = new C2527cV0(c5272jE, rl, ol);
        this.m = c2527cV0;
        iArr2[0] = i;
        c2527cV0Arr[0] = c2527cV0;
        while (i2 < length) {
            C2527cV0 c2527cV02 = new C2527cV0(c5272jE, null, null);
            this.n[i2] = c2527cV02;
            int i4 = i2 + 1;
            c2527cV0Arr[i4] = c2527cV02;
            iArr2[i4] = this.b[i2];
            i2 = i4;
        }
        this.o = new VH(iArr2, c2527cV0Arr, false, 4);
        this.s = j;
        this.t = j;
    }

    public final void A(C7175tC c7175tC) {
        this.r = c7175tC;
        C2527cV0 c2527cV0 = this.m;
        c2527cV0.j();
        LL ll = c2527cV0.h;
        if (ll != null) {
            ll.d(c2527cV0.e);
            c2527cV0.h = null;
            c2527cV0.g = null;
        }
        for (C2527cV0 c2527cV02 : this.n) {
            c2527cV02.j();
            LL ll2 = c2527cV02.h;
            if (ll2 != null) {
                ll2.d(c2527cV02.e);
                c2527cV02.h = null;
                c2527cV02.g = null;
            }
        }
        this.i.P(this);
    }

    public final void B(long j) {
        ArrayList arrayList;
        AbstractC6502pg abstractC6502pg;
        this.t = j;
        if (x()) {
            this.s = j;
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            abstractC6502pg = (AbstractC6502pg) arrayList.get(i2);
            long j2 = abstractC6502pg.g;
            if (j2 == j && abstractC6502pg.k == -9223372036854775807L) {
                break;
            } else if (j2 > j) {
                break;
            } else {
                i2++;
            }
        }
        abstractC6502pg = null;
        C2527cV0 c2527cV0 = this.m;
        boolean zE = abstractC6502pg != null ? c2527cV0.E(abstractC6502pg.c(0)) : c2527cV0.F(j, j < e());
        C2527cV0[] c2527cV0Arr = this.n;
        if (zE) {
            this.u = z(c2527cV0.r(), 0);
            int length = c2527cV0Arr.length;
            while (i < length) {
                c2527cV0Arr[i].F(j, true);
                i++;
            }
            return;
        }
        this.s = j;
        this.w = false;
        arrayList.clear();
        this.u = 0;
        C1857Xo1 c1857Xo1 = this.i;
        if (c1857Xo1.I()) {
            c2527cV0.j();
            int length2 = c2527cV0Arr.length;
            while (i < length2) {
                c2527cV0Arr[i].j();
                i++;
            }
            c1857Xo1.p();
            return;
        }
        c1857Xo1.d = null;
        c2527cV0.C(false);
        for (C2527cV0 c2527cV02 : c2527cV0Arr) {
            c2527cV02.C(false);
        }
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() throws IOException {
        C1857Xo1 c1857Xo1 = this.i;
        c1857Xo1.a();
        this.m.y();
        if (c1857Xo1.I()) {
            return;
        }
        this.e.a();
    }

    @Override // defpackage.InterfaceC5942mk0
    public final void c() {
        C2527cV0 c2527cV0 = this.m;
        c2527cV0.C(true);
        LL ll = c2527cV0.h;
        if (ll != null) {
            ll.d(c2527cV0.e);
            c2527cV0.h = null;
            c2527cV0.g = null;
        }
        for (C2527cV0 c2527cV02 : this.n) {
            c2527cV02.C(true);
            LL ll2 = c2527cV02.h;
            if (ll2 != null) {
                ll2.d(c2527cV02.e);
                c2527cV02.h = null;
                c2527cV02.g = null;
            }
        }
        this.e.release();
        C7175tC c7175tC = this.r;
        if (c7175tC != null) {
            synchronized (c7175tC) {
                KB0 kb0 = (KB0) c7175tC.o.remove(this);
                if (kb0 != null) {
                    C2527cV0 c2527cV03 = kb0.a;
                    c2527cV03.C(true);
                    LL ll3 = c2527cV03.h;
                    if (ll3 != null) {
                        ll3.d(c2527cV03.e);
                        c2527cV03.h = null;
                        c2527cV03.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        if (x()) {
            return this.s;
        }
        if (this.w) {
            return Long.MIN_VALUE;
        }
        return u().h;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        return !x() && this.m.w(this.w);
    }

    public final void i(long j) {
        long j2;
        if (x()) {
            return;
        }
        C2527cV0 c2527cV0 = this.m;
        int i = c2527cV0.q;
        c2527cV0.i(j, true);
        C2527cV0 c2527cV02 = this.m;
        int i2 = c2527cV02.q;
        if (i2 > i) {
            synchronized (c2527cV02) {
                j2 = c2527cV02.p == 0 ? Long.MIN_VALUE : c2527cV02.n[c2527cV02.r];
            }
            int i3 = 0;
            while (true) {
                C2527cV0[] c2527cV0Arr = this.n;
                if (i3 >= c2527cV0Arr.length) {
                    break;
                }
                c2527cV0Arr[i3].i(j2, this.d[i3]);
                i3++;
            }
        }
        int iMin = Math.min(z(i2, 0), this.u);
        if (iMin > 0) {
            AbstractC0277Dh1.V(this.k, 0, iMin);
            this.u -= iMin;
        }
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        if (x()) {
            return 0;
        }
        C2527cV0 c2527cV0 = this.m;
        int iT = c2527cV0.t(j, this.w);
        AbstractC6502pg abstractC6502pg = this.v;
        if (abstractC6502pg != null) {
            iT = Math.min(iT, abstractC6502pg.c(0) - c2527cV0.r());
        }
        c2527cV0.G(iT);
        y();
        return iT;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) {
        if (x()) {
            return -3;
        }
        AbstractC6502pg abstractC6502pg = this.v;
        C2527cV0 c2527cV0 = this.m;
        if (abstractC6502pg != null && abstractC6502pg.c(0) <= c2527cV0.r()) {
            return -3;
        }
        y();
        return c2527cV0.B(n8, zd, i, this.w);
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.i.I();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [fY0, java.lang.Object] */
    @Override // defpackage.InterfaceC5369jk0
    public final void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        AbstractC1318Qr abstractC1318Qr = (AbstractC1318Qr) interfaceC5751lk0;
        this.p = null;
        this.v = null;
        long j3 = abstractC1318Qr.a;
        Uri uri = abstractC1318Qr.i.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.h.getClass();
        this.g.J(c4020gk0, abstractC1318Qr.c, this.a, abstractC1318Qr.d, abstractC1318Qr.e, abstractC1318Qr.f, abstractC1318Qr.g, abstractC1318Qr.h);
        if (z) {
            return;
        }
        if (x()) {
            this.m.C(false);
            for (C2527cV0 c2527cV0 : this.n) {
                c2527cV0.C(false);
            }
        } else if (abstractC1318Qr instanceof AbstractC6502pg) {
            ArrayList arrayList = this.k;
            p(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f.m(this);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fY0, java.lang.Object] */
    @Override // defpackage.InterfaceC5369jk0
    public final C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        C3829fk0 c3829fk0;
        AbstractC1318Qr abstractC1318Qr = (AbstractC1318Qr) interfaceC5751lk0;
        long j3 = abstractC1318Qr.i.b;
        boolean z = abstractC1318Qr instanceof AbstractC6502pg;
        ArrayList arrayList = this.k;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && w(size)) ? false : true;
        Uri uri = abstractC1318Qr.i.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        AbstractC0277Dh1.d0(abstractC1318Qr.g);
        AbstractC0277Dh1.d0(abstractC1318Qr.h);
        C1204Pf c1204Pf = new C1204Pf(iOException, i, 9);
        InterfaceC1786Wr interfaceC1786Wr = this.e;
        C3547eG c3547eG = this.h;
        if (!interfaceC1786Wr.f(abstractC1318Qr, z2, c1204Pf, c3547eG)) {
            c3829fk0 = null;
        } else if (z2) {
            if (z) {
                YN1.f(p(size) == abstractC1318Qr);
                if (arrayList.isEmpty()) {
                    this.s = this.t;
                }
            }
            c3829fk0 = C1857Xo1.h;
        } else {
            AbstractC6789rA1.h("Ignoring attempt to cancel non-cancelable load.");
            c3829fk0 = null;
        }
        if (c3829fk0 == null) {
            long jE = c3547eG.e(c1204Pf);
            c3829fk0 = jE != -9223372036854775807L ? new C3829fk0(0, jE, false) : C1857Xo1.i;
        }
        boolean zA = c3829fk0.a();
        C3829fk0 c3829fk02 = c3829fk0;
        this.g.O(c4020gk0, abstractC1318Qr.c, this.a, abstractC1318Qr.d, abstractC1318Qr.e, abstractC1318Qr.f, abstractC1318Qr.g, abstractC1318Qr.h, iOException, !zA);
        if (!zA) {
            this.p = null;
            c3547eG.getClass();
            this.f.m(this);
        }
        return c3829fk02;
    }

    public final AbstractC6502pg p(int i) {
        ArrayList arrayList = this.k;
        AbstractC6502pg abstractC6502pg = (AbstractC6502pg) arrayList.get(i);
        AbstractC0277Dh1.V(arrayList, i, arrayList.size());
        this.u = Math.max(this.u, arrayList.size());
        int i2 = 0;
        this.m.l(abstractC6502pg.c(0));
        while (true) {
            C2527cV0[] c2527cV0Arr = this.n;
            if (i2 >= c2527cV0Arr.length) {
                return abstractC6502pg;
            }
            C2527cV0 c2527cV0 = c2527cV0Arr[i2];
            i2++;
            c2527cV0.l(abstractC6502pg.c(i2));
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        long j;
        List listEmptyList;
        if (!this.w) {
            C1857Xo1 c1857Xo1 = this.i;
            if (!c1857Xo1.I() && !c1857Xo1.G()) {
                boolean zX = x();
                if (zX) {
                    listEmptyList = Collections.emptyList();
                    j = this.s;
                } else {
                    j = u().h;
                    listEmptyList = this.l;
                }
                this.e.c(c7660vk0, j, listEmptyList, this.j);
                C1135Oi c1135Oi = this.j;
                boolean z = c1135Oi.b;
                AbstractC1318Qr abstractC1318Qr = (AbstractC1318Qr) c1135Oi.c;
                c1135Oi.c = null;
                c1135Oi.b = false;
                if (z) {
                    this.s = -9223372036854775807L;
                    this.w = true;
                    return true;
                }
                if (abstractC1318Qr == null) {
                    return false;
                }
                this.p = abstractC1318Qr;
                boolean z2 = abstractC1318Qr instanceof AbstractC6502pg;
                VH vh = this.o;
                if (z2) {
                    AbstractC6502pg abstractC6502pg = (AbstractC6502pg) abstractC1318Qr;
                    if (zX) {
                        long j2 = this.s;
                        if (abstractC6502pg.g != j2) {
                            this.m.t = j2;
                            for (C2527cV0 c2527cV0 : this.n) {
                                c2527cV0.t = this.s;
                            }
                        }
                        this.s = -9223372036854775807L;
                    }
                    abstractC6502pg.m = vh;
                    C2527cV0[] c2527cV0Arr = (C2527cV0[]) vh.c;
                    int[] iArr = new int[c2527cV0Arr.length];
                    for (int i = 0; i < c2527cV0Arr.length; i++) {
                        C2527cV0 c2527cV02 = c2527cV0Arr[i];
                        iArr[i] = c2527cV02.q + c2527cV02.p;
                    }
                    abstractC6502pg.n = iArr;
                    this.k.add(abstractC6502pg);
                } else if (abstractC1318Qr instanceof C6401p80) {
                    ((C6401p80) abstractC1318Qr).k = vh;
                }
                this.g.S(new C4020gk0(abstractC1318Qr.a, abstractC1318Qr.b, c1857Xo1.S(abstractC1318Qr, this, this.h.d(abstractC1318Qr.c))), abstractC1318Qr.c, this.a, abstractC1318Qr.d, abstractC1318Qr.e, abstractC1318Qr.f, abstractC1318Qr.g, abstractC1318Qr.h);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.s;
        }
        long jMax = this.t;
        AbstractC6502pg abstractC6502pgU = u();
        if (!abstractC6502pgU.b()) {
            ArrayList arrayList = this.k;
            abstractC6502pgU = arrayList.size() > 1 ? (AbstractC6502pg) AbstractC8235ym.e(2, arrayList) : null;
        }
        if (abstractC6502pgU != null) {
            jMax = Math.max(jMax, abstractC6502pgU.h);
        }
        return Math.max(jMax, this.m.o());
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        C1857Xo1 c1857Xo1 = this.i;
        if (c1857Xo1.G() || x()) {
            return;
        }
        boolean zI = c1857Xo1.I();
        InterfaceC1786Wr interfaceC1786Wr = this.e;
        ArrayList arrayList = this.k;
        List list = this.l;
        if (zI) {
            AbstractC1318Qr abstractC1318Qr = this.p;
            abstractC1318Qr.getClass();
            boolean z = abstractC1318Qr instanceof AbstractC6502pg;
            if (!(z && w(arrayList.size() - 1)) && interfaceC1786Wr.e(j, abstractC1318Qr, list)) {
                c1857Xo1.p();
                if (z) {
                    this.v = (AbstractC6502pg) abstractC1318Qr;
                    return;
                }
                return;
            }
            return;
        }
        int iG = interfaceC1786Wr.g(j, list);
        if (iG < arrayList.size()) {
            YN1.f(!c1857Xo1.I());
            int size = arrayList.size();
            while (true) {
                if (iG >= size) {
                    iG = -1;
                    break;
                } else if (!w(iG)) {
                    break;
                } else {
                    iG++;
                }
            }
            if (iG == -1) {
                return;
            }
            long j2 = u().h;
            AbstractC6502pg abstractC6502pgP = p(iG);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
            this.w = false;
            this.g.h0(new C7102sp0(1, this.a, null, 3, null, AbstractC0277Dh1.d0(abstractC6502pgP.g), AbstractC0277Dh1.d0(j2)));
        }
    }

    public final AbstractC6502pg u() {
        return (AbstractC6502pg) AbstractC8235ym.e(1, this.k);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fY0, java.lang.Object] */
    @Override // defpackage.InterfaceC5369jk0
    public final void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        AbstractC1318Qr abstractC1318Qr = (AbstractC1318Qr) interfaceC5751lk0;
        this.p = null;
        this.e.d(abstractC1318Qr);
        long j3 = abstractC1318Qr.a;
        Uri uri = abstractC1318Qr.i.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        this.h.getClass();
        this.g.M(c4020gk0, abstractC1318Qr.c, this.a, abstractC1318Qr.d, abstractC1318Qr.e, abstractC1318Qr.f, abstractC1318Qr.g, abstractC1318Qr.h);
        this.f.m(this);
    }

    public final boolean w(int i) {
        int iR;
        AbstractC6502pg abstractC6502pg = (AbstractC6502pg) this.k.get(i);
        if (this.m.r() > abstractC6502pg.c(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C2527cV0[] c2527cV0Arr = this.n;
            if (i2 >= c2527cV0Arr.length) {
                return false;
            }
            iR = c2527cV0Arr[i2].r();
            i2++;
        } while (iR <= abstractC6502pg.c(i2));
        return true;
    }

    public final boolean x() {
        return this.s != -9223372036854775807L;
    }

    public final void y() {
        int iZ = z(this.m.r(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > iZ) {
                return;
            }
            this.u = i + 1;
            AbstractC6502pg abstractC6502pg = (AbstractC6502pg) this.k.get(i);
            C6666qX c6666qX = abstractC6502pg.d;
            if (!c6666qX.equals(this.q)) {
                this.g.x(this.a, c6666qX, abstractC6502pg.e, abstractC6502pg.f, abstractC6502pg.g);
            }
            this.q = c6666qX;
        }
    }

    public final int z(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC6502pg) arrayList.get(i2)).c(0) <= i);
        return i2 - 1;
    }
}
