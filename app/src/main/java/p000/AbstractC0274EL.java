package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: EL */
/* loaded from: classes.dex */
public abstract class AbstractC0274EL extends ViewGroup {

    /* renamed from: D */
    public static final int[] f2608D = {R.attr.colorPrimaryDark};

    /* renamed from: E */
    public static final int[] f2609E = {R.attr.layout_gravity};

    /* renamed from: F */
    public static final boolean f2610F;

    /* renamed from: G */
    public static final boolean f2611G;

    /* renamed from: H */
    public static final boolean f2612H;

    /* renamed from: A */
    public Rect f2613A;

    /* renamed from: B */
    public Matrix f2614B;

    /* renamed from: C */
    public final C7621Fx1 f2615C;

    /* renamed from: a */
    public final C7258zL f2616a;

    /* renamed from: b */
    public float f2617b;

    /* renamed from: c */
    public final int f2618c;

    /* renamed from: d */
    public int f2619d;

    /* renamed from: e */
    public float f2620e;

    /* renamed from: f */
    public final Paint f2621f;

    /* renamed from: g */
    public final C11583wk1 f2622g;

    /* renamed from: h */
    public final C11583wk1 f2623h;

    /* renamed from: i */
    public final C0211DL f2624i;

    /* renamed from: j */
    public final C0211DL f2625j;

    /* renamed from: k */
    public int f2626k;

    /* renamed from: l */
    public boolean f2627l;

    /* renamed from: m */
    public boolean f2628m;

    /* renamed from: n */
    public int f2629n;

    /* renamed from: o */
    public int f2630o;

    /* renamed from: p */
    public int f2631p;

    /* renamed from: q */
    public int f2632q;

    /* renamed from: r */
    public boolean f2633r;

    /* renamed from: s */
    public InterfaceC0022AL f2634s;

    /* renamed from: t */
    public ArrayList f2635t;

    /* renamed from: u */
    public float f2636u;

    /* renamed from: v */
    public float f2637v;

    /* renamed from: w */
    public Drawable f2638w;

    /* renamed from: x */
    public WindowInsets f2639x;

    /* renamed from: y */
    public boolean f2640y;

    /* renamed from: z */
    public final ArrayList f2641z;

    static {
        int i = Build.VERSION.SDK_INT;
        f2610F = true;
        f2611G = true;
        f2612H = i >= 29;
    }

