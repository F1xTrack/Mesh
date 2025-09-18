package defpackage;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class PM0 extends AbstractC7162t71 {
    public boolean L;
    public boolean M;
    public float N;
    public int O;
    public float P;
    public boolean Q;
    public boolean R;

    @Override // defpackage.AbstractC7162t71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.P);
                if (this.Q || fAbs > this.O) {
                    this.Q = true;
                }
            }
            return false;
        }
        this.P = motionEvent.getX();
        this.Q = false;
        if (super.onInterceptTouchEvent(motionEvent)) {
            GB1.b(this, motionEvent);
            this.R = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC7162t71, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.L) {
            return;
        }
        this.L = true;
        setProgressViewOffset(this.N);
        setRefreshing(this.M);
    }

    @Override // defpackage.AbstractC7162t71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.R) {
            GB1.a(this, motionEvent);
            this.R = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.N = f;
        if (this.L) {
            int progressCircleDiameter = getProgressCircleDiameter();
            int iRound = Math.round(AbstractC7586vL1.b(f)) - progressCircleDiameter;
            int iRound2 = Math.round(AbstractC7586vL1.b(f + 64.0f) - progressCircleDiameter);
            this.w = iRound;
            this.x = iRound2;
            this.G = true;
            l();
            this.c = false;
        }
    }

    @Override // defpackage.AbstractC7162t71
    public void setRefreshing(boolean z) {
        this.M = z;
        if (this.L) {
            super.setRefreshing(z);
        }
    }
}
