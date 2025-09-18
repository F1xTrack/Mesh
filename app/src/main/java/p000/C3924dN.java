package p000;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.views.view.C1932a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: dN */
/* loaded from: classes2.dex */
public final class C3924dN extends C1932a {

    /* renamed from: a */
    public final S91 f25984a;

    /* renamed from: b */
    public boolean f25985b;

    /* renamed from: c */
    public boolean f25986c;

    /* renamed from: d */
    public boolean f25987d;

    /* renamed from: e */
    public boolean f25988e;

    /* renamed from: f */
    public boolean f25989f;

    /* renamed from: g */
    public C1932a f25990g;

    /* renamed from: h */
    public boolean f25991h;

    /* renamed from: i */
    public C8364Uf0 f25992i;

    /* renamed from: j */
    public final C8416Vf0 f25993j;

    /* renamed from: k */
    public final C9807is0 f25994k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3924dN(S91 s91) {
        super(s91);
        O90.m5968f(s91, "reactContext");
        this.f25984a = s91;
        boolean z = this.f25986c;
        C8416Vf0 c8416Vf0 = new C8416Vf0();
        c8416Vf0.f12684a = z;
        this.f25993j = c8416Vf0;
        this.f25994k = new C9807is0(this, s91, c8416Vf0, new C1648aB(0, this, C3924dN.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0, 3));
        AbstractC10977s02.f42200a = new WeakReference(this);
    }

    public final C8364Uf0 getKeyboardCallback() {
        return this.f25992i;
    }

    public final boolean getActive() {
        return this.f25989f;
    }

    /* renamed from: m */
    public final void m17552m() {
        S91 s91 = this.f25984a;
        if (s91.f10602a.getCurrentActivity() != null) {
            this.f25990g = new C1932a(getContext());
            ViewGroup viewGroupM25184b = AbstractC11284uO1.m25184b(s91);
            if (viewGroupM25184b != null) {
                viewGroupM25184b.addView(this.f25990g);
            }
            C8364Uf0 c8364Uf0 = new C8364Uf0(this, this, s91, this.f25993j);
            this.f25992i = c8364Uf0;
            C1932a c1932a = this.f25990g;
            if (c1932a != null) {
                AbstractC10944rk1.m24484p(c1932a, c8364Uf0);
                AbstractC9536gk1.m18626u(c1932a, this.f25992i);
                if (c1932a.isAttachedToWindow()) {
                    c1932a.requestApplyInsets();
                } else {
                    c1932a.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7491Dk1(0));
                }
            }
        } else {
            int i = AbstractC3986eN.f26680a;
        }
        C9807is0 c9807is0 = this.f25994k;
        InterfaceC6947uP interfaceC6947uP = c9807is0.f34789f;
        if (interfaceC6947uP != null) {
            interfaceC6947uP.mo11049j(c9807is0);
        }
    }

    /* renamed from: n */
    public final void m17553n() {
        C8364Uf0 c8364Uf0 = this.f25992i;
        if (c8364Uf0 != null) {
            c8364Uf0.f11957b.getViewTreeObserver().removeOnGlobalFocusChangeListener(c8364Uf0.f11969n);
            C0851NW c0851nw = c8364Uf0.f11970o;
            if (c0851nw != null) {
                c0851nw.f7843a.getViewTreeObserver().removeOnGlobalFocusChangeListener(c0851nw.f7854l);
            }
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0204DE(12, this.f25990g));
        C9807is0 c9807is0 = this.f25994k;
        InterfaceC6947uP interfaceC6947uP = c9807is0.f34789f;
        if (interfaceC6947uP != null) {
            interfaceC6947uP.mo11040a(c9807is0);
        }
    }

    /* renamed from: o */
    public final void m17554o() {
        Window window;
        View decorView;
        S91 s91 = this.f25984a;
        O90.m5968f(s91, "<this>");
        Activity currentActivity = s91.getCurrentActivity();
        View rootView = (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        if (rootView != null) {
            C1843cN c1843cN = new C1843cN(0, this);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18626u(rootView, c1843cN);
        }
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25991h) {
            m17552m();
        } else {
            this.f25991h = true;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m17554o();
        if (isAttachedToWindow()) {
            requestApplyInsets();
        } else {
            addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7491Dk1(0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m17553n();
    }

    public final void setActive(boolean z) {
        this.f25989f = z;
        if (z) {
            m17554o();
            m17552m();
        } else {
            m17554o();
            m17553n();
        }
    }

    public final void setNavigationBarTranslucent(boolean z) {
        this.f25986c = z;
        this.f25993j.f12684a = z;
    }

    public final void setPreserveEdgeToEdge(boolean z) {
        this.f25987d = z;
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.f25985b = z;
    }
}
