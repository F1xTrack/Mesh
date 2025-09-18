package p000;

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
public final class C4032f6 extends LinearLayout implements InterfaceC6334kz {

    /* renamed from: a */
    public int f27051a;

    /* renamed from: b */
    public int f27052b;

    /* renamed from: c */
    public int f27053c;

    /* renamed from: d */
    public int f27054d;

    /* renamed from: e */
    public boolean f27055e;

    /* renamed from: f */
    public int f27056f;

    /* renamed from: g */
    public C8433Vn1 f27057g;

    /* renamed from: h */
    public boolean f27058h;

    /* renamed from: i */
    public boolean f27059i;

    /* renamed from: j */
    public boolean f27060j;

    /* renamed from: k */
    public boolean f27061k;

    /* renamed from: l */
    public int f27062l;

    /* renamed from: m */
    public WeakReference f27063m;

    /* renamed from: n */
    public final boolean f27064n;

    /* renamed from: o */
    public ValueAnimator f27065o;

    /* renamed from: p */
    public final ValueAnimator.AnimatorUpdateListener f27066p;

    /* renamed from: q */
    public final ArrayList f27067q;

    /* renamed from: r */
    public final long f27068r;

    /* renamed from: s */
    public final TimeInterpolator f27069s;

    /* renamed from: t */
    public int[] f27070t;

    /* renamed from: u */
    public Drawable f27071u;

    /* renamed from: v */
    public Integer f27072v;

    /* renamed from: w */
    public final float f27073w;

    /* renamed from: x */
    public AppBarLayout$Behavior f27074x;

