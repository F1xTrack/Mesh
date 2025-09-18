package defpackage;

/* renamed from: b11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2245b11 extends IH implements InterfaceC0424Fe1 {
    public final X01 b;
    public final AbstractC0663Ig0 c;

    public C2245b11(X01 x01, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(x01, "delegate");
        O90.f(abstractC0663Ig0, "enhancement");
        this.b = x01;
        this.c = abstractC0663Ig0;
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        AbstractC1521Tg1 abstractC1521Tg1N = EZ1.n(this.b.P(z), this.c.L().P(z));
        O90.d(abstractC1521Tg1N, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (X01) abstractC1521Tg1N;
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        AbstractC1521Tg1 abstractC1521Tg1N = EZ1.n(this.b.T(c0733Jd1), this.c);
        O90.d(abstractC1521Tg1N, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (X01) abstractC1521Tg1N;
    }

    @Override // defpackage.IH
    public final X01 b0() {
        return this.b;
    }

    @Override // defpackage.IH
    public final IH h0(X01 x01) {
        return new C2245b11(x01, this.c);
    }

    @Override // defpackage.IH
    /* renamed from: i0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C2245b11 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = this.b;
        O90.f(x01, "type");
        AbstractC0663Ig0 abstractC0663Ig0 = this.c;
        O90.f(abstractC0663Ig0, "type");
        return new C2245b11(x01, abstractC0663Ig0);
    }

    @Override // defpackage.InterfaceC0424Fe1
    public final AbstractC0663Ig0 k() {
        return this.c;
    }

    @Override // defpackage.InterfaceC0424Fe1
    public final AbstractC1521Tg1 t() {
        return this.b;
    }

    @Override // defpackage.X01
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.c + ")] " + this.b;
    }
}
