package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: Wv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1798Wv implements InterfaceC0330Dz0 {
    public final List a;
    public final String b;

    public C1798Wv(List list, String str) {
        O90.f(str, "debugName");
        this.a = list;
        this.b = str;
        list.size();
        AbstractC8069xu.g0(list).size();
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final List a(KX kx) {
        O90.f(kx, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC7201tK1.a((InterfaceC0174Bz0) it.next(), kx, arrayList);
        }
        return AbstractC8069xu.b0(arrayList);
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final Collection b(KX kx, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(kx, "fqName");
        O90.f(interfaceC6099nZ, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC0174Bz0) it.next()).b(kx, interfaceC6099nZ));
        }
        return hashSet;
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final boolean c(KX kx) {
        O90.f(kx, "fqName");
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC7201tK1.b((InterfaceC0174Bz0) it.next(), kx)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final void d(KX kx, ArrayList arrayList) {
        O90.f(kx, "fqName");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC7201tK1.a((InterfaceC0174Bz0) it.next(), kx, arrayList);
        }
    }

    public final String toString() {
        return this.b;
    }
}
