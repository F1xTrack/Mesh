package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: Wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1762Wj implements InterfaceC1606Uj {
    public final C1996Zj b = new C1996Zj();

    public InterfaceC0174Bz0 a(Z41 z41, InterfaceC0153Bs0 interfaceC0153Bs0, Iterable iterable, InterfaceC7364uB0 interfaceC7364uB0, InterfaceC6384p3 interfaceC6384p3, boolean z) {
        O90.f(z41, "storageManager");
        O90.f(interfaceC0153Bs0, "builtInsModule");
        O90.f(iterable, "classDescriptorFactories");
        O90.f(interfaceC7364uB0, "platformDependentDeclarationFilter");
        O90.f(interfaceC6384p3, "additionalClassPartsProvider");
        Set<KX> set = AbstractC6581q41.q;
        C1684Vj c1684Vj = new C1684Vj(1, this.b, 0);
        O90.f(set, "packageFqNames");
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(set));
        for (KX kx : set) {
            C1372Rj.m.getClass();
            String strA = C1372Rj.a(kx);
            InputStream inputStream = (InputStream) c1684Vj.invoke(strA);
            if (inputStream == null) {
                throw new IllegalStateException(AbstractC8235ym.v("Resource not found in classpath: ", strA));
            }
            arrayList.add(AbstractC5307jP1.a(kx, z41, interfaceC0153Bs0, inputStream));
        }
        C0252Cz0 c0252Cz0 = new C0252Cz0(arrayList);
        T71 t71 = new T71(z41, interfaceC0153Bs0);
        G10 g10 = new G10(13, c0252Cz0);
        C1372Rj c1372Rj = C1372Rj.m;
        C7955xI c7955xI = new C7955xI(z41, interfaceC0153Bs0, g10, new ES1(interfaceC0153Bs0, t71, c1372Rj), c0252Cz0, iterable, t71, interfaceC6384p3, interfaceC7364uB0, c1372Rj.a, null, new OL0(z41), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1840Xj) it.next()).z1(c7955xI);
        }
        return c0252Cz0;
    }
}
