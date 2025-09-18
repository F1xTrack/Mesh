package p000;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: yv */
/* loaded from: classes.dex */
public final class C7231yv {

    /* renamed from: a */
    public static final C7231yv f46536a = new C7231yv();

    /* renamed from: a */
    public final OnBackInvokedDispatcher m26284a(Activity activity) {
        O90.m5968f(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        O90.m5967e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
