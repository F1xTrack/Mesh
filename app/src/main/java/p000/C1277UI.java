package p000;

/* renamed from: UI */
/* loaded from: classes2.dex */
public final class C1277UI extends U01 implements InterfaceC7255zI {

    /* renamed from: E */
    public final C9729iF0 f11719E;

    /* renamed from: F */
    public final InterfaceC8392Ut0 f11720F;

    /* renamed from: G */
    public final C10226m71 f11721G;

    /* renamed from: H */
    public final C7383Bi1 f11722H;

    /* renamed from: I */
    public final C10673pd0 f11723I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277UI(InterfaceC0140CD interfaceC0140CD, U01 u01, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, int i, C9729iF0 c9729iF0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, C7383Bi1 c7383Bi1, C10673pd0 c10673pd0, W21 w21) {
        super(interfaceC0140CD, u01, interfaceC0510I5, c8340Tt0, i, w21 == null ? W21.f12940O0 : w21);
        O90.m5968f(interfaceC0140CD, "containingDeclaration");
        O90.m5968f(interfaceC0510I5, "annotations");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(c9729iF0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        O90.m5968f(c7383Bi1, "versionRequirementTable");
        this.f11719E = c9729iF0;
        this.f11720F = interfaceC8392Ut0;
        this.f11721G = c10226m71;
        this.f11722H = c7383Bi1;
        this.f11723I = c10673pd0;
    }

    @Override // p000.U01, p000.AbstractC0162CZ
    /* renamed from: A1 */
    public final AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        C8340Tt0 c8340Tt02;
        O90.m5968f(interfaceC0140CD, "newOwner");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(interfaceC0510I5, "annotations");
        U01 u01 = (U01) interfaceC0036AZ;
        if (c8340Tt0 == null) {
            C8340Tt0 name = getName();
            O90.m5967e(name, "getName(...)");
            c8340Tt02 = name;
        } else {
            c8340Tt02 = c8340Tt0;
        }
        C1277UI c1277ui = new C1277UI(interfaceC0140CD, u01, interfaceC0510I5, c8340Tt02, i, this.f11719E, this.f11720F, this.f11721G, this.f11722H, this.f11723I, w21);
        c1277ui.f1447w = this.f1447w;
        return c1277ui;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: C */
    public final AbstractC0631K0 mo149C() {
        return this.f11719E;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: X */
    public final C10226m71 mo152X() {
        return this.f11721G;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: g0 */
    public final InterfaceC8392Ut0 mo153g0() {
        return this.f11720F;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: k0 */
    public final InterfaceC0586JI mo154k0() {
        return this.f11723I;
    }
}
