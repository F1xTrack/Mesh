package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6443pM0 {
    public static int a = 1;
    public static final KI b = new KI();

    public static final C1356Rd1 a(InterfaceC7492us interfaceC7492us, InterfaceC7492us interfaceC7492us2) {
        O90.f(interfaceC7492us, "from");
        O90.f(interfaceC7492us2, "to");
        interfaceC7492us.o().size();
        interfaceC7492us2.o().size();
        List listO = interfaceC7492us.o();
        O90.e(listO, "getDeclaredTypeParameters(...)");
        List list = listO;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5925me1) it.next()).v());
        }
        List listO2 = interfaceC7492us2.o();
        O90.e(listO2, "getDeclaredTypeParameters(...)");
        List list2 = listO2;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            X01 x01M = ((InterfaceC5925me1) it2.next()).m();
            O90.e(x01M, "getDefaultType(...)");
            arrayList2.add(CZ1.a(x01M));
        }
        return new C1356Rd1(AbstractC7096sn0.n(AbstractC8069xu.i0(arrayList, arrayList2)), false);
    }

    public static final synchronized int b() {
        int i;
        i = a;
        a = i + 10;
        return i;
    }
}
