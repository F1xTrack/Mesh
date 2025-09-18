package p000;

import android.os.Looper;

/* renamed from: sE0 */
/* loaded from: classes.dex */
public final class C11007sE0 extends AbstractC6758rg {

    /* renamed from: h */
    public final InterfaceC1397WC f42322h;

    /* renamed from: i */
    public final C8450Vw0 f42323i;

    /* renamed from: j */
    public final InterfaceC1091RL f42324j;

    /* renamed from: k */
    public final C3979eG f42325k;

    /* renamed from: l */
    public final int f42326l;

    /* renamed from: m */
    public boolean f42327m = true;

    /* renamed from: n */
    public long f42328n = -9223372036854775807L;

    /* renamed from: o */
    public boolean f42329o;

    /* renamed from: p */
    public boolean f42330p;

    /* renamed from: q */
    public InterfaceC9648hc1 f42331q;

    /* renamed from: r */
    public C10825qp0 f42332r;

    public C11007sE0(C10825qp0 c10825qp0, InterfaceC1397WC interfaceC1397WC, C8450Vw0 c8450Vw0, InterfaceC1091RL interfaceC1091RL, C3979eG c3979eG, int i) {
        this.f42332r = c10825qp0;
        this.f42322h = interfaceC1397WC;
        this.f42323i = c8450Vw0;
        this.f42324j = interfaceC1091RL;
        this.f42325k = c3979eG;
        this.f42326l = i;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: b */
    public final InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        InterfaceC1586ZC interfaceC1586ZCMo506s0 = this.f42322h.mo506s0();
        InterfaceC9648hc1 interfaceC9648hc1 = this.f42331q;
        if (interfaceC9648hc1 != null) {
            interfaceC1586ZCMo506s0.mo5255d(interfaceC9648hc1);
        }
        C10313mp0 c10313mp0 = mo6202h().f41186b;
        c10313mp0.getClass();
        YN1.m9283h(this.f41803g);
        C10910rT1 c10910rT1 = new C10910rT1((InterfaceC1601ZR) this.f42323i.f12875b);
        C0903OL c0903ol = new C0903OL(this.f41800d.f8366c, 0, c7604Fp0);
        C1356VY c1356vyM24438a = m24438a(c7604Fp0);
        long jM1802Q = AbstractC7485Dh1.m1802Q(c10313mp0.f37955e);
        return new C10623pE0(c10313mp0.f37951a, interfaceC1586ZCMo506s0, c10910rT1, this.f42324j, c0903ol, this.f42325k, c1356vyM24438a, this, c6224jE, this.f42326l, jM1802Q);
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: h */
    public final synchronized C10825qp0 mo6202h() {
        return this.f42332r;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: l */
    public final void mo6203l(InterfaceC9648hc1 interfaceC9648hc1) {
        this.f42331q = interfaceC9648hc1;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        NB0 nb0 = this.f41803g;
        YN1.m9283h(nb0);
        InterfaceC1091RL interfaceC1091RL = this.f42324j;
        interfaceC1091RL.mo6998i(looperMyLooper, nb0);
        interfaceC1091RL.mo6997e();
        m24681u();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        C10623pE0 c10623pE0 = (C10623pE0) interfaceC11973zp0;
        if (c10623pE0.f39951v) {
            for (C8988cV0 c8988cV0 : c10623pE0.f39948s) {
                c8988cV0.m10725j();
                InterfaceC0715LL interfaceC0715LL = c8988cV0.f17554h;
                if (interfaceC0715LL != null) {
                    interfaceC0715LL.mo4951d(c8988cV0.f17551e);
                    c8988cV0.f17554h = null;
                    c8988cV0.f17553g = null;
                }
            }
        }
        c10623pE0.f39940k.m9133P(c10623pE0);
        c10623pE0.f39945p.removeCallbacksAndMessages(null);
        c10623pE0.f39946q = null;
        c10623pE0.f39929M = true;
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
        this.f42324j.release();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: t */
    public final synchronized void mo3166t(C10825qp0 c10825qp0) {
        this.f42332r = c10825qp0;
    }

    /* renamed from: u */
    public final void m24681u() {
        AbstractC7419Ca1 c10595p11 = new C10595p11(this.f42328n, this.f42329o, this.f42330p, mo6202h());
        if (this.f42327m) {
            c10595p11 = new C10751qE0(c10595p11);
        }
        m24442n(c10595p11);
    }

    /* renamed from: w */
    public final void m24682w(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f42328n;
        }
        if (!this.f42327m && this.f42328n == j && this.f42329o == z && this.f42330p == z2) {
            return;
        }
        this.f42328n = j;
        this.f42329o = z;
        this.f42330p = z2;
        this.f42327m = false;
        m24681u();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() {
    }
}
