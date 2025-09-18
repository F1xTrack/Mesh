package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class XJ0 extends AbstractC0274EL {

    /* renamed from: I */
    public int f13670I;

    /* renamed from: J */
    public int f13671J;

    /* renamed from: K */
    public boolean f13672K;

    @Override // p000.AbstractC0274EL, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            GB1.m2968b(this, motionEvent);
            this.f13672K = true;
            return true;
        } catch (IllegalArgumentException unused) {
            AbstractC3929dS.m17686s("ReactNative");
            return false;
        }
    }

    @Override // p000.AbstractC0274EL, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.f13672K) {
            GB1.m2967a(this, motionEvent);
            this.f13672K = false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: s */
    public final void m8968s() {
        int i = this.f13670I;
        View viewM2151d = m2151d(i);
        if (viewM2151d != null) {
            m2149b(viewM2151d);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + AbstractC0274EL.m2143i(i));
        }
    }

    /* renamed from: t */
    public final void m8969t() {
        int i = this.f13670I;
        View viewM2151d = m2151d(i);
        if (viewM2151d != null) {
            m2156n(viewM2151d);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + AbstractC0274EL.m2143i(i));
        }
    }

    /* renamed from: u */
    public final void m8970u(int i) {
        this.f13670I = i;
        m8971v();
    }

    /* renamed from: v */
    public final void m8971v() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            C0085BL c0085bl = (C0085BL) childAt.getLayoutParams();
            c0085bl.f756a = this.f13670I;
            ((ViewGroup.MarginLayoutParams) c0085bl).width = this.f13671J;
            childAt.setLayoutParams(c0085bl);
            childAt.setClickable(true);
        }
    }
}
