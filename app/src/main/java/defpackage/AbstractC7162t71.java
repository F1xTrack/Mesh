package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* renamed from: t71 */
/* loaded from: classes.dex */
public abstract class AbstractC7162t71 extends ViewGroup implements InterfaceC0705Iu0, InterfaceC0627Hu0, InterfaceC0471Fu0 {
    public static final int[] K = {R.attr.enabled};
    public C6017n71 A;
    public C6017n71 B;
    public C6208o71 C;
    public C6208o71 D;
    public boolean E;
    public int F;
    public boolean G;
    public final AnimationAnimationListenerC2563ch0 H;
    public final C6399p71 I;
    public final C6399p71 J;
    public View a;
    public InterfaceC6780r71 b;
    public boolean c;
    public final int d;
    public float e;
    public float f;
    public final C7950xG0 g;
    public final C0549Gu0 h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public final DecelerateInterpolator s;
    public final C4234hs t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public final C6347os z;

    public AbstractC7162t71(S91 s91) {
        super(s91, null);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.u = -1;
        PM0 pm0 = (PM0) this;
        this.H = new AnimationAnimationListenerC2563ch0(2, pm0);
        this.I = new C6399p71(pm0, 0);
        this.J = new C6399p71(pm0, 1);
        this.d = ViewConfiguration.get(s91).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.F = (int) (displayMetrics.density * 40.0f);
        C4234hs c4234hs = new C4234hs(getContext());
        float f = c4234hs.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = c4234hs.getContext().obtainStyledAttributes(JG0.a);
        c4234hs.b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        AbstractC4021gk1.s(c4234hs, f * 4.0f);
        shapeDrawable.getPaint().setColor(c4234hs.b);
        c4234hs.setBackground(shapeDrawable);
        this.t = c4234hs;
        C6347os c6347os = new C6347os(getContext());
        this.z = c6347os;
        c6347os.c(1);
        this.t.setImageDrawable(this.z);
        this.t.setVisibility(8);
        addView(this.t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.x = i;
        this.e = i;
        this.g = new C7950xG0(6);
        this.h = new C0549Gu0(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.F;
        this.n = i2;
        this.w = i2;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = s91.obtainStyledAttributes((AttributeSet) null, K);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.t.getBackground().setAlpha(i);
        this.z.setAlpha(i);
    }

    @Override // defpackage.InterfaceC0627Hu0
    public final void a(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.InterfaceC0705Iu0
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.h.d(i, i2, i3, i4, this.j, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.j[1] : i7) >= 0 || g()) {
            return;
        }
        float fAbs = this.f + Math.abs(r2);
        this.f = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // defpackage.InterfaceC0627Hu0
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        b(view, i, i2, i3, i4, i5, this.k);
    }

    @Override // defpackage.InterfaceC0627Hu0
    public final boolean d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.InterfaceC0627Hu0
    public final void e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.InterfaceC0627Hu0
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final boolean g() {
        View view = this.a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.u;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C7950xG0 c7950xG0 = this.g;
        return c7950xG0.c | c7950xG0.b;
    }

    public int getProgressCircleDiameter() {
        return this.F;
    }

    public int getProgressViewEndOffset() {
        return this.x;
    }

    public int getProgressViewStartOffset() {
        return this.w;
    }

    public final void h() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.t)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.f(0);
    }

    public final void i(float f) {
        if (f > this.e) {
            m(true, true);
            return;
        }
        this.c = false;
        C6347os c6347os = this.z;
        C6156ns c6156ns = c6347os.a;
        c6156ns.e = 0.0f;
        c6156ns.f = 0.0f;
        c6347os.invalidateSelf();
        AnimationAnimationListenerC2563ch0 animationAnimationListenerC2563ch0 = new AnimationAnimationListenerC2563ch0(3, this);
        this.v = this.n;
        C6399p71 c6399p71 = this.J;
        c6399p71.reset();
        c6399p71.setDuration(200L);
        c6399p71.setInterpolator(this.s);
        this.t.a = animationAnimationListenerC2563ch0;
        this.t.clearAnimation();
        this.t.startAnimation(c6399p71);
        C6347os c6347os2 = this.z;
        C6156ns c6156ns2 = c6347os2.a;
        if (c6156ns2.n) {
            c6156ns2.n = false;
        }
        c6347os2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    public final void j(float f) {
        C6208o71 c6208o71;
        C6208o71 c6208o712;
        C6347os c6347os = this.z;
        C6156ns c6156ns = c6347os.a;
        if (!c6156ns.n) {
            c6156ns.n = true;
        }
        c6347os.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.e));
        float fMax = (((float) Math.max(fMin - 0.4d, ConfigValue.DOUBLE_DEFAULT_VALUE)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.e;
        int i = this.y;
        if (i <= 0) {
            i = this.G ? this.x - this.w : this.x;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.w + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.t.getVisibility() != 0) {
            this.t.setVisibility(0);
        }
        this.t.setScaleX(1.0f);
        this.t.setScaleY(1.0f);
        if (f < this.e) {
            if (this.z.a.t > 76 && ((c6208o712 = this.C) == null || !c6208o712.hasStarted() || c6208o712.hasEnded())) {
                C6208o71 c6208o713 = new C6208o71(this, this.z.a.t, 76);
                c6208o713.setDuration(300L);
                C4234hs c4234hs = this.t;
                c4234hs.a = null;
                c4234hs.clearAnimation();
                this.t.startAnimation(c6208o713);
                this.C = c6208o713;
            }
        } else if (this.z.a.t < 255 && ((c6208o71 = this.D) == null || !c6208o71.hasStarted() || c6208o71.hasEnded())) {
            C6208o71 c6208o714 = new C6208o71(this, this.z.a.t, KotlinVersion.MAX_COMPONENT_VALUE);
            c6208o714.setDuration(300L);
            C4234hs c4234hs2 = this.t;
            c4234hs2.a = null;
            c4234hs2.clearAnimation();
            this.t.startAnimation(c6208o714);
            this.D = c6208o714;
        }
        C6347os c6347os2 = this.z;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C6156ns c6156ns2 = c6347os2.a;
        c6156ns2.e = 0.0f;
        c6156ns2.f = fMin2;
        c6347os2.invalidateSelf();
        C6347os c6347os3 = this.z;
        float fMin3 = Math.min(1.0f, fMax);
        C6156ns c6156ns3 = c6347os3.a;
        if (fMin3 != c6156ns3.p) {
            c6156ns3.p = fMin3;
        }
        c6347os3.invalidateSelf();
        C6347os c6347os4 = this.z;
        c6347os4.a.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        c6347os4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.n);
    }

    public final void k(float f) {
        setTargetOffsetTopAndBottom((this.v + ((int) ((this.w - r0) * f))) - this.t.getTop());
    }

    public final void l() {
        this.t.clearAnimation();
        this.z.stop();
        this.t.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        setTargetOffsetTopAndBottom(this.w - this.n);
        this.n = this.t.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.c != z) {
            this.E = z2;
            h();
            this.c = z;
            AnimationAnimationListenerC2563ch0 animationAnimationListenerC2563ch0 = this.H;
            if (!z) {
                C6017n71 c6017n71 = new C6017n71(this, 1);
                this.B = c6017n71;
                c6017n71.setDuration(150L);
                C4234hs c4234hs = this.t;
                c4234hs.a = animationAnimationListenerC2563ch0;
                c4234hs.clearAnimation();
                this.t.startAnimation(this.B);
                return;
            }
            this.v = this.n;
            C6399p71 c6399p71 = this.I;
            c6399p71.reset();
            c6399p71.setDuration(200L);
            c6399p71.setInterpolator(this.s);
            if (animationAnimationListenerC2563ch0 != null) {
                this.t.a = animationAnimationListenerC2563ch0;
            }
            this.t.clearAnimation();
            this.t.startAnimation(c6399p71);
        }
    }

    public final void n(float f) {
        float f2 = this.p;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 <= f4 || this.q) {
            return;
        }
        this.o = f2 + f4;
        this.q = true;
        this.z.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0057  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.h()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L80
            boolean r1 = r5.g()
            if (r1 != 0) goto L80
            boolean r1 = r5.c
            if (r1 != 0) goto L80
            boolean r1 = r5.l
            if (r1 == 0) goto L1d
            goto L80
        L1d:
            if (r0 == 0) goto L5c
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L57
            r4 = 2
            if (r0 == r4) goto L43
            r4 = 3
            if (r0 == r4) goto L57
            r3 = 6
            if (r0 == r3) goto L2d
            goto L7d
        L2d:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.r
            if (r3 != r4) goto L7d
            if (r0 != 0) goto L3c
            r2 = r1
        L3c:
            int r6 = r6.getPointerId(r2)
            r5.r = r6
            goto L7d
        L43:
            int r0 = r5.r
            if (r0 != r3) goto L48
            return r2
        L48:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L4f
            return r2
        L4f:
            float r6 = r6.getY(r0)
            r5.n(r6)
            goto L7d
        L57:
            r5.q = r2
            r5.r = r3
            goto L7d
        L5c:
            int r0 = r5.w
            hs r1 = r5.t
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r5.setTargetOffsetTopAndBottom(r0)
            int r0 = r6.getPointerId(r2)
            r5.r = r0
            r5.q = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L77
            return r2
        L77:
            float r6 = r6.getY(r0)
            r5.p = r6
        L7d:
            boolean r6 = r5.q
            return r6
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7162t71.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.a == null) {
            h();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.t.getMeasuredWidth();
        int measuredHeight2 = this.t.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.n;
        this.t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            h();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.t.measure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        this.u = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.t) {
                this.u = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f = 0.0f;
                } else {
                    this.f = f - f2;
                    iArr[1] = i2;
                }
                j(this.f);
            }
        }
        if (this.G && i2 > 0 && this.f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.t.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        b(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.b = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C6971s71 c6971s71 = (C6971s71) parcelable;
        super.onRestoreInstanceState(c6971s71.getSuperState());
        setRefreshing(c6971s71.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C6971s71(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.b = 0;
        this.l = false;
        float f = this.f;
        if (f > 0.0f) {
            i(f);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || g() || this.c || this.l) {
            return false;
        }
        if (actionMasked == 0) {
            this.r = motionEvent.getPointerId(0);
            this.q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.o) * 0.5f;
                    this.q = false;
                    i(y);
                }
                this.r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                n(y2);
                if (this.q) {
                    float f = (y2 - this.o) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    j(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.r) {
                        this.r = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    public void setAnimationProgress(float f) {
        this.t.setScaleX(f);
        this.t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        C6347os c6347os = this.z;
        C6156ns c6156ns = c6347os.a;
        c6156ns.i = iArr;
        c6156ns.a(0);
        c6156ns.a(0);
        c6347os.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = AbstractC0872Ky.a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0549Gu0 c0549Gu0 = this.h;
        if (c0549Gu0.d) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            AbstractC4021gk1.z(c0549Gu0.c);
        }
        c0549Gu0.d = z;
    }

    public void setOnRefreshListener(InterfaceC6780r71 interfaceC6780r71) {
        this.b = interfaceC6780r71;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(AbstractC0872Ky.a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.c == z) {
            m(z, false);
            return;
        }
        this.c = z;
        setTargetOffsetTopAndBottom((!this.G ? this.x + this.w : this.x) - this.n);
        this.E = false;
        AnimationAnimationListenerC2563ch0 animationAnimationListenerC2563ch0 = this.H;
        this.t.setVisibility(0);
        this.z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        C6017n71 c6017n71 = new C6017n71(this, 0);
        this.A = c6017n71;
        c6017n71.setDuration(this.m);
        if (animationAnimationListenerC2563ch0 != null) {
            this.t.a = animationAnimationListenerC2563ch0;
        }
        this.t.clearAnimation();
        this.t.startAnimation(this.A);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.F = (int) (displayMetrics.density * 56.0f);
            } else {
                this.F = (int) (displayMetrics.density * 40.0f);
            }
            this.t.setImageDrawable(null);
            this.z.c(i);
            this.t.setImageDrawable(this.z);
        }
    }

    public void setSlingshotDistance(int i) {
        this.y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C4234hs c4234hs = this.t;
        c4234hs.bringToFront();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        c4234hs.offsetTopAndBottom(i);
        this.n = c4234hs.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.h(0);
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
    }

    public void setOnChildScrollUpCallback(InterfaceC6590q71 interfaceC6590q71) {
    }
}
