package p000;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: hk1 */
/* loaded from: classes.dex */
public abstract class AbstractC9664hk1 {
    /* renamed from: a */
    public static C8433Vn1 m18871a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(null, rootWindowInsets);
        C8277Sn1 c8277Sn1 = c8433Vn1M8551h.f12756a;
        c8277Sn1.mo5843q(c8433Vn1M8551h);
        c8277Sn1.mo5836d(view.getRootView());
        return c8433Vn1M8551h;
    }

    /* renamed from: b */
    public static int m18872b(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: c */
    public static void m18873c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* renamed from: d */
    public static void m18874d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
