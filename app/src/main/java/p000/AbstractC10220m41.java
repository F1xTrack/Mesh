package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: m41 */
/* loaded from: classes2.dex */
public abstract class AbstractC10220m41 {
    static {
        new C0664KX("java.lang").m4655c(C8340Tt0.m7798e("annotation"));
    }

    /* renamed from: a */
    public static final C0055As m22651a(String str) {
        C0664KX c0664kx = C10092l41.f36862a;
        return new C0055As(C10092l41.f36862a, C8340Tt0.m7798e(str));
    }

    /* renamed from: b */
    public static final C0055As m22652b(String str) {
        C0664KX c0664kx = C10092l41.f36862a;
        return new C0055As(C10092l41.f36864c, C8340Tt0.m7798e(str));
    }

    /* renamed from: c */
    public static final void m22653c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(setEntrySet));
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM24983b);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    /* renamed from: d */
    public static final C0055As m22654d(C8340Tt0 c8340Tt0) {
        C0664KX c0664kx = C10092l41.f36862a;
        C0055As c0055As = C10092l41.f36869h;
        return new C0055As(c0055As.m363g(), C8340Tt0.m7798e(c8340Tt0.m7802c().concat(c0055As.m365i().m7802c())));
    }

    /* renamed from: e */
    public static final C0055As m22655e(String str) {
        C0664KX c0664kx = C10092l41.f36862a;
        return new C0055As(C10092l41.f36863b, C8340Tt0.m7798e(str));
    }

    /* renamed from: f */
    public static final C0055As m22656f(C0055As c0055As) {
        C0664KX c0664kx = C10092l41.f36862a;
        return new C0055As(C10092l41.f36862a, C8340Tt0.m7798e("U".concat(c0055As.m365i().m7802c())));
    }
}
