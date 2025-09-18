package p000;

/* loaded from: classes2.dex */
public final class PF0 extends AbstractC7598Fm0 {

    /* renamed from: e */
    public final TE0 f8945e;

    /* renamed from: f */
    public final PF0 f8946f;

    /* renamed from: g */
    public final C0055As f8947g;

    /* renamed from: h */
    public final SE0 f8948h;

    /* renamed from: i */
    public final boolean f8949i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PF0(TE0 te0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, W21 w21, PF0 pf0) {
        super(interfaceC8392Ut0, c10226m71, w21);
        O90.m5968f(te0, "classProto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        this.f8945e = te0;
        this.f8946f = pf0;
        this.f8947g = CB1.m1001a(interfaceC8392Ut0, te0.f11232e);
        SE0 se0 = (SE0) AbstractC1605ZV.f14930f.m9059c(te0.f11231d);
        this.f8948h = se0 == null ? SE0.CLASS : se0;
        this.f8949i = AbstractC1605ZV.f14931g.m8799c(te0.f11231d).booleanValue();
    }

    @Override // p000.AbstractC7598Fm0
    /* renamed from: e */
    public final C0664KX mo2775e() {
        return this.f8947g.m359b();
    }
}
