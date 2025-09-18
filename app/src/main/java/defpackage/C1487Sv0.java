package defpackage;

/* renamed from: Sv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1487Sv0 extends IH implements InterfaceC2088aC {
    public final X01 b;

    public C1487Sv0(X01 x01) {
        O90.f(x01, "delegate");
        this.b = x01;
    }

    @Override // defpackage.IH, defpackage.AbstractC0663Ig0
    public final boolean G() {
        return false;
    }

    @Override // defpackage.X01, defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return new C1487Sv0(this.b.T(c0733Jd1));
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        return z ? this.b.P(true) : this;
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return new C1487Sv0(this.b.T(c0733Jd1));
    }

    @Override // defpackage.IH
    public final X01 b0() {
        return this.b;
    }

    @Override // defpackage.IH
    public final IH h0(X01 x01) {
        return new C1487Sv0(x01);
    }

    @Override // defpackage.InterfaceC2088aC
    public final AbstractC1521Tg1 n(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "replacement");
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (!AbstractC0112Be1.f(abstractC1521Tg1L) && !AbstractC0112Be1.e(abstractC1521Tg1L)) {
            return abstractC1521Tg1L;
        }
        if (abstractC1521Tg1L instanceof X01) {
            X01 x01 = (X01) abstractC1521Tg1L;
            X01 x01P = x01.P(false);
            return !AbstractC0112Be1.f(x01) ? x01P : new C1487Sv0(x01P);
        }
        if (!(abstractC1521Tg1L instanceof AbstractC3405dW)) {
            throw new IllegalStateException(("Incorrect type: " + abstractC1521Tg1L).toString());
        }
        AbstractC3405dW abstractC3405dW = (AbstractC3405dW) abstractC1521Tg1L;
        X01 x012 = abstractC3405dW.b;
        X01 x01P2 = x012.P(false);
        if (AbstractC0112Be1.f(x012)) {
            x01P2 = new C1487Sv0(x01P2);
        }
        X01 x013 = abstractC3405dW.c;
        X01 x01P3 = x013.P(false);
        if (AbstractC0112Be1.f(x013)) {
            x01P3 = new C1487Sv0(x01P3);
        }
        return EZ1.n(NV1.t(x01P2, x01P3), EZ1.k(abstractC1521Tg1L));
    }

    @Override // defpackage.InterfaceC2088aC
    public final boolean r() {
        return true;
    }
}
