package p000;

/* renamed from: YJ */
/* loaded from: classes2.dex */
public final class C1530YJ extends AbstractC11316ue1 {

    /* renamed from: b */
    public final AbstractC11316ue1 f14239b;

    /* renamed from: c */
    public final AbstractC11316ue1 f14240c;

    public C1530YJ(AbstractC11316ue1 abstractC11316ue1, AbstractC11316ue1 abstractC11316ue12) {
        this.f14239b = abstractC11316ue1;
        this.f14240c = abstractC11316ue12;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: a */
    public final boolean mo7049a() {
        return this.f14239b.mo7049a() || this.f14240c.mo7049a();
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: b */
    public final boolean mo9252b() {
        return this.f14239b.mo9252b() || this.f14240c.mo9252b();
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: c */
    public final InterfaceC0510I5 mo9253c(InterfaceC0510I5 interfaceC0510I5) {
        O90.m5968f(interfaceC0510I5, "annotations");
        return this.f14240c.mo9253c(this.f14239b.mo9253c(interfaceC0510I5));
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: d */
    public final AbstractC10804qe1 mo7400d(AbstractC7742Ig0 abstractC7742Ig0) {
        AbstractC10804qe1 abstractC10804qe1Mo7400d = this.f14239b.mo7400d(abstractC7742Ig0);
        return abstractC10804qe1Mo7400d == null ? this.f14240c.mo7400d(abstractC7742Ig0) : abstractC10804qe1Mo7400d;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: f */
    public final AbstractC7742Ig0 mo9254f(AbstractC7742Ig0 abstractC7742Ig0, EnumC9532gi1 enumC9532gi1) {
        O90.m5968f(abstractC7742Ig0, "topLevelType");
        O90.m5968f(enumC9532gi1, "position");
        return this.f14240c.mo9254f(this.f14239b.mo9254f(abstractC7742Ig0, enumC9532gi1), enumC9532gi1);
    }
}
