package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;

/* renamed from: zE */
/* loaded from: classes.dex */
public final class C7251zE implements GB0, InterfaceC7864Kp0, InterfaceC0105Bf, InterfaceC0966PL {

    /* renamed from: a */
    public final M71 f46731a;

    /* renamed from: b */
    public final C7315Aa1 f46732b;

    /* renamed from: c */
    public final C7367Ba1 f46733c;

    /* renamed from: d */
    public final C8128Pr0 f46734d;

    /* renamed from: e */
    public final SparseArray f46735e;

    /* renamed from: f */
    public C8372Uj0 f46736f;

    /* renamed from: g */
    public IB0 f46737g;

    /* renamed from: h */
    public R71 f46738h;

    /* renamed from: i */
    public boolean f46739i;

    public C7251zE(M71 m71) {
        m71.getClass();
        this.f46731a = m71;
        int i = AbstractC7485Dh1.f2166a;
        Looper looperMyLooper = Looper.myLooper();
        this.f46736f = new C8372Uj0(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, m71, new C4262il(29));
        C7315Aa1 c7315Aa1 = new C7315Aa1();
        this.f46732b = c7315Aa1;
        this.f46733c = new C7367Ba1();
        C8128Pr0 c8128Pr0 = new C8128Pr0();
        c8128Pr0.f9303a = c7315Aa1;
        N70 n70 = P70.f8867b;
        c8128Pr0.f9304b = C9367fQ0.f27184e;
        c8128Pr0.f9305c = C10007kQ0.f36495g;
        this.f46734d = c8128Pr0;
        this.f46735e = new SparseArray();
    }

