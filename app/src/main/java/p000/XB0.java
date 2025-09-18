package p000;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class XB0 {

    /* renamed from: a */
    public static final C10212m12 f13606a;

    /* renamed from: b */
    public static final XB0 f13607b;

    /* renamed from: c */
    public static final XB0 f13608c;

    /* renamed from: d */
    public static final XB0 f13609d;

    /* renamed from: e */
    public static final XB0 f13610e;

    /* renamed from: f */
    public static final /* synthetic */ XB0[] f13611f;

    static {
        XB0 xb0 = new XB0("NONE", 0);
        f13607b = xb0;
        XB0 xb02 = new XB0("BOX_NONE", 1);
        f13608c = xb02;
        XB0 xb03 = new XB0("BOX_ONLY", 2);
        f13609d = xb03;
        XB0 xb04 = new XB0("AUTO", 3);
        f13610e = xb04;
        XB0[] xb0Arr = {xb0, xb02, xb03, xb04};
        f13611f = xb0Arr;
        F02.m2482c(xb0Arr);
        f13606a = new C10212m12(18);
    }

    /* renamed from: a */
    public static final boolean m8949a(XB0 xb0) {
        f13606a.getClass();
        O90.m5968f(xb0, "pointerEvents");
        return xb0 == f13610e || xb0 == f13609d;
    }

    /* renamed from: b */
    public static final boolean m8950b(XB0 xb0) {
        f13606a.getClass();
        O90.m5968f(xb0, "pointerEvents");
        return xb0 == f13610e || xb0 == f13608c;
    }

    /* renamed from: c */
    public static final XB0 m8951c(String str) {
        f13606a.getClass();
        if (str == null) {
            return f13610e;
        }
        Locale locale = Locale.US;
        O90.m5967e(locale, "US");
        String upperCase = str.toUpperCase(locale);
        O90.m5967e(upperCase, "toUpperCase(...)");
        return valueOf(D51.m1554m(upperCase, "-", "_"));
    }

    public static XB0 valueOf(String str) {
        return (XB0) Enum.valueOf(XB0.class, str);
    }

    public static XB0[] values() {
        return (XB0[]) f13611f.clone();
    }
}
