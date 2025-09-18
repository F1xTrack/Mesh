package p000;

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
public final class BK0 extends HorizontalScrollView implements OJ0, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, YL0, InterfaceC11661xM0, InterfaceC11915zM0, InterfaceC11407vM0, InterfaceC11534wM0, InterfaceC11788yM0 {

    /* renamed from: L */
    public static Field f717L = null;

    /* renamed from: M */
    public static boolean f718M = false;

    /* renamed from: A */
    public int f719A;

    /* renamed from: B */
    public int f720B;

    /* renamed from: C */
    public G41 f721C;

    /* renamed from: D */
    public final BM0 f722D;

    /* renamed from: E */
    public final ObjectAnimator f723E;

    /* renamed from: F */
    public XB0 f724F;

    /* renamed from: G */
    public long f725G;

    /* renamed from: H */
    public int f726H;

    /* renamed from: I */
    public View f727I;

    /* renamed from: J */
    public C7962Mm0 f728J;

    /* renamed from: K */
    public final Rect f729K;

    /* renamed from: a */
    public int f730a;

    /* renamed from: b */
    public final C8918by0 f731b;

    /* renamed from: c */
    public final OverScroller f732c;

    /* renamed from: d */
    public final C11579wi1 f733d;

    /* renamed from: e */
    public final Rect f734e;

    /* renamed from: f */
    public boolean f735f;

    /* renamed from: g */
    public Rect f736g;

    /* renamed from: h */
    public String f737h;

    /* renamed from: i */
    public boolean f738i;

    /* renamed from: j */
    public boolean f739j;

    /* renamed from: k */
    public AK0 f740k;

    /* renamed from: l */
    public boolean f741l;

    /* renamed from: m */
    public boolean f742m;

    /* renamed from: n */
    public boolean f743n;

    /* renamed from: o */
    public boolean f744o;

    /* renamed from: p */
    public boolean f745p;

    /* renamed from: q */
    public ColorDrawable f746q;

    /* renamed from: r */
    public int f747r;

    /* renamed from: s */
    public boolean f748s;

    /* renamed from: t */
    public int f749t;

    /* renamed from: u */
    public List f750u;

    /* renamed from: v */
    public boolean f751v;

    /* renamed from: w */
    public boolean f752w;

    /* renamed from: x */
    public int f753x;

    /* renamed from: y */
    public final C1356VY f754y;

    /* renamed from: z */
    public boolean f755z;

