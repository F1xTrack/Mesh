package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: ni0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC6127ni0 implements GB0, View.OnClickListener {
    public final /* synthetic */ C6509pi0 a;

    public ViewOnClickListenerC6127ni0(C6509pi0 c6509pi0) {
        this.a = c6509pi0;
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void B(int i, boolean z) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void C(CB0 cb0) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void D(EB0 eb0) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void F(C0540Gr0 c0540Gr0) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void G(C6721qp0 c6721qp0, int i) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void H(int i, int i2) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void I(boolean z) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void b(Q9 q9) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void e(C1530Tj1 c1530Tj1) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void h(int i, boolean z) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void i(float f) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void j(int i) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void n(C7554vB c7554vB) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6509pi0 c6509pi0 = this.a;
        IB0 ib0 = c6509pi0.G;
        if (ib0 == null) {
            return;
        }
        if (c6509pi0.d == view) {
            ((U0) ib0).p1();
            return;
        }
        if (c6509pi0.c == view) {
            ((U0) ib0).r1();
            return;
        }
        if (c6509pi0.g == view) {
            if (((XQ) ib0).K1() != 4) {
                U0 u0 = (U0) ib0;
                XQ xq = (XQ) u0;
                xq.g2();
                u0.q1(12, xq.v);
                return;
            }
            return;
        }
        if (c6509pi0.h == view) {
            U0 u02 = (U0) ib0;
            XQ xq2 = (XQ) u02;
            xq2.g2();
            u02.q1(11, -xq2.u);
            return;
        }
        if (c6509pi0.e == view) {
            AbstractC0277Dh1.I(ib0);
            return;
        }
        if (c6509pi0.f == view) {
            AbstractC0277Dh1.H(ib0);
            return;
        }
        if (c6509pi0.i == view) {
            XQ xq3 = (XQ) ib0;
            xq3.g2();
            int i = xq3.F;
            int i2 = c6509pi0.O;
            for (int i3 = 1; i3 <= 2; i3++) {
                int i4 = (i + i3) % 3;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2 || (i2 & 2) == 0) {
                        }
                    } else if ((i2 & 1) == 0) {
                    }
                }
                i = i4;
            }
            xq3.Y1(i);
            return;
        }
        if (c6509pi0.j == view) {
            XQ xq4 = (XQ) ib0;
            xq4.g2();
            boolean z = !xq4.G;
            xq4.g2();
            if (xq4.G != z) {
                xq4.G = z;
                R71 r71 = xq4.l.h;
                r71.getClass();
                Q71 q71B = R71.b();
                q71B.a = r71.a.obtainMessage(12, z ? 1 : 0, 0);
                q71B.b();
                SQ sq = new SQ(z, 0);
                C1607Uj0 c1607Uj0 = xq4.m;
                c1607Uj0.c(9, sq);
                xq4.c2();
                c1607Uj0.b();
            }
        }
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void p(C3615ec1 c3615ec1) {
    }

    @Override // defpackage.GB0
    public final void q(IB0 ib0, FB0 fb0) {
        boolean zA = fb0.a(4, 5);
        C6509pi0 c6509pi0 = this.a;
        if (zA) {
            c6509pi0.h();
        }
        if (fb0.a(4, 5, 7)) {
            c6509pi0.i();
        }
        VV vv = fb0.a;
        if (vv.a.get(8)) {
            c6509pi0.j();
        }
        if (vv.a.get(9)) {
            c6509pi0.k();
        }
        if (fb0.a(8, 9, 11, 0, 13)) {
            c6509pi0.g();
        }
        if (fb0.a(11, 0)) {
            c6509pi0.l();
        }
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void r(int i, HB0 hb0, HB0 hb02) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void t(C7484up0 c7484up0) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void u(IQ iq) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void w(int i) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void x(IQ iq) {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.GB0
    public final /* synthetic */ void z(boolean z) {
    }
}
