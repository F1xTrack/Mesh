package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.views.view.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: dN */
/* loaded from: classes2.dex */
public final class C3378dN extends a {
    public final S91 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public a g;
    public boolean h;
    public C1595Uf0 i;
    public final C1673Vf0 j;
    public final C5203is0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3378dN(S91 s91) {
        super(s91);
        O90.f(s91, "reactContext");
        this.a = s91;
        boolean z = this.c;
        C1673Vf0 c1673Vf0 = new C1673Vf0();
        c1673Vf0.a = z;
        this.j = c1673Vf0;
        this.k = new C5203is0(this, s91, c1673Vf0, new C2085aB(0, this, C3378dN.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0, 3));
        AbstractC6947s02.a = new WeakReference(this);
    }

    public final C1595Uf0 getKeyboardCallback() {
        return this.i;
    }

    public final boolean getActive() {
        return this.f;
    }

    public final void m() {
        S91 s91 = this.a;
        if (s91.a.getCurrentActivity() != null) {
            this.g = new a(getContext());
            ViewGroup viewGroupB = AbstractC7404uO1.b(s91);
            if (viewGroupB != null) {
                viewGroupB.addView(this.g);
            }
            C1595Uf0 c1595Uf0 = new C1595Uf0(this, this, s91, this.j);
            this.i = c1595Uf0;
            a aVar = this.g;
            if (aVar != null) {
                AbstractC6897rk1.p(aVar, c1595Uf0);
                AbstractC4021gk1.u(aVar, this.i);
                if (aVar.isAttachedToWindow()) {
                    aVar.requestApplyInsets();
                } else {
                    aVar.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0286Dk1(0));
                }
            }
        } else {
            int i = AbstractC3568eN.a;
        }
        C5203is0 c5203is0 = this.k;
        InterfaceC7405uP interfaceC7405uP = c5203is0.f;
        if (interfaceC7405uP != null) {
            interfaceC7405uP.j(c5203is0);
        }
    }

    public final void n() {
        C1595Uf0 c1595Uf0 = this.i;
        if (c1595Uf0 != null) {
            c1595Uf0.b.getViewTreeObserver().removeOnGlobalFocusChangeListener(c1595Uf0.n);
            NW nw = c1595Uf0.o;
            if (nw != null) {
                nw.a.getViewTreeObserver().removeOnGlobalFocusChangeListener(nw.l);
            }
        }
        new Handler(Looper.getMainLooper()).post(new DE(12, this.g));
        C5203is0 c5203is0 = this.k;
        InterfaceC7405uP interfaceC7405uP = c5203is0.f;
        if (interfaceC7405uP != null) {
            interfaceC7405uP.a(c5203is0);
        }
    }

    public final void o() {
        Window window;
        View decorView;
        S91 s91 = this.a;
        O90.f(s91, "<this>");
        Activity currentActivity = s91.getCurrentActivity();
        View rootView = (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        if (rootView != null) {
            C2502cN c2502cN = new C2502cN(0, this);
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            AbstractC4021gk1.u(rootView, c2502cN);
        }
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h) {
            m();
        } else {
            this.h = true;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        o();
        if (isAttachedToWindow()) {
            requestApplyInsets();
        } else {
            addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0286Dk1(0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n();
    }

    public final void setActive(boolean z) {
        this.f = z;
        if (z) {
            o();
            m();
        } else {
            o();
            n();
        }
    }

    public final void setNavigationBarTranslucent(boolean z) {
        this.c = z;
        this.j.a = z;
    }

    public final void setPreserveEdgeToEdge(boolean z) {
        this.d = z;
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.b = z;
    }
}
