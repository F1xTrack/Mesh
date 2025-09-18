package p000;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;

/* renamed from: Yn1 */
/* loaded from: classes.dex */
public final class WindowInsetsAnimationControlListenerC8589Yn1 implements WindowInsetsAnimationControlListener {

    /* renamed from: a */
    public C10226m71 f14526a = null;

    /* renamed from: b */
    public final /* synthetic */ C8572Yf0 f14527b;

    public WindowInsetsAnimationControlListenerC8589Yn1(C8572Yf0 c8572Yf0) {
        this.f14527b = c8572Yf0;
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f14527b.f14413a.m10392k();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        C8572Yf0 c8572Yf0 = this.f14527b;
        C10226m71 c10226m71 = this.f14526a;
        c8572Yf0.getClass();
        O90.m5968f(c10226m71, "controller");
        c8572Yf0.f14413a.m10392k();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        C10226m71 c10226m71 = new C10226m71(windowInsetsAnimationController);
        this.f14526a = c10226m71;
        C8572Yf0 c8572Yf0 = this.f14527b;
        c8572Yf0.getClass();
        C1753aw c1753aw = c8572Yf0.f14413a;
        c1753aw.f16684d = null;
        c1753aw.f16682b = c10226m71;
        InterfaceC6497nZ interfaceC6497nZ = (InterfaceC6497nZ) c1753aw.f16685e;
        if (interfaceC6497nZ != null) {
            interfaceC6497nZ.invoke(c10226m71);
        }
        c1753aw.f16685e = null;
    }
}
