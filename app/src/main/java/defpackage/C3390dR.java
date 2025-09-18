package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dR */
/* loaded from: classes.dex */
public final class C3390dR implements Handler.Callback, InterfaceC8245yp0, OB0 {
    public static final long T = AbstractC0277Dh1.d0(10000);
    public boolean B;
    public boolean C;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public C2514cR L;
    public long M;
    public long N;
    public int O;
    public boolean P;
    public IQ Q;
    public LQ S;
    public final AbstractC0038Ag[] a;
    public final Set b;
    public final AbstractC0038Ag[] c;
    public final AbstractC6715qn0 d;
    public final C2359bc1 e;
    public final C3357dG f;
    public final InterfaceC0191Cf g;
    public final R71 h;
    public final HandlerThread i;
    public final Looper j;
    public final C0100Ba1 k;
    public final C0022Aa1 l;
    public final long m;
    public final C4120hG n;
    public final ArrayList o;
    public final M71 p;
    public final QQ q;
    public final C0222Cp0 r;
    public final C1547Tp0 s;
    public final C2291bG t;
    public final long u;
    public final NB0 v;
    public DX0 w;
    public BB0 x;
    public C2133aR y;
    public boolean z;
    public boolean A = false;
    public long R = -9223372036854775807L;
    public long D = -9223372036854775807L;

    public C3390dR(AbstractC0038Ag[] abstractC0038AgArr, AbstractC6715qn0 abstractC6715qn0, C2359bc1 c2359bc1, C3357dG c3357dG, InterfaceC0191Cf interfaceC0191Cf, int i, boolean z, C8323zE c8323zE, DX0 dx0, C2291bG c2291bG, long j, Looper looper, M71 m71, QQ qq, NB0 nb0, LQ lq) {
        this.q = qq;
        this.a = abstractC0038AgArr;
        this.d = abstractC6715qn0;
        this.e = c2359bc1;
        this.f = c3357dG;
        this.g = interfaceC0191Cf;
        this.F = i;
        this.G = z;
        this.w = dx0;
        this.t = c2291bG;
        this.u = j;
        this.p = m71;
        this.v = nb0;
        this.S = lq;
        this.m = c3357dG.h;
        C8391za1 c8391za1 = AbstractC0178Ca1.a;
        BB0 bb0I = BB0.i(c2359bc1);
        this.x = bb0I;
        this.y = new C2133aR(bb0I);
        this.c = new AbstractC0038Ag[abstractC0038AgArr.length];
        C2103aH c2103aH = (C2103aH) abstractC6715qn0;
        c2103aH.getClass();
        for (int i2 = 0; i2 < abstractC0038AgArr.length; i2++) {
            AbstractC0038Ag abstractC0038Ag = abstractC0038AgArr[i2];
            abstractC0038Ag.e = i2;
            abstractC0038Ag.f = nb0;
            abstractC0038Ag.g = m71;
            this.c[i2] = abstractC0038Ag;
            AbstractC0038Ag abstractC0038Ag2 = this.c[i2];
            synchronized (abstractC0038Ag2.a) {
                abstractC0038Ag2.q = c2103aH;
            }
        }
        this.n = new C4120hG(this, m71);
        this.o = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.k = new C0100Ba1();
        this.l = new C0022Aa1();
        abstractC6715qn0.a = this;
        abstractC6715qn0.b = interfaceC0191Cf;
        this.P = true;
        R71 r71A = m71.a(looper, null);
        this.r = new C0222Cp0(c8323zE, r71A, new EE(11, this), lq);
        this.s = new C1547Tp0(this, c8323zE, r71A, nb0);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.j = looper2;
        this.h = m71.a(looper2, this);
    }

