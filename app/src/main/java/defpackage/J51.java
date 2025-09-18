package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class J51 extends AbstractC5769lq0 {
    public final C0231Cs0 b;
    public final KX c;

    public J51(C0231Cs0 c0231Cs0, KX kx) {
        O90.f(c0231Cs0, "moduleDescriptor");
        O90.f(kx, "fqName");
        this.b = c0231Cs0;
        this.c = kx;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set d() {
        return SN.a;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        boolean zA = c4317iI.a(C4317iI.h);
        MN mn = MN.a;
        if (!zA) {
            return mn;
        }
        KX kx = this.c;
        if (kx.d()) {
            if (c4317iI.a.contains(C3744fI.a)) {
                return mn;
            }
        }
        C0231Cs0 c0231Cs0 = this.b;
        c0231Cs0.getClass();
        c0231Cs0.x1();
        c0231Cs0.x1();
        HashSet hashSet = (HashSet) ((C1798Wv) c0231Cs0.l.getValue()).b(kx, interfaceC6099nZ);
        ArrayList arrayList = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C1559Tt0 c1559Tt0F = ((KX) it.next()).f();
            O90.e(c1559Tt0F, "shortName(...)");
            if (((Boolean) interfaceC6099nZ.invoke(c1559Tt0F)).booleanValue()) {
                C1835Xh0 c1835Xh0 = null;
                if (!c1559Tt0F.b) {
                    C1835Xh0 c1835Xh02 = (C1835Xh0) c0231Cs0.C0(kx.c(c1559Tt0F));
                    if (!((Boolean) WS1.b(c1835Xh02.g, C1835Xh0.i[1])).booleanValue()) {
                        c1835Xh0 = c1835Xh02;
                    }
                }
                AbstractC3970gT1.a(arrayList, c1835Xh0);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
