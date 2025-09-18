package p000;

/* renamed from: q */
/* loaded from: classes2.dex */
public final class C6652q extends AbstractC0522IH {

    /* renamed from: b */
    public final X01 f40477b;

    /* renamed from: c */
    public final X01 f40478c;

    public C6652q(X01 x01, X01 x012) {
        O90.m5968f(x01, "delegate");
        O90.m5968f(x012, "abbreviation");
        this.f40477b = x01;
        this.f40478c = x012;
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return new C6652q(this.f40477b.mo252T(c7789Jd1), this.f40478c);
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: b0 */
    public final X01 mo255b0() {
        return this.f40477b;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: h0 */
    public final AbstractC0522IH mo257h0(X01 x01) {
        return new C6652q(x01, this.f40478c);
    }

    @Override // p000.X01
    /* renamed from: i0 */
    public final C6652q mo250P(boolean z) {
        return new C6652q(this.f40477b.mo250P(z), this.f40478c.mo250P(z));
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C6652q mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = this.f40477b;
        O90.m5968f(x01, "type");
        X01 x012 = this.f40478c;
        O90.m5968f(x012, "type");
        return new C6652q(x01, x012);
    }
}