    public static Pair G(AbstractC0178Ca1 abstractC0178Ca1, C2514cR c2514cR, boolean z, int i, boolean z2, C0100Ba1 c0100Ba1, C0022Aa1 c0022Aa1) {
        Pair pairI;
        int iH;
        AbstractC0178Ca1 abstractC0178Ca12 = c2514cR.a;
        if (abstractC0178Ca1.p()) {
            return null;
        }
        AbstractC0178Ca1 abstractC0178Ca13 = abstractC0178Ca12.p() ? abstractC0178Ca1 : abstractC0178Ca12;
        try {
            pairI = abstractC0178Ca13.i(c0100Ba1, c0022Aa1, c2514cR.b, c2514cR.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC0178Ca1.equals(abstractC0178Ca13)) {
            return pairI;
        }
        if (abstractC0178Ca1.b(pairI.first) != -1) {
            return (abstractC0178Ca13.g(pairI.first, c0022Aa1).f && abstractC0178Ca13.m(c0022Aa1.c, c0100Ba1, 0L).n == abstractC0178Ca13.b(pairI.first)) ? abstractC0178Ca1.i(c0100Ba1, c0022Aa1, abstractC0178Ca1.g(pairI.first, c0022Aa1).c, c2514cR.c) : pairI;
        }
        if (z && (iH = H(c0100Ba1, c0022Aa1, i, z2, pairI.first, abstractC0178Ca13, abstractC0178Ca1)) != -1) {
            return abstractC0178Ca1.i(c0100Ba1, c0022Aa1, iH, -9223372036854775807L);
        }
        return null;
    }

    public static int H(C0100Ba1 c0100Ba1, C0022Aa1 c0022Aa1, int i, boolean z, Object obj, AbstractC0178Ca1 abstractC0178Ca1, AbstractC0178Ca1 abstractC0178Ca12) {
        Object obj2 = abstractC0178Ca1.m(abstractC0178Ca1.g(obj, c0022Aa1).c, c0100Ba1, 0L).a;
        for (int i2 = 0; i2 < abstractC0178Ca12.o(); i2++) {
            if (abstractC0178Ca12.m(i2, c0100Ba1, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = abstractC0178Ca1.b(obj);
        int iH = abstractC0178Ca1.h();
        int iD = iB;
        int iB2 = -1;
        for (int i3 = 0; i3 < iH && iB2 == -1; i3++) {
            iD = abstractC0178Ca1.d(iD, c0022Aa1, c0100Ba1, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = abstractC0178Ca12.b(abstractC0178Ca1.l(iD));
        }
        if (iB2 == -1) {
            return -1;
        }
        return abstractC0178Ca12.f(iB2, c0022Aa1, false).c;
    }

    public static void O(AbstractC0038Ag abstractC0038Ag, long j) {
        abstractC0038Ag.n = true;
        if (abstractC0038Ag instanceof G91) {
            G91 g91 = (G91) abstractC0038Ag;
            YN1.f(g91.n);
            g91.K = j;
        }
    }

    public static boolean q(AbstractC0038Ag abstractC0038Ag) {
        return abstractC0038Ag.h != 0;
    }

    public final void A(int i, int i2, C8280z01 c8280z01) throws Throwable {
        this.y.f(1);
        C1547Tp0 c1547Tp0 = this.s;
        c1547Tp0.getClass();
        YN1.c(i >= 0 && i <= i2 && i2 <= ((ArrayList) c1547Tp0.c).size());
        c1547Tp0.k = c8280z01;
        c1547Tp0.i(i, i2);
        k(c1547Tp0.c(), false);
    }

    public final void B() throws IQ {
        float f = this.n.e().a;
        C0222Cp0 c0222Cp0 = this.r;
        C0066Ap0 c0066Ap0 = c0222Cp0.i;
        C0066Ap0 c0066Ap02 = c0222Cp0.j;
        C2359bc1 c2359bc1 = null;
        C0066Ap0 c0066Ap03 = c0066Ap0;
        boolean z = true;
        while (c0066Ap03 != null && c0066Ap03.d) {
            C2359bc1 c2359bc1H = c0066Ap03.h(f, this.x.a);
            C2359bc1 c2359bc12 = c0066Ap03 == this.r.i ? c2359bc1H : c2359bc1;
            C2359bc1 c2359bc13 = c0066Ap03.n;
            if (c2359bc13 != null) {
                int length = ((InterfaceC5311jR[]) c2359bc13.c).length;
                InterfaceC5311jR[] interfaceC5311jRArr = (InterfaceC5311jR[]) c2359bc1H.c;
                if (length == interfaceC5311jRArr.length) {
                    for (int i = 0; i < interfaceC5311jRArr.length; i++) {
                        if (c2359bc1H.f(c2359bc13, i)) {
                        }
                    }
                    if (c0066Ap03 == c0066Ap02) {
                        z = false;
                    }
                    c0066Ap03 = c0066Ap03.l;
                    c2359bc1 = c2359bc12;
                }
            }
            if (z) {
                C0222Cp0 c0222Cp02 = this.r;
                C0066Ap0 c0066Ap04 = c0222Cp02.i;
                boolean zK = c0222Cp02.k(c0066Ap04);
                boolean[] zArr = new boolean[this.a.length];
                c2359bc12.getClass();
                long jA = c0066Ap04.a(c2359bc12, this.x.s, zK, zArr);
                BB0 bb0 = this.x;
                boolean z2 = (bb0.e == 4 || jA == bb0.s) ? false : true;
                BB0 bb02 = this.x;
                this.x = o(bb02.b, jA, bb02.c, bb02.d, z2, 5);
                if (z2) {
                    E(jA);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i2 = 0;
                while (true) {
                    AbstractC0038Ag[] abstractC0038AgArr = this.a;
                    if (i2 >= abstractC0038AgArr.length) {
                        break;
                    }
                    AbstractC0038Ag abstractC0038Ag = abstractC0038AgArr[i2];
                    boolean zQ = q(abstractC0038Ag);
                    zArr2[i2] = zQ;
                    InterfaceC3403dV0 interfaceC3403dV0 = c0066Ap04.c[i2];
                    if (zQ) {
                        if (interfaceC3403dV0 != abstractC0038Ag.i) {
                            c(abstractC0038Ag);
                        } else if (zArr[i2]) {
                            long j = this.M;
                            abstractC0038Ag.n = false;
                            abstractC0038Ag.l = j;
                            abstractC0038Ag.m = j;
                            abstractC0038Ag.o(j, false);
                        }
                    }
                    i2++;
                }
                e(zArr2, this.M);
            } else {
                this.r.k(c0066Ap03);
                if (c0066Ap03.d) {
                    c0066Ap03.a(c2359bc1H, Math.max(c0066Ap03.f.b, this.M - c0066Ap03.o), false, new boolean[c0066Ap03.i.length]);
                }
            }
            j(true);
            if (this.x.e != 4) {
                s();
                h0();
                this.h.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00bf A[PHI: r5 r6 r8
  0x00bf: PHI (r5v4 Fp0) = (r5v3 Fp0), (r5v12 Fp0) binds: [B:145:0x0093, B:147:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r6v2 long) = (r6v1 long), (r6v24 long) binds: [B:145:0x0093, B:147:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:145:0x0093, B:147:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3390dR.C(boolean, boolean, boolean, boolean):void");
    }

    public final void D() {
        C0066Ap0 c0066Ap0 = this.r.i;
        this.B = c0066Ap0 != null && c0066Ap0.f.h && this.A;
    }

    public final void E(long j) {
        C0066Ap0 c0066Ap0 = this.r.i;
        long j2 = j + (c0066Ap0 == null ? 1000000000000L : c0066Ap0.o);
        this.M = j2;
        this.n.a.d(j2);
        for (AbstractC0038Ag abstractC0038Ag : this.a) {
            if (q(abstractC0038Ag)) {
                long j3 = this.M;
                abstractC0038Ag.n = false;
                abstractC0038Ag.l = j3;
                abstractC0038Ag.m = j3;
                abstractC0038Ag.o(j3, false);
            }
        }
        for (C0066Ap0 c0066Ap02 = r0.i; c0066Ap02 != null; c0066Ap02 = c0066Ap02.l) {
            for (InterfaceC5311jR interfaceC5311jR : (InterfaceC5311jR[]) c0066Ap02.n.c) {
                if (interfaceC5311jR != null) {
                    interfaceC5311jR.r();
                }
            }
        }
    }

    public final void F(AbstractC0178Ca1 abstractC0178Ca1, AbstractC0178Ca1 abstractC0178Ca12) {
        if (abstractC0178Ca1.p() && abstractC0178Ca12.p()) {
            return;
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC1705Vq.p(arrayList.get(size));
            throw null;
        }
    }

    public final void I(long j) {
        this.h.a.sendEmptyMessageAtTime(2, j + ((this.x.e != 3 || Z()) ? T : 1000L));
    }

    public final void J(boolean z) throws IQ {
        C0456Fp0 c0456Fp0 = this.r.i.f.a;
        long jL = L(c0456Fp0, this.x.s, true, false);
        if (jL != this.x.s) {
            BB0 bb0 = this.x;
            this.x = o(c0456Fp0, jL, bb0.c, bb0.d, z, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, zp0] */
    public final void K(C2514cR c2514cR) throws Throwable {
        long j;
        long j2;
        boolean z;
        C0456Fp0 c0456Fp0;
        long j3;
        long j4;
        long j5;
        BB0 bb0;
        int i;
        this.y.f(1);
        Pair pairG = G(this.x.a, c2514cR, true, this.F, this.G, this.k, this.l);
        if (pairG == null) {
            Pair pairG2 = g(this.x.a);
            c0456Fp0 = (C0456Fp0) pairG2.first;
            long jLongValue = ((Long) pairG2.second).longValue();
            z = !this.x.a.p();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairG.first;
            long jLongValue2 = ((Long) pairG.second).longValue();
            long j6 = c2514cR.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            C0456Fp0 c0456Fp0M = this.r.m(this.x.a, obj, jLongValue2);
            if (c0456Fp0M.b()) {
                this.x.a.g(c0456Fp0M.a, this.l);
                if (this.l.e(c0456Fp0M.b) == c0456Fp0M.c) {
                    this.l.g.getClass();
                }
                j = 0;
                j2 = j6;
                c0456Fp0 = c0456Fp0M;
                z = true;
            } else {
                j = jLongValue2;
                j2 = j6;
                z = c2514cR.c == -9223372036854775807L;
                c0456Fp0 = c0456Fp0M;
            }
        }
        try {
            if (this.x.a.p()) {
                this.L = c2514cR;
            } else {
                if (pairG != null) {
                    if (c0456Fp0.equals(this.x.b)) {
                        C0066Ap0 c0066Ap0 = this.r.i;
                        long jB = (c0066Ap0 == null || !c0066Ap0.d || j == 0) ? j : c0066Ap0.a.b(j, this.w);
                        if (AbstractC0277Dh1.d0(jB) == AbstractC0277Dh1.d0(this.x.s) && ((i = (bb0 = this.x).e) == 2 || i == 3)) {
                            long j7 = bb0.s;
                            this.x = o(c0456Fp0, j7, j2, j7, z, 2);
                            return;
                        }
                        j4 = jB;
                    } else {
                        j4 = j;
                    }
                    boolean z2 = this.x.e == 4;
                    C0222Cp0 c0222Cp0 = this.r;
                    long jL = L(c0456Fp0, j4, c0222Cp0.i != c0222Cp0.j, z2);
                    z |= j != jL;
                    try {
                        BB0 bb02 = this.x;
                        AbstractC0178Ca1 abstractC0178Ca1 = bb02.a;
                        i0(abstractC0178Ca1, c0456Fp0, abstractC0178Ca1, bb02.b, j2, true);
                        j5 = jL;
                        this.x = o(c0456Fp0, j5, j2, j5, z, 2);
                    } catch (Throwable th) {
                        th = th;
                        j3 = jL;
                        this.x = o(c0456Fp0, j3, j2, j3, z, 2);
                        throw th;
                    }
                }
                if (this.x.e != 1) {
                    Y(4);
                }
                C(false, true, false, true);
            }
            j5 = j;
            this.x = o(c0456Fp0, j5, j2, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, zp0] */
    public final long L(C0456Fp0 c0456Fp0, long j, boolean z, boolean z2) throws IQ {
        d0();
        j0(false, true);
        if (z2 || this.x.e == 3) {
            Y(2);
        }
        C0222Cp0 c0222Cp0 = this.r;
        C0066Ap0 c0066Ap0 = c0222Cp0.i;
        C0066Ap0 c0066Ap02 = c0066Ap0;
        while (c0066Ap02 != null && !c0456Fp0.equals(c0066Ap02.f.a)) {
            c0066Ap02 = c0066Ap02.l;
        }
        if (z || c0066Ap0 != c0066Ap02 || (c0066Ap02 != null && c0066Ap02.o + j < 0)) {
            AbstractC0038Ag[] abstractC0038AgArr = this.a;
            for (AbstractC0038Ag abstractC0038Ag : abstractC0038AgArr) {
                c(abstractC0038Ag);
            }
            if (c0066Ap02 != null) {
                while (c0222Cp0.i != c0066Ap02) {
                    c0222Cp0.a();
                }
                c0222Cp0.k(c0066Ap02);
                c0066Ap02.o = 1000000000000L;
                e(new boolean[abstractC0038AgArr.length], c0222Cp0.j.e());
            }
        }
        if (c0066Ap02 != null) {
            c0222Cp0.k(c0066Ap02);
            if (!c0066Ap02.d) {
                c0066Ap02.f = c0066Ap02.f.b(j);
            } else if (c0066Ap02.e) {
                ?? r9 = c0066Ap02.a;
                j = r9.h(j);
                r9.i(j - this.m);
            }
            E(j);
            s();
        } else {
            c0222Cp0.b();
            E(j);
        }
        j(false);
        this.h.e(2);
        return j;
    }

    public final void M(QB0 qb0) {
        Looper looper = qb0.f;
        Looper looper2 = this.j;
        R71 r71 = this.h;
        if (looper != looper2) {
            r71.a(15, qb0).b();
            return;
        }
        synchronized (qb0) {
        }
        try {
            qb0.a.d(qb0.d, qb0.e);
            qb0.b(true);
            int i = this.x.e;
            if (i == 3 || i == 2) {
                r71.e(2);
            }
        } catch (Throwable th) {
            qb0.b(true);
            throw th;
        }
    }

    public final void N(QB0 qb0) {
        Looper looper = qb0.f;
        if (looper.getThread().isAlive()) {
            this.p.a(looper, null).c(new RQ(this, 1, qb0));
        } else {
            AbstractC6789rA1.h("Trying to send message on a dead thread.");
            qb0.b(false);
        }
    }

    public final void P(AtomicBoolean atomicBoolean, boolean z) {
        if (this.H != z) {
            this.H = z;
            if (!z) {
                for (AbstractC0038Ag abstractC0038Ag : this.a) {
                    if (!q(abstractC0038Ag) && this.b.remove(abstractC0038Ag)) {
                        abstractC0038Ag.x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(ZQ zq) throws Throwable {
        this.y.f(1);
        int i = zq.c;
        ArrayList arrayList = zq.a;
        C8280z01 c8280z01 = zq.b;
        if (i != -1) {
            this.L = new C2514cR(new SB0(arrayList, c8280z01), zq.c, zq.d);
        }
        C1547Tp0 c1547Tp0 = this.s;
        ArrayList arrayList2 = (ArrayList) c1547Tp0.c;
        c1547Tp0.i(0, arrayList2.size());
        k(c1547Tp0.a(arrayList2.size(), arrayList, c8280z01), false);
    }

    public final void R(boolean z) throws IQ {
        this.A = z;
        D();
        if (this.B) {
            C0222Cp0 c0222Cp0 = this.r;
            if (c0222Cp0.j != c0222Cp0.i) {
                J(true);
                j(false);
            }
        }
    }

    public final void S(int i, int i2, boolean z, boolean z2) {
        this.y.f(z2 ? 1 : 0);
        this.x = this.x.d(i2, i, z);
        j0(false, false);
        for (C0066Ap0 c0066Ap0 = this.r.i; c0066Ap0 != null; c0066Ap0 = c0066Ap0.l) {
            for (InterfaceC5311jR interfaceC5311jR : (InterfaceC5311jR[]) c0066Ap0.n.c) {
                if (interfaceC5311jR != null) {
                    interfaceC5311jR.h(z);
                }
            }
        }
        if (!Z()) {
            d0();
            h0();
            return;
        }
        int i3 = this.x.e;
        R71 r71 = this.h;
        if (i3 != 3) {
            if (i3 == 2) {
                r71.e(2);
            }
        } else {
            C4120hG c4120hG = this.n;
            c4120hG.f = true;
            c4120hG.a.f();
            b0();
            r71.e(2);
        }
    }

    public final void T(CB0 cb0) {
        this.h.d(16);
        C4120hG c4120hG = this.n;
        c4120hG.a(cb0);
        CB0 cb0E = c4120hG.e();
        n(cb0E, cb0E.a, true, true);
    }

    public final void U(LQ lq) {
        this.S = lq;
        AbstractC0178Ca1 abstractC0178Ca1 = this.x.a;
        C0222Cp0 c0222Cp0 = this.r;
        c0222Cp0.getClass();
        lq.getClass();
        if (c0222Cp0.o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0222Cp0.o.size(); i++) {
            ((C0066Ap0) c0222Cp0.o.get(i)).g();
        }
        c0222Cp0.o = arrayList;
    }

    public final void V(int i) throws IQ {
        this.F = i;
        AbstractC0178Ca1 abstractC0178Ca1 = this.x.a;
        C0222Cp0 c0222Cp0 = this.r;
        c0222Cp0.g = i;
        if (!c0222Cp0.o(abstractC0178Ca1)) {
            J(true);
        }
        j(false);
    }

    public final void W(boolean z) throws IQ {
        this.G = z;
        AbstractC0178Ca1 abstractC0178Ca1 = this.x.a;
        C0222Cp0 c0222Cp0 = this.r;
        c0222Cp0.h = z;
        if (!c0222Cp0.o(abstractC0178Ca1)) {
            J(true);
        }
        j(false);
    }

    public final void X(C8280z01 c8280z01) throws Throwable {
        this.y.f(1);
        C1547Tp0 c1547Tp0 = this.s;
        int size = ((ArrayList) c1547Tp0.c).size();
        if (c8280z01.b.length != size) {
            c8280z01 = new C8280z01(new Random(c8280z01.a.nextLong())).a(size);
        }
        c1547Tp0.k = c8280z01;
        k(c1547Tp0.c(), false);
    }

    public final void Y(int i) {
        BB0 bb0 = this.x;
        if (bb0.e != i) {
            if (i != 2) {
                this.R = -9223372036854775807L;
            }
            this.x = bb0.g(i);
        }
    }

    public final boolean Z() {
        BB0 bb0 = this.x;
        return bb0.l && bb0.n == 0;
    }

    @Override // defpackage.InterfaceC8245yp0
    public final void a(InterfaceC8435zp0 interfaceC8435zp0) {
        this.h.a(8, interfaceC8435zp0).b();
    }

    public final boolean a0(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0) {
        if (c0456Fp0.b() || abstractC0178Ca1.p()) {
            return false;
        }
        int i = abstractC0178Ca1.g(c0456Fp0.a, this.l).c;
        C0100Ba1 c0100Ba1 = this.k;
        abstractC0178Ca1.n(i, c0100Ba1);
        return c0100Ba1.a() && c0100Ba1.i && c0100Ba1.f != -9223372036854775807L;
    }

    public final void b(ZQ zq, int i) throws Throwable {
        this.y.f(1);
        C1547Tp0 c1547Tp0 = this.s;
        if (i == -1) {
            i = ((ArrayList) c1547Tp0.c).size();
        }
        k(c1547Tp0.a(i, zq.a, zq.b), false);
    }

    public final void b0() {
        C0066Ap0 c0066Ap0 = this.r.i;
        if (c0066Ap0 == null) {
            return;
        }
        C2359bc1 c2359bc1 = c0066Ap0.n;
        int i = 0;
        while (true) {
            AbstractC0038Ag[] abstractC0038AgArr = this.a;
            if (i >= abstractC0038AgArr.length) {
                return;
            }
            if (c2359bc1.g(i)) {
                AbstractC0038Ag abstractC0038Ag = abstractC0038AgArr[i];
                int i2 = abstractC0038Ag.h;
                if (i2 == 1) {
                    YN1.f(i2 == 1);
                    abstractC0038Ag.h = 2;
                    abstractC0038Ag.r();
                }
            }
            i++;
        }
    }

    public final void c(AbstractC0038Ag abstractC0038Ag) {
        if (q(abstractC0038Ag)) {
            C4120hG c4120hG = this.n;
            if (abstractC0038Ag == c4120hG.c) {
                c4120hG.d = null;
                c4120hG.c = null;
                c4120hG.e = true;
            }
            int i = abstractC0038Ag.h;
            if (i == 2) {
                YN1.f(i == 2);
                abstractC0038Ag.h = 1;
                abstractC0038Ag.s();
            }
            YN1.f(abstractC0038Ag.h == 1);
            abstractC0038Ag.c.f();
            abstractC0038Ag.h = 0;
            abstractC0038Ag.i = null;
            abstractC0038Ag.j = null;
            abstractC0038Ag.n = false;
            abstractC0038Ag.m();
            this.K--;
        }
    }

    public final void c0(boolean z, boolean z2) {
        C(z || !this.H, false, true, false);
        this.y.f(z2 ? 1 : 0);
        C3357dG c3357dG = this.f;
        if (c3357dG.i.remove(this.v) != null) {
            c3357dG.d();
        }
        Y(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:547:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:923:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:939:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:952:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:962:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:983:0x0363 A[EDGE_INSN: B:983:0x0363->B:720:0x0363 BREAK  A[LOOP:0: B:686:0x02e5->B:719:0x0360], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v65, types: [bc1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, zp0] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, zp0] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, zp0] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, zp0] */
    /* JADX WARN: Type inference failed for: r3v76, types: [gY0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v84, types: [jR[]] */
    /* JADX WARN: Type inference failed for: r4v85, types: [jR] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws defpackage.IQ {
        /*
            Method dump skipped, instructions count: 1899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3390dR.d():void");
    }

    public final void d0() {
        int i;
        C4120hG c4120hG = this.n;
        c4120hG.f = false;
        C4277i41 c4277i41 = c4120hG.a;
        if (c4277i41.c) {
            c4277i41.d(c4277i41.b());
            c4277i41.c = false;
        }
        for (AbstractC0038Ag abstractC0038Ag : this.a) {
            if (q(abstractC0038Ag) && (i = abstractC0038Ag.h) == 2) {
                YN1.f(i == 2);
                abstractC0038Ag.h = 1;
                abstractC0038Ag.s();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean[] r24, long r25) throws defpackage.IQ {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3390dR.e(boolean[], long):void");
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [gY0, java.lang.Object] */
    public final void e0() {
        C0066Ap0 c0066Ap0 = this.r.k;
        boolean z = this.E || (c0066Ap0 != null && c0066Ap0.a.l());
        BB0 bb0 = this.x;
        if (z != bb0.g) {
            this.x = new BB0(bb0.a, bb0.b, bb0.c, bb0.d, bb0.e, bb0.f, z, bb0.h, bb0.i, bb0.j, bb0.k, bb0.l, bb0.m, bb0.n, bb0.o, bb0.q, bb0.r, bb0.s, bb0.t, bb0.p);
        }
    }

    public final long f(AbstractC0178Ca1 abstractC0178Ca1, Object obj, long j) {
        C0022Aa1 c0022Aa1 = this.l;
        int i = abstractC0178Ca1.g(obj, c0022Aa1).c;
        C0100Ba1 c0100Ba1 = this.k;
        abstractC0178Ca1.n(i, c0100Ba1);
        if (c0100Ba1.f != -9223372036854775807L && c0100Ba1.a() && c0100Ba1.i) {
            return AbstractC0277Dh1.Q(AbstractC0277Dh1.z(c0100Ba1.g) - c0100Ba1.f) - (j + c0022Aa1.e);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f0(C2359bc1 c2359bc1) {
        AbstractC0178Ca1 abstractC0178Ca1 = this.x.a;
        InterfaceC5311jR[] interfaceC5311jRArr = (InterfaceC5311jR[]) c2359bc1.c;
        C3357dG c3357dG = this.f;
        C2481cG c2481cG = (C2481cG) c3357dG.i.get(this.v);
        c2481cG.getClass();
        int iMax = c3357dG.f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                AbstractC0038Ag[] abstractC0038AgArr = this.a;
                int i3 = 13107200;
                if (i < abstractC0038AgArr.length) {
                    if (interfaceC5311jRArr[i] != null) {
                        switch (abstractC0038AgArr[i].b) {
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        c2481cG.b = iMax;
        c3357dG.d();
    }

    public final Pair g(AbstractC0178Ca1 abstractC0178Ca1) {
        long j = 0;
        if (abstractC0178Ca1.p()) {
            return Pair.create(BB0.u, 0L);
        }
        Pair pairI = abstractC0178Ca1.i(this.k, this.l, abstractC0178Ca1.a(this.G), -9223372036854775807L);
        C0456Fp0 c0456Fp0M = this.r.m(abstractC0178Ca1, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (c0456Fp0M.b()) {
            Object obj = c0456Fp0M.a;
            C0022Aa1 c0022Aa1 = this.l;
            abstractC0178Ca1.g(obj, c0022Aa1);
            if (c0456Fp0M.c == c0022Aa1.e(c0456Fp0M.b)) {
                c0022Aa1.g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(c0456Fp0M, Long.valueOf(j));
    }

    public final void g0(int i, int i2, List list) throws Throwable {
        this.y.f(1);
        C1547Tp0 c1547Tp0 = this.s;
        c1547Tp0.getClass();
        ArrayList arrayList = (ArrayList) c1547Tp0.c;
        YN1.c(i >= 0 && i <= i2 && i2 <= arrayList.size());
        YN1.c(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C1469Sp0) arrayList.get(i3)).a.t((C6721qp0) list.get(i3 - i));
        }
        k(c1547Tp0.c(), false);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [gY0, java.lang.Object] */
    public final void h(InterfaceC8435zp0 interfaceC8435zp0) {
        C0066Ap0 c0066Ap0 = this.r.k;
        if (c0066Ap0 == null || c0066Ap0.a != interfaceC8435zp0) {
            return;
        }
        long j = this.M;
        if (c0066Ap0 != null) {
            YN1.f(c0066Ap0.l == null);
            if (c0066Ap0.d) {
                c0066Ap0.a.t(j - c0066Ap0.o);
            }
        }
        s();
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00cb  */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, zp0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3390dR.h0():void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        boolean z;
        C0066Ap0 c0066Ap0;
        int i2;
        C0066Ap0 c0066Ap02;
        try {
            switch (message.what) {
                case 1:
                    boolean z2 = message.arg1 != 0;
                    int i3 = message.arg2;
                    S(i3 >> 4, i3 & 15, z2, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    K((C2514cR) message.obj);
                    break;
                case 4:
                    T((CB0) message.obj);
                    break;
                case 5:
                    this.w = (DX0) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    l((InterfaceC8435zp0) message.obj);
                    break;
                case 9:
                    h((InterfaceC8435zp0) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    W(message.arg1 != 0);
                    break;
                case 13:
                    P((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case 14:
                    QB0 qb0 = (QB0) message.obj;
                    qb0.getClass();
                    M(qb0);
                    break;
                case 15:
                    N((QB0) message.obj);
                    break;
                case 16:
                    CB0 cb0 = (CB0) message.obj;
                    n(cb0, cb0.a, true, false);
                    break;
                case 17:
                    Q((ZQ) message.obj);
                    break;
                case 18:
                    b((ZQ) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC1705Vq.p(message.obj);
                    v();
                    throw null;
                case 20:
                    A(message.arg1, message.arg2, (C8280z01) message.obj);
                    break;
                case 21:
                    X((C8280z01) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    R(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    B();
                    J(true);
                    break;
                case 26:
                    B();
                    J(true);
                    break;
                case 27:
                    g0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    U((LQ) message.obj);
                    break;
                case 29:
                    w();
                    break;
            }
        } catch (IQ e) {
            IQ iq = e;
            int i4 = iq.c;
            C0222Cp0 c0222Cp0 = this.r;
            if (i4 == 1 && (c0066Ap02 = c0222Cp0.j) != null) {
                iq = new IQ(iq.getMessage(), iq.getCause(), iq.a, iq.c, iq.d, iq.e, iq.f, iq.g, c0066Ap02.f.a, iq.b, iq.i);
            }
            if (iq.i && (this.Q == null || (i2 = iq.a) == 5004 || i2 == 5003)) {
                AbstractC6789rA1.i("Recoverable renderer error", iq);
                IQ iq2 = this.Q;
                if (iq2 != null) {
                    iq2.addSuppressed(iq);
                    iq = this.Q;
                } else {
                    this.Q = iq;
                }
                R71 r71 = this.h;
                Q71 q71A = r71.a(25, iq);
                r71.getClass();
                Message message2 = q71A.a;
                message2.getClass();
                r71.a.sendMessageAtFrontOfQueue(message2);
                q71A.a();
                z = true;
            } else {
                IQ iq3 = this.Q;
                if (iq3 != null) {
                    iq3.addSuppressed(iq);
                    iq = this.Q;
                }
                IQ iq4 = iq;
                AbstractC6789rA1.e("Playback error", iq4);
                if (iq4.c == 1) {
                    if (c0222Cp0.i != c0222Cp0.j) {
                        while (true) {
                            c0066Ap0 = c0222Cp0.i;
                            if (c0066Ap0 == c0222Cp0.j) {
                                break;
                            }
                            c0222Cp0.a();
                        }
                        c0066Ap0.getClass();
                        t();
                        C0144Bp0 c0144Bp0 = c0066Ap0.f;
                        C0456Fp0 c0456Fp0 = c0144Bp0.a;
                        long j = c0144Bp0.b;
                        this.x = o(c0456Fp0, j, c0144Bp0.c, j, true, 0);
                    }
                    z = true;
                } else {
                    z = true;
                }
                c0(z, false);
                this.x = this.x.e(iq4);
            }
        } catch (KL e2) {
            i(e2.a, e2);
        } catch (C2091aD e3) {
            i(e3.a, e3);
        } catch (C2562ch e4) {
            i(1002, e4);
        } catch (RuntimeException e5) {
            IQ iq5 = new IQ(2, e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            AbstractC6789rA1.e("Playback error", iq5);
            c0(true, false);
            this.x = this.x.e(iq5);
        } catch (C5643lA0 e6) {
            boolean z3 = e6.a;
            int i5 = e6.b;
            if (i5 == 1) {
                i = z3 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i = z3 ? 3002 : 3004;
                }
                i(i, e6);
            }
            i = i;
            i(i, e6);
        } catch (IOException e7) {
            i(2000, e7);
        }
        z = true;
        t();
        return z;
    }

    public final void i(int i, IOException iOException) {
        IQ iq = new IQ(0, iOException, i);
        C0066Ap0 c0066Ap0 = this.r.i;
        if (c0066Ap0 != null) {
            C0144Bp0 c0144Bp0 = c0066Ap0.f;
            iq = new IQ(iq.getMessage(), iq.getCause(), iq.a, iq.c, iq.d, iq.e, iq.f, iq.g, c0144Bp0.a, iq.b, iq.i);
        }
        AbstractC6789rA1.e("Playback error", iq);
        c0(false, false);
        this.x = this.x.e(iq);
    }

    public final void i0(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0, AbstractC0178Ca1 abstractC0178Ca12, C0456Fp0 c0456Fp02, long j, boolean z) {
        if (!a0(abstractC0178Ca1, c0456Fp0)) {
            CB0 cb0 = c0456Fp0.b() ? CB0.d : this.x.o;
            C4120hG c4120hG = this.n;
            if (c4120hG.e().equals(cb0)) {
                return;
            }
            this.h.d(16);
            c4120hG.a(cb0);
            n(this.x.o, cb0.a, false, false);
            return;
        }
        Object obj = c0456Fp0.a;
        C0022Aa1 c0022Aa1 = this.l;
        int i = abstractC0178Ca1.g(obj, c0022Aa1).c;
        C0100Ba1 c0100Ba1 = this.k;
        abstractC0178Ca1.n(i, c0100Ba1);
        C5766lp0 c5766lp0 = c0100Ba1.j;
        C2291bG c2291bG = this.t;
        c2291bG.getClass();
        c2291bG.d = AbstractC0277Dh1.Q(c5766lp0.a);
        c2291bG.g = AbstractC0277Dh1.Q(c5766lp0.b);
        c2291bG.h = AbstractC0277Dh1.Q(c5766lp0.c);
        float f = c5766lp0.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c2291bG.k = f;
        float f2 = c5766lp0.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        c2291bG.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            c2291bG.d = -9223372036854775807L;
        }
        c2291bG.a();
        if (j != -9223372036854775807L) {
            c2291bG.e = f(abstractC0178Ca1, obj, j);
            c2291bG.a();
            return;
        }
        if (!AbstractC0277Dh1.a(!abstractC0178Ca12.p() ? abstractC0178Ca12.m(abstractC0178Ca12.g(c0456Fp02.a, c0022Aa1).c, c0100Ba1, 0L).a : null, c0100Ba1.a) || z) {
            c2291bG.e = -9223372036854775807L;
            c2291bG.a();
        }
    }

    public final void j(boolean z) {
        C0066Ap0 c0066Ap0 = this.r.k;
        C0456Fp0 c0456Fp0 = c0066Ap0 == null ? this.x.b : c0066Ap0.f.a;
        boolean zEquals = this.x.k.equals(c0456Fp0);
        if (!zEquals) {
            this.x = this.x.b(c0456Fp0);
        }
        BB0 bb0 = this.x;
        bb0.q = c0066Ap0 == null ? bb0.s : c0066Ap0.d();
        BB0 bb02 = this.x;
        long j = bb02.q;
        C0066Ap0 c0066Ap02 = this.r.k;
        bb02.r = c0066Ap02 != null ? Math.max(0L, j - (this.M - c0066Ap02.o)) : 0L;
        if ((!zEquals || z) && c0066Ap0 != null && c0066Ap0.d) {
            f0(c0066Ap0.n);
        }
    }

    public final void j0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.C = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.p.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.D = jElapsedRealtime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:453:0x02e1 A[Catch: all -> 0x02e7, TryCatch #2 {all -> 0x02e7, blocks: (B:451:0x02db, B:453:0x02e1, B:467:0x0306, B:469:0x0313, B:471:0x0319, B:473:0x0323, B:474:0x0330, B:475:0x0333, B:479:0x033e), top: B:539:0x027f }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0448  */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [cR] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [dR] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.AbstractC0178Ca1 r39, boolean r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3390dR.k(Ca1, boolean):void");
    }

    public final synchronized void k0(C5278jG c5278jG, long j) {
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) c5278jG.get()).booleanValue() && j > 0) {
            try {
                this.p.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.p.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zp0] */
    public final void l(InterfaceC8435zp0 interfaceC8435zp0) throws IQ {
        C0222Cp0 c0222Cp0 = this.r;
        C0066Ap0 c0066Ap0 = c0222Cp0.k;
        if (c0066Ap0 == null || c0066Ap0.a != interfaceC8435zp0) {
            return;
        }
        float f = this.n.e().a;
        AbstractC0178Ca1 abstractC0178Ca1 = this.x.a;
        c0066Ap0.d = true;
        c0066Ap0.m = c0066Ap0.a.q();
        C2359bc1 c2359bc1H = c0066Ap0.h(f, abstractC0178Ca1);
        C0144Bp0 c0144Bp0 = c0066Ap0.f;
        long j = c0144Bp0.e;
        long j2 = c0144Bp0.b;
        long jA = c0066Ap0.a(c2359bc1H, (j == -9223372036854775807L || j2 < j) ? j2 : Math.max(0L, j - 1), false, new boolean[c0066Ap0.i.length]);
        long j3 = c0066Ap0.o;
        C0144Bp0 c0144Bp02 = c0066Ap0.f;
        c0066Ap0.o = (c0144Bp02.b - jA) + j3;
        c0066Ap0.f = c0144Bp02.b(jA);
        f0(c0066Ap0.n);
        if (c0066Ap0 == c0222Cp0.i) {
            E(c0066Ap0.f.b);
            e(new boolean[this.a.length], c0222Cp0.j.e());
            BB0 bb0 = this.x;
            C0456Fp0 c0456Fp0 = bb0.b;
            long j4 = c0066Ap0.f.b;
            this.x = o(c0456Fp0, j4, bb0.c, j4, false, 5);
        }
        s();
    }

    @Override // defpackage.InterfaceC3793fY0
    public final void m(InterfaceC3984gY0 interfaceC3984gY0) {
        this.h.a(9, (InterfaceC8435zp0) interfaceC3984gY0).b();
    }

    public final void n(CB0 cb0, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.y.f(1);
            }
            this.x = this.x.f(cb0);
        }
        float f2 = cb0.a;
        C0066Ap0 c0066Ap0 = this.r.i;
        while (true) {
            i = 0;
            if (c0066Ap0 == null) {
                break;
            }
            InterfaceC5311jR[] interfaceC5311jRArr = (InterfaceC5311jR[]) c0066Ap0.n.c;
            int length = interfaceC5311jRArr.length;
            while (i < length) {
                InterfaceC5311jR interfaceC5311jR = interfaceC5311jRArr[i];
                if (interfaceC5311jR != null) {
                    interfaceC5311jR.p(f2);
                }
                i++;
            }
            c0066Ap0 = c0066Ap0.l;
        }
        AbstractC0038Ag[] abstractC0038AgArr = this.a;
        int length2 = abstractC0038AgArr.length;
        while (i < length2) {
            AbstractC0038Ag abstractC0038Ag = abstractC0038AgArr[i];
            if (abstractC0038Ag != null) {
                abstractC0038Ag.y(f, cb0.a);
            }
            i++;
        }
    }

    public final BB0 o(C0456Fp0 c0456Fp0, long j, long j2, long j3, boolean z, int i) {
        C1350Rb1 c1350Rb1;
        C2359bc1 c2359bc1;
        List list;
        C3769fQ0 c3769fQ0H;
        boolean z2;
        int i2;
        int i3;
        this.P = (!this.P && j == this.x.s && c0456Fp0.equals(this.x.b)) ? false : true;
        D();
        BB0 bb0 = this.x;
        C1350Rb1 c1350Rb12 = bb0.h;
        C2359bc1 c2359bc12 = bb0.i;
        List list2 = bb0.j;
        if (this.s.a) {
            C0066Ap0 c0066Ap0 = this.r.i;
            C1350Rb1 c1350Rb13 = c0066Ap0 == null ? C1350Rb1.d : c0066Ap0.m;
            C2359bc1 c2359bc13 = c0066Ap0 == null ? this.e : c0066Ap0.n;
            InterfaceC5311jR[] interfaceC5311jRArr = (InterfaceC5311jR[]) c2359bc13.c;
            M70 m70 = new M70(4);
            int length = interfaceC5311jRArr.length;
            int i4 = 0;
            boolean z3 = false;
            while (i4 < length) {
                InterfaceC5311jR interfaceC5311jR = interfaceC5311jRArr[i4];
                if (interfaceC5311jR == null) {
                    i3 = 1;
                } else {
                    C0540Gr0 c0540Gr0 = interfaceC5311jR.i(0).k;
                    if (c0540Gr0 == null) {
                        m70.a(new C0540Gr0(new InterfaceC0384Er0[0]));
                        i3 = 1;
                    } else {
                        m70.a(c0540Gr0);
                        i3 = 1;
                        z3 = true;
                    }
                }
                i4 += i3;
            }
            if (z3) {
                c3769fQ0H = m70.h();
            } else {
                N70 n70 = P70.b;
                c3769fQ0H = C3769fQ0.e;
            }
            if (c0066Ap0 != null) {
                C0144Bp0 c0144Bp0 = c0066Ap0.f;
                if (c0144Bp0.c != j2) {
                    c0066Ap0.f = c0144Bp0.a(j2);
                }
            }
            C0066Ap0 c0066Ap02 = this.r.i;
            if (c0066Ap02 != null) {
                C2359bc1 c2359bc14 = c0066Ap02.n;
                boolean z4 = false;
                int i5 = 0;
                while (true) {
                    AbstractC0038Ag[] abstractC0038AgArr = this.a;
                    if (i5 >= abstractC0038AgArr.length) {
                        z2 = true;
                        break;
                    }
                    if (c2359bc14.g(i5)) {
                        i2 = 1;
                        if (abstractC0038AgArr[i5].b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((ZQ0[]) c2359bc14.b)[i5].a != 0) {
                            z4 = true;
                        }
                    } else {
                        i2 = 1;
                    }
                    i5 += i2;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.J) {
                    this.J = z5;
                    if (!z5 && this.x.p) {
                        this.h.e(2);
                    }
                }
            }
            list = c3769fQ0H;
            c1350Rb1 = c1350Rb13;
            c2359bc1 = c2359bc13;
        } else if (c0456Fp0.equals(bb0.b)) {
            c1350Rb1 = c1350Rb12;
            c2359bc1 = c2359bc12;
            list = list2;
        } else {
            c1350Rb1 = C1350Rb1.d;
            c2359bc1 = this.e;
            list = C3769fQ0.e;
        }
        if (z) {
            C2133aR c2133aR = this.y;
            if (!c2133aR.e || c2133aR.c == 5) {
                c2133aR.d = true;
                c2133aR.e = true;
                c2133aR.c = i;
            } else {
                YN1.c(i == 5);
            }
        }
        BB0 bb02 = this.x;
        long j4 = bb02.q;
        C0066Ap0 c0066Ap03 = this.r.k;
        return bb02.c(c0456Fp0, j, j2, j3, c0066Ap03 == null ? 0L : Math.max(0L, j4 - (this.M - c0066Ap03.o)), c1350Rb1, c2359bc1, list);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gY0, java.lang.Object, zp0] */
    public final boolean p() {
        C0066Ap0 c0066Ap0 = this.r.k;
        if (c0066Ap0 == null) {
            return false;
        }
        try {
            ?? r2 = c0066Ap0.a;
            if (c0066Ap0.d) {
                for (InterfaceC3403dV0 interfaceC3403dV0 : c0066Ap0.c) {
                    if (interfaceC3403dV0 != null) {
                        interfaceC3403dV0.a();
                    }
                }
            } else {
                r2.g();
            }
            return (!c0066Ap0.d ? 0L : r2.e()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean r() {
        C0066Ap0 c0066Ap0 = this.r.i;
        long j = c0066Ap0.f.e;
        return c0066Ap0.d && (j == -9223372036854775807L || this.x.s < j || !Z());
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [gY0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [gY0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, zp0] */
    public final void s() {
        boolean zC;
        if (p()) {
            C0066Ap0 c0066Ap0 = this.r.k;
            long jE = !c0066Ap0.d ? 0L : c0066Ap0.a.e();
            C0066Ap0 c0066Ap02 = this.r.k;
            long jMax = c0066Ap02 == null ? 0L : Math.max(0L, jE - (this.M - c0066Ap02.o));
            C0066Ap0 c0066Ap03 = this.r.i;
            long j = a0(this.x.a, c0066Ap0.f.a) ? this.t.i : -9223372036854775807L;
            NB0 nb0 = this.v;
            AbstractC0178Ca1 abstractC0178Ca1 = this.x.a;
            float f = this.n.e().a;
            boolean z = this.x.l;
            C3448dk0 c3448dk0 = new C3448dk0(nb0, jMax, f, this.C, j);
            zC = this.f.c(c3448dk0);
            C0066Ap0 c0066Ap04 = this.r.i;
            if (!zC && c0066Ap04.d && jMax < 500000 && this.m > 0) {
                c0066Ap04.a.i(this.x.s);
                zC = this.f.c(c3448dk0);
            }
        } else {
            zC = false;
        }
        this.E = zC;
        if (zC) {
            C0066Ap0 c0066Ap05 = this.r.k;
            long j2 = this.M;
            float f2 = this.n.e().a;
            long j3 = this.D;
            YN1.f(c0066Ap05.l == null);
            long j4 = j2 - c0066Ap05.o;
            ?? r1 = c0066Ap05.a;
            C7469uk0 c7469uk0 = new C7469uk0();
            c7469uk0.a = j4;
            YN1.c(f2 > 0.0f || f2 == -3.4028235E38f);
            c7469uk0.b = f2;
            YN1.c(j3 >= 0 || j3 == -9223372036854775807L);
            c7469uk0.c = j3;
            r1.r(new C7660vk0(c7469uk0));
        }
        e0();
    }

    public final void t() {
        C2133aR c2133aR = this.y;
        BB0 bb0 = this.x;
        boolean z = c2133aR.d | (((BB0) c2133aR.f) != bb0);
        c2133aR.d = z;
        c2133aR.f = bb0;
        if (z) {
            XQ xq = this.q.a;
            xq.j.c(new RQ(xq, 0, c2133aR));
            this.y = new C2133aR(this.x);
        }
    }

    public final void u() throws Throwable {
        k(this.s.c(), true);
    }

    public final void v() {
        this.y.f(1);
        throw null;
    }

    public final void w() {
        this.y.f(1);
        int i = 0;
        C(false, false, false, true);
        C3357dG c3357dG = this.f;
        c3357dG.getClass();
        long id = Thread.currentThread().getId();
        long j = c3357dG.j;
        YN1.g(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        c3357dG.j = id;
        HashMap map = c3357dG.i;
        NB0 nb0 = this.v;
        if (!map.containsKey(nb0)) {
            map.put(nb0, new C2481cG());
        }
        C2481cG c2481cG = (C2481cG) map.get(nb0);
        c2481cG.getClass();
        int i2 = c3357dG.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        c2481cG.b = i2;
        c2481cG.a = false;
        Y(this.x.a.p() ? 4 : 2);
        PE pe = (PE) this.g;
        pe.getClass();
        C1547Tp0 c1547Tp0 = this.s;
        YN1.f(!c1547Tp0.a);
        c1547Tp0.l = pe;
        while (true) {
            ArrayList arrayList = (ArrayList) c1547Tp0.c;
            if (i >= arrayList.size()) {
                c1547Tp0.a = true;
                this.h.e(2);
                return;
            } else {
                C1469Sp0 c1469Sp0 = (C1469Sp0) arrayList.get(i);
                c1547Tp0.g(c1469Sp0);
                ((HashSet) c1547Tp0.h).add(c1469Sp0);
                i++;
            }
        }
    }

    public final synchronized boolean x() {
        if (!this.z && this.j.getThread().isAlive()) {
            this.h.e(7);
            k0(new C5278jG(6, this), this.u);
            return this.z;
        }
        return true;
    }

    public final void y() {
        try {
            C(true, false, true, false);
            z();
            C3357dG c3357dG = this.f;
            if (c3357dG.i.remove(this.v) != null) {
                c3357dG.d();
            }
            if (c3357dG.i.isEmpty()) {
                c3357dG.j = -1L;
            }
            Y(1);
            HandlerThread handlerThread = this.i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.z = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.i;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.z = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void z() {
        for (int i = 0; i < this.a.length; i++) {
            AbstractC0038Ag abstractC0038Ag = this.c[i];
            synchronized (abstractC0038Ag.a) {
                abstractC0038Ag.q = null;
            }
            AbstractC0038Ag abstractC0038Ag2 = this.a[i];
            YN1.f(abstractC0038Ag2.h == 0);
            abstractC0038Ag2.p();
        }
    }
}
