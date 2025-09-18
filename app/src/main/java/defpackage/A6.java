package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class A6 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, H6 h6) {
        Objects.requireNonNull(h6);
        C8299z6 c8299z6 = new C8299z6(0, h6);
        K1.p(obj).registerOnBackInvokedCallback(1000000, c8299z6);
        return c8299z6;
    }

    public static void c(Object obj, Object obj2) {
        K1.p(obj).unregisterOnBackInvokedCallback(K1.m(obj2));
    }
}
