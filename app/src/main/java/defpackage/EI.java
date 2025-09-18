package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class EI extends RI {
    public final C1130Og0 g;
    public final C1688Vk0 h;
    public final C1688Vk0 i;
    public final /* synthetic */ HI j;

    public EI(HI hi, C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        this.j = hi;
        C1666Vd c1666Vd = hi.l;
        TE0 te0 = hi.e;
        List list = te0.q;
        O90.e(list, "getFunctionList(...)");
        List list2 = te0.r;
        O90.e(list2, "getPropertyList(...)");
        List list3 = te0.s;
        O90.e(list3, "getTypeAliasList(...)");
        List list4 = te0.k;
        O90.e(list4, "getNestedClassNameList(...)");
        List list5 = list4;
        InterfaceC1637Ut0 interfaceC1637Ut0 = (InterfaceC1637Ut0) hi.l.d;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list5));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(CB1.b(interfaceC1637Ut0, ((Number) it.next()).intValue()));
        }
        super(c1666Vd, list, list2, list3, new BI(arrayList, 0));
        this.g = c1130Og0;
        C7955xI c7955xI = (C7955xI) c1666Vd.c;
        Z41 z41 = c7955xI.a;
        CI ci = new CI(this, 0);
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        c1922Yk0.getClass();
        this.h = new C1688Vk0(c1922Yk0, ci);
        Z41 z412 = c7955xI.a;
        CI ci2 = new CI(this, 1);
        C1922Yk0 c1922Yk02 = (C1922Yk0) z412;
        c1922Yk02.getClass();
        this.i = new C1688Vk0(c1922Yk02, ci2);
    }

    @Override // defpackage.RI, defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        s(c1559Tt0, interfaceC0600Hl0);
        return super.a(c1559Tt0, interfaceC0600Hl0);
    }

    @Override // defpackage.RI, defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        InterfaceC7492us interfaceC7492us;
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        s(c1559Tt0, interfaceC0600Hl0);
        C6860rY0 c6860rY0 = this.j.p;
        return (c6860rY0 == null || (interfaceC7492us = (InterfaceC7492us) ((C1766Wk0) c6860rY0.c).invoke(c1559Tt0)) == null) ? super.c(c1559Tt0, interfaceC0600Hl0) : interfaceC7492us;
    }

    @Override // defpackage.RI, defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        s(c1559Tt0, enumC8453zv0);
        return super.e(c1559Tt0, enumC8453zv0);
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        return (Collection) this.h.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [MN] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // defpackage.RI
    public final void h(ArrayList arrayList, InterfaceC6099nZ interfaceC6099nZ) {
        ?? arrayList2;
        O90.f(interfaceC6099nZ, "nameFilter");
        C6860rY0 c6860rY0 = this.j.p;
        if (c6860rY0 != null) {
            Set<C1559Tt0> setKeySet = ((LinkedHashMap) c6860rY0.b).keySet();
            arrayList2 = new ArrayList();
            for (C1559Tt0 c1559Tt0 : setKeySet) {
                O90.f(c1559Tt0, "name");
                InterfaceC7492us interfaceC7492us = (InterfaceC7492us) ((C1766Wk0) c6860rY0.c).invoke(c1559Tt0);
                if (interfaceC7492us != null) {
                    arrayList2.add(interfaceC7492us);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = MN.a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // defpackage.RI
    public final void j(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c1559Tt0, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC0663Ig0) it.next()).d0().a(c1559Tt0, EnumC8453zv0.c));
        }
        C1666Vd c1666Vd = this.b;
        arrayList.addAll(((C7955xI) c1666Vd.c).n.f(c1559Tt0, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C7883wv0) ((C7955xI) c1666Vd.c).q).d.h(c1559Tt0, arrayList2, arrayList3, this.j, new DI(arrayList, 0));
    }

    @Override // defpackage.RI
    public final void k(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c1559Tt0, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC0663Ig0) it.next()).d0().e(c1559Tt0, EnumC8453zv0.c));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C7883wv0) ((C7955xI) this.b.c).q).d.h(c1559Tt0, arrayList2, arrayList3, this.j, new DI(arrayList, 0));
    }

    @Override // defpackage.RI
    public final C0074As l(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        return this.j.h.d(c1559Tt0);
    }

    @Override // defpackage.RI
    public final Set n() {
        List listB = this.j.n.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            Set setD = ((AbstractC0663Ig0) it.next()).d0().d();
            if (setD == null) {
                return null;
            }
            AbstractC0314Du.m(linkedHashSet, setD);
        }
        return linkedHashSet;
    }

    @Override // defpackage.RI
    public final Set o() {
        HI hi = this.j;
        List listB = hi.n.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(linkedHashSet, ((AbstractC0663Ig0) it.next()).d0().b());
        }
        linkedHashSet.addAll(((C7955xI) this.b.c).n.i(hi));
        return linkedHashSet;
    }

    @Override // defpackage.RI
    public final Set p() {
        List listB = this.j.n.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            AbstractC0314Du.m(linkedHashSet, ((AbstractC0663Ig0) it.next()).d0().f());
        }
        return linkedHashSet;
    }

    @Override // defpackage.RI
    public final boolean r(UI ui) {
        return ((C7955xI) this.b.c).o.b(this.j, ui);
    }

    public final void s(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        O90.f(((C7955xI) this.b.c).i, "<this>");
        O90.f(this.j, "scopeOwner");
    }
}
