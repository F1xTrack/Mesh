package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: Wv */
/* loaded from: classes2.dex */
public final class C1442Wv implements InterfaceC7520Dz0 {

    /* renamed from: a */
    public final List f13453a;

    /* renamed from: b */
    public final String f13454b;

    public C1442Wv(List list, String str) {
        O90.m5968f(str, "debugName");
        this.f13453a = list;
        this.f13454b = str;
        list.size();
        AbstractC7167xu.m25987g0(list).size();
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: a */
    public final List mo939a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f13453a.iterator();
        while (it.hasNext()) {
            AbstractC11148tK1.m24876a((InterfaceC7416Bz0) it.next(), c0664kx, arrayList);
        }
        return AbstractC7167xu.m25982b0(arrayList);
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: b */
    public final Collection mo940b(C0664KX c0664kx, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c0664kx, "fqName");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f13453a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC7416Bz0) it.next()).mo940b(c0664kx, interfaceC6497nZ));
        }
        return hashSet;
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: c */
    public final boolean mo1483c(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        List list = this.f13453a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC11148tK1.m24877b((InterfaceC7416Bz0) it.next(), c0664kx)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: d */
    public final void mo1484d(C0664KX c0664kx, ArrayList arrayList) {
        O90.m5968f(c0664kx, "fqName");
        Iterator it = this.f13453a.iterator();
        while (it.hasNext()) {
            AbstractC11148tK1.m24876a((InterfaceC7416Bz0) it.next(), c0664kx, arrayList);
        }
    }

    public final String toString() {
        return this.f13454b;
    }
}
