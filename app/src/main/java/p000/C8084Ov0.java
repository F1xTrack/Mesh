package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ov0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8084Ov0 extends AbstractC7039vs {

    /* renamed from: g */
    public final boolean f8679g;

    /* renamed from: h */
    public final ArrayList f8680h;

    /* renamed from: i */
    public final C0496Hs f8681i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8084Ov0(Z41 z41, InterfaceC0307Es interfaceC0307Es, C8340Tt0 c8340Tt0, boolean z, int i) {
        super(z41, interfaceC0307Es, c8340Tt0, W21.f12940O0);
        O90.m5968f(z41, "storageManager");
        O90.m5968f(interfaceC0307Es, "container");
        this.f8679g = z;
        C9461g90 c9461g90M22423h = AbstractC10132lO1.m22423h(0, i);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c9461g90M22423h));
        Iterator it = c9461g90M22423h.iterator();
        while (((C9333f90) it).f27092c) {
            int iM18193a = ((C9333f90) it).m18193a();
            arrayList.add(C10420ne1.m23157B1(this, EnumC9532gi1.f27947c, C8340Tt0.m7798e("T" + iM18193a), iM18193a, z41));
        }
        this.f8680h = arrayList;
        this.f8681i = new C0496Hs(this, AbstractC11306uZ1.m25209b(this), AbstractC11433vZ0.m25454e(AbstractC6940uI.m25157j(this).mo897h().m26498e()), z41);
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: A */
    public final boolean mo1427A() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J */
    public final Collection mo1428J() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J0 */
    public final AbstractC8057Oh1 mo1429J0() {
        return null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: K */
    public final boolean mo1430K() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return false;
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: N */
    public final boolean mo1431N() {
        return this.f8679g;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: V */
    public final C6707qs mo1432V() {
        return null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ InterfaceC10059kq0 mo1433W() {
        return C9931jq0.f35419b;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: X0 */
    public final boolean mo1434X0() {
        return false;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        return EnumC10575os0.f39323b;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: g */
    public final Collection mo1435g() {
        return C1156SN.f10705a;
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return S20.f10539b;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = AbstractC7066wI.f44764e;
        O90.m5967e(c7003vI, "PUBLIC");
        return c7003vI;
    }

    @Override // p000.AbstractC7039vs, p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    public final boolean isInline() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: l */
    public final EnumC0118Bs mo1436l() {
        return EnumC0118Bs.f1060a;
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: n */
    public final InterfaceC10059kq0 mo1437n(C8054Og0 c8054Og0) {
        return C9931jq0.f35419b;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        return this.f8680h;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        return this.f8681i;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: w */
    public final boolean mo1440w() {
        return false;
    }
}
