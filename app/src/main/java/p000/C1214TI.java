package p000;

/* renamed from: TI */
/* loaded from: classes2.dex */
public final class C1214TI extends EE0 implements InterfaceC7255zI {

    /* renamed from: B */
    public final C10753qF0 f11290B;

    /* renamed from: C */
    public final InterfaceC8392Ut0 f11291C;

    /* renamed from: D */
    public final C10226m71 f11292D;

    /* renamed from: E */
    public final C7383Bi1 f11293E;

    /* renamed from: F */
    public final C10673pd0 f11294F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1214TI(InterfaceC0140CD interfaceC0140CD, CE0 ce0, InterfaceC0510I5 interfaceC0510I5, EnumC10575os0 enumC10575os0, C7003vI c7003vI, boolean z, C8340Tt0 c8340Tt0, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C10753qF0 c10753qF0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, C7383Bi1 c7383Bi1, C10673pd0 c10673pd0) {
        super(interfaceC0140CD, ce0, interfaceC0510I5, enumC10575os0, c7003vI, z, c8340Tt0, i, W21.f12940O0, z2, z3, z6, z4, z5);
        O90.m5968f(interfaceC0140CD, "containingDeclaration");
        O90.m5968f(interfaceC0510I5, "annotations");
        O90.m5968f(enumC10575os0, "modality");
        O90.m5968f(c7003vI, "visibility");
        O90.m5968f(c8340Tt0, "name");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(c10753qF0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        O90.m5968f(c7383Bi1, "versionRequirementTable");
        this.f11290B = c10753qF0;
        this.f11291C = interfaceC8392Ut0;
        this.f11292D = c10226m71;
        this.f11293E = c7383Bi1;
        this.f11294F = c10673pd0;
    }

    @Override // p000.EE0
    /* renamed from: A1 */
    public final EE0 mo2081A1(InterfaceC0140CD interfaceC0140CD, EnumC10575os0 enumC10575os0, C7003vI c7003vI, CE0 ce0, int i, C8340Tt0 c8340Tt0) {
        O90.m5968f(interfaceC0140CD, "newOwner");
        O90.m5968f(enumC10575os0, "newModality");
        O90.m5968f(c7003vI, "newVisibility");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(c8340Tt0, "newName");
        return new C1214TI(interfaceC0140CD, ce0, getAnnotations(), enumC10575os0, c7003vI, this.f2545g, c8340Tt0, i, this.f2553o, this.f2554p, isExternal(), this.f2557s, this.f2555q, this.f11290B, this.f11291C, this.f11292D, this.f11293E, this.f11294F);
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: C */
    public final AbstractC0631K0 mo149C() {
        return this.f11290B;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: X */
    public final C10226m71 mo152X() {
        return this.f11292D;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: g0 */
    public final InterfaceC8392Ut0 mo153g0() {
        return this.f11291C;
    }

    @Override // p000.EE0, p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return AbstractC1605ZV.f14915E.m8799c(this.f11290B.f40688d).booleanValue();
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: k0 */
    public final InterfaceC0586JI mo154k0() {
        return this.f11294F;
    }
}
