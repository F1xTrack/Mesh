package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;

/* renamed from: zE */
/* loaded from: classes.dex */
public final class C8323zE implements GB0, InterfaceC0846Kp0, InterfaceC0113Bf, PL {
    public final M71 a;
    public final C0022Aa1 b;
    public final C0100Ba1 c;
    public final C1241Pr0 d;
    public final SparseArray e;
    public C1607Uj0 f;
    public IB0 g;
    public R71 h;
    public boolean i;

    public C8323zE(M71 m71) {
        m71.getClass();
        this.a = m71;
        int i = AbstractC0277Dh1.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new C1607Uj0(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, m71, new C4403il(29));
        C0022Aa1 c0022Aa1 = new C0022Aa1();
        this.b = c0022Aa1;
        this.c = new C0100Ba1();
        C1241Pr0 c1241Pr0 = new C1241Pr0();
        c1241Pr0.a = c0022Aa1;
        N70 n70 = P70.b;
        c1241Pr0.b = C3769fQ0.e;
        c1241Pr0.c = C5500kQ0.g;
        this.d = c1241Pr0;
        this.e = new SparseArray();
    }

    @Override // defpackage.GB0
    public final void A(List list) {
        Y3 y3J = J();
        Q(y3J, 27, new C6609qE(y3J, list));
    }

    @Override // defpackage.GB0
    public final void B(int i, boolean z) {
        Y3 y3J = J();
        Q(y3J, -1, new C4403il(y3J, z, i));
    }

    @Override // defpackage.GB0
    public final void C(CB0 cb0) {
        Y3 y3J = J();
        Q(y3J, 12, new C0515Gj(y3J, 12, cb0));
    }

    @Override // defpackage.GB0
    public final void D(EB0 eb0) {
        Y3 y3J = J();
        Q(y3J, 13, new C6799rE(y3J, eb0, 10));
    }

