package p000;

import android.window.OnBackInvokedCallback;

/* renamed from: Ix0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7776Ix0 {

    /* renamed from: a */
    public static final C7776Ix0 f5230a = new C7776Ix0();

    /* renamed from: a */
    public final OnBackInvokedCallback m4087a(InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2, InterfaceC6434mZ interfaceC6434mZ, InterfaceC6434mZ interfaceC6434mZ2) {
        O90.m5968f(interfaceC6497nZ, "onBackStarted");
        O90.m5968f(interfaceC6497nZ2, "onBackProgressed");
        O90.m5968f(interfaceC6434mZ, "onBackInvoked");
        O90.m5968f(interfaceC6434mZ2, "onBackCancelled");
        return new C7724Hx0(interfaceC6497nZ, interfaceC6497nZ2, interfaceC6434mZ, interfaceC6434mZ2);
    }
}
