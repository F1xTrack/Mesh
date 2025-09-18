package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Du */
/* loaded from: classes2.dex */
public abstract class AbstractC0314Du extends AbstractC0236Cu {
    public static void m(Collection collection, Iterable iterable) {
        O90.f(collection, "<this>");
        O90.f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void n(Collection collection, Object[] objArr) {
        O90.f(collection, "<this>");
        O90.f(objArr, "elements");
        collection.addAll(J8.c(objArr));
    }

    public static final Collection o(Iterable iterable) {
        O90.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC8069xu.b0(iterable);
        }
        return (Collection) iterable;
    }

    public static final boolean p(Collection collection, InterfaceC6099nZ interfaceC6099nZ, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC6099nZ.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void q(ArrayList arrayList, InterfaceC6099nZ interfaceC6099nZ) {
        int iD;
        O90.f(arrayList, "<this>");
        int iD2 = AbstractC8259yu.d(arrayList);
        int i = 0;
        if (iD2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC6099nZ.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iD2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iD = AbstractC8259yu.d(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iD);
            if (iD == i) {
                return;
            } else {
                iD--;
            }
        }
    }
}
