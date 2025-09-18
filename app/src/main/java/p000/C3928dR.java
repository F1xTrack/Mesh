package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.huawei.hms.adapter.internal.AvailableCode;
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
public final class C3928dR implements Handler.Callback, InterfaceC11846yp0, OB0 {

    /* renamed from: T */
    public static final long f26061T = AbstractC7485Dh1.m1819d0(10000);

    /* renamed from: B */
    public boolean f26063B;

    /* renamed from: C */
    public boolean f26064C;

    /* renamed from: E */
    public boolean f26066E;

    /* renamed from: F */
    public int f26067F;

    /* renamed from: G */
    public boolean f26068G;

    /* renamed from: H */
    public boolean f26069H;

    /* renamed from: I */
    public boolean f26070I;

    /* renamed from: J */
    public boolean f26071J;

    /* renamed from: K */
    public int f26072K;

    /* renamed from: L */
    public C1847cR f26073L;

    /* renamed from: M */
    public long f26074M;

    /* renamed from: N */
    public long f26075N;

    /* renamed from: O */
    public int f26076O;

    /* renamed from: P */
    public boolean f26077P;

    /* renamed from: Q */
    public C0531IQ f26078Q;

    /* renamed from: S */
    public C0720LQ f26080S;

    /* renamed from: a */
    public final AbstractC0043Ag[] f26081a;

    /* renamed from: b */
    public final Set f26082b;

    /* renamed from: c */
    public final AbstractC0043Ag[] f26083c;

    /* renamed from: d */
    public final AbstractC10821qn0 f26084d;

    /* renamed from: e */
    public final C8875bc1 f26085e;

    /* renamed from: f */
    public final C3917dG f26086f;

    /* renamed from: g */
    public final InterfaceC0168Cf f26087g;

    /* renamed from: h */
    public final R71 f26088h;

    /* renamed from: i */
    public final HandlerThread f26089i;

    /* renamed from: j */
    public final Looper f26090j;

    /* renamed from: k */
    public final C7367Ba1 f26091k;

    /* renamed from: l */
    public final C7315Aa1 f26092l;

    /* renamed from: m */
    public final long f26093m;

    /* renamed from: n */
    public final C4168hG f26094n;

    /* renamed from: o */
    public final ArrayList f26095o;

    /* renamed from: p */
    public final M71 f26096p;

    /* renamed from: q */
    public final C1034QQ f26097q;

    /* renamed from: r */
    public final C7448Cp0 f26098r;

    /* renamed from: s */
    public final C8332Tp0 f26099s;

    /* renamed from: t */
    public final C1774bG f26100t;

    /* renamed from: u */
    public final long f26101u;

    /* renamed from: v */
    public final NB0 f26102v;

    /* renamed from: w */
    public DX0 f26103w;

    /* renamed from: x */
    public BB0 f26104x;

    /* renamed from: y */
    public C1664aR f26105y;

    /* renamed from: z */
    public boolean f26106z;

    /* renamed from: A */
    public boolean f26062A = false;

    /* renamed from: R */
    public long f26079R = -9223372036854775807L;

    /* renamed from: D */
    public long f26065D = -9223372036854775807L;

    public C3928dR(AbstractC0043Ag[] abstractC0043AgArr, AbstractC10821qn0 abstractC10821qn0, C8875bc1 c8875bc1, C3917dG c3917dG, InterfaceC0168Cf interfaceC0168Cf, int i, boolean z, C7251zE c7251zE, DX0 dx0, C1774bG c1774bG, long j, Looper looper, M71 m71, C1034QQ c1034qq, NB0 nb0, C0720LQ c0720lq) {
        this.f26097q = c1034qq;
        this.f26081a = abstractC0043AgArr;
        this.f26084d = abstractC10821qn0;
        this.f26085e = c8875bc1;
        this.f26086f = c3917dG;
        this.f26087g = interfaceC0168Cf;
        this.f26067F = i;
        this.f26068G = z;
        this.f26103w = dx0;
        this.f26100t = c1774bG;
        this.f26101u = j;
        this.f26096p = m71;
        this.f26102v = nb0;
        this.f26080S = c0720lq;
        this.f26093m = c3917dG.f25913h;
        C11944za1 c11944za1 = AbstractC7419Ca1.f1466a;
        BB0 bb0M544i = BB0.m544i(c8875bc1);
        this.f26104x = bb0M544i;
        this.f26105y = new C1664aR(bb0M544i);
        this.f26083c = new AbstractC0043Ag[abstractC0043AgArr.length];
        C1654aH c1654aH = (C1654aH) abstractC10821qn0;
        c1654aH.getClass();
        for (int i2 = 0; i2 < abstractC0043AgArr.length; i2++) {
            AbstractC0043Ag abstractC0043Ag = abstractC0043AgArr[i2];
            abstractC0043Ag.f310e = i2;
            abstractC0043Ag.f311f = nb0;
            abstractC0043Ag.f312g = m71;
            this.f26083c[i2] = abstractC0043Ag;
            AbstractC0043Ag abstractC0043Ag2 = this.f26083c[i2];
            synchronized (abstractC0043Ag2.f306a) {
                abstractC0043Ag2.f322q = c1654aH;
            }
        }
        this.f26094n = new C4168hG(this, m71);
        this.f26095o = new ArrayList();
        this.f26082b = Collections.newSetFromMap(new IdentityHashMap());
        this.f26091k = new C7367Ba1();
        this.f26092l = new C7315Aa1();
        abstractC10821qn0.f41153a = this;
        abstractC10821qn0.f41154b = interfaceC0168Cf;
        this.f26077P = true;
        R71 r71M5274a = m71.m5274a(looper, null);
        this.f26098r = new C7448Cp0(c7251zE, r71M5274a, new C0267EE(11, this), c0720lq);
        this.f26099s = new C8332Tp0(this, c7251zE, r71M5274a, nb0);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f26089i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f26090j = looper2;
        this.f26088h = m71.m5274a(looper2, this);
    }

