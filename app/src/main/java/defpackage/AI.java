package defpackage;

/* loaded from: classes2.dex */
public final class AI extends C6729qs implements InterfaceC8335zI {
    public final VE0 F;
    public final InterfaceC1637Ut0 G;
    public final C5826m71 H;
    public final C0124Bi1 I;
    public final C6494pd0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AI(InterfaceC7492us interfaceC7492us, InterfaceC6174ny interfaceC6174ny, I5 i5, boolean z, int i, VE0 ve0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, C0124Bi1 c0124Bi1, C6494pd0 c6494pd0, W21 w21) {
        super(interfaceC7492us, interfaceC6174ny, i5, z, i, w21 == null ? W21.O0 : w21);
        O90.f(interfaceC7492us, "containingDeclaration");
        O90.f(i5, "annotations");
        NX.m(i, "kind");
        O90.f(ve0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        O90.f(c0124Bi1, "versionRequirementTable");
        this.F = ve0;
        this.G = interfaceC1637Ut0;
        this.H = c5826m71;
        this.I = c0124Bi1;
        this.J = c6494pd0;
    }

    @Override // defpackage.C6729qs, defpackage.CZ
    public final /* bridge */ /* synthetic */ CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        return P1(cd, az, i, i5, w21);
    }

    @Override // defpackage.MI
    public final K0 C() {
        return this.F;
    }

    @Override // defpackage.C6729qs
    /* renamed from: J1 */
    public final /* bridge */ /* synthetic */ C6729qs A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        return P1(cd, az, i, i5, w21);
    }

    public final AI P1(CD cd, AZ az, int i, I5 i5, W21 w21) {
        O90.f(cd, "newOwner");
        NX.m(i, "kind");
        O90.f(i5, "annotations");
        AI ai = new AI((InterfaceC7492us) cd, (InterfaceC6174ny) az, i5, this.E, i, this.F, this.G, this.H, this.I, this.J, w21);
        ai.w = this.w;
        return ai;
    }

    @Override // defpackage.CZ, defpackage.AZ
    public final boolean S() {
        return false;
    }

    @Override // defpackage.MI
    public final C5826m71 X() {
        return this.H;
    }

    @Override // defpackage.MI
    public final InterfaceC1637Ut0 g0() {
        return this.G;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.CZ, defpackage.AZ
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.CZ, defpackage.AZ
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.MI
    public final JI k0() {
        return this.J;
    }
}
