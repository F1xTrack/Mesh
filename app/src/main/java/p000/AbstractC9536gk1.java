package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import ru.mes.dnevnik.R;

/* renamed from: gk1 */
/* loaded from: classes.dex */
public abstract class AbstractC9536gk1 {
    /* renamed from: a */
    public static void m18606a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C8433Vn1 m18607b(View view, C8433Vn1 c8433Vn1, Rect rect) {
        WindowInsets windowInsetsM8557g = c8433Vn1.m8557g();
        if (windowInsetsM8557g != null) {
            return C8433Vn1.m8551h(view, view.computeSystemWindowInsets(windowInsetsM8557g, rect));
        }
        rect.setEmpty();
        return c8433Vn1;
    }

    /* renamed from: c */
    public static boolean m18608c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* renamed from: d */
    public static boolean m18609d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* renamed from: e */
    public static boolean m18610e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* renamed from: f */
    public static boolean m18611f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* renamed from: g */
    public static ColorStateList m18612g(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: h */
    public static PorterDuff.Mode m18613h(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: i */
    public static float m18614i(View view) {
        return view.getElevation();
    }

    /* renamed from: j */
    public static C8433Vn1 m18615j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!AbstractC7757In1.f5153d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC7757In1.f5150a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC7757In1.f5151b.get(obj);
            Rect rect2 = (Rect) AbstractC7757In1.f5152c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            AbstractC7965Mn1 c7913Ln1 = i >= 30 ? new C7913Ln1() : i >= 29 ? new C7861Kn1() : new C7809Jn1();
            c7913Ln1.mo4415e(J80.m4201b(rect.left, rect.top, rect.right, rect.bottom));
            c7913Ln1.mo4416g(J80.m4201b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C8433Vn1 c8433Vn1Mo4414b = c7913Ln1.mo4414b();
            c8433Vn1Mo4414b.f12756a.mo5843q(c8433Vn1Mo4414b);
            c8433Vn1Mo4414b.f12756a.mo5836d(view.getRootView());
            return c8433Vn1Mo4414b;
        } catch (IllegalAccessException e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: k */
    public static String m18616k(View view) {
        return view.getTransitionName();
    }

    /* renamed from: l */
    public static float m18617l(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: m */
    public static float m18618m(View view) {
        return view.getZ();
    }

    /* renamed from: n */
    public static boolean m18619n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: o */
    public static boolean m18620o(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: p */
    public static boolean m18621p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: q */
    public static void m18622q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: r */
    public static void m18623r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: s */
    public static void m18624s(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: t */
    public static void m18625t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* renamed from: u */
    public static void m18626u(View view, InterfaceC7516Dx0 interfaceC7516Dx0) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC7516Dx0);
        }
        if (interfaceC7516Dx0 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC9408fk1(view, interfaceC7516Dx0));
        }
    }

    /* renamed from: v */
    public static void m18627v(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: w */
    public static void m18628w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* renamed from: x */
    public static void m18629x(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: y */
    public static boolean m18630y(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* renamed from: z */
    public static void m18631z(View view) {
        view.stopNestedScroll();
    }
}
