package defpackage;

/* loaded from: classes.dex */
public abstract class QL1 {
    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC5319jT1.f("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC5319jT1.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "negative size: "));
    }

    public static void b(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC5319jT1.f(str, Long.valueOf(j)));
        }
    }

    public static void c(int i, int i2) {
        String strF;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strF = AbstractC5319jT1.f("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "negative size: "));
                }
                strF = AbstractC5319jT1.f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void e(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a(i, i2, "index"));
        }
    }

    public static void f(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? a(i, i3, "start index") : (i2 < 0 || i2 > i3) ? a(i2, i3, "end index") : AbstractC5319jT1.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void g(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static C7977xP0 h(AbstractC0447Fm0 abstractC0447Fm0, boolean z, boolean z2, Boolean bool, boolean z3, C1562Tu0 c1562Tu0, C6112nd0 c6112nd0) {
        PF0 pf0;
        O90.f(abstractC0447Fm0, "container");
        O90.f(c6112nd0, "jvmMetadataVersion");
        SE0 se0 = SE0.INTERFACE;
        W21 w21 = (W21) abstractC0447Fm0.d;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC0447Fm0 + ')').toString());
            }
            if (abstractC0447Fm0 instanceof PF0) {
                PF0 pf02 = (PF0) abstractC0447Fm0;
                if (pf02.h == se0) {
                    return AbstractC6960s4.d(c1562Tu0, pf02.g.d(C1559Tt0.e("DefaultImpls")), c6112nd0);
                }
            }
            if (bool.booleanValue() && (abstractC0447Fm0 instanceof QF0)) {
                C6494pd0 c6494pd0 = w21 instanceof C6494pd0 ? (C6494pd0) w21 : null;
                C3427dd0 c3427dd0 = c6494pd0 != null ? c6494pd0.b : null;
                if (c3427dd0 != null) {
                    String strE = c3427dd0.e();
                    O90.e(strE, "getInternalName(...)");
                    return AbstractC6960s4.d(c1562Tu0, C0074As.j(new KX(D51.l(strE, '/', '.'))), c6112nd0);
                }
            }
        }
        if (z2 && (abstractC0447Fm0 instanceof PF0)) {
            PF0 pf03 = (PF0) abstractC0447Fm0;
            if (pf03.h == SE0.COMPANION_OBJECT && (pf0 = pf03.f) != null) {
                SE0 se02 = SE0.CLASS;
                SE0 se03 = pf0.h;
                if (se03 == se02 || se03 == SE0.ENUM_CLASS || (z3 && (se03 == se0 || se03 == SE0.ANNOTATION_CLASS))) {
                    W21 w212 = (W21) pf0.d;
                    C0351Eg0 c0351Eg0 = w212 instanceof C0351Eg0 ? (C0351Eg0) w212 : null;
                    if (c0351Eg0 != null) {
                        return c0351Eg0.a;
                    }
                    return null;
                }
            }
        }
        if (!(abstractC0447Fm0 instanceof QF0) || !(w21 instanceof C6494pd0)) {
            return null;
        }
        O90.d(w21, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C6494pd0 c6494pd02 = (C6494pd0) w21;
        C7977xP0 c7977xP0 = c6494pd02.c;
        return c7977xP0 == null ? AbstractC6960s4.d(c1562Tu0, c6494pd02.a(), c6112nd0) : c7977xP0;
    }
}
