package p000;

/* renamed from: fW */
/* loaded from: classes2.dex */
public final class C4058fW extends AbstractC3933dW implements InterfaceC1649aC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4058fW(X01 x01, X01 x012) {
        super(x01, x012);
        O90.m5968f(x01, "lowerBound");
        O90.m5968f(x012, "upperBound");
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = this.f26126b;
        O90.m5968f(x01, "type");
        X01 x012 = this.f26127c;
        O90.m5968f(x012, "type");
        return new C4058fW(x01, x012);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: P */
    public final AbstractC8315Tg1 mo250P(boolean z) {
        return NV1.m5738t(this.f26126b.mo250P(z), this.f26127c.mo250P(z));
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: R */
    public final AbstractC8315Tg1 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = this.f26126b;
        O90.m5968f(x01, "type");
        X01 x012 = this.f26127c;
        O90.m5968f(x012, "type");
        return new C4058fW(x01, x012);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: T */
    public final AbstractC8315Tg1 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return NV1.m5738t(this.f26126b.mo252T(c7789Jd1), this.f26127c.mo252T(c7789Jd1));
    }

    @Override // p000.AbstractC3933dW
    /* renamed from: U */
    public final X01 mo17701U() {
        return this.f26126b;
    }

    @Override // p000.AbstractC3933dW
    /* renamed from: a0 */
    public final String mo17702a0(C6417mI c6417mI, C6417mI c6417mI2) {
        O90.m5968f(c6417mI, "renderer");
        boolean zM23964n = c6417mI2.f37620a.m23964n();
        X01 x01 = this.f26127c;
        X01 x012 = this.f26126b;
        if (!zM23964n) {
            return c6417mI.m22718E(c6417mI.m22736X(x012), c6417mI.m22736X(x01), CZ1.m1230f(this));
        }
        return "(" + c6417mI.m22736X(x012) + ".." + c6417mI.m22736X(x01) + ')';
    }

    @Override // p000.InterfaceC1649aC
    /* renamed from: n */
    public final AbstractC8315Tg1 mo7465n(AbstractC7742Ig0 abstractC7742Ig0) {
        AbstractC8315Tg1 abstractC8315Tg1M5738t;
        O90.m5968f(abstractC7742Ig0, "replacement");
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (abstractC8315Tg1Mo3963L instanceof AbstractC3933dW) {
            abstractC8315Tg1M5738t = abstractC8315Tg1Mo3963L;
        } else {
            if (!(abstractC8315Tg1Mo3963L instanceof X01)) {
                throw new C6838sg();
            }
            X01 x01 = (X01) abstractC8315Tg1Mo3963L;
            abstractC8315Tg1M5738t = NV1.m5738t(x01, x01.mo250P(true));
        }
        return EZ1.m2352l(abstractC8315Tg1M5738t, abstractC8315Tg1Mo3963L);
    }

    @Override // p000.InterfaceC1649aC
    /* renamed from: r */
    public final boolean mo7466r() {
        X01 x01 = this.f26126b;
        return (x01.mo3797E().mo1962a() instanceof InterfaceC10292me1) && O90.m5963a(x01.mo3797E(), this.f26127c.mo3797E());
    }

    @Override // p000.AbstractC3933dW
    public final String toString() {
        return "(" + this.f26126b + ".." + this.f26127c + ')';
    }
}
