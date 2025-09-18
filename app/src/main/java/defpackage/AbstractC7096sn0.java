package defpackage;

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
public abstract class AbstractC7096sn0 extends AbstractC7287tn0 {
    public static Object f(Map map, Comparable comparable) {
        O90.f(map, "<this>");
        if (map instanceof InterfaceC6524pn0) {
            return ((InterfaceC6524pn0) map).h();
        }
        Object obj = map.get(comparable);
        if (obj != null || map.containsKey(comparable)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + comparable + " is missing in the map.");
    }

    public static HashMap g(Pair... pairArr) {
        HashMap map = new HashMap(AbstractC7287tn0.b(pairArr.length));
        l(map, pairArr);
        return map;
    }

    public static Map h(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return NN.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7287tn0.b(pairArr.length));
        l(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap i(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7287tn0.b(pairArr.length));
        l(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap j(Map map, Map map2) {
        O90.f(map, "<this>");
        O90.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map k(Map map, Pair pair) {
        O90.f(map, "<this>");
        if (map.isEmpty()) {
            return AbstractC7287tn0.c(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.a, pair.b);
        return linkedHashMap;
    }

    public static final void l(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.a, pair.b);
        }
    }

    public static List m(Map map) {
        O90.f(map, "<this>");
        int size = map.size();
        MN mn = MN.a;
        if (size == 0) {
            return mn;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return mn;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC8259yu.e(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map n(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        NN nn = NN.a;
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            p(iterable, linkedHashMap);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : AbstractC7287tn0.d(linkedHashMap) : nn;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return nn;
        }
        if (size2 == 1) {
            return AbstractC7287tn0.c((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7287tn0.b(collection.size()));
        p(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map o(Map map) {
        O90.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? q(map) : AbstractC7287tn0.d(map) : NN.a;
    }

    public static final void p(Iterable iterable, LinkedHashMap linkedHashMap) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.a, pair.b);
        }
    }

    public static LinkedHashMap q(Map map) {
        O90.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
