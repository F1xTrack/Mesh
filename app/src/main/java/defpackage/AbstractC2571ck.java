package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: ck, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2571ck {
    public static final Object a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Map] */
    static {
        MX mx = AbstractC6390p41.j;
        KX kxG = mx.b(C1559Tt0.e("name")).g();
        O90.e(kxG, "toSafe(...)");
        Pair pair = new Pair(kxG, AbstractC6581q41.d);
        KX kxG2 = mx.b(C1559Tt0.e("ordinal")).g();
        O90.e(kxG2, "toSafe(...)");
        Pair pair2 = new Pair(kxG2, C1559Tt0.e("ordinal"));
        Pair pair3 = new Pair(AbstractC6390p41.B.c(C1559Tt0.e("size")), C1559Tt0.e("size"));
        KX kx = AbstractC6390p41.F;
        Pair pair4 = new Pair(kx.c(C1559Tt0.e("size")), C1559Tt0.e("size"));
        KX kxG3 = AbstractC6390p41.e.b(C1559Tt0.e("length")).g();
        O90.e(kxG3, "toSafe(...)");
        Map mapH = AbstractC7096sn0.h(pair, pair2, pair3, pair4, new Pair(kxG3, C1559Tt0.e("length")), new Pair(kx.c(C1559Tt0.e("keys")), C1559Tt0.e("keySet")), new Pair(kx.c(C1559Tt0.e("values")), C1559Tt0.e("values")), new Pair(kx.c(C1559Tt0.e("entries")), C1559Tt0.e("entrySet")));
        a = mapH;
        Set<Map.Entry> setEntrySet = mapH.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(setEntrySet));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((KX) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair5 = (Pair) it.next();
            C1559Tt0 c1559Tt0 = (C1559Tt0) pair5.b;
            Object arrayList2 = linkedHashMap.get(c1559Tt0);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c1559Tt0, arrayList2);
            }
            ((List) arrayList2).add((C1559Tt0) pair5.a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7287tn0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            O90.f(iterable, "<this>");
            linkedHashMap2.put(key, AbstractC8069xu.b0(AbstractC8069xu.f0(iterable)));
        }
        b = linkedHashMap2;
        ?? r0 = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            String str = C7442ub0.a;
            MX mxI = ((KX) entry3.getKey()).e().i();
            O90.e(mxI, "toUnsafe(...)");
            C0074As c0074AsF = C7442ub0.f(mxI);
            O90.c(c0074AsF);
            linkedHashSet.add(c0074AsF.b().c((C1559Tt0) entry3.getValue()));
        }
        Set setKeySet = a.keySet();
        c = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(setKeySet));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((KX) it2.next()).f());
        }
        d = AbstractC8069xu.g0(arrayList3);
    }
}
