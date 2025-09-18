package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11918zN1;
import p000.AbstractC7965Mn1;
import p000.AbstractC9280ek1;
import p000.AbstractC9536gk1;
import p000.C10818ql1;
import p000.C11649xG0;
import p000.C11843yn1;
import p000.C3903d2;
import p000.C4091g2;
import p000.C4154h2;
import p000.C6527o2;
import p000.C7809Jn1;
import p000.C7861Kn1;
import p000.C7913Ln1;
import p000.C8277Sn1;
import p000.C8433Vn1;
import p000.C8745ab1;
import p000.C9518gb1;
import p000.InterfaceC3915dE;
import p000.InterfaceC3977eE;
import p000.InterfaceC4028f2;
import p000.InterfaceC7718Hu0;
import p000.InterfaceC7770Iu0;
import p000.InterfaceC8490Wq0;
import p000.J80;
import p000.MenuC7450Cq0;
import p000.RunnableC3965e2;
import ru.mes.dnevnik.R;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC3915dE, InterfaceC7718Hu0, InterfaceC7770Iu0 {

    /* renamed from: C */
    public static final int[] f15810C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D */
    public static final C8433Vn1 f15811D;

    /* renamed from: E */
    public static final Rect f15812E;

    /* renamed from: A */
    public final C11649xG0 f15813A;

    /* renamed from: B */
    public final C4154h2 f15814B;

    /* renamed from: a */
    public int f15815a;

    /* renamed from: b */
    public int f15816b;

    /* renamed from: c */
    public ContentFrameLayout f15817c;

    /* renamed from: d */
    public ActionBarContainer f15818d;

    /* renamed from: e */
    public InterfaceC3977eE f15819e;

    /* renamed from: f */
    public Drawable f15820f;

    /* renamed from: g */
    public boolean f15821g;

    /* renamed from: h */
    public boolean f15822h;

    /* renamed from: i */
    public boolean f15823i;

    /* renamed from: j */
    public boolean f15824j;

    /* renamed from: k */
    public int f15825k;

    /* renamed from: l */
    public int f15826l;

    /* renamed from: m */
    public final Rect f15827m;

    /* renamed from: n */
    public final Rect f15828n;

    /* renamed from: o */
    public final Rect f15829o;

    /* renamed from: p */
    public final Rect f15830p;

    /* renamed from: q */
    public C8433Vn1 f15831q;

    /* renamed from: r */
    public C8433Vn1 f15832r;

    /* renamed from: s */
    public C8433Vn1 f15833s;

    /* renamed from: t */
    public C8433Vn1 f15834t;

    /* renamed from: u */
    public InterfaceC4028f2 f15835u;

    /* renamed from: v */
    public OverScroller f15836v;

    /* renamed from: w */
    public ViewPropertyAnimator f15837w;

    /* renamed from: x */
    public final C3903d2 f15838x;

    /* renamed from: y */
    public final RunnableC3965e2 f15839y;

    /* renamed from: z */
    public final RunnableC3965e2 f15840z;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC7965Mn1 c7913Ln1 = i >= 30 ? new C7913Ln1() : i >= 29 ? new C7861Kn1() : new C7809Jn1();
        c7913Ln1.mo4416g(J80.m4201b(0, 1, 0, 1));
        f15811D = c7913Ln1.mo4414b();
        f15812E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15816b = 0;
        this.f15827m = new Rect();
        this.f15828n = new Rect();
        this.f15829o = new Rect();
        this.f15830p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C8433Vn1 c8433Vn1 = C8433Vn1.f12755b;
        this.f15831q = c8433Vn1;
        this.f15832r = c8433Vn1;
        this.f15833s = c8433Vn1;
        this.f15834t = c8433Vn1;
        this.f15838x = new C3903d2(0, this);
        this.f15839y = new RunnableC3965e2(this, 0);
        this.f15840z = new RunnableC3965e2(this, 1);
        m9840i(context);
        this.f15813A = new C11649xG0(6);
        C4154h2 c4154h2 = new C4154h2(context);
        c4154h2.setWillNotDraw(true);
        this.f15814B = c4154h2;
        addView(c4154h2);
    }

    /* renamed from: g */
    public static boolean m9838g(View view, Rect rect, boolean z) {
        boolean z2;
        C4091g2 c4091g2 = (C4091g2) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c4091g2).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c4091g2).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c4091g2).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c4091g2).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c4091g2).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c4091g2).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c4091g2).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c4091g2).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: a */
    public final void mo3641a(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000.InterfaceC7770Iu0
    /* renamed from: b */
    public final void mo4065b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo3642c(view, i, i2, i3, i4, i5);
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: c */
    public final void mo3642c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4091g2;
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: d */
    public final boolean mo3643d(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f15820f != null) {
            if (this.f15818d.getVisibility() == 0) {
                translationY = (int) (this.f15818d.getTranslationY() + this.f15818d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f15820f.setBounds(0, translationY, getWidth(), this.f15820f.getIntrinsicHeight() + translationY);
            this.f15820f.draw(canvas);
        }
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: e */
    public final void mo3644e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC7718Hu0
    /* renamed from: f */
    public final void mo3645f(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4091g2(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4091g2(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f15818d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C11649xG0 c11649xG0 = this.f15813A;
        return c11649xG0.f45509c | c11649xG0.f45508b;
    }

    public CharSequence getTitle() {
        m9842k();
        return ((C9518gb1) this.f15819e).f27862a.getTitle();
    }

    /* renamed from: h */
    public final void m9839h() {
        removeCallbacks(this.f15839y);
        removeCallbacks(this.f15840z);
        ViewPropertyAnimator viewPropertyAnimator = this.f15837w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public final void m9840i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f15810C);
        this.f15815a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f15820f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f15836v = new OverScroller(context);
    }

    /* renamed from: j */
    public final void m9841j(int i) {
        m9842k();
        if (i == 2) {
            this.f15819e.getClass();
        } else if (i == 5) {
            this.f15819e.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: k */
    public final void m9842k() {
        InterfaceC3977eE wrapper;
        if (this.f15817c == null) {
            this.f15817c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f15818d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC3977eE) {
                wrapper = (InterfaceC3977eE) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f15819e = wrapper;
        }
    }

    /* renamed from: l */
    public final void m9843l(MenuC7450Cq0 menuC7450Cq0, InterfaceC8490Wq0 interfaceC8490Wq0) {
        m9842k();
        C9518gb1 c9518gb1 = (C9518gb1) this.f15819e;
        C6527o2 c6527o2 = c9518gb1.f27874m;
        Toolbar toolbar = c9518gb1.f27862a;
        if (c6527o2 == null) {
            c9518gb1.f27874m = new C6527o2(toolbar.getContext());
        }
        C6527o2 c6527o22 = c9518gb1.f27874m;
        c6527o22.f38694e = interfaceC8490Wq0;
        if (menuC7450Cq0 == null && toolbar.f15889a == null) {
            return;
        }
        toolbar.m9858f();
        MenuC7450Cq0 menuC7450Cq02 = toolbar.f15889a.f15842p;
        if (menuC7450Cq02 == menuC7450Cq0) {
            return;
        }
        if (menuC7450Cq02 != null) {
            menuC7450Cq02.m1419r(toolbar.f15880L);
            menuC7450Cq02.m1419r(toolbar.f15881M);
        }
        if (toolbar.f15881M == null) {
            toolbar.f15881M = new C8745ab1(toolbar);
        }
        c6527o22.f38706q = true;
        if (menuC7450Cq0 != null) {
            menuC7450Cq0.m1403b(c6527o22, toolbar.f15898j);
            menuC7450Cq0.m1403b(toolbar.f15881M, toolbar.f15898j);
        } else {
            c6527o22.mo308k(toolbar.f15898j, null);
            toolbar.f15881M.mo308k(toolbar.f15898j, null);
            c6527o22.mo307i();
            toolbar.f15881M.mo307i();
        }
        toolbar.f15889a.setPopupTheme(toolbar.f15899k);
        toolbar.f15889a.setPresenter(c6527o22);
        toolbar.f15880L = c6527o22;
        toolbar.m9871w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m9842k();
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(this, windowInsets);
        boolean zM9838g = m9838g(this.f15818d, new Rect(c8433Vn1M8551h.m8553b(), c8433Vn1M8551h.m8555d(), c8433Vn1M8551h.m8554c(), c8433Vn1M8551h.m8552a()), false);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        Rect rect = this.f15827m;
        AbstractC9536gk1.m18607b(this, c8433Vn1M8551h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C8277Sn1 c8277Sn1 = c8433Vn1M8551h.f12756a;
        C8433Vn1 c8433Vn1Mo5839l = c8277Sn1.mo5839l(i, i2, i3, i4);
        this.f15831q = c8433Vn1Mo5839l;
        boolean z = true;
        if (!this.f15832r.equals(c8433Vn1Mo5839l)) {
            this.f15832r = this.f15831q;
            zM9838g = true;
        }
        Rect rect2 = this.f15828n;
        if (rect2.equals(rect)) {
            z = zM9838g;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c8277Sn1.mo6430a().f12756a.mo6140c().f12756a.mo6139b().m8557g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9840i(getContext());
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9280ek1.m18029c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9839h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C4091g2 c4091g2 = (C4091g2) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c4091g2).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c4091g2).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f15823i || !z) {
            return false;
        }
        this.f15836v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f15836v.getFinalY() > this.f15818d.getHeight()) {
            m9839h();
            this.f15840z.run();
        } else {
            m9839h();
            this.f15839y.run();
        }
        this.f15824j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f15825k + i2;
        this.f15825k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C11843yn1 c11843yn1;
        C10818ql1 c10818ql1;
        this.f15813A.f45508b = i;
        this.f15825k = getActionBarHideOffset();
        m9839h();
        InterfaceC4028f2 interfaceC4028f2 = this.f15835u;
        if (interfaceC4028f2 == null || (c10818ql1 = (c11843yn1 = (C11843yn1) interfaceC4028f2).f46479s) == null) {
            return;
        }
        c10818ql1.m24057a();
        c11843yn1.f46479s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f15818d.getVisibility() != 0) {
            return false;
        }
        return this.f15823i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f15823i || this.f15824j) {
            return;
        }
        if (this.f15825k <= this.f15818d.getHeight()) {
            m9839h();
            postDelayed(this.f15839y, 600L);
        } else {
            m9839h();
            postDelayed(this.f15840z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m9842k();
        int i2 = this.f15826l ^ i;
        this.f15826l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC4028f2 interfaceC4028f2 = this.f15835u;
        if (interfaceC4028f2 != null) {
            C11843yn1 c11843yn1 = (C11843yn1) interfaceC4028f2;
            c11843yn1.f46475o = !z2;
            if (z || !z2) {
                if (c11843yn1.f46476p) {
                    c11843yn1.f46476p = false;
                    c11843yn1.m26254x(true);
                }
            } else if (!c11843yn1.f46476p) {
                c11843yn1.f46476p = true;
                c11843yn1.m26254x(true);
            }
        }
        if ((i2 & 256) == 0 || this.f15835u == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9280ek1.m18029c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f15816b = i;
        InterfaceC4028f2 interfaceC4028f2 = this.f15835u;
        if (interfaceC4028f2 != null) {
            ((C11843yn1) interfaceC4028f2).f46474n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m9839h();
        this.f15818d.setTranslationY(-Math.max(0, Math.min(i, this.f15818d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC4028f2 interfaceC4028f2) {
        this.f15835u = interfaceC4028f2;
        if (getWindowToken() != null) {
            ((C11843yn1) this.f15835u).f46474n = this.f15816b;
            int i = this.f15826l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC9280ek1.m18029c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f15822h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f15823i) {
            this.f15823i = z;
            if (z) {
                return;
            }
            m9839h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m9842k();
        C9518gb1 c9518gb1 = (C9518gb1) this.f15819e;
        c9518gb1.f27865d = i != 0 ? AbstractC11918zN1.m26394b(c9518gb1.f27862a.getContext(), i) : null;
        c9518gb1.m18587c();
    }

    public void setLogo(int i) {
        m9842k();
        C9518gb1 c9518gb1 = (C9518gb1) this.f15819e;
        c9518gb1.f27866e = i != 0 ? AbstractC11918zN1.m26394b(c9518gb1.f27862a.getContext(), i) : null;
        c9518gb1.m18587c();
    }

    public void setOverlayMode(boolean z) {
        this.f15821g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000.InterfaceC3915dE
    public void setWindowCallback(Window.Callback callback) {
        m9842k();
        ((C9518gb1) this.f15819e).f27872k = callback;
    }

    @Override // p000.InterfaceC3915dE
    public void setWindowTitle(CharSequence charSequence) {
        m9842k();
        C9518gb1 c9518gb1 = (C9518gb1) this.f15819e;
        if (c9518gb1.f27868g) {
            return;
        }
        c9518gb1.f27869h = charSequence;
        if ((c9518gb1.f27863b & 8) != 0) {
            Toolbar toolbar = c9518gb1.f27862a;
            toolbar.setTitle(charSequence);
            if (c9518gb1.f27868g) {
                AbstractC10944rk1.m24483o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4091g2(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m9842k();
        C9518gb1 c9518gb1 = (C9518gb1) this.f15819e;
        c9518gb1.f27865d = drawable;
        c9518gb1.m18587c();
    }
}
