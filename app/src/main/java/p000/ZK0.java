package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.views.view.C1932a;

/* loaded from: classes.dex */
public final class ZK0 extends C1932a implements InterfaceC11293uT0 {

    /* renamed from: a */
    public G41 f14854a;

    /* renamed from: b */
    public boolean f14855b;

    /* renamed from: c */
    public int f14856c;

    /* renamed from: d */
    public int f14857d;

    /* renamed from: e */
    public final C7730Ia0 f14858e;

    /* renamed from: f */
    public final C7418Ca0 f14859f;

    /* renamed from: g */
    public InterfaceC6947uP f14860g;

    public ZK0(S91 s91) {
        super(s91);
        this.f14858e = new C7730Ia0(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f14859f = new C7418Ca0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S91 getReactContext() {
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return (S91) context;
    }

    @Override // p000.InterfaceC11293uT0
    /* renamed from: a */
    public final void mo6036a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "ev");
        if (this.f14860g != null) {
            this.f14858e.f5017c = false;
        }
        C7418Ca0 c7418Ca0 = this.f14859f;
        if (c7418Ca0 != null) {
            c7418Ca0.f1461e = -1;
        }
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        O90.m5968f(view, "child");
        O90.m5968f(layoutParams, "params");
        super.addView(view, i, layoutParams);
        if (this.f14855b) {
            m9523m();
        }
    }

    @Override // p000.InterfaceC11293uT0
    /* renamed from: b */
    public final void mo6037b(Throwable th) {
        getReactContext().f10602a.handleException(new RuntimeException(th));
    }

    @Override // p000.InterfaceC11293uT0
    /* renamed from: c */
    public final void mo6038c(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.m5968f(viewGroup, "childView");
        O90.m5968f(motionEvent, "ev");
        InterfaceC6947uP interfaceC6947uP = this.f14860g;
        if (interfaceC6947uP != null) {
            this.f14858e.m3945c(motionEvent, interfaceC6947uP);
            C7418Ca0 c7418Ca0 = this.f14859f;
            if (c7418Ca0 != null) {
                c7418Ca0.m1242f(viewGroup, motionEvent, interfaceC6947uP);
            }
        }
    }

    public final InterfaceC6947uP getEventDispatcher$ReactAndroid_release() {
        return this.f14860g;
    }

    public final G41 getStateWrapper$ReactAndroid_release() {
        return this.f14854a;
    }

    /* renamed from: m */
    public final void m9523m() {
        if (getChildCount() <= 0) {
            this.f14855b = true;
            return;
        }
        this.f14855b = false;
        int id = getChildAt(0).getId();
        if (this.f14854a != null) {
            m9524n(this.f14856c, this.f14857d);
        } else {
            S91 reactContext = getReactContext();
            reactContext.runOnNativeModulesQueueThread(new YK0(reactContext, this, id));
        }
    }

    /* renamed from: n */
    public final void m9524n(int i, int i2) {
        float fM25402a = AbstractC11406vL1.m25402a(i);
        float fM25402a2 = AbstractC11406vL1.m25402a(i2);
        G41 g41 = this.f14854a;
        ReadableNativeMap stateData = g41 != null ? g41.getStateData() : null;
        if (stateData != null) {
            float f = stateData.hasKey("screenHeight") ? (float) stateData.getDouble("screenHeight") : 0.0f;
            double d = 0.9f;
            if (Math.abs((stateData.hasKey("screenWidth") ? (float) stateData.getDouble("screenWidth") : 0.0f) - fM25402a) < d && Math.abs(f - fM25402a2) < d) {
                return;
            }
        }
        G41 g412 = this.f14854a;
        if (g412 != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", fM25402a);
            writableNativeMap.putDouble("screenHeight", fM25402a2);
            g412.updateState(writableNativeMap);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C7418Ca0 c7418Ca0;
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f14860g;
        if (interfaceC6947uP != null && (c7418Ca0 = this.f14859f) != null) {
            c7418Ca0.m1241d(motionEvent, interfaceC6947uP, false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C7418Ca0 c7418Ca0;
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f14860g;
        if (interfaceC6947uP != null && (c7418Ca0 = this.f14859f) != null) {
            c7418Ca0.m1241d(motionEvent, interfaceC6947uP, true);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f14860g;
        if (interfaceC6947uP != null) {
            this.f14858e.m3944b(motionEvent, interfaceC6947uP);
            C7418Ca0 c7418Ca0 = this.f14859f;
            if (c7418Ca0 != null) {
                c7418Ca0.m1241d(motionEvent, interfaceC6947uP, true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f14856c = i;
        this.f14857d = i2;
        m9523m();
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f14860g;
        if (interfaceC6947uP != null) {
            this.f14858e.m3944b(motionEvent, interfaceC6947uP);
            C7418Ca0 c7418Ca0 = this.f14859f;
            if (c7418Ca0 != null) {
                c7418Ca0.m1241d(motionEvent, interfaceC6947uP, false);
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setEventDispatcher$ReactAndroid_release(InterfaceC6947uP interfaceC6947uP) {
        this.f14860g = interfaceC6947uP;
    }

    public final void setStateWrapper$ReactAndroid_release(G41 g41) {
        this.f14854a = g41;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }
}
