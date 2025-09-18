package defpackage;

/* loaded from: classes2.dex */
public final class YJ extends AbstractC7452ue1 {
    public final AbstractC7452ue1 b;
    public final AbstractC7452ue1 c;

    public YJ(AbstractC7452ue1 abstractC7452ue1, AbstractC7452ue1 abstractC7452ue12) {
        this.b = abstractC7452ue1;
        this.c = abstractC7452ue12;
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // defpackage.AbstractC7452ue1
    public final I5 c(I5 i5) {
        O90.f(i5, "annotations");
        return this.c.c(this.b.c(i5));
    }

    @Override // defpackage.AbstractC7452ue1
    public final AbstractC6689qe1 d(AbstractC0663Ig0 abstractC0663Ig0) {
        AbstractC6689qe1 abstractC6689qe1D = this.b.d(abstractC0663Ig0);
        return abstractC6689qe1D == null ? this.c.d(abstractC0663Ig0) : abstractC6689qe1D;
    }

    @Override // defpackage.AbstractC7452ue1
    public final AbstractC0663Ig0 f(AbstractC0663Ig0 abstractC0663Ig0, EnumC4015gi1 enumC4015gi1) {
        O90.f(abstractC0663Ig0, "topLevelType");
        O90.f(enumC4015gi1, "position");
        return this.c.f(this.b.f(abstractC0663Ig0, enumC4015gi1), enumC4015gi1);
    }
}
