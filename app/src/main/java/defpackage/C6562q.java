package defpackage;

/* renamed from: q */
/* loaded from: classes2.dex */
public final class C6562q extends IH {
    public final X01 b;
    public final X01 c;

    public C6562q(X01 x01, X01 x012) {
        O90.f(x01, "delegate");
        O90.f(x012, "abbreviation");
        this.b = x01;
        this.c = x012;
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return new C6562q(this.b.T(c0733Jd1), this.c);
    }

    @Override // defpackage.IH
    public final X01 b0() {
        return this.b;
    }

    @Override // defpackage.IH
    public final IH h0(X01 x01) {
        return new C6562q(x01, this.c);
    }

    @Override // defpackage.X01
    /* renamed from: i0 */
    public final C6562q P(boolean z) {
        return new C6562q(this.b.P(z), this.c.P(z));
    }

    @Override // defpackage.IH
    /* renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C6562q I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = this.b;
        O90.f(x01, "type");
        X01 x012 = this.c;
        O90.f(x012, "type");
        return new C6562q(x01, x012);
    }
}
