package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class N30 extends R00 {
    public Handler M;
    public DE N;
    public H51 O;

    public static Boolean K(View view, View view2, View view3) {
        if (O90.a(view3, view2)) {
            return Boolean.TRUE;
        }
        if (O90.a(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Boolean boolK = K(view, view2, OJ1.i(viewGroup, i));
            if (boolK != null) {
                return boolK;
            }
        }
        return null;
    }

    @Override // defpackage.R00
    public final boolean D(R00 r00) {
        O90.f(r00, "handler");
        if (!(r00 instanceof N30) || ((N30) r00).J(this)) {
            return super.D(r00);
        }
        View view = r00.e;
        O90.c(view);
        View view2 = this.e;
        O90.c(view2);
        View rootView = view.getRootView();
        O90.e(rootView, "getRootView(...)");
        Boolean boolK = K(view, view2, rootView);
        O90.c(boolK);
        return boolK.booleanValue();
    }

    @Override // defpackage.R00
    public final boolean E(R00 r00) {
        O90.f(r00, "handler");
        if (((r00 instanceof N30) && (J(r00) || ((N30) r00).J(this))) || (r00 instanceof NH0)) {
            return true;
        }
        return super.E(r00);
    }

    @Override // defpackage.R00
    public final boolean F(R00 r00) {
        O90.f(r00, "handler");
        if ((r00 instanceof N30) && !J(r00) && !((N30) r00).J(this)) {
            View view = this.e;
            O90.c(view);
            View view2 = r00.e;
            O90.c(view2);
            View rootView = view.getRootView();
            O90.e(rootView, "getRootView(...)");
            Boolean boolK = K(view, view2, rootView);
            if (boolK != null) {
                return boolK.booleanValue();
            }
        }
        return super.F(r00);
    }

    public final void I() {
        int i = this.f;
        if (i == 0) {
            e();
        } else if (i == 2) {
            m();
        } else {
            if (i != 4) {
                return;
            }
            k();
        }
    }

    public final boolean J(R00 r00) {
        View view = r00.e;
        while (view != null) {
            if (view.equals(this.e)) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    @Override // defpackage.R00
    public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        if (motionEvent.getAction() == 0) {
            Handler handler = this.M;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.M = null;
            return;
        }
        if (motionEvent.getAction() != 1 || this.i) {
            return;
        }
        I();
    }

    @Override // defpackage.R00
    public final void v(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        if (motionEvent.getAction() == 10) {
            if (this.M == null) {
                this.M = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.M;
            O90.c(handler);
            handler.postDelayed(this.N, 4L);
            return;
        }
        if (!this.i) {
            I();
            return;
        }
        if (this.f == 4 && motionEvent.getToolType(0) == 2) {
            this.O = AT1.b(motionEvent);
            return;
        }
        if (this.f == 0) {
            if (motionEvent.getAction() == 7 || motionEvent.getAction() == 9) {
                d();
                a(false);
            }
        }
    }

    @Override // defpackage.R00
    public final void x() {
        this.O = new H51();
    }
}
