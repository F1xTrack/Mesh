package defpackage;

import android.os.Looper;

/* renamed from: sE0 */
/* loaded from: classes.dex */
public final class C6991sE0 extends AbstractC6883rg {
    public final WC h;
    public final C1724Vw0 i;
    public final RL j;
    public final C3547eG k;
    public final int l;
    public boolean m = true;
    public long n = -9223372036854775807L;
    public boolean o;
    public boolean p;
    public InterfaceC4188hc1 q;
    public C6721qp0 r;

    public C6991sE0(C6721qp0 c6721qp0, WC wc, C1724Vw0 c1724Vw0, RL rl, C3547eG c3547eG, int i) {
        this.r = c6721qp0;
        this.h = wc;
        this.i = c1724Vw0;
        this.j = rl;
        this.k = c3547eG;
        this.l = i;
    }

    @Override // defpackage.AbstractC6883rg
    public final InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        ZC zcS0 = this.h.s0();
        InterfaceC4188hc1 interfaceC4188hc1 = this.q;
        if (interfaceC4188hc1 != null) {
            zcS0.d(interfaceC4188hc1);
        }
        C5957mp0 c5957mp0 = h().b;
        c5957mp0.getClass();
        YN1.h(this.g);
        C6846rT1 c6846rT1 = new C6846rT1((ZR) this.i.b);
        OL ol = new OL(this.d.c, 0, c0456Fp0);
        VY vyA = a(c0456Fp0);
        long jQ = AbstractC0277Dh1.Q(c5957mp0.e);
        return new C6419pE0(c5957mp0.a, zcS0, c6846rT1, this.j, ol, this.k, vyA, this, c5272jE, this.l, jQ);
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized C6721qp0 h() {
        return this.r;
    }

    @Override // defpackage.AbstractC6883rg
    public final void l(InterfaceC4188hc1 interfaceC4188hc1) {
        this.q = interfaceC4188hc1;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        NB0 nb0 = this.g;
        YN1.h(nb0);
        RL rl = this.j;
        rl.i(looperMyLooper, nb0);
        rl.e();
        u();
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        C6419pE0 c6419pE0 = (C6419pE0) interfaceC8435zp0;
        if (c6419pE0.v) {
            for (C2527cV0 c2527cV0 : c6419pE0.s) {
                c2527cV0.j();
                LL ll = c2527cV0.h;
                if (ll != null) {
                    ll.d(c2527cV0.e);
                    c2527cV0.h = null;
                    c2527cV0.g = null;
                }
            }
        }
        c6419pE0.k.P(c6419pE0);
        c6419pE0.p.removeCallbacksAndMessages(null);
        c6419pE0.q = null;
        c6419pE0.M = true;
    }

    @Override // defpackage.AbstractC6883rg
    public final void q() {
        this.j.release();
    }

    @Override // defpackage.AbstractC6883rg
    public final synchronized void t(C6721qp0 c6721qp0) {
        this.r = c6721qp0;
    }

    public final void u() {
        AbstractC0178Ca1 c6378p11 = new C6378p11(this.n, this.o, this.p, h());
        if (this.m) {
            c6378p11 = new C6610qE0(c6378p11);
        }
        n(c6378p11);
    }

    public final void w(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        if (!this.m && this.n == j && this.o == z && this.p == z2) {
            return;
        }
        this.n = j;
        this.o = z;
        this.p = z2;
        this.m = false;
        u();
    }

    @Override // defpackage.AbstractC6883rg
    public final void j() {
    }
}
