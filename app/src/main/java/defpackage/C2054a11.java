package defpackage;

/* renamed from: a11 */
/* loaded from: classes2.dex */
public final class C2054a11 extends JH {
    public final C0733Jd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2054a11(X01 x01, C0733Jd1 c0733Jd1) {
        super(x01);
        O90.f(c0733Jd1, "attributes");
        this.c = c0733Jd1;
    }

    @Override // defpackage.IH, defpackage.AbstractC0663Ig0
    public final C0733Jd1 B() {
        return this.c;
    }

    @Override // defpackage.IH
    public final IH h0(X01 x01) {
        return new C2054a11(x01, this.c);
    }
}
