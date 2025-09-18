package p000;

/* renamed from: qH */
/* loaded from: classes2.dex */
public final class C6670qH extends AbstractC0522IH implements InterfaceC1649aC, Z01 {

    /* renamed from: b */
    public final X01 f40714b;

    /* renamed from: c */
    public final boolean f40715c;

    public C6670qH(X01 x01, boolean z) {
        this.f40714b = x01;
        this.f40715c = z;
    }

    @Override // p000.AbstractC0522IH, p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return false;
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        return z ? this.f40714b.mo250P(z) : this;
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return new C6670qH(this.f40714b.mo252T(c7789Jd1), this.f40715c);
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: b0 */
    public final X01 mo255b0() {
        return this.f40714b;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: h0 */
    public final AbstractC0522IH mo257h0(X01 x01) {
        return new C6670qH(x01, this.f40715c);
    }

    @Override // p000.InterfaceC1649aC
    /* renamed from: n */
    public final AbstractC8315Tg1 mo7465n(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "replacement");
        return KS1.m4646b(abstractC7742Ig0.mo3963L(), this.f40715c);
    }

    @Override // p000.InterfaceC1649aC
    /* renamed from: r */
    public final boolean mo7466r() {
        X01 x01 = this.f40714b;
        x01.mo3797E();
        return x01.mo3797E().mo1962a() instanceof InterfaceC10292me1;
    }

    @Override // p000.X01
    public final String toString() {
        return this.f40714b + " & Any";
    }
}
