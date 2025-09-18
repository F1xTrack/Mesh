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
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import p000.AbstractC10874rB1;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.AbstractC8613Yz1;
import p000.C0029AS;
import p000.C10043ki0;
import p000.C11323ui0;
import p000.C1179Sk;
import p000.C11837yk1;
import p000.C6520nw;
import p000.C7522Ea0;
import p000.C8810b60;
import p000.EnumC0675Ki;
import p000.InterfaceC10257mN0;
import p000.InterfaceC11293uT0;
import p000.InterfaceC11657xK0;
import p000.InterfaceC8400Ux0;
import p000.InterfaceC9743iM0;
import p000.O90;
import p000.OJ0;
import p000.PJ0;
import p000.R02;
import p000.SK0;
import p000.UN1;
import p000.ViewOnLayoutChangeListenerC9745iN0;
import p000.XB0;
import p000.YL0;
import p000.YQ1;

/* renamed from: com.facebook.react.views.view.a */
/* loaded from: classes.dex */
public class C1932a extends ViewGroup implements SK0, OJ0, InterfaceC9743iM0, InterfaceC11657xK0, InterfaceC10257mN0, YL0 {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private C1179Sk mCSSBackgroundDrawable;
    private ViewOnLayoutChangeListenerC9745iN0 mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private C11837yk1 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private boolean mNeedsOffscreenAlphaCompositing;
    private InterfaceC8400Ux0 mOnInterceptTouchEventListener;
    private String mOverflow;
    private final Rect mOverflowInset;
    private Path mPath;
    private XB0 mPointerEvents;
    private boolean mRemoveClippedSubviews;

    public C1932a(Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        m11063i();
    }

