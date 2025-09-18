package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: ck */
/* loaded from: classes2.dex */
public abstract class AbstractC1866ck {

    /* renamed from: a */
    public static final Object f17715a;

    /* renamed from: b */
    public static final LinkedHashMap f17716b;

    /* renamed from: c */
    public static final Set f17717c;

    /* renamed from: d */
    public static final Set f17718d;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Map] */
    static {
        C0789MX c0789mx = AbstractC10604p41.f39812j;
        C0664KX c0664kxM5393g = c0789mx.m5388b(C8340Tt0.m7798e("name")).m5393g();
        O90.m5967e(c0664kxM5393g, "toSafe(...)");
        Pair pair = new Pair(c0664kxM5393g, AbstractC10732q41.f40580d);
        C0664KX c0664kxM5393g2 = c0789mx.m5388b(C8340Tt0.m7798e("ordinal")).m5393g();
        O90.m5967e(c0664kxM5393g2, "toSafe(...)");
        Pair pair2 = new Pair(c0664kxM5393g2, C8340Tt0.m7798e("ordinal"));
        Pair pair3 = new Pair(AbstractC10604p41.f39775B.m4655c(C8340Tt0.m7798e("size")), C8340Tt0.m7798e("size"));
        C0664KX c0664kx = AbstractC10604p41.f39779F;
        Pair pair4 = new Pair(c0664kx.m4655c(C8340Tt0.m7798e("size")), C8340Tt0.m7798e("size"));
        C0664KX c0664kxM5393g3 = AbstractC10604p41.f39807e.m5388b(C8340Tt0.m7798e("length")).m5393g();
        O90.m5967e(c0664kxM5393g3, "toSafe(...)");
        Map mapM24780h = AbstractC11077sn0.m24780h(pair, pair2, pair3, pair4, new Pair(c0664kxM5393g3, C8340Tt0.m7798e("length")), new Pair(c0664kx.m4655c(C8340Tt0.m7798e("keys")), C8340Tt0.m7798e("keySet")), new Pair(c0664kx.m4655c(C8340Tt0.m7798e("values")), C8340Tt0.m7798e("values")), new Pair(c0664kx.m4655c(C8340Tt0.m7798e("entries")), C8340Tt0.m7798e("entrySet")));
        f17715a = mapM24780h;
        Set<Map.Entry> setEntrySet = mapM24780h.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(setEntrySet));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((C0664KX) entry.getKey()).m4658f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair5 = (Pair) it.next();
            C8340Tt0 c8340Tt0 = (C8340Tt0) pair5.f36703b;
            Object arrayList2 = linkedHashMap.get(c8340Tt0);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c8340Tt0, arrayList2);
            }
            ((List) arrayList2).add((C8340Tt0) pair5.f36702a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            O90.m5968f(iterable, "<this>");
            linkedHashMap2.put(key, AbstractC7167xu.m25982b0(AbstractC7167xu.m25986f0(iterable)));
        }
        f17716b = linkedHashMap2;
        ?? r0 = f17715a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            String str = C11309ub0.f43758a;
            C0789MX c0789mxM4661i = ((C0664KX) entry3.getKey()).m4657e().m4661i();
            O90.m5967e(c0789mxM4661i, "toUnsafe(...)");
            C0055As c0055AsM25217f = C11309ub0.m25217f(c0789mxM4661i);
            O90.m5965c(c0055AsM25217f);
            linkedHashSet.add(c0055AsM25217f.m359b().m4655c((C8340Tt0) entry3.getValue()));
        }
        Set setKeySet = f17715a.keySet();
        f17717c = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(setKeySet));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C0664KX) it2.next()).m4658f());
        }
        f17718d = AbstractC7167xu.m25987g0(arrayList3);
    }
}
