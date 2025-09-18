package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* renamed from: zl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11965zl0 extends R00 {

    /* renamed from: M */
    public long f46973M;

    /* renamed from: N */
    public final float f46974N;

    /* renamed from: O */
    public float f46975O;

    /* renamed from: P */
    public int f46976P;

    /* renamed from: Q */
    public float f46977Q;

    /* renamed from: R */
    public float f46978R;

    /* renamed from: S */
    public long f46979S;

    /* renamed from: T */
    public long f46980T;

    /* renamed from: U */
    public Handler f46981U;

    /* renamed from: V */
    public int f46982V;

    public C11965zl0(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "context");
        this.f46973M = 500L;
        this.f9924y = true;
        float f = reactApplicationContext.getResources().getDisplayMetrics().density * 10.0f;
        float f2 = f * f;
        this.f46974N = f2;
        this.f46975O = f2;
        this.f46976P = 1;
    }

    /* renamed from: I */
    public static Pair m26531I(MotionEvent motionEvent, boolean z) {
        if (z) {
            int pointerCount = motionEvent.getPointerCount();
            float f = 0.0f;
            float y = 0.0f;
            for (int i = 0; i < pointerCount; i++) {
                if (i != motionEvent.getActionIndex()) {
                    float x = motionEvent.getX(i) + f;
                    y = motionEvent.getY(i) + y;
                    f = x;
                }
            }
            return new Pair(Float.valueOf(f / (motionEvent.getPointerCount() - 1)), Float.valueOf(y / (motionEvent.getPointerCount() - 1)));
        }
        C9461g90 c9461g90M22423h = AbstractC10132lO1.m22423h(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c9461g90M22423h));
        Iterator it = c9461g90M22423h.iterator();
        while (((C9333f90) it).f27092c) {
            arrayList.add(Float.valueOf(motionEvent.getX(((C9333f90) it).m18193a())));
        }
        float fM25993u = (float) AbstractC7167xu.m25993u(arrayList);
        C9461g90 c9461g90M22423h2 = AbstractC10132lO1.m22423h(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(c9461g90M22423h2));
        Iterator it2 = c9461g90M22423h2.iterator();
        while (((C9333f90) it2).f27092c) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((C9333f90) it2).m18193a())));
        }
        return new Pair(Float.valueOf(fM25993u), Float.valueOf((float) AbstractC7167xu.m25993u(arrayList2)));
    }

    @Override // p000.R00
    /* renamed from: g */
    public final void mo6858g(MotionEvent motionEvent) {
        this.f46980T = SystemClock.uptimeMillis();
        super.mo6858g(motionEvent);
    }

    @Override // p000.R00
    /* renamed from: h */
    public final void mo6859h(int i, int i2) {
        this.f46980T = SystemClock.uptimeMillis();
        super.mo6859h(i, i2);
    }

    @Override // p000.R00
    /* renamed from: u */
    public final void mo722u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.m5968f(motionEvent2, "sourceEvent");
        if (m6851C(motionEvent2)) {
            if (this.f9905f == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.f46980T = jUptimeMillis;
                this.f46979S = jUptimeMillis;
                m6856d();
                Pair pairM26531I = m26531I(motionEvent2, false);
                float fFloatValue = ((Number) pairM26531I.f36702a).floatValue();
                float fFloatValue2 = ((Number) pairM26531I.f36703b).floatValue();
                this.f46977Q = fFloatValue;
                this.f46978R = fFloatValue2;
                this.f46982V++;
            }
            if (motionEvent2.getActionMasked() == 5) {
                this.f46982V++;
                Pair pairM26531I2 = m26531I(motionEvent2, false);
                float fFloatValue3 = ((Number) pairM26531I2.f36702a).floatValue();
                float fFloatValue4 = ((Number) pairM26531I2.f36703b).floatValue();
                this.f46977Q = fFloatValue3;
                this.f46978R = fFloatValue4;
                if (this.f46982V > this.f46976P) {
                    m6864m();
                    this.f46982V = 0;
                }
            }
            if (this.f9905f == 2 && this.f46982V == this.f46976P && (motionEvent2.getActionMasked() == 0 || motionEvent2.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f46981U = handler;
                long j = this.f46973M;
                if (j > 0) {
                    handler.postDelayed(new RunnableC0204DE(21, this), j);
                } else if (j == 0) {
                    mo721a(false);
                }
            }
            if (motionEvent2.getActionMasked() == 1 || motionEvent2.getActionMasked() == 12) {
                this.f46982V--;
                Handler handler2 = this.f46981U;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.f46981U = null;
                }
                if (this.f9905f == 4) {
                    m6862k();
                    return;
                } else {
                    m6864m();
                    return;
                }
            }
            if (motionEvent2.getActionMasked() == 6) {
                int i = this.f46982V - 1;
                this.f46982V = i;
                if (i < this.f46976P && this.f9905f != 4) {
                    m6864m();
                    this.f46982V = 0;
                    return;
                }
                Pair pairM26531I3 = m26531I(motionEvent2, true);
                float fFloatValue5 = ((Number) pairM26531I3.f36702a).floatValue();
                float fFloatValue6 = ((Number) pairM26531I3.f36703b).floatValue();
                this.f46977Q = fFloatValue5;
                this.f46978R = fFloatValue6;
                return;
            }
            Pair pairM26531I4 = m26531I(motionEvent2, false);
            float fFloatValue7 = ((Number) pairM26531I4.f36702a).floatValue();
            float fFloatValue8 = ((Number) pairM26531I4.f36703b).floatValue();
            float f = fFloatValue7 - this.f46977Q;
            float f2 = fFloatValue8 - this.f46978R;
            if ((f2 * f2) + (f * f) > this.f46975O) {
                if (this.f9905f == 4) {
                    m6857e();
                } else {
                    m6864m();
                }
            }
        }
    }

    @Override // p000.R00
    /* renamed from: x */
    public final void mo723x() {
        this.f46982V = 0;
    }

    @Override // p000.R00
    /* renamed from: y */
    public final void mo6871y() {
        Handler handler = this.f46981U;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f46981U = null;
        }
    }

    @Override // p000.R00
    /* renamed from: z */
    public final void mo6872z() {
        super.mo6872z();
        this.f46973M = 500L;
        this.f46975O = this.f46974N;
    }
}
