package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: Wj */
/* loaded from: classes2.dex */
public final class C1430Wj implements InterfaceC1304Uj {

    /* renamed from: b */
    public final C1619Zj f13346b = new C1619Zj();

    /* renamed from: a */
    public InterfaceC7416Bz0 m8839a(Z41 z41, InterfaceC7402Bs0 interfaceC7402Bs0, Iterable iterable, InterfaceC11257uB0 interfaceC11257uB0, InterfaceC6593p3 interfaceC6593p3, boolean z) {
        O90.m5968f(z41, "storageManager");
        O90.m5968f(interfaceC7402Bs0, "builtInsModule");
        O90.m5968f(iterable, "classDescriptorFactories");
        O90.m5968f(interfaceC11257uB0, "platformDependentDeclarationFilter");
        O90.m5968f(interfaceC6593p3, "additionalClassPartsProvider");
        Set<C0664KX> set = AbstractC10732q41.f40593q;
        C1367Vj c1367Vj = new C1367Vj(1, this.f13346b, 0);
        O90.m5968f(set, "packageFqNames");
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(set));
        for (C0664KX c0664kx : set) {
            C1115Rj.f10401m.getClass();
            String strM7109a = C1115Rj.m7109a(c0664kx);
            InputStream inputStream = (InputStream) c1367Vj.invoke(strM7109a);
            if (inputStream == null) {
                throw new IllegalStateException(AbstractC7222ym.m26245v("Resource not found in classpath: ", strM7109a));
            }
            arrayList.add(AbstractC9878jP1.m22031a(c0664kx, z41, interfaceC7402Bs0, inputStream));
        }
        C7468Cz0 c7468Cz0 = new C7468Cz0(arrayList);
        T71 t71 = new T71(z41, interfaceC7402Bs0);
        G10 g10 = new G10(13, c7468Cz0);
        C1115Rj c1115Rj = C1115Rj.f10401m;
        C7129xI c7129xI = new C7129xI(z41, interfaceC7402Bs0, g10, new ES1(interfaceC7402Bs0, t71, c1115Rj), c7468Cz0, iterable, t71, interfaceC6593p3, interfaceC11257uB0, c1115Rj.f40190a, null, new OL0(z41), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1493Xj) it.next()).m9109z1(c7129xI);
        }
        return c7468Cz0;
    }
}
