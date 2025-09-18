package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: Za1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8615Za1 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m9549a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m9550b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C7243z6(2, runnable);
    }

    /* renamed from: c */
    public static void m9551c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    public static void m9552d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
