package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: Hx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7724Hx0 implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6497nZ f4614a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6497nZ f4615b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6434mZ f4616c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6434mZ f4617d;

    public C7724Hx0(InterfaceC6497nZ interfaceC6497nZ, InterfaceC6497nZ interfaceC6497nZ2, InterfaceC6434mZ interfaceC6434mZ, InterfaceC6434mZ interfaceC6434mZ2) {
        this.f4614a = interfaceC6497nZ;
        this.f4615b = interfaceC6497nZ2;
        this.f4616c = interfaceC6434mZ;
        this.f4617d = interfaceC6434mZ2;
    }

    public final void onBackCancelled() {
        this.f4617d.invoke();
    }

    public final void onBackInvoked() {
        this.f4616c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        O90.m5968f(backEvent, "backEvent");
        this.f4615b.invoke(new C6900tf(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        O90.m5968f(backEvent, "backEvent");
        this.f4614a.invoke(new C6900tf(backEvent));
    }
}
