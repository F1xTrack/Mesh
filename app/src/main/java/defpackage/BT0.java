package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes2.dex */
public final class BT0 extends R00 {
    public AT0 M;
    public double N;
    public double O;
    public float P = Float.NaN;
    public float Q = Float.NaN;
    public final C6446pN0 R;

    public BT0() {
        this.y = false;
        this.R = new C6446pN0(3, this);
    }

    @Override // defpackage.R00
    public final void A() {
        this.O = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.N = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    @Override // defpackage.R00
    public final void a(boolean z) {
        if (this.f != 4) {
            A();
        }
        super.a(z);
    }

    @Override // defpackage.R00
    public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        if (this.f == 0) {
            A();
            this.M = new AT0(this.R);
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            d();
        }
        AT0 at0 = this.M;
        if (at0 != null) {
            int actionMasked = motionEvent2.getActionMasked();
            int[] iArr = at0.i;
            if (actionMasked != 0) {
                C6446pN0 c6446pN0 = at0.a;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 5) {
                            if (!at0.h || at0.j) {
                                iArr[1] = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                                at0.a(motionEvent2);
                            }
                            if (!at0.h) {
                                at0.h = true;
                                at0.c = motionEvent2.getEventTime();
                                at0.d = Double.NaN;
                            }
                        } else if (actionMasked == 6 && at0.h) {
                            int pointerId = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                            if (pointerId == iArr[0]) {
                                iArr[0] = iArr[1];
                                iArr[1] = -1;
                                if (!at0.j) {
                                    at0.j = true;
                                }
                            } else if (pointerId == iArr[1]) {
                                iArr[1] = -1;
                                if (!at0.j) {
                                    at0.j = true;
                                }
                            }
                        }
                    } else if (at0.h) {
                        at0.a(motionEvent2);
                        if (!at0.j && c6446pN0 != null) {
                            BT0 bt0 = (BT0) c6446pN0.b;
                            double d = bt0.N;
                            double d2 = at0.e + d;
                            bt0.N = d2;
                            long j = at0.b - at0.c;
                            if (j > 0) {
                                bt0.O = (d2 - d) / j;
                            }
                            if (Math.abs(d2) >= 0.08726646259971647d && bt0.f == 2) {
                                bt0.a(false);
                            }
                        }
                    }
                } else if (at0.h) {
                    at0.j = false;
                    at0.h = false;
                    if (c6446pN0 != null) {
                        ((BT0) c6446pN0.b).k();
                    }
                }
            } else {
                at0.h = false;
                iArr[0] = motionEvent2.getPointerId(motionEvent2.getActionIndex());
                iArr[1] = -1;
            }
        }
        AT0 at02 = this.M;
        if (at02 != null) {
            PointF pointF = new PointF(at02.f, at02.g);
            T00 t00 = this.A;
            if (t00 != null) {
                t00.h(this.e, pointF);
            } else {
                pointF.x = Float.NaN;
                pointF.y = Float.NaN;
            }
            this.P = pointF.x;
            this.Q = pointF.y;
        }
        if (motionEvent2.getActionMasked() == 1) {
            if (this.f == 4) {
                k();
            } else {
                m();
            }
        }
    }

    @Override // defpackage.R00
    public final void x() {
        this.M = null;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        A();
    }
}