    /* renamed from: G */
    public static Pair m17605G(AbstractC7419Ca1 abstractC7419Ca1, C1847cR c1847cR, boolean z, int i, boolean z2, C7367Ba1 c7367Ba1, C7315Aa1 c7315Aa1) {
        Pair pairM1252i;
        int iM17606H;
        AbstractC7419Ca1 abstractC7419Ca12 = c1847cR.f17472a;
        if (abstractC7419Ca1.m1259p()) {
            return null;
        }
        AbstractC7419Ca1 abstractC7419Ca13 = abstractC7419Ca12.m1259p() ? abstractC7419Ca1 : abstractC7419Ca12;
        try {
            pairM1252i = abstractC7419Ca13.m1252i(c7367Ba1, c7315Aa1, c1847cR.f17473b, c1847cR.f17474c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC7419Ca1.equals(abstractC7419Ca13)) {
            return pairM1252i;
        }
        if (abstractC7419Ca1.mo1245b(pairM1252i.first) != -1) {
            return (abstractC7419Ca13.mo1250g(pairM1252i.first, c7315Aa1).f261f && abstractC7419Ca13.mo1256m(c7315Aa1.f258c, c7367Ba1, 0L).f927n == abstractC7419Ca13.mo1245b(pairM1252i.first)) ? abstractC7419Ca1.m1252i(c7367Ba1, c7315Aa1, abstractC7419Ca1.mo1250g(pairM1252i.first, c7315Aa1).f258c, c1847cR.f17474c) : pairM1252i;
        }
        if (z && (iM17606H = m17606H(c7367Ba1, c7315Aa1, i, z2, pairM1252i.first, abstractC7419Ca13, abstractC7419Ca1)) != -1) {
            return abstractC7419Ca1.m1252i(c7367Ba1, c7315Aa1, iM17606H, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: H */
    public static int m17606H(C7367Ba1 c7367Ba1, C7315Aa1 c7315Aa1, int i, boolean z, Object obj, AbstractC7419Ca1 abstractC7419Ca1, AbstractC7419Ca1 abstractC7419Ca12) {
        Object obj2 = abstractC7419Ca1.mo1256m(abstractC7419Ca1.mo1250g(obj, c7315Aa1).f258c, c7367Ba1, 0L).f914a;
        for (int i2 = 0; i2 < abstractC7419Ca12.mo1258o(); i2++) {
            if (abstractC7419Ca12.mo1256m(i2, c7367Ba1, 0L).f914a.equals(obj2)) {
                return i2;
            }
        }
        int iMo1245b = abstractC7419Ca1.mo1245b(obj);
        int iMo1251h = abstractC7419Ca1.mo1251h();
        int iM1247d = iMo1245b;
        int iMo1245b2 = -1;
        for (int i3 = 0; i3 < iMo1251h && iMo1245b2 == -1; i3++) {
            iM1247d = abstractC7419Ca1.m1247d(iM1247d, c7315Aa1, c7367Ba1, i, z);
            if (iM1247d == -1) {
                break;
            }
            iMo1245b2 = abstractC7419Ca12.mo1245b(abstractC7419Ca1.mo1255l(iM1247d));
        }
        if (iMo1245b2 == -1) {
            return -1;
        }
        return abstractC7419Ca12.mo1249f(iMo1245b2, c7315Aa1, false).f258c;
    }

    /* renamed from: O */
    public static void m17607O(AbstractC0043Ag abstractC0043Ag, long j) {
        abstractC0043Ag.f319n = true;
        if (abstractC0043Ag instanceof G91) {
            G91 g91 = (G91) abstractC0043Ag;
            YN1.m9281f(g91.f319n);
            g91.f3621K = j;
        }
    }

    /* renamed from: q */
    public static boolean m17608q(AbstractC0043Ag abstractC0043Ag) {
        return abstractC0043Ag.f313h != 0;
    }

    /* renamed from: A */
    public final void m17609A(int i, int i2, C11869z01 c11869z01) throws Throwable {
        this.f26105y.m9737f(1);
        C8332Tp0 c8332Tp0 = this.f26099s;
        c8332Tp0.getClass();
        YN1.m9278c(i >= 0 && i <= i2 && i2 <= ((ArrayList) c8332Tp0.f11538c).size());
        c8332Tp0.f11546k = c11869z01;
        c8332Tp0.m7785i(i, i2);
        m17651k(c8332Tp0.m7779c(), false);
    }

    /* renamed from: B */
    public final void m17610B() throws C0531IQ {
        float f = this.f26094n.mo2787e().f1239a;
        C7448Cp0 c7448Cp0 = this.f26098r;
        C7344Ap0 c7344Ap0 = c7448Cp0.f1681i;
        C7344Ap0 c7344Ap02 = c7448Cp0.f1682j;
        C8875bc1 c8875bc1 = null;
        C7344Ap0 c7344Ap03 = c7344Ap0;
        boolean z = true;
        while (c7344Ap03 != null && c7344Ap03.f386d) {
            C8875bc1 c8875bc1M332h = c7344Ap03.m332h(f, this.f26104x.f623a);
            C8875bc1 c8875bc12 = c7344Ap03 == this.f26098r.f1681i ? c8875bc1M332h : c8875bc1;
            C8875bc1 c8875bc13 = c7344Ap03.f396n;
            if (c8875bc13 != null) {
                int length = ((InterfaceC6237jR[]) c8875bc13.f17090c).length;
                InterfaceC6237jR[] interfaceC6237jRArr = (InterfaceC6237jR[]) c8875bc1M332h.f17090c;
                if (length == interfaceC6237jRArr.length) {
                    for (int i = 0; i < interfaceC6237jRArr.length; i++) {
                        if (c8875bc1M332h.m10466f(c8875bc13, i)) {
                        }
                    }
                    if (c7344Ap03 == c7344Ap02) {
                        z = false;
                    }
                    c7344Ap03 = c7344Ap03.f394l;
                    c8875bc1 = c8875bc12;
                }
            }
            if (z) {
                C7448Cp0 c7448Cp02 = this.f26098r;
                C7344Ap0 c7344Ap04 = c7448Cp02.f1681i;
                boolean zM1385k = c7448Cp02.m1385k(c7344Ap04);
                boolean[] zArr = new boolean[this.f26081a.length];
                c8875bc12.getClass();
                long jM325a = c7344Ap04.m325a(c8875bc12, this.f26104x.f641s, zM1385k, zArr);
                BB0 bb0 = this.f26104x;
                boolean z2 = (bb0.f627e == 4 || jM325a == bb0.f641s) ? false : true;
                BB0 bb02 = this.f26104x;
                this.f26104x = m17655o(bb02.f624b, jM325a, bb02.f625c, bb02.f626d, z2, 5);
                if (z2) {
                    m17613E(jM325a);
                }
                boolean[] zArr2 = new boolean[this.f26081a.length];
                int i2 = 0;
                while (true) {
                    AbstractC0043Ag[] abstractC0043AgArr = this.f26081a;
                    if (i2 >= abstractC0043AgArr.length) {
                        break;
                    }
                    AbstractC0043Ag abstractC0043Ag = abstractC0043AgArr[i2];
                    boolean zM17608q = m17608q(abstractC0043Ag);
                    zArr2[i2] = zM17608q;
                    InterfaceC9121dV0 interfaceC9121dV0 = c7344Ap04.f385c[i2];
                    if (zM17608q) {
                        if (interfaceC9121dV0 != abstractC0043Ag.f314i) {
                            m17635c(abstractC0043Ag);
                        } else if (zArr[i2]) {
                            long j = this.f26074M;
                            abstractC0043Ag.f319n = false;
                            abstractC0043Ag.f317l = j;
                            abstractC0043Ag.f318m = j;
                            abstractC0043Ag.mo269o(j, false);
                        }
                    }
                    i2++;
                }
                m17639e(zArr2, this.f26074M);
            } else {
                this.f26098r.m1385k(c7344Ap03);
                if (c7344Ap03.f386d) {
                    c7344Ap03.m325a(c8875bc1M332h, Math.max(c7344Ap03.f388f.f1043b, this.f26074M - c7344Ap03.f397o), false, new boolean[c7344Ap03.f391i.length]);
                }
            }
            m17649j(true);
            if (this.f26104x.f627e != 4) {
                m17658s();
                m17646h0();
                this.f26088h.m6907e(2);
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
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17611C(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3928dR.m17611C(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: D */
    public final void m17612D() {
        C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
        this.f26063B = c7344Ap0 != null && c7344Ap0.f388f.f1049h && this.f26062A;
    }

    /* renamed from: E */
    public final void m17613E(long j) {
        C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
        long j2 = j + (c7344Ap0 == null ? 1000000000000L : c7344Ap0.f397o);
        this.f26074M = j2;
        this.f26094n.f28352a.m18960d(j2);
        for (AbstractC0043Ag abstractC0043Ag : this.f26081a) {
            if (m17608q(abstractC0043Ag)) {
                long j3 = this.f26074M;
                abstractC0043Ag.f319n = false;
                abstractC0043Ag.f317l = j3;
                abstractC0043Ag.f318m = j3;
                abstractC0043Ag.mo269o(j3, false);
            }
        }
        for (C7344Ap0 c7344Ap02 = r0.f1681i; c7344Ap02 != null; c7344Ap02 = c7344Ap02.f394l) {
            for (InterfaceC6237jR interfaceC6237jR : (InterfaceC6237jR[]) c7344Ap02.f396n.f17090c) {
                if (interfaceC6237jR != null) {
                    interfaceC6237jR.mo2735r();
                }
            }
        }
    }

    /* renamed from: F */
    public final void m17614F(AbstractC7419Ca1 abstractC7419Ca1, AbstractC7419Ca1 abstractC7419Ca12) {
        if (abstractC7419Ca1.m1259p() && abstractC7419Ca12.m1259p()) {
            return;
        }
        ArrayList arrayList = this.f26095o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC1374Vq.m8597p(arrayList.get(size));
            throw null;
        }
    }

    /* renamed from: I */
    public final void m17615I(long j) {
        this.f26088h.f10020a.sendEmptyMessageAtTime(2, j + ((this.f26104x.f627e != 3 || m17631Z()) ? f26061T : 1000L));
    }

    /* renamed from: J */
    public final void m17616J(boolean z) throws C0531IQ {
        C7604Fp0 c7604Fp0 = this.f26098r.f1681i.f388f.f1042a;
        long jM17618L = m17618L(c7604Fp0, this.f26104x.f641s, true, false);
        if (jM17618L != this.f26104x.f641s) {
            BB0 bb0 = this.f26104x;
            this.f26104x = m17655o(c7604Fp0, jM17618L, bb0.f625c, bb0.f626d, z, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, zp0] */
    /* renamed from: K */
    public final void m17617K(C1847cR c1847cR) throws Throwable {
        long j;
        long j2;
        boolean z;
        C7604Fp0 c7604Fp0;
        long j3;
        long j4;
        long j5;
        BB0 bb0;
        int i;
        this.f26105y.m9737f(1);
        Pair pairM17605G = m17605G(this.f26104x.f623a, c1847cR, true, this.f26067F, this.f26068G, this.f26091k, this.f26092l);
        if (pairM17605G == null) {
            Pair pairM17643g = m17643g(this.f26104x.f623a);
            c7604Fp0 = (C7604Fp0) pairM17643g.first;
            long jLongValue = ((Long) pairM17643g.second).longValue();
            z = !this.f26104x.f623a.m1259p();
            j = jLongValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairM17605G.first;
            long jLongValue2 = ((Long) pairM17605G.second).longValue();
            long j6 = c1847cR.f17474c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            C7604Fp0 c7604Fp0M1386m = this.f26098r.m1386m(this.f26104x.f623a, obj, jLongValue2);
            if (c7604Fp0M1386m.m2791b()) {
                this.f26104x.f623a.mo1250g(c7604Fp0M1386m.f3430a, this.f26092l);
                if (this.f26092l.m240e(c7604Fp0M1386m.f3431b) == c7604Fp0M1386m.f3432c) {
                    this.f26092l.f262g.getClass();
                }
                j = 0;
                j2 = j6;
                c7604Fp0 = c7604Fp0M1386m;
                z = true;
            } else {
                j = jLongValue2;
                j2 = j6;
                z = c1847cR.f17474c == -9223372036854775807L;
                c7604Fp0 = c7604Fp0M1386m;
            }
        }
        try {
            if (this.f26104x.f623a.m1259p()) {
                this.f26073L = c1847cR;
            } else {
                if (pairM17605G != null) {
                    if (c7604Fp0.equals(this.f26104x.f624b)) {
                        C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
                        long jMo1877b = (c7344Ap0 == null || !c7344Ap0.f386d || j == 0) ? j : c7344Ap0.f383a.mo1877b(j, this.f26103w);
                        if (AbstractC7485Dh1.m1819d0(jMo1877b) == AbstractC7485Dh1.m1819d0(this.f26104x.f641s) && ((i = (bb0 = this.f26104x).f627e) == 2 || i == 3)) {
                            long j7 = bb0.f641s;
                            this.f26104x = m17655o(c7604Fp0, j7, j2, j7, z, 2);
                            return;
                        }
                        j4 = jMo1877b;
                    } else {
                        j4 = j;
                    }
                    boolean z2 = this.f26104x.f627e == 4;
                    C7448Cp0 c7448Cp0 = this.f26098r;
                    long jM17618L = m17618L(c7604Fp0, j4, c7448Cp0.f1681i != c7448Cp0.f1682j, z2);
                    z |= j != jM17618L;
                    try {
                        BB0 bb02 = this.f26104x;
                        AbstractC7419Ca1 abstractC7419Ca1 = bb02.f623a;
                        m17648i0(abstractC7419Ca1, c7604Fp0, abstractC7419Ca1, bb02.f624b, j2, true);
                        j5 = jM17618L;
                        this.f26104x = m17655o(c7604Fp0, j5, j2, j5, z, 2);
                    } catch (Throwable th) {
                        th = th;
                        j3 = jM17618L;
                        this.f26104x = m17655o(c7604Fp0, j3, j2, j3, z, 2);
                        throw th;
                    }
                }
                if (this.f26104x.f627e != 1) {
                    m17630Y(4);
                }
                m17611C(false, true, false, true);
            }
            j5 = j;
            this.f26104x = m17655o(c7604Fp0, j5, j2, j5, z, 2);
        } catch (Throwable th2) {
            th = th2;
            j3 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, zp0] */
    /* renamed from: L */
    public final long m17618L(C7604Fp0 c7604Fp0, long j, boolean z, boolean z2) throws C0531IQ {
        m17638d0();
        m17650j0(false, true);
        if (z2 || this.f26104x.f627e == 3) {
            m17630Y(2);
        }
        C7448Cp0 c7448Cp0 = this.f26098r;
        C7344Ap0 c7344Ap0 = c7448Cp0.f1681i;
        C7344Ap0 c7344Ap02 = c7344Ap0;
        while (c7344Ap02 != null && !c7604Fp0.equals(c7344Ap02.f388f.f1042a)) {
            c7344Ap02 = c7344Ap02.f394l;
        }
        if (z || c7344Ap0 != c7344Ap02 || (c7344Ap02 != null && c7344Ap02.f397o + j < 0)) {
            AbstractC0043Ag[] abstractC0043AgArr = this.f26081a;
            for (AbstractC0043Ag abstractC0043Ag : abstractC0043AgArr) {
                m17635c(abstractC0043Ag);
            }
            if (c7344Ap02 != null) {
                while (c7448Cp0.f1681i != c7344Ap02) {
                    c7448Cp0.m1375a();
                }
                c7448Cp0.m1385k(c7344Ap02);
                c7344Ap02.f397o = 1000000000000L;
                m17639e(new boolean[abstractC0043AgArr.length], c7448Cp0.f1682j.m329e());
            }
        }
        if (c7344Ap02 != null) {
            c7448Cp0.m1385k(c7344Ap02);
            if (!c7344Ap02.f386d) {
                c7344Ap02.f388f = c7344Ap02.f388f.m883b(j);
            } else if (c7344Ap02.f387e) {
                ?? r9 = c7344Ap02.f383a;
                j = r9.mo1882h(j);
                r9.mo1883i(j - this.f26093m);
            }
            m17613E(j);
            m17658s();
        } else {
            c7448Cp0.m1376b();
            m17613E(j);
        }
        m17649j(false);
        this.f26088h.m6907e(2);
        return j;
    }

    /* renamed from: M */
    public final void m17619M(QB0 qb0) {
        Looper looper = qb0.f9522f;
        Looper looper2 = this.f26090j;
        R71 r71 = this.f26088h;
        if (looper != looper2) {
            r71.m6904a(15, qb0).m6576b();
            return;
        }
        synchronized (qb0) {
        }
        try {
            qb0.f9517a.mo259d(qb0.f9520d, qb0.f9521e);
            qb0.m6596b(true);
            int i = this.f26104x.f627e;
            if (i == 3 || i == 2) {
                r71.m6907e(2);
            }
        } catch (Throwable th) {
            qb0.m6596b(true);
            throw th;
        }
    }

    /* renamed from: N */
    public final void m17620N(QB0 qb0) {
        Looper looper = qb0.f9522f;
        if (looper.getThread().isAlive()) {
            this.f26096p.m5274a(looper, null).m6905c(new RunnableC1096RQ(this, 1, qb0));
        } else {
            AbstractC10872rA1.m24175h("Trying to send message on a dead thread.");
            qb0.m6596b(false);
        }
    }

    /* renamed from: P */
    public final void m17621P(AtomicBoolean atomicBoolean, boolean z) {
        if (this.f26069H != z) {
            this.f26069H = z;
            if (!z) {
                for (AbstractC0043Ag abstractC0043Ag : this.f26081a) {
                    if (!m17608q(abstractC0043Ag) && this.f26082b.remove(abstractC0043Ag)) {
                        abstractC0043Ag.m278x();
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

    /* renamed from: Q */
    public final void m17622Q(C1600ZQ c1600zq) throws Throwable {
        this.f26105y.m9737f(1);
        int i = c1600zq.f14887c;
        ArrayList arrayList = c1600zq.f14885a;
        C11869z01 c11869z01 = c1600zq.f14886b;
        if (i != -1) {
            this.f26073L = new C1847cR(new SB0(arrayList, c11869z01), c1600zq.f14887c, c1600zq.f14888d);
        }
        C8332Tp0 c8332Tp0 = this.f26099s;
        ArrayList arrayList2 = (ArrayList) c8332Tp0.f11538c;
        c8332Tp0.m7785i(0, arrayList2.size());
        m17651k(c8332Tp0.m7777a(arrayList2.size(), arrayList, c11869z01), false);
    }

    /* renamed from: R */
    public final void m17623R(boolean z) throws C0531IQ {
        this.f26062A = z;
        m17612D();
        if (this.f26063B) {
            C7448Cp0 c7448Cp0 = this.f26098r;
            if (c7448Cp0.f1682j != c7448Cp0.f1681i) {
                m17616J(true);
                m17649j(false);
            }
        }
    }

    /* renamed from: S */
    public final void m17624S(int i, int i2, boolean z, boolean z2) {
        this.f26105y.m9737f(z2 ? 1 : 0);
        this.f26104x = this.f26104x.m548d(i2, i, z);
        m17650j0(false, false);
        for (C7344Ap0 c7344Ap0 = this.f26098r.f1681i; c7344Ap0 != null; c7344Ap0 = c7344Ap0.f394l) {
            for (InterfaceC6237jR interfaceC6237jR : (InterfaceC6237jR[]) c7344Ap0.f396n.f17090c) {
                if (interfaceC6237jR != null) {
                    interfaceC6237jR.mo2727h(z);
                }
            }
        }
        if (!m17631Z()) {
            m17638d0();
            m17646h0();
            return;
        }
        int i3 = this.f26104x.f627e;
        R71 r71 = this.f26088h;
        if (i3 != 3) {
            if (i3 == 2) {
                r71.m6907e(2);
            }
        } else {
            C4168hG c4168hG = this.f26094n;
            c4168hG.f28357f = true;
            c4168hG.f28352a.m18961f();
            m17634b0();
            r71.m6907e(2);
        }
    }

    /* renamed from: T */
    public final void m17625T(CB0 cb0) {
        this.f26088h.m6906d(16);
        C4168hG c4168hG = this.f26094n;
        c4168hG.mo2784a(cb0);
        CB0 cb0Mo2787e = c4168hG.mo2787e();
        m17654n(cb0Mo2787e, cb0Mo2787e.f1239a, true, true);
    }

    /* renamed from: U */
    public final void m17626U(C0720LQ c0720lq) {
        this.f26080S = c0720lq;
        AbstractC7419Ca1 abstractC7419Ca1 = this.f26104x.f623a;
        C7448Cp0 c7448Cp0 = this.f26098r;
        c7448Cp0.getClass();
        c0720lq.getClass();
        if (c7448Cp0.f1687o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c7448Cp0.f1687o.size(); i++) {
            ((C7344Ap0) c7448Cp0.f1687o.get(i)).m331g();
        }
        c7448Cp0.f1687o = arrayList;
    }

    /* renamed from: V */
    public final void m17627V(int i) throws C0531IQ {
        this.f26067F = i;
        AbstractC7419Ca1 abstractC7419Ca1 = this.f26104x.f623a;
        C7448Cp0 c7448Cp0 = this.f26098r;
        c7448Cp0.f1679g = i;
        if (!c7448Cp0.m1388o(abstractC7419Ca1)) {
            m17616J(true);
        }
        m17649j(false);
    }

    /* renamed from: W */
    public final void m17628W(boolean z) throws C0531IQ {
        this.f26068G = z;
        AbstractC7419Ca1 abstractC7419Ca1 = this.f26104x.f623a;
        C7448Cp0 c7448Cp0 = this.f26098r;
        c7448Cp0.f1680h = z;
        if (!c7448Cp0.m1388o(abstractC7419Ca1)) {
            m17616J(true);
        }
        m17649j(false);
    }

    /* renamed from: X */
    public final void m17629X(C11869z01 c11869z01) throws Throwable {
        this.f26105y.m9737f(1);
        C8332Tp0 c8332Tp0 = this.f26099s;
        int size = ((ArrayList) c8332Tp0.f11538c).size();
        if (c11869z01.f46568b.length != size) {
            c11869z01 = new C11869z01(new Random(c11869z01.f46567a.nextLong())).m26299a(size);
        }
        c8332Tp0.f11546k = c11869z01;
        m17651k(c8332Tp0.m7779c(), false);
    }

    /* renamed from: Y */
    public final void m17630Y(int i) {
        BB0 bb0 = this.f26104x;
        if (bb0.f627e != i) {
            if (i != 2) {
                this.f26079R = -9223372036854775807L;
            }
            this.f26104x = bb0.m551g(i);
        }
    }

    /* renamed from: Z */
    public final boolean m17631Z() {
        BB0 bb0 = this.f26104x;
        return bb0.f634l && bb0.f636n == 0;
    }

    @Override // p000.InterfaceC11846yp0
    /* renamed from: a */
    public final void mo1876a(InterfaceC11973zp0 interfaceC11973zp0) {
        this.f26088h.m6904a(8, interfaceC11973zp0).m6576b();
    }

    /* renamed from: a0 */
    public final boolean m17632a0(AbstractC7419Ca1 abstractC7419Ca1, C7604Fp0 c7604Fp0) {
        if (c7604Fp0.m2791b() || abstractC7419Ca1.m1259p()) {
            return false;
        }
        int i = abstractC7419Ca1.mo1250g(c7604Fp0.f3430a, this.f26092l).f258c;
        C7367Ba1 c7367Ba1 = this.f26091k;
        abstractC7419Ca1.m1257n(i, c7367Ba1);
        return c7367Ba1.m772a() && c7367Ba1.f922i && c7367Ba1.f919f != -9223372036854775807L;
    }

    /* renamed from: b */
    public final void m17633b(C1600ZQ c1600zq, int i) throws Throwable {
        this.f26105y.m9737f(1);
        C8332Tp0 c8332Tp0 = this.f26099s;
        if (i == -1) {
            i = ((ArrayList) c8332Tp0.f11538c).size();
        }
        m17651k(c8332Tp0.m7777a(i, c1600zq.f14885a, c1600zq.f14886b), false);
    }

    /* renamed from: b0 */
    public final void m17634b0() {
        C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
        if (c7344Ap0 == null) {
            return;
        }
        C8875bc1 c8875bc1 = c7344Ap0.f396n;
        int i = 0;
        while (true) {
            AbstractC0043Ag[] abstractC0043AgArr = this.f26081a;
            if (i >= abstractC0043AgArr.length) {
                return;
            }
            if (c8875bc1.m10467g(i)) {
                AbstractC0043Ag abstractC0043Ag = abstractC0043AgArr[i];
                int i2 = abstractC0043Ag.f313h;
                if (i2 == 1) {
                    YN1.m9281f(i2 == 1);
                    abstractC0043Ag.f313h = 2;
                    abstractC0043Ag.mo272r();
                }
            }
            i++;
        }
    }

    /* renamed from: c */
    public final void m17635c(AbstractC0043Ag abstractC0043Ag) {
        if (m17608q(abstractC0043Ag)) {
            C4168hG c4168hG = this.f26094n;
            if (abstractC0043Ag == c4168hG.f28354c) {
                c4168hG.f28355d = null;
                c4168hG.f28354c = null;
                c4168hG.f28356e = true;
            }
            int i = abstractC0043Ag.f313h;
            if (i == 2) {
                YN1.m9281f(i == 2);
                abstractC0043Ag.f313h = 1;
                abstractC0043Ag.mo273s();
            }
            YN1.m9281f(abstractC0043Ag.f313h == 1);
            abstractC0043Ag.f308c.m5557f();
            abstractC0043Ag.f313h = 0;
            abstractC0043Ag.f314i = null;
            abstractC0043Ag.f315j = null;
            abstractC0043Ag.f319n = false;
            abstractC0043Ag.mo267m();
            this.f26072K--;
        }
    }

    /* renamed from: c0 */
    public final void m17636c0(boolean z, boolean z2) {
        m17611C(z || !this.f26069H, false, true, false);
        this.f26105y.m9737f(z2 ? 1 : 0);
        C3917dG c3917dG = this.f26086f;
        if (c3917dG.f25914i.remove(this.f26102v) != null) {
            c3917dG.m17519d();
        }
        m17630Y(1);
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17637d() throws p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 1899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3928dR.m17637d():void");
    }

    /* renamed from: d0 */
    public final void m17638d0() {
        int i;
        C4168hG c4168hG = this.f26094n;
        c4168hG.f28357f = false;
        C9708i41 c9708i41 = c4168hG.f28352a;
        if (c9708i41.f28812c) {
            c9708i41.m18960d(c9708i41.mo2785b());
            c9708i41.f28812c = false;
        }
        for (AbstractC0043Ag abstractC0043Ag : this.f26081a) {
            if (m17608q(abstractC0043Ag) && (i = abstractC0043Ag.f313h) == 2) {
                YN1.m9281f(i == 2);
                abstractC0043Ag.f313h = 1;
                abstractC0043Ag.mo273s();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0120  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17639e(boolean[] r24, long r25) throws p000.C0531IQ {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3928dR.m17639e(boolean[], long):void");
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [gY0, java.lang.Object] */
    /* renamed from: e0 */
    public final void m17640e0() {
        C7344Ap0 c7344Ap0 = this.f26098r.f1683k;
        boolean z = this.f26066E || (c7344Ap0 != null && c7344Ap0.f383a.mo1884l());
        BB0 bb0 = this.f26104x;
        if (z != bb0.f629g) {
            this.f26104x = new BB0(bb0.f623a, bb0.f624b, bb0.f625c, bb0.f626d, bb0.f627e, bb0.f628f, z, bb0.f630h, bb0.f631i, bb0.f632j, bb0.f633k, bb0.f634l, bb0.f635m, bb0.f636n, bb0.f637o, bb0.f639q, bb0.f640r, bb0.f641s, bb0.f642t, bb0.f638p);
        }
    }

    /* renamed from: f */
    public final long m17641f(AbstractC7419Ca1 abstractC7419Ca1, Object obj, long j) {
        C7315Aa1 c7315Aa1 = this.f26092l;
        int i = abstractC7419Ca1.mo1250g(obj, c7315Aa1).f258c;
        C7367Ba1 c7367Ba1 = this.f26091k;
        abstractC7419Ca1.m1257n(i, c7367Ba1);
        if (c7367Ba1.f919f != -9223372036854775807L && c7367Ba1.m772a() && c7367Ba1.f922i) {
            return AbstractC7485Dh1.m1802Q(AbstractC7485Dh1.m1841z(c7367Ba1.f920g) - c7367Ba1.f919f) - (j + c7315Aa1.f260e);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f0 */
    public final void m17642f0(C8875bc1 c8875bc1) {
        AbstractC7419Ca1 abstractC7419Ca1 = this.f26104x.f623a;
        InterfaceC6237jR[] interfaceC6237jRArr = (InterfaceC6237jR[]) c8875bc1.f17090c;
        C3917dG c3917dG = this.f26086f;
        C1836cG c1836cG = (C1836cG) c3917dG.f25914i.get(this.f26102v);
        c1836cG.getClass();
        int iMax = c3917dG.f25911f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                AbstractC0043Ag[] abstractC0043AgArr = this.f26081a;
                int i3 = 13107200;
                if (i < abstractC0043AgArr.length) {
                    if (interfaceC6237jRArr[i] != null) {
                        switch (abstractC0043AgArr[i].f307b) {
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
        c1836cG.f17399b = iMax;
        c3917dG.m17519d();
    }

    /* renamed from: g */
    public final Pair m17643g(AbstractC7419Ca1 abstractC7419Ca1) {
        long j = 0;
        if (abstractC7419Ca1.m1259p()) {
            return Pair.create(BB0.f622u, 0L);
        }
        Pair pairM1252i = abstractC7419Ca1.m1252i(this.f26091k, this.f26092l, abstractC7419Ca1.mo1244a(this.f26068G), -9223372036854775807L);
        C7604Fp0 c7604Fp0M1386m = this.f26098r.m1386m(abstractC7419Ca1, pairM1252i.first, 0L);
        long jLongValue = ((Long) pairM1252i.second).longValue();
        if (c7604Fp0M1386m.m2791b()) {
            Object obj = c7604Fp0M1386m.f3430a;
            C7315Aa1 c7315Aa1 = this.f26092l;
            abstractC7419Ca1.mo1250g(obj, c7315Aa1);
            if (c7604Fp0M1386m.f3432c == c7315Aa1.m240e(c7604Fp0M1386m.f3431b)) {
                c7315Aa1.f262g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(c7604Fp0M1386m, Long.valueOf(j));
    }

    /* renamed from: g0 */
    public final void m17644g0(int i, int i2, List list) throws Throwable {
        this.f26105y.m9737f(1);
        C8332Tp0 c8332Tp0 = this.f26099s;
        c8332Tp0.getClass();
        ArrayList arrayList = (ArrayList) c8332Tp0.f11538c;
        YN1.m9278c(i >= 0 && i <= i2 && i2 <= arrayList.size());
        YN1.m9278c(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C8280Sp0) arrayList.get(i3)).f10996a.mo3166t((C10825qp0) list.get(i3 - i));
        }
        m17651k(c8332Tp0.m7779c(), false);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [gY0, java.lang.Object] */
    /* renamed from: h */
    public final void m17645h(InterfaceC11973zp0 interfaceC11973zp0) {
        C7344Ap0 c7344Ap0 = this.f26098r.f1683k;
        if (c7344Ap0 == null || c7344Ap0.f383a != interfaceC11973zp0) {
            return;
        }
        long j = this.f26074M;
        if (c7344Ap0 != null) {
            YN1.m9281f(c7344Ap0.f394l == null);
            if (c7344Ap0.f386d) {
                c7344Ap0.f383a.mo1891t(j - c7344Ap0.f397o);
            }
        }
        m17658s();
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00cb  */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, zp0] */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17646h0() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3928dR.m17646h0():void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        boolean z;
        C7344Ap0 c7344Ap0;
        int i2;
        C7344Ap0 c7344Ap02;
        try {
            switch (message.what) {
                case 1:
                    boolean z2 = message.arg1 != 0;
                    int i3 = message.arg2;
                    m17624S(i3 >> 4, i3 & 15, z2, true);
                    break;
                case 2:
                    m17637d();
                    break;
                case 3:
                    m17617K((C1847cR) message.obj);
                    break;
                case 4:
                    m17625T((CB0) message.obj);
                    break;
                case 5:
                    this.f26103w = (DX0) message.obj;
                    break;
                case 6:
                    m17636c0(false, true);
                    break;
                case 7:
                    m17664y();
                    return true;
                case 8:
                    m17653l((InterfaceC11973zp0) message.obj);
                    break;
                case 9:
                    m17645h((InterfaceC11973zp0) message.obj);
                    break;
                case 10:
                    m17610B();
                    break;
                case 11:
                    m17627V(message.arg1);
                    break;
                case 12:
                    m17628W(message.arg1 != 0);
                    break;
                case 13:
                    m17621P((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case 14:
                    QB0 qb0 = (QB0) message.obj;
                    qb0.getClass();
                    m17619M(qb0);
                    break;
                case 15:
                    m17620N((QB0) message.obj);
                    break;
                case 16:
                    CB0 cb0 = (CB0) message.obj;
                    m17654n(cb0, cb0.f1239a, true, false);
                    break;
                case 17:
                    m17622Q((C1600ZQ) message.obj);
                    break;
                case 18:
                    m17633b((C1600ZQ) message.obj, message.arg1);
                    break;
                case 19:
                    AbstractC1374Vq.m8597p(message.obj);
                    m17661v();
                    throw null;
                case 20:
                    m17609A(message.arg1, message.arg2, (C11869z01) message.obj);
                    break;
                case 21:
                    m17629X((C11869z01) message.obj);
                    break;
                case 22:
                    m17660u();
                    break;
                case 23:
                    m17623R(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m17610B();
                    m17616J(true);
                    break;
                case 26:
                    m17610B();
                    m17616J(true);
                    break;
                case 27:
                    m17644g0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    m17626U((C0720LQ) message.obj);
                    break;
                case 29:
                    m17662w();
                    break;
            }
        } catch (C0531IQ e) {
            C0531IQ c0531iq = e;
            int i4 = c0531iq.f4926c;
            C7448Cp0 c7448Cp0 = this.f26098r;
            if (i4 == 1 && (c7344Ap02 = c7448Cp0.f1682j) != null) {
                c0531iq = new C0531IQ(c0531iq.getMessage(), c0531iq.getCause(), c0531iq.f104a, c0531iq.f4926c, c0531iq.f4927d, c0531iq.f4928e, c0531iq.f4929f, c0531iq.f4930g, c7344Ap02.f388f.f1042a, c0531iq.f105b, c0531iq.f4932i);
            }
            if (c0531iq.f4932i && (this.f26078Q == null || (i2 = c0531iq.f104a) == 5004 || i2 == 5003)) {
                AbstractC10872rA1.m24176i("Recoverable renderer error", c0531iq);
                C0531IQ c0531iq2 = this.f26078Q;
                if (c0531iq2 != null) {
                    c0531iq2.addSuppressed(c0531iq);
                    c0531iq = this.f26078Q;
                } else {
                    this.f26078Q = c0531iq;
                }
                R71 r71 = this.f26088h;
                Q71 q71M6904a = r71.m6904a(25, c0531iq);
                r71.getClass();
                Message message2 = q71M6904a.f9486a;
                message2.getClass();
                r71.f10020a.sendMessageAtFrontOfQueue(message2);
                q71M6904a.m6575a();
                z = true;
            } else {
                C0531IQ c0531iq3 = this.f26078Q;
                if (c0531iq3 != null) {
                    c0531iq3.addSuppressed(c0531iq);
                    c0531iq = this.f26078Q;
                }
                C0531IQ c0531iq4 = c0531iq;
                AbstractC10872rA1.m24172e("Playback error", c0531iq4);
                if (c0531iq4.f4926c == 1) {
                    if (c7448Cp0.f1681i != c7448Cp0.f1682j) {
                        while (true) {
                            c7344Ap0 = c7448Cp0.f1681i;
                            if (c7344Ap0 == c7448Cp0.f1682j) {
                                break;
                            }
                            c7448Cp0.m1375a();
                        }
                        c7344Ap0.getClass();
                        m17659t();
                        C7396Bp0 c7396Bp0 = c7344Ap0.f388f;
                        C7604Fp0 c7604Fp0 = c7396Bp0.f1042a;
                        long j = c7396Bp0.f1043b;
                        this.f26104x = m17655o(c7604Fp0, j, c7396Bp0.f1044c, j, true, 0);
                    }
                    z = true;
                } else {
                    z = true;
                }
                m17636c0(z, false);
                this.f26104x = this.f26104x.m549e(c0531iq4);
            }
        } catch (C0652KL e2) {
            m17647i(e2.f6028a, e2);
        } catch (C1650aD e3) {
            m17647i(e3.f15395a, e3);
        } catch (C1863ch e4) {
            m17647i(1002, e4);
        } catch (RuntimeException e5) {
            C0531IQ c0531iq5 = new C0531IQ(2, e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            AbstractC10872rA1.m24172e("Playback error", c0531iq5);
            m17636c0(true, false);
            this.f26104x = this.f26104x.m549e(c0531iq5);
        } catch (C10103lA0 e6) {
            boolean z3 = e6.f36930a;
            int i5 = e6.f36931b;
            if (i5 == 1) {
                i = z3 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i = z3 ? 3002 : 3004;
                }
                m17647i(i, e6);
            }
            i = i;
            m17647i(i, e6);
        } catch (IOException e7) {
            m17647i(2000, e7);
        }
        z = true;
        m17659t();
        return z;
    }

    /* renamed from: i */
    public final void m17647i(int i, IOException iOException) {
        C0531IQ c0531iq = new C0531IQ(0, iOException, i);
        C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
        if (c7344Ap0 != null) {
            C7396Bp0 c7396Bp0 = c7344Ap0.f388f;
            c0531iq = new C0531IQ(c0531iq.getMessage(), c0531iq.getCause(), c0531iq.f104a, c0531iq.f4926c, c0531iq.f4927d, c0531iq.f4928e, c0531iq.f4929f, c0531iq.f4930g, c7396Bp0.f1042a, c0531iq.f105b, c0531iq.f4932i);
        }
        AbstractC10872rA1.m24172e("Playback error", c0531iq);
        m17636c0(false, false);
        this.f26104x = this.f26104x.m549e(c0531iq);
    }

    /* renamed from: i0 */
    public final void m17648i0(AbstractC7419Ca1 abstractC7419Ca1, C7604Fp0 c7604Fp0, AbstractC7419Ca1 abstractC7419Ca12, C7604Fp0 c7604Fp02, long j, boolean z) {
        if (!m17632a0(abstractC7419Ca1, c7604Fp0)) {
            CB0 cb0 = c7604Fp0.m2791b() ? CB0.f1238d : this.f26104x.f637o;
            C4168hG c4168hG = this.f26094n;
            if (c4168hG.mo2787e().equals(cb0)) {
                return;
            }
            this.f26088h.m6906d(16);
            c4168hG.mo2784a(cb0);
            m17654n(this.f26104x.f637o, cb0.f1239a, false, false);
            return;
        }
        Object obj = c7604Fp0.f3430a;
        C7315Aa1 c7315Aa1 = this.f26092l;
        int i = abstractC7419Ca1.mo1250g(obj, c7315Aa1).f258c;
        C7367Ba1 c7367Ba1 = this.f26091k;
        abstractC7419Ca1.m1257n(i, c7367Ba1);
        C10185lp0 c10185lp0 = c7367Ba1.f923j;
        C1774bG c1774bG = this.f26100t;
        c1774bG.getClass();
        c1774bG.f16911d = AbstractC7485Dh1.m1802Q(c10185lp0.f37303a);
        c1774bG.f16914g = AbstractC7485Dh1.m1802Q(c10185lp0.f37304b);
        c1774bG.f16915h = AbstractC7485Dh1.m1802Q(c10185lp0.f37305c);
        float f = c10185lp0.f37306d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c1774bG.f16918k = f;
        float f2 = c10185lp0.f37307e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        c1774bG.f16917j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            c1774bG.f16911d = -9223372036854775807L;
        }
        c1774bG.m10440a();
        if (j != -9223372036854775807L) {
            c1774bG.f16912e = m17641f(abstractC7419Ca1, obj, j);
            c1774bG.m10440a();
            return;
        }
        if (!AbstractC7485Dh1.m1812a(!abstractC7419Ca12.m1259p() ? abstractC7419Ca12.mo1256m(abstractC7419Ca12.mo1250g(c7604Fp02.f3430a, c7315Aa1).f258c, c7367Ba1, 0L).f914a : null, c7367Ba1.f914a) || z) {
            c1774bG.f16912e = -9223372036854775807L;
            c1774bG.m10440a();
        }
    }

    /* renamed from: j */
    public final void m17649j(boolean z) {
        C7344Ap0 c7344Ap0 = this.f26098r.f1683k;
        C7604Fp0 c7604Fp0 = c7344Ap0 == null ? this.f26104x.f624b : c7344Ap0.f388f.f1042a;
        boolean zEquals = this.f26104x.f633k.equals(c7604Fp0);
        if (!zEquals) {
            this.f26104x = this.f26104x.m546b(c7604Fp0);
        }
        BB0 bb0 = this.f26104x;
        bb0.f639q = c7344Ap0 == null ? bb0.f641s : c7344Ap0.m328d();
        BB0 bb02 = this.f26104x;
        long j = bb02.f639q;
        C7344Ap0 c7344Ap02 = this.f26098r.f1683k;
        bb02.f640r = c7344Ap02 != null ? Math.max(0L, j - (this.f26074M - c7344Ap02.f397o)) : 0L;
        if ((!zEquals || z) && c7344Ap0 != null && c7344Ap0.f386d) {
            m17642f0(c7344Ap0.f396n);
        }
    }

    /* renamed from: j0 */
    public final void m17650j0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.f26064C = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f26096p.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f26065D = jElapsedRealtime;
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
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17651k(p000.AbstractC7419Ca1 r39, boolean r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3928dR.m17651k(Ca1, boolean):void");
    }

    /* renamed from: k0 */
    public final synchronized void m17652k0(C6226jG c6226jG, long j) {
        this.f26096p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) c6226jG.get()).booleanValue() && j > 0) {
            try {
                this.f26096p.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            this.f26096p.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zp0] */
    /* renamed from: l */
    public final void m17653l(InterfaceC11973zp0 interfaceC11973zp0) throws C0531IQ {
        C7448Cp0 c7448Cp0 = this.f26098r;
        C7344Ap0 c7344Ap0 = c7448Cp0.f1683k;
        if (c7344Ap0 == null || c7344Ap0.f383a != interfaceC11973zp0) {
            return;
        }
        float f = this.f26094n.mo2787e().f1239a;
        AbstractC7419Ca1 abstractC7419Ca1 = this.f26104x.f623a;
        c7344Ap0.f386d = true;
        c7344Ap0.f395m = c7344Ap0.f383a.mo1888q();
        C8875bc1 c8875bc1M332h = c7344Ap0.m332h(f, abstractC7419Ca1);
        C7396Bp0 c7396Bp0 = c7344Ap0.f388f;
        long j = c7396Bp0.f1046e;
        long j2 = c7396Bp0.f1043b;
        long jM325a = c7344Ap0.m325a(c8875bc1M332h, (j == -9223372036854775807L || j2 < j) ? j2 : Math.max(0L, j - 1), false, new boolean[c7344Ap0.f391i.length]);
        long j3 = c7344Ap0.f397o;
        C7396Bp0 c7396Bp02 = c7344Ap0.f388f;
        c7344Ap0.f397o = (c7396Bp02.f1043b - jM325a) + j3;
        c7344Ap0.f388f = c7396Bp02.m883b(jM325a);
        m17642f0(c7344Ap0.f396n);
        if (c7344Ap0 == c7448Cp0.f1681i) {
            m17613E(c7344Ap0.f388f.f1043b);
            m17639e(new boolean[this.f26081a.length], c7448Cp0.f1682j.m329e());
            BB0 bb0 = this.f26104x;
            C7604Fp0 c7604Fp0 = bb0.f624b;
            long j4 = c7344Ap0.f388f.f1043b;
            this.f26104x = m17655o(c7604Fp0, j4, bb0.f625c, j4, false, 5);
        }
        m17658s();
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public final void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        this.f26088h.m6904a(9, (InterfaceC11973zp0) interfaceC9511gY0).m6576b();
    }

    /* renamed from: n */
    public final void m17654n(CB0 cb0, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f26105y.m9737f(1);
            }
            this.f26104x = this.f26104x.m550f(cb0);
        }
        float f2 = cb0.f1239a;
        C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
        while (true) {
            i = 0;
            if (c7344Ap0 == null) {
                break;
            }
            InterfaceC6237jR[] interfaceC6237jRArr = (InterfaceC6237jR[]) c7344Ap0.f396n.f17090c;
            int length = interfaceC6237jRArr.length;
            while (i < length) {
                InterfaceC6237jR interfaceC6237jR = interfaceC6237jRArr[i];
                if (interfaceC6237jR != null) {
                    interfaceC6237jR.mo2734p(f2);
                }
                i++;
            }
            c7344Ap0 = c7344Ap0.f394l;
        }
        AbstractC0043Ag[] abstractC0043AgArr = this.f26081a;
        int length2 = abstractC0043AgArr.length;
        while (i < length2) {
            AbstractC0043Ag abstractC0043Ag = abstractC0043AgArr[i];
            if (abstractC0043Ag != null) {
                abstractC0043Ag.mo279y(f, cb0.f1239a);
            }
            i++;
        }
    }

    /* renamed from: o */
    public final BB0 m17655o(C7604Fp0 c7604Fp0, long j, long j2, long j3, boolean z, int i) {
        C8201Rb1 c8201Rb1;
        C8875bc1 c8875bc1;
        List list;
        C9367fQ0 c9367fQ0M5273h;
        boolean z2;
        int i2;
        int i3;
        this.f26077P = (!this.f26077P && j == this.f26104x.f641s && c7604Fp0.equals(this.f26104x.f624b)) ? false : true;
        m17612D();
        BB0 bb0 = this.f26104x;
        C8201Rb1 c8201Rb12 = bb0.f630h;
        C8875bc1 c8875bc12 = bb0.f631i;
        List list2 = bb0.f632j;
        if (this.f26099s.f11536a) {
            C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
            C8201Rb1 c8201Rb13 = c7344Ap0 == null ? C8201Rb1.f10320d : c7344Ap0.f395m;
            C8875bc1 c8875bc13 = c7344Ap0 == null ? this.f26085e : c7344Ap0.f396n;
            InterfaceC6237jR[] interfaceC6237jRArr = (InterfaceC6237jR[]) c8875bc13.f17090c;
            M70 m70 = new M70(4);
            int length = interfaceC6237jRArr.length;
            int i4 = 0;
            boolean z3 = false;
            while (i4 < length) {
                InterfaceC6237jR interfaceC6237jR = interfaceC6237jRArr[i4];
                if (interfaceC6237jR == null) {
                    i3 = 1;
                } else {
                    C7660Gr0 c7660Gr0 = interfaceC6237jR.mo2728i(0).f40972k;
                    if (c7660Gr0 == null) {
                        m70.m3755a(new C7660Gr0(new InterfaceC7556Er0[0]));
                        i3 = 1;
                    } else {
                        m70.m3755a(c7660Gr0);
                        i3 = 1;
                        z3 = true;
                    }
                }
                i4 += i3;
            }
            if (z3) {
                c9367fQ0M5273h = m70.m5273h();
            } else {
                N70 n70 = P70.f8867b;
                c9367fQ0M5273h = C9367fQ0.f27184e;
            }
            if (c7344Ap0 != null) {
                C7396Bp0 c7396Bp0 = c7344Ap0.f388f;
                if (c7396Bp0.f1044c != j2) {
                    c7344Ap0.f388f = c7396Bp0.m882a(j2);
                }
            }
            C7344Ap0 c7344Ap02 = this.f26098r.f1681i;
            if (c7344Ap02 != null) {
                C8875bc1 c8875bc14 = c7344Ap02.f396n;
                boolean z4 = false;
                int i5 = 0;
                while (true) {
                    AbstractC0043Ag[] abstractC0043AgArr = this.f26081a;
                    if (i5 >= abstractC0043AgArr.length) {
                        z2 = true;
                        break;
                    }
                    if (c8875bc14.m10467g(i5)) {
                        i2 = 1;
                        if (abstractC0043AgArr[i5].f307b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((ZQ0[]) c8875bc14.f17089b)[i5].f14890a != 0) {
                            z4 = true;
                        }
                    } else {
                        i2 = 1;
                    }
                    i5 += i2;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f26071J) {
                    this.f26071J = z5;
                    if (!z5 && this.f26104x.f638p) {
                        this.f26088h.m6907e(2);
                    }
                }
            }
            list = c9367fQ0M5273h;
            c8201Rb1 = c8201Rb13;
            c8875bc1 = c8875bc13;
        } else if (c7604Fp0.equals(bb0.f624b)) {
            c8201Rb1 = c8201Rb12;
            c8875bc1 = c8875bc12;
            list = list2;
        } else {
            c8201Rb1 = C8201Rb1.f10320d;
            c8875bc1 = this.f26085e;
            list = C9367fQ0.f27184e;
        }
        if (z) {
            C1664aR c1664aR = this.f26105y;
            if (!c1664aR.f15512e || c1664aR.f15510c == 5) {
                c1664aR.f15511d = true;
                c1664aR.f15512e = true;
                c1664aR.f15510c = i;
            } else {
                YN1.m9278c(i == 5);
            }
        }
        BB0 bb02 = this.f26104x;
        long j4 = bb02.f639q;
        C7344Ap0 c7344Ap03 = this.f26098r.f1683k;
        return bb02.m547c(c7604Fp0, j, j2, j3, c7344Ap03 == null ? 0L : Math.max(0L, j4 - (this.f26074M - c7344Ap03.f397o)), c8201Rb1, c8875bc1, list);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gY0, java.lang.Object, zp0] */
    /* renamed from: p */
    public final boolean m17656p() {
        C7344Ap0 c7344Ap0 = this.f26098r.f1683k;
        if (c7344Ap0 == null) {
            return false;
        }
        try {
            ?? r2 = c7344Ap0.f383a;
            if (c7344Ap0.f386d) {
                for (InterfaceC9121dV0 interfaceC9121dV0 : c7344Ap0.f385c) {
                    if (interfaceC9121dV0 != null) {
                        interfaceC9121dV0.mo34a();
                    }
                }
            } else {
                r2.mo1881g();
            }
            return (!c7344Ap0.f386d ? 0L : r2.mo1880e()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean m17657r() {
        C7344Ap0 c7344Ap0 = this.f26098r.f1681i;
        long j = c7344Ap0.f388f.f1046e;
        return c7344Ap0.f386d && (j == -9223372036854775807L || this.f26104x.f641s < j || !m17631Z());
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [gY0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [gY0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, zp0] */
    /* renamed from: s */
    public final void m17658s() {
        boolean zM17518c;
        if (m17656p()) {
            C7344Ap0 c7344Ap0 = this.f26098r.f1683k;
            long jMo1880e = !c7344Ap0.f386d ? 0L : c7344Ap0.f383a.mo1880e();
            C7344Ap0 c7344Ap02 = this.f26098r.f1683k;
            long jMax = c7344Ap02 == null ? 0L : Math.max(0L, jMo1880e - (this.f26074M - c7344Ap02.f397o));
            C7344Ap0 c7344Ap03 = this.f26098r.f1681i;
            long j = m17632a0(this.f26104x.f623a, c7344Ap0.f388f.f1042a) ? this.f26100t.f16916i : -9223372036854775807L;
            NB0 nb0 = this.f26102v;
            AbstractC7419Ca1 abstractC7419Ca1 = this.f26104x.f623a;
            float f = this.f26094n.mo2787e().f1239a;
            boolean z = this.f26104x.f634l;
            C9151dk0 c9151dk0 = new C9151dk0(nb0, jMax, f, this.f26064C, j);
            zM17518c = this.f26086f.m17518c(c9151dk0);
            C7344Ap0 c7344Ap04 = this.f26098r.f1681i;
            if (!zM17518c && c7344Ap04.f386d && jMax < 500000 && this.f26093m > 0) {
                c7344Ap04.f383a.mo1883i(this.f26104x.f641s);
                zM17518c = this.f26086f.m17518c(c9151dk0);
            }
        } else {
            zM17518c = false;
        }
        this.f26066E = zM17518c;
        if (zM17518c) {
            C7344Ap0 c7344Ap05 = this.f26098r.f1683k;
            long j2 = this.f26074M;
            float f2 = this.f26094n.mo2787e().f1239a;
            long j3 = this.f26065D;
            YN1.m9281f(c7344Ap05.f394l == null);
            long j4 = j2 - c7344Ap05.f397o;
            ?? r1 = c7344Ap05.f383a;
            C11327uk0 c11327uk0 = new C11327uk0();
            c11327uk0.f43840a = j4;
            YN1.m9278c(f2 > 0.0f || f2 == -3.4028235E38f);
            c11327uk0.f43841b = f2;
            YN1.m9278c(j3 >= 0 || j3 == -9223372036854775807L);
            c11327uk0.f43842c = j3;
            r1.mo1889r(new C11455vk0(c11327uk0));
        }
        m17640e0();
    }

    /* renamed from: t */
    public final void m17659t() {
        C1664aR c1664aR = this.f26105y;
        BB0 bb0 = this.f26104x;
        boolean z = c1664aR.f15511d | (((BB0) c1664aR.f15513f) != bb0);
        c1664aR.f15511d = z;
        c1664aR.f15513f = bb0;
        if (z) {
            C1474XQ c1474xq = this.f26097q.f9617a;
            c1474xq.f13727j.m6905c(new RunnableC1096RQ(c1474xq, 0, c1664aR));
            this.f26105y = new C1664aR(this.f26104x);
        }
    }

    /* renamed from: u */
    public final void m17660u() throws Throwable {
        m17651k(this.f26099s.m7779c(), true);
    }

    /* renamed from: v */
    public final void m17661v() {
        this.f26105y.m9737f(1);
        throw null;
    }

    /* renamed from: w */
    public final void m17662w() {
        this.f26105y.m9737f(1);
        int i = 0;
        m17611C(false, false, false, true);
        C3917dG c3917dG = this.f26086f;
        c3917dG.getClass();
        long id = Thread.currentThread().getId();
        long j = c3917dG.f25915j;
        YN1.m9282g(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        c3917dG.f25915j = id;
        HashMap map = c3917dG.f25914i;
        NB0 nb0 = this.f26102v;
        if (!map.containsKey(nb0)) {
            map.put(nb0, new C1836cG());
        }
        C1836cG c1836cG = (C1836cG) map.get(nb0);
        c1836cG.getClass();
        int i2 = c3917dG.f25911f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        c1836cG.f17399b = i2;
        c1836cG.f17398a = false;
        m17630Y(this.f26104x.f623a.m1259p() ? 4 : 2);
        C0959PE c0959pe = (C0959PE) this.f26087g;
        c0959pe.getClass();
        C8332Tp0 c8332Tp0 = this.f26099s;
        YN1.m9281f(!c8332Tp0.f11536a);
        c8332Tp0.f11547l = c0959pe;
        while (true) {
            ArrayList arrayList = (ArrayList) c8332Tp0.f11538c;
            if (i >= arrayList.size()) {
                c8332Tp0.f11536a = true;
                this.f26088h.m6907e(2);
                return;
            } else {
                C8280Sp0 c8280Sp0 = (C8280Sp0) arrayList.get(i);
                c8332Tp0.m7783g(c8280Sp0);
                ((HashSet) c8332Tp0.f11543h).add(c8280Sp0);
                i++;
            }
        }
    }

    /* renamed from: x */
    public final synchronized boolean m17663x() {
        if (!this.f26106z && this.f26090j.getThread().isAlive()) {
            this.f26088h.m6907e(7);
            m17652k0(new C6226jG(6, this), this.f26101u);
            return this.f26106z;
        }
        return true;
    }

    /* renamed from: y */
    public final void m17664y() {
        try {
            m17611C(true, false, true, false);
            m17665z();
            C3917dG c3917dG = this.f26086f;
            if (c3917dG.f25914i.remove(this.f26102v) != null) {
                c3917dG.m17519d();
            }
            if (c3917dG.f25914i.isEmpty()) {
                c3917dG.f25915j = -1L;
            }
            m17630Y(1);
            HandlerThread handlerThread = this.f26089i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f26106z = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f26089i;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f26106z = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final void m17665z() {
        for (int i = 0; i < this.f26081a.length; i++) {
            AbstractC0043Ag abstractC0043Ag = this.f26083c[i];
            synchronized (abstractC0043Ag.f306a) {
                abstractC0043Ag.f322q = null;
            }
            AbstractC0043Ag abstractC0043Ag2 = this.f26081a[i];
            YN1.m9281f(abstractC0043Ag2.f313h == 0);
            abstractC0043Ag2.mo270p();
        }
    }
}
