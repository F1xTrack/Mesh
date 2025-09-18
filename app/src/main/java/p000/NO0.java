package p000;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class NO0 implements Runnable {

    /* renamed from: a */
    public int f7747a;

    /* renamed from: b */
    public int f7748b;

    /* renamed from: c */
    public OverScroller f7749c;

    /* renamed from: d */
    public Interpolator f7750d;

    /* renamed from: e */
    public boolean f7751e;

    /* renamed from: f */
    public boolean f7752f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f7753g;

    public NO0(RecyclerView recyclerView) {
        this.f7753g = recyclerView;
        InterpolatorC10771qO0 interpolatorC10771qO0 = RecyclerView.f16458T1;
        this.f7750d = interpolatorC10771qO0;
        this.f7751e = false;
        this.f7752f = false;
        this.f7749c = new OverScroller(recyclerView.getContext(), interpolatorC10771qO0);
    }

    /* renamed from: a */
    public final void m5668a(int i, int i2) {
        RecyclerView recyclerView = this.f7753g;
        recyclerView.setScrollState(2);
        this.f7748b = 0;
        this.f7747a = 0;
        Interpolator interpolator = this.f7750d;
        InterpolatorC10771qO0 interpolatorC10771qO0 = RecyclerView.f16458T1;
        if (interpolator != interpolatorC10771qO0) {
            this.f7750d = interpolatorC10771qO0;
            this.f7749c = new OverScroller(recyclerView.getContext(), interpolatorC10771qO0);
        }
        this.f7749c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m5669b();
    }

    /* renamed from: b */
    public final void m5669b() {
        if (this.f7751e) {
            this.f7752f = true;
            return;
        }
        RecyclerView recyclerView = this.f7753g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: c */
    public final void m5670c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f7753g;
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
            interpolator = RecyclerView.f16458T1;
        }
        if (this.f7750d != interpolator) {
            this.f7750d = interpolator;
            this.f7749c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f7748b = 0;
        this.f7747a = 0;
        recyclerView.setScrollState(2);
        this.f7749c.startScroll(0, 0, i, i2, i4);
        m5669b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7753g;
        if (recyclerView.f16512n == null) {
            recyclerView.removeCallbacks(this);
            this.f7749c.abortAnimation();
            return;
        }
        this.f7752f = false;
        this.f7751e = true;
        recyclerView.m10277p();
        OverScroller overScroller = this.f7749c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f7747a;
            int i6 = currY - this.f7748b;
            this.f7747a = currX;
            this.f7748b = currY;
            int iM10234o = RecyclerView.m10234o(i5, recyclerView.f16476I, recyclerView.f16480K, recyclerView.getWidth());
            int iM10234o2 = RecyclerView.m10234o(i6, recyclerView.f16478J, recyclerView.f16482L, recyclerView.getHeight());
            int[] iArr = recyclerView.f16469E1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM10283v = recyclerView.m10283v(iM10234o, iM10234o2, 1, iArr, null);
            int[] iArr2 = recyclerView.f16469E1;
            if (zM10283v) {
                iM10234o -= iArr2[0];
                iM10234o2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m10276n(iM10234o, iM10234o2);
            }
            if (recyclerView.f16511m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m10264f0(iM10234o, iM10234o2, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = iM10234o - i7;
                int i10 = iM10234o2 - i8;
                C8760aj0 c8760aj0 = recyclerView.f16512n.f46817e;
                if (c8760aj0 != null && !c8760aj0.f15640d && c8760aj0.f15641e) {
                    int iM4625b = recyclerView.f16520s1.m4625b();
                    if (iM4625b == 0) {
                        c8760aj0.m9797i();
                    } else if (c8760aj0.f15637a >= iM4625b) {
                        c8760aj0.f15637a = iM4625b - 1;
                        c8760aj0.m9795g(i7, i8);
                    } else {
                        c8760aj0.m9795g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = iM10234o;
                i2 = iM10234o2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f16514p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f16469E1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.m10284w(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.m10285x(i4, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C8760aj0 c8760aj02 = recyclerView.f16512n.f46817e;
            if ((c8760aj02 == null || !c8760aj02.f15640d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.m10287z();
                        if (recyclerView.f16476I.isFinished()) {
                            recyclerView.f16476I.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.m10235A();
                        if (recyclerView.f16480K.isFinished()) {
                            recyclerView.f16480K.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m10236B();
                        if (recyclerView.f16478J.isFinished()) {
                            recyclerView.f16478J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m10286y();
                        if (recyclerView.f16482L.isFinished()) {
                            recyclerView.f16482L.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f16456R1) {
                    C6327ks c6327ks = recyclerView.f16518r1;
                    int[] iArr4 = c6327ks.f36732c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c6327ks.f36733d = 0;
                }
            } else {
                m5669b();
                RunnableC9311f00 runnableC9311f00 = recyclerView.f16516q1;
                if (runnableC9311f00 != null) {
                    runnableC9311f00.m18146a(recyclerView, i4, i11);
                }
            }
        }
        C8760aj0 c8760aj03 = recyclerView.f16512n.f46817e;
        if (c8760aj03 != null && c8760aj03.f15640d) {
            c8760aj03.m9795g(0, 0);
        }
        this.f7751e = false;
        if (!this.f7752f) {
            recyclerView.setScrollState(0);
            recyclerView.m10274l0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            recyclerView.postOnAnimation(this);
        }
    }
}
