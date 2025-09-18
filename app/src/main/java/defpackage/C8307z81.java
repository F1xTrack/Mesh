package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;

/* renamed from: z81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8307z81 extends R00 {
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public Handler a0;
    public int b0;
    public float M = Float.MIN_VALUE;
    public float N = Float.MIN_VALUE;
    public float O = Float.MIN_VALUE;
    public long P = 500;
    public long Q = 200;
    public int R = 1;
    public int S = 1;
    public int T = 1;
    public final N61 c0 = new N61(5, this);

    public C8307z81() {
        this.y = true;
    }

    public final void I() {
        Handler handler = this.a0;
        if (handler == null) {
            this.a0 = new Handler(Looper.getMainLooper());
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.a0;
        O90.c(handler2);
        handler2.postDelayed(this.c0, this.P);
    }

    @Override // defpackage.R00
    public final void a(boolean z) {
        super.a(z);
        k();
    }

    @Override // defpackage.R00
    public final void t() {
        Handler handler = this.a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.R00
    public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        if (C(motionEvent2)) {
            int i = this.f;
            int actionMasked = motionEvent2.getActionMasked();
            if (i == 0) {
                this.W = 0.0f;
                this.X = 0.0f;
                this.U = E12.b(motionEvent2, true);
                this.V = E12.c(motionEvent2, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.W = (this.Y - this.U) + this.W;
                this.X = (this.Z - this.V) + this.X;
                this.Y = E12.b(motionEvent2, true);
                float fC = E12.c(motionEvent2, true);
                this.Z = fC;
                this.U = this.Y;
                this.V = fC;
            } else {
                this.Y = E12.b(motionEvent2, true);
                this.Z = E12.c(motionEvent2, true);
            }
            if (this.T < motionEvent2.getPointerCount()) {
                this.T = motionEvent2.getPointerCount();
            }
            float f = (this.Y - this.U) + this.W;
            if (this.M == Float.MIN_VALUE || Math.abs(f) <= this.M) {
                float f2 = (this.Z - this.V) + this.X;
                if (this.N == Float.MIN_VALUE || Math.abs(f2) <= this.N) {
                    float f3 = (f * f) + (f2 * f2);
                    float f4 = this.O;
                    if (f4 == Float.MIN_VALUE || f3 <= f4) {
                        if (i == 0) {
                            if (actionMasked == 0 || actionMasked == 11) {
                                d();
                            }
                            I();
                            return;
                        }
                        if (i == 2) {
                            if (actionMasked != 0) {
                                if (actionMasked != 1) {
                                    if (actionMasked != 11) {
                                        if (actionMasked != 12) {
                                            return;
                                        }
                                    }
                                }
                                Handler handler = this.a0;
                                if (handler == null) {
                                    this.a0 = new Handler(Looper.getMainLooper());
                                } else {
                                    handler.removeCallbacksAndMessages(null);
                                }
                                int i2 = this.b0 + 1;
                                this.b0 = i2;
                                if (i2 == this.R && this.T >= this.S) {
                                    a(false);
                                    return;
                                }
                                Handler handler2 = this.a0;
                                O90.c(handler2);
                                handler2.postDelayed(this.c0, this.Q);
                                return;
                            }
                            I();
                            return;
                        }
                        return;
                    }
                }
            }
            m();
        }
    }

    @Override // defpackage.R00
    public final void x() {
        this.b0 = 0;
        this.T = 0;
        Handler handler = this.a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.R00
    public final void z() {
        super.z();
        this.M = Float.MIN_VALUE;
        this.N = Float.MIN_VALUE;
        this.O = Float.MIN_VALUE;
        this.P = 500L;
        this.Q = 200L;
        this.R = 1;
        this.S = 1;
    }
}
