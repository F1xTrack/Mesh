package p000;

/* renamed from: Sv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8292Sv0 extends AbstractC0522IH implements InterfaceC1649aC {

    /* renamed from: b */
    public final X01 f11074b;

    public C8292Sv0(X01 x01) {
        O90.m5968f(x01, "delegate");
        this.f11074b = x01;
    }

    @Override // p000.AbstractC0522IH, p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return false;
    }

    @Override // p000.X01, p000.AbstractC8315Tg1
    /* renamed from: T */
    public final AbstractC8315Tg1 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return new C8292Sv0(this.f11074b.mo252T(c7789Jd1));
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        return z ? this.f11074b.mo250P(true) : this;
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return new C8292Sv0(this.f11074b.mo252T(c7789Jd1));
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: b0 */
    public final X01 mo255b0() {
        return this.f11074b;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: h0 */
    public final AbstractC0522IH mo257h0(X01 x01) {
        return new C8292Sv0(x01);
    }

    @Override // p000.InterfaceC1649aC
    /* renamed from: n */
    public final AbstractC8315Tg1 mo7465n(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "replacement");
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (!AbstractC7375Be1.m788f(abstractC8315Tg1Mo3963L) && !AbstractC7375Be1.m787e(abstractC8315Tg1Mo3963L)) {
            return abstractC8315Tg1Mo3963L;
        }
        if (abstractC8315Tg1Mo3963L instanceof X01) {
            X01 x01 = (X01) abstractC8315Tg1Mo3963L;
            X01 x01Mo250P = x01.mo250P(false);
            return !AbstractC7375Be1.m788f(x01) ? x01Mo250P : new C8292Sv0(x01Mo250P);
        }
        if (!(abstractC8315Tg1Mo3963L instanceof AbstractC3933dW)) {
            throw new IllegalStateException(("Incorrect type: " + abstractC8315Tg1Mo3963L).toString());
        }
        AbstractC3933dW abstractC3933dW = (AbstractC3933dW) abstractC8315Tg1Mo3963L;
        X01 x012 = abstractC3933dW.f26126b;
        X01 x01Mo250P2 = x012.mo250P(false);
        if (AbstractC7375Be1.m788f(x012)) {
            x01Mo250P2 = new C8292Sv0(x01Mo250P2);
        }
        X01 x013 = abstractC3933dW.f26127c;
        X01 x01Mo250P3 = x013.mo250P(false);
        if (AbstractC7375Be1.m788f(x013)) {
            x01Mo250P3 = new C8292Sv0(x01Mo250P3);
        }
        return EZ1.m2354n(NV1.m5738t(x01Mo250P2, x01Mo250P3), EZ1.m2351k(abstractC8315Tg1Mo3963L));
    }

    @Override // p000.InterfaceC1649aC
    /* renamed from: r */
    public final boolean mo7466r() {
        return true;
    }
}
