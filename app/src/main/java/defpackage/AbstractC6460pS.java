package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: pS, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6460pS {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(C5626l41.q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(C5626l41.r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(C5626l41.s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(C0074As.j(new KX("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(C0074As.j(new KX("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((C0074As) entry.getKey()).b(), ((C0074As) entry.getValue()).b()));
        }
        b = AbstractC7096sn0.n(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0074As.j(new KX(str)));
        }
        return arrayList;
    }

    public static void b(C0074As c0074As, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, c0074As);
        }
    }
}
