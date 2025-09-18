package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PH0 extends a {
    public boolean a;
    public OH0 b;

    @Override // com.facebook.react.views.view.a, android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        if (this.a) {
            OH0 oh0 = this.b;
            O90.c(oh0);
            if (oh0.a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        O90.f(motionEvent, "ev");
        if (this.a) {
            OH0 oh0 = this.b;
            O90.c(oh0);
            if (oh0.a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void l(DH0 dh0) {
        T00 t00;
        ArrayList<R00> arrayListF;
        OH0 oh0 = this.b;
        if (oh0 == null || (t00 = oh0.b) == null || (arrayListF = t00.b.f(dh0)) == null) {
            return;
        }
        for (R00 r00 : arrayListF) {
            if (r00 instanceof C8070xu0) {
                t00.e(r00, dh0);
                C3881g1 c3881g1 = new C3881g1(22, (C8070xu0) r00);
                r00.getClass();
                r00.i = true;
                c3881g1.invoke();
                r00.i = false;
            }
        }
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        UiThreadUtil.assertOnUiThread();
        ViewParent parent = getParent();
        while (true) {
            z = false;
            if (parent == null) {
                break;
            }
            if (parent instanceof PH0) {
                z = true;
                break;
            } else if (parent instanceof InterfaceC7418uT0) {
                break;
            } else {
                parent = parent.getParent();
            }
        }
        this.a = !z;
        if (z || this.b != null) {
            return;
        }
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        this.b = new OH0((ReactContext) context, this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        NH0 nh0;
        if (this.a) {
            OH0 oh0 = this.b;
            O90.c(oh0);
            if (oh0.b != null && !oh0.f && (nh0 = oh0.c) != null && nh0.f == 2) {
                nh0.a(false);
                nh0.k();
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