    public BK0(S91 s91) {
        super(s91);
        this.f730a = Integer.MIN_VALUE;
        this.f731b = new C8918by0();
        this.f733d = new C11579wi1();
        this.f734e = new Rect();
        this.f737h = "hidden";
        this.f739j = false;
        int i = 1;
        this.f742m = true;
        this.f743n = false;
        this.f744o = false;
        this.f747r = 0;
        this.f748s = false;
        this.f749t = 0;
        this.f751v = true;
        this.f752w = true;
        this.f753x = 0;
        this.f755z = false;
        this.f719A = -1;
        this.f720B = -1;
        this.f721C = null;
        this.f723E = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.f724F = XB0.f13610e;
        this.f725G = 0L;
        this.f726H = 0;
        this.f729K = new Rect();
        C1356VY c1356vy = new C1356VY(this);
        this.f754y = c1356vy;
        AbstractC10944rk1.m24482n(this, new C10895rM0());
        this.f732c = getOverScrollerFromParent();
        O90.m5968f(s91, "context");
        if ((s91.getApplicationInfo().flags & 4194304) == 0 || (!s91.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) && (!s91.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1))) {
            i = 0;
        }
        this.f722D = new BM0(i);
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
        c1356vy.m8493e0("scroll");
    }

    /* renamed from: d */
    public static HorizontalScrollView m602d(View view, MotionEvent motionEvent, boolean z) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z && (view instanceof HorizontalScrollView)) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (AbstractC9536gk1.m18621p(view) && (view instanceof BK0) && ((BK0) view).f742m) {
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
                HorizontalScrollView horizontalScrollViewM602d = m602d(viewGroup.getChildAt(i), motionEvent, false);
                if (horizontalScrollViewM602d != null) {
                    return horizontalScrollViewM602d;
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
        if (!f718M) {
            f718M = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f717L = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC3929dS.m17683p("BK0");
            }
        }
        Field field = f717L;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC3929dS.m17683p("BK0");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.f749t;
        return i != 0 ? i : getWidth();
    }

    @Override // p000.InterfaceC11407vM0
    /* renamed from: a */
    public final void mo603a(int i, int i2) {
        ObjectAnimator objectAnimator = this.f723E;
        objectAnimator.cancel();
        objectAnimator.setDuration(CM0.m1150c(getContext())).setIntValues(i, i2);
        objectAnimator.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (!this.f739j || this.f755z) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (m609h(view) != 0) {
                int iM609h = m609h(view);
                Rect rect = this.f729K;
                view.getDrawingRect(rect);
                if ((iM609h == 0 || Math.abs(iM609h) >= rect.width()) && !view.isFocused()) {
                }
            }
            arrayList.add(view);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean arrowScroll(int i) {
        if (!this.f739j) {
            return super.arrowScroll(i);
        }
        boolean z = true;
        this.f755z = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                m613l(i);
            } else {
                if (m609h(viewFindNextFocus) != 0) {
                    int iM609h = m609h(viewFindNextFocus);
                    Rect rect = this.f729K;
                    viewFindNextFocus.getDrawingRect(rect);
                    if (iM609h == 0 || Math.abs(iM609h) >= rect.width() / 2) {
                        m613l(i);
                    }
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z = false;
        }
        this.f755z = false;
        return z;
    }

    @Override // p000.InterfaceC11788yM0
    /* renamed from: b */
    public final void mo604b(int i, int i2) {
        scrollTo(i, i2);
        m612k(i, Integer.MAX_VALUE);
    }

    @Override // p000.InterfaceC11788yM0
    /* renamed from: c */
    public final void mo605c(int i, int i2) {
        CM0.m1155h(this, i, i2);
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            this.f719A = i;
            this.f720B = i2;
        } else {
            this.f719A = -1;
            this.f720B = -1;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f742m && super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (XB0.m8950b(this.f724F)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.f747r != 0) {
            View contentView = getContentView();
            if (this.f746q != null && contentView != null && contentView.getRight() < getWidth()) {
                this.f746q.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f746q.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void m606e() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f742m || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    /* renamed from: f */
    public final void m607f(int i) {
        int iMin;
        int iMax;
        int iIntValue;
        int iIntValue2;
        OverScroller overScroller;
        int scrollX = i;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f749t == 0 && this.f750u == null && this.f753x == 0) {
            double snapInterval = getSnapInterval();
            double dM1151d = CM0.m1151d(this, getScrollX(), getReactScrollViewScrollState().f766b.x, scrollX);
            double dM611j = m611j(i);
            double d = dM1151d / snapInterval;
            int iFloor = (int) Math.floor(d);
            int iCeil = (int) Math.ceil(d);
            int iRound = (int) Math.round(d);
            int iRound2 = (int) Math.round(dM611j / snapInterval);
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
            double d2 = iRound * snapInterval;
            if (d2 != dM1151d) {
                this.f735f = true;
                mo605c((int) d2, getScrollY());
                return;
            }
            return;
        }
        boolean z = getFlingAnimator() != this.f723E;
        int iMax2 = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iM611j = m611j(i);
        if (this.f748s) {
            iM611j = getScrollX();
        }
        int width = getWidth();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int paddingStart = (width - getPaddingStart()) - getPaddingEnd();
        int layoutDirection = AbstractC10874rB1.m24211b() ? getLayoutDirection() : this.f722D.f765a;
        if (layoutDirection == 1) {
            iM611j = iMax2 - iM611j;
            scrollX = -scrollX;
        }
        List list = this.f750u;
        if (list == null || list.isEmpty()) {
            int i2 = this.f753x;
            if (i2 != 0) {
                int i3 = this.f749t;
                if (i3 > 0) {
                    double d3 = iM611j / i3;
                    double dFloor = Math.floor(d3);
                    int i4 = this.f749t;
                    iMax = Math.max(m608g(i2, (int) (dFloor * i4), i4, paddingStart), 0);
                    int i5 = this.f753x;
                    double dCeil = Math.ceil(d3);
                    int i6 = this.f749t;
                    iMin = Math.min(m608g(i5, (int) (dCeil * i6), i6, paddingStart), iMax2);
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax2;
                    int i7 = iMin2;
                    int i8 = 0;
                    int iMax3 = 0;
                    for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                        View childAt = viewGroup.getChildAt(i9);
                        int iM608g = m608g(this.f753x, childAt.getLeft(), childAt.getWidth(), paddingStart);
                        if (iM608g <= iM611j && iM611j - iM608g < iM611j - i8) {
                            i8 = iM608g;
                        }
                        if (iM608g >= iM611j && iM608g - iM611j < i7 - iM611j) {
                            i7 = iM608g;
                        }
                        iMin2 = Math.min(iMin2, iM608g);
                        iMax3 = Math.max(iMax3, iM608g);
                    }
                    iMax = Math.max(i8, iMin2);
                    iMin = Math.min(i7, iMax3);
                }
            } else {
                double snapInterval2 = getSnapInterval();
                double d4 = iM611j / snapInterval2;
                int iFloor2 = (int) (Math.floor(d4) * snapInterval2);
                iMin = Math.min((int) (Math.ceil(d4) * snapInterval2), iMax2);
                iMax = iFloor2;
            }
            iIntValue = iMax2;
            iIntValue2 = 0;
        } else {
            iIntValue2 = ((Integer) this.f750u.get(0)).intValue();
            List list2 = this.f750u;
            iIntValue = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = iMax2;
            iMax = 0;
            for (int i10 = 0; i10 < this.f750u.size(); i10++) {
                int iIntValue3 = ((Integer) this.f750u.get(i10)).intValue();
                if (iIntValue3 <= iM611j && iM611j - iIntValue3 < iM611j - iMax) {
                    iMax = iIntValue3;
                }
                if (iIntValue3 >= iM611j && iIntValue3 - iM611j < iMin - iM611j) {
                    iMin = iIntValue3;
                }
            }
        }
        int i11 = iM611j - iMax;
        int i12 = iMin - iM611j;
        int i13 = Math.abs(i11) < Math.abs(i12) ? iMax : iMin;
        int scrollX2 = getScrollX();
        if (layoutDirection == 1) {
            scrollX2 = iMax2 - scrollX2;
        }
        if (this.f752w || iM611j < iIntValue) {
            if (this.f751v || iM611j > iIntValue2) {
                if (scrollX > 0) {
                    if (!z) {
                        scrollX += (int) (i12 * 10.0d);
                    }
                    iM611j = iMin;
                } else if (scrollX < 0) {
                    if (!z) {
                        scrollX -= (int) (i11 * 10.0d);
                    }
                    iM611j = iMax;
                } else {
                    iM611j = i13;
                }
            } else if (scrollX2 > iIntValue2) {
                iM611j = iIntValue2;
            }
        } else if (scrollX2 < iIntValue) {
            iM611j = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iM611j), iMax2);
        if (layoutDirection == 1) {
            iMin3 = iMax2 - iMin3;
            scrollX = -scrollX;
        }
        int i14 = iMin3;
        if (z || (overScroller = this.f732c) == null) {
            mo605c(i14, getScrollY());
            return;
        }
        this.f735f = true;
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
            i = (int) (Math.signum(this.f731b.f17244c) * Math.abs(i));
        }
        if (this.f739j) {
            m607f(i);
        } else if (this.f732c != null) {
            int width = getWidth();
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            this.f732c.fling(getScrollX(), getScrollY(), i, 0, 0, Integer.MAX_VALUE, 0, 0, ((width - getPaddingStart()) - getPaddingEnd()) / 2, 0);
            postInvalidateOnAnimation();
        } else {
            super.fling(i);
        }
        m610i(i, 0);
    }

    /* renamed from: g */
    public final int m608g(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            i5 = (i4 - i3) / 2;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f753x);
            }
            i5 = i4 - i3;
        }
        return i2 - i5;
    }

    @Override // p000.OJ0
    public final void getClippingRect(Rect rect) {
        Rect rect2 = this.f736g;
        UN1.m7999c(rect2);
        rect.set(rect2);
    }

    @Override // p000.InterfaceC11407vM0
    public ValueAnimator getFlingAnimator() {
        return this.f723E;
    }

    @Override // p000.InterfaceC11534wM0
    public long getLastScrollDispatchTime() {
        return this.f725G;
    }

    @Override // p000.YL0
    public String getOverflow() {
        return this.f737h;
    }

    @Override // p000.YL0
    public Rect getOverflowInset() {
        return this.f734e;
    }

    public XB0 getPointerEvents() {
        return this.f724F;
    }

    @Override // p000.InterfaceC11661xM0
    public BM0 getReactScrollViewScrollState() {
        return this.f722D;
    }

    @Override // p000.OJ0
    public boolean getRemoveClippedSubviews() {
        return this.f741l;
    }

    public boolean getScrollEnabled() {
        return this.f742m;
    }

    @Override // p000.InterfaceC11534wM0
    public int getScrollEventThrottle() {
        return this.f726H;
    }

    @Override // p000.InterfaceC11915zM0
    public G41 getStateWrapper() {
        return this.f721C;
    }

    /* renamed from: h */
    public final int m609h(View view) {
        Rect rect = this.f729K;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return computeScrollDeltaToGetChildRectOnScreen(rect);
    }

    /* renamed from: i */
    public final void m610i(int i, int i2) {
        if (this.f740k != null) {
            return;
        }
        if (this.f745p) {
            Set set = CM0.f1338a;
            CM0.m1148a(this, MW0.f7206e, i, i2, false);
        }
        this.f735f = false;
        AK0 ak0 = new AK0(this, 0);
        this.f740k = ak0;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        postOnAnimationDelayed(ak0, 20L);
    }

    /* renamed from: j */
    public final int m611j(int i) {
        int iMax = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.f723E) {
            return CM0.m1154g(this, i, 0, iMax, 0).x;
        }
        return CM0.m1154g(this, i, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x + CM0.m1151d(this, getScrollX(), getReactScrollViewScrollState().f766b.x, i);
    }

    /* renamed from: k */
    public final void m612k(int i, int i2) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f732c;
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
        this.f732c.fling(i, getScrollY(), (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalX() - overScroller.getStartX())), 0, 0, i2, 0, 0);
    }

    /* renamed from: l */
    public final void m613l(int i) {
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
        mo605c(i3 * width, getScrollY());
        m610i(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f741l) {
            updateClippingRect();
        }
        C7962Mm0 c7962Mm0 = this.f728J;
        if (c7962Mm0 != null) {
            c7962Mm0.m5432b();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.f727I = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.f727I;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.f727I = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7962Mm0 c7962Mm0 = this.f728J;
        if (c7962Mm0 != null) {
            c7962Mm0.m5433c();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f754y.m8483U(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f742m) {
            return false;
        }
        if (motionEvent.getAction() == 0 && m602d(this, motionEvent, true) != null) {
            return false;
        }
        if (!XB0.m8950b(this.f724F)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                GB1.m2968b(this, motionEvent);
                Set set = CM0.f1338a;
                CM0.m1148a(this, MW0.f7203b, 0.0f, 0.0f, false);
                this.f738i = true;
                getFlingAnimator().cancel();
                return true;
            }
        } catch (IllegalArgumentException unused) {
            AbstractC3929dS.m17686s("ReactNative");
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OverScroller overScroller;
        int i5 = this.f730a;
        if (i5 != Integer.MIN_VALUE && (overScroller = this.f732c) != null && i5 != overScroller.getFinalX() && !overScroller.isFinished()) {
            overScroller.startScroll(this.f730a, overScroller.getFinalY(), 0, 0);
            overScroller.forceFinished(true);
            this.f730a = Integer.MIN_VALUE;
        }
        View contentView = getContentView();
        if (contentView != null && contentView.getWidth() != 0 && contentView.getHeight() != 0) {
            int scrollX = this.f719A;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f720B;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        Iterator it = CM0.f1338a.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f727I == null) {
            return;
        }
        if ((AbstractC10874rB1.m24211b() ? view.getLayoutDirection() : this.f722D.f765a) != 1) {
            C7962Mm0 c7962Mm0 = this.f728J;
            if (c7962Mm0 == null || R02.m6874b(c7962Mm0.f7331a.getId()) == 2) {
                return;
            }
            c7962Mm0.m5434d();
            return;
        }
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i9 = i3 - i;
        int scrollX = i9 - (i7 - getScrollX());
        scrollTo(scrollX, getScrollY());
        m612k(scrollX, i9 - getWidth());
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OverScroller overScroller;
        AbstractC8613Yz1.m9443a(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z || (overScroller = this.f732c) == null) {
            return;
        }
        this.f730a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int iMax;
        OverScroller overScroller = this.f732c;
        if (overScroller != null && !overScroller.isFinished() && overScroller.getCurrX() != overScroller.getFinalX() && i >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            overScroller.abortAnimation();
            i = iMax;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f735f = true;
        C8918by0 c8918by0 = this.f731b;
        if (c8918by0.m10548a(i, i2)) {
            if (this.f741l) {
                updateClippingRect();
            }
            if (this.f743n) {
                return;
            }
            this.f743n = true;
            float f = c8918by0.f17244c;
            float f2 = c8918by0.f17245d;
            boolean z = this.f744o;
            CM0.m1156i(this);
            CM0.m1148a(this, MW0.f7205d, f, f2, z);
            this.f743n = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f741l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AK0 ak0;
        if (!this.f742m || !XB0.m8949a(this.f724F)) {
            return false;
        }
        C11579wi1 c11579wi1 = this.f733d;
        c11579wi1.m25673a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f738i) {
            CM0.m1156i(this);
            float f = c11579wi1.f45040b;
            float f2 = c11579wi1.f45041c;
            CM0.m1148a(this, MW0.f7204c, f, f2, false);
            GB1.m2967a(this, motionEvent);
            this.f738i = false;
            m610i(Math.round(f), Math.round(f2));
        }
        if (actionMasked == 0 && (ak0 = this.f740k) != null) {
            removeCallbacks(ak0);
            this.f740k = null;
            getFlingAnimator().cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean pageScroll(int i) {
        boolean zPageScroll = super.pageScroll(i);
        if (this.f739j && zPageScroll) {
            m610i(0, 0);
        }
        return zPageScroll;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        int iM609h;
        if (view2 != null && !this.f739j && (iM609h = m609h(view2)) != 0) {
            scrollBy(iM609h, 0);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        CM0.m1156i(this);
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            this.f719A = i;
            this.f720B = i2;
        } else {
            this.f719A = -1;
            this.f720B = -1;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f754y.m8489b0(i);
    }

    public void setBorderRadius(float f) {
        this.f754y.m8469G().m7444l(f);
    }

    public void setBorderStyle(String str) {
        int iM26222B;
        C1179Sk c1179SkM8469G = this.f754y.m8469G();
        if (str == null) {
            iM26222B = 0;
        } else {
            c1179SkM8469G.getClass();
            iM26222B = AbstractC7222ym.m26222B(str.toUpperCase(Locale.US));
        }
        if (c1179SkM8469G.f10930A != iM26222B) {
            c1179SkM8469G.f10930A = iM26222B;
            c1179SkM8469G.f10949s = true;
            c1179SkM8469G.invalidateSelf();
        }
    }

    public void setDecelerationRate(float f) {
        getReactScrollViewScrollState().f771g = f;
        OverScroller overScroller = this.f732c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.f748s = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.f744o = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.f747r) {
            this.f747r = i;
            this.f746q = new ColorDrawable(this.f747r);
        }
    }

    @Override // p000.InterfaceC11534wM0
    public void setLastScrollDispatchTime(long j) {
        this.f725G = j;
    }

    public void setMaintainVisibleContentPosition(C7910Lm0 c7910Lm0) {
        C7962Mm0 c7962Mm0;
        if (c7910Lm0 != null && this.f728J == null) {
            C7962Mm0 c7962Mm02 = new C7962Mm0(this, true);
            this.f728J = c7962Mm02;
            c7962Mm02.m5432b();
        } else if (c7910Lm0 == null && (c7962Mm0 = this.f728J) != null) {
            c7962Mm0.m5433c();
            this.f728J = null;
        }
        C7962Mm0 c7962Mm03 = this.f728J;
        if (c7962Mm03 != null) {
            c7962Mm03.f7333c = c7910Lm0;
        }
    }

    public void setOverflow(String str) {
        this.f737h = str;
        if (str == null) {
            str = "scroll";
        }
        this.f754y.m8493e0(str);
    }

    @Override // p000.YL0
    public final void setOverflowInset(int i, int i2, int i3, int i4) {
        this.f734e.set(i, i2, i3, i4);
    }

    public void setPagingEnabled(boolean z) {
        this.f739j = z;
    }

    public void setPointerEvents(XB0 xb0) {
        this.f724F = xb0;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f736g == null) {
            this.f736g = new Rect();
        }
        this.f741l = z;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z) {
        this.f742m = z;
    }

    public void setScrollEventThrottle(int i) {
        this.f726H = i;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f745p = z;
    }

    public void setSnapInterval(int i) {
        this.f749t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f750u = list;
    }

    public void setSnapToAlignment(int i) {
        this.f753x = i;
    }

    public void setSnapToEnd(boolean z) {
        this.f752w = z;
    }

    public void setSnapToStart(boolean z) {
        this.f751v = z;
    }

    public void setStateWrapper(G41 g41) {
        this.f721C = g41;
    }

    @Override // p000.OJ0
    public final void updateClippingRect() {
        if (this.f741l) {
            UN1.m7999c(this.f736g);
            PJ0.m6301a(this, this.f736g);
            KeyEvent.Callback contentView = getContentView();
            if (contentView instanceof OJ0) {
                ((OJ0) contentView).updateClippingRect();
            }
        }
    }

    public void setScrollPerfTag(String str) {
    }
}
