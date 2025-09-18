package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: J0 */
/* loaded from: classes.dex */
public abstract class AbstractC0568J0 {
    protected int memoizedHashCode;

    /* renamed from: b */
    public static void m4100b(List list, List list2) {
        Charset charset = AbstractC11635x90.f45425a;
        list.getClass();
        if (list instanceof InterfaceC9147di0) {
            List listMo9785n = ((InterfaceC9147di0) list).mo9785n();
            InterfaceC9147di0 interfaceC9147di0 = (InterfaceC9147di0) list2;
            int size = list2.size();
            for (Object obj : listMo9785n) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC9147di0.size() - size) + " is null.";
                    for (int size2 = interfaceC9147di0.size() - 1; size2 >= size; size2--) {
                        interfaceC9147di0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C0299Ek) {
                    interfaceC9147di0.mo9788w((C0299Ek) obj);
                } else {
                    interfaceC9147di0.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof InterfaceC10621pD0) {
            list2.addAll(list);
            return;
        }
        if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    /* renamed from: c */
    public abstract int mo4101c(DV0 dv0);

    /* renamed from: d */
    public abstract void mo4102d(C6518nu c6518nu);
}
