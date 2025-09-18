package defpackage;

/* loaded from: classes2.dex */
public final class UI extends U01 implements InterfaceC8335zI {
    public final C4309iF0 E;
    public final InterfaceC1637Ut0 F;
    public final C5826m71 G;
    public final C0124Bi1 H;
    public final C6494pd0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UI(CD cd, U01 u01, I5 i5, C1559Tt0 c1559Tt0, int i, C4309iF0 c4309iF0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, C0124Bi1 c0124Bi1, C6494pd0 c6494pd0, W21 w21) {
        super(cd, u01, i5, c1559Tt0, i, w21 == null ? W21.O0 : w21);
        O90.f(cd, "containingDeclaration");
        O90.f(i5, "annotations");
        NX.m(i, "kind");
        O90.f(c4309iF0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        O90.f(c0124Bi1, "versionRequirementTable");
        this.E = c4309iF0;
        this.F = interfaceC1637Ut0;
        this.G = c5826m71;
        this.H = c0124Bi1;
        this.I = c6494pd0;
    }

    @Override // defpackage.U01, defpackage.CZ
    public final CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        C1559Tt0 c1559Tt02;
        O90.f(cd, "newOwner");
        NX.m(i, "kind");
        O90.f(i5, "annotations");
        U01 u01 = (U01) az;
        if (c1559Tt0 == null) {
            C1559Tt0 name = getName();
            O90.e(name, "getName(...)");
            c1559Tt02 = name;
        } else {
            c1559Tt02 = c1559Tt0;
        }
        UI ui = new UI(cd, u01, i5, c1559Tt02, i, this.E, this.F, this.G, this.H, this.I, w21);
        ui.w = this.w;
        return ui;
    }

    @Override // defpackage.MI
    public final K0 C() {
        return this.E;
    }

    @Override // defpackage.MI
    public final C5826m71 X() {
        return this.G;
    }

    @Override // defpackage.MI
    public final InterfaceC1637Ut0 g0() {
        return this.F;
    }

    @Override // defpackage.MI
    public final JI k0() {
        return this.I;
    }
}
