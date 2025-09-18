package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: Hx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636Hx0 implements OnBackAnimationCallback {
    public final /* synthetic */ InterfaceC6099nZ a;
    public final /* synthetic */ InterfaceC6099nZ b;
    public final /* synthetic */ InterfaceC5908mZ c;
    public final /* synthetic */ InterfaceC5908mZ d;

    public C0636Hx0(InterfaceC6099nZ interfaceC6099nZ, InterfaceC6099nZ interfaceC6099nZ2, InterfaceC5908mZ interfaceC5908mZ, InterfaceC5908mZ interfaceC5908mZ2) {
        this.a = interfaceC6099nZ;
        this.b = interfaceC6099nZ2;
        this.c = interfaceC5908mZ;
        this.d = interfaceC5908mZ2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        O90.f(backEvent, "backEvent");
        this.b.invoke(new C7262tf(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        O90.f(backEvent, "backEvent");
        this.a.invoke(new C7262tf(backEvent));
    }
}
