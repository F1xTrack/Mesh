package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ts */
/* loaded from: classes2.dex */
public final class C6913ts implements InterfaceC0581JD {

    /* renamed from: a */
    public final C9493gP0 f43382a;

    /* renamed from: b */
    public final AbstractC8418Vg0 f43383b;

    /* renamed from: c */
    public final C7236z f43384c;

    /* renamed from: d */
    public final LinkedHashMap f43385d;

    /* renamed from: e */
    public final LinkedHashMap f43386e;

    /* renamed from: f */
    public final LinkedHashMap f43387f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r6v6, types: [Vg0, nZ] */
    public C6913ts(C9493gP0 c9493gP0, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c9493gP0, "jClass");
        this.f43382a = c9493gP0;
        this.f43383b = (AbstractC8418Vg0) interfaceC6497nZ;
        C7236z c7236z = new C7236z(8, this);
        this.f43384c = c7236z;
        C7141xU c7141xU = new C7141xU(AbstractC7167xu.m25992t(c9493gP0.m18514d()), true, c7236z);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7078wU c7078wU = new C7078wU(c7141xU);
        while (c7078wU.hasNext()) {
            Object next = c7078wU.next();
            C8340Tt0 c8340Tt0M23388c = ((C10645pP0) next).m23388c();
            Object arrayList = linkedHashMap.get(c8340Tt0M23388c);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c8340Tt0M23388c, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f43385d = linkedHashMap;
        C7141xU c7141xU2 = new C7141xU(AbstractC7167xu.m25992t(this.f43382a.m18512b()), true, this.f43383b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C7078wU c7078wU2 = new C7078wU(c7141xU2);
        while (c7078wU2.hasNext()) {
            Object next2 = c7078wU2.next();
            linkedHashMap2.put(((C10261mP0) next2).m23388c(), next2);
        }
        this.f43386e = linkedHashMap2;
        ArrayList arrayListM18516f = this.f43382a.m18516f();
        ?? r6 = this.f43383b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListM18516f.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) r6.invoke(next3)).booleanValue()) {
                arrayList2.add(next3);
            }
        }
        int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(arrayList2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM24983b < 16 ? 16 : iM24983b);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((C11029sP0) next4).m23388c(), next4);
        }
        this.f43387f = linkedHashMap3;
    }

    @Override // p000.InterfaceC0581JD
    /* renamed from: a */
    public final Set mo3781a() {
        C7141xU c7141xU = new C7141xU(AbstractC7167xu.m25992t(this.f43382a.m18514d()), true, this.f43384c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7078wU c7078wU = new C7078wU(c7141xU);
        while (c7078wU.hasNext()) {
            linkedHashSet.add(((C10645pP0) c7078wU.next()).m23388c());
        }
        return linkedHashSet;
    }

    @Override // p000.InterfaceC0581JD
    /* renamed from: b */
    public final C11029sP0 mo3782b(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        return (C11029sP0) this.f43387f.get(c8340Tt0);
    }

    @Override // p000.InterfaceC0581JD
    /* renamed from: c */
    public final Collection mo3783c(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        List list = (List) this.f43385d.get(c8340Tt0);
        return list != null ? list : C0779MN.f7117a;
    }

    @Override // p000.InterfaceC0581JD
    /* renamed from: d */
    public final C10261mP0 mo3784d(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        return (C10261mP0) this.f43386e.get(c8340Tt0);
    }

    @Override // p000.InterfaceC0581JD
    /* renamed from: e */
    public final Set mo3785e() {
        return this.f43387f.keySet();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Vg0, nZ] */
    @Override // p000.InterfaceC0581JD
    /* renamed from: f */
    public final Set mo3786f() {
        C7141xU c7141xU = new C7141xU(AbstractC7167xu.m25992t(this.f43382a.m18512b()), true, this.f43383b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7078wU c7078wU = new C7078wU(c7141xU);
        while (c7078wU.hasNext()) {
            linkedHashSet.add(((C10261mP0) c7078wU.next()).m23388c());
        }
        return linkedHashSet;
    }
}
