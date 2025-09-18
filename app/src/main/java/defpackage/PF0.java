package defpackage;

/* loaded from: classes2.dex */
public final class PF0 extends AbstractC0447Fm0 {
    public final TE0 e;
    public final PF0 f;
    public final C0074As g;
    public final SE0 h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PF0(TE0 te0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, W21 w21, PF0 pf0) {
        super(interfaceC1637Ut0, c5826m71, w21);
        O90.f(te0, "classProto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        this.e = te0;
        this.f = pf0;
        this.g = CB1.a(interfaceC1637Ut0, te0.e);
        SE0 se0 = (SE0) ZV.f.c(te0.d);
        this.h = se0 == null ? SE0.CLASS : se0;
        this.i = ZV.g.c(te0.d).booleanValue();
    }

    @Override // defpackage.AbstractC0447Fm0
    public final KX e() {
        return this.g.b();
    }
}
