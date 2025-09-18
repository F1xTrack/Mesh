package defpackage;

/* loaded from: classes2.dex */
public abstract class JH extends IH {
    public final X01 b;

    public JH(X01 x01) {
        this.b = x01;
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        return z == G() ? this : this.b.P(z).T(B());
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return c0733Jd1 != B() ? new C2054a11(this, c0733Jd1) : this;
    }

    @Override // defpackage.IH
    public final X01 b0() {
        return this.b;
    }
}
