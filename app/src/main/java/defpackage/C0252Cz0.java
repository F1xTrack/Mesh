package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Cz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0252Cz0 implements InterfaceC0330Dz0 {
    public final ArrayList a;

    public C0252Cz0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final List a(KX kx) {
        O90.f(kx, "fqName");
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (O90.a(((AbstractC0096Az0) ((InterfaceC8465zz0) obj)).f, kx)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final Collection b(KX kx, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(kx, "fqName");
        O90.f(interfaceC6099nZ, "nameFilter");
        return AbstractC4175hY0.n(new C7991xU(AbstractC4175hY0.l(AbstractC8069xu.t(this.a), C3808fd0.u), true, new C1330Qv(kx, 1)));
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final boolean c(KX kx) {
        O90.f(kx, "fqName");
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (O90.a(((AbstractC0096Az0) ((InterfaceC8465zz0) it.next())).f, kx)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final void d(KX kx, ArrayList arrayList) {
        O90.f(kx, "fqName");
        for (Object obj : this.a) {
            if (O90.a(((AbstractC0096Az0) ((InterfaceC8465zz0) obj)).f, kx)) {
                arrayList.add(obj);
            }
        }
    }
}
