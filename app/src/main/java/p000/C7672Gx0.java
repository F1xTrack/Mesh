package p000;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: Gx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7672Gx0 {

    /* renamed from: a */
    public static final C7672Gx0 f3971a = new C7672Gx0();

    /* renamed from: a */
    public final OnBackInvokedCallback m3201a(InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(interfaceC6434mZ, "onBackInvoked");
        return new C7243z6(1, interfaceC6434mZ);
    }

    /* renamed from: b */
    public final void m3202b(Object obj, int i, Object obj2) {
        O90.m5968f(obj, "dispatcher");
        O90.m5968f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: c */
    public final void m3203c(Object obj, Object obj2) {
        O90.m5968f(obj, "dispatcher");
        O90.m5968f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
