package defpackage;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: f6 */
/* loaded from: classes.dex */
public final class C3708f6 extends LinearLayout implements InterfaceC5604kz {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public C1698Vn1 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public WeakReference m;
    public final boolean n;
    public ValueAnimator o;
    public final ValueAnimator.AnimatorUpdateListener p;
    public final ArrayList q;
    public final long r;
    public final TimeInterpolator s;
    public int[] t;
    public Drawable u;
    public Integer v;
    public final float w;
    public AppBarLayout$Behavior x;

    /* JADX WARN: Finally extract failed */
    public C3708f6(Context context) {
        Integer numValueOf;
        super(AbstractC7362uA1.b(context, null, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), null, R.attr.appBarLayoutStyle);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.q = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = DJ1.d(context3, null, YJ1.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = DJ1.d(context2, null, NG0.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(0);
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            setBackground(drawable);
            final ColorStateList colorStateListE = AbstractC1437Se1.e(context2, typedArrayD2, 6);
            this.n = colorStateListE != null;
            final ColorStateList colorStateListA = AbstractC3308d02.a(getBackground());
            if (colorStateListA != null) {
                final C6145no0 c6145no0 = new C6145no0();
                c6145no0.j(colorStateListA);
                if (colorStateListE != null) {
                    Context context4 = getContext();
                    TypedValue typedValueA = AbstractC5340ja1.a(context4, R.attr.colorSurface);
                    if (typedValueA != null) {
                        int i2 = typedValueA.resourceId;
                        numValueOf = Integer.valueOf(i2 != 0 ? AbstractC0872Ky.a(context4, i2) : typedValueA.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.p = new ValueAnimator.AnimatorUpdateListener() { // from class: Y5
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            C3708f6 c3708f6 = this.a;
                            c3708f6.getClass();
                            int i3 = AbstractC5543ke1.i(colorStateListA.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListE.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
                            C6145no0 c6145no02 = c6145no0;
                            c6145no02.j(colorStateListValueOf);
                            if (c3708f6.u != null && (num2 = c3708f6.v) != null && num2.equals(num)) {
                                AbstractC4135hL.g(c3708f6.u, i3);
                            }
                            ArrayList arrayList = c3708f6.q;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (c6145no02.a.c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(c6145no0);
                } else {
                    c6145no0.h(context2);
                    this.p = new Z5(this, 0, c6145no0);
                    setBackground(c6145no0);
                }
            }
            this.r = AbstractC6220oB1.d(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.s = AbstractC6220oB1.e(context2, R.attr.motionEasingStandardInterpolator, AbstractC6009n5.a);
            if (typedArrayD2.hasValue(4)) {
                d(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                YJ1.b(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            if (i >= 26) {
                if (typedArrayD2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
                }
                if (typedArrayD2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
                }
            }
            this.w = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.k = typedArrayD2.getBoolean(5, false);
            this.l = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            AbstractC4021gk1.u(this, new C2070a6(0, this));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static C3517e6 b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C3517e6 c3517e6 = new C3517e6((LinearLayout.LayoutParams) layoutParams);
            c3517e6.a = 1;
            return c3517e6;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C3517e6 c3517e62 = new C3517e6((ViewGroup.MarginLayoutParams) layoutParams);
            c3517e62.a = 1;
            return c3517e62;
        }
        C3517e6 c3517e63 = new C3517e6(layoutParams);
        c3517e63.a = 1;
        return c3517e63;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public final C3517e6 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3517e6 c3517e6 = new C3517e6(context, attributeSet);
        c3517e6.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.b);
        c3517e6.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        c3517e6.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new N8(3);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            c3517e6.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return c3517e6;
    }

    public final void c() {
        AppBarLayout$Behavior appBarLayout$Behavior = this.x;
        C3327d6 c3327d6Z = (appBarLayout$Behavior == null || this.b == -1 || this.f != 0) ? null : appBarLayout$Behavior.z(AbstractC7516v.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (c3327d6Z != null) {
            AppBarLayout$Behavior appBarLayout$Behavior2 = this.x;
            if (appBarLayout$Behavior2.m != null) {
                return;
            }
            appBarLayout$Behavior2.m = c3327d6Z;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3517e6;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.u == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.u.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z) {
        if (this.h || this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        if (getBackground() instanceof C6145no0) {
            if (this.n) {
                h(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            } else if (this.k) {
                float f = this.w;
                h(z ? 0.0f : f, z ? f : 0.0f);
            }
        }
        return true;
    }

    public final boolean f(View view) {
        int i;
        if (this.m == null && (i = this.l) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.l);
            }
            if (viewFindViewById != null) {
                this.m = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.m;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean g() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        return !childAt.getFitsSystemWindows();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3517e6();
    }

    public AbstractC5795lz getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior();
        this.x = appBarLayout$Behavior;
        return appBarLayout$Behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.c
            r3 = -1
            if (r2 == r3) goto L9
            return r2
        L9:
            int r2 = r11.getChildCount()
            int r2 = r2 + (-1)
            r4 = 0
            r5 = r4
        L11:
            if (r2 < 0) goto L68
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L1e
            goto L66
        L1e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            e6 r7 = (defpackage.C3517e6) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap r7 = defpackage.AbstractC6897rk1.a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap r7 = defpackage.AbstractC6897rk1.a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap r9 = defpackage.AbstractC6897rk1.a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L61
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L61:
            int r5 = r5 + r7
            goto L66
        L63:
            if (r5 <= 0) goto L66
            goto L68
        L66:
            int r2 = r2 + r3
            goto L11
        L68:
            int r0 = java.lang.Math.max(r4, r5)
            r11.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3708f6.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C3517e6 c3517e6 = (C3517e6) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c3517e6).topMargin + ((LinearLayout.LayoutParams) c3517e6).bottomMargin + childAt.getMeasuredHeight();
                int i3 = c3517e6.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.l;
    }

    public C6145no0 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C6145no0) {
            return (C6145no0) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.u;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C1698Vn1 c1698Vn1 = this.g;
        if (c1698Vn1 != null) {
            return c1698Vn1.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C3517e6 c3517e6 = (C3517e6) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c3517e6.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c3517e6).topMargin + ((LinearLayout.LayoutParams) c3517e6).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f, float f2) {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.r);
        this.o.setInterpolator(this.s);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.p;
        if (animatorUpdateListener != null) {
            this.o.addUpdateListener(animatorUpdateListener);
        }
        this.o.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C6145no0) {
            AbstractC1938Yp1.b(this, (C6145no0) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.t == null) {
            this.t = new int[4];
        }
        int[] iArr = this.t;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.i;
        iArr[0] = z ? R.attr.state_liftable : -2130969640;
        iArr[1] = (z && this.j) ? R.attr.state_lifted : -2130969641;
        iArr[2] = z ? R.attr.state_collapsible : -2130969636;
        iArr[3] = (z && this.j) ? R.attr.state_collapsed : -2130969635;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        if (getFitsSystemWindows() && g()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        c();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C3517e6) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.h) {
            return;
        }
        if (!this.k) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C3517e6) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.i != z2) {
            this.i = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            if (getFitsSystemWindows() && g()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = AbstractC0565Gz1.a(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C6145no0) {
            ((C6145no0) background).i(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.k = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.l = -1;
        if (view != null) {
            this.m = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.m = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.l = i;
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.m = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.h = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.u = drawableMutate;
            if (drawableMutate instanceof C6145no0) {
                numValueOf = Integer.valueOf(((C6145no0) drawableMutate).u);
            } else {
                ColorStateList colorStateListA = AbstractC3308d02.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.v = numValueOf;
            Drawable drawable3 = this.u;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                Drawable drawable4 = this.u;
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                AbstractC4326iL.b(drawable4, getLayoutDirection());
                this.u.setVisible(getVisibility() == 0, false);
                this.u.setCallback(this);
            }
            if (this.u != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AbstractC8352zN1.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        YJ1.b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.u;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C3517e6();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