    public AbstractC0274EL(S91 s91) {
        super(s91, null, ru.mes.dnevnik.R.attr.drawerLayoutStyle);
        this.f2616a = new C7258zL(0);
        this.f2619d = -1728053248;
        this.f2621f = new Paint();
        this.f2628m = true;
        this.f2629n = 3;
        this.f2630o = 3;
        this.f2631p = 3;
        this.f2632q = 3;
        this.f2615C = new C7621Fx1(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2618c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0211DL c0211dl = new C0211DL(this, 3);
        this.f2624i = c0211dl;
        C0211DL c0211dl2 = new C0211DL(this, 5);
        this.f2625j = c0211dl2;
        C11583wk1 c11583wk1 = new C11583wk1(getContext(), this, c0211dl);
        c11583wk1.f45055b = (int) (c11583wk1.f45055b * 1.0f);
        this.f2622g = c11583wk1;
        c11583wk1.f45070q = 1;
        c11583wk1.f45067n = f2;
        c0211dl.f1973b = c11583wk1;
        C11583wk1 c11583wk12 = new C11583wk1(getContext(), this, c0211dl2);
        c11583wk12.f45055b = (int) (1.0f * c11583wk12.f45055b);
        this.f2623h = c11583wk12;
        c11583wk12.f45070q = 2;
        c11583wk12.f45067n = f2;
        c0211dl2.f1973b = c11583wk12;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        setImportantForAccessibility(1);
        AbstractC10944rk1.m24482n(this, new C7195yL(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC7132xL());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = s91.obtainStyledAttributes(f2608D);
            try {
                this.f2638w = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = s91.obtainStyledAttributes(null, WG0.f13108a, ru.mes.dnevnik.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f2617b = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f2617b = getResources().getDimension(ru.mes.dnevnik.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f2641z = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: i */
    public static String m2143i(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: j */
    public static boolean m2144j(View view) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    /* renamed from: k */
    public static boolean m2145k(View view) {
        return ((C0085BL) view.getLayoutParams()).f756a == 0;
    }

    /* renamed from: l */
    public static boolean m2146l(View view) {
        if (m2147m(view)) {
            return (((C0085BL) view.getLayoutParams()).f759d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: m */
    public static boolean m2147m(View view) {
        int i = ((C0085BL) view.getLayoutParams()).f756a;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* renamed from: a */
    public final boolean m2148a(int i, View view) {
        return (m2155h(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.f2641z;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!m2147m(childAt)) {
                arrayList2.add(childAt);
            } else if (m2146l(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m2152e() != null || m2147m(view)) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            view.setImportantForAccessibility(1);
        }
        if (f2610F) {
            return;
        }
        AbstractC10944rk1.m24482n(view, this.f2616a);
    }

    /* renamed from: b */
    public final void m2149b(View view) {
        if (!m2147m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0085BL c0085bl = (C0085BL) view.getLayoutParams();
        if (this.f2628m) {
            c0085bl.f757b = 0.0f;
            c0085bl.f759d = 0;
        } else {
            c0085bl.f759d |= 4;
            if (m2148a(3, view)) {
                this.f2622g.m25692r(view, -view.getWidth(), view.getTop());
            } else {
                this.f2623h.m25692r(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* renamed from: c */
    public final void m2150c(boolean z) {
        int childCount = getChildCount();
        boolean zM25692r = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0085BL c0085bl = (C0085BL) childAt.getLayoutParams();
            if (m2147m(childAt) && (!z || c0085bl.f758c)) {
                zM25692r |= m2148a(3, childAt) ? this.f2622g.m25692r(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2623h.m25692r(childAt, getWidth(), childAt.getTop());
                c0085bl.f758c = false;
            }
        }
        C0211DL c0211dl = this.f2624i;
        c0211dl.f1975d.removeCallbacks(c0211dl.f1974c);
        C0211DL c0211dl2 = this.f2625j;
        c0211dl2.f1975d.removeCallbacks(c0211dl2.f1974c);
        if (zM25692r) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0085BL) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C0085BL) getChildAt(i).getLayoutParams()).f757b);
        }
        this.f2620e = fMax;
        boolean zM25681g = this.f2622g.m25681g();
        boolean zM25681g2 = this.f2623h.m25681g();
        if (zM25681g || zM25681g2) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: d */
    public final View m2151d(int i) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2155h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2620e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f2613A == null) {
                this.f2613A = new Rect();
            }
            childAt.getHitRect(this.f2613A);
            if (this.f2613A.contains((int) x, (int) y) && !m2145k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f2614B == null) {
                            this.f2614B = new Matrix();
                        }
                        matrix.invert(this.f2614B);
                        motionEventObtain.transform(this.f2614B);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zM2145k = m2145k(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM2145k) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m2147m(childAt) && childAt.getHeight() >= height) {
                    if (m2148a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f2620e;
        if (f > 0.0f && zM2145k) {
            int i4 = this.f2619d;
            Paint paint = this.f2621f;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    /* renamed from: e */
    public final View m2152e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0085BL) childAt.getLayoutParams()).f759d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final View m2153f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2147m(childAt)) {
                if (!m2147m(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C0085BL) childAt.getLayoutParams()).f757b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public final int m2154g(View view) {
        if (!m2147m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((C0085BL) view.getLayoutParams()).f756a;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.f2629n;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.f2631p : this.f2632q;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.f2630o;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.f2632q : this.f2631p;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.f2631p;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.f2629n : this.f2630o;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.f2632q;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.f2630o : this.f2629n;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0085BL c0085bl = new C0085BL(-1, -1);
        c0085bl.f756a = 0;
        return c0085bl;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0085BL) {
            C0085BL c0085bl = (C0085BL) layoutParams;
            C0085BL c0085bl2 = new C0085BL(c0085bl);
            c0085bl2.f756a = 0;
            c0085bl2.f756a = c0085bl.f756a;
            return c0085bl2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0085BL c0085bl3 = new C0085BL((ViewGroup.MarginLayoutParams) layoutParams);
            c0085bl3.f756a = 0;
            return c0085bl3;
        }
        C0085BL c0085bl4 = new C0085BL(layoutParams);
        c0085bl4.f756a = 0;
        return c0085bl4;
    }

    public float getDrawerElevation() {
        if (f2611G) {
            return this.f2617b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2638w;
    }

    /* renamed from: h */
    public final int m2155h(View view) {
        int i = ((C0085BL) view.getLayoutParams()).f756a;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    /* renamed from: n */
    public final void m2156n(View view) {
        if (!m2147m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0085BL c0085bl = (C0085BL) view.getLayoutParams();
        if (this.f2628m) {
            c0085bl.f757b = 1.0f;
            c0085bl.f759d = 1;
            m2160r(view, true);
            m2159q(view);
        } else {
            c0085bl.f759d |= 2;
            if (m2148a(3, view)) {
                this.f2622g.m25692r(view, 0, view.getTop());
            } else {
                this.f2623h.m25692r(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* renamed from: o */
    public final void m2157o(int i, int i2) {
        View viewM2151d;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f2629n = i;
        } else if (i2 == 5) {
            this.f2630o = i;
        } else if (i2 == 8388611) {
            this.f2631p = i;
        } else if (i2 == 8388613) {
            this.f2632q = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f2622g : this.f2623h).m25675a();
        }
        if (i != 1) {
            if (i == 2 && (viewM2151d = m2151d(absoluteGravity)) != null) {
                m2156n(viewM2151d);
                return;
            }
            return;
        }
        View viewM2151d2 = m2151d(absoluteGravity);
        if (viewM2151d2 != null) {
            m2149b(viewM2151d2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2628m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2628m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2640y || this.f2638w == null) {
            return;
        }
        WindowInsets windowInsets = this.f2639x;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f2638w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2638w.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            wk1 r1 = r8.f2622g
            boolean r2 = r1.m25691q(r9)
            wk1 r3 = r8.f2623h
            boolean r3 = r3.m25691q(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.f45057d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f45064k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f45059f
            r5 = r5[r0]
            float[] r6 = r1.f45057d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f45060g
            r6 = r6[r0]
            float[] r7 = r1.f45058e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f45055b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            DL r9 = r8.f2624i
            GR0 r0 = r9.f1974c
            EL r9 = r9.f1975d
            r9.removeCallbacks(r0)
            DL r9 = r8.f2625j
            GR0 r0 = r9.f1974c
            EL r9 = r9.f1975d
            r9.removeCallbacks(r0)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.m2150c(r3)
            r8.f2633r = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f2636u = r0
            r8.f2637v = r9
            float r5 = r8.f2620e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.m25682h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = m2145k(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f2633r = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            BL r1 = (p000.C0085BL) r1
            boolean r1 = r1.f758c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f2633r
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0274EL.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || m2153f() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM2153f = m2153f();
        if (viewM2153f != null && m2154g(viewM2153f) == 0) {
            m2150c(false);
        }
        return viewM2153f != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.f2627l = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0085BL c0085bl = (C0085BL) childAt.getLayoutParams();
                if (m2145k(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c0085bl).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c0085bl).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0085bl).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2148a(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c0085bl.f757b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (c0085bl.f757b * f3));
                    }
                    boolean z3 = f != c0085bl.f757b ? z2 : false;
                    int i9 = c0085bl.f756a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) c0085bl).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = i10 - ((ViewGroup.MarginLayoutParams) c0085bl).bottomMargin;
                            if (i13 > i14) {
                                i11 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) c0085bl).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) c0085bl).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) c0085bl).bottomMargin);
                    }
                    if (z3) {
                        m2158p(childAt, f);
                    }
                    int i17 = c0085bl.f757b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (f2612H && (rootWindowInsets = getRootWindowInsets()) != null) {
            J80 j80Mo6786i = C8433Vn1.m8551h(null, rootWindowInsets).f12756a.mo6786i();
            C11583wk1 c11583wk1 = this.f2622g;
            c11583wk1.f45068o = Math.max(c11583wk1.f45069p, j80Mo6786i.f5352a);
            C11583wk1 c11583wk12 = this.f2623h;
            c11583wk12.f45068o = Math.max(c11583wk12.f45069p, j80Mo6786i.f5354c);
        }
        this.f2627l = false;
        this.f2628m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0038  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0274EL.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM2151d;
        if (!(parcelable instanceof C0148CL)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0148CL c0148cl = (C0148CL) parcelable;
        super.onRestoreInstanceState(c0148cl.f44064a);
        int i = c0148cl.f1319c;
        if (i != 0 && (viewM2151d = m2151d(i)) != null) {
            m2156n(viewM2151d);
        }
        int i2 = c0148cl.f1320d;
        if (i2 != 3) {
            m2157o(i2, 3);
        }
        int i3 = c0148cl.f1321e;
        if (i3 != 3) {
            m2157o(i3, 5);
        }
        int i4 = c0148cl.f1322f;
        if (i4 != 3) {
            m2157o(i4, 8388611);
        }
        int i5 = c0148cl.f1323g;
        if (i5 != 3) {
            m2157o(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f2611G) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0148CL c0148cl = new C0148CL(super.onSaveInstanceState());
        c0148cl.f1319c = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0085BL c0085bl = (C0085BL) getChildAt(i).getLayoutParams();
            int i2 = c0085bl.f759d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c0148cl.f1319c = c0085bl.f756a;
                break;
            }
        }
        c0148cl.f1320d = this.f2629n;
        c0148cl.f1321e = this.f2630o;
        c0148cl.f1322f = this.f2631p;
        c0148cl.f1323g = this.f2632q;
        return c0148cl;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            wk1 r0 = r6.f2622g
            r0.m25684j(r7)
            wk1 r1 = r6.f2623h
            r1.m25684j(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.m2150c(r3)
            r6.f2633r = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.m25682h(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = m2145k(r4)
            if (r4 == 0) goto L54
            float r4 = r6.f2636u
            float r1 = r1 - r4
            float r4 = r6.f2637v
            float r7 = r7 - r4
            int r0 = r0.f45055b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.m2152e()
            if (r7 == 0) goto L54
            int r7 = r6.m2154g(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.m2150c(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2636u = r0
            r6.f2637v = r7
            r6.f2633r = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0274EL.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m2158p(View view, float f) {
        C0085BL c0085bl = (C0085BL) view.getLayoutParams();
        if (f == c0085bl.f757b) {
            return;
        }
        c0085bl.f757b = f;
        ArrayList arrayList = this.f2635t;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                YJ0 yj0 = (YJ0) ((InterfaceC0022AL) this.f2635t.get(size));
                XJ0 xj0 = yj0.f14241a;
                yj0.f14242b.mo11046g(new C0337FL(OZ1.m6094e(xj0), f, xj0.getId()));
            }
        }
    }

    /* renamed from: q */
    public final void m2159q(View view) {
        C0695L1 c0695l1 = C0695L1.f6460m;
        AbstractC10944rk1.m24479k(c0695l1.m4832a(), view);
        AbstractC10944rk1.m24476h(0, view);
        if (!m2146l(view) || m2154g(view) == 2) {
            return;
        }
        AbstractC10944rk1.m24480l(view, c0695l1, this.f2615C);
    }

    /* renamed from: r */
    public final void m2160r(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2147m(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m2150c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2627l) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f2617b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2147m(childAt)) {
                float f2 = this.f2617b;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC9536gk1.m18624s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0022AL interfaceC0022AL) {
        ArrayList arrayList;
        InterfaceC0022AL interfaceC0022AL2 = this.f2634s;
        if (interfaceC0022AL2 != null && (arrayList = this.f2635t) != null) {
            arrayList.remove(interfaceC0022AL2);
        }
        if (interfaceC0022AL != null) {
            if (this.f2635t == null) {
                this.f2635t = new ArrayList();
            }
            this.f2635t.add(interfaceC0022AL);
        }
        this.f2634s = interfaceC0022AL;
    }

    public void setDrawerLockMode(int i) {
        m2157o(i, 3);
        m2157o(i, 5);
    }

    public void setScrimColor(int i) {
        this.f2619d = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2638w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f2638w = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f2638w = i != 0 ? AbstractC0628Jy.m4480b(getContext(), i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0085BL c0085bl = new C0085BL(context, attributeSet);
        c0085bl.f756a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2609E);
        c0085bl.f756a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return c0085bl;
    }
}
