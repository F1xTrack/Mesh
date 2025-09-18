package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class YO extends U01 {
    @Override // defpackage.U01, defpackage.CZ
    public final CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        O90.f(cd, "newOwner");
        NX.m(i, "kind");
        O90.f(i5, "annotations");
        return this;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC8042xl
    public final void H0(Collection collection) {
        O90.f(collection, "overriddenDescriptors");
    }

    @Override // defpackage.U01, defpackage.CZ, defpackage.AZ
    public final InterfaceC8386zZ N0() {
        return new QQ0(this);
    }

    @Override // defpackage.CZ, defpackage.AZ
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC8042xl
    public final /* bridge */ /* synthetic */ InterfaceC8042xl m0(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        m0(interfaceC7492us, enumC6348os0, c7575vI);
        return this;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC7662vl
    public final Object s(KI ki) {
        return null;
    }

    @Override // defpackage.CZ
    /* renamed from: z1 */
    public final U01 m0(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        O90.f(interfaceC7492us, "newOwner");
        O90.f(c7575vI, "visibility");
        NX.m(2, "kind");
        return this;
    }
}
