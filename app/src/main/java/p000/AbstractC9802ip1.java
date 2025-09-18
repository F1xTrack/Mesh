package p000;

/* renamed from: ip1 */
/* loaded from: classes.dex */
public abstract class AbstractC9802ip1 extends AbstractC1379Vv {

    /* renamed from: k */
    public final AbstractC6758rg f34756k;

    public AbstractC9802ip1(AbstractC6758rg abstractC6758rg) {
        this.f34756k = abstractC6758rg;
    }

    /* renamed from: B */
    public abstract void mo3158B(AbstractC7419Ca1 abstractC7419Ca1);

    /* renamed from: C */
    public final void m21931C() {
        m8639z(null, this.f34756k);
    }

    /* renamed from: D */
    public void mo3159D() {
        m21931C();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: g */
    public final AbstractC7419Ca1 mo21932g() {
        return this.f34756k.mo21932g();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: h */
    public final C10825qp0 mo6202h() {
        return this.f34756k.mo6202h();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: i */
    public final boolean mo21933i() {
        return this.f34756k.mo21933i();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: l */
    public final void mo6203l(InterfaceC9648hc1 interfaceC9648hc1) {
        this.f12861j = interfaceC9648hc1;
        this.f12860i = AbstractC7485Dh1.m1829n(null);
        mo3159D();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: t */
    public void mo3166t(C10825qp0 c10825qp0) {
        this.f34756k.mo3166t(c10825qp0);
    }

    @Override // p000.AbstractC1379Vv
    /* renamed from: u */
    public final C7604Fp0 mo8635u(Object obj, C7604Fp0 c7604Fp0) {
        return mo3157A(c7604Fp0);
    }

    @Override // p000.AbstractC1379Vv
    /* renamed from: w */
    public final long mo8636w(long j, Object obj) {
        return j;
    }

    @Override // p000.AbstractC1379Vv
    /* renamed from: x */
    public final int mo8637x(int i, Object obj) {
        return i;
    }

    @Override // p000.AbstractC1379Vv
    /* renamed from: y */
    public final void mo8638y(Object obj, AbstractC6758rg abstractC6758rg, AbstractC7419Ca1 abstractC7419Ca1) {
        mo3158B(abstractC7419Ca1);
    }

    /* renamed from: A */
    public C7604Fp0 mo3157A(C7604Fp0 c7604Fp0) {
        return c7604Fp0;
    }
}
