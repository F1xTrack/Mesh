package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ru.mes.dnevnik.R;

/* renamed from: Dn1 */
/* loaded from: classes.dex */
public final class C7497Dn1 extends AbstractC7653Gn1 {

    /* renamed from: e */
    public static final PathInterpolator f2252e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final C0092BS f2253f = new C0092BS(0);

    /* renamed from: g */
    public static final DecelerateInterpolator f2254g = new DecelerateInterpolator();

    /* renamed from: e */
    public static void m1892e(View view, C7705Hn1 c7705Hn1) {
        AbstractC7341An1 abstractC7341An1M1897j = m1897j(view);
        if (abstractC7341An1M1897j != null) {
            abstractC7341An1M1897j.onEnd(c7705Hn1);
            if (abstractC7341An1M1897j.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1892e(viewGroup.getChildAt(i), c7705Hn1);
            }
        }
    }

    /* renamed from: f */
    public static void m1893f(View view, C7705Hn1 c7705Hn1, WindowInsets windowInsets, boolean z) {
        AbstractC7341An1 abstractC7341An1M1897j = m1897j(view);
        if (abstractC7341An1M1897j != null) {
            abstractC7341An1M1897j.mDispachedInsets = windowInsets;
            if (!z) {
                abstractC7341An1M1897j.onPrepare(c7705Hn1);
                z = abstractC7341An1M1897j.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1893f(viewGroup.getChildAt(i), c7705Hn1, windowInsets, z);
            }
        }
    }

    /* renamed from: g */
    public static void m1894g(View view, C8433Vn1 c8433Vn1, List list) {
        AbstractC7341An1 abstractC7341An1M1897j = m1897j(view);
        if (abstractC7341An1M1897j != null) {
            c8433Vn1 = abstractC7341An1M1897j.onProgress(c8433Vn1, list);
            if (abstractC7341An1M1897j.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1894g(viewGroup.getChildAt(i), c8433Vn1, list);
            }
        }
    }

    /* renamed from: h */
    public static void m1895h(View view, C7705Hn1 c7705Hn1, C11970zn1 c11970zn1) {
        AbstractC7341An1 abstractC7341An1M1897j = m1897j(view);
        if (abstractC7341An1M1897j != null) {
            abstractC7341An1M1897j.onStart(c7705Hn1, c11970zn1);
            if (abstractC7341An1M1897j.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1895h(viewGroup.getChildAt(i), c7705Hn1, c11970zn1);
            }
        }
    }

    /* renamed from: i */
    public static WindowInsets m1896i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: j */
    public static AbstractC7341An1 m1897j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC7445Cn1) {
            return ((ViewOnApplyWindowInsetsListenerC7445Cn1) tag).f1657a;
        }
        return null;
    }
}
