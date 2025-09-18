package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: EI */
/* loaded from: classes2.dex */
public final class C0271EI extends AbstractC1088RI {

    /* renamed from: g */
    public final C8054Og0 f2595g;

    /* renamed from: h */
    public final C8426Vk0 f2596h;

    /* renamed from: i */
    public final C8426Vk0 f2597i;

    /* renamed from: j */
    public final /* synthetic */ C0460HI f2598j;

    public C0271EI(C0460HI c0460hi, C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        this.f2598j = c0460hi;
        C1361Vd c1361Vd = c0460hi.f4211l;
        TE0 te0 = c0460hi.f4204e;
        List list = te0.f11244q;
        O90.m5967e(list, "getFunctionList(...)");
        List list2 = te0.f11245r;
        O90.m5967e(list2, "getPropertyList(...)");
        List list3 = te0.f11246s;
        O90.m5967e(list3, "getTypeAliasList(...)");
        List list4 = te0.f11238k;
        O90.m5967e(list4, "getNestedClassNameList(...)");
        List list5 = list4;
        InterfaceC8392Ut0 interfaceC8392Ut0 = (InterfaceC8392Ut0) c0460hi.f4211l.f12663d;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list5));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(CB1.m1002b(interfaceC8392Ut0, ((Number) it.next()).intValue()));
        }
        super(c1361Vd, list, list2, list3, new C0082BI(arrayList, 0));
        this.f2595g = c8054Og0;
        C7129xI c7129xI = (C7129xI) c1361Vd.f12662c;
        Z41 z41 = c7129xI.f45518a;
        C0145CI c0145ci = new C0145CI(this, 0);
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        c8582Yk0.getClass();
        this.f2596h = new C8426Vk0(c8582Yk0, c0145ci);
        Z41 z412 = c7129xI.f45518a;
        C0145CI c0145ci2 = new C0145CI(this, 1);
        C8582Yk0 c8582Yk02 = (C8582Yk0) z412;
        c8582Yk02.getClass();
        this.f2597i = new C8426Vk0(c8582Yk02, c0145ci2);
    }

    @Override // p000.AbstractC1088RI, p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        m2117s(c8340Tt0, interfaceC7700Hl0);
        return super.mo1769a(c8340Tt0, interfaceC7700Hl0);
    }

    @Override // p000.AbstractC1088RI, p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        InterfaceC6976us interfaceC6976us;
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        m2117s(c8340Tt0, interfaceC7700Hl0);
        C10919rY0 c10919rY0 = this.f2598j.f4215p;
        return (c10919rY0 == null || (interfaceC6976us = (InterfaceC6976us) ((C8478Wk0) c10919rY0.f41729c).invoke(c8340Tt0)) == null) ? super.mo1770c(c8340Tt0, interfaceC7700Hl0) : interfaceC6976us;
    }

    @Override // p000.AbstractC1088RI, p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        m2117s(c8340Tt0, enumC11985zv0);
        return super.mo1771e(c8340Tt0, enumC11985zv0);
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return (Collection) this.f2596h.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [MN] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // p000.AbstractC1088RI
    /* renamed from: h */
    public final void mo2109h(ArrayList arrayList, InterfaceC6497nZ interfaceC6497nZ) {
        ?? arrayList2;
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        C10919rY0 c10919rY0 = this.f2598j.f4215p;
        if (c10919rY0 != null) {
            Set<C8340Tt0> setKeySet = ((LinkedHashMap) c10919rY0.f41728b).keySet();
            arrayList2 = new ArrayList();
            for (C8340Tt0 c8340Tt0 : setKeySet) {
                O90.m5968f(c8340Tt0, "name");
                InterfaceC6976us interfaceC6976us = (InterfaceC6976us) ((C8478Wk0) c10919rY0.f41729c).invoke(c8340Tt0);
                if (interfaceC6976us != null) {
                    arrayList2.add(interfaceC6976us);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = C0779MN.f7117a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: j */
    public final void mo2110j(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        O90.m5968f(c8340Tt0, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f2597i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC7742Ig0) it.next()).mo3799d0().mo1769a(c8340Tt0, EnumC11985zv0.f47096c));
        }
        C1361Vd c1361Vd = this.f10113b;
        arrayList.addAll(((C7129xI) c1361Vd.f12662c).f45531n.mo7645f(c8340Tt0, this.f2598j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C11604wv0) ((C7129xI) c1361Vd.f12662c).f45534q).f45165d.m25061h(c8340Tt0, arrayList2, arrayList3, this.f2598j, new C0208DI(arrayList, 0));
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: k */
    public final void mo2111k(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        O90.m5968f(c8340Tt0, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f2597i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC7742Ig0) it.next()).mo3799d0().mo1771e(c8340Tt0, EnumC11985zv0.f47096c));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C11604wv0) ((C7129xI) this.f10113b.f12662c).f45534q).f45165d.m25061h(c8340Tt0, arrayList2, arrayList3, this.f2598j, new C0208DI(arrayList, 0));
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: l */
    public final C0055As mo2112l(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        return this.f2598j.f4207h.m361d(c8340Tt0);
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: n */
    public final Set mo2113n() {
        List listMo5276b = this.f2598j.f4213n.mo5276b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo5276b.iterator();
        while (it.hasNext()) {
            Set setMo4153d = ((AbstractC7742Ig0) it.next()).mo3799d0().mo4153d();
            if (setMo4153d == null) {
                return null;
            }
            AbstractC0246Du.m1920m(linkedHashSet, setMo4153d);
        }
        return linkedHashSet;
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: o */
    public final Set mo2114o() {
        C0460HI c0460hi = this.f2598j;
        List listMo5276b = c0460hi.f4213n.mo5276b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo5276b.iterator();
        while (it.hasNext()) {
            AbstractC0246Du.m1920m(linkedHashSet, ((AbstractC7742Ig0) it.next()).mo3799d0().mo6677b());
        }
        linkedHashSet.addAll(((C7129xI) this.f10113b.f12662c).f45531n.mo7646i(c0460hi));
        return linkedHashSet;
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: p */
    public final Set mo2115p() {
        List listMo5276b = this.f2598j.f4213n.mo5276b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listMo5276b.iterator();
        while (it.hasNext()) {
            AbstractC0246Du.m1920m(linkedHashSet, ((AbstractC7742Ig0) it.next()).mo3799d0().mo6678f());
        }
        return linkedHashSet;
    }

    @Override // p000.AbstractC1088RI
    /* renamed from: r */
    public final boolean mo2116r(C1277UI c1277ui) {
        return ((C7129xI) this.f10113b.f12662c).f45532o.mo6014b(this.f2598j, c1277ui);
    }

    /* renamed from: s */
    public final void m2117s(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        O90.m5968f(((C7129xI) this.f10113b.f12662c).f45526i, "<this>");
        O90.m5968f(this.f2598j, "scopeOwner");
    }
}