    /* renamed from: d */
    public static void m11058d(C1932a c1932a, View view) {
        if (!c1932a.mRemoveClippedSubviews || c1932a.getParent() == null) {
            return;
        }
        UN1.m7999c(c1932a.mClippingRect);
        UN1.m7999c(c1932a.mAllChildren);
        Rect rect = sHelperRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (c1932a.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i = 0;
            for (int i2 = 0; i2 < c1932a.mAllChildrenCount; i2++) {
                View view2 = c1932a.mAllChildren[i2];
                if (view2 == view) {
                    c1932a.m11065k(c1932a.mClippingRect, i2, i);
                    return;
                } else {
                    if (view2.getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    private C11837yk1 getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new C11837yk1(this);
        }
        return this.mDrawingOrderHelper;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m11061g(view);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m11061g(view);
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            m11060f(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e) {
            InterfaceC11293uT0 interfaceC11293uT0M9298b = YQ1.m9298b(this);
            if (interfaceC11293uT0M9298b != null) {
                interfaceC11293uT0M9298b.mo6037b(e);
            } else {
                if (!(getContext() instanceof ReactContext)) {
                    throw e;
                }
                ((ReactContext) getContext()).handleException(new C8810b60("StackOverflowException", this, e));
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (XB0.m8950b(this.mPointerEvents)) {
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
            AbstractC3929dS.m17675h("ReactNative");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = view.getElevation() > 0.0f;
        if (z) {
            C10043ki0.m22242a(canvas, true);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (z) {
            C10043ki0.m22242a(canvas, false);
        }
        return zDrawChild;
    }

    /* renamed from: e */
    public final boolean m11059e() {
        return getId() != -1 && R02.m6874b(getId()) == 2;
    }

    /* renamed from: f */
    public final void m11060f(Canvas canvas) {
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
                    C1179Sk c1179Sk = this.mCSSBackgroundDrawable;
                    float f3 = 0.0f;
                    if (c1179Sk != null) {
                        RectF rectFM7438d = c1179Sk.m7438d();
                        float f4 = rectFM7438d.top;
                        if (f4 > 0.0f || rectFM7438d.left > 0.0f || rectFM7438d.bottom > 0.0f || rectFM7438d.right > 0.0f) {
                            f2 = rectFM7438d.left + 0.0f;
                            f = f4 + 0.0f;
                            width -= rectFM7438d.right;
                            height -= rectFM7438d.bottom;
                        } else {
                            f = 0.0f;
                            f2 = 0.0f;
                        }
                        C6520nw c6520nw = this.mCSSBackgroundDrawable.f10954x;
                        float f5 = c6520nw.f38613a;
                        float f6 = c6520nw.f38616d;
                        float f7 = c6520nw.f38615c;
                        float f8 = c6520nw.f38614b;
                        if (f5 > 0.0f || f8 > 0.0f || f7 > 0.0f || f6 > 0.0f) {
                            if (this.mPath == null) {
                                this.mPath = new Path();
                            }
                            this.mPath.rewind();
                            Path path = this.mPath;
                            RectF rectF = new RectF(f2, f, width, height);
                            float f9 = rectFM7438d.left;
                            float f10 = c6520nw.f38613a;
                            z = true;
                            path.addRoundRect(rectF, new float[]{Math.max(f10 - f9, 0.0f), Math.max(f10 - rectFM7438d.top, 0.0f), Math.max(f8 - rectFM7438d.right, 0.0f), Math.max(f8 - rectFM7438d.top, 0.0f), Math.max(f6 - rectFM7438d.right, 0.0f), Math.max(f6 - rectFM7438d.bottom, 0.0f), Math.max(f7 - rectFM7438d.left, 0.0f), Math.max(f7 - rectFM7438d.bottom, 0.0f)}, Path.Direction.CW);
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

    /* renamed from: g */
    public final void m11061g(View view) {
        UiThreadUtil.assertOnUiThread();
        if (m11059e()) {
            setChildrenDrawingOrderEnabled(false);
            return;
        }
        C11837yk1 drawingOrderHelper = getDrawingOrderHelper();
        drawingOrderHelper.getClass();
        if (ViewGroupManager.getViewZIndex(view) != null) {
            drawingOrderHelper.f46438b++;
        }
        drawingOrderHelper.f46439c = null;
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().f46438b > 0);
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
        UN1.m7999c(viewArr);
        return viewArr[i];
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        return !m11059e() ? getDrawingOrderHelper().m26218a(i, i2) : i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // p000.OJ0
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // p000.InterfaceC11657xK0
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public C1179Sk getOrCreateReactViewBackground() {
        int i = 1;
        if (this.mCSSBackgroundDrawable == null) {
            this.mCSSBackgroundDrawable = new C1179Sk(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mCSSBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, background}));
            }
            if (!AbstractC10874rB1.m24211b()) {
                C1179Sk c1179Sk = this.mCSSBackgroundDrawable;
                Context context = getContext();
                O90.m5968f(context, "context");
                if ((context.getApplicationInfo().flags & 4194304) == 0 || (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) && (!context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1))) {
                    i = 0;
                }
                if (c1179Sk.f10956z != i) {
                    c1179Sk.f10956z = i;
                }
            }
        }
        return this.mCSSBackgroundDrawable;
    }

    @Override // p000.YL0
    public String getOverflow() {
        return this.mOverflow;
    }

    @Override // p000.YL0
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // p000.InterfaceC9743iM0
    public XB0 getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // p000.OJ0
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // p000.InterfaceC10257mN0
    public int getZIndexMappedChildIndex(int i) {
        UiThreadUtil.assertOnUiThread();
        return (m11059e() || getDrawingOrderHelper().f46438b <= 0) ? i : getDrawingOrderHelper().m26218a(getChildCount(), i);
    }

    /* renamed from: h */
    public final void m11062h(View view) {
        UiThreadUtil.assertOnUiThread();
        if (m11059e()) {
            setChildrenDrawingOrderEnabled(false);
            return;
        }
        if (indexOfChild(view) == -1) {
            return;
        }
        C11837yk1 drawingOrderHelper = getDrawingOrderHelper();
        drawingOrderHelper.getClass();
        if (ViewGroupManager.getViewZIndex(view) != null) {
            drawingOrderHelper.f46438b--;
        }
        drawingOrderHelper.f46439c = null;
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().f46438b > 0);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    /* renamed from: i */
    public final void m11063i() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = null;
        this.mPointerEvents = XB0.f13610e;
        this.mChildrenLayoutChangeListener = null;
        this.mCSSBackgroundDrawable = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mPath = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
    }

    /* renamed from: j */
    public final void m11064j(Rect rect) {
        UN1.m7999c(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            m11065k(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m11065k(Rect rect, int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        View[] viewArr = this.mAllChildren;
        UN1.m7999c(viewArr);
        C0029AS c0029as = viewArr[i];
        Rect rect2 = sHelperRect;
        rect2.set(c0029as.getLeft(), c0029as.getTop(), c0029as.getRight(), c0029as.getBottom());
        boolean zIntersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = c0029as.getAnimation();
        boolean z = (animation == null || animation.hasEnded()) ? false : true;
        if (!zIntersects && c0029as.getParent() != null && !z) {
            removeViewsInLayout(i - i2, 1);
        } else if (zIntersects && c0029as.getParent() == null) {
            addViewInLayout(c0029as, i - i2, sDefaultLayoutParam, true);
            invalidate();
        } else if (!zIntersects) {
            return;
        }
        if (c0029as instanceof OJ0) {
            OJ0 oj0 = (OJ0) c0029as;
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
        InterfaceC8400Ux0 interfaceC8400Ux0 = this.mOnInterceptTouchEventListener;
        if (interfaceC8400Ux0 != null) {
            C7522Ea0 c7522Ea0 = (C7522Ea0) interfaceC8400Ux0;
            c7522Ea0.getClass();
            O90.m5968f(motionEvent, "event");
            int i = c7522Ea0.f2787a;
            if (i != -1 && motionEvent.getAction() != 1 && getId() == i) {
                return true;
            }
        }
        if (XB0.m8950b(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC8613Yz1.m9443a(i, i2);
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
        return XB0.m8949a(this.mPointerEvents);
    }

    public void recycleView() {
        m11063i();
        this.mOverflowInset.setEmpty();
        sHelperRect.setEmpty();
        removeAllViews();
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    public void removeAllViewsWithSubviewClippingEnabled() {
        UN1.m7997a(this.mRemoveClippedSubviews);
        UN1.m7999c(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m11062h(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m11062h(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m11062h(view);
        super.removeViewInLayout(view);
    }

    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        UN1.m7997a(this.mRemoveClippedSubviews);
        UN1.m7999c(this.mClippingRect);
        UN1.m7999c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int i = this.mAllChildrenCount;
        View[] viewArr = this.mAllChildren;
        UN1.m7999c(viewArr);
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
        UN1.m7999c(viewArr2);
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
                m11062h(getChildAt(i4));
            }
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            if (i4 < getChildCount()) {
                m11062h(getChildAt(i4));
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void resetPointerEvents() {
        this.mPointerEvents = XB0.f13610e;
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
        C1179Sk orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.f10951u = i;
        orCreateReactViewBackground.invalidateSelf();
    }

    public void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().m7441i(i, f, f2);
    }

    public void setBorderRadius(float f) {
        getOrCreateReactViewBackground().m7444l(f);
    }

    public void setBorderStyle(String str) {
        int iM26222B;
        C1179Sk orCreateReactViewBackground = getOrCreateReactViewBackground();
        if (str == null) {
            iM26222B = 0;
        } else {
            orCreateReactViewBackground.getClass();
            iM26222B = AbstractC7222ym.m26222B(str.toUpperCase(Locale.US));
        }
        if (orCreateReactViewBackground.f10930A != iM26222B) {
            orCreateReactViewBackground.f10930A = iM26222B;
            orCreateReactViewBackground.f10949s = true;
            orCreateReactViewBackground.invalidateSelf();
        }
    }

    public void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().m7443k(i, f);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    @Override // p000.SK0
    public void setOnInterceptTouchEventListener(InterfaceC8400Ux0 interfaceC8400Ux0) {
        this.mOnInterceptTouchEventListener = interfaceC8400Ux0;
    }

    public void setOpacityIfPossible(float f) {
        this.mBackfaceOpacity = f;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    @Override // p000.YL0
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
            PJ0.m6301a(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(12, childCount)];
            this.mChildrenLayoutChangeListener = new ViewOnLayoutChangeListenerC9745iN0(this);
            for (int i = 0; i < this.mAllChildrenCount; i++) {
                View childAt = getChildAt(i);
                this.mAllChildren[i] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        UN1.m7999c(this.mClippingRect);
        UN1.m7999c(this.mAllChildren);
        UN1.m7999c(this.mChildrenLayoutChangeListener);
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        m11064j(this.mClippingRect);
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

    @Override // p000.OJ0
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            UN1.m7999c(this.mClippingRect);
            UN1.m7999c(this.mAllChildren);
            PJ0.m6301a(this, this.mClippingRect);
            m11064j(this.mClippingRect);
        }
    }

    @Override // p000.InterfaceC10257mN0
    public void updateDrawingOrder() {
        if (m11059e()) {
            return;
        }
        getDrawingOrderHelper().m26219b();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().f46438b > 0);
        invalidate();
    }

    public void addViewWithSubviewClippingEnabled(View view, int i, ViewGroup.LayoutParams layoutParams) {
        UN1.m7997a(this.mRemoveClippedSubviews);
        UN1.m7999c(this.mClippingRect);
        UN1.m7999c(this.mAllChildren);
        View[] viewArr = this.mAllChildren;
        UN1.m7999c(viewArr);
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
                throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index=", i2, " count="));
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
        m11065k(this.mClippingRect, i, i4);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public void setBorderRadius(float f, int i) {
        getOrCreateReactViewBackground().m7445m(f, i);
    }

    public void setBorderRadius(EnumC0675Ki enumC0675Ki, C11323ui0 c11323ui0) {
        getOrCreateReactViewBackground().m7442j(enumC0675Ki, c11323ui0);
    }
}
