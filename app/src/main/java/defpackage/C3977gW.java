package defpackage;

/* renamed from: gW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3977gW extends AbstractC3405dW implements InterfaceC0424Fe1 {
    public final AbstractC3405dW d;
    public final AbstractC0663Ig0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3977gW(AbstractC3405dW abstractC3405dW, AbstractC0663Ig0 abstractC0663Ig0) {
        super(abstractC3405dW.b, abstractC3405dW.c);
        O90.f(abstractC3405dW, "origin");
        O90.f(abstractC0663Ig0, "enhancement");
        this.d = abstractC3405dW;
        this.e = abstractC0663Ig0;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC0663Ig0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        AbstractC3405dW abstractC3405dW = this.d;
        O90.f(abstractC3405dW, "type");
        AbstractC0663Ig0 abstractC0663Ig0 = this.e;
        O90.f(abstractC0663Ig0, "type");
        return new C3977gW(abstractC3405dW, abstractC0663Ig0);
    }

    @Override // defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 P(boolean z) {
        return EZ1.n(this.d.P(z), this.e.L().P(z));
    }

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: R */
    public final AbstractC1521Tg1 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        AbstractC3405dW abstractC3405dW = this.d;
        O90.f(abstractC3405dW, "type");
        AbstractC0663Ig0 abstractC0663Ig0 = this.e;
        O90.f(abstractC0663Ig0, "type");
        return new C3977gW(abstractC3405dW, abstractC0663Ig0);
    }

    @Override // defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return EZ1.n(this.d.T(c0733Jd1), this.e);
    }

    @Override // defpackage.AbstractC3405dW
    public final X01 U() {
        return this.d.U();
    }

    @Override // defpackage.AbstractC3405dW
    public final String a0(C5857mI c5857mI, C5857mI c5857mI2) {
        O90.f(c5857mI, "renderer");
        C6621qI c6621qI = c5857mI2.a;
        c6621qI.getClass();
        return ((Boolean) c6621qI.m.getValue(c6621qI, C6621qI.X[11])).booleanValue() ? c5857mI.X(this.e) : this.d.a0(c5857mI, c5857mI2);
    }

    @Override // defpackage.InterfaceC0424Fe1
    public final AbstractC0663Ig0 k() {
        return this.e;
    }

    @Override // defpackage.InterfaceC0424Fe1
    public final AbstractC1521Tg1 t() {
        return this.d;
    }

    @Override // defpackage.AbstractC3405dW
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.e + ")] " + this.d;
    }
}
