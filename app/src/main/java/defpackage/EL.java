package defpackage;

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

/* loaded from: classes.dex */
public abstract class EL extends ViewGroup {
    public static final int[] D = {R.attr.colorPrimaryDark};
    public static final int[] E = {R.attr.layout_gravity};
    public static final boolean F;
    public static final boolean G;
    public static final boolean H;
    public Rect A;
    public Matrix B;
    public final C0481Fx1 C;
    public final C8344zL a;
    public float b;
    public final int c;
    public int d;
    public float e;
    public final Paint f;
    public final C7851wk1 g;
    public final C7851wk1 h;
    public final DL i;
    public final DL j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public AL s;
    public ArrayList t;
    public float u;
    public float v;
    public Drawable w;
    public WindowInsets x;
    public boolean y;
    public final ArrayList z;

    static {
        int i = Build.VERSION.SDK_INT;
        F = true;
        G = true;
        H = i >= 29;
    }

    public EL(S91 s91) {
        super(s91, null, ru.mes.dnevnik.R.attr.drawerLayoutStyle);
        this.a = new C8344zL(0);
        this.d = -1728053248;
        this.f = new Paint();
        this.m = true;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.C = new C0481Fx1(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        DL dl = new DL(this, 3);
        this.i = dl;
        DL dl2 = new DL(this, 5);
        this.j = dl2;
        C7851wk1 c7851wk1 = new C7851wk1(getContext(), this, dl);
        c7851wk1.b = (int) (c7851wk1.b * 1.0f);
        this.g = c7851wk1;
        c7851wk1.q = 1;
        c7851wk1.n = f2;
        dl.b = c7851wk1;
        C7851wk1 c7851wk12 = new C7851wk1(getContext(), this, dl2);
        c7851wk12.b = (int) (1.0f * c7851wk12.b);
        this.h = c7851wk12;
        c7851wk12.q = 2;
        c7851wk12.n = f2;
        dl2.b = c7851wk12;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        setImportantForAccessibility(1);
        AbstractC6897rk1.n(this, new C8154yL(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC7964xL());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = s91.obtainStyledAttributes(D);
            try {
                this.w = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = s91.obtainStyledAttributes(null, WG0.a, ru.mes.dnevnik.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.b = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.b = getResources().getDimension(ru.mes.dnevnik.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.z = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String i(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean j(View view) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean k(View view) {
        return ((BL) view.getLayoutParams()).a == 0;
    }

    public static boolean l(View view) {
        if (m(view)) {
            return (((BL) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean m(View view) {
        int i = ((BL) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(int i, View view) {
        return (h(view) & i) == i;
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
            arrayList2 = this.z;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!m(childAt)) {
                arrayList2.add(childAt);
            } else if (l(childAt)) {
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
        if (e() != null || m(view)) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
            view.setImportantForAccessibility(1);
        }
        if (F) {
            return;
        }
        AbstractC6897rk1.n(view, this.a);
    }

    public final void b(View view) {
        if (!m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        BL bl = (BL) view.getLayoutParams();
        if (this.m) {
            bl.b = 0.0f;
            bl.d = 0;
        } else {
            bl.d |= 4;
            if (a(3, view)) {
                this.g.r(view, -view.getWidth(), view.getTop());
            } else {
                this.h.r(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void c(boolean z) {
        int childCount = getChildCount();
        boolean zR = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            BL bl = (BL) childAt.getLayoutParams();
            if (m(childAt) && (!z || bl.c)) {
                zR |= a(3, childAt) ? this.g.r(childAt, -childAt.getWidth(), childAt.getTop()) : this.h.r(childAt, getWidth(), childAt.getTop());
                bl.c = false;
            }
        }
        DL dl = this.i;
        dl.d.removeCallbacks(dl.c);
        DL dl2 = this.j;
        dl2.d.removeCallbacks(dl2.c);
        if (zR) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof BL) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((BL) getChildAt(i).getLayoutParams()).b);
        }
        this.e = fMax;
        boolean zG = this.g.g();
        boolean zG2 = this.h.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.e <= 0.0f) {
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
            if (this.A == null) {
                this.A = new Rect();
            }
            childAt.getHitRect(this.A);
            if (this.A.contains((int) x, (int) y) && !k(childAt)) {
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
                        if (this.B == null) {
                            this.B = new Matrix();
                        }
                        matrix.invert(this.B);
                        motionEventObtain.transform(this.B);
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
        boolean zK = k(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zK) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
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
        float f = this.e;
        if (f > 0.0f && zK) {
            int i4 = this.d;
            Paint paint = this.f;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((BL) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m(childAt)) {
                if (!m(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((BL) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int g(View view) {
        if (!m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((BL) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.n;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.p : this.q;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.o;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.q : this.p;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.p;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.n : this.o;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.q;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.o : this.n;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        BL bl = new BL(-1, -1);
        bl.a = 0;
        return bl;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof BL) {
            BL bl = (BL) layoutParams;
            BL bl2 = new BL(bl);
            bl2.a = 0;
            bl2.a = bl.a;
            return bl2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            BL bl3 = new BL((ViewGroup.MarginLayoutParams) layoutParams);
            bl3.a = 0;
            return bl3;
        }
        BL bl4 = new BL(layoutParams);
        bl4.a = 0;
        return bl4;
    }

    public float getDrawerElevation() {
        if (G) {
            return this.b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.w;
    }

    public final int h(View view) {
        int i = ((BL) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    public final void n(View view) {
        if (!m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        BL bl = (BL) view.getLayoutParams();
        if (this.m) {
            bl.b = 1.0f;
            bl.d = 1;
            r(view, true);
            q(view);
        } else {
            bl.d |= 2;
            if (a(3, view)) {
                this.g.r(view, 0, view.getTop());
            } else {
                this.h.r(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void o(int i, int i2) {
        View viewD;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.n = i;
        } else if (i2 == 5) {
            this.o = i;
        } else if (i2 == 8388611) {
            this.p = i;
        } else if (i2 == 8388613) {
            this.q = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.g : this.h).a();
        }
        if (i != 1) {
            if (i == 2 && (viewD = d(absoluteGravity)) != null) {
                n(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.y || this.w == null) {
            return;
        }
        WindowInsets windowInsets = this.x;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.w.draw(canvas);
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
            wk1 r1 = r8.g
            boolean r2 = r1.q(r9)
            wk1 r3 = r8.h
            boolean r3 = r3.q(r9)
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
            float[] r9 = r1.d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f
            r5 = r5[r0]
            float[] r6 = r1.d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.g
            r6 = r6[r0]
            float[] r7 = r1.e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            DL r9 = r8.i
            GR0 r0 = r9.c
            EL r9 = r9.d
            r9.removeCallbacks(r0)
            DL r9 = r8.j
            GR0 r0 = r9.c
            EL r9 = r9.d
            r9.removeCallbacks(r0)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.c(r3)
            r8.r = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.u = r0
            r8.v = r9
            float r5 = r8.e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = k(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.r = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            BL r1 = (defpackage.BL) r1
            boolean r1 = r1.c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.r
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EL.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || f() == null) {
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
        View viewF = f();
        if (viewF != null && g(viewF) == 0) {
            c(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.l = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                BL bl = (BL) childAt.getLayoutParams();
                if (k(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) bl).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) bl).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bl).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (bl.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (bl.b * f3));
                    }
                    boolean z3 = f != bl.b ? z2 : false;
                    int i9 = bl.a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) bl).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = i10 - ((ViewGroup.MarginLayoutParams) bl).bottomMargin;
                            if (i13 > i14) {
                                i11 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) bl).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) bl).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) bl).bottomMargin);
                    }
                    if (z3) {
                        p(childAt, f);
                    }
                    int i17 = bl.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (H && (rootWindowInsets = getRootWindowInsets()) != null) {
            J80 j80I = C1698Vn1.h(null, rootWindowInsets).a.i();
            C7851wk1 c7851wk1 = this.g;
            c7851wk1.o = Math.max(c7851wk1.p, j80I.a);
            C7851wk1 c7851wk12 = this.h;
            c7851wk12.o = Math.max(c7851wk12.p, j80I.c);
        }
        this.l = false;
        this.m = false;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EL.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof CL)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CL cl2 = (CL) parcelable;
        super.onRestoreInstanceState(cl2.a);
        int i = cl2.c;
        if (i != 0 && (viewD = d(i)) != null) {
            n(viewD);
        }
        int i2 = cl2.d;
        if (i2 != 3) {
            o(i2, 3);
        }
        int i3 = cl2.e;
        if (i3 != 3) {
            o(i3, 5);
        }
        int i4 = cl2.f;
        if (i4 != 3) {
            o(i4, 8388611);
        }
        int i5 = cl2.g;
        if (i5 != 3) {
            o(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (G) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CL cl2 = new CL(super.onSaveInstanceState());
        cl2.c = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            BL bl = (BL) getChildAt(i).getLayoutParams();
            int i2 = bl.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                cl2.c = bl.a;
                break;
            }
        }
        cl2.d = this.n;
        cl2.e = this.o;
        cl2.f = this.p;
        cl2.g = this.q;
        return cl2;
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
            wk1 r0 = r6.g
            r0.j(r7)
            wk1 r1 = r6.h
            r1.j(r7)
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
            r6.c(r3)
            r6.r = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = k(r4)
            if (r4 == 0) goto L54
            float r4 = r6.u
            float r1 = r1 - r4
            float r4 = r6.v
            float r7 = r7 - r4
            int r0 = r0.b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L54
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.c(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.u = r0
            r6.v = r7
            r6.r = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EL.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view, float f) {
        BL bl = (BL) view.getLayoutParams();
        if (f == bl.b) {
            return;
        }
        bl.b = f;
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                YJ0 yj0 = (YJ0) ((AL) this.t.get(size));
                XJ0 xj0 = yj0.a;
                yj0.b.g(new FL(OZ1.e(xj0), f, xj0.getId()));
            }
        }
    }

    public final void q(View view) {
        L1 l1 = L1.m;
        AbstractC6897rk1.k(l1.a(), view);
        AbstractC6897rk1.h(0, view);
        if (!l(view) || g(view) == 2) {
            return;
        }
        AbstractC6897rk1.l(view, l1, this.C);
    }

    public final void r(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m(childAt)) {
                float f2 = this.b;
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                AbstractC4021gk1.s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(AL al) {
        ArrayList arrayList;
        AL al2 = this.s;
        if (al2 != null && (arrayList = this.t) != null) {
            arrayList.remove(al2);
        }
        if (al != null) {
            if (this.t == null) {
                this.t = new ArrayList();
            }
            this.t.add(al);
        }
        this.s = al;
    }

    public void setDrawerLockMode(int i) {
        o(i, 3);
        o(i, 5);
    }

    public void setScrimColor(int i) {
        this.d = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.w = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.w = i != 0 ? AbstractC0794Jy.b(getContext(), i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        BL bl = new BL(context, attributeSet);
        bl.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E);
        bl.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return bl;
    }
}
