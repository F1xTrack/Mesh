package p000;

/* renamed from: a11 */
/* loaded from: classes2.dex */
public final class C8670a11 extends AbstractC0585JH {

    /* renamed from: c */
    public final C7789Jd1 f15288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8670a11(X01 x01, C7789Jd1 c7789Jd1) {
        super(x01);
        O90.m5968f(c7789Jd1, "attributes");
        this.f15288c = c7789Jd1;
    }

    @Override // p000.AbstractC0522IH, p000.AbstractC7742Ig0
    /* renamed from: B */
    public final C7789Jd1 mo3796B() {
        return this.f15288c;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: h0 */
    public final AbstractC0522IH mo257h0(X01 x01) {
        return new C8670a11(x01, this.f15288c);
    }
}
