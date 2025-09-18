package defpackage;

import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;

/* renamed from: Yn1 */
/* loaded from: classes.dex */
public final class WindowInsetsAnimationControlListenerC1932Yn1 implements WindowInsetsAnimationControlListener {
    public C5826m71 a = null;
    public final /* synthetic */ C1907Yf0 b;

    public WindowInsetsAnimationControlListenerC1932Yn1(C1907Yf0 c1907Yf0) {
        this.b = c1907Yf0;
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.b.a.k();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        C1907Yf0 c1907Yf0 = this.b;
        C5826m71 c5826m71 = this.a;
        c1907Yf0.getClass();
        O90.f(c5826m71, "controller");
        c1907Yf0.a.k();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        C5826m71 c5826m71 = new C5826m71(windowInsetsAnimationController);
        this.a = c5826m71;
        C1907Yf0 c1907Yf0 = this.b;
        c1907Yf0.getClass();
        C2226aw c2226aw = c1907Yf0.a;
        c2226aw.d = null;
        c2226aw.b = c5826m71;
        InterfaceC6099nZ interfaceC6099nZ = (InterfaceC6099nZ) c2226aw.e;
        if (interfaceC6099nZ != null) {
            interfaceC6099nZ.invoke(c5826m71);
        }
        c2226aw.e = null;
    }
}
