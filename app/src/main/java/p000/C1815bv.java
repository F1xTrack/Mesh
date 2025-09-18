package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: bv */
/* loaded from: classes2.dex */
public final class C1815bv {

    /* renamed from: a */
    public static final LinkedHashSet f17224a;

    static {
        Set<EnumC11005sD0> set = EnumC11005sD0.f42304e;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(set));
        for (EnumC11005sD0 enumC11005sD0 : set) {
            O90.m5968f(enumC11005sD0, "primitiveType");
            arrayList.add(AbstractC10732q41.f40588l.m4655c(enumC11005sD0.f42314a));
        }
        C0664KX c0664kxM5393g = AbstractC10604p41.f39808f.m5393g();
        O90.m5967e(c0664kxM5393g, "toSafe(...)");
        ArrayList arrayListM25969O = AbstractC7167xu.m25969O(arrayList, c0664kxM5393g);
        C0664KX c0664kxM5393g2 = AbstractC10604p41.f39810h.m5393g();
        O90.m5967e(c0664kxM5393g2, "toSafe(...)");
        ArrayList arrayListM25969O2 = AbstractC7167xu.m25969O(arrayListM25969O, c0664kxM5393g2);
        C0664KX c0664kxM5393g3 = AbstractC10604p41.f39812j.m5393g();
        O90.m5967e(c0664kxM5393g3, "toSafe(...)");
        ArrayList arrayListM25969O3 = AbstractC7167xu.m25969O(arrayListM25969O2, c0664kxM5393g3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListM25969O3.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C0055As.m358j((C0664KX) it.next()));
        }
        f17224a = linkedHashSet;
    }
}
