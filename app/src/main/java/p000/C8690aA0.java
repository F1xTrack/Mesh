package p000;

import android.os.Handler;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: aA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8690aA0 extends R00 {

    /* renamed from: M */
    public float f15342M;

    /* renamed from: N */
    public float f15343N;

    /* renamed from: O */
    public final float f15344O;

    /* renamed from: P */
    public float f15345P;

    /* renamed from: d0 */
    public float f15359d0;

    /* renamed from: e0 */
    public float f15360e0;

    /* renamed from: f0 */
    public float f15361f0;

    /* renamed from: g0 */
    public float f15362g0;

    /* renamed from: h0 */
    public float f15363h0;

    /* renamed from: i0 */
    public float f15364i0;

    /* renamed from: j0 */
    public VelocityTracker f15365j0;

    /* renamed from: k0 */
    public boolean f15366k0;

    /* renamed from: l0 */
    public long f15367l0;

    /* renamed from: n0 */
    public Handler f15369n0;

    /* renamed from: Q */
    public float f15346Q = Float.MAX_VALUE;

    /* renamed from: R */
    public float f15347R = Float.MIN_VALUE;

    /* renamed from: S */
    public float f15348S = Float.MIN_VALUE;

    /* renamed from: T */
    public float f15349T = Float.MAX_VALUE;

    /* renamed from: U */
    public float f15350U = Float.MAX_VALUE;

    /* renamed from: V */
    public float f15351V = Float.MIN_VALUE;

    /* renamed from: W */
    public float f15352W = Float.MIN_VALUE;

    /* renamed from: X */
    public float f15353X = Float.MAX_VALUE;

    /* renamed from: Y */
    public float f15354Y = Float.MAX_VALUE;

    /* renamed from: Z */
    public float f15355Z = Float.MAX_VALUE;

    /* renamed from: a0 */
    public float f15356a0 = Float.MAX_VALUE;

    /* renamed from: b0 */
    public int f15357b0 = 1;

    /* renamed from: c0 */
    public int f15358c0 = 10;

    /* renamed from: m0 */
    public final RunnableC8352Tz0 f15368m0 = new RunnableC8352Tz0(1, this);

    /* renamed from: o0 */
    public H51 f15370o0 = new H51();

    public C8690aA0(ReactApplicationContext reactApplicationContext) {
        this.f15345P = Float.MIN_VALUE;
        O90.m5965c(reactApplicationContext);
        int scaledTouchSlop = ViewConfiguration.get(reactApplicationContext).getScaledTouchSlop();
        float f = scaledTouchSlop * scaledTouchSlop;
        this.f15344O = f;
        this.f15345P = f;
    }

    @Override // p000.R00
    /* renamed from: A */
    public final void mo720A() {
        this.f15359d0 = this.f15363h0;
        this.f15360e0 = this.f15364i0;
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
    /* renamed from: t */
    public final void mo5614t() {
        Handler handler = this.f15369n0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    @Override // p000.R00
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo722u(android.view.MotionEvent r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8690aA0.mo722u(android.view.MotionEvent, android.view.MotionEvent):void");
    }

    @Override // p000.R00
    /* renamed from: x */
    public final void mo723x() {
        Handler handler = this.f15369n0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f15365j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15365j0 = null;
        }
        this.f15370o0 = new H51();
    }

    @Override // p000.R00
    /* renamed from: z */
    public final void mo6872z() {
        super.mo6872z();
        this.f15346Q = Float.MAX_VALUE;
        this.f15347R = Float.MIN_VALUE;
        this.f15348S = Float.MIN_VALUE;
        this.f15349T = Float.MAX_VALUE;
        this.f15350U = Float.MAX_VALUE;
        this.f15351V = Float.MIN_VALUE;
        this.f15352W = Float.MIN_VALUE;
        this.f15353X = Float.MAX_VALUE;
        this.f15354Y = Float.MAX_VALUE;
        this.f15355Z = Float.MAX_VALUE;
        this.f15356a0 = Float.MAX_VALUE;
        this.f15345P = this.f15344O;
        this.f15357b0 = 1;
        this.f15358c0 = 10;
        this.f15367l0 = 0L;
        this.f15366k0 = false;
    }
}
