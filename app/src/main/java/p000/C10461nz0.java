package p000;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.views.view.C1932a;

/* renamed from: nz0 */
/* loaded from: classes2.dex */
public final class C10461nz0 extends C1932a implements InterfaceC11293uT0 {

    /* renamed from: a */
    public final S91 f38655a;

    /* renamed from: b */
    public final C7730Ia0 f38656b;

    /* renamed from: c */
    public final C7470Da0 f38657c;

    /* renamed from: d */
    public InterfaceC6947uP f38658d;

    /* renamed from: e */
    public G41 f38659e;

    /* renamed from: f */
    public boolean f38660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10461nz0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "reactContext");
        this.f38655a = s91;
        this.f38656b = new C7730Ia0(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f38657c = new C7470Da0(this);
        }
    }

    @Override // p000.InterfaceC11293uT0
    /* renamed from: a */
    public final void mo6036a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "ev");
        if (this.f38658d != null) {
            this.f38656b.f5017c = false;
        }
        C7470Da0 c7470Da0 = this.f38657c;
        if (c7470Da0 != null) {
            c7470Da0.f1461e = -1;
        }
    }

    @Override // p000.InterfaceC11293uT0
    /* renamed from: b */
    public final void mo6037b(Throwable th) {
        this.f38655a.f10602a.handleException(new RuntimeException(th));
    }

    @Override // p000.InterfaceC11293uT0
    /* renamed from: c */
    public final void mo6038c(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "ev");
        InterfaceC6947uP interfaceC6947uP = this.f38658d;
        if (interfaceC6947uP != null) {
            this.f38656b.m3945c(motionEvent, interfaceC6947uP);
            C7470Da0 c7470Da0 = this.f38657c;
            if (c7470Da0 != null) {
                c7470Da0.m1242f(viewGroup, motionEvent, interfaceC6947uP);
            }
        }
    }

    public final InterfaceC6947uP getEventDispatcher$react_native_keyboard_controller_release() {
        return this.f38658d;
    }

    public final G41 getStateWrapper$react_native_keyboard_controller_release() {
        return this.f38659e;
    }

    /* renamed from: l */
    public final void m23292l(int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", AbstractC9700i12.m18931a(i));
        writableNativeMap.putDouble("screenHeight", AbstractC9700i12.m18931a(i2));
        G41 g41 = this.f38659e;
        if (g41 != null) {
            g41.updateState(writableNativeMap);
        }
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point pointM9753b = AbstractC8731aU1.m9753b(this.f38655a);
        m23292l(pointM9753b.x, pointM9753b.y);
        this.f38660f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m23292l(0, 0);
        this.f38660f = false;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C7470Da0 c7470Da0;
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f38658d;
        if (interfaceC6947uP != null && (c7470Da0 = this.f38657c) != null) {
            c7470Da0.m1727h(motionEvent, interfaceC6947uP, false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C7470Da0 c7470Da0;
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f38658d;
        if (interfaceC6947uP != null && (c7470Da0 = this.f38657c) != null) {
            c7470Da0.m1727h(motionEvent, interfaceC6947uP, true);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f38658d;
        if (interfaceC6947uP != null) {
            try {
                this.f38656b.m3944b(motionEvent, interfaceC6947uP);
                C7470Da0 c7470Da0 = this.f38657c;
                if (c7470Da0 != null) {
                    c7470Da0.m1727h(motionEvent, interfaceC6947uP, true);
                }
            } catch (RuntimeException unused) {
                int i = AbstractC10589oz0.f39421a;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m23292l(i, i2);
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        InterfaceC6947uP interfaceC6947uP = this.f38658d;
        if (interfaceC6947uP != null) {
            try {
                this.f38656b.m3944b(motionEvent, interfaceC6947uP);
                C7470Da0 c7470Da0 = this.f38657c;
                if (c7470Da0 != null) {
                    c7470Da0.m1727h(motionEvent, interfaceC6947uP, false);
                }
            } catch (RuntimeException unused) {
                int i = AbstractC10589oz0.f39421a;
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setAttached$react_native_keyboard_controller_release(boolean z) {
        this.f38660f = z;
    }

    public final void setEventDispatcher$react_native_keyboard_controller_release(InterfaceC6947uP interfaceC6947uP) {
        this.f38658d = interfaceC6947uP;
    }

    public final void setStateWrapper$react_native_keyboard_controller_release(G41 g41) {
        this.f38659e = g41;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }
}
