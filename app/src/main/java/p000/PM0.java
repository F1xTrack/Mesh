package p000;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class PM0 extends AbstractC11122t71 {

    /* renamed from: L */
    public boolean f9006L;

    /* renamed from: M */
    public boolean f9007M;

    /* renamed from: N */
    public float f9008N;

    /* renamed from: O */
    public int f9009O;

    /* renamed from: P */
    public float f9010P;

    /* renamed from: Q */
    public boolean f9011Q;

    /* renamed from: R */
    public boolean f9012R;

    @Override // p000.AbstractC11122t71, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.f9010P);
                if (this.f9011Q || fAbs > this.f9009O) {
                    this.f9011Q = true;
                }
            }
            return false;
        }
        this.f9010P = motionEvent.getX();
        this.f9011Q = false;
        if (super.onInterceptTouchEvent(motionEvent)) {
            GB1.m2968b(this, motionEvent);
            this.f9012R = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC11122t71, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f9006L) {
            return;
        }
        this.f9006L = true;
        setProgressViewOffset(this.f9008N);
        setRefreshing(this.f9007M);
    }

    @Override // p000.AbstractC11122t71, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.f9012R) {
            GB1.m2967a(this, motionEvent);
            this.f9012R = false;
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
        this.f9008N = f;
        if (this.f9006L) {
            int progressCircleDiameter = getProgressCircleDiameter();
            int iRound = Math.round(AbstractC11406vL1.m25403b(f)) - progressCircleDiameter;
            int iRound2 = Math.round(AbstractC11406vL1.m25403b(f + 64.0f) - progressCircleDiameter);
            this.f42876w = iRound;
            this.f42877x = iRound2;
            this.f42850G = true;
            m24846l();
            this.f42856c = false;
        }
    }

    @Override // p000.AbstractC11122t71
    public void setRefreshing(boolean z) {
        this.f9007M = z;
        if (this.f9006L) {
            super.setRefreshing(z);
        }
    }
}
