package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class BK0 extends HorizontalScrollView implements OJ0, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, YL0, InterfaceC7968xM0, InterfaceC8348zM0, InterfaceC7588vM0, InterfaceC7778wM0, InterfaceC8158yM0 {
    public static Field L = null;
    public static boolean M = false;
    public int A;
    public int B;
    public G41 C;
    public final BM0 D;
    public final ObjectAnimator E;
    public XB0 F;
    public long G;
    public int H;
    public View I;
    public C0992Mm0 J;
    public final Rect K;
    public int a;
    public final C2423by0 b;
    public final OverScroller c;
    public final C7845wi1 d;
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
    public final VY y;
    public boolean z;

    public BK0(S91 s91) {
        super(s91);
        this.a = Integer.MIN_VALUE;
        this.b = new C2423by0();
        this.d = new C7845wi1();
        this.e = new Rect();
        this.h = "hidden";
        this.j = false;
        int i = 1;
        this.m = true;
        this.n = false;
        this.o = false;
        this.r = 0;
        this.s = false;
        this.t = 0;
        this.v = true;
        this.w = true;
        this.x = 0;
        this.z = false;
        this.A = -1;
        this.B = -1;
        this.C = null;
        this.E = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.F = XB0.e;
        this.G = 0L;
        this.H = 0;
        this.K = new Rect();
        VY vy = new VY(this);
        this.y = vy;
        AbstractC6897rk1.n(this, new C6824rM0());
        this.c = getOverScrollerFromParent();
        O90.f(s91, "context");
        if ((s91.getApplicationInfo().flags & 4194304) == 0 || (!s91.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) && (!s91.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1))) {
            i = 0;
        }
        this.D = new BM0(i);
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
        vy.e0("scroll");
    }

    public static HorizontalScrollView d(View view, MotionEvent motionEvent, boolean z) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z && (view instanceof HorizontalScrollView)) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            if (AbstractC4021gk1.p(view) && (view instanceof BK0) && ((BK0) view).m) {
                return (HorizontalScrollView) view;
            }
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView horizontalScrollViewD = d(viewGroup.getChildAt(i), motionEvent, false);
                if (horizontalScrollViewD != null) {
                    return horizontalScrollViewD;
                }
                i++;
            }
        }
        return null;
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!M) {
            M = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                L = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC3393dS.p("BK0");
            }
        }
        Field field = L;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC3393dS.p("BK0");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.t;
        return i != 0 ? i : getWidth();
    }

    @Override // defpackage.InterfaceC7588vM0
    public final void a(int i, int i2) {
        ObjectAnimator objectAnimator = this.E;
        objectAnimator.cancel();
        objectAnimator.setDuration(CM0.c(getContext())).setIntValues(i, i2);
        objectAnimator.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (!this.j || this.z) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (h(view) != 0) {
                int iH = h(view);
                Rect rect = this.K;
                view.getDrawingRect(rect);
                if ((iH == 0 || Math.abs(iH) >= rect.width()) && !view.isFocused()) {
                }
            }
            arrayList.add(view);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean arrowScroll(int i) {
        if (!this.j) {
            return super.arrowScroll(i);
        }
        boolean z = true;
        this.z = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                l(i);
            } else {
                if (h(viewFindNextFocus) != 0) {
                    int iH = h(viewFindNextFocus);
                    Rect rect = this.K;
                    viewFindNextFocus.getDrawingRect(rect);
                    if (iH == 0 || Math.abs(iH) >= rect.width() / 2) {
                        l(i);
                    }
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z = false;
        }
        this.z = false;
        return z;
    }

    @Override // defpackage.InterfaceC8158yM0
    public final void b(int i, int i2) {
        scrollTo(i, i2);
        k(i, Integer.MAX_VALUE);
    }

    @Override // defpackage.InterfaceC8158yM0
    public final void c(int i, int i2) {
        CM0.h(this, i, i2);
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            this.A = i;
            this.B = i2;
        } else {
            this.A = -1;
            this.B = -1;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.m && super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (XB0.b(this.F)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.r != 0) {
            View contentView = getContentView();
            if (this.q != null && contentView != null && contentView.getRight() < getWidth()) {
                this.q.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.q.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public final void e() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.m || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void f(int i) {
        int iMin;
        int iMax;
        int iIntValue;
        int iIntValue2;
        OverScroller overScroller;
        int scrollX = i;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.t == 0 && this.u == null && this.x == 0) {
            double snapInterval = getSnapInterval();
            double d = CM0.d(this, getScrollX(), getReactScrollViewScrollState().b.x, scrollX);
            double dJ = j(i);
            double d2 = d / snapInterval;
            int iFloor = (int) Math.floor(d2);
            int iCeil = (int) Math.ceil(d2);
            int iRound = (int) Math.round(d2);
            int iRound2 = (int) Math.round(dJ / snapInterval);
            if (scrollX > 0 && iCeil == iFloor) {
                iCeil++;
            } else if (scrollX < 0 && iFloor == iCeil) {
                iFloor--;
            }
            if (scrollX > 0 && iRound < iCeil && iRound2 > iFloor) {
                iRound = iCeil;
            } else if (scrollX < 0 && iRound > iFloor && iRound2 < iCeil) {
                iRound = iFloor;
            }
            double d3 = iRound * snapInterval;
            if (d3 != d) {
                this.f = true;
                c((int) d3, getScrollY());
                return;
            }
            return;
        }
        boolean z = getFlingAnimator() != this.E;
        int iMax2 = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iJ = j(i);
        if (this.s) {
            iJ = getScrollX();
        }
        int width = getWidth();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int paddingStart = (width - getPaddingStart()) - getPaddingEnd();
        int layoutDirection = AbstractC6792rB1.b() ? getLayoutDirection() : this.D.a;
        if (layoutDirection == 1) {
            iJ = iMax2 - iJ;
            scrollX = -scrollX;
        }
        List list = this.u;
        if (list == null || list.isEmpty()) {
            int i2 = this.x;
            if (i2 != 0) {
                int i3 = this.t;
                if (i3 > 0) {
                    double d4 = iJ / i3;
                    double dFloor = Math.floor(d4);
                    int i4 = this.t;
                    iMax = Math.max(g(i2, (int) (dFloor * i4), i4, paddingStart), 0);
                    int i5 = this.x;
                    double dCeil = Math.ceil(d4);
                    int i6 = this.t;
                    iMin = Math.min(g(i5, (int) (dCeil * i6), i6, paddingStart), iMax2);
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax2;
                    int i7 = iMin2;
                    int i8 = 0;
                    int iMax3 = 0;
                    for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                        View childAt = viewGroup.getChildAt(i9);
                        int iG = g(this.x, childAt.getLeft(), childAt.getWidth(), paddingStart);
                        if (iG <= iJ && iJ - iG < iJ - i8) {
                            i8 = iG;
                        }
                        if (iG >= iJ && iG - iJ < i7 - iJ) {
                            i7 = iG;
                        }
                        iMin2 = Math.min(iMin2, iG);
                        iMax3 = Math.max(iMax3, iG);
                    }
                    iMax = Math.max(i8, iMin2);
                    iMin = Math.min(i7, iMax3);
                }
            } else {
                double snapInterval2 = getSnapInterval();
                double d5 = iJ / snapInterval2;
                int iFloor2 = (int) (Math.floor(d5) * snapInterval2);
                iMin = Math.min((int) (Math.ceil(d5) * snapInterval2), iMax2);
                iMax = iFloor2;
            }
            iIntValue = iMax2;
            iIntValue2 = 0;
        } else {
            iIntValue2 = ((Integer) this.u.get(0)).intValue();
            List list2 = this.u;
            iIntValue = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = iMax2;
            iMax = 0;
            for (int i10 = 0; i10 < this.u.size(); i10++) {
                int iIntValue3 = ((Integer) this.u.get(i10)).intValue();
                if (iIntValue3 <= iJ && iJ - iIntValue3 < iJ - iMax) {
                    iMax = iIntValue3;
                }
                if (iIntValue3 >= iJ && iIntValue3 - iJ < iMin - iJ) {
                    iMin = iIntValue3;
                }
            }
        }
        int i11 = iJ - iMax;
        int i12 = iMin - iJ;
        int i13 = Math.abs(i11) < Math.abs(i12) ? iMax : iMin;
        int scrollX2 = getScrollX();
        if (layoutDirection == 1) {
            scrollX2 = iMax2 - scrollX2;
        }
        if (this.w || iJ < iIntValue) {
            if (this.v || iJ > iIntValue2) {
                if (scrollX > 0) {
                    if (!z) {
                        scrollX += (int) (i12 * 10.0d);
                    }
                    iJ = iMin;
                } else if (scrollX < 0) {
                    if (!z) {
                        scrollX -= (int) (i11 * 10.0d);
                    }
                    iJ = iMax;
                } else {
                    iJ = i13;
                }
            } else if (scrollX2 > iIntValue2) {
                iJ = iIntValue2;
            }
        } else if (scrollX2 < iIntValue) {
            iJ = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iJ), iMax2);
        if (layoutDirection == 1) {
            iMin3 = iMax2 - iMin3;
            scrollX = -scrollX;
        }
        int i14 = iMin3;
        if (z || (overScroller = this.c) == null) {
            c(i14, getScrollY());
            return;
        }
        this.f = true;
        int scrollX3 = getScrollX();
        int scrollY = getScrollY();
        if (scrollX == 0) {
            scrollX = i14 - getScrollX();
        }
        overScroller.fling(scrollX3, scrollY, scrollX, 0, i14, i14, 0, 0, (i14 == 0 || i14 == iMax2) ? paddingStart / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        if (Build.VERSION.SDK_INT == 28) {
            i = (int) (Math.signum(this.b.c) * Math.abs(i));
        }
        if (this.j) {
            f(i);
        } else if (this.c != null) {
            int width = getWidth();
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            this.c.fling(getScrollX(), getScrollY(), i, 0, 0, Integer.MAX_VALUE, 0, 0, ((width - getPaddingStart()) - getPaddingEnd()) / 2, 0);
            postInvalidateOnAnimation();
        } else {
            super.fling(i);
        }
        i(i, 0);
    }

    public final int g(int i, int i2, int i3, int i4) {
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

    @Override // defpackage.OJ0
    public final void getClippingRect(Rect rect) {
        Rect rect2 = this.g;
        UN1.c(rect2);
        rect.set(rect2);
    }

    @Override // defpackage.InterfaceC7588vM0
    public ValueAnimator getFlingAnimator() {
        return this.E;
    }

    @Override // defpackage.InterfaceC7778wM0
    public long getLastScrollDispatchTime() {
        return this.G;
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
        return this.F;
    }

    @Override // defpackage.InterfaceC7968xM0
    public BM0 getReactScrollViewScrollState() {
        return this.D;
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
        return this.H;
    }

    @Override // defpackage.InterfaceC8348zM0
    public G41 getStateWrapper() {
        return this.C;
    }

    public final int h(View view) {
        Rect rect = this.K;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return computeScrollDeltaToGetChildRectOnScreen(rect);
    }

    public final void i(int i, int i2) {
        if (this.k != null) {
            return;
        }
        if (this.p) {
            Set set = CM0.a;
            CM0.a(this, MW0.e, i, i2, false);
        }
        this.f = false;
        AK0 ak0 = new AK0(this, 0);
        this.k = ak0;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        postOnAnimationDelayed(ak0, 20L);
    }

    public final int j(int i) {
        int iMax = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.E) {
            return CM0.g(this, i, 0, iMax, 0).x;
        }
        return CM0.g(this, i, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x + CM0.d(this, getScrollX(), getReactScrollViewScrollState().b.x, i);
    }

    public final void k(int i, int i2) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = overScroller.getCurrX();
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        overScroller.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo((overScroller.getCurrX() - currX) + i, getScrollY());
            return;
        }
        this.c.fling(i, getScrollY(), (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalX() - overScroller.getStartX())), 0, 0, i2, 0, 0);
    }

    public final void l(int i) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i == 17 ? i2 - 1 : i2 + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        c(i3 * width, getScrollY());
        i(0, 0);
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
        this.I = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.I;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.I = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0992Mm0 c0992Mm0 = this.J;
        if (c0992Mm0 != null) {
            c0992Mm0.c();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.y.U(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return false;
        }
        if (motionEvent.getAction() == 0 && d(this, motionEvent, true) != null) {
            return false;
        }
        if (!XB0.b(this.F)) {
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OverScroller overScroller;
        int i5 = this.a;
        if (i5 != Integer.MIN_VALUE && (overScroller = this.c) != null && i5 != overScroller.getFinalX() && !overScroller.isFinished()) {
            overScroller.startScroll(this.a, overScroller.getFinalY(), 0, 0);
            overScroller.forceFinished(true);
            this.a = Integer.MIN_VALUE;
        }
        View contentView = getContentView();
        if (contentView != null && contentView.getWidth() != 0 && contentView.getHeight() != 0) {
            int scrollX = this.A;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.B;
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
        if (this.I == null) {
            return;
        }
        if ((AbstractC6792rB1.b() ? view.getLayoutDirection() : this.D.a) != 1) {
            C0992Mm0 c0992Mm0 = this.J;
            if (c0992Mm0 == null || R02.b(c0992Mm0.a.getId()) == 2) {
                return;
            }
            c0992Mm0.d();
            return;
        }
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i9 = i3 - i;
        int scrollX = i9 - (i7 - getScrollX());
        scrollTo(scrollX, getScrollY());
        k(scrollX, i9 - getWidth());
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OverScroller overScroller;
        AbstractC1968Yz1.a(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z || (overScroller = this.c) == null) {
            return;
        }
        this.a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int iMax;
        OverScroller overScroller = this.c;
        if (overScroller != null && !overScroller.isFinished() && overScroller.getCurrX() != overScroller.getFinalX() && i >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            overScroller.abortAnimation();
            i = iMax;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f = true;
        C2423by0 c2423by0 = this.b;
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
            boolean z = this.o;
            CM0.i(this);
            CM0.a(this, MW0.d, f, f2, z);
            this.n = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AK0 ak0;
        if (!this.m || !XB0.a(this.F)) {
            return false;
        }
        C7845wi1 c7845wi1 = this.d;
        c7845wi1.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.i) {
            CM0.i(this);
            float f = c7845wi1.b;
            float f2 = c7845wi1.c;
            CM0.a(this, MW0.c, f, f2, false);
            GB1.a(this, motionEvent);
            this.i = false;
            i(Math.round(f), Math.round(f2));
        }
        if (actionMasked == 0 && (ak0 = this.k) != null) {
            removeCallbacks(ak0);
            this.k = null;
            getFlingAnimator().cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean pageScroll(int i) {
        boolean zPageScroll = super.pageScroll(i);
        if (this.j && zPageScroll) {
            i(0, 0);
        }
        return zPageScroll;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        int iH;
        if (view2 != null && !this.j && (iH = h(view2)) != 0) {
            scrollBy(iH, 0);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        CM0.i(this);
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            this.A = i;
            this.B = i2;
        } else {
            this.A = -1;
            this.B = -1;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.y.b0(i);
    }

    public void setBorderRadius(float f) {
        this.y.G().l(f);
    }

    public void setBorderStyle(String str) {
        int iB;
        C1453Sk c1453SkG = this.y.G();
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

    public void setDecelerationRate(float f) {
        getReactScrollViewScrollState().g = f;
        OverScroller overScroller = this.c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.s = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.o = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.r) {
            this.r = i;
            this.q = new ColorDrawable(this.r);
        }
    }

    @Override // defpackage.InterfaceC7778wM0
    public void setLastScrollDispatchTime(long j) {
        this.G = j;
    }

    public void setMaintainVisibleContentPosition(C0915Lm0 c0915Lm0) {
        C0992Mm0 c0992Mm0;
        if (c0915Lm0 != null && this.J == null) {
            C0992Mm0 c0992Mm02 = new C0992Mm0(this, true);
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
        this.y.e0(str);
    }

    @Override // defpackage.YL0
    public final void setOverflowInset(int i, int i2, int i3, int i4) {
        this.e.set(i, i2, i3, i4);
    }

    public void setPagingEnabled(boolean z) {
        this.j = z;
    }

    public void setPointerEvents(XB0 xb0) {
        this.F = xb0;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.g == null) {
            this.g = new Rect();
        }
        this.l = z;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z) {
        this.m = z;
    }

    public void setScrollEventThrottle(int i) {
        this.H = i;
    }

    public void setSendMomentumEvents(boolean z) {
        this.p = z;
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
        this.C = g41;
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
