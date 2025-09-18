package p000;

/* renamed from: JH */
/* loaded from: classes2.dex */
public abstract class AbstractC0585JH extends AbstractC0522IH {

    /* renamed from: b */
    public final X01 f5442b;

    public AbstractC0585JH(X01 x01) {
        this.f5442b = x01;
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        return z == mo3798G() ? this : this.f5442b.mo250P(z).mo252T(mo3796B());
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return c7789Jd1 != mo3796B() ? new C8670a11(this, c7789Jd1) : this;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: b0 */
    public final X01 mo255b0() {
        return this.f5442b;
    }
}
