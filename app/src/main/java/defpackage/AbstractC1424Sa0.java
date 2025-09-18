package defpackage;

import kotlin.Pair;

/* renamed from: Sa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1424Sa0 {
    public static final C1559Tt0 a = C1559Tt0.e("message");
    public static final C1559Tt0 b = C1559Tt0.e("allowedTargets");
    public static final C1559Tt0 c = C1559Tt0.e("value");
    public static final Object d = AbstractC7096sn0.h(new Pair(AbstractC6390p41.t, AbstractC1118Oc0.c), new Pair(AbstractC6390p41.w, AbstractC1118Oc0.d), new Pair(AbstractC6390p41.x, AbstractC1118Oc0.f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static InterfaceC6413pC0 a(KX kx, InterfaceC1502Ta0 interfaceC1502Ta0, C6045nH c6045nH) {
        WO0 wo0A;
        O90.f(kx, "kotlinName");
        O90.f(interfaceC1502Ta0, "annotationOwner");
        O90.f(c6045nH, "c");
        if (kx.equals(AbstractC6390p41.m)) {
            KX kx2 = AbstractC1118Oc0.e;
            O90.e(kx2, "DEPRECATED_ANNOTATION");
            WO0 wo0A2 = interfaceC1502Ta0.a(kx2);
            if (wo0A2 != null) {
                return new C1970Za0(wo0A2, c6045nH);
            }
        }
        KX kx3 = (KX) d.get(kx);
        if (kx3 == null || (wo0A = interfaceC1502Ta0.a(kx3)) == null) {
            return null;
        }
        return b(c6045nH, wo0A, false);
    }

    public static InterfaceC6413pC0 b(C6045nH c6045nH, WO0 wo0, boolean z) {
        O90.f(wo0, "annotation");
        O90.f(c6045nH, "c");
        C0074As c0074AsA = VO0.a(P22.b(P22.a(wo0.a)));
        if (c0074AsA.equals(C0074As.j(AbstractC1118Oc0.c))) {
            return new C6488pb0(wo0, c6045nH);
        }
        if (c0074AsA.equals(C0074As.j(AbstractC1118Oc0.d))) {
            return new C5342jb0(wo0, c6045nH);
        }
        if (c0074AsA.equals(C0074As.j(AbstractC1118Oc0.f))) {
            return new C1346Ra0(c6045nH, wo0, AbstractC6390p41.x);
        }
        if (c0074AsA.equals(C0074As.j(AbstractC1118Oc0.e))) {
            return null;
        }
        return new C7841wh0(c6045nH, wo0, z);
    }
}
