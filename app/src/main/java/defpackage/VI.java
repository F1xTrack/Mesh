package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class VI extends FD implements MI, InterfaceC0499Gd1 {
    public final Z41 f;
    public final C7575vI g;
    public List h;
    public final C4072h1 i;
    public final CF0 j;
    public final InterfaceC1637Ut0 k;
    public final C5826m71 l;
    public final C0124Bi1 m;
    public final C6494pd0 n;
    public X01 o;
    public X01 p;
    public List q;
    public X01 r;

    static {
        IP0 ip0 = BP0.a;
        ip0.f(new GE0(ip0.b(VI.class), "constructors", "getConstructors()Ljava/util/Collection;"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VI(Z41 z41, CD cd, I5 i5, C1559Tt0 c1559Tt0, C7575vI c7575vI, CF0 cf0, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, C0124Bi1 c0124Bi1, C6494pd0 c6494pd0) {
        O90.f(z41, "storageManager");
        O90.f(cd, "containingDeclaration");
        O90.f(c7575vI, "visibility");
        O90.f(cf0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        O90.f(c0124Bi1, "versionRequirementTable");
        C0162Bv0 c0162Bv0 = W21.O0;
        O90.f(z41, "storageManager");
        O90.f(cd, "containingDeclaration");
        O90.f(c7575vI, "visibilityImpl");
        super(cd, i5, c1559Tt0, c0162Bv0);
        this.f = z41;
        this.g = c7575vI;
        ((C1922Yk0) z41).a(new C3881g1(0, this));
        this.i = new C4072h1(this);
        this.j = cf0;
        this.k = interfaceC1637Ut0;
        this.l = c5826m71;
        this.m = c0124Bi1;
        this.n = c6494pd0;
    }

    public final X01 A1() {
        X01 x01 = this.o;
        if (x01 != null) {
            return x01;
        }
        O90.o("underlyingType");
        throw null;
    }

    public final void B1(List list, X01 x01, X01 x012) {
        InterfaceC5578kq0 interfaceC5578kq0O0;
        X01 x01C;
        O90.f(x01, "underlyingType");
        O90.f(x012, "expandedType");
        this.h = list;
        this.o = x01;
        this.p = x012;
        this.q = AbstractC7437uZ1.b(this);
        InterfaceC7492us interfaceC7492usY1 = y1();
        if (interfaceC7492usY1 == null || (interfaceC5578kq0O0 = interfaceC7492usY1.O0()) == null) {
            interfaceC5578kq0O0 = C5387jq0.b;
        }
        InterfaceC5578kq0 interfaceC5578kq0 = interfaceC5578kq0O0;
        C1404Rt1 c1404Rt1 = new C1404Rt1(this);
        C4147hP c4147hP = AbstractC0112Be1.a;
        if (C5496kP.f(this)) {
            x01C = C5496kP.c(EnumC5305jP.k, toString());
        } else {
            InterfaceC1200Pd1 interfaceC1200Pd1V = v();
            if (interfaceC1200Pd1V == null) {
                AbstractC0112Be1.a(12);
                throw null;
            }
            List listD = AbstractC0112Be1.d(((C4072h1) interfaceC1200Pd1V).getParameters());
            C0733Jd1.b.getClass();
            x01C = NV1.C(C0733Jd1.c, interfaceC1200Pd1V, listD, false, interfaceC5578kq0, c1404Rt1);
        }
        this.r = x01C;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return false;
    }

    @Override // defpackage.InterfaceC1165Os
    public final boolean N() {
        return AbstractC0112Be1.c(A1(), new C8277z(4, this), null);
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.MI
    public final C5826m71 X() {
        throw null;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.k(this, obj);
    }

    @Override // defpackage.FD, defpackage.DD, defpackage.CD
    /* renamed from: a */
    public final InterfaceC1087Ns x1() {
        return this;
    }

    @Override // defpackage.R51
    public final ED b(C7833we1 c7833we1) {
        O90.f(c7833we1, "substitutor");
        if (c7833we1.a.e()) {
            return this;
        }
        CD cdI = i();
        O90.e(cdI, "getContainingDeclaration(...)");
        I5 annotations = getAnnotations();
        O90.e(annotations, "<get-annotations>(...)");
        C1559Tt0 name = getName();
        O90.e(name, "getName(...)");
        VI vi = new VI(this.f, cdI, annotations, name, this.g, this.j, this.k, this.l, this.m, this.n);
        List listO = o();
        X01 x01A1 = A1();
        EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
        vi.B1(listO, AbstractC8198yZ1.a(c7833we1.g(x01A1, enumC4015gi1)), AbstractC8198yZ1.a(c7833we1.g(z1(), enumC4015gi1)));
        return vi;
    }

    @Override // defpackage.MI
    public final InterfaceC1637Ut0 g0() {
        throw null;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        return this.g;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.MI
    public final JI k0() {
        return this.n;
    }

    @Override // defpackage.InterfaceC1087Ns
    public final X01 m() {
        X01 x01 = this.r;
        if (x01 != null) {
            return x01;
        }
        O90.o("defaultTypeImpl");
        throw null;
    }

    @Override // defpackage.InterfaceC1165Os
    public final List o() {
        List list = this.h;
        if (list != null) {
            return list;
        }
        O90.o("declaredTypeParametersImpl");
        throw null;
    }

    @Override // defpackage.DD, defpackage.U0
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        return this.i;
    }

    public final InterfaceC7492us y1() {
        if (S8.b(z1())) {
            return null;
        }
        InterfaceC1087Ns interfaceC1087NsA = z1().E().a();
        if (interfaceC1087NsA instanceof InterfaceC7492us) {
            return (InterfaceC7492us) interfaceC1087NsA;
        }
        return null;
    }

    public final X01 z1() {
        X01 x01 = this.p;
        if (x01 != null) {
            return x01;
        }
        O90.o("expandedType");
        throw null;
    }

    @Override // defpackage.FD, defpackage.DD, defpackage.CD
    /* renamed from: a */
    public final CD x1() {
        return this;
    }

    @Override // defpackage.FD
    public final ED x1() {
        return this;
    }
}
