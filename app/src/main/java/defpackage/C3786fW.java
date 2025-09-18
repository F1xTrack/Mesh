package defpackage;

/* renamed from: fW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3786fW extends AbstractC3405dW implements InterfaceC2088aC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3786fW(X01 x01, X01 x012) {
        super(x01, x012);
        O90.f(x01, "lowerBound");
        O90.f(x012, "upperBound");
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC0663Ig0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = this.b;
        O90.f(x01, "type");
        X01 x012 = this.c;
        O90.f(x012, "type");
        return new C3786fW(x01, x012);
    }

    @Override // defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 P(boolean z) {
        return NV1.t(this.b.P(z), this.c.P(z));
    }

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: R */
    public final AbstractC1521Tg1 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = this.b;
        O90.f(x01, "type");
        X01 x012 = this.c;
        O90.f(x012, "type");
        return new C3786fW(x01, x012);
    }

    @Override // defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return NV1.t(this.b.T(c0733Jd1), this.c.T(c0733Jd1));
    }

    @Override // defpackage.AbstractC3405dW
    public final X01 U() {
        return this.b;
    }

    @Override // defpackage.AbstractC3405dW
    public final String a0(C5857mI c5857mI, C5857mI c5857mI2) {
        O90.f(c5857mI, "renderer");
        boolean zN = c5857mI2.a.n();
        X01 x01 = this.c;
        X01 x012 = this.b;
        if (!zN) {
            return c5857mI.E(c5857mI.X(x012), c5857mI.X(x01), CZ1.f(this));
        }
        return "(" + c5857mI.X(x012) + ".." + c5857mI.X(x01) + ')';
    }

    @Override // defpackage.InterfaceC2088aC
    public final AbstractC1521Tg1 n(AbstractC0663Ig0 abstractC0663Ig0) {
        AbstractC1521Tg1 abstractC1521Tg1T;
        O90.f(abstractC0663Ig0, "replacement");
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (abstractC1521Tg1L instanceof AbstractC3405dW) {
            abstractC1521Tg1T = abstractC1521Tg1L;
        } else {
            if (!(abstractC1521Tg1L instanceof X01)) {
                throw new C7074sg();
            }
            X01 x01 = (X01) abstractC1521Tg1L;
            abstractC1521Tg1T = NV1.t(x01, x01.P(true));
        }
        return EZ1.l(abstractC1521Tg1T, abstractC1521Tg1L);
    }

    @Override // defpackage.InterfaceC2088aC
    public final boolean r() {
        X01 x01 = this.b;
        return (x01.E().a() instanceof InterfaceC5925me1) && O90.a(x01.E(), this.c.E());
    }

    @Override // defpackage.AbstractC3405dW
    public final String toString() {
        return "(" + this.b + ".." + this.c + ')';
    }
}
