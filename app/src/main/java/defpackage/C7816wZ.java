package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: wZ */
/* loaded from: classes2.dex */
public final class C7816wZ extends D {
    public static final C0074As l = new C0074As(AbstractC6581q41.l, C1559Tt0.e("Function"));
    public static final C0074As m = new C0074As(AbstractC6581q41.i, C1559Tt0.e("KFunction"));
    public final C1922Yk0 e;
    public final C1840Xj f;
    public final KZ g;
    public final int h;
    public final C7626vZ i;
    public final C8196yZ j;
    public final List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7816wZ(C1922Yk0 c1922Yk0, C1840Xj c1840Xj, KZ kz, int i) {
        super(c1922Yk0, kz.a(i));
        O90.f(c1840Xj, "containingDeclaration");
        this.e = c1922Yk0;
        this.f = c1840Xj;
        this.g = kz;
        this.h = i;
        this.i = new C7626vZ(this);
        this.j = new C8196yZ(c1922Yk0, this);
        ArrayList arrayList = new ArrayList();
        C3909g90 c3909g90 = new C3909g90(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(c3909g90));
        Iterator it = c3909g90.iterator();
        while (((C3718f90) it).c) {
            int iA = ((C3718f90) it).a();
            arrayList.add(C6116ne1.B1(this, EnumC4015gi1.d, C1559Tt0.e("P" + iA), arrayList.size(), this.e));
            arrayList2.add(C1518Tf1.a);
        }
        arrayList.add(C6116ne1.B1(this, EnumC4015gi1.e, C1559Tt0.e("R"), arrayList.size(), this.e));
        this.k = AbstractC8069xu.b0(arrayList);
        OL0 ol0 = EnumC8006xZ.a;
        KZ kz2 = this.g;
        ol0.getClass();
        O90.f(kz2, "functionTypeKind");
        if (kz2.equals(GZ.c) || kz2.equals(JZ.c) || kz2.equals(HZ.c)) {
            return;
        }
        kz2.equals(IZ.c);
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean A() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final /* bridge */ /* synthetic */ Collection J() {
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
        return false;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final /* bridge */ /* synthetic */ C6729qs V() {
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

    @Override // defpackage.ED
    public final W21 e() {
        return W21.O0;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        return EnumC6348os0.e;
    }

    @Override // defpackage.InterfaceC7492us
    public final /* bridge */ /* synthetic */ Collection g() {
        return MN.a;
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

    @Override // defpackage.CD
    public final CD i() {
        return this.f;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        return EnumC0152Bs.b;
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        return this.j;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        return this.k;
    }

    public final String toString() {
        String strB = getName().b();
        O90.e(strB, "asString(...)");
        return strB;
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
