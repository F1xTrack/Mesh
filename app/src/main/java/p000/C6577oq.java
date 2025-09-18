package p000;

/* renamed from: oq */
/* loaded from: classes2.dex */
public final class C6577oq extends AbstractC11316ue1 {

    /* renamed from: b */
    public final AbstractC11316ue1 f39294b;

    /* renamed from: c */
    public final /* synthetic */ boolean f39295c;

    public C6577oq(AbstractC11316ue1 abstractC11316ue1, boolean z) {
        this.f39295c = z;
        this.f39294b = abstractC11316ue1;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: a */
    public final boolean mo7049a() {
        return this.f39294b.mo7049a();
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: b */
    public final boolean mo9252b() {
        return this.f39295c;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: c */
    public final InterfaceC0510I5 mo9253c(InterfaceC0510I5 interfaceC0510I5) {
        O90.m5968f(interfaceC0510I5, "annotations");
        return this.f39294b.mo9253c(interfaceC0510I5);
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: d */
    public final AbstractC10804qe1 mo7400d(AbstractC7742Ig0 abstractC7742Ig0) {
        AbstractC10804qe1 abstractC10804qe1Mo7400d = this.f39294b.mo7400d(abstractC7742Ig0);
        if (abstractC10804qe1Mo7400d == null) {
            return null;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        return AbstractC10268mS1.m22828a(abstractC10804qe1Mo7400d, interfaceC0873NsMo1962a instanceof InterfaceC10292me1 ? (InterfaceC10292me1) interfaceC0873NsMo1962a : null);
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: e */
    public final boolean mo7050e() {
        return this.f39294b.mo7050e();
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: f */
    public final AbstractC7742Ig0 mo9254f(AbstractC7742Ig0 abstractC7742Ig0, EnumC9532gi1 enumC9532gi1) {
        O90.m5968f(abstractC7742Ig0, "topLevelType");
        O90.m5968f(enumC9532gi1, "position");
        return this.f39294b.mo9254f(abstractC7742Ig0, enumC9532gi1);
    }
}
