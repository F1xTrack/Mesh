package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.AS;
import defpackage.AbstractC1968Yz1;
import defpackage.AbstractC3393dS;
import defpackage.AbstractC6792rB1;
import defpackage.AbstractC8235ym;
import defpackage.C0333Ea0;
import defpackage.C1453Sk;
import defpackage.C2262b60;
import defpackage.C5554ki0;
import defpackage.C6168nw;
import defpackage.C7463ui0;
import defpackage.C8231yk1;
import defpackage.EnumC0824Ki;
import defpackage.InterfaceC1649Ux0;
import defpackage.InterfaceC4330iM0;
import defpackage.InterfaceC5873mN0;
import defpackage.InterfaceC7418uT0;
import defpackage.InterfaceC7962xK0;
import defpackage.O90;
import defpackage.OJ0;
import defpackage.PJ0;
import defpackage.R02;
import defpackage.SK0;
import defpackage.UN1;
import defpackage.ViewOnLayoutChangeListenerC4333iN0;
import defpackage.XB0;
import defpackage.YL0;
import defpackage.YQ1;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* loaded from: classes.dex */
public class a extends ViewGroup implements SK0, OJ0, InterfaceC4330iM0, InterfaceC7962xK0, InterfaceC5873mN0, YL0 {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private C1453Sk mCSSBackgroundDrawable;
    private ViewOnLayoutChangeListenerC4333iN0 mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private C8231yk1 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private boolean mNeedsOffscreenAlphaCompositing;
    private InterfaceC1649Ux0 mOnInterceptTouchEventListener;
    private String mOverflow;
    private final Rect mOverflowInset;
    private Path mPath;
    private XB0 mPointerEvents;
    private boolean mRemoveClippedSubviews;

    public a(Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        i();
    }

