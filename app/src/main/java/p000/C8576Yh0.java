package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: Yh0 */
/* loaded from: classes2.dex */
public final class C8576Yh0 implements InterfaceC10059kq0 {

    /* renamed from: b */
    public final /* synthetic */ int f14455b = 0;

    /* renamed from: c */
    public final Object f14456c;

    public C8576Yh0(InterfaceC10059kq0 interfaceC10059kq0) {
        this.f14456c = interfaceC10059kq0;
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: a */
    public Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        switch (this.f14455b) {
            case 1:
                O90.m5968f(c8340Tt0, "name");
                return UJ1.m7985b(m9338j(c8340Tt0, interfaceC7700Hl0), XS0.f13764D);
            default:
                return m9338j(c8340Tt0, interfaceC7700Hl0);
        }
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        return m9340l().mo6677b();
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        return m9340l().mo1770c(c8340Tt0, interfaceC7700Hl0);
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        return m9340l().mo4153d();
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: e */
    public Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        switch (this.f14455b) {
            case 1:
                O90.m5968f(c8340Tt0, "name");
                return UJ1.m7985b(m9339k(c8340Tt0, enumC11985zv0), XS0.f13765E);
            default:
                return m9339k(c8340Tt0, enumC11985zv0);
        }
    }

    @Override // p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        return m9340l().mo6678f();
    }

    @Override // p000.InterfaceC9243eS0
    /* renamed from: g */
    public Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        switch (this.f14455b) {
            case 1:
                O90.m5968f(c4233iI, "kindFilter");
                O90.m5968f(interfaceC6497nZ, "nameFilter");
                Collection collectionM9337i = m9337i(c4233iI, interfaceC6497nZ);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionM9337i) {
                    if (((InterfaceC0140CD) obj) instanceof InterfaceC7032vl) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return AbstractC7167xu.m25968N(UJ1.m7985b(arrayList, XS0.f13763C), arrayList2);
            default:
                return m9337i(c4233iI, interfaceC6497nZ);
        }
    }

    /* renamed from: h */
    public final InterfaceC10059kq0 m9336h() {
        if (!(m9340l() instanceof C8576Yh0)) {
            return m9340l();
        }
        InterfaceC10059kq0 interfaceC10059kq0M9340l = m9340l();
        O90.m5966d(interfaceC10059kq0M9340l, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C8576Yh0) interfaceC10059kq0M9340l).m9336h();
    }

    /* renamed from: i */
    public final Collection m9337i(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return m9340l().mo2108g(c4233iI, interfaceC6497nZ);
    }

    /* renamed from: j */
    public final Collection m9338j(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        return m9340l().mo1769a(c8340Tt0, interfaceC7700Hl0);
    }

    /* renamed from: k */
    public final Collection m9339k(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        return m9340l().mo1771e(c8340Tt0, enumC11985zv0);
    }

    /* renamed from: l */
    public final InterfaceC10059kq0 m9340l() {
        switch (this.f14455b) {
            case 0:
                return (InterfaceC10059kq0) ((C8426Vk0) this.f14456c).invoke();
            default:
                return (InterfaceC10059kq0) this.f14456c;
        }
    }

    public C8576Yh0(Z41 z41, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(z41, "storageManager");
        this.f14456c = new C8426Vk0((C8582Yk0) z41, new C10801qd0(8, interfaceC6434mZ));
    }
}
