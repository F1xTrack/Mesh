package p000;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.views.view.C1932a;

/* renamed from: xu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11729xu0 extends R00 {

    /* renamed from: P */
    public static final C11219tu0 f45879P = new C11219tu0(0);

    /* renamed from: M */
    public boolean f45880M;

    /* renamed from: N */
    public boolean f45881N;

    /* renamed from: O */
    public InterfaceC11475vu0 f45882O;

    @Override // p000.R00
    /* renamed from: D */
    public final boolean mo5530D(R00 r00) {
        O90.m5968f(r00, "handler");
        return !this.f45881N;
    }

    @Override // p000.R00
    /* renamed from: E */
    public final boolean mo5531E(R00 r00) {
        O90.m5968f(r00, "handler");
        Boolean boolMo1614f = this.f45882O.mo1614f(r00);
        if (boolMo1614f != null) {
            return boolMo1614f.booleanValue();
        }
        if (super.mo5531E(r00)) {
            return true;
        }
        if ((r00 instanceof C11729xu0) && r00.f9905f == 4 && ((C11729xu0) r00).f45881N) {
            return false;
        }
        boolean z = this.f45881N;
        int i = r00.f9905f;
        int i2 = this.f9905f;
        return !(i2 == 4 && i == 4 && !z) && i2 == 4 && !z && (!this.f45882O.mo1609a() || r00.f9903d > 0);
    }

    @Override // p000.R00
    /* renamed from: t */
    public final void mo5614t() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        this.f45882O.mo1615g(this.f9904e, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // p000.R00
    /* renamed from: u */
    public final void mo722u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        View view = this.f9904e;
        O90.m5965c(view);
        Context context = view.getContext();
        O90.m5967e(context, "getContext(...)");
        Object systemService = context.getSystemService("accessibility");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        boolean zIsTouchExplorationEnabled = ((AccessibilityManager) systemService).isTouchExplorationEnabled();
        if ((view instanceof DH0) && zIsTouchExplorationEnabled) {
            return;
        }
        if (motionEvent.getActionMasked() == 1) {
            if (this.f9905f != 0 || this.f45882O.mo1610b(motionEvent)) {
                this.f45882O.mo1615g(view, motionEvent);
                int i = this.f9905f;
                if ((i == 0 || i == 2) && this.f45882O.mo1612d(view)) {
                    mo721a(false);
                }
                if (this.f9905f == 0) {
                    m6857e();
                } else {
                    m6862k();
                }
            } else {
                m6857e();
            }
            this.f45882O.mo1616h(motionEvent);
            return;
        }
        int i2 = this.f9905f;
        if (i2 != 0 && i2 != 2) {
            if (i2 == 4) {
                this.f45882O.mo1615g(view, motionEvent);
                return;
            }
            return;
        }
        if (this.f45880M) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
            }
            this.f45882O.mo1615g(view, motionEvent);
            mo721a(false);
            return;
        }
        if ((view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent)) {
            this.f45882O.mo1615g(view, motionEvent);
            mo721a(false);
        } else if (this.f45882O.mo1611c()) {
            this.f45882O.mo1613e(motionEvent);
        } else {
            if (this.f9905f == 2 || !this.f45882O.mo1610b(motionEvent)) {
                return;
            }
            m6856d();
        }
    }

    @Override // p000.R00
    /* renamed from: w */
    public final void mo6870w() {
        KeyEvent.Callback callback = this.f9904e;
        if (callback instanceof InterfaceC11475vu0) {
            this.f45882O = (InterfaceC11475vu0) callback;
            return;
        }
        if (callback instanceof C9099dK0) {
            this.f45882O = new C11347uu0(this, (C9099dK0) callback);
            return;
        }
        if (callback instanceof PM0) {
            this.f45882O = new C11602wu0(this, (PM0) callback);
            return;
        }
        if (callback instanceof ViewGroupOnHierarchyChangeListenerC10767qM0) {
            this.f45882O = new C11219tu0(2);
            return;
        }
        if (callback instanceof BK0) {
            this.f45882O = new C11219tu0(2);
        } else if (callback instanceof C9105dN0) {
            this.f45882O = new C11219tu0(3);
        } else if (callback instanceof C1932a) {
            this.f45882O = new C11219tu0(1);
        }
    }

    @Override // p000.R00
    /* renamed from: x */
    public final void mo723x() {
        this.f45882O = f45879P;
    }

    @Override // p000.R00
    /* renamed from: z */
    public final void mo6872z() {
        super.mo6872z();
        this.f45880M = false;
        this.f45881N = false;
    }
}
