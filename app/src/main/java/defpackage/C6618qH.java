package defpackage;

/* renamed from: qH */
/* loaded from: classes2.dex */
public final class C6618qH extends IH implements InterfaceC2088aC, Z01 {
    public final X01 b;
    public final boolean c;

    public C6618qH(X01 x01, boolean z) {
        this.b = x01;
        this.c = z;
    }

    @Override // defpackage.IH, defpackage.AbstractC0663Ig0
    public final boolean G() {
        return false;
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        return z ? this.b.P(z) : this;
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return new C6618qH(this.b.T(c0733Jd1), this.c);
    }

    @Override // defpackage.IH
    public final X01 b0() {
        return this.b;
    }

    @Override // defpackage.IH
    public final IH h0(X01 x01) {
        return new C6618qH(x01, this.c);
    }

    @Override // defpackage.InterfaceC2088aC
    public final AbstractC1521Tg1 n(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "replacement");
        return KS1.b(abstractC0663Ig0.L(), this.c);
    }

    @Override // defpackage.InterfaceC2088aC
    public final boolean r() {
        X01 x01 = this.b;
        x01.E();
        return x01.E().a() instanceof InterfaceC5925me1;
    }

    @Override // defpackage.X01
    public final String toString() {
        return this.b + " & Any";
    }
}
