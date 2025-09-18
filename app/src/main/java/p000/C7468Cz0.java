package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Cz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7468Cz0 implements InterfaceC7520Dz0 {

    /* renamed from: a */
    public final ArrayList f1789a;

    public C7468Cz0(ArrayList arrayList) {
        this.f1789a = arrayList;
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: a */
    public final List mo939a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        ArrayList arrayList = this.f1789a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (O90.m5963a(((AbstractC7364Az0) ((InterfaceC11993zz0) obj)).f494f, c0664kx)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: b */
    public final Collection mo940b(C0664KX c0664kx, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c0664kx, "fqName");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return AbstractC9639hY0.m18835n(new C7141xU(AbstractC9639hY0.m18833l(AbstractC7167xu.m25992t(this.f1789a), C9393fd0.f27295u), true, new C1065Qv(c0664kx, 1)));
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: c */
    public final boolean mo1483c(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        ArrayList arrayList = this.f1789a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (O90.m5963a(((AbstractC7364Az0) ((InterfaceC11993zz0) it.next())).f494f, c0664kx)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: d */
    public final void mo1484d(C0664KX c0664kx, ArrayList arrayList) {
        O90.m5968f(c0664kx, "fqName");
        for (Object obj : this.f1789a) {
            if (O90.m5963a(((AbstractC7364Az0) ((InterfaceC11993zz0) obj)).f494f, c0664kx)) {
                arrayList.add(obj);
            }
        }
    }
}