    public static void d(a aVar, View view) {
        if (!aVar.mRemoveClippedSubviews || aVar.getParent() == null) {
            return;
        }
        UN1.c(aVar.mClippingRect);
        UN1.c(aVar.mAllChildren);
        Rect rect = sHelperRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (aVar.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i = 0;
            for (int i2 = 0; i2 < aVar.mAllChildrenCount; i2++) {
                View view2 = aVar.mAllChildren[i2];
                if (view2 == view) {
                    aVar.k(aVar.mClippingRect, i2, i);
                    return;
                } else {
                    if (view2.getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    private C8231yk1 getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new C8231yk1(this);
        }
        return this.mDrawingOrderHelper;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g(view);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        g(view);
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            f(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e) {
            InterfaceC7418uT0 interfaceC7418uT0B = YQ1.b(this);
            if (interfaceC7418uT0B != null) {
                interfaceC7418uT0B.b(e);
            } else {
                if (!(getContext() instanceof ReactContext)) {
                    throw e;
                }
                ((ReactContext) getContext()).handleException(new C2262b60("StackOverflowException", this, e));
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (XB0.b(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException unused) {
            AbstractC3393dS.h("ReactNative");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = view.getElevation() > 0.0f;
        if (z) {
            C5554ki0.a(canvas, true);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (z) {
            C5554ki0.a(canvas, false);
        }
        return zDrawChild;
    }

    public final boolean e() {
        return getId() != -1 && R02.b(getId()) == 2;
    }

    public final void f(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        String str = this.mOverflow;
        if (str != null) {
            str.getClass();
            switch (str) {
                case "hidden":
                case "scroll":
                    float width = getWidth();
                    float height = getHeight();
                    C1453Sk c1453Sk = this.mCSSBackgroundDrawable;
                    float f3 = 0.0f;
                    if (c1453Sk != null) {
                        RectF rectFD = c1453Sk.d();
                        float f4 = rectFD.top;
                        if (f4 > 0.0f || rectFD.left > 0.0f || rectFD.bottom > 0.0f || rectFD.right > 0.0f) {
                            f2 = rectFD.left + 0.0f;
                            f = f4 + 0.0f;
                            width -= rectFD.right;
                            height -= rectFD.bottom;
                        } else {
                            f = 0.0f;
                            f2 = 0.0f;
                        }
                        C6168nw c6168nw = this.mCSSBackgroundDrawable.x;
                        float f5 = c6168nw.a;
                        float f6 = c6168nw.d;
                        float f7 = c6168nw.c;
                        float f8 = c6168nw.b;
                        if (f5 > 0.0f || f8 > 0.0f || f7 > 0.0f || f6 > 0.0f) {
                            if (this.mPath == null) {
                                this.mPath = new Path();
                            }
                            this.mPath.rewind();
                            Path path = this.mPath;
                            RectF rectF = new RectF(f2, f, width, height);
                            float f9 = rectFD.left;
                            float f10 = c6168nw.a;
                            z = true;
                            path.addRoundRect(rectF, new float[]{Math.max(f10 - f9, 0.0f), Math.max(f10 - rectFD.top, 0.0f), Math.max(f8 - rectFD.right, 0.0f), Math.max(f8 - rectFD.top, 0.0f), Math.max(f6 - rectFD.right, 0.0f), Math.max(f6 - rectFD.bottom, 0.0f), Math.max(f7 - rectFD.left, 0.0f), Math.max(f7 - rectFD.bottom, 0.0f)}, Path.Direction.CW);
                            canvas.clipPath(this.mPath);
                            f3 = f2;
                            width = width;
                            height = height;
                        } else {
                            f3 = f2;
                            z = false;
                        }
                    } else {
                        f = 0.0f;
                        z = false;
                    }
                    if (!z) {
                        canvas.clipRect(new RectF(f3, f, width, height));
                        break;
                    }
                    break;
                case "visible":
                    Path path2 = this.mPath;
                    if (path2 != null) {
                        path2.rewind();
                        break;
                    }
                    break;
            }
        }
    }

    public final void g(View view) {
        UiThreadUtil.assertOnUiThread();
        if (e()) {
            setChildrenDrawingOrderEnabled(false);
            return;
        }
        C8231yk1 drawingOrderHelper = getDrawingOrderHelper();
        drawingOrderHelper.getClass();
        if (ViewGroupManager.getViewZIndex(view) != null) {
            drawingOrderHelper.b++;
        }
        drawingOrderHelper.c = null;
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().b > 0);
    }

    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        if (getBackground() == null) {
            return 0;
        }
        getBackground().getClass();
        throw new ClassCastException();
    }

    public View getChildAtWithSubviewClippingEnabled(int i) {
        if (i < 0 || i >= this.mAllChildrenCount) {
            return null;
        }
        View[] viewArr = this.mAllChildren;
        UN1.c(viewArr);
        return viewArr[i];
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        return !e() ? getDrawingOrderHelper().a(i, i2) : i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // defpackage.OJ0
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // defpackage.InterfaceC7962xK0
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public C1453Sk getOrCreateReactViewBackground() {
        int i = 1;
        if (this.mCSSBackgroundDrawable == null) {
            this.mCSSBackgroundDrawable = new C1453Sk(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mCSSBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, background}));
            }
            if (!AbstractC6792rB1.b()) {
                C1453Sk c1453Sk = this.mCSSBackgroundDrawable;
                Context context = getContext();
                O90.f(context, "context");
                if ((context.getApplicationInfo().flags & 4194304) == 0 || (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) && (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1))) {
                    i = 0;
                }
                if (c1453Sk.z != i) {
                    c1453Sk.z = i;
                }
            }
        }
        return this.mCSSBackgroundDrawable;
    }

    @Override // defpackage.YL0
    public String getOverflow() {
        return this.mOverflow;
    }

    @Override // defpackage.YL0
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // defpackage.InterfaceC4330iM0
    public XB0 getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // defpackage.OJ0
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // defpackage.InterfaceC5873mN0
    public int getZIndexMappedChildIndex(int i) {
        UiThreadUtil.assertOnUiThread();
        return (e() || getDrawingOrderHelper().b <= 0) ? i : getDrawingOrderHelper().a(getChildCount(), i);
    }

    public final void h(View view) {
        UiThreadUtil.assertOnUiThread();
        if (e()) {
            setChildrenDrawingOrderEnabled(false);
            return;
        }
        if (indexOfChild(view) == -1) {
            return;
        }
        C8231yk1 drawingOrderHelper = getDrawingOrderHelper();
        drawingOrderHelper.getClass();
        if (ViewGroupManager.getViewZIndex(view) != null) {
            drawingOrderHelper.b--;
        }
        drawingOrderHelper.c = null;
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().b > 0);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    public final void i() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = null;
        this.mPointerEvents = XB0.e;
        this.mChildrenLayoutChangeListener = null;
        this.mCSSBackgroundDrawable = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mPath = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
    }

    public final void j(Rect rect) {
        UN1.c(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            k(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(Rect rect, int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        View[] viewArr = this.mAllChildren;
        UN1.c(viewArr);
        AS as = viewArr[i];
        Rect rect2 = sHelperRect;
        rect2.set(as.getLeft(), as.getTop(), as.getRight(), as.getBottom());
        boolean zIntersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = as.getAnimation();
        boolean z = (animation == null || animation.hasEnded()) ? false : true;
        if (!zIntersects && as.getParent() != null && !z) {
            removeViewsInLayout(i - i2, 1);
        } else if (zIntersects && as.getParent() == null) {
            addViewInLayout(as, i - i2, sDefaultLayoutParam, true);
            invalidate();
        } else if (!zIntersects) {
            return;
        }
        if (as instanceof OJ0) {
            OJ0 oj0 = (OJ0) as;
            if (oj0.getRemoveClippedSubviews()) {
                oj0.updateClippingRect();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC1649Ux0 interfaceC1649Ux0 = this.mOnInterceptTouchEventListener;
        if (interfaceC1649Ux0 != null) {
            C0333Ea0 c0333Ea0 = (C0333Ea0) interfaceC1649Ux0;
            c0333Ea0.getClass();
            O90.f(motionEvent, "event");
            int i = c0333Ea0.a;
            if (i != -1 && motionEvent.getAction() != 1 && getId() == i) {
                return true;
            }
        }
        if (XB0.b(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC1968Yz1.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return XB0.a(this.mPointerEvents);
    }

    public void recycleView() {
        i();
        this.mOverflowInset.setEmpty();
        sHelperRect.setEmpty();
        removeAllViews();
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    public void removeAllViewsWithSubviewClippingEnabled() {
        UN1.a(this.mRemoveClippedSubviews);
        UN1.c(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        h(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        h(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        h(view);
        super.removeViewInLayout(view);
    }

    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        UN1.a(this.mRemoveClippedSubviews);
        UN1.c(this.mClippingRect);
        UN1.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int i = this.mAllChildrenCount;
        View[] viewArr = this.mAllChildren;
        UN1.c(viewArr);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (viewArr[i2] == view) {
                break;
            } else {
                i2++;
            }
        }
        if (this.mAllChildren[i2].getParent() != null) {
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (this.mAllChildren[i4].getParent() == null) {
                    i3++;
                }
            }
            removeViewsInLayout(i2 - i3, 1);
        }
        View[] viewArr2 = this.mAllChildren;
        UN1.c(viewArr2);
        int i5 = this.mAllChildrenCount;
        int i6 = i5 - 1;
        if (i2 == i6) {
            this.mAllChildrenCount = i6;
            viewArr2[i6] = null;
        } else {
            if (i2 < 0 || i2 >= i5) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr2, i2 + 1, viewArr2, i2, (i5 - i2) - 1);
            int i7 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i7;
            viewArr2[i7] = null;
        }
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            if (i4 < getChildCount()) {
                h(getChildAt(i4));
            }
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            if (i4 < getChildCount()) {
                h(getChildAt(i4));
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void resetPointerEvents() {
        this.mPointerEvents = XB0.e;
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals("visible")) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.mBackfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (i == 0 && this.mCSSBackgroundDrawable == null) {
            return;
        }
        C1453Sk orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.u = i;
        orCreateReactViewBackground.invalidateSelf();
    }

    public void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().i(i, f, f2);
    }

    public void setBorderRadius(float f) {
        getOrCreateReactViewBackground().l(f);
    }

    public void setBorderStyle(String str) {
        int iB;
        C1453Sk orCreateReactViewBackground = getOrCreateReactViewBackground();
        if (str == null) {
            iB = 0;
        } else {
            orCreateReactViewBackground.getClass();
            iB = AbstractC8235ym.B(str.toUpperCase(Locale.US));
        }
        if (orCreateReactViewBackground.A != iB) {
            orCreateReactViewBackground.A = iB;
            orCreateReactViewBackground.s = true;
            orCreateReactViewBackground.invalidateSelf();
        }
    }

    public void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().k(i, f);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    @Override // defpackage.SK0
    public void setOnInterceptTouchEventListener(InterfaceC1649Ux0 interfaceC1649Ux0) {
        this.mOnInterceptTouchEventListener = interfaceC1649Ux0;
    }

    public void setOpacityIfPossible(float f) {
        this.mBackfaceOpacity = f;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    @Override // defpackage.YL0
    public void setOverflowInset(int i, int i2, int i3, int i4) {
        this.mOverflowInset.set(i, i2, i3, i4);
    }

    void setPointerEvents(XB0 xb0) {
        this.mPointerEvents = xb0;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z;
        if (z) {
            Rect rect = new Rect();
            this.mClippingRect = rect;
            PJ0.a(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(12, childCount)];
            this.mChildrenLayoutChangeListener = new ViewOnLayoutChangeListenerC4333iN0(this);
            for (int i = 0; i < this.mAllChildrenCount; i++) {
                View childAt = getChildAt(i);
                this.mAllChildren[i] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        UN1.c(this.mClippingRect);
        UN1.c(this.mAllChildren);
        UN1.c(this.mChildrenLayoutChangeListener);
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        j(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mCSSBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    public void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // defpackage.OJ0
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            UN1.c(this.mClippingRect);
            UN1.c(this.mAllChildren);
            PJ0.a(this, this.mClippingRect);
            j(this.mClippingRect);
        }
    }

    @Override // defpackage.InterfaceC5873mN0
    public void updateDrawingOrder() {
        if (e()) {
            return;
        }
        getDrawingOrderHelper().b();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().b > 0);
        invalidate();
    }

    public void addViewWithSubviewClippingEnabled(View view, int i, ViewGroup.LayoutParams layoutParams) {
        UN1.a(this.mRemoveClippedSubviews);
        UN1.c(this.mClippingRect);
        UN1.c(this.mAllChildren);
        View[] viewArr = this.mAllChildren;
        UN1.c(viewArr);
        int i2 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i == i2) {
            if (length == i2) {
                View[] viewArr2 = new View[length + 12];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i3 = this.mAllChildrenCount;
            this.mAllChildrenCount = i3 + 1;
            viewArr[i3] = view;
        } else {
            if (i >= i2) {
                throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index=", i2, " count="));
            }
            if (length == i2) {
                View[] viewArr3 = new View[length + 12];
                this.mAllChildren = viewArr3;
                System.arraycopy(viewArr, 0, viewArr3, 0, i);
                System.arraycopy(viewArr, i, this.mAllChildren, i + 1, i2 - i);
                viewArr = this.mAllChildren;
            } else {
                System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
            }
            viewArr[i] = view;
            this.mAllChildrenCount++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.mAllChildren[i5].getParent() == null) {
                i4++;
            }
        }
        k(this.mClippingRect, i, i4);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public void setBorderRadius(float f, int i) {
        getOrCreateReactViewBackground().m(f, i);
    }

    public void setBorderRadius(EnumC0824Ki enumC0824Ki, C7463ui0 c7463ui0) {
        getOrCreateReactViewBackground().j(enumC0824Ki, c7463ui0);
    }
}
