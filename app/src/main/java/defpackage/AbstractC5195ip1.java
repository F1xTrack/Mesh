package defpackage;

/* renamed from: ip1 */
/* loaded from: classes.dex */
public abstract class AbstractC5195ip1 extends AbstractC1720Vv {
    public final AbstractC6883rg k;

    public AbstractC5195ip1(AbstractC6883rg abstractC6883rg) {
        this.k = abstractC6883rg;
    }

    public abstract void B(AbstractC0178Ca1 abstractC0178Ca1);

    public final void C() {
        z(null, this.k);
    }

    public void D() {
        C();
    }

    @Override // defpackage.AbstractC6883rg
    public final AbstractC0178Ca1 g() {
        return this.k.g();
    }

    @Override // defpackage.AbstractC6883rg
    public final C6721qp0 h() {
        return this.k.h();
    }

    @Override // defpackage.AbstractC6883rg
    public final boolean i() {
        return this.k.i();
    }

    @Override // defpackage.AbstractC6883rg
    public final void l(InterfaceC4188hc1 interfaceC4188hc1) {
        this.j = interfaceC4188hc1;
        this.i = AbstractC0277Dh1.n(null);
        D();
    }

    @Override // defpackage.AbstractC6883rg
    public void t(C6721qp0 c6721qp0) {
        this.k.t(c6721qp0);
    }

    @Override // defpackage.AbstractC1720Vv
    public final C0456Fp0 u(Object obj, C0456Fp0 c0456Fp0) {
        return A(c0456Fp0);
    }

    @Override // defpackage.AbstractC1720Vv
    public final long w(long j, Object obj) {
        return j;
    }

    @Override // defpackage.AbstractC1720Vv
    public final int x(int i, Object obj) {
        return i;
    }

    @Override // defpackage.AbstractC1720Vv
    public final void y(Object obj, AbstractC6883rg abstractC6883rg, AbstractC0178Ca1 abstractC0178Ca1) {
        B(abstractC0178Ca1);
    }

    public C0456Fp0 A(C0456Fp0 c0456Fp0) {
        return c0456Fp0;
    }
}
