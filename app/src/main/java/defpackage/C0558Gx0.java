package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: Gx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558Gx0 {
    public static final C0558Gx0 a = new C0558Gx0();

    public final OnBackInvokedCallback a(InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC5908mZ, "onBackInvoked");
        return new C8299z6(1, interfaceC5908mZ);
    }

    public final void b(Object obj, int i, Object obj2) {
        O90.f(obj, "dispatcher");
        O90.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        O90.f(obj, "dispatcher");
        O90.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
