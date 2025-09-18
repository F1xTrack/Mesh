package p000;

/* loaded from: classes.dex */
public abstract class QL1 {
    /* renamed from: a */
    public static String m6665a(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC9886jT1.m22040f("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC9886jT1.m22040f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
    }

    /* renamed from: b */
    public static void m6666b(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC9886jT1.m22040f(str, Long.valueOf(j)));
        }
    }

    /* renamed from: c */
    public static void m6667c(int i, int i2) {
        String strM22040f;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM22040f = AbstractC9886jT1.m22040f("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
                }
                strM22040f = AbstractC9886jT1.m22040f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM22040f);
        }
    }

    /* renamed from: d */
    public static void m6668d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: e */
    public static void m6669e(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m6665a(i, i2, "index"));
        }
    }

    /* renamed from: f */
    public static void m6670f(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m6665a(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m6665a(i2, i3, "end index") : AbstractC9886jT1.m22040f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: g */
    public static void m6671g(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: h */
    public static C11667xP0 m6672h(AbstractC7598Fm0 abstractC7598Fm0, boolean z, boolean z2, Boolean bool, boolean z3, C8342Tu0 c8342Tu0, C10417nd0 c10417nd0) {
        PF0 pf0;
        O90.m5968f(abstractC7598Fm0, "container");
        O90.m5968f(c10417nd0, "jvmMetadataVersion");
        SE0 se0 = SE0.INTERFACE;
        W21 w21 = (W21) abstractC7598Fm0.f3416d;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC7598Fm0 + ')').toString());
            }
            if (abstractC7598Fm0 instanceof PF0) {
                PF0 pf02 = (PF0) abstractC7598Fm0;
                if (pf02.f8948h == se0) {
                    return AbstractC6800s4.m24605d(c8342Tu0, pf02.f8947g.m361d(C8340Tt0.m7798e("DefaultImpls")), c10417nd0);
                }
            }
            if (bool.booleanValue() && (abstractC7598Fm0 instanceof QF0)) {
                C10673pd0 c10673pd0 = w21 instanceof C10673pd0 ? (C10673pd0) w21 : null;
                C9137dd0 c9137dd0 = c10673pd0 != null ? c10673pd0.f40246b : null;
                if (c9137dd0 != null) {
                    String strM17718e = c9137dd0.m17718e();
                    O90.m5967e(strM17718e, "getInternalName(...)");
                    return AbstractC6800s4.m24605d(c8342Tu0, C0055As.m358j(new C0664KX(D51.m1553l(strM17718e, '/', '.'))), c10417nd0);
                }
            }
        }
        if (z2 && (abstractC7598Fm0 instanceof PF0)) {
            PF0 pf03 = (PF0) abstractC7598Fm0;
            if (pf03.f8948h == SE0.COMPANION_OBJECT && (pf0 = pf03.f8946f) != null) {
                SE0 se02 = SE0.CLASS;
                SE0 se03 = pf0.f8948h;
                if (se03 == se02 || se03 == SE0.ENUM_CLASS || (z3 && (se03 == se0 || se03 == SE0.ANNOTATION_CLASS))) {
                    W21 w212 = (W21) pf0.f3416d;
                    C7534Eg0 c7534Eg0 = w212 instanceof C7534Eg0 ? (C7534Eg0) w212 : null;
                    if (c7534Eg0 != null) {
                        return c7534Eg0.f2836a;
                    }
                    return null;
                }
            }
        }
        if (!(abstractC7598Fm0 instanceof QF0) || !(w21 instanceof C10673pd0)) {
            return null;
        }
        O90.m5966d(w21, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C10673pd0 c10673pd02 = (C10673pd0) w21;
        C11667xP0 c11667xP0 = c10673pd02.f40247c;
        return c11667xP0 == null ? AbstractC6800s4.m24605d(c8342Tu0, c10673pd02.m23824a(), c10417nd0) : c11667xP0;
    }
}
