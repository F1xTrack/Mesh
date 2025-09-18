package p000;

/* renamed from: AI */
/* loaded from: classes2.dex */
public final class C0019AI extends C6707qs implements InterfaceC7255zI {

    /* renamed from: F */
    public final VE0 f157F;

    /* renamed from: G */
    public final InterfaceC8392Ut0 f158G;

    /* renamed from: H */
    public final C10226m71 f159H;

    /* renamed from: I */
    public final C7383Bi1 f160I;

    /* renamed from: J */
    public final C10673pd0 f161J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0019AI(InterfaceC6976us interfaceC6976us, InterfaceC6522ny interfaceC6522ny, InterfaceC0510I5 interfaceC0510I5, boolean z, int i, VE0 ve0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, C7383Bi1 c7383Bi1, C10673pd0 c10673pd0, W21 w21) {
        super(interfaceC6976us, interfaceC6522ny, interfaceC0510I5, z, i, w21 == null ? W21.f12940O0 : w21);
        O90.m5968f(interfaceC6976us, "containingDeclaration");
        O90.m5968f(interfaceC0510I5, "annotations");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(ve0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        O90.m5968f(c7383Bi1, "versionRequirementTable");
        this.f157F = ve0;
        this.f158G = interfaceC8392Ut0;
        this.f159H = c10226m71;
        this.f160I = c7383Bi1;
        this.f161J = c10673pd0;
    }

    @Override // p000.C6707qs, p000.AbstractC0162CZ
    /* renamed from: A1 */
    public final /* bridge */ /* synthetic */ AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        return m151P1(interfaceC0140CD, interfaceC0036AZ, i, interfaceC0510I5, w21);
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: C */
    public final AbstractC0631K0 mo149C() {
        return this.f157F;
    }

    @Override // p000.C6707qs
    /* renamed from: J1 */
    public final /* bridge */ /* synthetic */ C6707qs mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        return m151P1(interfaceC0140CD, interfaceC0036AZ, i, interfaceC0510I5, w21);
    }

    /* renamed from: P1 */
    public final C0019AI m151P1(InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, int i, InterfaceC0510I5 interfaceC0510I5, W21 w21) {
        O90.m5968f(interfaceC0140CD, "newOwner");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(interfaceC0510I5, "annotations");
        C0019AI c0019ai = new C0019AI((InterfaceC6976us) interfaceC0140CD, (InterfaceC6522ny) interfaceC0036AZ, interfaceC0510I5, this.f41218E, i, this.f157F, this.f158G, this.f159H, this.f160I, this.f161J, w21);
        c0019ai.f1447w = this.f1447w;
        return c0019ai;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC0036AZ
    /* renamed from: S */
    public final boolean mo113S() {
        return false;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: X */
    public final C10226m71 mo152X() {
        return this.f159H;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: g0 */
    public final InterfaceC8392Ut0 mo153g0() {
        return this.f158G;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC0036AZ
    public final boolean isInline() {
        return false;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC0036AZ
    public final boolean isSuspend() {
        return false;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: k0 */
    public final InterfaceC0586JI mo154k0() {
        return this.f161J;
    }
}
