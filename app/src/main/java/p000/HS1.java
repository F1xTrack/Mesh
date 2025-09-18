package p000;

import android.view.View;

/* loaded from: classes.dex */
public abstract class HS1 {
    /* renamed from: a */
    public static int m3430a(View view) {
        O90.m5968f(view, "<this>");
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(visibility, "Unknown visibility "));
    }

    /* renamed from: b */
    public static void m3431b(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "radix ", " was not in valid range ");
            sbM26237n.append(new C9461g90(2, 36, 1));
            throw new IllegalArgumentException(sbM26237n.toString());
        }
    }

    /* renamed from: c */
    public static final boolean m3432c(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: d */
    public static boolean m3433d(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