    @Override // defpackage.InterfaceC0846Kp0
    public final void E(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1001, new C6799rE(y3O, c4020gk0, c7102sp0, 8));
    }

    @Override // defpackage.GB0
    public final void F(C0540Gr0 c0540Gr0) {
        Y3 y3J = J();
        Q(y3J, 28, new C0515Gj(y3J, 15, c0540Gr0));
    }

    @Override // defpackage.GB0
    public final void G(C6721qp0 c6721qp0, int i) {
        Y3 y3J = J();
        Q(y3J, 1, new C5463kE(y3J, c6721qp0, i));
    }

    @Override // defpackage.GB0
    public final void H(int i, int i2) {
        Y3 y3P = P();
        Q(y3P, 24, new C7563vE(y3P, i, i2));
    }

    @Override // defpackage.GB0
    public final void I(boolean z) {
        Y3 y3J = J();
        Q(y3J, 7, new C5845mE(y3J, z, 0));
    }

    public final Y3 J() {
        return L((C0456Fp0) this.d.d);
    }

    @Override // defpackage.InterfaceC0846Kp0
    public final void K(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0, IOException iOException, boolean z) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1003, new C4290i9(y3O, c4020gk0, c7102sp0, iOException, z));
    }

    public final Y3 L(C0456Fp0 c0456Fp0) {
        this.g.getClass();
        AbstractC0178Ca1 abstractC0178Ca1 = c0456Fp0 == null ? null : (AbstractC0178Ca1) ((C5500kQ0) this.d.c).get(c0456Fp0);
        if (c0456Fp0 != null && abstractC0178Ca1 != null) {
            return M(abstractC0178Ca1, abstractC0178Ca1.g(c0456Fp0.a, this.b).c, c0456Fp0);
        }
        int iD1 = ((XQ) this.g).D1();
        AbstractC0178Ca1 abstractC0178Ca1G1 = ((XQ) this.g).G1();
        if (iD1 >= abstractC0178Ca1G1.o()) {
            abstractC0178Ca1G1 = AbstractC0178Ca1.a;
        }
        return M(abstractC0178Ca1G1, iD1, null);
    }

    public final Y3 M(AbstractC0178Ca1 abstractC0178Ca1, int i, C0456Fp0 c0456Fp0) {
        C0456Fp0 c0456Fp02 = abstractC0178Ca1.p() ? null : c0456Fp0;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = abstractC0178Ca1.equals(((XQ) this.g).G1()) && i == ((XQ) this.g).D1();
        long jD0 = 0;
        if (c0456Fp02 == null || !c0456Fp02.b()) {
            if (z) {
                XQ xq = (XQ) this.g;
                xq.g2();
                jD0 = xq.A1(xq.u1);
            } else if (!abstractC0178Ca1.p()) {
                jD0 = AbstractC0277Dh1.d0(abstractC0178Ca1.m(i, this.c, 0L).l);
            }
        } else if (z && ((XQ) this.g).B1() == c0456Fp02.b && ((XQ) this.g).C1() == c0456Fp02.c) {
            jD0 = ((XQ) this.g).E1();
        }
        C0456Fp0 c0456Fp03 = (C0456Fp0) this.d.d;
        AbstractC0178Ca1 abstractC0178Ca1G1 = ((XQ) this.g).G1();
        int iD1 = ((XQ) this.g).D1();
        long jE1 = ((XQ) this.g).E1();
        XQ xq2 = (XQ) this.g;
        xq2.g2();
        return new Y3(jElapsedRealtime, abstractC0178Ca1, i, c0456Fp02, jD0, abstractC0178Ca1G1, iD1, c0456Fp03, jE1, AbstractC0277Dh1.d0(xq2.u1.r));
    }

    @Override // defpackage.PL
    public final void N(int i, C0456Fp0 c0456Fp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1025, new C6990sE(y3O, 3));
    }

    public final Y3 O(int i, C0456Fp0 c0456Fp0) {
        this.g.getClass();
        if (c0456Fp0 != null) {
            return ((AbstractC0178Ca1) ((C5500kQ0) this.d.c).get(c0456Fp0)) != null ? L(c0456Fp0) : M(AbstractC0178Ca1.a, i, c0456Fp0);
        }
        AbstractC0178Ca1 abstractC0178Ca1G1 = ((XQ) this.g).G1();
        if (i >= abstractC0178Ca1G1.o()) {
            abstractC0178Ca1G1 = AbstractC0178Ca1.a;
        }
        return M(abstractC0178Ca1G1, i, null);
    }

    public final Y3 P() {
        return L((C0456Fp0) this.d.f);
    }

    public final void Q(Y3 y3, int i, InterfaceC1373Rj0 interfaceC1373Rj0) {
        this.e.put(i, y3);
        this.f.f(i, interfaceC1373Rj0);
    }

    public final void R(IB0 ib0, Looper looper) {
        YN1.f(this.g == null || ((P70) this.d.b).isEmpty());
        ib0.getClass();
        this.g = ib0;
        this.h = this.a.a(looper, null);
        C1607Uj0 c1607Uj0 = this.f;
        this.f = new C1607Uj0(c1607Uj0.d, looper, c1607Uj0.a, new C0515Gj(this, 13, ib0), c1607Uj0.i);
    }

    @Override // defpackage.GB0
    public final void a(int i) {
        Y3 y3J = J();
        Q(y3J, 6, new C5463kE(y3J, i, 2));
    }

    @Override // defpackage.GB0
    public final void b(Q9 q9) {
        Y3 y3P = P();
        Q(y3P, 20, new C0515Gj(y3P, 14, q9));
    }

    @Override // defpackage.PL
    public final void b0(int i, C0456Fp0 c0456Fp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1023, new C6990sE(y3O, 4));
    }

    @Override // defpackage.PL
    public final void c(int i, C0456Fp0 c0456Fp0, Exception exc) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1024, new C0515Gj(y3O, 19, exc));
    }

    @Override // defpackage.InterfaceC0846Kp0
    public final void d(int i, C0456Fp0 c0456Fp0, C7102sp0 c7102sp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new C7753wE(y3O, c7102sp0, 0));
    }

    @Override // defpackage.GB0
    public final void e(C1530Tj1 c1530Tj1) {
        Y3 y3P = P();
        Q(y3P, 25, new C0515Gj(y3P, 20, c1530Tj1));
    }

    @Override // defpackage.InterfaceC0846Kp0
    public final void f(int i, C0456Fp0 c0456Fp0, C7102sp0 c7102sp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, new C7753wE(y3O, c7102sp0, 1));
    }

    @Override // defpackage.GB0
    public final void g(boolean z) {
        Y3 y3J = J();
        Q(y3J, 3, new C5845mE(y3J, z, 3));
    }

    @Override // defpackage.GB0
    public final void h(final int i, final boolean z) {
        final Y3 y3J = J();
        Q(y3J, 5, new InterfaceC1373Rj0() { // from class: pE
            @Override // defpackage.InterfaceC1373Rj0
            public final void invoke(Object obj) {
                ((Z3) obj).N(y3J, z, i);
            }
        });
    }

    @Override // defpackage.GB0
    public final void i(final float f) {
        final Y3 y3P = P();
        Q(y3P, 22, new InterfaceC1373Rj0() { // from class: lE
            @Override // defpackage.InterfaceC1373Rj0
            public final void invoke(Object obj) {
                ((Z3) obj).F(y3P, f);
            }
        });
    }

    @Override // defpackage.GB0
    public final void j(int i) {
        Y3 y3J = J();
        Q(y3J, 4, new C5463kE(y3J, i, 4));
    }

    @Override // defpackage.InterfaceC0113Bf
    public final void k(int i, long j, long j2) {
        C1241Pr0 c1241Pr0 = this.d;
        Y3 y3L = L(((P70) c1241Pr0.b).isEmpty() ? null : (C0456Fp0) AbstractC7337u22.b((P70) c1241Pr0.b));
        Q(y3L, 1006, new C6036nE(y3L, i, j, j2));
    }

    @Override // defpackage.PL
    public final void k0(int i, C0456Fp0 c0456Fp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1027, new C6990sE(y3O, 2));
    }

    @Override // defpackage.PL
    public final void l(int i, C0456Fp0 c0456Fp0, int i2) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1022, new C5463kE(y3O, i2, 6));
    }

    @Override // defpackage.GB0
    public final void m(boolean z) {
        Y3 y3J = J();
        Q(y3J, 9, new C5845mE(y3J, z, 1));
    }

    @Override // defpackage.GB0
    public final void n(C7554vB c7554vB) {
        Y3 y3J = J();
        Q(y3J, 27, new C6799rE(y3J, c7554vB, 7));
    }

    @Override // defpackage.InterfaceC0846Kp0
    public final void o(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1000, new C6799rE(y3O, c4020gk0, c7102sp0, 5));
    }

    @Override // defpackage.GB0
    public final void p(C3615ec1 c3615ec1) {
        Y3 y3J = J();
        Q(y3J, 2, new C0515Gj(y3J, 17, c3615ec1));
    }

    @Override // defpackage.GB0
    public final void r(int i, HB0 hb0, HB0 hb02) {
        if (i == 1) {
            this.i = false;
        }
        IB0 ib0 = this.g;
        ib0.getClass();
        C1241Pr0 c1241Pr0 = this.d;
        c1241Pr0.d = C1241Pr0.p(ib0, (P70) c1241Pr0.b, (C0456Fp0) c1241Pr0.e, (C0022Aa1) c1241Pr0.a);
        Y3 y3J = J();
        Q(y3J, 11, new C7372uE(i, y3J, hb0, hb02));
    }

    @Override // defpackage.GB0
    public final void s(int i) {
        IB0 ib0 = this.g;
        ib0.getClass();
        C1241Pr0 c1241Pr0 = this.d;
        c1241Pr0.d = C1241Pr0.p(ib0, (P70) c1241Pr0.b, (C0456Fp0) c1241Pr0.e, (C0022Aa1) c1241Pr0.a);
        c1241Pr0.D(((XQ) ib0).G1());
        Y3 y3J = J();
        Q(y3J, 0, new C5463kE(y3J, i, 0));
    }

    @Override // defpackage.GB0
    public final void t(C7484up0 c7484up0) {
        Y3 y3J = J();
        Q(y3J, 14, new C6799rE(y3J, c7484up0, 9));
    }

    @Override // defpackage.GB0
    public final void u(IQ iq) {
        C0456Fp0 c0456Fp0;
        Y3 y3J = (!(iq instanceof IQ) || (c0456Fp0 = iq.h) == null) ? J() : L(c0456Fp0);
        Q(y3J, 10, new C4403il(y3J, iq, 28));
    }

    @Override // defpackage.InterfaceC0846Kp0
    public final void v(int i, C0456Fp0 c0456Fp0, C4020gk0 c4020gk0, C7102sp0 c7102sp0) {
        Y3 y3O = O(i, c0456Fp0);
        Q(y3O, 1002, new C6799rE(y3O, c4020gk0, c7102sp0, 6));
    }

    @Override // defpackage.GB0
    public final void w(int i) {
        Y3 y3J = J();
        Q(y3J, 8, new C5463kE(y3J, i, 5));
    }

    @Override // defpackage.GB0
    public final void x(IQ iq) {
        C0456Fp0 c0456Fp0;
        Y3 y3J = (!(iq instanceof IQ) || (c0456Fp0 = iq.h) == null) ? J() : L(c0456Fp0);
        Q(y3J, 10, new C0515Gj(y3J, 16, iq));
    }

    @Override // defpackage.GB0
    public final void z(boolean z) {
        Y3 y3P = P();
        Q(y3P, 23, new C5845mE(y3P, z, 2));
    }

    @Override // defpackage.GB0
    public final void y() {
    }

    @Override // defpackage.GB0
    public final void q(IB0 ib0, FB0 fb0) {
    }
}
