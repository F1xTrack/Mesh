package defpackage;

/* loaded from: classes2.dex */
public final class TI extends EE0 implements InterfaceC8335zI {
    public final C6613qF0 B;
    public final InterfaceC1637Ut0 C;
    public final C5826m71 D;
    public final C0124Bi1 E;
    public final C6494pd0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TI(CD cd, CE0 ce0, I5 i5, EnumC6348os0 enumC6348os0, C7575vI c7575vI, boolean z, C1559Tt0 c1559Tt0, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C6613qF0 c6613qF0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, C0124Bi1 c0124Bi1, C6494pd0 c6494pd0) {
        super(cd, ce0, i5, enumC6348os0, c7575vI, z, c1559Tt0, i, W21.O0, z2, z3, z6, z4, z5);
        O90.f(cd, "containingDeclaration");
        O90.f(i5, "annotations");
        O90.f(enumC6348os0, "modality");
        O90.f(c7575vI, "visibility");
        O90.f(c1559Tt0, "name");
        NX.m(i, "kind");
        O90.f(c6613qF0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        O90.f(c0124Bi1, "versionRequirementTable");
        this.B = c6613qF0;
        this.C = interfaceC1637Ut0;
        this.D = c5826m71;
        this.E = c0124Bi1;
        this.F = c6494pd0;
    }

    @Override // defpackage.EE0
    public final EE0 A1(CD cd, EnumC6348os0 enumC6348os0, C7575vI c7575vI, CE0 ce0, int i, C1559Tt0 c1559Tt0) {
        O90.f(cd, "newOwner");
        O90.f(enumC6348os0, "newModality");
        O90.f(c7575vI, "newVisibility");
        NX.m(i, "kind");
        O90.f(c1559Tt0, "newName");
        return new TI(cd, ce0, getAnnotations(), enumC6348os0, c7575vI, this.g, c1559Tt0, i, this.o, this.p, isExternal(), this.s, this.q, this.B, this.C, this.D, this.E, this.F);
    }

    @Override // defpackage.MI
    public final K0 C() {
        return this.B;
    }

    @Override // defpackage.MI
    public final C5826m71 X() {
        return this.D;
    }

    @Override // defpackage.MI
    public final InterfaceC1637Ut0 g0() {
        return this.C;
    }

    @Override // defpackage.EE0, defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return ZV.E.c(this.B.d).booleanValue();
    }

    @Override // defpackage.MI
    public final JI k0() {
        return this.F;
    }
}
