package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class J0 {
    protected int memoizedHashCode;

    public static void b(List list, List list2) {
        Charset charset = AbstractC7929x90.a;
        list.getClass();
        if (list instanceof InterfaceC3442di0) {
            List listN = ((InterfaceC3442di0) list).n();
            InterfaceC3442di0 interfaceC3442di0 = (InterfaceC3442di0) list2;
            int size = list2.size();
            for (Object obj : listN) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC3442di0.size() - size) + " is null.";
                    for (int size2 = interfaceC3442di0.size() - 1; size2 >= size; size2--) {
                        interfaceC3442di0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C0362Ek) {
                    interfaceC3442di0.w((C0362Ek) obj);
                } else {
                    interfaceC3442di0.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof InterfaceC6416pD0) {
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

    public abstract int c(DV0 dv0);

    public abstract void d(C6162nu c6162nu);
}
