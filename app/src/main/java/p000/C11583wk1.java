package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: wk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11583wk1 {

    /* renamed from: x */
    public static final InterpolatorC10771qO0 f45053x = new InterpolatorC10771qO0(1);

    /* renamed from: a */
    public int f45054a;

    /* renamed from: b */
    public int f45055b;

    /* renamed from: d */
    public float[] f45057d;

    /* renamed from: e */
    public float[] f45058e;

    /* renamed from: f */
    public float[] f45059f;

    /* renamed from: g */
    public float[] f45060g;

    /* renamed from: h */
    public int[] f45061h;

    /* renamed from: i */
    public int[] f45062i;

    /* renamed from: j */
    public int[] f45063j;

    /* renamed from: k */
    public int f45064k;

    /* renamed from: l */
    public VelocityTracker f45065l;

    /* renamed from: m */
    public final float f45066m;

    /* renamed from: n */
    public float f45067n;

    /* renamed from: o */
    public int f45068o;

    /* renamed from: p */
    public final int f45069p;

    /* renamed from: q */
    public int f45070q;

    /* renamed from: r */
    public final OverScroller f45071r;

    /* renamed from: s */
    public final F02 f45072s;

    /* renamed from: t */
    public View f45073t;

    /* renamed from: u */
    public boolean f45074u;

    /* renamed from: v */
    public final ViewGroup f45075v;

    /* renamed from: c */
    public int f45056c = -1;

    /* renamed from: w */
    public final RunnableC10431nk0 f45076w = new RunnableC10431nk0(12, this);

    public C11583wk1(Context context, ViewGroup viewGroup, F02 f02) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (f02 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f45075v = viewGroup;
        this.f45072s = f02;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f45069p = i;
        this.f45068o = i;
        this.f45055b = viewConfiguration.getScaledTouchSlop();
        this.f45066m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f45067n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f45071r = new OverScroller(context, f45053x);
    }

    /* renamed from: a */
    public final void m25675a() {
        this.f45056c = -1;
        float[] fArr = this.f45057d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f45058e, 0.0f);
            Arrays.fill(this.f45059f, 0.0f);
            Arrays.fill(this.f45060g, 0.0f);
            Arrays.fill(this.f45061h, 0);
            Arrays.fill(this.f45062i, 0);
            Arrays.fill(this.f45063j, 0);
            this.f45064k = 0;
        }
        VelocityTracker velocityTracker = this.f45065l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f45065l = null;
        }
    }

    /* renamed from: b */
    public final void m25676b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f45075v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f45073t = view;
        this.f45056c = i;
        this.f45072s.mo1640h(i, view);
        m25689o(1);
    }

    /* renamed from: c */
    public final boolean m25677c(float f, int i, float f2, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f45061h[i] & i2) != i2 || (this.f45070q & i2) == 0 || (this.f45063j[i] & i2) == i2 || (this.f45062i[i] & i2) == i2) {
            return false;
        }
        float f3 = this.f45055b;
        if (fAbs <= f3 && fAbs2 <= f3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f45072s.getClass();
        }
        return (this.f45062i[i] & i2) == 0 && fAbs > ((float) this.f45055b);
    }

    /* renamed from: d */
    public final boolean m25678d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        F02 f02 = this.f45072s;
        boolean z = f02.mo1637d(view) > 0;
        boolean z2 = f02.mo2483e() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f45055b) : z2 && Math.abs(f2) > ((float) this.f45055b);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f45055b;
        return f3 > ((float) (i * i));
    }

    /* renamed from: e */
    public final void m25679e(int i) {
        float[] fArr = this.f45057d;
        if (fArr != null) {
            int i2 = this.f45064k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f45058e[i] = 0.0f;
                this.f45059f[i] = 0.0f;
                this.f45060g[i] = 0.0f;
                this.f45061h[i] = 0;
                this.f45062i[i] = 0;
                this.f45063j[i] = 0;
                this.f45064k = (~i3) & i2;
            }
        }
    }

    /* renamed from: f */
    public final int m25680f(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f45075v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: g */
    public final boolean m25681g() {
        if (this.f45054a == 2) {
            OverScroller overScroller = this.f45071r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f45073t.getLeft();
            int top = currY - this.f45073t.getTop();
            if (left != 0) {
                View view = this.f45073t;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f45073t;
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f45072s.mo1642j(this.f45073t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f45075v.post(this.f45076w);
            }
        }
        return this.f45054a == 2;
    }

    /* renamed from: h */
    public final View m25682h(int i, int i2) {
        ViewGroup viewGroup = this.f45075v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f45072s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m25683i(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f45073t.getLeft();
        int top = this.f45073t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f45071r;
        int i7 = 0;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m25689o(0);
            return false;
        }
        View view = this.f45073t;
        int i8 = (int) this.f45067n;
        int i9 = (int) this.f45066m;
        int iAbs = Math.abs(i3);
        if (iAbs < i8) {
            i3 = 0;
        } else if (iAbs > i9) {
            i3 = i3 > 0 ? i9 : -i9;
        }
        int i10 = (int) this.f45067n;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i10) {
            i4 = i7;
        } else if (iAbs2 > i9) {
            if (i4 > 0) {
                i4 = i9;
            } else {
                i7 = -i9;
                i4 = i7;
            }
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i11 = iAbs5 + iAbs6;
        int i12 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i11;
        } else {
            f = iAbs3;
            f2 = i12;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i11;
        } else {
            f3 = iAbs4;
            f4 = i12;
        }
        float f6 = f3 / f4;
        F02 f02 = this.f45072s;
        overScroller.startScroll(left, top, i5, i6, (int) ((m25680f(i6, i4, f02.mo2483e()) * f6) + (m25680f(i5, i3, f02.mo1637d(view)) * f5)));
        m25689o(2);
        return true;
    }

    /* renamed from: j */
    public final void m25684j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m25675a();
        }
        if (this.f45065l == null) {
            this.f45065l = VelocityTracker.obtain();
        }
        this.f45065l.addMovement(motionEvent);
        F02 f02 = this.f45072s;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM25682h = m25682h((int) x, (int) y);
            m25687m(pointerId, x, y);
            m25693s(pointerId, viewM25682h);
            if ((this.f45061h[pointerId] & this.f45070q) != 0) {
                f02.mo1639g();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f45054a == 1) {
                m25685k();
            }
            m25675a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f45054a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if ((this.f45064k & (1 << pointerId2)) != 0) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x2 - this.f45057d[pointerId2];
                        float f2 = y2 - this.f45058e[pointerId2];
                        m25686l(pointerId2, f, f2);
                        if (this.f45054a == 1) {
                            break;
                        }
                        View viewM25682h2 = m25682h((int) x2, (int) y2);
                        if (m25678d(viewM25682h2, f, f2) && m25693s(pointerId2, viewM25682h2)) {
                            break;
                        }
                    }
                }
                m25688n(motionEvent);
                return;
            }
            int i3 = this.f45056c;
            if (((this.f45064k & (1 << i3)) == 0 ? 0 : 1) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i3);
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f45059f;
            int i4 = this.f45056c;
            int i5 = (int) (x3 - fArr[i4]);
            int i6 = (int) (y3 - this.f45060g[i4]);
            int left = this.f45073t.getLeft() + i5;
            int top = this.f45073t.getTop() + i6;
            int left2 = this.f45073t.getLeft();
            int top2 = this.f45073t.getTop();
            if (i5 != 0) {
                left = f02.mo1635a(left, this.f45073t);
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                this.f45073t.offsetLeftAndRight(left - left2);
            }
            if (i6 != 0) {
                top = f02.mo1636b(top, this.f45073t);
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                this.f45073t.offsetTopAndBottom(top - top2);
            }
            if (i5 != 0 || i6 != 0) {
                f02.mo1642j(this.f45073t, left, top);
            }
            m25688n(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f45054a == 1) {
                this.f45074u = true;
                f02.mo1643k(this.f45073t, 0.0f, 0.0f);
                this.f45074u = false;
                if (this.f45054a == 1) {
                    m25689o(0);
                }
            }
            m25675a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m25687m(pointerId3, x4, y4);
            if (this.f45054a == 0) {
                m25693s(pointerId3, m25682h((int) x4, (int) y4));
                if ((this.f45061h[pointerId3] & this.f45070q) != 0) {
                    f02.mo1639g();
                    return;
                }
                return;
            }
            int i7 = (int) x4;
            int i8 = (int) y4;
            View view = this.f45073t;
            if ((view != null ? (i7 < view.getLeft() || i7 >= view.getRight() || i8 < view.getTop() || i8 >= view.getBottom()) ? 0 : 1 : 0) != 0) {
                m25693s(pointerId3, this.f45073t);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f45054a == 1 && pointerId4 == this.f45056c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i);
                if (pointerId5 != this.f45056c) {
                    View viewM25682h3 = m25682h((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                    View view2 = this.f45073t;
                    if (viewM25682h3 == view2 && m25693s(pointerId5, view2)) {
                        i = this.f45056c;
                        break;
                    }
                }
                i++;
            }
            if (i == -1) {
                m25685k();
            }
        }
        m25679e(pointerId4);
    }

    /* renamed from: k */
    public final void m25685k() {
        VelocityTracker velocityTracker = this.f45065l;
        float f = this.f45066m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f45065l.getXVelocity(this.f45056c);
        float f2 = this.f45067n;
        float fAbs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f45065l.getYVelocity(this.f45056c);
        float f4 = this.f45067n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f4) {
            if (fAbs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.f45074u = true;
        this.f45072s.mo1643k(this.f45073t, xVelocity, f3);
        this.f45074u = false;
        if (this.f45054a == 1) {
            m25689o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v3, types: [F02] */
    /* renamed from: l */
    public final void m25686l(int i, float f, float f2) {
        boolean zM25677c = m25677c(f, i, f2, 1);
        boolean z = zM25677c;
        if (m25677c(f2, i, f, 4)) {
            z = (zM25677c ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (m25677c(f, i, f2, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (m25677c(f2, i, f, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.f45062i;
            iArr[i] = iArr[i] | r0;
            this.f45072s.mo1638f(r0, i);
        }
    }

    /* renamed from: m */
    public final void m25687m(int i, float f, float f2) {
        float[] fArr = this.f45057d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f45058e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f45059f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f45060g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f45061h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f45062i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f45063j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f45057d = fArr2;
            this.f45058e = fArr3;
            this.f45059f = fArr4;
            this.f45060g = fArr5;
            this.f45061h = iArr;
            this.f45062i = iArr2;
            this.f45063j = iArr3;
        }
        float[] fArr9 = this.f45057d;
        this.f45059f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f45058e;
        this.f45060g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f45061h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f45075v;
        int i5 = i3 < viewGroup.getLeft() + this.f45068o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f45068o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f45068o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f45068o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f45064k = (1 << i) | this.f45064k;
    }

    /* renamed from: n */
    public final void m25688n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f45064k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f45059f[pointerId] = x;
                this.f45060g[pointerId] = y;
            }
        }
    }

    /* renamed from: o */
    public final void m25689o(int i) {
        this.f45075v.removeCallbacks(this.f45076w);
        if (this.f45054a != i) {
            this.f45054a = i;
            this.f45072s.mo1641i(i);
            if (this.f45054a == 0) {
                this.f45073t = null;
            }
        }
    }

    /* renamed from: p */
    public final boolean m25690p(int i, int i2) {
        if (this.f45074u) {
            return m25683i(i, i2, (int) this.f45065l.getXVelocity(this.f45056c), (int) this.f45065l.getYVelocity(this.f45056c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m25691q(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11583wk1.m25691q(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final boolean m25692r(View view, int i, int i2) {
        this.f45073t = view;
        this.f45056c = -1;
        boolean zM25683i = m25683i(i, i2, 0, 0);
        if (!zM25683i && this.f45054a == 0 && this.f45073t != null) {
            this.f45073t = null;
        }
        return zM25683i;
    }

    /* renamed from: s */
    public final boolean m25693s(int i, View view) {
        if (view == this.f45073t && this.f45056c == i) {
            return true;
        }
        if (view == null || !this.f45072s.mo1644l(i, view)) {
            return false;
        }
        this.f45056c = i;
        m25676b(i, view);
        return true;
    }
}
