package p000;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10623pE0 implements InterfaceC11973zp0, InterfaceC1538YR, InterfaceC9919jk0, InterfaceC10303mk0, InterfaceC8860bV0 {

    /* renamed from: N */
    public static final Map f39915N;

    /* renamed from: O */
    public static final C6686qX f39916O;

    /* renamed from: A */
    public long f39917A;

    /* renamed from: B */
    public boolean f39918B;

    /* renamed from: D */
    public boolean f39920D;

    /* renamed from: E */
    public boolean f39921E;

    /* renamed from: F */
    public int f39922F;

    /* renamed from: G */
    public boolean f39923G;

    /* renamed from: H */
    public long f39924H;

    /* renamed from: J */
    public boolean f39926J;

    /* renamed from: K */
    public int f39927K;

    /* renamed from: L */
    public boolean f39928L;

    /* renamed from: M */
    public boolean f39929M;

    /* renamed from: a */
    public final Uri f39930a;

    /* renamed from: b */
    public final InterfaceC1586ZC f39931b;

    /* renamed from: c */
    public final InterfaceC1091RL f39932c;

    /* renamed from: d */
    public final C3979eG f39933d;

    /* renamed from: e */
    public final C1356VY f39934e;

    /* renamed from: f */
    public final C0903OL f39935f;

    /* renamed from: g */
    public final C11007sE0 f39936g;

    /* renamed from: h */
    public final C6224jE f39937h;

    /* renamed from: i */
    public final long f39938i;

    /* renamed from: j */
    public final long f39939j;

    /* renamed from: l */
    public final C10910rT1 f39941l;

    /* renamed from: q */
    public InterfaceC11846yp0 f39946q;

    /* renamed from: r */
    public Q50 f39947r;

    /* renamed from: u */
    public boolean f39950u;

    /* renamed from: v */
    public boolean f39951v;

    /* renamed from: w */
    public boolean f39952w;

    /* renamed from: x */
    public boolean f39953x;

    /* renamed from: y */
    public C8071Oo1 f39954y;

    /* renamed from: z */
    public CX0 f39955z;

    /* renamed from: k */
    public final C8539Xo1 f39940k = new C8539Xo1("ProgressiveMediaPeriod", 2);

    /* renamed from: m */
    public final C0328FC f39942m = new C0328FC();

    /* renamed from: n */
    public final RunnableC9983kE0 f39943n = new RunnableC9983kE0(this, 1);

    /* renamed from: o */
    public final RunnableC9983kE0 f39944o = new RunnableC9983kE0(this, 2);

    /* renamed from: p */
    public final Handler f39945p = AbstractC7485Dh1.m1829n(null);

    /* renamed from: t */
    public C10495oE0[] f39949t = new C10495oE0[0];

    /* renamed from: s */
    public C8988cV0[] f39948s = new C8988cV0[0];

    /* renamed from: I */
    public long f39925I = -9223372036854775807L;

    /* renamed from: C */
    public int f39919C = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f39915N = Collections.unmodifiableMap(map);
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40150a = "icy";
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("application/x-icy");
        f39916O = new C6686qX(c6623pX);
    }

    public C10623pE0(Uri uri, InterfaceC1586ZC interfaceC1586ZC, C10910rT1 c10910rT1, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol, C3979eG c3979eG, C1356VY c1356vy, C11007sE0 c11007sE0, C6224jE c6224jE, int i, long j) {
        this.f39930a = uri;
        this.f39931b = interfaceC1586ZC;
        this.f39932c = interfaceC1091RL;
        this.f39935f = c0903ol;
        this.f39933d = c3979eG;
        this.f39934e = c1356vy;
        this.f39936g = c11007sE0;
        this.f39937h = c6224jE;
        this.f39938i = i;
        this.f39941l = c10910rT1;
        this.f39939j = j;
    }

    /* renamed from: A */
    public final void m23651A(int i) {
        m23655f();
        boolean[] zArr = (boolean[]) this.f39954y.f8628b;
        if (this.f39926J && zArr[i] && !this.f39948s[i].m10737w(false)) {
            this.f39925I = 0L;
            this.f39926J = false;
            this.f39921E = true;
            this.f39924H = 0L;
            this.f39927K = 0;
            for (C8988cV0 c8988cV0 : this.f39948s) {
                c8988cV0.m10717C(false);
            }
            InterfaceC11846yp0 interfaceC11846yp0 = this.f39946q;
            interfaceC11846yp0.getClass();
            interfaceC11846yp0.mo1885m(this);
        }
    }

    /* renamed from: B */
    public final InterfaceC8357Ub1 m23652B(C10495oE0 c10495oE0) {
        int length = this.f39948s.length;
        for (int i = 0; i < length; i++) {
            if (c10495oE0.equals(this.f39949t[i])) {
                return this.f39948s[i];
            }
        }
        if (this.f39950u) {
            AbstractC10872rA1.m24175h("Extractor added new track (id=" + c10495oE0.f38899a + ") after finishing tracks.");
            return new C1404WJ();
        }
        C0903OL c0903ol = this.f39935f;
        InterfaceC1091RL interfaceC1091RL = this.f39932c;
        interfaceC1091RL.getClass();
        C8988cV0 c8988cV0 = new C8988cV0(this.f39937h, interfaceC1091RL, c0903ol);
        c8988cV0.f17552f = this;
        int i2 = length + 1;
        C10495oE0[] c10495oE0Arr = (C10495oE0[]) Arrays.copyOf(this.f39949t, i2);
        c10495oE0Arr[length] = c10495oE0;
        int i3 = AbstractC7485Dh1.f2166a;
        this.f39949t = c10495oE0Arr;
        C8988cV0[] c8988cV0Arr = (C8988cV0[]) Arrays.copyOf(this.f39948s, i2);
        c8988cV0Arr[length] = c8988cV0;
        this.f39948s = c8988cV0Arr;
        return c8988cV0;
    }

    /* renamed from: C */
    public final void m23653C() {
        C10239mE0 c10239mE0 = new C10239mE0(this, this.f39930a, this.f39931b, this.f39941l, this, this.f39942m);
        if (this.f39951v) {
            YN1.m9281f(m23658u());
            long j = this.f39917A;
            if (j != -9223372036854775807L && this.f39925I > j) {
                this.f39928L = true;
                this.f39925I = -9223372036854775807L;
                return;
            }
            CX0 cx0 = this.f39955z;
            cx0.getClass();
            long j2 = cx0.mo414i(this.f39925I).f867a.f2739b;
            long j3 = this.f39925I;
            c10239mE0.f37575g.f10814a = j2;
            c10239mE0.f37578j = j3;
            c10239mE0.f37577i = true;
            c10239mE0.f37581m = false;
            for (C8988cV0 c8988cV0 : this.f39948s) {
                c8988cV0.f17566t = this.f39925I;
            }
            this.f39925I = -9223372036854775807L;
        }
        this.f39927K = m23656j();
        this.f39934e.m8481S(new C9535gk0(c10239mE0.f37569a, c10239mE0.f37579k, this.f39940k.m9136S(c10239mE0, this, this.f39933d.mo17891d(this.f39919C))), 1, -1, null, 0, null, c10239mE0.f37578j, this.f39917A);
    }

    /* renamed from: D */
    public final boolean m23654D() {
        return this.f39921E || m23658u();
    }

    @Override // p000.InterfaceC8860bV0
    /* renamed from: a */
    public final void mo1997a() {
        this.f39945p.post(this.f39943n);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        m23655f();
        if (!this.f39955z.mo413e()) {
            return 0L;
        }
        BX0 bx0Mo414i = this.f39955z.mo414i(j);
        return dx0.m1724a(j, bx0Mo414i.f867a.f2738a, bx0Mo414i.f868b.f2738a);
    }

    @Override // p000.InterfaceC10303mk0
    /* renamed from: c */
    public final void mo1998c() {
        for (C8988cV0 c8988cV0 : this.f39948s) {
            c8988cV0.m10717C(true);
            InterfaceC0715LL interfaceC0715LL = c8988cV0.f17554h;
            if (interfaceC0715LL != null) {
                interfaceC0715LL.mo4951d(c8988cV0.f17551e);
                c8988cV0.f17554h = null;
                c8988cV0.f17553g = null;
            }
        }
        C10910rT1 c10910rT1 = this.f39941l;
        InterfaceC1412WR interfaceC1412WR = (InterfaceC1412WR) c10910rT1.f41679c;
        if (interfaceC1412WR != null) {
            interfaceC1412WR.release();
            c10910rT1.f41679c = null;
        }
        c10910rT1.f41680d = null;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    public final long mo1879d(InterfaceC6237jR[] interfaceC6237jRArr, boolean[] zArr, InterfaceC9121dV0[] interfaceC9121dV0Arr, boolean[] zArr2, long j) {
        InterfaceC6237jR interfaceC6237jR;
        m23655f();
        C8071Oo1 c8071Oo1 = this.f39954y;
        C8201Rb1 c8201Rb1 = (C8201Rb1) c8071Oo1.f8627a;
        boolean[] zArr3 = (boolean[]) c8071Oo1.f8629c;
        int i = this.f39922F;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC6237jRArr.length; i3++) {
            InterfaceC9121dV0 interfaceC9121dV0 = interfaceC9121dV0Arr[i3];
            if (interfaceC9121dV0 != null && (interfaceC6237jRArr[i3] == null || !zArr[i3])) {
                int i4 = ((C10367nE0) interfaceC9121dV0).f38189a;
                YN1.m9281f(zArr3[i4]);
                this.f39922F--;
                zArr3[i4] = false;
                interfaceC9121dV0Arr[i3] = null;
            }
        }
        boolean z = !this.f39920D ? j == 0 || this.f39953x : i != 0;
        for (int i5 = 0; i5 < interfaceC6237jRArr.length; i5++) {
            if (interfaceC9121dV0Arr[i5] == null && (interfaceC6237jR = interfaceC6237jRArr[i5]) != null) {
                YN1.m9281f(interfaceC6237jR.length() == 1);
                YN1.m9281f(interfaceC6237jR.mo2729j(0) == 0);
                int iM7047b = c8201Rb1.m7047b(interfaceC6237jR.mo2724d());
                YN1.m9281f(!zArr3[iM7047b]);
                this.f39922F++;
                zArr3[iM7047b] = true;
                interfaceC9121dV0Arr[i5] = new C10367nE0(this, iM7047b);
                zArr2[i5] = true;
                if (!z) {
                    C8988cV0 c8988cV0 = this.f39948s[iM7047b];
                    z = (c8988cV0.m10732r() == 0 || c8988cV0.m10720F(j, true)) ? false : true;
                }
            }
        }
        if (this.f39922F == 0) {
            this.f39926J = false;
            this.f39921E = false;
            C8539Xo1 c8539Xo1 = this.f39940k;
            if (c8539Xo1.m9127I()) {
                C8988cV0[] c8988cV0Arr = this.f39948s;
                int length = c8988cV0Arr.length;
                while (i2 < length) {
                    c8988cV0Arr[i2].m10725j();
                    i2++;
                }
                c8539Xo1.m9147p();
            } else {
                this.f39928L = false;
                for (C8988cV0 c8988cV02 : this.f39948s) {
                    c8988cV02.m10717C(false);
                }
            }
        } else if (z) {
            j = mo1882h(j);
            while (i2 < interfaceC9121dV0Arr.length) {
                if (interfaceC9121dV0Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f39920D = true;
        return j;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        return mo1890s();
    }

    /* renamed from: f */
    public final void m23655f() {
        YN1.m9281f(this.f39951v);
        this.f39954y.getClass();
        this.f39955z.getClass();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() throws IOException {
        int iMo17891d = this.f39933d.mo17891d(this.f39919C);
        C8539Xo1 c8539Xo1 = this.f39940k;
        IOException iOException = (IOException) c8539Xo1.f13983d;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC10047kk0 handlerC10047kk0 = (HandlerC10047kk0) c8539Xo1.f13982c;
        if (handlerC10047kk0 != null) {
            if (iMo17891d == Integer.MIN_VALUE) {
                iMo17891d = handlerC10047kk0.f36647a;
            }
            IOException iOException2 = handlerC10047kk0.f36651e;
            if (iOException2 != null && handlerC10047kk0.f36652f > iMo17891d) {
                throw iOException2;
            }
        }
        if (this.f39928L && !this.f39951v) {
            throw C10103lA0.m22366a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        boolean z;
        m23655f();
        boolean[] zArr = (boolean[]) this.f39954y.f8628b;
        if (!this.f39955z.mo413e()) {
            j = 0;
        }
        this.f39921E = false;
        this.f39924H = j;
        if (m23658u()) {
            this.f39925I = j;
            return j;
        }
        int i = this.f39919C;
        C8539Xo1 c8539Xo1 = this.f39940k;
        if (i != 7 && (this.f39928L || c8539Xo1.m9127I())) {
            int length = this.f39948s.length;
            for (int i2 = 0; i2 < length; i2++) {
                C8988cV0 c8988cV0 = this.f39948s[i2];
                if (!(this.f39953x ? c8988cV0.m10719E(c8988cV0.f17563q) : c8988cV0.m10720F(j, false)) && (zArr[i2] || !this.f39952w)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j;
            }
        }
        this.f39926J = false;
        this.f39925I = j;
        this.f39928L = false;
        if (c8539Xo1.m9127I()) {
            for (C8988cV0 c8988cV02 : this.f39948s) {
                c8988cV02.m10725j();
            }
            c8539Xo1.m9147p();
        } else {
            c8539Xo1.f13983d = null;
            for (C8988cV0 c8988cV03 : this.f39948s) {
                c8988cV03.m10717C(false);
            }
        }
        return j;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        if (this.f39953x) {
            return;
        }
        m23655f();
        if (m23658u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f39954y.f8629c;
        int length = this.f39948s.length;
        for (int i = 0; i < length; i++) {
            this.f39948s[i].m10724i(j, zArr[i]);
        }
    }

    /* renamed from: j */
    public final int m23656j() {
        int i = 0;
        for (C8988cV0 c8988cV0 : this.f39948s) {
            i += c8988cV0.f17563q + c8988cV0.f17562p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m23657k(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            cV0[] r3 = r5.f39948s
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            Oo1 r3 = r5.f39954y
            r3.getClass()
            java.lang.Object r3 = r3.f8629c
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            cV0[] r3 = r5.f39948s
            r3 = r3[r2]
            long r3 = r3.m10729o()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10623pE0.m23657k(boolean):long");
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        boolean z;
        if (this.f39940k.m9127I()) {
            C0328FC c0328fc = this.f39942m;
            synchronized (c0328fc) {
                z = c0328fc.f3086a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public final void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        C10239mE0 c10239mE0 = (C10239mE0) interfaceC10175lk0;
        Uri uri = c10239mE0.f37571c.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f39933d.getClass();
        this.f39934e.m8472J(c9535gk0, 1, -1, null, 0, null, c10239mE0.f37578j, this.f39917A);
        if (z) {
            return;
        }
        for (C8988cV0 c8988cV0 : this.f39948s) {
            c8988cV0.m10717C(false);
        }
        if (this.f39922F > 0) {
            InterfaceC11846yp0 interfaceC11846yp0 = this.f39946q;
            interfaceC11846yp0.getClass();
            interfaceC11846yp0.mo1885m(this);
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        if (!this.f39921E) {
            return -9223372036854775807L;
        }
        if (!this.f39928L && m23656j() <= this.f39927K) {
            return -9223372036854775807L;
        }
        this.f39921E = false;
        return this.f39924H;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        this.f39946q = interfaceC11846yp0;
        this.f39942m.m2551g();
        m23653C();
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public final C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        C9407fk0 c9407fk0;
        CX0 cx0;
        C10239mE0 c10239mE0 = (C10239mE0) interfaceC10175lk0;
        Uri uri = c10239mE0.f37571c.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        AbstractC7485Dh1.m1819d0(c10239mE0.f37578j);
        AbstractC7485Dh1.m1819d0(this.f39917A);
        long jMo17892e = this.f39933d.mo17892e(new C0986Pf(iOException, i, 9));
        if (jMo17892e == -9223372036854775807L) {
            c9407fk0 = C8539Xo1.f13979i;
        } else {
            int iM23656j = m23656j();
            int i2 = iM23656j > this.f39927K ? 1 : 0;
            if (this.f39923G || !((cx0 = this.f39955z) == null || cx0.mo415k() == -9223372036854775807L)) {
                this.f39927K = iM23656j;
            } else if (!this.f39951v || m23654D()) {
                this.f39921E = this.f39951v;
                this.f39924H = 0L;
                this.f39927K = 0;
                for (C8988cV0 c8988cV0 : this.f39948s) {
                    c8988cV0.m10717C(false);
                }
                c10239mE0.f37575g.f10814a = 0L;
                c10239mE0.f37578j = 0L;
                c10239mE0.f37577i = true;
                c10239mE0.f37581m = false;
            } else {
                this.f39926J = true;
                c9407fk0 = C8539Xo1.f13978h;
            }
            c9407fk0 = new C9407fk0(i2, jMo17892e, false);
        }
        this.f39934e.m8477O(c9535gk0, 1, -1, null, 0, null, c10239mE0.f37578j, this.f39917A, iOException, !c9407fk0.m18291a());
        return c9407fk0;
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: p */
    public final void mo2003p() {
        this.f39950u = true;
        this.f39945p.post(this.f39943n);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        m23655f();
        return (C8201Rb1) this.f39954y.f8627a;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        if (this.f39928L) {
            return false;
        }
        C8539Xo1 c8539Xo1 = this.f39940k;
        if (c8539Xo1.m9125G() || this.f39926J) {
            return false;
        }
        if (this.f39951v && this.f39922F == 0) {
            return false;
        }
        boolean zM2551g = this.f39942m.m2551g();
        if (c8539Xo1.m9127I()) {
            return zM2551g;
        }
        m23653C();
        return true;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        long jM23657k;
        boolean z;
        m23655f();
        if (this.f39928L || this.f39922F == 0) {
            return Long.MIN_VALUE;
        }
        if (m23658u()) {
            return this.f39925I;
        }
        if (this.f39952w) {
            int length = this.f39948s.length;
            jM23657k = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C8071Oo1 c8071Oo1 = this.f39954y;
                if (((boolean[]) c8071Oo1.f8628b)[i] && ((boolean[]) c8071Oo1.f8629c)[i]) {
                    C8988cV0 c8988cV0 = this.f39948s[i];
                    synchronized (c8988cV0) {
                        z = c8988cV0.f17569w;
                    }
                    if (!z) {
                        jM23657k = Math.min(jM23657k, this.f39948s[i].m10729o());
                    }
                }
            }
        } else {
            jM23657k = Long.MAX_VALUE;
        }
        if (jM23657k == Long.MAX_VALUE) {
            jM23657k = m23657k(false);
        }
        return jM23657k == Long.MIN_VALUE ? this.f39924H : jM23657k;
    }

    /* renamed from: u */
    public final boolean m23658u() {
        return this.f39925I != -9223372036854775807L;
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public final void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        CX0 cx0;
        C10239mE0 c10239mE0 = (C10239mE0) interfaceC10175lk0;
        if (this.f39917A == -9223372036854775807L && (cx0 = this.f39955z) != null) {
            boolean zMo413e = cx0.mo413e();
            long jM23657k = m23657k(true);
            long j3 = jM23657k == Long.MIN_VALUE ? 0L : jM23657k + 10000;
            this.f39917A = j3;
            this.f39936g.m24682w(j3, zMo413e, this.f39918B);
        }
        Uri uri = c10239mE0.f37571c.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        this.f39933d.getClass();
        this.f39934e.m8475M(c9535gk0, 1, -1, null, 0, null, c10239mE0.f37578j, this.f39917A);
        this.f39928L = true;
        InterfaceC11846yp0 interfaceC11846yp0 = this.f39946q;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1885m(this);
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: w */
    public final InterfaceC8357Ub1 mo2005w(int i, int i2) {
        return m23652B(new C10495oE0(i, false));
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: x */
    public final void mo2006x(CX0 cx0) {
        this.f39945p.post(new MD0(this, 3, cx0));
    }

    /* renamed from: y */
    public final void m23659y() {
        long j;
        int i;
        if (this.f39929M || this.f39951v || !this.f39950u || this.f39955z == null) {
            return;
        }
        for (C8988cV0 c8988cV0 : this.f39948s) {
            if (c8988cV0.m10735u() == null) {
                return;
            }
        }
        this.f39942m.m2549d();
        int length = this.f39948s.length;
        C8149Qb1[] c8149Qb1Arr = new C8149Qb1[length];
        boolean[] zArr = new boolean[length];
        int i2 = 0;
        while (true) {
            j = this.f39939j;
            if (i2 >= length) {
                break;
            }
            C6686qX c6686qXM10735u = this.f39948s[i2].m10735u();
            c6686qXM10735u.getClass();
            String str = c6686qXM10735u.f40974m;
            boolean zM9167j = AbstractC8544Xr0.m9167j(str);
            boolean z = zM9167j || AbstractC8544Xr0.m9170m(str);
            zArr[i2] = z;
            this.f39952w = z | this.f39952w;
            this.f39953x = j != -9223372036854775807L && length == 1 && AbstractC8544Xr0.m9168k(str);
            Q50 q50 = this.f39947r;
            if (q50 != null) {
                if (zM9167j || this.f39949t[i2].f38900b) {
                    C7660Gr0 c7660Gr0 = c6686qXM10735u.f40972k;
                    C7660Gr0 c7660Gr02 = c7660Gr0 == null ? new C7660Gr0(q50) : c7660Gr0.m3181a(q50);
                    C6623pX c6623pXM24020a = c6686qXM10735u.m24020a();
                    c6623pXM24020a.f40159j = c7660Gr02;
                    c6686qXM10735u = new C6686qX(c6623pXM24020a);
                }
                if (zM9167j && c6686qXM10735u.f40968g == -1 && c6686qXM10735u.f40969h == -1 && (i = q50.f9471a) != -1) {
                    C6623pX c6623pXM24020a2 = c6686qXM10735u.m24020a();
                    c6623pXM24020a2.f40156g = i;
                    c6686qXM10735u = new C6686qX(c6623pXM24020a2);
                }
            }
            int iMo6999j = this.f39932c.mo6999j(c6686qXM10735u);
            C6623pX c6623pXM24020a3 = c6686qXM10735u.m24020a();
            c6623pXM24020a3.f40149I = iMo6999j;
            c8149Qb1Arr[i2] = new C8149Qb1(Integer.toString(i2), new C6686qX(c6623pXM24020a3));
            i2++;
        }
        C8201Rb1 c8201Rb1 = new C8201Rb1(c8149Qb1Arr);
        C8071Oo1 c8071Oo1 = new C8071Oo1();
        c8071Oo1.f8627a = c8201Rb1;
        c8071Oo1.f8628b = zArr;
        int i3 = c8201Rb1.f10321a;
        c8071Oo1.f8629c = new boolean[i3];
        c8071Oo1.f8630d = new boolean[i3];
        this.f39954y = c8071Oo1;
        if (this.f39953x && this.f39917A == -9223372036854775807L) {
            this.f39917A = j;
            this.f39955z = new C10111lE0(this, this.f39955z);
        }
        this.f39936g.m24682w(this.f39917A, this.f39955z.mo413e(), this.f39918B);
        this.f39951v = true;
        InterfaceC11846yp0 interfaceC11846yp0 = this.f39946q;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1876a(this);
    }

    /* renamed from: z */
    public final void m23660z(int i) {
        m23655f();
        C8071Oo1 c8071Oo1 = this.f39954y;
        boolean[] zArr = (boolean[]) c8071Oo1.f8630d;
        if (zArr[i]) {
            return;
        }
        C6686qX c6686qX = ((C8201Rb1) c8071Oo1.f8627a).m7046a(i).f9690d[0];
        this.f39934e.m8504x(AbstractC8544Xr0.m9165h(c6686qX.f40974m), c6686qX, 0, null, this.f39924H);
        zArr[i] = true;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
    }
}
