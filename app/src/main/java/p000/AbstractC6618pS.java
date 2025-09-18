package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: pS */
/* loaded from: classes2.dex */
public abstract class AbstractC6618pS {

    /* renamed from: a */
    public static final LinkedHashMap f40081a;

    /* renamed from: b */
    public static final Map f40082b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f40081a = linkedHashMap;
        m23788b(C10092l41.f36878q, m23787a("java.util.ArrayList", "java.util.LinkedList"));
        m23788b(C10092l41.f36879r, m23787a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m23788b(C10092l41.f36880s, m23787a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        m23788b(C0055As.m358j(new C0664KX("java.util.function.Function")), m23787a("java.util.function.UnaryOperator"));
        m23788b(C0055As.m358j(new C0664KX("java.util.function.BiFunction")), m23787a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((C0055As) entry.getKey()).m359b(), ((C0055As) entry.getValue()).m359b()));
        }
        f40082b = AbstractC11077sn0.m24786n(arrayList);
    }

    /* renamed from: a */
    public static ArrayList m23787a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0055As.m358j(new C0664KX(str)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m23788b(C0055As c0055As, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f40081a.put(obj, c0055As);
        }
    }
}
