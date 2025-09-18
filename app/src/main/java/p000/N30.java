package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class N30 extends R00 {

    /* renamed from: M */
    public Handler f7479M;

    /* renamed from: N */
    public RunnableC0204DE f7480N;

    /* renamed from: O */
    public H51 f7481O;

    /* renamed from: K */
    public static Boolean m5529K(View view, View view2, View view3) {
        if (O90.m5963a(view3, view2)) {
            return Boolean.TRUE;
        }
        if (O90.m5963a(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Boolean boolM5529K = m5529K(view, view2, OJ1.m6012i(viewGroup, i));
            if (boolM5529K != null) {
                return boolM5529K;
            }
        }
        return null;
    }

    @Override // p000.R00
    /* renamed from: D */
    public final boolean mo5530D(R00 r00) {
        O90.m5968f(r00, "handler");
        if (!(r00 instanceof N30) || ((N30) r00).m5534J(this)) {
            return super.mo5530D(r00);
        }
        View view = r00.f9904e;
        O90.m5965c(view);
        View view2 = this.f9904e;
        O90.m5965c(view2);
        View rootView = view.getRootView();
        O90.m5967e(rootView, "getRootView(...)");
        Boolean boolM5529K = m5529K(view, view2, rootView);
        O90.m5965c(boolM5529K);
        return boolM5529K.booleanValue();
    }

    @Override // p000.R00
    /* renamed from: E */
    public final boolean mo5531E(R00 r00) {
        O90.m5968f(r00, "handler");
        if (((r00 instanceof N30) && (m5534J(r00) || ((N30) r00).m5534J(this))) || (r00 instanceof NH0)) {
            return true;
        }
        return super.mo5531E(r00);
    }

    @Override // p000.R00
    /* renamed from: F */
    public final boolean mo5532F(R00 r00) {
        O90.m5968f(r00, "handler");
        if ((r00 instanceof N30) && !m5534J(r00) && !((N30) r00).m5534J(this)) {
            View view = this.f9904e;
            O90.m5965c(view);
            View view2 = r00.f9904e;
            O90.m5965c(view2);
            View rootView = view.getRootView();
            O90.m5967e(rootView, "getRootView(...)");
            Boolean boolM5529K = m5529K(view, view2, rootView);
            if (boolM5529K != null) {
                return boolM5529K.booleanValue();
            }
        }
        return super.mo5532F(r00);
    }

    /* renamed from: I */
    public final void m5533I() {
        int i = this.f9905f;
        if (i == 0) {
            m6857e();
        } else if (i == 2) {
            m6864m();
        } else {
            if (i != 4) {
                return;
            }
            m6862k();
        }
    }

    /* renamed from: J */
    public final boolean m5534J(R00 r00) {
        View view = r00.f9904e;
        while (view != null) {
            if (view.equals(this.f9904e)) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    @Override // p000.R00
    /* renamed from: u */
    public final void mo722u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        if (motionEvent.getAction() == 0) {
            Handler handler = this.f7479M;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f7479M = null;
            return;
        }
        if (motionEvent.getAction() != 1 || this.f9908i) {
            return;
        }
        m5533I();
    }

    @Override // p000.R00
    /* renamed from: v */
    public final void mo5535v(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        if (motionEvent.getAction() == 10) {
            if (this.f7479M == null) {
                this.f7479M = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f7479M;
            O90.m5965c(handler);
            handler.postDelayed(this.f7480N, 4L);
            return;
        }
        if (!this.f9908i) {
            m5533I();
            return;
        }
        if (this.f9905f == 4 && motionEvent.getToolType(0) == 2) {
            this.f7481O = AT1.m188b(motionEvent);
            return;
        }
        if (this.f9905f == 0) {
            if (motionEvent.getAction() == 7 || motionEvent.getAction() == 9) {
                m6856d();
                mo721a(false);
            }
        }
    }

    @Override // p000.R00
    /* renamed from: x */
    public final void mo723x() {
        this.f7481O = new H51();
    }
}
