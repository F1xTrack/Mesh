package p000;

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
public final class E30 implements InterfaceC9919jk0, InterfaceC10303mk0, InterfaceC9511gY0, InterfaceC1538YR, InterfaceC8860bV0 {

    /* renamed from: Y */
    public static final Set f2392Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A */
    public int f2393A;

    /* renamed from: B */
    public int f2394B;

    /* renamed from: C */
    public boolean f2395C;

    /* renamed from: D */
    public boolean f2396D;

    /* renamed from: E */
    public int f2397E;

    /* renamed from: F */
    public C6686qX f2398F;

    /* renamed from: G */
    public C6686qX f2399G;

    /* renamed from: H */
    public boolean f2400H;

    /* renamed from: I */
    public C8201Rb1 f2401I;

    /* renamed from: J */
    public Set f2402J;

    /* renamed from: K */
    public int[] f2403K;

    /* renamed from: L */
    public int f2404L;

    /* renamed from: M */
    public boolean f2405M;

    /* renamed from: N */
    public boolean[] f2406N;

    /* renamed from: O */
    public boolean[] f2407O;

    /* renamed from: P */
    public long f2408P;

    /* renamed from: Q */
    public long f2409Q;

    /* renamed from: R */
    public boolean f2410R;

    /* renamed from: S */
    public boolean f2411S;

    /* renamed from: T */
    public boolean f2412T;

    /* renamed from: U */
    public boolean f2413U;

    /* renamed from: V */
    public long f2414V;

    /* renamed from: W */
    public C0589JL f2415W;

    /* renamed from: X */
    public C9832j30 f2416X;

    /* renamed from: a */
    public final String f2417a;

    /* renamed from: b */
    public final int f2418b;

    /* renamed from: c */
    public final C8170Qm0 f2419c;

    /* renamed from: d */
    public final C9576h30 f2420d;

    /* renamed from: e */
    public final C6224jE f2421e;

    /* renamed from: f */
    public final C6686qX f2422f;

    /* renamed from: g */
    public final InterfaceC1091RL f2423g;

    /* renamed from: h */
    public final C0903OL f2424h;

    /* renamed from: i */
    public final C3979eG f2425i;

    /* renamed from: j */
    public final C8539Xo1 f2426j = new C8539Xo1("Loader:HlsSampleStreamWrapper", 2);

    /* renamed from: k */
    public final C1356VY f2427k;

    /* renamed from: l */
    public final int f2428l;

    /* renamed from: m */
    public final X11 f2429m;

    /* renamed from: n */
    public final ArrayList f2430n;

    /* renamed from: o */
    public final List f2431o;

    /* renamed from: p */
    public final B30 f2432p;

    /* renamed from: q */
    public final B30 f2433q;

    /* renamed from: r */
    public final Handler f2434r;

    /* renamed from: s */
    public final ArrayList f2435s;

    /* renamed from: t */
    public final Map f2436t;

    /* renamed from: u */
    public AbstractC1061Qr f2437u;

    /* renamed from: v */
    public D30[] f2438v;

    /* renamed from: w */
    public int[] f2439w;

    /* renamed from: x */
    public final HashSet f2440x;

    /* renamed from: y */
    public final SparseIntArray f2441y;

    /* renamed from: z */
    public C30 f2442z;

