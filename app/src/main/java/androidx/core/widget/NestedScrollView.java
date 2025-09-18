package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import java.util.WeakHashMap;
import p000.AbstractC10849r02;
import p000.AbstractC10944rk1;
import p000.AbstractC1344VM;
import p000.AbstractC7406Bu0;
import p000.AbstractC9536gk1;
import p000.C0713LJ;
import p000.C11649xG0;
import p000.C7258zL;
import p000.C7510Du0;
import p000.C7666Gu0;
import p000.InterfaceC7458Cu0;
import p000.InterfaceC7614Fu0;
import p000.InterfaceC7770Iu0;
import p000.QQ0;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC7770Iu0, InterfaceC7614Fu0, ScrollingView {

    /* renamed from: B */
    public static final float f16110B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C */
    public static final C7258zL f16111C = new C7258zL(4);

    /* renamed from: D */
    public static final int[] f16112D = {R.attr.fillViewport};

    /* renamed from: A */
    public final C0713LJ f16113A;

    /* renamed from: a */
    public final float f16114a;

    /* renamed from: b */
    public long f16115b;

    /* renamed from: c */
    public final Rect f16116c;

    /* renamed from: d */
    public final OverScroller f16117d;

    /* renamed from: e */
    public final EdgeEffect f16118e;

    /* renamed from: f */
    public final EdgeEffect f16119f;

    /* renamed from: g */
    public int f16120g;

    /* renamed from: h */
    public boolean f16121h;

    /* renamed from: i */
    public boolean f16122i;

    /* renamed from: j */
    public View f16123j;

    /* renamed from: k */
    public boolean f16124k;

    /* renamed from: l */
    public VelocityTracker f16125l;

    /* renamed from: m */
    public boolean f16126m;

    /* renamed from: n */
    public boolean f16127n;

    /* renamed from: o */
    public final int f16128o;

    /* renamed from: p */
    public final int f16129p;

    /* renamed from: q */
    public final int f16130q;

    /* renamed from: r */
    public int f16131r;

    /* renamed from: s */
    public final int[] f16132s;

    /* renamed from: t */
    public final int[] f16133t;

    /* renamed from: u */
    public int f16134u;

    /* renamed from: v */
    public int f16135v;

    /* renamed from: w */
    public C7510Du0 f16136w;

    /* renamed from: x */
    public final C11649xG0 f16137x;

    /* renamed from: y */
    public final C7666Gu0 f16138y;

    /* renamed from: z */
    public float f16139z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.mes.dnevnik.R.attr.nestedScrollViewStyle);
        this.f16116c = new Rect();
        this.f16121h = true;
        this.f16122i = false;
        this.f16123j = null;
        this.f16124k = false;
        this.f16127n = true;
        this.f16131r = -1;
        this.f16132s = new int[2];
        this.f16133t = new int[2];
        this.f16113A = new C0713LJ(getContext(), new QQ0(this));
        int i = Build.VERSION.SDK_INT;
        this.f16118e = i >= 31 ? AbstractC1344VM.m8422a(context, attributeSet) : new EdgeEffect(context);
        this.f16119f = i >= 31 ? AbstractC1344VM.m8422a(context, attributeSet) : new EdgeEffect(context);
        this.f16114a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f16117d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f16128o = viewConfiguration.getScaledTouchSlop();
        this.f16129p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16130q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16112D, ru.mes.dnevnik.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f16137x = new C11649xG0(6);
        this.f16138y = new C7666Gu0(this);
        setNestedScrollingEnabled(true);
        AbstractC10944rk1.m24482n(this, f16111C);
    }

    /* renamed from: m */
    public static boolean m9982m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m9982m((View) parent, nestedScrollView);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: a */
    public final void mo3641a(int i, View view) {
        C11649xG0 c11649xG0 = this.f16137x;
        if (i == 1) {
            c11649xG0.f45509c = 0;
        } else {
            c11649xG0.f45508b = 0;
        }
        m10000y(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p000.InterfaceC7770Iu0
    /* renamed from: b */
    public final void mo4065b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m9990o(i4, i5, iArr);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: c */
    public final void mo3642c(View view, int i, int i2, int i3, int i4, int i5) {
        m9990o(i4, i5, null);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: d */
    public final boolean mo3643d(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m9986j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f16138y.m3191a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f16138y.m3192b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f16138y.m3193c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f16138y.m3194d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f16118e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC7406Bu0.m901a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC7406Bu0.m901a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f16119f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC7406Bu0.m901a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC7406Bu0.m901a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: e */
    public final void mo3644e(View view, View view2, int i, int i2) {
        C11649xG0 c11649xG0 = this.f16137x;
        if (i2 == 1) {
            c11649xG0.f45509c = i;
        } else {
            c11649xG0.f45508b = i;
        }
        m9998w(2, i2);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: f */
    public final void mo3645f(View view, int i, int i2, int[] iArr, int i3) {
        m9985i(i, i2, i3, iArr, null);
    }

    /* renamed from: g */
    public final boolean m9983g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m9989n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m9995t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f16116c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m9995t(m9984h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m9989n(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C11649xG0 c11649xG0 = this.f16137x;
        return c11649xG0.f45509c | c11649xG0.f45508b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f16139z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f16139z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f16139z;
    }

    /* renamed from: h */
    public final int m9984h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f16138y.m3196f(0);
    }

    /* renamed from: i */
    public final boolean m9985i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f16138y.m3193c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f16138y.f3954d;
    }

    /* renamed from: j */
    public final boolean m9986j(KeyEvent keyEvent) {
        this.f16116c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? m9988l(33) : m9983g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? m9988l(130) : m9983g(130);
                }
                if (keyCode == 62) {
                    m9993r(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m9988l(33);
                }
                if (keyCode == 93) {
                    return m9988l(130);
                }
                if (keyCode == 122) {
                    m9993r(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                m9993r(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    /* renamed from: k */
    public final void m9987k(int i) {
        if (getChildCount() > 0) {
            this.f16117d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m9998w(2, 1);
            this.f16135v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final boolean m9988l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f16116c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m9994s(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final boolean m9989n(View view, int i, int i2) {
        Rect rect = this.f16116c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* renamed from: o */
    public final void m9990o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f16138y.m3194d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16122i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ff  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f16121h = false;
        View view = this.f16123j;
        if (view != null && m9982m(view, this)) {
            View view2 = this.f16123j;
            Rect rect = this.f16116c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM9984h = m9984h(rect);
            if (iM9984h != 0) {
                scrollBy(0, iM9984h);
            }
        }
        this.f16123j = null;
        if (!this.f16122i) {
            if (this.f16136w != null) {
                scrollTo(getScrollX(), this.f16136w.f2293a);
                this.f16136w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f16122i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f16126m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m9987k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f16138y.m3192b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m9985i(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m9990o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo3644e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m9989n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7510Du0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7510Du0 c7510Du0 = (C7510Du0) parcelable;
        super.onRestoreInstanceState(c7510Du0.getSuperState());
        this.f16136w = c7510Du0;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C7510Du0 c7510Du0 = new C7510Du0(super.onSaveInstanceState());
        c7510Du0.f2293a = getScrollY();
        return c7510Du0;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m9989n(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f16116c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM9984h = m9984h(rect);
        if (iM9984h != 0) {
            if (this.f16127n) {
                m9997v(0, iM9984h, false);
            } else {
                scrollBy(0, iM9984h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo3643d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo3641a(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f16125l == null) {
            this.f16125l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16134u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f16134u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f16119f;
            EdgeEffect edgeEffect2 = this.f16118e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f16125l;
                velocityTracker.computeCurrentVelocity(1000, this.f16130q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f16131r);
                if (Math.abs(yVelocity) >= this.f16129p) {
                    if (AbstractC10849r02.m24144b(edgeEffect2) != 0.0f) {
                        if (m9996u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m9987k(-yVelocity);
                        }
                    } else if (AbstractC10849r02.m24144b(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (m9996u(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            m9987k(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!this.f16138y.m3192b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m9987k(i2);
                        }
                    }
                } else if (this.f16117d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16131r = -1;
                this.f16124k = false;
                VelocityTracker velocityTracker2 = this.f16125l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f16125l = null;
                }
                m10000y(0);
                this.f16118e.onRelease();
                this.f16119f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f16131r);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f16120g - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (AbstractC10849r02.m24144b(edgeEffect2) != 0.0f) {
                        float f3 = -AbstractC10849r02.m24146d(edgeEffect2, -height, x);
                        if (AbstractC10849r02.m24144b(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (AbstractC10849r02.m24144b(edgeEffect) != 0.0f) {
                        float fM24146d = AbstractC10849r02.m24146d(edgeEffect, height, 1.0f - x);
                        if (AbstractC10849r02.m24144b(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fM24146d;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.f16124k && Math.abs(i4) > this.f16128o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f16124k = true;
                        i4 = i4 > 0 ? i4 - this.f16128o : i4 + this.f16128o;
                    }
                    if (this.f16124k) {
                        int iM9995t = m9995t(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f16120g = y - iM9995t;
                        this.f16134u += iM9995t;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f16124k && getChildCount() > 0 && this.f16117d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16131r = -1;
                this.f16124k = false;
                VelocityTracker velocityTracker3 = this.f16125l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f16125l = null;
                }
                m10000y(0);
                this.f16118e.onRelease();
                this.f16119f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f16120g = (int) motionEvent.getY(actionIndex);
                this.f16131r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m9991p(motionEvent);
                this.f16120g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f16131r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f16124k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f16117d.isFinished()) {
                this.f16117d.abortAnimation();
                m10000y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f16120g = y2;
            this.f16131r = pointerId;
            m9998w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f16125l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final void m9991p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16131r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f16120g = (int) motionEvent.getY(i);
            this.f16131r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f16125l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: q */
    public final boolean m9992q(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            i4 = 0;
            z2 = true;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.f16138y.m3196f(1)) {
            this.f16117d.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        return z || z2;
    }

    /* renamed from: r */
    public final boolean m9993r(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f16116c;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        return m9994s(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f16121h) {
            this.f16123j = view2;
        } else {
            Rect rect = this.f16116c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM9984h = m9984h(rect);
            if (iM9984h != 0) {
                scrollBy(0, iM9984h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM9984h = m9984h(rect);
        boolean z2 = iM9984h != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM9984h);
            } else {
                m9997v(0, iM9984h, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f16125l) != null) {
            velocityTracker.recycle();
            this.f16125l = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f16121h = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0068  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9994s(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.m9995t(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m9994s(int, int, int):boolean");
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f16126m) {
            this.f16126m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C7666Gu0 c7666Gu0 = this.f16138y;
        if (c7666Gu0.f3954d) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18631z(c7666Gu0.f3953c);
        }
        c7666Gu0.f3954d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f16127n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f16138y.m3197g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m10000y(0);
    }

    /* renamed from: t */
    public final int m9995t(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            m9998w(2, i3);
        }
        boolean zM3193c = this.f16138y.m3193c(0, i, i3, this.f16133t, this.f16132s);
        int[] iArr = this.f16133t;
        int[] iArr2 = this.f16132s;
        if (zM3193c) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = m9992q(i4, 0, scrollY, scrollRange) && !this.f16138y.m3196f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f16138y.m3194d(0, scrollY2, 0, i4 - scrollY2, this.f16132s, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f16119f;
        EdgeEffect edgeEffect2 = this.f16118e;
        if (i8 < 0) {
            if (z3) {
                AbstractC10849r02.m24146d(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            AbstractC10849r02.m24146d(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2 && i3 == 0 && (velocityTracker = this.f16125l) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m10000y(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    /* renamed from: u */
    public final boolean m9996u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM24144b = AbstractC10849r02.m24144b(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f16114a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f16110B;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM24144b;
    }

    /* renamed from: v */
    public final void m9997v(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f16115b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f16117d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                m9998w(2, 1);
            } else {
                m10000y(1);
            }
            this.f16135v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f16117d.isFinished()) {
                this.f16117d.abortAnimation();
                m10000y(1);
            }
            scrollBy(i, i2);
        }
        this.f16115b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: w */
    public final void m9998w(int i, int i2) {
        this.f16138y.m3197g(2, i2);
    }

    /* renamed from: x */
    public final boolean m9999x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f16118e;
        if (AbstractC10849r02.m24144b(edgeEffect) != 0.0f) {
            AbstractC10849r02.m24146d(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f16119f;
        if (AbstractC10849r02.m24144b(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC10849r02.m24146d(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: y */
    public final void m10000y(int i) {
        this.f16138y.m3198h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC7458Cu0 interfaceC7458Cu0) {
    }
}