    @Override // p000.GB0
    /* renamed from: A */
    public final void mo2940A(List list) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 27, new C6667qE(c1514y3M26329J, list));
    }

    @Override // p000.GB0
    /* renamed from: B */
    public final void mo2941B(int i, boolean z) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, -1, new C4262il(c1514y3M26329J, z, i));
    }

    @Override // p000.GB0
    /* renamed from: C */
    public final void mo2942C(CB0 cb0) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 12, new C0424Gj(c1514y3M26329J, 12, cb0));
    }

    @Override // p000.GB0
    /* renamed from: D */
    public final void mo2943D(EB0 eb0) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 13, new C6730rE(c1514y3M26329J, eb0, 10));
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: E */
    public final void mo1016E(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1001, new C6730rE(c1514y3M26332O, c9535gk0, c11081sp0, 8));
    }

    @Override // p000.GB0
    /* renamed from: F */
    public final void mo2944F(C7660Gr0 c7660Gr0) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 28, new C0424Gj(c1514y3M26329J, 15, c7660Gr0));
    }

    @Override // p000.GB0
    /* renamed from: G */
    public final void mo2945G(C10825qp0 c10825qp0, int i) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 1, new C6287kE(c1514y3M26329J, c10825qp0, i));
    }

    @Override // p000.GB0
    /* renamed from: H */
    public final void mo2946H(int i, int i2) {
        C1514Y3 c1514y3M26333P = m26333P();
        m26334Q(c1514y3M26333P, 24, new C6999vE(c1514y3M26333P, i, i2));
    }

    @Override // p000.GB0
    /* renamed from: I */
    public final void mo2947I(boolean z) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 7, new C6413mE(c1514y3M26329J, z, 0));
    }

    /* renamed from: J */
    public final C1514Y3 m26329J() {
        return m26330L((C7604Fp0) this.f46734d.f9306d);
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: K */
    public final void mo1025K(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0, IOException iOException, boolean z) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1003, new C4224i9(c1514y3M26332O, c9535gk0, c11081sp0, iOException, z));
    }

    /* renamed from: L */
    public final C1514Y3 m26330L(C7604Fp0 c7604Fp0) {
        this.f46737g.getClass();
        AbstractC7419Ca1 abstractC7419Ca1 = c7604Fp0 == null ? null : (AbstractC7419Ca1) ((C10007kQ0) this.f46734d.f9305c).get(c7604Fp0);
        if (c7604Fp0 != null && abstractC7419Ca1 != null) {
            return m26331M(abstractC7419Ca1, abstractC7419Ca1.mo1250g(c7604Fp0.f3430a, this.f46732b).f258c, c7604Fp0);
        }
        int iM9007D1 = ((C1474XQ) this.f46737g).m9007D1();
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = ((C1474XQ) this.f46737g).m9010G1();
        if (iM9007D1 >= abstractC7419Ca1M9010G1.mo1258o()) {
            abstractC7419Ca1M9010G1 = AbstractC7419Ca1.f1466a;
        }
        return m26331M(abstractC7419Ca1M9010G1, iM9007D1, null);
    }

    /* renamed from: M */
    public final C1514Y3 m26331M(AbstractC7419Ca1 abstractC7419Ca1, int i, C7604Fp0 c7604Fp0) {
        C7604Fp0 c7604Fp02 = abstractC7419Ca1.m1259p() ? null : c7604Fp0;
        this.f46731a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = abstractC7419Ca1.equals(((C1474XQ) this.f46737g).m9010G1()) && i == ((C1474XQ) this.f46737g).m9007D1();
        long jM1819d0 = 0;
        if (c7604Fp02 == null || !c7604Fp02.m2791b()) {
            if (z) {
                C1474XQ c1474xq = (C1474XQ) this.f46737g;
                c1474xq.m9035g2();
                jM1819d0 = c1474xq.m9004A1(c1474xq.f13743u1);
            } else if (!abstractC7419Ca1.m1259p()) {
                jM1819d0 = AbstractC7485Dh1.m1819d0(abstractC7419Ca1.mo1256m(i, this.f46733c, 0L).f925l);
            }
        } else if (z && ((C1474XQ) this.f46737g).m9005B1() == c7604Fp02.f3431b && ((C1474XQ) this.f46737g).m9006C1() == c7604Fp02.f3432c) {
            jM1819d0 = ((C1474XQ) this.f46737g).m9008E1();
        }
        C7604Fp0 c7604Fp03 = (C7604Fp0) this.f46734d.f9306d;
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = ((C1474XQ) this.f46737g).m9010G1();
        int iM9007D1 = ((C1474XQ) this.f46737g).m9007D1();
        long jM9008E1 = ((C1474XQ) this.f46737g).m9008E1();
        C1474XQ c1474xq2 = (C1474XQ) this.f46737g;
        c1474xq2.m9035g2();
        return new C1514Y3(jElapsedRealtime, abstractC7419Ca1, i, c7604Fp02, jM1819d0, abstractC7419Ca1M9010G1, iM9007D1, c7604Fp03, jM9008E1, AbstractC7485Dh1.m1819d0(c1474xq2.f13743u1.f640r));
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: N */
    public final void mo1030N(int i, C7604Fp0 c7604Fp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1025, new C6810sE(c1514y3M26332O, 3));
    }

    /* renamed from: O */
    public final C1514Y3 m26332O(int i, C7604Fp0 c7604Fp0) {
        this.f46737g.getClass();
        if (c7604Fp0 != null) {
            return ((AbstractC7419Ca1) ((C10007kQ0) this.f46734d.f9305c).get(c7604Fp0)) != null ? m26330L(c7604Fp0) : m26331M(AbstractC7419Ca1.f1466a, i, c7604Fp0);
        }
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = ((C1474XQ) this.f46737g).m9010G1();
        if (i >= abstractC7419Ca1M9010G1.mo1258o()) {
            abstractC7419Ca1M9010G1 = AbstractC7419Ca1.f1466a;
        }
        return m26331M(abstractC7419Ca1M9010G1, i, null);
    }

    /* renamed from: P */
    public final C1514Y3 m26333P() {
        return m26330L((C7604Fp0) this.f46734d.f9308f);
    }

    /* renamed from: Q */
    public final void m26334Q(C1514Y3 c1514y3, int i, InterfaceC8216Rj0 interfaceC8216Rj0) {
        this.f46735e.put(i, c1514y3);
        this.f46736f.m8134f(i, interfaceC8216Rj0);
    }

    /* renamed from: R */
    public final void m26335R(IB0 ib0, Looper looper) {
        YN1.m9281f(this.f46737g == null || ((P70) this.f46734d.f9304b).isEmpty());
        ib0.getClass();
        this.f46737g = ib0;
        this.f46738h = this.f46731a.m5274a(looper, null);
        C8372Uj0 c8372Uj0 = this.f46736f;
        this.f46736f = new C8372Uj0(c8372Uj0.f12001d, looper, c8372Uj0.f11998a, new C0424Gj(this, 13, ib0), c8372Uj0.f12006i);
    }

    @Override // p000.GB0
    /* renamed from: a */
    public final void mo2948a(int i) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 6, new C6287kE(c1514y3M26329J, i, 2));
    }

    @Override // p000.GB0
    /* renamed from: b */
    public final void mo2949b(C1017Q9 c1017q9) {
        C1514Y3 c1514y3M26333P = m26333P();
        m26334Q(c1514y3M26333P, 20, new C0424Gj(c1514y3M26333P, 14, c1017q9));
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: b0 */
    public final void mo1058b0(int i, C7604Fp0 c7604Fp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1023, new C6810sE(c1514y3M26332O, 4));
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: c */
    public final void mo1059c(int i, C7604Fp0 c7604Fp0, Exception exc) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1024, new C0424Gj(c1514y3M26332O, 19, exc));
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: d */
    public final void mo1062d(int i, C7604Fp0 c7604Fp0, C11081sp0 c11081sp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new C7062wE(c1514y3M26332O, c11081sp0, 0));
    }

    @Override // p000.GB0
    /* renamed from: e */
    public final void mo2950e(C8321Tj1 c8321Tj1) {
        C1514Y3 c1514y3M26333P = m26333P();
        m26334Q(c1514y3M26333P, 25, new C0424Gj(c1514y3M26333P, 20, c8321Tj1));
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: f */
    public final void mo1068f(int i, C7604Fp0 c7604Fp0, C11081sp0 c11081sp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, new C7062wE(c1514y3M26332O, c11081sp0, 1));
    }

    @Override // p000.GB0
    /* renamed from: g */
    public final void mo2951g(boolean z) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 3, new C6413mE(c1514y3M26329J, z, 3));
    }

    @Override // p000.GB0
    /* renamed from: h */
    public final void mo2952h(final int i, final boolean z) {
        final C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 5, new InterfaceC8216Rj0() { // from class: pE
            @Override // p000.InterfaceC8216Rj0
            public final void invoke(Object obj) {
                ((InterfaceC1577Z3) obj).mo2229N(c1514y3M26329J, z, i);
            }
        });
    }

    @Override // p000.GB0
    /* renamed from: i */
    public final void mo2953i(final float f) {
        final C1514Y3 c1514y3M26333P = m26333P();
        m26334Q(c1514y3M26333P, 22, new InterfaceC8216Rj0() { // from class: lE
            @Override // p000.InterfaceC8216Rj0
            public final void invoke(Object obj) {
                ((InterfaceC1577Z3) obj).mo2221F(c1514y3M26333P, f);
            }
        });
    }

    @Override // p000.GB0
    /* renamed from: j */
    public final void mo2954j(int i) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 4, new C6287kE(c1514y3M26329J, i, 4));
    }

    @Override // p000.InterfaceC0105Bf
    /* renamed from: k */
    public final void mo795k(int i, long j, long j2) {
        C8128Pr0 c8128Pr0 = this.f46734d;
        C1514Y3 c1514y3M26330L = m26330L(((P70) c8128Pr0.f9304b).isEmpty() ? null : (C7604Fp0) AbstractC11239u22.m25079b((P70) c8128Pr0.f9304b));
        m26334Q(c1514y3M26330L, 1006, new C6476nE(c1514y3M26330L, i, j, j2));
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: k0 */
    public final void mo1084k0(int i, C7604Fp0 c7604Fp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1027, new C6810sE(c1514y3M26332O, 2));
    }

    @Override // p000.InterfaceC0966PL
    /* renamed from: l */
    public final void mo1086l(int i, C7604Fp0 c7604Fp0, int i2) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1022, new C6287kE(c1514y3M26332O, i2, 6));
    }

    @Override // p000.GB0
    /* renamed from: m */
    public final void mo2955m(boolean z) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 9, new C6413mE(c1514y3M26329J, z, 1));
    }

    @Override // p000.GB0
    /* renamed from: n */
    public final void mo2956n(C6996vB c6996vB) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 27, new C6730rE(c1514y3M26329J, c6996vB, 7));
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: o */
    public final void mo1095o(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1000, new C6730rE(c1514y3M26332O, c9535gk0, c11081sp0, 5));
    }

    @Override // p000.GB0
    /* renamed from: p */
    public final void mo2957p(C9264ec1 c9264ec1) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 2, new C0424Gj(c1514y3M26329J, 17, c9264ec1));
    }

    @Override // p000.GB0
    /* renamed from: r */
    public final void mo2959r(int i, HB0 hb0, HB0 hb02) {
        if (i == 1) {
            this.f46739i = false;
        }
        IB0 ib0 = this.f46737g;
        ib0.getClass();
        C8128Pr0 c8128Pr0 = this.f46734d;
        c8128Pr0.f9306d = C8128Pr0.m6442p(ib0, (P70) c8128Pr0.f9304b, (C7604Fp0) c8128Pr0.f9307e, (C7315Aa1) c8128Pr0.f9303a);
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 11, new C6936uE(i, c1514y3M26329J, hb0, hb02));
    }

    @Override // p000.GB0
    /* renamed from: s */
    public final void mo2960s(int i) {
        IB0 ib0 = this.f46737g;
        ib0.getClass();
        C8128Pr0 c8128Pr0 = this.f46734d;
        c8128Pr0.f9306d = C8128Pr0.m6442p(ib0, (P70) c8128Pr0.f9304b, (C7604Fp0) c8128Pr0.f9307e, (C7315Aa1) c8128Pr0.f9303a);
        c8128Pr0.m6447D(((C1474XQ) ib0).m9010G1());
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 0, new C6287kE(c1514y3M26329J, i, 0));
    }

    @Override // p000.GB0
    /* renamed from: t */
    public final void mo2961t(C11337up0 c11337up0) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 14, new C6730rE(c1514y3M26329J, c11337up0, 9));
    }

    @Override // p000.GB0
    /* renamed from: u */
    public final void mo2962u(C0531IQ c0531iq) {
        C7604Fp0 c7604Fp0;
        C1514Y3 c1514y3M26329J = (!(c0531iq instanceof C0531IQ) || (c7604Fp0 = c0531iq.f4931h) == null) ? m26329J() : m26330L(c7604Fp0);
        m26334Q(c1514y3M26329J, 10, new C4262il(c1514y3M26329J, c0531iq, 28));
    }

    @Override // p000.InterfaceC7864Kp0
    /* renamed from: v */
    public final void mo1109v(int i, C7604Fp0 c7604Fp0, C9535gk0 c9535gk0, C11081sp0 c11081sp0) {
        C1514Y3 c1514y3M26332O = m26332O(i, c7604Fp0);
        m26334Q(c1514y3M26332O, 1002, new C6730rE(c1514y3M26332O, c9535gk0, c11081sp0, 6));
    }

    @Override // p000.GB0
    /* renamed from: w */
    public final void mo2963w(int i) {
        C1514Y3 c1514y3M26329J = m26329J();
        m26334Q(c1514y3M26329J, 8, new C6287kE(c1514y3M26329J, i, 5));
    }

    @Override // p000.GB0
    /* renamed from: x */
    public final void mo2964x(C0531IQ c0531iq) {
        C7604Fp0 c7604Fp0;
        C1514Y3 c1514y3M26329J = (!(c0531iq instanceof C0531IQ) || (c7604Fp0 = c0531iq.f4931h) == null) ? m26329J() : m26330L(c7604Fp0);
        m26334Q(c1514y3M26329J, 10, new C0424Gj(c1514y3M26329J, 16, c0531iq));
    }

    @Override // p000.GB0
    /* renamed from: z */
    public final void mo2966z(boolean z) {
        C1514Y3 c1514y3M26333P = m26333P();
        m26334Q(c1514y3M26333P, 23, new C6413mE(c1514y3M26333P, z, 2));
    }

    @Override // p000.GB0
    /* renamed from: y */
    public final void mo2965y() {
    }

    @Override // p000.GB0
    /* renamed from: q */
    public final void mo2958q(IB0 ib0, FB0 fb0) {
    }
}
