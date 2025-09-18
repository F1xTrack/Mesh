package p000;

import kotlin.Pair;

/* renamed from: Sa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8250Sa0 {

    /* renamed from: a */
    public static final C8340Tt0 f10860a = C8340Tt0.m7798e("message");

    /* renamed from: b */
    public static final C8340Tt0 f10861b = C8340Tt0.m7798e("allowedTargets");

    /* renamed from: c */
    public static final C8340Tt0 f10862c = C8340Tt0.m7798e("value");

    /* renamed from: d */
    public static final Object f10863d = AbstractC11077sn0.m24780h(new Pair(AbstractC10604p41.f39822t, AbstractC8046Oc0.f8521c), new Pair(AbstractC10604p41.f39825w, AbstractC8046Oc0.f8522d), new Pair(AbstractC10604p41.f39826x, AbstractC8046Oc0.f8524f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* renamed from: a */
    public static InterfaceC10619pC0 m7397a(C0664KX c0664kx, InterfaceC8302Ta0 interfaceC8302Ta0, C6479nH c6479nH) {
        WO0 wo0Mo7705a;
        O90.m5968f(c0664kx, "kotlinName");
        O90.m5968f(interfaceC8302Ta0, "annotationOwner");
        O90.m5968f(c6479nH, "c");
        if (c0664kx.equals(AbstractC10604p41.f39815m)) {
            C0664KX c0664kx2 = AbstractC8046Oc0.f8523e;
            O90.m5967e(c0664kx2, "DEPRECATED_ANNOTATION");
            WO0 wo0Mo7705a2 = interfaceC8302Ta0.mo7705a(c0664kx2);
            if (wo0Mo7705a2 != null) {
                return new C8614Za0(wo0Mo7705a2, c6479nH);
            }
        }
        C0664KX c0664kx3 = (C0664KX) f10863d.get(c0664kx);
        if (c0664kx3 == null || (wo0Mo7705a = interfaceC8302Ta0.mo7705a(c0664kx3)) == null) {
            return null;
        }
        return m7398b(c6479nH, wo0Mo7705a, false);
    }

    /* renamed from: b */
    public static InterfaceC10619pC0 m7398b(C6479nH c6479nH, WO0 wo0, boolean z) {
        O90.m5968f(wo0, "annotation");
        O90.m5968f(c6479nH, "c");
        C0055As c0055AsM8433a = VO0.m8433a(P22.m6213b(P22.m6212a(wo0.f13158a)));
        if (c0055AsM8433a.equals(C0055As.m358j(AbstractC8046Oc0.f8521c))) {
            return new C10669pb0(wo0, c6479nH);
        }
        if (c0055AsM8433a.equals(C0055As.m358j(AbstractC8046Oc0.f8522d))) {
            return new C9901jb0(wo0, c6479nH);
        }
        if (c0055AsM8433a.equals(C0055As.m358j(AbstractC8046Oc0.f8524f))) {
            return new C8198Ra0(c6479nH, wo0, AbstractC10604p41.f39826x);
        }
        if (c0055AsM8433a.equals(C0055As.m358j(AbstractC8046Oc0.f8523e))) {
            return null;
        }
        return new C11576wh0(c6479nH, wo0, z);
    }
}
