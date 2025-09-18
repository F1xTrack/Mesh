package defpackage;

/* renamed from: Ze0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1982Ze0 extends AbstractC6500pf0 implements InterfaceC1826Xe0 {
    public final C2367bf0 j;

    public C1982Ze0(C2367bf0 c2367bf0) {
        O90.f(c2367bf0, "property");
        this.j = c2367bf0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return ((C1982Ze0) this.j.n.getValue()).call(new Object[0]);
    }

    @Override // defpackage.InterfaceC1670Ve0
    public final InterfaceC5927mf0 k() {
        return this.j;
    }

    @Override // defpackage.AbstractC6118nf0
    public final AbstractC7263tf0 u() {
        return this.j;
    }
}
