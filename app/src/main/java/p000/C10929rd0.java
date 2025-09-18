package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: rd0 */
/* loaded from: classes2.dex */
public final class C10929rd0 implements InterfaceC10059kq0 {

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC10293mf0[] f41776f;

    /* renamed from: b */
    public final C6479nH f41777b;

    /* renamed from: c */
    public final C7588Fh0 f41778c;

    /* renamed from: d */
    public final C7900Lh0 f41779d;

    /* renamed from: e */
    public final C8426Vk0 f41780e;

    static {
        IP0 ip0 = BP0.f799a;
        f41776f = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C10929rd0.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public C10929rd0(C6479nH c6479nH, C10773qP0 c10773qP0, C7588Fh0 c7588Fh0) {
        O90.m5968f(c7588Fh0, "packageFragment");
        this.f41777b = c6479nH;
        this.f41778c = c7588Fh0;
        this.f41779d = new C7900Lh0(c6479nH, c10773qP0, c7588Fh0);
        C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) c6479nH.f38228b).f29338a;
        C10801qd0 c10801qd0 = new C10801qd0(0, this);
        c8582Yk0.getClass();
        this.f41780e = new C8426Vk0(c8582Yk0, c10801qd0);
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        m24435i(c8340Tt0, interfaceC7700Hl0);
        InterfaceC10059kq0[] interfaceC10059kq0ArrM24434h = m24434h();
        Collection collectionMo1769a = this.f41779d.mo1769a(c8340Tt0, interfaceC7700Hl0);
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0ArrM24434h) {
            collectionMo1769a = AbstractC10906rR1.m24337b(collectionMo1769a, interfaceC10059kq0.mo1769a(c8340Tt0, interfaceC7700Hl0));
        }
        return collectionMo1769a == null ? C1156SN.f10705a : collectionMo1769a;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        InterfaceC10059kq0[] interfaceC10059kq0ArrM24434h = m24434h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0ArrM24434h) {
            AbstractC0246Du.m1920m(linkedHashSet, interfaceC10059kq0.mo6677b());
        }
        linkedHashSet.addAll(this.f41779d.mo6677b());
        return linkedHashSet;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        m24435i(c8340Tt0, interfaceC7700Hl0);
        C7900Lh0 c7900Lh0 = this.f41779d;
        c7900Lh0.getClass();
        InterfaceC0873Ns interfaceC0873Ns = null;
        InterfaceC6976us interfaceC6976usM5061v = c7900Lh0.m5061v(c8340Tt0, null);
        if (interfaceC6976usM5061v != null) {
            return interfaceC6976usM5061v;
        }
        for (InterfaceC10059kq0 interfaceC10059kq0 : m24434h()) {
            InterfaceC0873Ns interfaceC0873NsMo1770c = interfaceC10059kq0.mo1770c(c8340Tt0, interfaceC7700Hl0);
            if (interfaceC0873NsMo1770c != null) {
                if (!(interfaceC0873NsMo1770c instanceof InterfaceC0936Os) || !((InterfaceC0936Os) interfaceC0873NsMo1770c).mo111M()) {
                    return interfaceC0873NsMo1770c;
                }
                if (interfaceC0873Ns == null) {
                    interfaceC0873Ns = interfaceC0873NsMo1770c;
                }
            }
        }
        return interfaceC0873Ns;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        InterfaceC10059kq0[] interfaceC10059kq0ArrM24434h = m24434h();
        O90.m5968f(interfaceC10059kq0ArrM24434h, "<this>");
        HashSet hashSetM26060a = AbstractC11765yA1.m26060a(interfaceC10059kq0ArrM24434h.length == 0 ? C0779MN.f7117a : new C0702L8(0, interfaceC10059kq0ArrM24434h));
        if (hashSetM26060a == null) {
            return null;
        }
        hashSetM26060a.addAll(this.f41779d.mo4153d());
        return hashSetM26060a;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        m24435i(c8340Tt0, enumC11985zv0);
        InterfaceC10059kq0[] interfaceC10059kq0ArrM24434h = m24434h();
        this.f41779d.getClass();
        Collection collectionM24337b = C0779MN.f7117a;
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0ArrM24434h) {
            collectionM24337b = AbstractC10906rR1.m24337b(collectionM24337b, interfaceC10059kq0.mo1771e(c8340Tt0, enumC11985zv0));
        }
        return collectionM24337b == null ? C1156SN.f10705a : collectionM24337b;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        InterfaceC10059kq0[] interfaceC10059kq0ArrM24434h = m24434h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0ArrM24434h) {
            AbstractC0246Du.m1920m(linkedHashSet, interfaceC10059kq0.mo6678f());
        }
        linkedHashSet.addAll(this.f41779d.mo6678f());
        return linkedHashSet;
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        InterfaceC10059kq0[] interfaceC10059kq0ArrM24434h = m24434h();
        Collection collectionMo2108g = this.f41779d.mo2108g(c4233iI, interfaceC6497nZ);
        for (InterfaceC10059kq0 interfaceC10059kq0 : interfaceC10059kq0ArrM24434h) {
            collectionMo2108g = AbstractC10906rR1.m24337b(collectionMo2108g, interfaceC10059kq0.mo2108g(c4233iI, interfaceC6497nZ));
        }
        return collectionMo2108g == null ? C1156SN.f10705a : collectionMo2108g;
    }

    /* renamed from: h */
    public final InterfaceC10059kq0[] m24434h() {
        return (InterfaceC10059kq0[]) WS1.m8763b(this.f41780e, f41776f[0]);
    }

    /* renamed from: i */
    public final void m24435i(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        C9773ib0 c9773ib0 = (C9773ib0) this.f41777b.f38228b;
        AbstractC11233u02.m25070b((C4049fN) c9773ib0.f29351n, interfaceC7700Hl0, this.f41778c, c8340Tt0);
    }

    public final String toString() {
        return "scope for " + this.f41778c;
    }
}
