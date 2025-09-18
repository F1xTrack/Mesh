package defpackage;

import android.window.OnBackInvokedCallback;

/* renamed from: Ix0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714Ix0 {
    public static final C0714Ix0 a = new C0714Ix0();

    public final OnBackInvokedCallback a(InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2, InterfaceC5908mZ interfaceC5908mZ, InterfaceC5908mZ interfaceC5908mZ2) {
        O90.f(interfaceC6099nZ, "onBackStarted");
        O90.f(interfaceC6099nZ2, "onBackProgressed");
        O90.f(interfaceC5908mZ, "onBackInvoked");
        O90.f(interfaceC5908mZ2, "onBackCancelled");
        return new C0636Hx0(interfaceC6099nZ, interfaceC6099nZ2, interfaceC5908mZ, interfaceC5908mZ2);
    }
}
