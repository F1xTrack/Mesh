package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: hk1 */
/* loaded from: classes.dex */
public abstract class AbstractC4212hk1 {
    public static C1698Vn1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1698Vn1 c1698Vn1H = C1698Vn1.h(null, rootWindowInsets);
        C1464Sn1 c1464Sn1 = c1698Vn1H.a;
        c1464Sn1.q(c1698Vn1H);
        c1464Sn1.d(view.getRootView());
        return c1698Vn1H;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
