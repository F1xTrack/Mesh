package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class PI {
    public static final /* synthetic */ InterfaceC5927mf0[] j;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final C1454Sk0 d;
    public final C1454Sk0 e;
    public final C1766Wk0 f;
    public final C1688Vk0 g;
    public final C1688Vk0 h;
    public final /* synthetic */ RI i;

    static {
        IP0 ip0 = BP0.a;
        j = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(PI.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), ip0.f(new GE0(ip0.b(PI.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public PI(RI ri, List list, List list2, List list3) {
        O90.f(list, "functionList");
        O90.f(list2, "propertyList");
        O90.f(list3, "typeAliasList");
        this.i = ri;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C1559Tt0 c1559Tt0B = CB1.b((InterfaceC1637Ut0) ri.b.d, ((C4309iF0) ((K0) obj)).f);
            Object arrayList = linkedHashMap.get(c1559Tt0B);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c1559Tt0B, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = c(linkedHashMap);
        RI ri2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            C1559Tt0 c1559Tt0B2 = CB1.b((InterfaceC1637Ut0) ri2.b.d, ((C6613qF0) ((K0) obj2)).f);
            Object arrayList2 = linkedHashMap2.get(c1559Tt0B2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(c1559Tt0B2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = c(linkedHashMap2);
        ((C7955xI) this.i.b.c).c.getClass();
        RI ri3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            C1559Tt0 c1559Tt0B3 = CB1.b((InterfaceC1637Ut0) ri3.b.d, ((CF0) ((K0) obj3)).e);
            Object arrayList3 = linkedHashMap3.get(c1559Tt0B3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(c1559Tt0B3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = c(linkedHashMap3);
        this.d = ((C1922Yk0) ((C7955xI) this.i.b.c).a).b(new OI(this, 0));
        this.e = ((C1922Yk0) ((C7955xI) this.i.b.c).a).b(new OI(this, 1));
        this.f = ((C1922Yk0) ((C7955xI) this.i.b.c).a).c(new OI(this, 2));
        RI ri4 = this.i;
        Z41 z41 = ((C7955xI) ri4.b.c).a;
        NI ni = new NI(this, ri4, 0);
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        c1922Yk0.getClass();
        this.g = new C1688Vk0(c1922Yk0, ni);
        RI ri5 = this.i;
        Z41 z412 = ((C7955xI) ri5.b.c).a;
        NI ni2 = new NI(this, ri5, 1);
        C1922Yk0 c1922Yk02 = (C1922Yk0) z412;
        c1922Yk02.getClass();
        this.h = new C1688Vk0(c1922Yk02, ni2);
    }

    public static LinkedHashMap c(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7287tn0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<K0> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable));
            for (K0 k0 : iterable) {
                int iB = k0.b();
                int i = J9.i(iB) + iB;
                if (i > 4096) {
                    i = 4096;
                }
                J9 j9N = J9.n(byteArrayOutputStream, i);
                j9N.F(iB);
                k0.f(j9N);
                j9N.m();
                arrayList.add(C1518Tf1.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        return !((Set) WS1.b(this.g, j[0])).contains(c1559Tt0) ? MN.a : (Collection) this.d.invoke(c1559Tt0);
    }

    public final Collection b(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        return !((Set) WS1.b(this.h, j[1])).contains(c1559Tt0) ? MN.a : (Collection) this.e.invoke(c1559Tt0);
    }
}
