package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: pM0 */
/* loaded from: classes.dex */
public abstract class AbstractC10639pM0 {

    /* renamed from: a */
    public static int f40032a = 1;

    /* renamed from: b */
    public static final C0649KI f40033b = new C0649KI();

    /* renamed from: a */
    public static final C8205Rd1 m23745a(InterfaceC6976us interfaceC6976us, InterfaceC6976us interfaceC6976us2) {
        O90.m5968f(interfaceC6976us, "from");
        O90.m5968f(interfaceC6976us2, "to");
        interfaceC6976us.mo1438o().size();
        interfaceC6976us2.mo1438o().size();
        List listMo1438o = interfaceC6976us.mo1438o();
        O90.m5967e(listMo1438o, "getDeclaredTypeParameters(...)");
        List list = listMo1438o;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10292me1) it.next()).mo1439v());
        }
        List listMo1438o2 = interfaceC6976us2.mo1438o();
        O90.m5967e(listMo1438o2, "getDeclaredTypeParameters(...)");
        List list2 = listMo1438o2;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            X01 x01Mo1492m = ((InterfaceC10292me1) it2.next()).mo1492m();
            O90.m5967e(x01Mo1492m, "getDefaultType(...)");
            arrayList2.add(CZ1.m1225a(x01Mo1492m));
        }
        return new C8205Rd1(AbstractC11077sn0.m24786n(AbstractC7167xu.m25989i0(arrayList, arrayList2)), false);
    }

    /* renamed from: b */
    public static final synchronized int m23746b() {
        int i;
        i = f40032a;
        f40032a = i + 10;
        return i;
    }
}
