package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class HS1 {
    public static int a(View view) {
        O90.f(view, "<this>");
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
        throw new IllegalArgumentException(AbstractC7209tN0.u(visibility, "Unknown visibility "));
    }

    public static void b(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbN = AbstractC8235ym.n(i, "radix ", " was not in valid range ");
            sbN.append(new C3909g90(2, 36, 1));
            throw new IllegalArgumentException(sbN.toString());
        }
    }

    public static final boolean c(char c, char c2, boolean z) {
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

    public static boolean d(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
