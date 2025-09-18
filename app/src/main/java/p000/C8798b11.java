package p000;

/* renamed from: b11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8798b11 extends AbstractC0522IH implements InterfaceC7583Fe1 {

    /* renamed from: b */
    public final X01 f16712b;

    /* renamed from: c */
    public final AbstractC7742Ig0 f16713c;

    public C8798b11(X01 x01, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(x01, "delegate");
        O90.m5968f(abstractC7742Ig0, "enhancement");
        this.f16712b = x01;
        this.f16713c = abstractC7742Ig0;
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        AbstractC8315Tg1 abstractC8315Tg1M2354n = EZ1.m2354n(this.f16712b.mo250P(z), this.f16713c.mo3963L().mo250P(z));
        O90.m5966d(abstractC8315Tg1M2354n, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (X01) abstractC8315Tg1M2354n;
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        AbstractC8315Tg1 abstractC8315Tg1M2354n = EZ1.m2354n(this.f16712b.mo252T(c7789Jd1), this.f16713c);
        O90.m5966d(abstractC8315Tg1M2354n, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (X01) abstractC8315Tg1M2354n;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: b0 */
    public final X01 mo255b0() {
        return this.f16712b;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: h0 */
    public final AbstractC0522IH mo257h0(X01 x01) {
        return new C8798b11(x01, this.f16713c);
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: i0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C8798b11 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = this.f16712b;
        O90.m5968f(x01, "type");
        AbstractC7742Ig0 abstractC7742Ig0 = this.f16713c;
        O90.m5968f(abstractC7742Ig0, "type");
        return new C8798b11(x01, abstractC7742Ig0);
    }

    @Override // p000.InterfaceC7583Fe1
    /* renamed from: k */
    public final AbstractC7742Ig0 mo2720k() {
        return this.f16713c;
    }

    @Override // p000.InterfaceC7583Fe1
    /* renamed from: t */
    public final AbstractC8315Tg1 mo2721t() {
        return this.f16712b;
    }

    @Override // p000.X01
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f16713c + ")] " + this.f16712b;
    }
}
