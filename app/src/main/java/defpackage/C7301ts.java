package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ts, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7301ts implements JD {
    public final C3957gP0 a;
    public final AbstractC1676Vg0 b;
    public final C8277z c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r6v6, types: [Vg0, nZ] */
    public C7301ts(C3957gP0 c3957gP0, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c3957gP0, "jClass");
        this.a = c3957gP0;
        this.b = (AbstractC1676Vg0) interfaceC6099nZ;
        C8277z c8277z = new C8277z(8, this);
        this.c = c8277z;
        C7991xU c7991xU = new C7991xU(AbstractC8069xu.t(c3957gP0.d()), true, c8277z);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7801wU c7801wU = new C7801wU(c7991xU);
        while (c7801wU.hasNext()) {
            Object next = c7801wU.next();
            C1559Tt0 c1559Tt0C = ((C6452pP0) next).c();
            Object arrayList = linkedHashMap.get(c1559Tt0C);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c1559Tt0C, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        C7991xU c7991xU2 = new C7991xU(AbstractC8069xu.t(this.a.b()), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C7801wU c7801wU2 = new C7801wU(c7991xU2);
        while (c7801wU2.hasNext()) {
            Object next2 = c7801wU2.next();
            linkedHashMap2.put(((C5879mP0) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListF = this.a.f();
        ?? r6 = this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) r6.invoke(next3)).booleanValue()) {
                arrayList2.add(next3);
            }
        }
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(arrayList2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB < 16 ? 16 : iB);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((C7024sP0) next4).c(), next4);
        }
        this.f = linkedHashMap3;
    }

    @Override // defpackage.JD
    public final Set a() {
        C7991xU c7991xU = new C7991xU(AbstractC8069xu.t(this.a.d()), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7801wU c7801wU = new C7801wU(c7991xU);
        while (c7801wU.hasNext()) {
            linkedHashSet.add(((C6452pP0) c7801wU.next()).c());
        }
        return linkedHashSet;
    }

    @Override // defpackage.JD
    public final C7024sP0 b(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        return (C7024sP0) this.f.get(c1559Tt0);
    }

    @Override // defpackage.JD
    public final Collection c(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        List list = (List) this.d.get(c1559Tt0);
        return list != null ? list : MN.a;
    }

    @Override // defpackage.JD
    public final C5879mP0 d(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        return (C5879mP0) this.e.get(c1559Tt0);
    }

    @Override // defpackage.JD
    public final Set e() {
        return this.f.keySet();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Vg0, nZ] */
    @Override // defpackage.JD
    public final Set f() {
        C7991xU c7991xU = new C7991xU(AbstractC8069xu.t(this.a.b()), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7801wU c7801wU = new C7801wU(c7991xU);
        while (c7801wU.hasNext()) {
            linkedHashSet.add(((C5879mP0) c7801wU.next()).c());
        }
        return linkedHashSet;
    }
}
