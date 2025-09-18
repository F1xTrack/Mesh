package p000;

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
public final class C8264Sh0 extends AbstractC8316Th0 {

    /* renamed from: p */
    public static final /* synthetic */ int f10909p = 0;

    /* renamed from: n */
    public final C9493gP0 f10910n;

    /* renamed from: o */
    public final C11957zh0 f10911o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8264Sh0(C6479nH c6479nH, C9493gP0 c9493gP0, C11957zh0 c11957zh0) {
        super(c6479nH, null);
        O90.m5968f(c9493gP0, "jClass");
        this.f10910n = c9493gP0;
        this.f10911o = c11957zh0;
    }

    /* renamed from: v */
    public static CE0 m7418v(CE0 ce0) {
        if (ce0.mo116l() != 2) {
            return ce0;
        }
        Collection collectionMo1222j = ce0.mo1222j();
        O90.m5967e(collectionMo1222j, "getOverriddenDescriptors(...)");
        Collection<CE0> collection = collectionMo1222j;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collection));
        for (CE0 ce02 : collection) {
            O90.m5965c(ce02);
            arrayList.add(m7418v(ce02));
        }
        return (CE0) AbstractC7167xu.m25972R(AbstractC7167xu.m25982b0(AbstractC7167xu.m25986f0(arrayList)));
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        return null;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: h */
    public final Set mo1772h(C4233iI c4233iI, C9393fd0 c9393fd0) {
        O90.m5968f(c4233iI, "kindFilter");
        return C1156SN.f10705a;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: i */
    public final Set mo1773i(C4233iI c4233iI, C9393fd0 c9393fd0) {
        O90.m5968f(c4233iI, "kindFilter");
        Set setM25986f0 = AbstractC7167xu.m25986f0(((InterfaceC0581JD) this.f9742e.invoke()).mo3781a());
        C11957zh0 c11957zh0 = this.f10911o;
        C8264Sh0 c8264Sh0M17813b = AbstractC9185e02.m17813b(c11957zh0);
        Set setMo6677b = c8264Sh0M17813b != null ? c8264Sh0M17813b.mo6677b() : null;
        if (setMo6677b == null) {
            setMo6677b = C1156SN.f10705a;
        }
        setM25986f0.addAll(setMo6677b);
        if (this.f10910n.f27782a.isEnum()) {
            setM25986f0.addAll(AbstractC7230yu.m26275f(AbstractC10732q41.f40579c, AbstractC10732q41.f40577a));
        }
        C6479nH c6479nH = this.f9739b;
        setM25986f0.addAll(((C1631Zv) ((H71) ((C9773ib0) c6479nH.f38228b).f29361x)).m9643g(c6479nH, c11957zh0));
        return setM25986f0;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: j */
    public final void mo1774j(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        O90.m5968f(c8340Tt0, "name");
        C6479nH c6479nH = this.f9739b;
        ((C1631Zv) ((H71) ((C9773ib0) c6479nH.f38228b).f29361x)).m9640d(c6479nH, this.f10911o, c8340Tt0, arrayList);
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: k */
    public final InterfaceC0581JD mo1775k() {
        return new C6913ts(this.f10910n, C9393fd0.f27286l);
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: m */
    public final void mo1776m(LinkedHashSet linkedHashSet, C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        C11957zh0 c11957zh0 = this.f10911o;
        C8264Sh0 c8264Sh0M17813b = AbstractC9185e02.m17813b(c11957zh0);
        Collection collectionM25987g0 = c8264Sh0M17813b == null ? C1156SN.f10705a : AbstractC7167xu.m25987g0(c8264Sh0M17813b.mo1769a(c8340Tt0, EnumC11985zv0.f47098e));
        C9773ib0 c9773ib0 = (C9773ib0) this.f9739b.f38228b;
        linkedHashSet.addAll(GZ1.m3088j(c8340Tt0, collectionM25987g0, linkedHashSet, this.f10911o, (S20) c9773ib0.f29343f, ((C11604wv0) c9773ib0.f29358u).f45165d));
        if (this.f10910n.f27782a.isEnum()) {
            if (c8340Tt0.equals(AbstractC10732q41.f40579c)) {
                linkedHashSet.add(EZ1.m2346f(c11957zh0));
            } else if (c8340Tt0.equals(AbstractC10732q41.f40577a)) {
                linkedHashSet.add(EZ1.m2347g(c11957zh0));
            }
        }
    }

    @Override // p000.AbstractC8316Th0, p000.AbstractC8160Qh0
    /* renamed from: n */
    public final void mo1777n(C8340Tt0 c8340Tt0, ArrayList arrayList) {
        O90.m5968f(c8340Tt0, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C8566Yc0 c8566Yc0 = new C8566Yc0(c8340Tt0, 1);
        C11957zh0 c11957zh0 = this.f10911o;
        WY1.m8805a(AbstractC7230yu.m26274e(c11957zh0), C10212m12.f37414d, new C8212Rh0(c11957zh0, linkedHashSet, c8566Yc0));
        boolean zIsEmpty = arrayList.isEmpty();
        C6479nH c6479nH = this.f9739b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                CE0 ce0M7418v = m7418v((CE0) obj);
                Object arrayList2 = linkedHashMap.get(ce0M7418v);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(ce0M7418v, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
                AbstractC0246Du.m1920m(arrayList3, GZ1.m3088j(c8340Tt0, collection, arrayList, this.f10911o, (S20) c9773ib0.f29343f, ((C11604wv0) c9773ib0.f29358u).f45165d));
            }
            arrayList.addAll(arrayList3);
        } else {
            C9773ib0 c9773ib02 = (C9773ib0) c6479nH.f38228b;
            arrayList.addAll(GZ1.m3088j(c8340Tt0, linkedHashSet, arrayList, this.f10911o, (S20) c9773ib02.f29343f, ((C11604wv0) c9773ib02.f29358u).f45165d));
        }
        if (this.f10910n.f27782a.isEnum() && c8340Tt0.equals(AbstractC10732q41.f40578b)) {
            AbstractC9502gT1.m18571a(arrayList, EZ1.m2345e(c11957zh0));
        }
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: o */
    public final Set mo1778o(C4233iI c4233iI) {
        O90.m5968f(c4233iI, "kindFilter");
        Set setM25986f0 = AbstractC7167xu.m25986f0(((InterfaceC0581JD) this.f9742e.invoke()).mo3786f());
        C9393fd0 c9393fd0 = C9393fd0.f27287m;
        C11957zh0 c11957zh0 = this.f10911o;
        WY1.m8805a(AbstractC7230yu.m26274e(c11957zh0), C10212m12.f37414d, new C8212Rh0(c11957zh0, setM25986f0, c9393fd0));
        if (this.f10910n.f27782a.isEnum()) {
            setM25986f0.add(AbstractC10732q41.f40578b);
        }
        return setM25986f0;
    }

    @Override // p000.AbstractC8160Qh0
    /* renamed from: q */
    public final InterfaceC0140CD mo1780q() {
        return this.f10911o;
    }
}
