package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.views.view.a;

/* loaded from: classes.dex */
public final class ZK0 extends a implements InterfaceC7418uT0 {
    public G41 a;
    public boolean b;
    public int c;
    public int d;
    public final C0645Ia0 e;
    public final C0177Ca0 f;
    public InterfaceC7405uP g;

    public ZK0(S91 s91) {
        super(s91);
        this.e = new C0645Ia0(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f = new C0177Ca0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S91 getReactContext() {
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return (S91) context;
    }

    @Override // defpackage.InterfaceC7418uT0
    public final void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.f(motionEvent, "ev");
        if (this.g != null) {
            this.e.c = false;
        }
        C0177Ca0 c0177Ca0 = this.f;
        if (c0177Ca0 != null) {
            c0177Ca0.e = -1;
        }
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        O90.f(view, "child");
        O90.f(layoutParams, "params");
        super.addView(view, i, layoutParams);
        if (this.b) {
            m();
        }
    }

    @Override // defpackage.InterfaceC7418uT0
    public final void b(Throwable th) {
        getReactContext().a.handleException(new RuntimeException(th));
    }

    @Override // defpackage.InterfaceC7418uT0
    public final void c(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.f(viewGroup, "childView");
        O90.f(motionEvent, "ev");
        InterfaceC7405uP interfaceC7405uP = this.g;
        if (interfaceC7405uP != null) {
            this.e.c(motionEvent, interfaceC7405uP);
            C0177Ca0 c0177Ca0 = this.f;
            if (c0177Ca0 != null) {
                c0177Ca0.f(viewGroup, motionEvent, interfaceC7405uP);
            }
        }
    }

    public final InterfaceC7405uP getEventDispatcher$ReactAndroid_release() {
        return this.g;
    }

    public final G41 getStateWrapper$ReactAndroid_release() {
        return this.a;
    }

    public final void m() {
        if (getChildCount() <= 0) {
            this.b = true;
            return;
        }
        this.b = false;
        int id = getChildAt(0).getId();
        if (this.a != null) {
            n(this.c, this.d);
        } else {
            S91 reactContext = getReactContext();
            reactContext.runOnNativeModulesQueueThread(new YK0(reactContext, this, id));
        }
    }

    public final void n(int i, int i2) {
        float fA = AbstractC7586vL1.a(i);
        float fA2 = AbstractC7586vL1.a(i2);
        G41 g41 = this.a;
        ReadableNativeMap stateData = g41 != null ? g41.getStateData() : null;
        if (stateData != null) {
            float f = stateData.hasKey("screenHeight") ? (float) stateData.getDouble("screenHeight") : 0.0f;
            double d = 0.9f;
            if (Math.abs((stateData.hasKey("screenWidth") ? (float) stateData.getDouble("screenWidth") : 0.0f) - fA) < d && Math.abs(f - fA2) < d) {
                return;
            }
        }
        G41 g412 = this.a;
        if (g412 != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", fA);
            writableNativeMap.putDouble("screenHeight", fA2);
            g412.updateState(writableNativeMap);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0177Ca0 c0177Ca0;
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.g;
        if (interfaceC7405uP != null && (c0177Ca0 = this.f) != null) {
            c0177Ca0.d(motionEvent, interfaceC7405uP, false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C0177Ca0 c0177Ca0;
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.g;
        if (interfaceC7405uP != null && (c0177Ca0 = this.f) != null) {
            c0177Ca0.d(motionEvent, interfaceC7405uP, true);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.g;
        if (interfaceC7405uP != null) {
            this.e.b(motionEvent, interfaceC7405uP);
            C0177Ca0 c0177Ca0 = this.f;
            if (c0177Ca0 != null) {
                c0177Ca0.d(motionEvent, interfaceC7405uP, true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.a, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = i;
        this.d = i2;
        m();
    }

    @Override // com.facebook.react.views.view.a, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.g;
        if (interfaceC7405uP != null) {
            this.e.b(motionEvent, interfaceC7405uP);
            C0177Ca0 c0177Ca0 = this.f;
            if (c0177Ca0 != null) {
                c0177Ca0.d(motionEvent, interfaceC7405uP, false);
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setEventDispatcher$ReactAndroid_release(InterfaceC7405uP interfaceC7405uP) {
        this.g = interfaceC7405uP;
    }

    public final void setStateWrapper$ReactAndroid_release(G41 g41) {
        this.a = g41;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }
}
