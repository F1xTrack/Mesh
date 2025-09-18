package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Sh0 */
/* loaded from: classes2.dex */
public final class C1445Sh0 extends AbstractC1523Th0 {
    public static final /* synthetic */ int p = 0;
    public final C3957gP0 n;
    public final C8411zh0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445Sh0(C6045nH c6045nH, C3957gP0 c3957gP0, C8411zh0 c8411zh0) {
        super(c6045nH, null);
        O90.f(c3957gP0, "jClass");
        this.n = c3957gP0;
        this.o = c8411zh0;
    }

    public static CE0 v(CE0 ce0) {
        if (ce0.l() != 2) {
            return ce0;
        }
        Collection collectionJ = ce0.j();
        O90.e(collectionJ, "getOverriddenDescriptors(...)");
        Collection<CE0> collection = collectionJ;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collection));
        for (CE0 ce02 : collection) {
            O90.c(ce02);
            arrayList.add(v(ce02));
        }
        return (CE0) AbstractC8069xu.R(AbstractC8069xu.b0(AbstractC8069xu.f0(arrayList)));
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        return null;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set h(C4317iI c4317iI, C3808fd0 c3808fd0) {
        O90.f(c4317iI, "kindFilter");
        return SN.a;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set i(C4317iI c4317iI, C3808fd0 c3808fd0) {
        O90.f(c4317iI, "kindFilter");
        Set setF0 = AbstractC8069xu.f0(((JD) this.e.invoke()).a());
        C8411zh0 c8411zh0 = this.o;
        C1445Sh0 c1445Sh0B = AbstractC3498e02.b(c8411zh0);
        Set setB = c1445Sh0B != null ? c1445Sh0B.b() : null;
        if (setB == null) {
            setB = SN.a;
        }
        setF0.addAll(setB);
        if (this.n.a.isEnum()) {
            setF0.addAll(AbstractC8259yu.f(AbstractC6581q41.c, AbstractC6581q41.a));
        }
        C6045nH c6045nH = this.b;
        setF0.addAll(((C2032Zv) ((H71) ((C4375ib0) c6045nH.b).x)).g(c6045nH, c8411zh0));
        return setF0;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final void j(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c1559Tt0, "name");
        C6045nH c6045nH = this.b;
        ((C2032Zv) ((H71) ((C4375ib0) c6045nH.b).x)).d(c6045nH, this.o, c1559Tt0, arrayList);
    }

    @Override // defpackage.AbstractC1289Qh0
    public final JD k() {
        return new C7301ts(this.n, C3808fd0.l);
    }

    @Override // defpackage.AbstractC1289Qh0
    public final void m(LinkedHashSet linkedHashSet, C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        C8411zh0 c8411zh0 = this.o;
        C1445Sh0 c1445Sh0B = AbstractC3498e02.b(c8411zh0);
        Collection collectionG0 = c1445Sh0B == null ? SN.a : AbstractC8069xu.g0(c1445Sh0B.a(c1559Tt0, EnumC8453zv0.e));
        C4375ib0 c4375ib0 = (C4375ib0) this.b.b;
        linkedHashSet.addAll(GZ1.j(c1559Tt0, collectionG0, linkedHashSet, this.o, (S20) c4375ib0.f, ((C7883wv0) c4375ib0.u).d));
        if (this.n.a.isEnum()) {
            if (c1559Tt0.equals(AbstractC6581q41.c)) {
                linkedHashSet.add(EZ1.f(c8411zh0));
            } else if (c1559Tt0.equals(AbstractC6581q41.a)) {
                linkedHashSet.add(EZ1.g(c8411zh0));
            }
        }
    }

    @Override // defpackage.AbstractC1523Th0, defpackage.AbstractC1289Qh0
    public final void n(C1559Tt0 c1559Tt0, ArrayList arrayList) {
        O90.f(c1559Tt0, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1898Yc0 c1898Yc0 = new C1898Yc0(c1559Tt0, 1);
        C8411zh0 c8411zh0 = this.o;
        WY1.a(AbstractC8259yu.e(c8411zh0), C5806m12.d, new C1367Rh0(c8411zh0, linkedHashSet, c1898Yc0));
        boolean zIsEmpty = arrayList.isEmpty();
        C6045nH c6045nH = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                CE0 ce0V = v((CE0) obj);
                Object arrayList2 = linkedHashMap.get(ce0V);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(ce0V, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
                AbstractC0314Du.m(arrayList3, GZ1.j(c1559Tt0, collection, arrayList, this.o, (S20) c4375ib0.f, ((C7883wv0) c4375ib0.u).d));
            }
            arrayList.addAll(arrayList3);
        } else {
            C4375ib0 c4375ib02 = (C4375ib0) c6045nH.b;
            arrayList.addAll(GZ1.j(c1559Tt0, linkedHashSet, arrayList, this.o, (S20) c4375ib02.f, ((C7883wv0) c4375ib02.u).d));
        }
        if (this.n.a.isEnum() && c1559Tt0.equals(AbstractC6581q41.b)) {
            AbstractC3970gT1.a(arrayList, EZ1.e(c8411zh0));
        }
    }

    @Override // defpackage.AbstractC1289Qh0
    public final Set o(C4317iI c4317iI) {
        O90.f(c4317iI, "kindFilter");
        Set setF0 = AbstractC8069xu.f0(((JD) this.e.invoke()).f());
        C3808fd0 c3808fd0 = C3808fd0.m;
        C8411zh0 c8411zh0 = this.o;
        WY1.a(AbstractC8259yu.e(c8411zh0), C5806m12.d, new C1367Rh0(c8411zh0, setF0, c3808fd0));
        if (this.n.a.isEnum()) {
            setF0.add(AbstractC6581q41.b);
        }
        return setF0;
    }

    @Override // defpackage.AbstractC1289Qh0
    public final CD q() {
        return this.o;
    }
}
