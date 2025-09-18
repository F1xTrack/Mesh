package p000;

/* renamed from: gW */
/* loaded from: classes2.dex */
public final class C4121gW extends AbstractC3933dW implements InterfaceC7583Fe1 {

    /* renamed from: d */
    public final AbstractC3933dW f27820d;

    /* renamed from: e */
    public final AbstractC7742Ig0 f27821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4121gW(AbstractC3933dW abstractC3933dW, AbstractC7742Ig0 abstractC7742Ig0) {
        super(abstractC3933dW.f26126b, abstractC3933dW.f26127c);
        O90.m5968f(abstractC3933dW, "origin");
        O90.m5968f(abstractC7742Ig0, "enhancement");
        this.f27820d = abstractC3933dW;
        this.f27821e = abstractC7742Ig0;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        AbstractC3933dW abstractC3933dW = this.f27820d;
        O90.m5968f(abstractC3933dW, "type");
        AbstractC7742Ig0 abstractC7742Ig0 = this.f27821e;
        O90.m5968f(abstractC7742Ig0, "type");
        return new C4121gW(abstractC3933dW, abstractC7742Ig0);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: P */
    public final AbstractC8315Tg1 mo250P(boolean z) {
        return EZ1.m2354n(this.f27820d.mo250P(z), this.f27821e.mo3963L().mo250P(z));
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: R */
    public final AbstractC8315Tg1 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        AbstractC3933dW abstractC3933dW = this.f27820d;
        O90.m5968f(abstractC3933dW, "type");
        AbstractC7742Ig0 abstractC7742Ig0 = this.f27821e;
        O90.m5968f(abstractC7742Ig0, "type");
        return new C4121gW(abstractC3933dW, abstractC7742Ig0);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: T */
    public final AbstractC8315Tg1 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return EZ1.m2354n(this.f27820d.mo252T(c7789Jd1), this.f27821e);
    }

    @Override // p000.AbstractC3933dW
    /* renamed from: U */
    public final X01 mo17701U() {
        return this.f27820d.mo17701U();
    }

    @Override // p000.AbstractC3933dW
    /* renamed from: a0 */
    public final String mo17702a0(C6417mI c6417mI, C6417mI c6417mI2) {
        O90.m5968f(c6417mI, "renderer");
        C6671qI c6671qI = c6417mI2.f37620a;
        c6671qI.getClass();
        return ((Boolean) c6671qI.f40755m.getValue(c6671qI, C6671qI.f40719X[11])).booleanValue() ? c6417mI.m22736X(this.f27821e) : this.f27820d.mo17702a0(c6417mI, c6417mI2);
    }

    @Override // p000.InterfaceC7583Fe1
    /* renamed from: k */
    public final AbstractC7742Ig0 mo2720k() {
        return this.f27821e;
    }

    @Override // p000.InterfaceC7583Fe1
    /* renamed from: t */
    public final AbstractC8315Tg1 mo2721t() {
        return this.f27820d;
    }

    @Override // p000.AbstractC3933dW
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f27821e + ")] " + this.f27820d;
    }
}
