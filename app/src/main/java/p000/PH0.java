package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.C1932a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PH0 extends C1932a {

    /* renamed from: a */
    public boolean f8980a;

    /* renamed from: b */
    public OH0 f8981b;

    @Override // com.facebook.react.views.view.C1932a, android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        if (this.f8980a) {
            OH0 oh0 = this.f8981b;
            O90.m5965c(oh0);
            if (oh0.m6005a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "ev");
        if (this.f8980a) {
            OH0 oh0 = this.f8981b;
            O90.m5965c(oh0);
            if (oh0.m6005a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: l */
    public final void m6285l(DH0 dh0) {
        T00 t00;
        ArrayList<R00> arrayListM5293f;
        OH0 oh0 = this.f8981b;
        if (oh0 == null || (t00 = oh0.f8338b) == null || (arrayListM5293f = t00.f11093b.m5293f(dh0)) == null) {
            return;
        }
        for (R00 r00 : arrayListM5293f) {
            if (r00 instanceof C11729xu0) {
                t00.m7511e(r00, dh0);
                C4090g1 c4090g1 = new C4090g1(22, (C11729xu0) r00);
                r00.getClass();
                r00.f9908i = true;
                c4090g1.invoke();
                r00.f9908i = false;
            }
        }
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
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
            } else if (parent instanceof InterfaceC11293uT0) {
                break;
            } else {
                parent = parent.getParent();
            }
        }
        this.f8980a = !z;
        if (z || this.f8981b != null) {
            return;
        }
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        this.f8981b = new OH0((ReactContext) context, this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        NH0 nh0;
        if (this.f8980a) {
            OH0 oh0 = this.f8981b;
            O90.m5965c(oh0);
            if (oh0.f8338b != null && !oh0.f8342f && (nh0 = oh0.f8339c) != null && nh0.f9905f == 2) {
                nh0.mo721a(false);
                nh0.m6862k();
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
