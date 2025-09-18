package p000;

import android.view.View;
import java.util.Objects;
import ru.mes.dnevnik.R;

/* renamed from: kk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10048kk1 {
    /* renamed from: a */
    public static void m22251a(View view, InterfaceC10688pk1 interfaceC10688pk1) {
        L01 l01 = (L01) view.getTag(R.id.tag_unhandled_key_listeners);
        if (l01 == null) {
            l01 = new L01();
            view.setTag(R.id.tag_unhandled_key_listeners, l01);
        }
        Objects.requireNonNull(interfaceC10688pk1);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC9920jk1 = new ViewOnUnhandledKeyEventListenerC9920jk1();
        l01.put(interfaceC10688pk1, viewOnUnhandledKeyEventListenerC9920jk1);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC9920jk1);
    }

    /* renamed from: b */
    public static CharSequence m22252b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: c */
    public static boolean m22253c(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: d */
    public static boolean m22254d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: e */
    public static void m22255e(View view, InterfaceC10688pk1 interfaceC10688pk1) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        L01 l01 = (L01) view.getTag(R.id.tag_unhandled_key_listeners);
        if (l01 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) l01.getOrDefault(interfaceC10688pk1, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* renamed from: f */
    public static <T> T m22256f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* renamed from: g */
    public static void m22257g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* renamed from: h */
    public static void m22258h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: i */
    public static void m22259i(View view, AbstractC1678af abstractC1678af) {
        view.setAutofillId(null);
    }

    /* renamed from: j */
    public static void m22260j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