    /* JADX WARN: Finally extract failed */
    public C4032f6(Context context) {
        Integer numValueOf;
        super(AbstractC11256uA1.m25127b(context, null, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), null, R.attr.appBarLayoutStyle);
        this.f27052b = -1;
        this.f27053c = -1;
        this.f27054d = -1;
        this.f27056f = 0;
        this.f27067q = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayM1627d = DJ1.m1627d(context3, null, YJ1.f14243a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayM1627d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM1627d.getResourceId(0, 0)));
            }
            typedArrayM1627d.recycle();
            TypedArray typedArrayM1627d2 = DJ1.m1627d(context2, null, NG0.f7687a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayM1627d2.getDrawable(0);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            setBackground(drawable);
            final ColorStateList colorStateListM7406e = AbstractC8259Se1.m7406e(context2, typedArrayM1627d2, 6);
            this.f27064n = colorStateListM7406e != null;
            final ColorStateList colorStateListM17462a = AbstractC9057d02.m17462a(getBackground());
            if (colorStateListM17462a != null) {
                final C10439no0 c10439no0 = new C10439no0();
                c10439no0.m23238j(colorStateListM17462a);
                if (colorStateListM7406e != null) {
                    Context context4 = getContext();
                    TypedValue typedValueM22072a = AbstractC9900ja1.m22072a(context4, R.attr.colorSurface);
                    if (typedValueM22072a != null) {
                        int i2 = typedValueM22072a.resourceId;
                        numValueOf = Integer.valueOf(i2 != 0 ? AbstractC0691Ky.m4783a(context4, i2) : typedValueM22072a.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.f27066p = new ValueAnimator.AnimatorUpdateListener() { // from class: Y5
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            C4032f6 c4032f6 = this.f14144a;
                            c4032f6.getClass();
                            int iM22234i = AbstractC10036ke1.m22234i(colorStateListM17462a.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListM7406e.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM22234i);
                            C10439no0 c10439no02 = c10439no0;
                            c10439no02.m23238j(colorStateListValueOf);
                            if (c4032f6.f27071u != null && (num2 = c4032f6.f27072v) != null && num2.equals(num)) {
                                AbstractC4173hL.m18805g(c4032f6.f27071u, iM22234i);
                            }
                            ArrayList arrayList = c4032f6.f27067q;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    throw new ClassCastException();
                                }
                                if (c10439no02.f38516a.f37933c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(c10439no0);
                } else {
                    c10439no0.m23236h(context2);
                    this.f27066p = new C1579Z5(this, 0, c10439no0);
                    setBackground(c10439no0);
                }
            }
            this.f27068r = AbstractC10490oB1.m23359d(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f27069s = AbstractC10490oB1.m23360e(context2, R.attr.motionEasingStandardInterpolator, AbstractC6467n5.f38090a);
            if (typedArrayM1627d2.hasValue(4)) {
                m18183d(typedArrayM1627d2.getBoolean(4, false), false, false);
            }
            if (typedArrayM1627d2.hasValue(3)) {
                YJ1.m9256b(this, typedArrayM1627d2.getDimensionPixelSize(3, 0));
            }
            if (i >= 26) {
                if (typedArrayM1627d2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayM1627d2.getBoolean(2, false));
                }
                if (typedArrayM1627d2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayM1627d2.getBoolean(1, false));
                }
            }
            this.f27073w = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f27061k = typedArrayM1627d2.getBoolean(5, false);
            this.f27062l = typedArrayM1627d2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayM1627d2.getDrawable(8));
            typedArrayM1627d2.recycle();
            AbstractC9536gk1.m18626u(this, new C1643a6(0, this));
        } catch (Throwable th) {
            typedArrayM1627d.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public static C3969e6 m18180b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C3969e6 c3969e6 = new C3969e6((LinearLayout.LayoutParams) layoutParams);
            c3969e6.f26540a = 1;
            return c3969e6;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C3969e6 c3969e62 = new C3969e6((ViewGroup.MarginLayoutParams) layoutParams);
            c3969e62.f26540a = 1;
            return c3969e62;
        }
        C3969e6 c3969e63 = new C3969e6(layoutParams);
        c3969e63.f26540a = 1;
        return c3969e63;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public final C3969e6 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3969e6 c3969e6 = new C3969e6(context, attributeSet);
        c3969e6.f26540a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7688b);
        c3969e6.f26540a = typedArrayObtainStyledAttributes.getInt(1, 0);
        c3969e6.f26541b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new C0827N8(3);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            c3969e6.f26542c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return c3969e6;
    }

    /* renamed from: c */
    public final void m18182c() {
        AppBarLayout$Behavior appBarLayout$Behavior = this.f27074x;
        C3907d6 c3907d6M11180z = (appBarLayout$Behavior == null || this.f27052b == -1 || this.f27056f != 0) ? null : appBarLayout$Behavior.m11180z(AbstractC6984v.f44063b, this);
        this.f27052b = -1;
        this.f27053c = -1;
        this.f27054d = -1;
        if (c3907d6M11180z != null) {
            AppBarLayout$Behavior appBarLayout$Behavior2 = this.f27074x;
            if (appBarLayout$Behavior2.f18063m != null) {
                return;
            }
            appBarLayout$Behavior2.f18063m = c3907d6M11180z;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3969e6;
    }

    /* renamed from: d */
    public final void m18183d(boolean z, boolean z2, boolean z3) {
        this.f27056f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f27071u == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f27051a);
        this.f27071u.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f27071u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final boolean m18184e(boolean z) {
        if (this.f27058h || this.f27060j == z) {
            return false;
        }
        this.f27060j = z;
        refreshDrawableState();
        if (getBackground() instanceof C10439no0) {
            if (this.f27064n) {
                m18187h(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            } else if (this.f27061k) {
                float f = this.f27073w;
                m18187h(z ? 0.0f : f, z ? f : 0.0f);
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m18185f(View view) {
        int i;
        if (this.f27063m == null && (i = this.f27062l) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f27062l);
            }
            if (viewFindViewById != null) {
                this.f27063m = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f27063m;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* renamed from: g */
    public final boolean m18186g() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        return !childAt.getFitsSystemWindows();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3969e6();
    }

    public AbstractC6397lz getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior();
        this.f27074x = appBarLayout$Behavior;
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
            int r2 = r11.f27053c
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
            e6 r7 = (p000.C3969e6) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.f26540a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap r7 = p000.AbstractC10944rk1.f41842a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap r7 = p000.AbstractC10944rk1.f41842a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap r9 = p000.AbstractC10944rk1.f41842a
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
            r11.f27053c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4032f6.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.f27054d;
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
                C3969e6 c3969e6 = (C3969e6) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c3969e6).topMargin + ((LinearLayout.LayoutParams) c3969e6).bottomMargin + childAt.getMeasuredHeight();
                int i3 = c3969e6.f26540a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f27054d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f27062l;
    }

    public C10439no0 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C10439no0) {
            return (C10439no0) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
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
        return this.f27056f;
    }

    public Drawable getStatusBarForeground() {
        return this.f27071u;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C8433Vn1 c8433Vn1 = this.f27057g;
        if (c8433Vn1 != null) {
            return c8433Vn1.m8555d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f27052b;
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
                C3969e6 c3969e6 = (C3969e6) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c3969e6.f26540a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c3969e6).topMargin + ((LinearLayout.LayoutParams) c3969e6).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f27052b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public final void m18187h(float f, float f2) {
        ValueAnimator valueAnimator = this.f27065o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f27065o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f27068r);
        this.f27065o.setInterpolator(this.f27069s);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f27066p;
        if (animatorUpdateListener != null) {
            this.f27065o.addUpdateListener(animatorUpdateListener);
        }
        this.f27065o.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C10439no0) {
            AbstractC8593Yp1.m9386b(this, (C10439no0) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f27070t == null) {
            this.f27070t = new int[4];
        }
        int[] iArr = this.f27070t;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f27059i;
        iArr[0] = z ? R.attr.state_liftable : -2130969640;
        iArr[1] = (z && this.f27060j) ? R.attr.state_lifted : -2130969641;
        iArr[2] = z ? R.attr.state_collapsible : -2130969636;
        iArr[3] = (z && this.f27060j) ? R.attr.state_collapsed : -2130969635;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f27063m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27063m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (getFitsSystemWindows() && m18186g()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        m18182c();
        this.f27055e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C3969e6) getChildAt(i5).getLayoutParams()).f26542c != null) {
                this.f27055e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.f27071u;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f27058h) {
            return;
        }
        if (!this.f27061k) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C3969e6) getChildAt(i6).getLayoutParams()).f26540a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.f27059i != z2) {
            this.f27059i = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (getFitsSystemWindows() && m18186g()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = AbstractC7677Gz1.m3204a(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        m18182c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C10439no0) {
            ((C10439no0) background).m23237i(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        m18183d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f27061k = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f27062l = -1;
        if (view != null) {
            this.f27063m = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f27063m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27063m = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f27062l = i;
        WeakReference weakReference = this.f27063m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27063m = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f27058h = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f27071u;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f27071u = drawableMutate;
            if (drawableMutate instanceof C10439no0) {
                numValueOf = Integer.valueOf(((C10439no0) drawableMutate).f38536u);
            } else {
                ColorStateList colorStateListM17462a = AbstractC9057d02.m17462a(drawableMutate);
                if (colorStateListM17462a != null) {
                    numValueOf = Integer.valueOf(colorStateListM17462a.getDefaultColor());
                }
            }
            this.f27072v = numValueOf;
            Drawable drawable3 = this.f27071u;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f27071u.setState(getDrawableState());
                }
                Drawable drawable4 = this.f27071u;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC4236iL.m19004b(drawable4, getLayoutDirection());
                this.f27071u.setVisible(getVisibility() == 0, false);
                this.f27071u.setCallback(this);
            }
            if (this.f27071u != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AbstractC11918zN1.m26394b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        YJ1.m9256b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f27071u;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27071u;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C3969e6();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m18180b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m18180b(layoutParams);
    }
}
