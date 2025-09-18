package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class XJ0 extends EL {
    public int I;
    public int J;
    public boolean K;

    @Override // defpackage.EL, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            GB1.b(this, motionEvent);
            this.K = true;
            return true;
        } catch (IllegalArgumentException unused) {
            AbstractC3393dS.s("ReactNative");
            return false;
        }
    }

    @Override // defpackage.EL, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.K) {
            GB1.a(this, motionEvent);
            this.K = false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void s() {
        int i = this.I;
        View viewD = d(i);
        if (viewD != null) {
            b(viewD);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + EL.i(i));
        }
    }

    public final void t() {
        int i = this.I;
        View viewD = d(i);
        if (viewD != null) {
            n(viewD);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + EL.i(i));
        }
    }

    public final void u(int i) {
        this.I = i;
        v();
    }

    public final void v() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            BL bl = (BL) childAt.getLayoutParams();
            bl.a = this.I;
            ((ViewGroup.MarginLayoutParams) bl).width = this.J;
            childAt.setLayoutParams(bl);
            childAt.setClickable(true);
        }
    }
}
