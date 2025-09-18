package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class XB0 {
    public static final C5806m12 a;
    public static final XB0 b;
    public static final XB0 c;
    public static final XB0 d;
    public static final XB0 e;
    public static final /* synthetic */ XB0[] f;

    static {
        XB0 xb0 = new XB0("NONE", 0);
        b = xb0;
        XB0 xb02 = new XB0("BOX_NONE", 1);
        c = xb02;
        XB0 xb03 = new XB0("BOX_ONLY", 2);
        d = xb03;
        XB0 xb04 = new XB0("AUTO", 3);
        e = xb04;
        XB0[] xb0Arr = {xb0, xb02, xb03, xb04};
        f = xb0Arr;
        F02.c(xb0Arr);
        a = new C5806m12(18);
    }

    public static final boolean a(XB0 xb0) {
        a.getClass();
        O90.f(xb0, "pointerEvents");
        return xb0 == e || xb0 == d;
    }

    public static final boolean b(XB0 xb0) {
        a.getClass();
        O90.f(xb0, "pointerEvents");
        return xb0 == e || xb0 == c;
    }

    public static final XB0 c(String str) {
        a.getClass();
        if (str == null) {
            return e;
        }
        Locale locale = Locale.US;
        O90.e(locale, "US");
        String upperCase = str.toUpperCase(locale);
        O90.e(upperCase, "toUpperCase(...)");
        return valueOf(D51.m(upperCase, "-", "_"));
    }

    public static XB0 valueOf(String str) {
        return (XB0) Enum.valueOf(XB0.class, str);
    }

    public static XB0[] values() {
        return (XB0[]) f.clone();
    }
}