    /* JADX WARN: Type inference failed for: r1v12, types: [B30] */
    /* JADX WARN: Type inference failed for: r1v13, types: [B30] */
    public E30(String str, int i, C8170Qm0 c8170Qm0, C9576h30 c9576h30, Map map, C6224jE c6224jE, long j, C6686qX c6686qX, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol, C3979eG c3979eG, C1356VY c1356vy, int i2) {
        this.f2417a = str;
        this.f2418b = i;
        this.f2419c = c8170Qm0;
        this.f2420d = c9576h30;
        this.f2436t = map;
        this.f2421e = c6224jE;
        this.f2422f = c6686qX;
        this.f2423g = interfaceC1091RL;
        this.f2424h = c0903ol;
        this.f2425i = c3979eG;
        this.f2427k = c1356vy;
        this.f2428l = i2;
        X11 x11 = new X11(8);
        x11.f13488c = null;
        x11.f13487b = false;
        x11.f13489d = null;
        this.f2429m = x11;
        this.f2439w = new int[0];
        Set set = f2392Y;
        this.f2440x = new HashSet(set.size());
        this.f2441y = new SparseIntArray(set.size());
        this.f2438v = new D30[0];
        this.f2407O = new boolean[0];
        this.f2406N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f2430n = arrayList;
        this.f2431o = Collections.unmodifiableList(arrayList);
        this.f2435s = new ArrayList();
        final int i3 = 0;
        this.f2432p = new Runnable(this) { // from class: B30

            /* renamed from: b */
            public final /* synthetic */ E30 f529b;

            {
                this.f529b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f529b.m1992C();
                        break;
                    default:
                        E30 e30 = this.f529b;
                        e30.f2395C = true;
                        e30.m1992C();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f2433q = new Runnable(this) { // from class: B30

            /* renamed from: b */
            public final /* synthetic */ E30 f529b;

            {
                this.f529b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f529b.m1992C();
                        break;
                    default:
                        E30 e30 = this.f529b;
                        e30.f2395C = true;
                        e30.m1992C();
                        break;
                }
            }
        };
        this.f2434r = AbstractC7485Dh1.m1829n(null);
        this.f2408P = j;
        this.f2409Q = j;
    }

    /* renamed from: A */
    public static int m1988A(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: j */
    public static C1404WJ m1989j(int i, int i2) {
        AbstractC10872rA1.m24175h("Unmapped track with id " + i + " of type " + i2);
        return new C1404WJ();
    }

    /* renamed from: u */
    public static C6686qX m1990u(C6686qX c6686qX, C6686qX c6686qX2, boolean z) {
        String strM9161d;
        String strM1835t;
        if (c6686qX == null) {
            return c6686qX2;
        }
        String str = c6686qX2.f40974m;
        int iM9165h = AbstractC8544Xr0.m9165h(str);
        String str2 = c6686qX.f40971j;
        if (AbstractC7485Dh1.m1834s(iM9165h, str2) == 1) {
            strM1835t = AbstractC7485Dh1.m1835t(iM9165h, str2);
            strM9161d = AbstractC8544Xr0.m9161d(strM1835t);
        } else {
            String strM9159b = AbstractC8544Xr0.m9159b(str2, str);
            strM9161d = str;
            strM1835t = strM9159b;
        }
        C6623pX c6623pXM24020a = c6686qX2.m24020a();
        c6623pXM24020a.f40150a = c6686qX.f40962a;
        c6623pXM24020a.f40151b = c6686qX.f40963b;
        c6623pXM24020a.f40152c = P70.m6234u(c6686qX.f40964c);
        c6623pXM24020a.f40153d = c6686qX.f40965d;
        c6623pXM24020a.f40154e = c6686qX.f40966e;
        c6623pXM24020a.f40155f = c6686qX.f40967f;
        c6623pXM24020a.f40156g = z ? c6686qX.f40968g : -1;
        c6623pXM24020a.f40157h = z ? c6686qX.f40969h : -1;
        c6623pXM24020a.f40158i = strM1835t;
        if (iM9165h == 2) {
            c6623pXM24020a.f40167r = c6686qX.f40980s;
            c6623pXM24020a.f40168s = c6686qX.f40981t;
            c6623pXM24020a.f40169t = c6686qX.f40982u;
        }
        if (strM9161d != null) {
            c6623pXM24020a.f40161l = AbstractC8544Xr0.m9171n(strM9161d);
        }
        int i = c6686qX.f40951A;
        if (i != -1 && iM9165h == 1) {
            c6623pXM24020a.f40175z = i;
        }
        C7660Gr0 c7660Gr0M3182b = c6686qX.f40972k;
        if (c7660Gr0M3182b != null) {
            C7660Gr0 c7660Gr0 = c6686qX2.f40972k;
            if (c7660Gr0 != null) {
                c7660Gr0M3182b = c7660Gr0.m3182b(c7660Gr0M3182b);
            }
            c6623pXM24020a.f40159j = c7660Gr0M3182b;
        }
        return new C6686qX(c6623pXM24020a);
    }

    /* renamed from: B */
    public final boolean m1991B() {
        return this.f2409Q != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final void m1992C() {
        int i;
        int i2 = 0;
        if (!this.f2400H && this.f2403K == null && this.f2395C) {
            for (D30 d30 : this.f2438v) {
                if (d30.m10735u() == null) {
                    return;
                }
            }
            C8201Rb1 c8201Rb1 = this.f2401I;
            if (c8201Rb1 != null) {
                int i3 = c8201Rb1.f10321a;
                int[] iArr = new int[i3];
                this.f2403K = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        D30[] d30Arr = this.f2438v;
                        if (i5 < d30Arr.length) {
                            C6686qX c6686qXM10735u = d30Arr[i5].m10735u();
                            YN1.m9283h(c6686qXM10735u);
                            C6686qX c6686qX = this.f2401I.m7046a(i4).f9690d[0];
                            String str = c6686qX.f40974m;
                            String str2 = c6686qXM10735u.f40974m;
                            int iM9165h = AbstractC8544Xr0.m9165h(str2);
                            if (iM9165h != 3) {
                                if (iM9165h == AbstractC8544Xr0.m9165h(str)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (AbstractC7485Dh1.m1812a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || c6686qXM10735u.f40956F == c6686qX.f40956F)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.f2403K[i4] = i5;
                }
                Iterator it = this.f2435s.iterator();
                while (it.hasNext()) {
                    ((A30) it.next()).m35b();
                }
                return;
            }
            int length = this.f2438v.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                C6686qX c6686qXM10735u2 = this.f2438v[i6].m10735u();
                YN1.m9283h(c6686qXM10735u2);
                String str3 = c6686qXM10735u2.f40974m;
                int i9 = AbstractC8544Xr0.m9170m(str3) ? 2 : AbstractC8544Xr0.m9167j(str3) ? 1 : AbstractC8544Xr0.m9169l(str3) ? 3 : -2;
                if (m1988A(i9) > m1988A(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            C8149Qb1 c8149Qb1 = this.f2420d.f28191h;
            int i10 = c8149Qb1.f9687a;
            this.f2404L = -1;
            this.f2403K = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.f2403K[i11] = i11;
            }
            C8149Qb1[] c8149Qb1Arr = new C8149Qb1[length];
            int i12 = 0;
            while (i12 < length) {
                C6686qX c6686qXM10735u3 = this.f2438v[i12].m10735u();
                YN1.m9283h(c6686qXM10735u3);
                String str4 = this.f2417a;
                C6686qX c6686qX2 = this.f2422f;
                if (i12 == i7) {
                    C6686qX[] c6686qXArr = new C6686qX[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        C6686qX c6686qXM24023e = c8149Qb1.f9690d[i13];
                        if (i8 == 1 && c6686qX2 != null) {
                            c6686qXM24023e = c6686qXM24023e.m24023e(c6686qX2);
                        }
                        c6686qXArr[i13] = i10 == 1 ? c6686qXM10735u3.m24023e(c6686qXM24023e) : m1990u(c6686qXM24023e, c6686qXM10735u3, true);
                    }
                    c8149Qb1Arr[i12] = new C8149Qb1(str4, c6686qXArr);
                    this.f2404L = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !AbstractC8544Xr0.m9167j(c6686qXM10735u3.f40974m)) {
                        c6686qX2 = null;
                    }
                    StringBuilder sbM5762k = AbstractC0852NX.m5762k(str4, ":muxed:");
                    sbM5762k.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    c8149Qb1Arr[i12] = new C8149Qb1(sbM5762k.toString(), m1990u(c6686qX2, c6686qXM10735u3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.f2401I = m2000k(c8149Qb1Arr);
            YN1.m9281f(this.f2402J == null ? 1 : i14);
            this.f2402J = Collections.emptySet();
            this.f2396D = true;
            this.f2419c.m6781x();
        }
    }

    /* renamed from: D */
    public final void m1993D() throws IOException {
        this.f2426j.mo858a();
        C9576h30 c9576h30 = this.f2420d;
        C1863ch c1863ch = c9576h30.f28198o;
        if (c1863ch != null) {
            throw c1863ch;
        }
        Uri uri = c9576h30.f28199p;
        if (uri == null || !c9576h30.f28203t) {
            return;
        }
        C0268EF c0268ef = (C0268EF) c9576h30.f28190g.f3100d.get(uri);
        c0268ef.f2566b.mo858a();
        IOException iOException = c0268ef.f2574j;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* renamed from: E */
    public final void m1994E(C8149Qb1[] c8149Qb1Arr, int... iArr) {
        this.f2401I = m2000k(c8149Qb1Arr);
        this.f2402J = new HashSet();
        for (int i : iArr) {
            this.f2402J.add(this.f2401I.m7046a(i));
        }
        this.f2404L = 0;
        this.f2434r.post(new RunnableC0204DE(16, this.f2419c));
        this.f2396D = true;
    }

    /* renamed from: F */
    public final void m1995F() {
        for (D30 d30 : this.f2438v) {
            d30.m10717C(this.f2410R);
        }
        this.f2410R = false;
    }

    /* renamed from: G */
    public final boolean m1996G(long j, boolean z) {
        C9832j30 c9832j30;
        boolean z2;
        this.f2408P = j;
        if (m1991B()) {
            this.f2409Q = j;
            return true;
        }
        boolean z3 = this.f2420d.f28200q;
        ArrayList arrayList = this.f2430n;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                c9832j30 = (C9832j30) arrayList.get(i);
                if (c9832j30.f9817g == j) {
                    break;
                }
            }
            c9832j30 = null;
        } else {
            c9832j30 = null;
        }
        if (this.f2395C && !z) {
            int length = this.f2438v.length;
            for (int i2 = 0; i2 < length; i2++) {
                D30 d30 = this.f2438v[i2];
                if (!(c9832j30 != null ? d30.m10719E(c9832j30.m21973f(i2)) : d30.m10720F(j, false)) && (this.f2407O[i2] || !this.f2405M)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.f2409Q = j;
        this.f2412T = false;
        arrayList.clear();
        C8539Xo1 c8539Xo1 = this.f2426j;
        if (c8539Xo1.m9127I()) {
            if (this.f2395C) {
                for (D30 d302 : this.f2438v) {
                    d302.m10725j();
                }
            }
            c8539Xo1.m9147p();
        } else {
            c8539Xo1.f13983d = null;
            m1995F();
        }
        return true;
    }

    @Override // p000.InterfaceC8860bV0
    /* renamed from: a */
    public final void mo1997a() {
        this.f2434r.post(this.f2432p);
    }

    @Override // p000.InterfaceC10303mk0
    /* renamed from: c */
    public final void mo1998c() {
        for (D30 d30 : this.f2438v) {
            d30.m10717C(true);
            InterfaceC0715LL interfaceC0715LL = d30.f17554h;
            if (interfaceC0715LL != null) {
                interfaceC0715LL.mo4951d(d30.f17551e);
                d30.f17554h = null;
                d30.f17553g = null;
            }
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        if (m1991B()) {
            return this.f2409Q;
        }
        if (this.f2412T) {
            return Long.MIN_VALUE;
        }
        return m2008z().f9818h;
    }

    /* renamed from: f */
    public final void m1999f() {
        YN1.m9281f(this.f2396D);
        this.f2401I.getClass();
        this.f2402J.getClass();
    }

    /* renamed from: k */
    public final C8201Rb1 m2000k(C8149Qb1[] c8149Qb1Arr) {
        for (int i = 0; i < c8149Qb1Arr.length; i++) {
            C8149Qb1 c8149Qb1 = c8149Qb1Arr[i];
            C6686qX[] c6686qXArr = new C6686qX[c8149Qb1.f9687a];
            for (int i2 = 0; i2 < c8149Qb1.f9687a; i2++) {
                C6686qX c6686qX = c8149Qb1.f9690d[i2];
                int iMo6999j = this.f2423g.mo6999j(c6686qX);
                C6623pX c6623pXM24020a = c6686qX.m24020a();
                c6623pXM24020a.f40149I = iMo6999j;
                c6686qXArr[i2] = new C6686qX(c6623pXM24020a);
            }
            c8149Qb1Arr[i] = new C8149Qb1(c8149Qb1.f9688b, c6686qXArr);
        }
        return new C8201Rb1(c8149Qb1Arr);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f2426j.m9127I();
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public final void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        AbstractC1061Qr abstractC1061Qr = (AbstractC1061Qr) interfaceC10175lk0;
        this.f2437u = null;
        long j3 = abstractC1061Qr.f9811a;
        Uri uri = abstractC1061Qr.f9819i.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f2425i.getClass();
        this.f2427k.m8472J(c9535gk0, abstractC1061Qr.f9813c, this.f2418b, abstractC1061Qr.f9814d, abstractC1061Qr.f9815e, abstractC1061Qr.f9816f, abstractC1061Qr.f9817g, abstractC1061Qr.f9818h);
        if (z) {
            return;
        }
        if (m1991B() || this.f2397E == 0) {
            m1995F();
        }
        if (this.f2397E > 0) {
            this.f2419c.mo1885m(this);
        }
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public final C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        boolean zMo2733o;
        C9407fk0 c9407fk0;
        int i2;
        AbstractC1061Qr abstractC1061Qr = (AbstractC1061Qr) interfaceC10175lk0;
        boolean z = abstractC1061Qr instanceof C9832j30;
        if (z && !((C9832j30) abstractC1061Qr).f34877K && (iOException instanceof C11243u40) && ((i2 = ((C11243u40) iOException).f43483d) == 410 || i2 == 404)) {
            return C8539Xo1.f13977g;
        }
        long j3 = abstractC1061Qr.f9819i.f6986b;
        Uri uri = abstractC1061Qr.f9819i.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        AbstractC7485Dh1.m1819d0(abstractC1061Qr.f9817g);
        AbstractC7485Dh1.m1819d0(abstractC1061Qr.f9818h);
        C0986Pf c0986Pf = new C0986Pf(iOException, i, 9);
        C9576h30 c9576h30 = this.f2420d;
        C9279ek0 c9279ek0M7033a = RY1.m7033a(c9576h30.f28201r);
        C3979eG c3979eG = this.f2425i;
        c3979eG.getClass();
        C9407fk0 c9407fk0M17890c = C3979eG.m17890c(c9279ek0M7033a, c0986Pf);
        if (c9407fk0M17890c == null || c9407fk0M17890c.f27363a != 2) {
            zMo2733o = false;
        } else {
            InterfaceC6237jR interfaceC6237jR = c9576h30.f28201r;
            zMo2733o = interfaceC6237jR.mo2733o(interfaceC6237jR.mo2737t(c9576h30.f28191h.m6736b(abstractC1061Qr.f9814d)), c9407fk0M17890c.f27364b);
        }
        if (zMo2733o) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.f2430n;
                YN1.m9281f(((C9832j30) arrayList.remove(arrayList.size() - 1)) == abstractC1061Qr);
                if (arrayList.isEmpty()) {
                    this.f2409Q = this.f2408P;
                } else {
                    ((C9832j30) AbstractC11239u22.m25079b(arrayList)).f34876J = true;
                }
            }
            c9407fk0 = C8539Xo1.f13978h;
        } else {
            long jMo17892e = c3979eG.mo17892e(c0986Pf);
            c9407fk0 = jMo17892e != -9223372036854775807L ? new C9407fk0(0, jMo17892e, false) : C8539Xo1.f13979i;
        }
        boolean zM18291a = c9407fk0.m18291a();
        this.f2427k.m8477O(c9535gk0, abstractC1061Qr.f9813c, this.f2418b, abstractC1061Qr.f9814d, abstractC1061Qr.f9815e, abstractC1061Qr.f9816f, abstractC1061Qr.f9817g, abstractC1061Qr.f9818h, iOException, !zM18291a);
        if (!zM18291a) {
            this.f2437u = null;
        }
        if (zMo2733o) {
            if (this.f2396D) {
                this.f2419c.mo1885m(this);
            } else {
                C11327uk0 c11327uk0 = new C11327uk0();
                c11327uk0.f43840a = this.f2408P;
                mo1889r(new C11455vk0(c11327uk0));
            }
        }
        return c9407fk0;
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: p */
    public final void mo2003p() {
        this.f2413U = true;
        this.f2434r.post(this.f2433q);
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
    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1889r(p000.C11455vk0 r66) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.E30.mo1889r(vk0):boolean");
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        if (this.f2412T) {
            return Long.MIN_VALUE;
        }
        if (m1991B()) {
            return this.f2409Q;
        }
        long jMax = this.f2408P;
        C9832j30 c9832j30M2008z = m2008z();
        if (!c9832j30M2008z.f34874H) {
            ArrayList arrayList = this.f2430n;
            c9832j30M2008z = arrayList.size() > 1 ? (C9832j30) AbstractC7222ym.m26228e(2, arrayList) : null;
        }
        if (c9832j30M2008z != null) {
            jMax = Math.max(jMax, c9832j30M2008z.f9818h);
        }
        if (this.f2395C) {
            for (D30 d30 : this.f2438v) {
                jMax = Math.max(jMax, d30.m10729o());
            }
        }
        return jMax;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        C8539Xo1 c8539Xo1 = this.f2426j;
        if (c8539Xo1.m9125G() || m1991B()) {
            return;
        }
        boolean zM9127I = c8539Xo1.m9127I();
        C9576h30 c9576h30 = this.f2420d;
        List list = this.f2431o;
        if (zM9127I) {
            this.f2437u.getClass();
            if (c9576h30.f28198o != null ? false : c9576h30.f28201r.mo2726g(j, this.f2437u, list)) {
                c8539Xo1.m9147p();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && c9576h30.m18708b((C9832j30) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            m2007y(size);
        }
        int size2 = (c9576h30.f28198o != null || c9576h30.f28201r.length() < 2) ? list.size() : c9576h30.f28201r.mo2730k(j, list);
        if (size2 < this.f2430n.size()) {
            m2007y(size2);
        }
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public final void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        AbstractC1061Qr abstractC1061Qr = (AbstractC1061Qr) interfaceC10175lk0;
        this.f2437u = null;
        C9576h30 c9576h30 = this.f2420d;
        if (abstractC1061Qr instanceof C9064d30) {
            C9064d30 c9064d30 = (C9064d30) abstractC1061Qr;
            c9576h30.f28197n = c9064d30.f25783j;
            Uri uri = c9064d30.f9812b.f26595a;
            byte[] bArr = c9064d30.f25785l;
            bArr.getClass();
            QQ0 qq0 = c9576h30.f28193j;
            qq0.getClass();
            uri.getClass();
        }
        long j3 = abstractC1061Qr.f9811a;
        Uri uri2 = abstractC1061Qr.f9819i.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f2425i.getClass();
        this.f2427k.m8475M(c9535gk0, abstractC1061Qr.f9813c, this.f2418b, abstractC1061Qr.f9814d, abstractC1061Qr.f9815e, abstractC1061Qr.f9816f, abstractC1061Qr.f9817g, abstractC1061Qr.f9818h);
        if (this.f2396D) {
            this.f2419c.mo1885m(this);
            return;
        }
        C11327uk0 c11327uk0 = new C11327uk0();
        c11327uk0.f43840a = this.f2408P;
        mo1889r(new C11455vk0(c11327uk0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [WJ] */
    @Override // p000.InterfaceC1538YR
    /* renamed from: w */
    public final InterfaceC8357Ub1 mo2005w(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = f2392Y;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f2440x;
        SparseIntArray sparseIntArray = this.f2441y;
        D30 d30 = null;
        if (zContains) {
            YN1.m9278c(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.f2439w[i3] = i;
                }
                d30 = this.f2439w[i3] == i ? this.f2438v[i3] : m1989j(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                D30[] d30Arr = this.f2438v;
                if (i4 >= d30Arr.length) {
                    break;
                }
                if (this.f2439w[i4] == i) {
                    d30 = d30Arr[i4];
                    break;
                }
                i4++;
            }
        }
        if (d30 == null) {
            if (this.f2413U) {
                return m1989j(i, i2);
            }
            int length = this.f2438v.length;
            boolean z = i2 == 1 || i2 == 2;
            d30 = new D30(this.f2421e, this.f2423g, this.f2424h, this.f2436t);
            d30.f17566t = this.f2408P;
            if (z) {
                d30.f1810I = this.f2415W;
                d30.f17572z = true;
            }
            long j = this.f2414V;
            if (d30.f17545F != j) {
                d30.f17545F = j;
                d30.f17572z = true;
            }
            if (this.f2416X != null) {
                d30.f17542C = r2.f34878k;
            }
            d30.f17552f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f2439w, i5);
            this.f2439w = iArrCopyOf;
            iArrCopyOf[length] = i;
            D30[] d30Arr2 = this.f2438v;
            int i6 = AbstractC7485Dh1.f2166a;
            Object[] objArrCopyOf = Arrays.copyOf(d30Arr2, d30Arr2.length + 1);
            objArrCopyOf[d30Arr2.length] = d30;
            this.f2438v = (D30[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f2407O, i5);
            this.f2407O = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.f2405M |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (m1988A(i2) > m1988A(this.f2393A)) {
                this.f2394B = length;
                this.f2393A = i2;
            }
            this.f2406N = Arrays.copyOf(this.f2406N, i5);
        }
        if (i2 != 5) {
            return d30;
        }
        if (this.f2442z == null) {
            this.f2442z = new C30(d30, this.f2428l);
        }
        return this.f2442z;
    }

    /* renamed from: y */
    public final void m2007y(int i) {
        ArrayList arrayList;
        YN1.m9281f(!this.f2426j.m9127I());
        int i2 = i;
        loop0: while (true) {
            arrayList = this.f2430n;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    C9832j30 c9832j30 = (C9832j30) arrayList.get(i2);
                    for (int i4 = 0; i4 < this.f2438v.length; i4++) {
                        if (this.f2438v[i4].m10732r() > c9832j30.m21973f(i4)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((C9832j30) arrayList.get(i3)).f34881n) {
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
        long j = m2008z().f9818h;
        C9832j30 c9832j302 = (C9832j30) arrayList.get(i2);
        AbstractC7485Dh1.m1807V(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.f2438v.length; i5++) {
            this.f2438v[i5].m10727l(c9832j302.m21973f(i5));
        }
        if (arrayList.isEmpty()) {
            this.f2409Q = this.f2408P;
        } else {
            ((C9832j30) AbstractC11239u22.m25079b(arrayList)).f34876J = true;
        }
        this.f2412T = false;
        this.f2427k.m8498h0(new C11081sp0(1, this.f2393A, null, 3, null, AbstractC7485Dh1.m1819d0(c9832j302.f9817g), AbstractC7485Dh1.m1819d0(j)));
    }

    /* renamed from: z */
    public final C9832j30 m2008z() {
        return (C9832j30) AbstractC7222ym.m26228e(1, this.f2430n);
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: x */
    public final void mo2006x(CX0 cx0) {
    }
}
