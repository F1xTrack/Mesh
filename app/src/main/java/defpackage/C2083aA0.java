package defpackage;

import android.os.Handler;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: aA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2083aA0 extends R00 {
    public float M;
    public float N;
    public final float O;
    public float P;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public VelocityTracker j0;
    public boolean k0;
    public long l0;
    public Handler n0;
    public float Q = Float.MAX_VALUE;
    public float R = Float.MIN_VALUE;
    public float S = Float.MIN_VALUE;
    public float T = Float.MAX_VALUE;
    public float U = Float.MAX_VALUE;
    public float V = Float.MIN_VALUE;
    public float W = Float.MIN_VALUE;
    public float X = Float.MAX_VALUE;
    public float Y = Float.MAX_VALUE;
    public float Z = Float.MAX_VALUE;
    public float a0 = Float.MAX_VALUE;
    public int b0 = 1;
    public int c0 = 10;
    public final RunnableC1577Tz0 m0 = new RunnableC1577Tz0(1, this);
    public H51 o0 = new H51();

    public C2083aA0(ReactApplicationContext reactApplicationContext) {
        this.P = Float.MIN_VALUE;
        O90.c(reactApplicationContext);
        int scaledTouchSlop = ViewConfiguration.get(reactApplicationContext).getScaledTouchSlop();
        float f = scaledTouchSlop * scaledTouchSlop;
        this.O = f;
        this.P = f;
    }

    @Override // defpackage.R00
    public final void A() {
        this.d0 = this.h0;
        this.e0 = this.i0;
    }

    @Override // defpackage.R00
    public final void a(boolean z) {
        if (this.f != 4) {
            A();
        }
        super.a(z);
    }

    @Override // defpackage.R00
    public final void t() {
        Handler handler = this.n0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    @Override // defpackage.R00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.MotionEvent r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2083aA0.u(android.view.MotionEvent, android.view.MotionEvent):void");
    }

    @Override // defpackage.R00
    public final void x() {
        Handler handler = this.n0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j0 = null;
        }
        this.o0 = new H51();
    }

    @Override // defpackage.R00
    public final void z() {
        super.z();
        this.Q = Float.MAX_VALUE;
        this.R = Float.MIN_VALUE;
        this.S = Float.MIN_VALUE;
        this.T = Float.MAX_VALUE;
        this.U = Float.MAX_VALUE;
        this.V = Float.MIN_VALUE;
        this.W = Float.MIN_VALUE;
        this.X = Float.MAX_VALUE;
        this.Y = Float.MAX_VALUE;
        this.Z = Float.MAX_VALUE;
        this.a0 = Float.MAX_VALUE;
        this.P = this.O;
        this.b0 = 1;
        this.c0 = 10;
        this.l0 = 0L;
        this.k0 = false;
    }
}
