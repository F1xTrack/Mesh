package defpackage;

/* loaded from: classes.dex */
public abstract class XT1 {
    public static C6045nH a(C6045nH c6045nH, InterfaceC0386Es interfaceC0386Es, C3957gP0 c3957gP0, int i) {
        if ((i & 2) != 0) {
            c3957gP0 = null;
        }
        O90.f(c6045nH, "<this>");
        return new C6045nH((C4375ib0) c6045nH.b, c3957gP0 != null ? new C2359bc1(c6045nH, interfaceC0386Es, c3957gP0, 0) : (InterfaceC6307oe1) c6045nH.c, LB.c(EnumC4205hi0.c, new C7726w5(c6045nH, 3, interfaceC0386Es)));
    }

    public static final C6045nH b(C6045nH c6045nH, I5 i5) {
        O90.f(c6045nH, "<this>");
        O90.f(i5, "additionalAnnotations");
        if (i5.isEmpty()) {
            return c6045nH;
        }
        return new C6045nH((C4375ib0) c6045nH.b, (InterfaceC6307oe1) c6045nH.c, LB.c(EnumC4205hi0.c, new C7726w5(c6045nH, 4, i5)));
    }
}
