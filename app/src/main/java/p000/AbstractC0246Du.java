package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Du */
/* loaded from: classes2.dex */
public abstract class AbstractC0246Du extends AbstractC0183Cu {
    /* renamed from: m */
    public static void m1920m(Collection collection, Iterable iterable) {
        O90.m5968f(collection, "<this>");
        O90.m5968f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* renamed from: n */
    public static void m1921n(Collection collection, Object[] objArr) {
        O90.m5968f(collection, "<this>");
        O90.m5968f(objArr, "elements");
        collection.addAll(AbstractC0576J8.m4176c(objArr));
    }

    /* renamed from: o */
    public static final Collection m1922o(Iterable iterable) {
        O90.m5968f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC7167xu.m25982b0(iterable);
        }
        return (Collection) iterable;
    }

    /* renamed from: p */
    public static final boolean m1923p(Collection collection, InterfaceC6497nZ interfaceC6497nZ, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC6497nZ.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: q */
    public static void m1924q(ArrayList arrayList, InterfaceC6497nZ interfaceC6497nZ) {
        int iM26273d;
        O90.m5968f(arrayList, "<this>");
        int iM26273d2 = AbstractC7230yu.m26273d(arrayList);
        int i = 0;
        if (iM26273d2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC6497nZ.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM26273d2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iM26273d = AbstractC7230yu.m26273d(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM26273d);
            if (iM26273d == i) {
                return;
            } else {
                iM26273d--;
            }
        }
    }
}
