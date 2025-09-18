package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* renamed from: sn0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11077sn0 extends AbstractC11205tn0 {
    /* renamed from: f */
    public static Object m24778f(Map map, Comparable comparable) {
        O90.m5968f(map, "<this>");
        if (map instanceof InterfaceC10693pn0) {
            return ((InterfaceC10693pn0) map).m23877h();
        }
        Object obj = map.get(comparable);
        if (obj != null || map.containsKey(comparable)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + comparable + " is missing in the map.");
    }

    /* renamed from: g */
    public static HashMap m24779g(Pair... pairArr) {
        HashMap map = new HashMap(AbstractC11205tn0.m24983b(pairArr.length));
        m24784l(map, pairArr);
        return map;
    }

    /* renamed from: h */
    public static Map m24780h(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return C0842NN.f7735a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11205tn0.m24983b(pairArr.length));
        m24784l(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: i */
    public static LinkedHashMap m24781i(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11205tn0.m24983b(pairArr.length));
        m24784l(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: j */
    public static LinkedHashMap m24782j(Map map, Map map2) {
        O90.m5968f(map, "<this>");
        O90.m5968f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: k */
    public static Map m24783k(Map map, Pair pair) {
        O90.m5968f(map, "<this>");
        if (map.isEmpty()) {
            return AbstractC11205tn0.m24984c(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f36702a, pair.f36703b);
        return linkedHashMap;
    }

    /* renamed from: l */
    public static final void m24784l(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.f36702a, pair.f36703b);
        }
    }

    /* renamed from: m */
    public static List m24785m(Map map) {
        O90.m5968f(map, "<this>");
        int size = map.size();
        C0779MN c0779mn = C0779MN.f7117a;
        if (size == 0) {
            return c0779mn;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c0779mn;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC7230yu.m26274e(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    /* renamed from: n */
    public static Map m24786n(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        C0842NN c0842nn = C0842NN.f7735a;
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m24788p(iterable, linkedHashMap);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : AbstractC11205tn0.m24985d(linkedHashMap) : c0842nn;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0842nn;
        }
        if (size2 == 1) {
            return AbstractC11205tn0.m24984c((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC11205tn0.m24983b(collection.size()));
        m24788p(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    /* renamed from: o */
    public static Map m24787o(Map map) {
        O90.m5968f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m24789q(map) : AbstractC11205tn0.m24985d(map) : C0842NN.f7735a;
    }

    /* renamed from: p */
    public static final void m24788p(Iterable iterable, LinkedHashMap linkedHashMap) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f36702a, pair.f36703b);
        }
    }

    /* renamed from: q */
    public static LinkedHashMap m24789q(Map map) {
        O90.m5968f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
