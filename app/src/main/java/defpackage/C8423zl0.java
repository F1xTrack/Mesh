package defpackage;

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
public final class C8423zl0 extends R00 {
    public long M;
    public final float N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public long S;
    public long T;
    public Handler U;
    public int V;

    public C8423zl0(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "context");
        this.M = 500L;
        this.y = true;
        float f = reactApplicationContext.getResources().getDisplayMetrics().density * 10.0f;
        float f2 = f * f;
        this.N = f2;
        this.O = f2;
        this.P = 1;
    }

    public static Pair I(MotionEvent motionEvent, boolean z) {
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
        C3909g90 c3909g90H = AbstractC5686lO1.h(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(c3909g90H));
        Iterator it = c3909g90H.iterator();
        while (((C3718f90) it).c) {
            arrayList.add(Float.valueOf(motionEvent.getX(((C3718f90) it).a())));
        }
        float fU = (float) AbstractC8069xu.u(arrayList);
        C3909g90 c3909g90H2 = AbstractC5686lO1.h(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(c3909g90H2));
        Iterator it2 = c3909g90H2.iterator();
        while (((C3718f90) it2).c) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((C3718f90) it2).a())));
        }
        return new Pair(Float.valueOf(fU), Float.valueOf((float) AbstractC8069xu.u(arrayList2)));
    }

    @Override // defpackage.R00
    public final void g(MotionEvent motionEvent) {
        this.T = SystemClock.uptimeMillis();
        super.g(motionEvent);
    }

    @Override // defpackage.R00
    public final void h(int i, int i2) {
        this.T = SystemClock.uptimeMillis();
        super.h(i, i2);
    }

    @Override // defpackage.R00
    public final void u(MotionEvent motionEvent, MotionEvent motionEvent2) {
        O90.f(motionEvent2, "sourceEvent");
        if (C(motionEvent2)) {
            if (this.f == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.T = jUptimeMillis;
                this.S = jUptimeMillis;
                d();
                Pair pairI = I(motionEvent2, false);
                float fFloatValue = ((Number) pairI.a).floatValue();
                float fFloatValue2 = ((Number) pairI.b).floatValue();
                this.Q = fFloatValue;
                this.R = fFloatValue2;
                this.V++;
            }
            if (motionEvent2.getActionMasked() == 5) {
                this.V++;
                Pair pairI2 = I(motionEvent2, false);
                float fFloatValue3 = ((Number) pairI2.a).floatValue();
                float fFloatValue4 = ((Number) pairI2.b).floatValue();
                this.Q = fFloatValue3;
                this.R = fFloatValue4;
                if (this.V > this.P) {
                    m();
                    this.V = 0;
                }
            }
            if (this.f == 2 && this.V == this.P && (motionEvent2.getActionMasked() == 0 || motionEvent2.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.U = handler;
                long j = this.M;
                if (j > 0) {
                    handler.postDelayed(new DE(21, this), j);
                } else if (j == 0) {
                    a(false);
                }
            }
            if (motionEvent2.getActionMasked() == 1 || motionEvent2.getActionMasked() == 12) {
                this.V--;
                Handler handler2 = this.U;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.U = null;
                }
                if (this.f == 4) {
                    k();
                    return;
                } else {
                    m();
                    return;
                }
            }
            if (motionEvent2.getActionMasked() == 6) {
                int i = this.V - 1;
                this.V = i;
                if (i < this.P && this.f != 4) {
                    m();
                    this.V = 0;
                    return;
                }
                Pair pairI3 = I(motionEvent2, true);
                float fFloatValue5 = ((Number) pairI3.a).floatValue();
                float fFloatValue6 = ((Number) pairI3.b).floatValue();
                this.Q = fFloatValue5;
                this.R = fFloatValue6;
                return;
            }
            Pair pairI4 = I(motionEvent2, false);
            float fFloatValue7 = ((Number) pairI4.a).floatValue();
            float fFloatValue8 = ((Number) pairI4.b).floatValue();
            float f = fFloatValue7 - this.Q;
            float f2 = fFloatValue8 - this.R;
            if ((f2 * f2) + (f * f) > this.O) {
                if (this.f == 4) {
                    e();
                } else {
                    m();
                }
            }
        }
    }

    @Override // defpackage.R00
    public final void x() {
        this.V = 0;
    }

    @Override // defpackage.R00
    public final void y() {
        Handler handler = this.U;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.U = null;
        }
    }

    @Override // defpackage.R00
    public final void z() {
        super.z();
        this.M = 500L;
        this.O = this.N;
    }
}
