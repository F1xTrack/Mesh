package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: bv */
/* loaded from: classes2.dex */
public final class C2414bv {
    public static final LinkedHashSet a;

    static {
        Set<EnumC6988sD0> set = EnumC6988sD0.e;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(set));
        for (EnumC6988sD0 enumC6988sD0 : set) {
            O90.f(enumC6988sD0, "primitiveType");
            arrayList.add(AbstractC6581q41.l.c(enumC6988sD0.a));
        }
        KX kxG = AbstractC6390p41.f.g();
        O90.e(kxG, "toSafe(...)");
        ArrayList arrayListO = AbstractC8069xu.O(arrayList, kxG);
        KX kxG2 = AbstractC6390p41.h.g();
        O90.e(kxG2, "toSafe(...)");
        ArrayList arrayListO2 = AbstractC8069xu.O(arrayListO, kxG2);
        KX kxG3 = AbstractC6390p41.j.g();
        O90.e(kxG3, "toSafe(...)");
        ArrayList arrayListO3 = AbstractC8069xu.O(arrayListO2, kxG3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListO3.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C0074As.j((KX) it.next()));
        }
        a = linkedHashSet;
    }
}
