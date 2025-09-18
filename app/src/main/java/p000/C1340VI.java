package p000;

import java.util.List;

/* renamed from: VI */
/* loaded from: classes2.dex */
public final class C1340VI extends AbstractC0329FD implements InterfaceC0774MI, InterfaceC7633Gd1 {

    /* renamed from: f */
    public final Z41 f12494f;

    /* renamed from: g */
    public final C7003vI f12495g;

    /* renamed from: h */
    public List f12496h;

    /* renamed from: i */
    public final C4153h1 f12497i;

    /* renamed from: j */
    public final CF0 f12498j;

    /* renamed from: k */
    public final InterfaceC8392Ut0 f12499k;

    /* renamed from: l */
    public final C10226m71 f12500l;

    /* renamed from: m */
    public final C7383Bi1 f12501m;

    /* renamed from: n */
    public final C10673pd0 f12502n;

    /* renamed from: o */
    public X01 f12503o;

    /* renamed from: p */
    public X01 f12504p;

    /* renamed from: q */
    public List f12505q;

    /* renamed from: r */
    public X01 f12506r;

    static {
        IP0 ip0 = BP0.f799a;
        ip0.mo3850f(new GE0(ip0.mo3846b(C1340VI.class), "constructors", "getConstructors()Ljava/util/Collection;"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1340VI(Z41 z41, InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, C7003vI c7003vI, CF0 cf0, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, C7383Bi1 c7383Bi1, C10673pd0 c10673pd0) {
        O90.m5968f(z41, "storageManager");
        O90.m5968f(interfaceC0140CD, "containingDeclaration");
        O90.m5968f(c7003vI, "visibility");
        O90.m5968f(cf0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        O90.m5968f(c7383Bi1, "versionRequirementTable");
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        O90.m5968f(z41, "storageManager");
        O90.m5968f(interfaceC0140CD, "containingDeclaration");
        O90.m5968f(c7003vI, "visibilityImpl");
        super(interfaceC0140CD, interfaceC0510I5, c8340Tt0, c7408Bv0);
        this.f12494f = z41;
        this.f12495g = c7003vI;
        ((C8582Yk0) z41).m9349a(new C4090g1(0, this));
        this.f12497i = new C4153h1(this);
        this.f12498j = cf0;
        this.f12499k = interfaceC8392Ut0;
        this.f12500l = c10226m71;
        this.f12501m = c7383Bi1;
        this.f12502n = c10673pd0;
    }

    /* renamed from: A1 */
    public final X01 m8390A1() {
        X01 x01 = this.f12503o;
        if (x01 != null) {
            return x01;
        }
        O90.m5977o("underlyingType");
        throw null;
    }

    /* renamed from: B1 */
    public final void m8391B1(List list, X01 x01, X01 x012) {
        InterfaceC10059kq0 interfaceC10059kq0Mo1487O0;
        X01 x01M5728C;
        O90.m5968f(x01, "underlyingType");
        O90.m5968f(x012, "expandedType");
        this.f12496h = list;
        this.f12503o = x01;
        this.f12504p = x012;
        this.f12505q = AbstractC11306uZ1.m25209b(this);
        InterfaceC6976us interfaceC6976usM8392y1 = m8392y1();
        if (interfaceC6976usM8392y1 == null || (interfaceC10059kq0Mo1487O0 = interfaceC6976usM8392y1.mo1487O0()) == null) {
            interfaceC10059kq0Mo1487O0 = C9931jq0.f35419b;
        }
        InterfaceC10059kq0 interfaceC10059kq0 = interfaceC10059kq0Mo1487O0;
        C8237Rt1 c8237Rt1 = new C8237Rt1(this);
        C4177hP c4177hP = AbstractC7375Be1.f963a;
        if (C6298kP.m22200f(this)) {
            x01M5728C = C6298kP.m22197c(EnumC6235jP.f35126k, toString());
        } else {
            InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = mo1439v();
            if (interfaceC8101Pd1Mo1439v == null) {
                AbstractC7375Be1.m783a(12);
                throw null;
            }
            List listM786d = AbstractC7375Be1.m786d(((C4153h1) interfaceC8101Pd1Mo1439v).getParameters());
            C7789Jd1.f5652b.getClass();
            x01M5728C = NV1.m5728C(C7789Jd1.f5653c, interfaceC8101Pd1Mo1439v, listM786d, false, interfaceC10059kq0, c8237Rt1);
        }
        this.f12506r = x01M5728C;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return false;
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: N */
    public final boolean mo1431N() {
        return AbstractC7375Be1.m785c(m8390A1(), new C7236z(4, this), null);
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: X */
    public final C10226m71 mo152X() {
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2848k(this, obj);
    }

    @Override // p000.AbstractC0329FD, p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0873Ns mo2089x1() {
        return this;
    }

    @Override // p000.R51
    /* renamed from: b */
    public final InterfaceC0266ED mo114b(C11571we1 c11571we1) {
        O90.m5968f(c11571we1, "substitutor");
        if (c11571we1.f45011a.mo7050e()) {
            return this;
        }
        InterfaceC0140CD interfaceC0140CDMo423i = mo423i();
        O90.m5967e(interfaceC0140CDMo423i, "getContainingDeclaration(...)");
        InterfaceC0510I5 annotations = getAnnotations();
        O90.m5967e(annotations, "<get-annotations>(...)");
        C8340Tt0 name = getName();
        O90.m5967e(name, "getName(...)");
        C1340VI c1340vi = new C1340VI(this.f12494f, interfaceC0140CDMo423i, annotations, name, this.f12495g, this.f12498j, this.f12499k, this.f12500l, this.f12501m, this.f12502n);
        List listMo1438o = mo1438o();
        X01 x01M8390A1 = m8390A1();
        EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
        c1340vi.m8391B1(listMo1438o, AbstractC11815yZ1.m26170a(c11571we1.m25666g(x01M8390A1, enumC9532gi1)), AbstractC11815yZ1.m26170a(c11571we1.m25666g(m8393z1(), enumC9532gi1)));
        return c1340vi;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: g0 */
    public final InterfaceC8392Ut0 mo153g0() {
        throw null;
    }

    @Override // p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        return this.f12495g;
    }

    @Override // p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // p000.InterfaceC0774MI
    /* renamed from: k0 */
    public final InterfaceC0586JI mo154k0() {
        return this.f12502n;
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: m */
    public final X01 mo1492m() {
        X01 x01 = this.f12506r;
        if (x01 != null) {
            return x01;
        }
        O90.m5977o("defaultTypeImpl");
        throw null;
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        List list = this.f12496h;
        if (list != null) {
            return list;
        }
        O90.m5977o("declaredTypeParametersImpl");
        throw null;
    }

    @Override // p000.AbstractC0203DD, p000.AbstractC1259U0
    public final String toString() {
        return "typealias " + getName().m7801b();
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        return this.f12497i;
    }

    /* renamed from: y1 */
    public final InterfaceC6976us m8392y1() {
        if (AbstractC1141S8.m7182b(m8393z1())) {
            return null;
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a = m8393z1().mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a instanceof InterfaceC6976us) {
            return (InterfaceC6976us) interfaceC0873NsMo1962a;
        }
        return null;
    }

    /* renamed from: z1 */
    public final X01 m8393z1() {
        X01 x01 = this.f12504p;
        if (x01 != null) {
            return x01;
        }
        O90.m5977o("expandedType");
        throw null;
    }

    @Override // p000.AbstractC0329FD, p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0140CD mo2089x1() {
        return this;
    }

    @Override // p000.AbstractC0329FD
    /* renamed from: x1 */
    public final InterfaceC0266ED mo2089x1() {
        return this;
    }
}
