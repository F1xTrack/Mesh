package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.views.view.a;

/* renamed from: xu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8070xu0 extends R00 {
    public static final C7308tu0 P = new C7308tu0(0);
    public boolean M;
    public boolean N;
    public InterfaceC7690vu0 O;

    @Override // defpackage.R00
    public final boolean D(R00 r00) {
        O90.f(r00, "handler");
        return !this.N;
    }

    @Override // defpackage.R00
    public final boolean E(R00 r00) {
        O90.f(r00, "handler");
        Boolean boolF = this.O.f(r00);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        if (super.E(r00)) {
            return true;
        }
        if ((r00 instanceof C8070xu0) && r00.f == 4 && ((C8070xu0) r00).N) {
            return false;
        }
        boolean z = this.N;
        int i = r00.f;
        int i2 = this.f;
        return !(i2 == 4 && i == 4 && !z) && i2 == 4 && !z && (!this.O.a() || r00.d > 0);
    }

    @Override // defpackage.R00
    public final void t() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        this.O.g(this.e, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // defpackage.R00
    public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        View view = this.e;
        O90.c(view);
        Context context = view.getContext();
        O90.e(context, "getContext(...)");
        Object systemService = context.getSystemService("accessibility");
        O90.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        boolean zIsTouchExplorationEnabled = ((AccessibilityManager) systemService).isTouchExplorationEnabled();
        if ((view instanceof DH0) && zIsTouchExplorationEnabled) {
            return;
        }
        if (motionEvent.getActionMasked() == 1) {
            if (this.f != 0 || this.O.b(motionEvent)) {
                this.O.g(view, motionEvent);
                int i = this.f;
                if ((i == 0 || i == 2) && this.O.d(view)) {
                    a(false);
                }
                if (this.f == 0) {
                    e();
                } else {
                    k();
                }
            } else {
                e();
            }
            this.O.h(motionEvent);
            return;
        }
        int i2 = this.f;
        if (i2 != 0 && i2 != 2) {
            if (i2 == 4) {
                this.O.g(view, motionEvent);
                return;
            }
            return;
        }
        if (this.M) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
            }
            this.O.g(view, motionEvent);
            a(false);
            return;
        }
        if ((view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent)) {
            this.O.g(view, motionEvent);
            a(false);
        } else if (this.O.c()) {
            this.O.e(motionEvent);
        } else {
            if (this.f == 2 || !this.O.b(motionEvent)) {
                return;
            }
            d();
        }
    }

    @Override // defpackage.R00
    public final void w() {
        KeyEvent.Callback callback = this.e;
        if (callback instanceof InterfaceC7690vu0) {
            this.O = (InterfaceC7690vu0) callback;
            return;
        }
        if (callback instanceof C3370dK0) {
            this.O = new C7499uu0(this, (C3370dK0) callback);
            return;
        }
        if (callback instanceof PM0) {
            this.O = new C7880wu0(this, (PM0) callback);
            return;
        }
        if (callback instanceof ViewGroupOnHierarchyChangeListenerC6634qM0) {
            this.O = new C7308tu0(2);
            return;
        }
        if (callback instanceof BK0) {
            this.O = new C7308tu0(2);
        } else if (callback instanceof C3379dN0) {
            this.O = new C7308tu0(3);
        } else if (callback instanceof a) {
            this.O = new C7308tu0(1);
        }
    }

    @Override // defpackage.R00
    public final void x() {
        this.O = P;
    }

    @Override // defpackage.R00
    public final void z() {
        super.z();
        this.M = false;
        this.N = false;
    }
}
