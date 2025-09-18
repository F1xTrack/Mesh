package defpackage;

import android.view.View;
import java.util.Objects;
import ru.mes.dnevnik.R;

/* renamed from: kk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5561kk1 {
    public static void a(View view, InterfaceC6516pk1 interfaceC6516pk1) {
        L01 l01 = (L01) view.getTag(R.id.tag_unhandled_key_listeners);
        if (l01 == null) {
            l01 = new L01();
            view.setTag(R.id.tag_unhandled_key_listeners, l01);
        }
        Objects.requireNonNull(interfaceC6516pk1);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC5370jk1 = new ViewOnUnhandledKeyEventListenerC5370jk1();
        l01.put(interfaceC6516pk1, viewOnUnhandledKeyEventListenerC5370jk1);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC5370jk1);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, InterfaceC6516pk1 interfaceC6516pk1) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        L01 l01 = (L01) view.getTag(R.id.tag_unhandled_key_listeners);
        if (l01 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) l01.getOrDefault(interfaceC6516pk1, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC2175af abstractC2175af) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
