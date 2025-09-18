package p000;

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
public final class ViewGroupOnHierarchyChangeListenerC10767qM0 extends ScrollView implements OJ0, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, YL0, InterfaceC11661xM0, InterfaceC11915zM0, InterfaceC11407vM0, InterfaceC11534wM0, InterfaceC11788yM0 {

    /* renamed from: K */
    public static Field f40797K = null;

    /* renamed from: L */
    public static boolean f40798L = false;

    /* renamed from: A */
    public ReadableMap f40799A;

    /* renamed from: B */
    public int f40800B;

    /* renamed from: C */
    public int f40801C;

    /* renamed from: D */
    public G41 f40802D;

    /* renamed from: E */
    public final BM0 f40803E;

    /* renamed from: F */
    public final ObjectAnimator f40804F;

    /* renamed from: G */
    public XB0 f40805G;

    /* renamed from: H */
    public long f40806H;

    /* renamed from: I */
    public int f40807I;

    /* renamed from: J */
    public C7962Mm0 f40808J;

    /* renamed from: a */
    public final C8918by0 f40809a;

    /* renamed from: b */
    public final OverScroller f40810b;

    /* renamed from: c */
    public final C11579wi1 f40811c;

    /* renamed from: d */
    public final Rect f40812d;

    /* renamed from: e */
    public final Rect f40813e;

    /* renamed from: f */
    public boolean f40814f;

    /* renamed from: g */
    public Rect f40815g;

    /* renamed from: h */
    public String f40816h;

    /* renamed from: i */
    public boolean f40817i;

    /* renamed from: j */
    public boolean f40818j;

    /* renamed from: k */
    public AK0 f40819k;

    /* renamed from: l */
    public boolean f40820l;

    /* renamed from: m */
    public boolean f40821m;

    /* renamed from: n */
    public boolean f40822n;

    /* renamed from: o */
    public boolean f40823o;

    /* renamed from: p */
    public boolean f40824p;

    /* renamed from: q */
    public ColorDrawable f40825q;

    /* renamed from: r */
    public int f40826r;

    /* renamed from: s */
    public boolean f40827s;

    /* renamed from: t */
    public int f40828t;

    /* renamed from: u */
    public List f40829u;

    /* renamed from: v */
    public boolean f40830v;

    /* renamed from: w */
    public boolean f40831w;

    /* renamed from: x */
    public int f40832x;

    /* renamed from: y */
    public View f40833y;

    /* renamed from: z */
    public final C1356VY f40834z;

