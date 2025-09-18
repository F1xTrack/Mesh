package defpackage;

/* renamed from: oq */
/* loaded from: classes2.dex */
public final class C6341oq extends AbstractC7452ue1 {
    public final AbstractC7452ue1 b;
    public final /* synthetic */ boolean c;

    public C6341oq(AbstractC7452ue1 abstractC7452ue1, boolean z) {
        this.c = z;
        this.b = abstractC7452ue1;
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean a() {
        return this.b.a();
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.AbstractC7452ue1
    public final I5 c(I5 i5) {
        O90.f(i5, "annotations");
        return this.b.c(i5);
    }

    @Override // defpackage.AbstractC7452ue1
    public final AbstractC6689qe1 d(AbstractC0663Ig0 abstractC0663Ig0) {
        AbstractC6689qe1 abstractC6689qe1D = this.b.d(abstractC0663Ig0);
        if (abstractC6689qe1D == null) {
            return null;
        }
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        return AbstractC5889mS1.a(abstractC6689qe1D, interfaceC1087NsA instanceof InterfaceC5925me1 ? (InterfaceC5925me1) interfaceC1087NsA : null);
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.AbstractC7452ue1
    public final AbstractC0663Ig0 f(AbstractC0663Ig0 abstractC0663Ig0, EnumC4015gi1 enumC4015gi1) {
        O90.f(abstractC0663Ig0, "topLevelType");
        O90.f(enumC4015gi1, "position");
        return this.b.f(abstractC0663Ig0, enumC4015gi1);
    }
}
