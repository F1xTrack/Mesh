package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ov0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1175Ov0 extends AbstractC7683vs {
    public final boolean g;
    public final ArrayList h;
    public final C0620Hs i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1175Ov0(Z41 z41, InterfaceC0386Es interfaceC0386Es, C1559Tt0 c1559Tt0, boolean z, int i) {
        super(z41, interfaceC0386Es, c1559Tt0, W21.O0);
        O90.f(z41, "storageManager");
        O90.f(interfaceC0386Es, "container");
        this.g = z;
        C3909g90 c3909g90H = AbstractC5686lO1.h(0, i);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(c3909g90H));
        Iterator it = c3909g90H.iterator();
        while (((C3718f90) it).c) {
            int iA = ((C3718f90) it).a();
            arrayList.add(C6116ne1.B1(this, EnumC4015gi1.c, C1559Tt0.e("T" + iA), iA, z41));
        }
        this.h = arrayList;
        this.i = new C0620Hs(this, AbstractC7437uZ1.b(this), AbstractC7627vZ0.e(AbstractC7384uI.j(this).h().e()), z41);
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean A() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection J() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC7492us
    public final AbstractC1134Oh1 J0() {
        return null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean K() {
        return false;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return false;
    }

    @Override // defpackage.InterfaceC1165Os
    public final boolean N() {
        return this.g;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final C6729qs V() {
        return null;
    }

    @Override // defpackage.InterfaceC7492us
    public final /* bridge */ /* synthetic */ InterfaceC5578kq0 W() {
        return C5387jq0.b;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean X0() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        return EnumC6348os0.b;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection g() {
        return SN.a;
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return S20.b;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = AbstractC7765wI.e;
        O90.e(c7575vI, "PUBLIC");
        return c7575vI;
    }

    @Override // defpackage.AbstractC7683vs, defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        return EnumC0152Bs.a;
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        return C5387jq0.b;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        return this.h;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        return this.i;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean w() {
        return false;
    }
}
