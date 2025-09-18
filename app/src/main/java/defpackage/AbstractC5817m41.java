package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: m41 */
/* loaded from: classes2.dex */
public abstract class AbstractC5817m41 {
    static {
        new KX("java.lang").c(C1559Tt0.e("annotation"));
    }

    public static final C0074As a(String str) {
        KX kx = C5626l41.a;
        return new C0074As(C5626l41.a, C1559Tt0.e(str));
    }

    public static final C0074As b(String str) {
        KX kx = C5626l41.a;
        return new C0074As(C5626l41.c, C1559Tt0.e(str));
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(setEntrySet));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final C0074As d(C1559Tt0 c1559Tt0) {
        KX kx = C5626l41.a;
        C0074As c0074As = C5626l41.h;
        return new C0074As(c0074As.g(), C1559Tt0.e(c1559Tt0.c().concat(c0074As.i().c())));
    }

    public static final C0074As e(String str) {
        KX kx = C5626l41.a;
        return new C0074As(C5626l41.b, C1559Tt0.e(str));
    }

    public static final C0074As f(C0074As c0074As) {
        KX kx = C5626l41.a;
        return new C0074As(C5626l41.a, C1559Tt0.e("U".concat(c0074As.i().c())));
    }
}
