package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ru.mes.dnevnik.R;

/* renamed from: Dn1 */
/* loaded from: classes.dex */
public final class C0295Dn1 extends AbstractC0529Gn1 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final BS f = new BS(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view, C0607Hn1 c0607Hn1) {
        AbstractC0061An1 abstractC0061An1J = j(view);
        if (abstractC0061An1J != null) {
            abstractC0061An1J.onEnd(c0607Hn1);
            if (abstractC0061An1J.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), c0607Hn1);
            }
        }
    }

    public static void f(View view, C0607Hn1 c0607Hn1, WindowInsets windowInsets, boolean z) {
        AbstractC0061An1 abstractC0061An1J = j(view);
        if (abstractC0061An1J != null) {
            abstractC0061An1J.mDispachedInsets = windowInsets;
            if (!z) {
                abstractC0061An1J.onPrepare(c0607Hn1);
                z = abstractC0061An1J.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), c0607Hn1, windowInsets, z);
            }
        }
    }

    public static void g(View view, C1698Vn1 c1698Vn1, List list) {
        AbstractC0061An1 abstractC0061An1J = j(view);
        if (abstractC0061An1J != null) {
            c1698Vn1 = abstractC0061An1J.onProgress(c1698Vn1, list);
            if (abstractC0061An1J.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), c1698Vn1, list);
            }
        }
    }

    public static void h(View view, C0607Hn1 c0607Hn1, C8430zn1 c8430zn1) {
        AbstractC0061An1 abstractC0061An1J = j(view);
        if (abstractC0061An1J != null) {
            abstractC0061An1J.onStart(c0607Hn1, c8430zn1);
            if (abstractC0061An1J.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), c0607Hn1, c8430zn1);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC0061An1 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0217Cn1) {
            return ((ViewOnApplyWindowInsetsListenerC0217Cn1) tag).a;
        }
        return null;
    }
}
