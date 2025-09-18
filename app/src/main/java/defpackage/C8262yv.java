package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: yv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8262yv {
    public static final C8262yv a = new C8262yv();

    public final OnBackInvokedDispatcher a(Activity activity) {
        O90.f(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        O90.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