    public ViewGroupOnHierarchyChangeListenerC10767qM0(S91 s91) {
        super(s91);
        this.f40809a = new C8918by0();
        this.f40811c = new C11579wi1();
        this.f40812d = new Rect();
        this.f40813e = new Rect();
        this.f40816h = "hidden";
        this.f40818j = false;
        this.f40821m = true;
        this.f40822n = false;
        this.f40824p = false;
        this.f40826r = 0;
        this.f40827s = false;
        this.f40828t = 0;
        this.f40830v = true;
        this.f40831w = true;
        this.f40832x = 0;
        this.f40799A = null;
        this.f40800B = -1;
        this.f40801C = -1;
        this.f40802D = null;
        this.f40803E = new BM0(0);
        this.f40804F = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.f40805G = XB0.f13610e;
        this.f40806H = 0L;
        this.f40807I = 0;
        this.f40808J = null;
        C1356VY c1356vy = new C1356VY(this);
        this.f40834z = c1356vy;
        this.f40810b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        c1356vy.m8493e0("scroll");
        AbstractC10944rk1.m24482n(this, new C10895rM0());
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.f40833y;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f40798L) {
            f40798L = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                f40797K = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                AbstractC3929dS.m17683p("ReactNative");
            }
        }
        Field field = f40797K;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    AbstractC3929dS.m17683p("ReactNative");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.f40828t;
        return i != 0 ? i : getHeight();
    }

    @Override // p000.InterfaceC11407vM0
    /* renamed from: a */
    public final void mo603a(int i, int i2) {
        ObjectAnimator objectAnimator = this.f40804F;
        objectAnimator.cancel();
        objectAnimator.setDuration(CM0.m1150c(getContext())).setIntValues(i, i2);
        objectAnimator.start();
    }

    @Override // p000.InterfaceC11788yM0
    /* renamed from: b */
    public final void mo604b(int i, int i2) {
        scrollTo(i, i2);
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f40810b;
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
        this.f40810b.fling(getScrollX(), i2, 0, (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalY() - overScroller.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    @Override // p000.InterfaceC11788yM0
    /* renamed from: c */
    public final void mo605c(int i, int i2) {
        CM0.m1155h(this, i, i2);
        if (m23990h()) {
            this.f40800B = -1;
            this.f40801C = -1;
        } else {
            this.f40800B = i;
            this.f40801C = i2;
        }
    }

    /* renamed from: d */
    public final void m23986d() {
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (XB0.m8950b(this.f40805G)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.f40826r != 0) {
            View contentView = getContentView();
            if (this.f40825q != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.f40825q.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.f40825q.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void m23987e(int i) {
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
        if (this.f40828t == 0 && this.f40829u == null && this.f40832x == 0) {
            double snapInterval = getSnapInterval();
            double dM1151d = CM0.m1151d(this, getScrollY(), getReactScrollViewScrollState().f766b.y, scrollY);
            double dM23992j = m23992j(i);
            double d = dM1151d / snapInterval;
            int iFloor2 = (int) Math.floor(d);
            int iCeil = (int) Math.ceil(d);
            int iRound = (int) Math.round(d);
            int iRound2 = (int) Math.round(dM23992j / snapInterval);
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
            double d2 = iRound * snapInterval;
            if (d2 != dM1151d) {
                this.f40814f = true;
                mo605c(getScrollX(), (int) d2);
                return;
            }
            return;
        }
        boolean z = getFlingAnimator() != this.f40804F;
        int maxScrollY = getMaxScrollY();
        int iM23992j = m23992j(i);
        if (this.f40827s) {
            iM23992j = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List list = this.f40829u;
        if (list != null) {
            iIntValue2 = ((Integer) list.get(0)).intValue();
            List list2 = this.f40829u;
            iIntValue = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = maxScrollY;
            iFloor = 0;
            for (int i3 = 0; i3 < this.f40829u.size(); i3++) {
                int iIntValue3 = ((Integer) this.f40829u.get(i3)).intValue();
                if (iIntValue3 <= iM23992j && iM23992j - iIntValue3 < iM23992j - iFloor) {
                    iFloor = iIntValue3;
                }
                if (iIntValue3 >= iM23992j && iIntValue3 - iM23992j < iMin - iM23992j) {
                    iMin = iIntValue3;
                }
            }
        } else {
            int i4 = this.f40832x;
            if (i4 != 0) {
                int i5 = this.f40828t;
                if (i5 > 0) {
                    double d3 = iM23992j / i5;
                    double dFloor = Math.floor(d3);
                    int i6 = this.f40828t;
                    iFloor = Math.max(m23988f(i4, (int) (dFloor * i6), i6, height2), 0);
                    int i7 = this.f40832x;
                    double dCeil = Math.ceil(d3);
                    int i8 = this.f40828t;
                    iMin = Math.min(m23988f(i7, (int) (dCeil * i8), i8, height2), maxScrollY);
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i9 = iMin2;
                    int i10 = 0;
                    int i11 = 0;
                    int iMax = 0;
                    while (i10 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i10);
                        int i12 = this.f40832x;
                        if (i12 != i2) {
                            if (i12 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i12 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f40832x);
                                }
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= iM23992j && iM23992j - top < iM23992j - i11) {
                            i11 = top;
                        }
                        if (top >= iM23992j && top - iM23992j < i9 - iM23992j) {
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
                double d4 = iM23992j / snapInterval2;
                iFloor = (int) (Math.floor(d4) * snapInterval2);
                iMin = Math.min((int) (Math.ceil(d4) * snapInterval2), maxScrollY);
            }
            iIntValue = maxScrollY;
            iIntValue2 = 0;
        }
        int i13 = iM23992j - iFloor;
        int i14 = iMin - iM23992j;
        int i15 = Math.abs(i13) < Math.abs(i14) ? iFloor : iMin;
        if (this.f40831w || iM23992j < iIntValue) {
            if (this.f40830v || iM23992j > iIntValue2) {
                if (scrollY > 0) {
                    if (!z) {
                        scrollY += (int) (i14 * 10.0d);
                    }
                    iM23992j = iMin;
                } else if (scrollY < 0) {
                    if (!z) {
                        scrollY -= (int) (i13 * 10.0d);
                    }
                    iM23992j = iFloor;
                } else {
                    iM23992j = i15;
                }
            } else if (getScrollY() > iIntValue2) {
                iM23992j = iIntValue2;
            }
        } else if (getScrollY() < iIntValue) {
            iM23992j = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iM23992j), maxScrollY);
        if (z || (overScroller = this.f40810b) == null) {
            mo605c(getScrollX(), iMin3);
            return;
        }
        this.f40814f = true;
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
        if (this.f40821m || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    /* renamed from: f */
    public final int m23988f(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            i5 = (i4 - i3) / 2;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f40832x);
            }
            i5 = i4 - i3;
        }
        return i2 - i5;
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        if (Build.VERSION.SDK_INT == 28) {
            float fSignum = Math.signum(this.f40809a.f17245d);
            if (fSignum == 0.0f) {
                fSignum = Math.signum(i);
            }
            i = (int) (Math.abs(i) * fSignum);
        }
        if (this.f40818j) {
            m23987e(i);
        } else if (this.f40810b != null) {
            this.f40810b.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            postInvalidateOnAnimation();
        } else {
            super.fling(i);
        }
        m23989g(0, i);
    }

    /* renamed from: g */
    public final void m23989g(int i, int i2) {
        if (this.f40819k != null) {
            return;
        }
        if (this.f40823o) {
            Set set = CM0.f1338a;
            CM0.m1148a(this, MW0.f7206e, i, i2, false);
        }
        this.f40814f = false;
        AK0 ak0 = new AK0(this, 1);
        this.f40819k = ak0;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        postOnAnimationDelayed(ak0, 20L);
    }

    @Override // p000.OJ0
    public final void getClippingRect(Rect rect) {
        Rect rect2 = this.f40815g;
        UN1.m7999c(rect2);
        rect.set(rect2);
    }

    @Override // p000.InterfaceC11407vM0
    public ValueAnimator getFlingAnimator() {
        return this.f40804F;
    }

    @Override // p000.InterfaceC11534wM0
    public long getLastScrollDispatchTime() {
        return this.f40806H;
    }

    @Override // p000.YL0
    public String getOverflow() {
        return this.f40816h;
    }

    @Override // p000.YL0
    public Rect getOverflowInset() {
        return this.f40813e;
    }

    public XB0 getPointerEvents() {
        return this.f40805G;
    }

    @Override // p000.InterfaceC11661xM0
    public BM0 getReactScrollViewScrollState() {
        return this.f40803E;
    }

    @Override // p000.OJ0
    public boolean getRemoveClippedSubviews() {
        return this.f40820l;
    }

    public boolean getScrollEnabled() {
        return this.f40821m;
    }

    @Override // p000.InterfaceC11534wM0
    public int getScrollEventThrottle() {
        return this.f40807I;
    }

    @Override // p000.InterfaceC11915zM0
    public G41 getStateWrapper() {
        return this.f40802D;
    }

    /* renamed from: h */
    public final boolean m23990h() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    /* renamed from: i */
    public final boolean m23991i(View view) {
        Rect rect = this.f40812d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        view.getDrawingRect(rect);
        return iComputeScrollDeltaToGetChildRectOnScreen != 0 && Math.abs(iComputeScrollDeltaToGetChildRectOnScreen) < rect.width();
    }

    /* renamed from: j */
    public final int m23992j(int i) {
        if (getFlingAnimator() == this.f40804F) {
            return CM0.m1154g(this, 0, i, 0, getMaxScrollY()).y;
        }
        return CM0.m1154g(this, 0, i, 0, getMaxScrollY()).y + CM0.m1151d(this, getScrollY(), getReactScrollViewScrollState().f766b.y, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40820l) {
            updateClippingRect();
        }
        C7962Mm0 c7962Mm0 = this.f40808J;
        if (c7962Mm0 != null) {
            c7962Mm0.m5432b();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.f40833y = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.f40833y;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.f40833y = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7962Mm0 c7962Mm0 = this.f40808J;
        if (c7962Mm0 != null) {
            c7962Mm0.m5433c();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f40834z.m8483U(canvas);
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
        if (!this.f40821m) {
            return false;
        }
        if (!XB0.m8950b(this.f40805G)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                GB1.m2968b(this, motionEvent);
                Set set = CM0.f1338a;
                CM0.m1148a(this, MW0.f7203b, 0.0f, 0.0f, false);
                this.f40817i = true;
                getFlingAnimator().cancel();
                return true;
            }
        } catch (IllegalArgumentException unused) {
            AbstractC3929dS.m17686s("ReactNative");
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (m23990h()) {
            int scrollX = this.f40800B;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f40801C;
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
        if (this.f40833y == null) {
            return;
        }
        C7962Mm0 c7962Mm0 = this.f40808J;
        if (c7962Mm0 != null && R02.m6874b(c7962Mm0.f7331a.getId()) != 2) {
            c7962Mm0.m5434d();
        }
        if (isShown() && m23990h()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC8613Yz1.m9443a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.f40810b;
        if (overScroller != null && this.f40833y != null && !overScroller.isFinished() && overScroller.getCurrY() != overScroller.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            overScroller.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f40814f = true;
        C8918by0 c8918by0 = this.f40809a;
        if (c8918by0.m10548a(i, i2)) {
            if (this.f40820l) {
                updateClippingRect();
            }
            if (this.f40822n) {
                return;
            }
            this.f40822n = true;
            float f = c8918by0.f17244c;
            float f2 = c8918by0.f17245d;
            boolean z = this.f40824p;
            CM0.m1156i(this);
            CM0.m1148a(this, MW0.f7205d, f, f2, z);
            this.f40822n = false;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f40820l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AK0 ak0;
        if (!this.f40821m || !XB0.m8949a(this.f40805G)) {
            return false;
        }
        C11579wi1 c11579wi1 = this.f40811c;
        c11579wi1.m25673a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f40817i) {
            CM0.m1156i(this);
            float f = c11579wi1.f45040b;
            float f2 = c11579wi1.f45041c;
            CM0.m1148a(this, MW0.f7204c, f, f2, false);
            GB1.m2967a(this, motionEvent);
            this.f40817i = false;
            m23989g(Math.round(f), Math.round(f2));
        }
        if (actionMasked == 0 && (ak0 = this.f40819k) != null) {
            removeCallbacks(ak0);
            this.f40819k = null;
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
        CM0.m1156i(this);
        if (m23990h()) {
            this.f40800B = -1;
            this.f40801C = -1;
        } else {
            this.f40800B = i;
            this.f40801C = i2;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f40834z.m8489b0(i);
    }

    public void setBorderRadius(float f) {
        this.f40834z.m8469G().m7444l(f);
    }

    public void setBorderStyle(String str) {
        int iM26222B;
        C1179Sk c1179SkM8469G = this.f40834z.m8469G();
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

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.f40799A;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.f40799A = readableMap;
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
            scrollTo((int) AbstractC11406vL1.m25403b((float) d2), (int) AbstractC11406vL1.m25403b((float) d));
        }
    }

    public void setDecelerationRate(float f) {
        getReactScrollViewScrollState().f771g = f;
        OverScroller overScroller = this.f40810b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.f40827s = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.f40824p = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.f40826r) {
            this.f40826r = i;
            this.f40825q = new ColorDrawable(this.f40826r);
        }
    }

    @Override // p000.InterfaceC11534wM0
    public void setLastScrollDispatchTime(long j) {
        this.f40806H = j;
    }

    public void setMaintainVisibleContentPosition(C7910Lm0 c7910Lm0) {
        C7962Mm0 c7962Mm0;
        if (c7910Lm0 != null && this.f40808J == null) {
            C7962Mm0 c7962Mm02 = new C7962Mm0(this, false);
            this.f40808J = c7962Mm02;
            c7962Mm02.m5432b();
        } else if (c7910Lm0 == null && (c7962Mm0 = this.f40808J) != null) {
            c7962Mm0.m5433c();
            this.f40808J = null;
        }
        C7962Mm0 c7962Mm03 = this.f40808J;
        if (c7962Mm03 != null) {
            c7962Mm03.f7333c = c7910Lm0;
        }
    }

    public void setOverflow(String str) {
        this.f40816h = str;
        if (str == null) {
            str = "scroll";
        }
        this.f40834z.m8493e0(str);
    }

    @Override // p000.YL0
    public final void setOverflowInset(int i, int i2, int i3, int i4) {
        this.f40813e.set(i, i2, i3, i4);
    }

    public void setPagingEnabled(boolean z) {
        this.f40818j = z;
    }

    public void setPointerEvents(XB0 xb0) {
        this.f40805G = xb0;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f40815g == null) {
            this.f40815g = new Rect();
        }
        this.f40820l = z;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i) {
        int childCount = getChildCount();
        UN1.m7998b(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setTranslationY(i);
            }
            setPadding(0, 0, 0, i);
        }
        getReactScrollViewScrollState().f767c = i;
        CM0.m1149b(this);
        setRemoveClippedSubviews(this.f40820l);
    }

    public void setScrollEnabled(boolean z) {
        this.f40821m = z;
    }

    public void setScrollEventThrottle(int i) {
        this.f40807I = i;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f40823o = z;
    }

    public void setSnapInterval(int i) {
        this.f40828t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f40829u = list;
    }

    public void setSnapToAlignment(int i) {
        this.f40832x = i;
    }

    public void setSnapToEnd(boolean z) {
        this.f40831w = z;
    }

    public void setSnapToStart(boolean z) {
        this.f40830v = z;
    }

    public void setStateWrapper(G41 g41) {
        this.f40802D = g41;
    }

    @Override // p000.OJ0
    public final void updateClippingRect() {
        if (this.f40820l) {
            UN1.m7999c(this.f40815g);
            PJ0.m6301a(this, this.f40815g);
            KeyEvent.Callback contentView = getContentView();
            if (contentView instanceof OJ0) {
                ((OJ0) contentView).updateClippingRect();
            }
        }
    }

    public void setScrollPerfTag(String str) {
    }
}
