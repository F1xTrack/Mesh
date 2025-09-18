package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: kP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5496kP {
    public static final C5496kP a = new C5496kP();
    public static final C2127aP b = C2127aP.a;
    public static final WO c;
    public static final C4147hP d;
    public static final C4147hP e;
    public static final Set f;

    static {
        XO[] xoArr = XO.a;
        c = new WO(C1559Tt0.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        d = c(EnumC5305jP.h, new String[0]);
        e = c(EnumC5305jP.u, new String[0]);
        f = AbstractC7627vZ0.e(new C2318bP());
    }

    public static final C3574eP a(EnumC3765fP enumC3765fP, boolean z, String... strArr) {
        O90.f(strArr, "formatParams");
        if (!z) {
            return new C3574eP(enumC3765fP, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        O90.f(strArr2, "formatParams");
        return new C3609ea1(enumC3765fP, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final C3574eP b(EnumC3765fP enumC3765fP, String... strArr) {
        return a(enumC3765fP, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C4147hP c(EnumC5305jP enumC5305jP, String... strArr) {
        O90.f(enumC5305jP, "kind");
        MN mn = MN.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        O90.f(strArr2, "formatParams");
        return e(enumC5305jP, mn, d(enumC5305jP, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static C4338iP d(EnumC5305jP enumC5305jP, String... strArr) {
        O90.f(enumC5305jP, "kind");
        O90.f(strArr, "formatParams");
        return new C4338iP(enumC5305jP, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static C4147hP e(EnumC5305jP enumC5305jP, List list, InterfaceC1200Pd1 interfaceC1200Pd1, String... strArr) {
        O90.f(enumC5305jP, "kind");
        O90.f(strArr, "formatParams");
        return new C4147hP(interfaceC1200Pd1, b(EnumC3765fP.e, interfaceC1200Pd1.toString()), enumC5305jP, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(CD cd) {
        return cd != null && ((cd instanceof WO) || (cd.i() instanceof WO) || cd == b);
    }
}
