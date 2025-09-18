package defpackage;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.views.view.a;

/* renamed from: nz0 */
/* loaded from: classes2.dex */
public final class C6178nz0 extends a implements InterfaceC7418uT0 {
    public final S91 a;
    public final C0645Ia0 b;
    public final C0255Da0 c;
    public InterfaceC7405uP d;
    public G41 e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6178nz0(S91 s91) {
        super(s91);
        O90.f(s91, "reactContext");
        this.a = s91;
        this.b = new C0645Ia0(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.c = new C0255Da0(this);
        }
    }

    @Override // defpackage.InterfaceC7418uT0
    public final void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.f(motionEvent, "ev");
        if (this.d != null) {
            this.b.c = false;
        }
        C0255Da0 c0255Da0 = this.c;
        if (c0255Da0 != null) {
            c0255Da0.e = -1;
        }
    }

    @Override // defpackage.InterfaceC7418uT0
    public final void b(Throwable th) {
        this.a.a.handleException(new RuntimeException(th));
    }

    @Override // defpackage.InterfaceC7418uT0
    public final void c(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.f(motionEvent, "ev");
        InterfaceC7405uP interfaceC7405uP = this.d;
        if (interfaceC7405uP != null) {
            this.b.c(motionEvent, interfaceC7405uP);
            C0255Da0 c0255Da0 = this.c;
            if (c0255Da0 != null) {
                c0255Da0.f(viewGroup, motionEvent, interfaceC7405uP);
            }
        }
    }

    public final InterfaceC7405uP getEventDispatcher$react_native_keyboard_controller_release() {
        return this.d;
    }

    public final G41 getStateWrapper$react_native_keyboard_controller_release() {
        return this.e;
    }

    public final void l(int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", AbstractC4266i12.a(i));
        writableNativeMap.putDouble("screenHeight", AbstractC4266i12.a(i2));
        G41 g41 = this.e;
        if (g41 != null) {
            g41.updateState(writableNativeMap);
        }
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point pointB = AbstractC2144aU1.b(this.a);
        l(pointB.x, pointB.y);
        this.f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l(0, 0);
        this.f = false;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0255Da0 c0255Da0;
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.d;
        if (interfaceC7405uP != null && (c0255Da0 = this.c) != null) {
            c0255Da0.h(motionEvent, interfaceC7405uP, false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C0255Da0 c0255Da0;
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.d;
        if (interfaceC7405uP != null && (c0255Da0 = this.c) != null) {
            c0255Da0.h(motionEvent, interfaceC7405uP, true);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.d;
        if (interfaceC7405uP != null) {
            try {
                this.b.b(motionEvent, interfaceC7405uP);
                C0255Da0 c0255Da0 = this.c;
                if (c0255Da0 != null) {
                    c0255Da0.h(motionEvent, interfaceC7405uP, true);
                }
            } catch (RuntimeException unused) {
                int i = AbstractC6369oz0.a;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.a, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        l(i, i2);
    }

    @Override // com.facebook.react.views.view.a, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        InterfaceC7405uP interfaceC7405uP = this.d;
        if (interfaceC7405uP != null) {
            try {
                this.b.b(motionEvent, interfaceC7405uP);
                C0255Da0 c0255Da0 = this.c;
                if (c0255Da0 != null) {
                    c0255Da0.h(motionEvent, interfaceC7405uP, false);
                }
            } catch (RuntimeException unused) {
                int i = AbstractC6369oz0.a;
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setAttached$react_native_keyboard_controller_release(boolean z) {
        this.f = z;
    }

    public final void setEventDispatcher$react_native_keyboard_controller_release(InterfaceC7405uP interfaceC7405uP) {
        this.d = interfaceC7405uP;
    }

    public final void setStateWrapper$react_native_keyboard_controller_release(G41 g41) {
        this.e = g41;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }
}
