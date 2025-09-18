package p000;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes2.dex */
public final class BT0 extends R00 {

    /* renamed from: M */
    public AT0 f830M;

    /* renamed from: N */
    public double f831N;

    /* renamed from: O */
    public double f832O;

    /* renamed from: P */
    public float f833P = Float.NaN;

    /* renamed from: Q */
    public float f834Q = Float.NaN;

    /* renamed from: R */
    public final C10641pN0 f835R;

    public BT0() {
        this.f9924y = false;
        this.f835R = new C10641pN0(3, this);
    }

    @Override // p000.R00
    /* renamed from: A */
    public final void mo720A() {
        this.f832O = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f831N = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // p000.R00
    /* renamed from: a */
    public final void mo721a(boolean z) {
        if (this.f9905f != 4) {
            mo720A();
        }
        super.mo721a(z);
    }

    @Override // p000.R00
    /* renamed from: u */
    public final void mo722u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        if (this.f9905f == 0) {
            mo720A();
            this.f830M = new AT0(this.f835R);
            this.f833P = motionEvent.getX();
            this.f834Q = motionEvent.getY();
            m6856d();
        }
        AT0 at0 = this.f830M;
        if (at0 != null) {
            int actionMasked = motionEvent2.getActionMasked();
            int[] iArr = at0.f208i;
            if (actionMasked != 0) {
                C10641pN0 c10641pN0 = at0.f200a;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 5) {
                            if (!at0.f207h || at0.f209j) {
                                iArr[1] = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                                at0.m186a(motionEvent2);
                            }
                            if (!at0.f207h) {
                                at0.f207h = true;
                                at0.f202c = motionEvent2.getEventTime();
                                at0.f203d = Double.NaN;
                            }
                        } else if (actionMasked == 6 && at0.f207h) {
                            int pointerId = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                            if (pointerId == iArr[0]) {
                                iArr[0] = iArr[1];
                                iArr[1] = -1;
                                if (!at0.f209j) {
                                    at0.f209j = true;
                                }
                            } else if (pointerId == iArr[1]) {
                                iArr[1] = -1;
                                if (!at0.f209j) {
                                    at0.f209j = true;
                                }
                            }
                        }
                    } else if (at0.f207h) {
                        at0.m186a(motionEvent2);
                        if (!at0.f209j && c10641pN0 != null) {
                            BT0 bt0 = (BT0) c10641pN0.f40042b;
                            double d = bt0.f831N;
                            double d2 = at0.f204e + d;
                            bt0.f831N = d2;
                            long j = at0.f201b - at0.f202c;
                            if (j > 0) {
                                bt0.f832O = (d2 - d) / j;
                            }
                            if (Math.abs(d2) >= 0.08726646259971647d && bt0.f9905f == 2) {
                                bt0.mo721a(false);
                            }
                        }
                    }
                } else if (at0.f207h) {
                    at0.f209j = false;
                    at0.f207h = false;
                    if (c10641pN0 != null) {
                        ((BT0) c10641pN0.f40042b).m6862k();
                    }
                }
            } else {
                at0.f207h = false;
                iArr[0] = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                iArr[1] = -1;
            }
        }
        AT0 at02 = this.f830M;
        if (at02 != null) {
            PointF pointF = new PointF(at02.f205f, at02.f206g);
            T00 t00 = this.f9891A;
            if (t00 != null) {
                t00.m7514h(this.f9904e, pointF);
            } else {
                pointF.x = Float.NaN;
                pointF.y = Float.NaN;
            }
            this.f833P = pointF.x;
            this.f834Q = pointF.y;
        }
        if (motionEvent2.getActionMasked() == 1) {
            if (this.f9905f == 4) {
                m6862k();
            } else {
                m6864m();
            }
        }
    }

    @Override // p000.R00
    /* renamed from: x */
    public final void mo723x() {
        this.f830M = null;
        this.f833P = Float.NaN;
        this.f834Q = Float.NaN;
        mo720A();
    }
}
