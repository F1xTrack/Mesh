package defpackage;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class NO0 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public NO0(RecyclerView recyclerView) {
        this.g = recyclerView;
        InterpolatorC6640qO0 interpolatorC6640qO0 = RecyclerView.T1;
        this.d = interpolatorC6640qO0;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), interpolatorC6640qO0);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.d;
        InterpolatorC6640qO0 interpolatorC6640qO0 = RecyclerView.T1;
        if (interpolator != interpolatorC6640qO0) {
            this.d = interpolatorC6640qO0;
            this.c = new OverScroller(recyclerView.getContext(), interpolatorC6640qO0);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.T1;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.g;
        if (recyclerView.n == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iO = RecyclerView.o(i5, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i6, recyclerView.J, recyclerView.L, recyclerView.getHeight());
            int[] iArr = recyclerView.E1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zV = recyclerView.v(iO, iO2, 1, iArr, null);
            int[] iArr2 = recyclerView.E1;
            if (zV) {
                iO -= iArr2[0];
                iO2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.f0(iO, iO2, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = iO - i7;
                int i10 = iO2 - i8;
                C2188aj0 c2188aj0 = recyclerView.n.e;
                if (c2188aj0 != null && !c2188aj0.d && c2188aj0.e) {
                    int iB = recyclerView.s1.b();
                    if (iB == 0) {
                        c2188aj0.i();
                    } else if (c2188aj0.a >= iB) {
                        c2188aj0.a = iB - 1;
                        c2188aj0.g(i7, i8);
                    } else {
                        c2188aj0.g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = iO;
                i2 = iO2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.w(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.x(i4, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C2188aj0 c2188aj02 = recyclerView.n.e;
            if ((c2188aj02 == null || !c2188aj02.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC6897rk1.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.R1) {
                    C5583ks c5583ks = recyclerView.r1;
                    int[] iArr4 = c5583ks.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c5583ks.d = 0;
                }
            } else {
                b();
                RunnableC3687f00 runnableC3687f00 = recyclerView.q1;
                if (runnableC3687f00 != null) {
                    runnableC3687f00.a(recyclerView, i4, i11);
                }
            }
        }
        C2188aj0 c2188aj03 = recyclerView.n.e;
        if (c2188aj03 != null && c2188aj03.d) {
            c2188aj03.g(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.l0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
