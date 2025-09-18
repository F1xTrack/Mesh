package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;

/* renamed from: z81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11888z81 extends R00 {

    /* renamed from: U */
    public float f46652U;

    /* renamed from: V */
    public float f46653V;

    /* renamed from: W */
    public float f46654W;

    /* renamed from: X */
    public float f46655X;

    /* renamed from: Y */
    public float f46656Y;

    /* renamed from: Z */
    public float f46657Z;

    /* renamed from: a0 */
    public Handler f46658a0;

    /* renamed from: b0 */
    public int f46659b0;

    /* renamed from: M */
    public float f46644M = Float.MIN_VALUE;

    /* renamed from: N */
    public float f46645N = Float.MIN_VALUE;

    /* renamed from: O */
    public float f46646O = Float.MIN_VALUE;

    /* renamed from: P */
    public long f46647P = 500;

    /* renamed from: Q */
    public long f46648Q = 200;

    /* renamed from: R */
    public int f46649R = 1;

    /* renamed from: S */
    public int f46650S = 1;

    /* renamed from: T */
    public int f46651T = 1;

    /* renamed from: c0 */
    public final N61 f46660c0 = new N61(5, this);

    public C11888z81() {
        this.f9924y = true;
    }

    /* renamed from: I */
    public final void m26312I() {
        Handler handler = this.f46658a0;
        if (handler == null) {
            this.f46658a0 = new Handler(Looper.getMainLooper());
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f46658a0;
        O90.m5965c(handler2);
        handler2.postDelayed(this.f46660c0, this.f46647P);
    }

    @Override // p000.R00
    /* renamed from: a */
    public final void mo721a(boolean z) {
        super.mo721a(z);
        m6862k();
    }

    @Override // p000.R00
    /* renamed from: t */
    public final void mo5614t() {
        Handler handler = this.f46658a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p000.R00
    /* renamed from: u */
    public final void mo722u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        if (m6851C(motionEvent2)) {
            int i = this.f9905f;
            int actionMasked = motionEvent2.getActionMasked();
            if (i == 0) {
                this.f46654W = 0.0f;
                this.f46655X = 0.0f;
                this.f46652U = E12.m1984b(motionEvent2, true);
                this.f46653V = E12.m1985c(motionEvent2, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f46654W = (this.f46656Y - this.f46652U) + this.f46654W;
                this.f46655X = (this.f46657Z - this.f46653V) + this.f46655X;
                this.f46656Y = E12.m1984b(motionEvent2, true);
                float fM1985c = E12.m1985c(motionEvent2, true);
                this.f46657Z = fM1985c;
                this.f46652U = this.f46656Y;
                this.f46653V = fM1985c;
            } else {
                this.f46656Y = E12.m1984b(motionEvent2, true);
                this.f46657Z = E12.m1985c(motionEvent2, true);
            }
            if (this.f46651T < motionEvent2.getPointerCount()) {
                this.f46651T = motionEvent2.getPointerCount();
            }
            float f = (this.f46656Y - this.f46652U) + this.f46654W;
            if (this.f46644M == Float.MIN_VALUE || Math.abs(f) <= this.f46644M) {
                float f2 = (this.f46657Z - this.f46653V) + this.f46655X;
                if (this.f46645N == Float.MIN_VALUE || Math.abs(f2) <= this.f46645N) {
                    float f3 = (f * f) + (f2 * f2);
                    float f4 = this.f46646O;
                    if (f4 == Float.MIN_VALUE || f3 <= f4) {
                        if (i == 0) {
                            if (actionMasked == 0 || actionMasked == 11) {
                                m6856d();
                            }
                            m26312I();
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
                                Handler handler = this.f46658a0;
                                if (handler == null) {
                                    this.f46658a0 = new Handler(Looper.getMainLooper());
                                } else {
                                    handler.removeCallbacksAndMessages(null);
                                }
                                int i2 = this.f46659b0 + 1;
                                this.f46659b0 = i2;
                                if (i2 == this.f46649R && this.f46651T >= this.f46650S) {
                                    mo721a(false);
                                    return;
                                }
                                Handler handler2 = this.f46658a0;
                                O90.m5965c(handler2);
                                handler2.postDelayed(this.f46660c0, this.f46648Q);
                                return;
                            }
                            m26312I();
                            return;
                        }
                        return;
                    }
                }
            }
            m6864m();
        }
    }

    @Override // p000.R00
    /* renamed from: x */
    public final void mo723x() {
        this.f46659b0 = 0;
        this.f46651T = 0;
        Handler handler = this.f46658a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p000.R00
    /* renamed from: z */
    public final void mo6872z() {
        super.mo6872z();
        this.f46644M = Float.MIN_VALUE;
        this.f46645N = Float.MIN_VALUE;
        this.f46646O = Float.MIN_VALUE;
        this.f46647P = 500L;
        this.f46648Q = 200L;
        this.f46649R = 1;
        this.f46650S = 1;
    }
}
