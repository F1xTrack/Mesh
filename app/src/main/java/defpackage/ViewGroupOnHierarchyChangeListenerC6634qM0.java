package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: qM0 */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC6634qM0 extends ScrollView implements OJ0, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, YL0, InterfaceC7968xM0, InterfaceC8348zM0, InterfaceC7588vM0, InterfaceC7778wM0, InterfaceC8158yM0 {
    public static Field K = null;
    public static boolean L = false;
    public ReadableMap A;
    public int B;
    public int C;
    public G41 D;
    public final BM0 E;
    public final ObjectAnimator F;
    public XB0 G;
    public long H;
    public int I;
    public C0992Mm0 J;
    public final C2423by0 a;
    public final OverScroller b;
    public final C7845wi1 c;
    public final Rect d;
    public final Rect e;
    public boolean f;
    public Rect g;
    public String h;
    public boolean i;
    public boolean j;
    public AK0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ColorDrawable q;
    public int r;
    public boolean s;
    public int t;
    public List u;
    public boolean v;
    public boolean w;
    public int x;
    public View y;
    public final VY z;

    public ViewGroupOnHierarchyChangeListenerC6634qM0(S91 s91) {
        super(s91);
        this.a = new C2423by0();
        this.c = new C7845wi1();
        this.d = new Rect();
        this.e = new Rect();
        this.h = "hidden";
        this.j = false;
        this.m = true;
        this.n = false;
        this.p = false;
        this.r = 0;
        this.s = false;
        this.t = 0;
        this.v = true;
        this.w = true;
        this.x = 0;
        this.A = null;
        this.B = -1;
        this.C = -1;
        this.D = null;
        this.E = new BM0(0);
        this.F = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.G = XB0.e;
        this.H = 0L;
        this.I = 0;
        this.J = null;
        VY vy = new VY(this);
        this.z = vy;
        this.b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        vy.e0("scroll");
        AbstractC6897rk1.n(this, new C6824rM0());
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.y;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!L) {
            L = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                K = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC3393dS.p("ReactNative");
            }
        }
        Field field = K;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC3393dS.p("ReactNative");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.t;
        return i != 0 ? i : getHeight();
    }

    @Override // defpackage.InterfaceC7588vM0
    public final void a(int i, int i2) {
        ObjectAnimator objectAnimator = this.F;
        objectAnimator.cancel();
        objectAnimator.setDuration(CM0.c(getContext())).setIntValues(i, i2);
        objectAnimator.start();
    }

    @Override // defpackage.InterfaceC8158yM0
    public final void b(int i, int i2) {
        scrollTo(i, i2);
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = overScroller.getCurrY();
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        overScroller.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(getScrollX(), (overScroller.getCurrX() - currY) + i2);
            return;
        }
        this.b.fling(getScrollX(), i2, 0, (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalY() - overScroller.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.InterfaceC8158yM0
    public final void c(int i, int i2) {
        CM0.h(this, i, i2);
        if (h()) {
            this.B = -1;
            this.C = -1;
        } else {
            this.B = i;
            this.C = i2;
        }
    }

    public final void d() {
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (XB0.b(this.G)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.r != 0) {
            View contentView = getContentView();
            if (this.q != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.q.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.q.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public final void e(int i) {
        int iFloor;
        int iMin;
        int iIntValue;
        int iIntValue2;
        int top;
        int top2;
        int height;
        OverScroller overScroller;
        int scrollY = i;
        if (getChildCount() <= 0) {
            return;
        }
        int i2 = 1;
        if (this.t == 0 && this.u == null && this.x == 0) {
            double snapInterval = getSnapInterval();
            double d = CM0.d(this, getScrollY(), getReactScrollViewScrollState().b.y, scrollY);
            double dJ = j(i);
            double d2 = d / snapInterval;
            int iFloor2 = (int) Math.floor(d2);
            int iCeil = (int) Math.ceil(d2);
            int iRound = (int) Math.round(d2);
            int iRound2 = (int) Math.round(dJ / snapInterval);
            if (scrollY > 0 && iCeil == iFloor2) {
                iCeil++;
            } else if (scrollY < 0 && iFloor2 == iCeil) {
                iFloor2--;
            }
            if (scrollY > 0 && iRound < iCeil && iRound2 > iFloor2) {
                iRound = iCeil;
            } else if (scrollY < 0 && iRound > iFloor2 && iRound2 < iCeil) {
                iRound = iFloor2;
            }
            double d3 = iRound * snapInterval;
            if (d3 != d) {
                this.f = true;
                c(getScrollX(), (int) d3);
                return;
            }
            return;
        }
        boolean z = getFlingAnimator() != this.F;
        int maxScrollY = getMaxScrollY();
        int iJ = j(i);
        if (this.s) {
            iJ = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List list = this.u;
        if (list != null) {
            iIntValue2 = ((Integer) list.get(0)).intValue();
            List list2 = this.u;
            iIntValue = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = maxScrollY;
            iFloor = 0;
            for (int i3 = 0; i3 < this.u.size(); i3++) {
                int iIntValue3 = ((Integer) this.u.get(i3)).intValue();
                if (iIntValue3 <= iJ && iJ - iIntValue3 < iJ - iFloor) {
                    iFloor = iIntValue3;
                }
                if (iIntValue3 >= iJ && iIntValue3 - iJ < iMin - iJ) {
                    iMin = iIntValue3;
                }
            }
        } else {
            int i4 = this.x;
            if (i4 != 0) {
                int i5 = this.t;
                if (i5 > 0) {
                    double d4 = iJ / i5;
                    double dFloor = Math.floor(d4);
                    int i6 = this.t;
                    iFloor = Math.max(f(i4, (int) (dFloor * i6), i6, height2), 0);
                    int i7 = this.x;
                    double dCeil = Math.ceil(d4);
                    int i8 = this.t;
                    iMin = Math.min(f(i7, (int) (dCeil * i8), i8, height2), maxScrollY);
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i9 = iMin2;
                    int i10 = 0;
                    int i11 = 0;
                    int iMax = 0;
                    while (i10 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i10);
                        int i12 = this.x;
                        if (i12 != i2) {
                            if (i12 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i12 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.x);
                                }
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= iJ && iJ - top < iJ - i11) {
                            i11 = top;
                        }
                        if (top >= iJ && top - iJ < i9 - iJ) {
                            i9 = top;
                        }
                        iMin2 = Math.min(iMin2, top);
                        iMax = Math.max(iMax, top);
                        i10++;
                        i2 = 1;
                    }
                    int iMax2 = Math.max(i11, iMin2);
                    iMin = Math.min(i9, iMax);
                    iFloor = iMax2;
                }
            } else {
                double snapInterval2 = getSnapInterval();
                double d5 = iJ / snapInterval2;
                iFloor = (int) (Math.floor(d5) * snapInterval2);
                iMin = Math.min((int) (Math.ceil(d5) * snapInterval2), maxScrollY);
            }
            iIntValue = maxScrollY;
            iIntValue2 = 0;
        }
        int i13 = iJ - iFloor;
        int i14 = iMin - iJ;
        int i15 = Math.abs(i13) < Math.abs(i14) ? iFloor : iMin;
        if (this.w || iJ < iIntValue) {
            if (this.v || iJ > iIntValue2) {
                if (scrollY > 0) {
                    if (!z) {
                        scrollY += (int) (i14 * 10.0d);
                    }
                    iJ = iMin;
                } else if (scrollY < 0) {
                    if (!z) {
                        scrollY -= (int) (i13 * 10.0d);
                    }
                    iJ = iFloor;
                } else {
                    iJ = i15;
                }
            } else if (getScrollY() > iIntValue2) {
                iJ = iIntValue2;
            }
        } else if (getScrollY() < iIntValue) {
            iJ = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iJ), maxScrollY);
        if (z || (overScroller = this.b) == null) {
            c(getScrollX(), iMin3);
            return;
        }
        this.f = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin3 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin3, iMin3, 0, (iMin3 == 0 || iMin3 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    @Override // android.widget.ScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.m || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final int f(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            i5 = (i4 - i3) / 2;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.x);
            }
            i5 = i4 - i3;
        }
        return i2 - i5;
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        if (Build.VERSION.SDK_INT == 28) {
            float fSignum = Math.signum(this.a.d);
            if (fSignum == 0.0f) {
                fSignum = Math.signum(i);
            }
            i = (int) (Math.abs(i) * fSignum);
        }
        if (this.j) {
            e(i);
        } else if (this.b != null) {
            this.b.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            postInvalidateOnAnimation();
        } else {
            super.fling(i);
        }
        g(0, i);
    }

    public final void g(int i, int i2) {
        if (this.k != null) {
            return;
        }
        if (this.o) {
            Set set = CM0.a;
            CM0.a(this, MW0.e, i, i2, false);
        }
        this.f = false;
        AK0 ak0 = new AK0(this, 1);
        this.k = ak0;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        postOnAnimationDelayed(ak0, 20L);
    }

    @Override // defpackage.OJ0
    public final void getClippingRect(Rect rect) {
        Rect rect2 = this.g;
        UN1.c(rect2);
        rect.set(rect2);
    }

    @Override // defpackage.InterfaceC7588vM0
    public ValueAnimator getFlingAnimator() {
        return this.F;
    }

    @Override // defpackage.InterfaceC7778wM0
    public long getLastScrollDispatchTime() {
        return this.H;
    }

    @Override // defpackage.YL0
    public String getOverflow() {
        return this.h;
    }

    @Override // defpackage.YL0
    public Rect getOverflowInset() {
        return this.e;
    }

    public XB0 getPointerEvents() {
        return this.G;
    }

    @Override // defpackage.InterfaceC7968xM0
    public BM0 getReactScrollViewScrollState() {
        return this.E;
    }

    @Override // defpackage.OJ0
    public boolean getRemoveClippedSubviews() {
        return this.l;
    }

    public boolean getScrollEnabled() {
        return this.m;
    }

    @Override // defpackage.InterfaceC7778wM0
    public int getScrollEventThrottle() {
        return this.I;
    }

    @Override // defpackage.InterfaceC8348zM0
    public G41 getStateWrapper() {
        return this.D;
    }

    public final boolean h() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    public final boolean i(View view) {
        Rect rect = this.d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        view.getDrawingRect(rect);
        return iComputeScrollDeltaToGetChildRectOnScreen != 0 && Math.abs(iComputeScrollDeltaToGetChildRectOnScreen) < rect.width();
    }

    public final int j(int i) {
        if (getFlingAnimator() == this.F) {
            return CM0.g(this, 0, i, 0, getMaxScrollY()).y;
        }
        return CM0.g(this, 0, i, 0, getMaxScrollY()).y + CM0.d(this, getScrollY(), getReactScrollViewScrollState().b.y, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            updateClippingRect();
        }
        C0992Mm0 c0992Mm0 = this.J;
        if (c0992Mm0 != null) {
            c0992Mm0.b();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.y = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.y;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.y = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0992Mm0 c0992Mm0 = this.J;
        if (c0992Mm0 != null) {
            c0992Mm0.c();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.z.U(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return false;
        }
        if (!XB0.b(this.G)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                GB1.b(this, motionEvent);
                Set set = CM0.a;
                CM0.a(this, MW0.b, 0.0f, 0.0f, false);
                this.i = true;
                getFlingAnimator().cancel();
                return true;
            }
        } catch (IllegalArgumentException unused) {
            AbstractC3393dS.s("ReactNative");
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (h()) {
            int scrollX = this.B;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.C;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        Iterator it = CM0.a.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.y == null) {
            return;
        }
        C0992Mm0 c0992Mm0 = this.J;
        if (c0992Mm0 != null && R02.b(c0992Mm0.a.getId()) != 2) {
            c0992Mm0.d();
        }
        if (isShown() && h()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC1968Yz1.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.b;
        if (overScroller != null && this.y != null && !overScroller.isFinished() && overScroller.getCurrY() != overScroller.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            overScroller.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f = true;
        C2423by0 c2423by0 = this.a;
        if (c2423by0.a(i, i2)) {
            if (this.l) {
                updateClippingRect();
            }
            if (this.n) {
                return;
            }
            this.n = true;
            float f = c2423by0.c;
            float f2 = c2423by0.d;
            boolean z = this.p;
            CM0.i(this);
            CM0.a(this, MW0.d, f, f2, z);
            this.n = false;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AK0 ak0;
        if (!this.m || !XB0.a(this.G)) {
            return false;
        }
        C7845wi1 c7845wi1 = this.c;
        c7845wi1.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.i) {
            CM0.i(this);
            float f = c7845wi1.b;
            float f2 = c7845wi1.c;
            CM0.a(this, MW0.c, f, f2, false);
            GB1.a(this, motionEvent);
            this.i = false;
            g(Math.round(f), Math.round(f2));
        }
        if (actionMasked == 0 && (ak0 = this.k) != null) {
            removeCallbacks(ak0);
            this.k = null;
            getFlingAnimator().cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            Rect rect = new Rect();
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        CM0.i(this);
        if (h()) {
            this.B = -1;
            this.C = -1;
        } else {
            this.B = i;
            this.C = i2;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.z.b0(i);
    }

    public void setBorderRadius(float f) {
        this.z.G().l(f);
    }

    public void setBorderStyle(String str) {
        int iB;
        C1453Sk c1453SkG = this.z.G();
        if (str == null) {
            iB = 0;
        } else {
            c1453SkG.getClass();
            iB = AbstractC8235ym.B(str.toUpperCase(Locale.US));
        }
        if (c1453SkG.A != iB) {
            c1453SkG.A = iB;
            c1453SkG.s = true;
            c1453SkG.invalidateSelf();
        }
    }

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.A;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.A = readableMap;
            if (readableMap == null) {
                scrollTo(0, 0);
                return;
            }
            boolean zHasKey = readableMap.hasKey("x");
            double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
            double d2 = zHasKey ? readableMap.getDouble("x") : 0.0d;
            if (readableMap.hasKey("y")) {
                d = readableMap.getDouble("y");
            }
            scrollTo((int) AbstractC7586vL1.b((float) d2), (int) AbstractC7586vL1.b((float) d));
        }
    }

    public void setDecelerationRate(float f) {
        getReactScrollViewScrollState().g = f;
        OverScroller overScroller = this.b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.s = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.p = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.r) {
            this.r = i;
            this.q = new ColorDrawable(this.r);
        }
    }

    @Override // defpackage.InterfaceC7778wM0
    public void setLastScrollDispatchTime(long j) {
        this.H = j;
    }

    public void setMaintainVisibleContentPosition(C0915Lm0 c0915Lm0) {
        C0992Mm0 c0992Mm0;
        if (c0915Lm0 != null && this.J == null) {
            C0992Mm0 c0992Mm02 = new C0992Mm0(this, false);
            this.J = c0992Mm02;
            c0992Mm02.b();
        } else if (c0915Lm0 == null && (c0992Mm0 = this.J) != null) {
            c0992Mm0.c();
            this.J = null;
        }
        C0992Mm0 c0992Mm03 = this.J;
        if (c0992Mm03 != null) {
            c0992Mm03.c = c0915Lm0;
        }
    }

    public void setOverflow(String str) {
        this.h = str;
        if (str == null) {
            str = "scroll";
        }
        this.z.e0(str);
    }

    @Override // defpackage.YL0
    public final void setOverflowInset(int i, int i2, int i3, int i4) {
        this.e.set(i, i2, i3, i4);
    }

    public void setPagingEnabled(boolean z) {
        this.j = z;
    }

    public void setPointerEvents(XB0 xb0) {
        this.G = xb0;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.g == null) {
            this.g = new Rect();
        }
        this.l = z;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i) {
        int childCount = getChildCount();
        UN1.b(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setTranslationY(i);
            }
            setPadding(0, 0, 0, i);
        }
        getReactScrollViewScrollState().c = i;
        CM0.b(this);
        setRemoveClippedSubviews(this.l);
    }

    public void setScrollEnabled(boolean z) {
        this.m = z;
    }

    public void setScrollEventThrottle(int i) {
        this.I = i;
    }

    public void setSendMomentumEvents(boolean z) {
        this.o = z;
    }

    public void setSnapInterval(int i) {
        this.t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.u = list;
    }

    public void setSnapToAlignment(int i) {
        this.x = i;
    }

    public void setSnapToEnd(boolean z) {
        this.w = z;
    }

    public void setSnapToStart(boolean z) {
        this.v = z;
    }

    public void setStateWrapper(G41 g41) {
        this.D = g41;
    }

    @Override // defpackage.OJ0
    public final void updateClippingRect() {
        if (this.l) {
            UN1.c(this.g);
            PJ0.a(this, this.g);
            KeyEvent.Callback contentView = getContentView();
            if (contentView instanceof OJ0) {
                ((OJ0) contentView).updateClippingRect();
            }
        }
    }

    public void setScrollPerfTag(String str) {
    }
}
