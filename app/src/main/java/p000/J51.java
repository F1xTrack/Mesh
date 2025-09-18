package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class J51 extends AbstractC10187lq0 {

    /* renamed from: b */
    public final C7454Cs0 f5334b;

    /* renamed from: c */
    public final C0664KX f5335c;

    public J51(C7454Cs0 c7454Cs0, C0664KX c0664kx) {
        O90.m5968f(c7454Cs0, "moduleDescriptor");
        O90.m5968f(c0664kx, "fqName");
        this.f5334b = c7454Cs0;
        this.f5335c = c0664kx;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        return C1156SN.f10705a;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        boolean zM18998a = c4233iI.m18998a(C4233iI.f29053h);
        C0779MN c0779mn = C0779MN.f7117a;
        if (!zM18998a) {
            return c0779mn;
        }
        C0664KX c0664kx = this.f5335c;
        if (c0664kx.m4656d()) {
            if (c4233iI.f29065a.contains(C4044fI.f27131a)) {
                return c0779mn;
            }
        }
        C7454Cs0 c7454Cs0 = this.f5334b;
        c7454Cs0.getClass();
        c7454Cs0.m1425x1();
        c7454Cs0.m1425x1();
        HashSet hashSet = (HashSet) ((C1442Wv) c7454Cs0.f1742l.getValue()).mo940b(c0664kx, interfaceC6497nZ);
        ArrayList arrayList = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C8340Tt0 c8340Tt0M4658f = ((C0664KX) it.next()).m4658f();
            O90.m5967e(c8340Tt0M4658f, "shortName(...)");
            if (((Boolean) interfaceC6497nZ.invoke(c8340Tt0M4658f)).booleanValue()) {
                C8524Xh0 c8524Xh0 = null;
                if (!c8340Tt0M4658f.f11578b) {
                    C8524Xh0 c8524Xh02 = (C8524Xh0) c7454Cs0.mo895C0(c0664kx.m4655c(c8340Tt0M4658f));
                    if (!((Boolean) WS1.m8763b(c8524Xh02.f13925g, C8524Xh0.f13921i[1])).booleanValue()) {
                        c8524Xh0 = c8524Xh02;
                    }
                }
                AbstractC9502gT1.m18571a(arrayList, c8524Xh0);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "subpackages of " + this.f5335c + " from " + this.f5334b;
    }
}
