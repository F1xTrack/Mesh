package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC10944rk1;
import p000.AbstractC11918zN1;
import p000.AbstractC7337Al1;
import p000.AbstractC8615Za1;
import p000.AbstractC8704aH0;
import p000.C0825N6;
import p000.C0888O6;
import p000.C0926Oi;
import p000.C10226m71;
import p000.C10525oT0;
import p000.C11287uQ0;
import p000.C11757y61;
import p000.C1854cY;
import p000.C6527o2;
import p000.C6803s7;
import p000.C7710Hq0;
import p000.C7866Kq0;
import p000.C8539Xo1;
import p000.C8745ab1;
import p000.C8873bb1;
import p000.C9134db1;
import p000.C9518gb1;
import p000.InterfaceC3977eE;
import p000.InterfaceC7554Eq0;
import p000.InterfaceC8594Yq0;
import p000.InterfaceC9001cb1;
import p000.KY1;
import p000.MenuC7450Cq0;
import p000.RT0;
import p000.RunnableC10431nk0;
import p000.RunnableC8563Ya1;
import p000.ViewOnClickListenerC1822c2;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC7554Eq0 {

    /* renamed from: A */
    public ColorStateList f15869A;

    /* renamed from: B */
    public boolean f15870B;

    /* renamed from: C */
    public boolean f15871C;

    /* renamed from: D */
    public final ArrayList f15872D;

    /* renamed from: E */
    public final ArrayList f15873E;

    /* renamed from: F */
    public final int[] f15874F;

    /* renamed from: G */
    public final C7710Hq0 f15875G;

    /* renamed from: H */
    public ArrayList f15876H;

    /* renamed from: I */
    public InterfaceC9001cb1 f15877I;

    /* renamed from: J */
    public final C10226m71 f15878J;

    /* renamed from: K */
    public C9518gb1 f15879K;

    /* renamed from: L */
    public C6527o2 f15880L;

    /* renamed from: M */
    public C8745ab1 f15881M;

    /* renamed from: N */
    public C0926Oi f15882N;

    /* renamed from: O */
    public C10525oT0 f15883O;

    /* renamed from: P */
    public boolean f15884P;

    /* renamed from: Q */
    public OnBackInvokedCallback f15885Q;

    /* renamed from: R */
    public OnBackInvokedDispatcher f15886R;

    /* renamed from: S */
    public boolean f15887S;

    /* renamed from: T */
    public final RunnableC10431nk0 f15888T;

    /* renamed from: a */
    public ActionMenuView f15889a;

    /* renamed from: b */
    public C6803s7 f15890b;

    /* renamed from: c */
    public C6803s7 f15891c;

    /* renamed from: d */
    public C0825N6 f15892d;

    /* renamed from: e */
    public C0888O6 f15893e;

    /* renamed from: f */
    public final Drawable f15894f;

    /* renamed from: g */
    public final CharSequence f15895g;

    /* renamed from: h */
    public C0825N6 f15896h;

    /* renamed from: i */
    public View f15897i;

    /* renamed from: j */
    public Context f15898j;

    /* renamed from: k */
    public int f15899k;

    /* renamed from: l */
    public int f15900l;

    /* renamed from: m */
    public int f15901m;

    /* renamed from: n */
    public final int f15902n;

    /* renamed from: o */
    public final int f15903o;

    /* renamed from: p */
    public int f15904p;

    /* renamed from: q */
    public int f15905q;

    /* renamed from: r */
    public int f15906r;

    /* renamed from: s */
    public int f15907s;

    /* renamed from: t */
    public RT0 f15908t;

    /* renamed from: u */
    public int f15909u;

    /* renamed from: v */
    public int f15910v;

    /* renamed from: w */
    public final int f15911w;

    /* renamed from: x */
    public CharSequence f15912x;

    /* renamed from: y */
    public CharSequence f15913y;

    /* renamed from: z */
    public ColorStateList f15914z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C11757y61(getContext());
    }

    /* renamed from: h */
    public static C8873bb1 m9849h() {
        return new C8873bb1(-2);
    }

    /* renamed from: i */
    public static C8873bb1 m9850i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C8873bb1;
        if (z) {
            C8873bb1 c8873bb1 = (C8873bb1) layoutParams;
            C8873bb1 c8873bb12 = new C8873bb1(c8873bb1);
            c8873bb12.f17081b = 0;
            c8873bb12.f17081b = c8873bb1.f17081b;
            return c8873bb12;
        }
        if (z) {
            C8873bb1 c8873bb13 = new C8873bb1((C8873bb1) layoutParams);
            c8873bb13.f17081b = 0;
            return c8873bb13;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C8873bb1 c8873bb14 = new C8873bb1(layoutParams);
            c8873bb14.f17081b = 0;
            return c8873bb14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C8873bb1 c8873bb15 = new C8873bb1(marginLayoutParams);
        c8873bb15.f17081b = 0;
        ((ViewGroup.MarginLayoutParams) c8873bb15).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c8873bb15).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c8873bb15).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c8873bb15).bottomMargin = marginLayoutParams.bottomMargin;
        return c8873bb15;
    }

    /* renamed from: k */
    public static int m9851k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: l */
    public static int m9852l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m9853a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C8873bb1 c8873bb1 = (C8873bb1) childAt.getLayoutParams();
                if (c8873bb1.f17081b == 0 && m9869u(childAt)) {
                    int i3 = c8873bb1.f17080a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C8873bb1 c8873bb12 = (C8873bb1) childAt2.getLayoutParams();
            if (c8873bb12.f17081b == 0 && m9869u(childAt2)) {
                int i5 = c8873bb12.f17080a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // p000.InterfaceC7554Eq0
    public final void addMenuProvider(InterfaceC8594Yq0 interfaceC8594Yq0) {
        C7710Hq0 c7710Hq0 = this.f15875G;
        c7710Hq0.f4549b.add(interfaceC8594Yq0);
        c7710Hq0.f4548a.run();
    }

    /* renamed from: b */
    public final void m9854b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C8873bb1 c8873bb1M9849h = layoutParams == null ? m9849h() : !checkLayoutParams(layoutParams) ? m9850i(layoutParams) : (C8873bb1) layoutParams;
        c8873bb1M9849h.f17081b = 1;
        if (!z || this.f15897i == null) {
            addView(view, c8873bb1M9849h);
        } else {
            view.setLayoutParams(c8873bb1M9849h);
            this.f15873E.add(view);
        }
    }

    /* renamed from: c */
    public final void m9855c() {
        if (this.f15896h == null) {
            C0825N6 c0825n6 = new C0825N6(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f15896h = c0825n6;
            c0825n6.setImageDrawable(this.f15894f);
            this.f15896h.setContentDescription(this.f15895g);
            C8873bb1 c8873bb1M9849h = m9849h();
            c8873bb1M9849h.f17080a = (this.f15902n & 112) | 8388611;
            c8873bb1M9849h.f17081b = 2;
            this.f15896h.setLayoutParams(c8873bb1M9849h);
            this.f15896h.setOnClickListener(new ViewOnClickListenerC1822c2(6, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C8873bb1);
    }

    /* renamed from: d */
    public final void m9856d() {
        if (this.f15908t == null) {
            RT0 rt0 = new RT0();
            rt0.f10189a = 0;
            rt0.f10190b = 0;
            rt0.f10191c = Integer.MIN_VALUE;
            rt0.f10192d = Integer.MIN_VALUE;
            rt0.f10193e = 0;
            rt0.f10194f = 0;
            rt0.f10195g = false;
            rt0.f10196h = false;
            this.f15908t = rt0;
        }
    }

    /* renamed from: e */
    public final void m9857e() {
        m9858f();
        ActionMenuView actionMenuView = this.f15889a;
        if (actionMenuView.f15842p == null) {
            MenuC7450Cq0 menuC7450Cq0 = (MenuC7450Cq0) actionMenuView.getMenu();
            if (this.f15881M == null) {
                this.f15881M = new C8745ab1(this);
            }
            this.f15889a.setExpandedActionViewsExclusive(true);
            menuC7450Cq0.m1403b(this.f15881M, this.f15898j);
            m9871w();
        }
    }

    /* renamed from: f */
    public final void m9858f() {
        if (this.f15889a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f15889a = actionMenuView;
            actionMenuView.setPopupTheme(this.f15899k);
            this.f15889a.setOnMenuItemClickListener(this.f15878J);
            ActionMenuView actionMenuView2 = this.f15889a;
            C0926Oi c0926Oi = this.f15882N;
            C11287uQ0 c11287uQ0 = new C11287uQ0(this);
            actionMenuView2.f15847u = c0926Oi;
            actionMenuView2.f15848v = c11287uQ0;
            C8873bb1 c8873bb1M9849h = m9849h();
            c8873bb1M9849h.f17080a = (this.f15902n & 112) | 8388613;
            this.f15889a.setLayoutParams(c8873bb1M9849h);
            m9854b(this.f15889a, false);
        }
    }

    /* renamed from: g */
    public final void m9859g() {
        if (this.f15892d == null) {
            this.f15892d = new C0825N6(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C8873bb1 c8873bb1M9849h = m9849h();
            c8873bb1M9849h.f17080a = (this.f15902n & 112) | 8388611;
            this.f15892d.setLayoutParams(c8873bb1M9849h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m9849h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m9850i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0825N6 c0825n6 = this.f15896h;
        if (c0825n6 != null) {
            return c0825n6.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0825N6 c0825n6 = this.f15896h;
        if (c0825n6 != null) {
            return c0825n6.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RT0 rt0 = this.f15908t;
        if (rt0 != null) {
            return rt0.f10195g ? rt0.f10189a : rt0.f10190b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f15910v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RT0 rt0 = this.f15908t;
        if (rt0 != null) {
            return rt0.f10189a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        RT0 rt0 = this.f15908t;
        if (rt0 != null) {
            return rt0.f10190b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        RT0 rt0 = this.f15908t;
        if (rt0 != null) {
            return rt0.f10195g ? rt0.f10190b : rt0.f10189a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f15909u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC7450Cq0 menuC7450Cq0;
        ActionMenuView actionMenuView = this.f15889a;
        return (actionMenuView == null || (menuC7450Cq0 = actionMenuView.f15842p) == null || !menuC7450Cq0.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f15910v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f15909u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0888O6 c0888o6 = this.f15893e;
        if (c0888o6 != null) {
            return c0888o6.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0888O6 c0888o6 = this.f15893e;
        if (c0888o6 != null) {
            return c0888o6.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m9857e();
        return this.f15889a.getMenu();
    }

    public View getNavButtonView() {
        return this.f15892d;
    }

    public CharSequence getNavigationContentDescription() {
        C0825N6 c0825n6 = this.f15892d;
        if (c0825n6 != null) {
            return c0825n6.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0825N6 c0825n6 = this.f15892d;
        if (c0825n6 != null) {
            return c0825n6.getDrawable();
        }
        return null;
    }

    public C6527o2 getOuterActionMenuPresenter() {
        return this.f15880L;
    }

    public Drawable getOverflowIcon() {
        m9857e();
        return this.f15889a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f15898j;
    }

    public int getPopupTheme() {
        return this.f15899k;
    }

    public CharSequence getSubtitle() {
        return this.f15913y;
    }

    public final TextView getSubtitleTextView() {
        return this.f15891c;
    }

    public CharSequence getTitle() {
        return this.f15912x;
    }

    public int getTitleMarginBottom() {
        return this.f15907s;
    }

    public int getTitleMarginEnd() {
        return this.f15905q;
    }

    public int getTitleMarginStart() {
        return this.f15904p;
    }

    public int getTitleMarginTop() {
        return this.f15906r;
    }

    public final TextView getTitleTextView() {
        return this.f15890b;
    }

    public InterfaceC3977eE getWrapper() {
        if (this.f15879K == null) {
            this.f15879K = new C9518gb1(this, true);
        }
        return this.f15879K;
    }

    /* renamed from: j */
    public final int m9860j(int i, View view) {
        C8873bb1 c8873bb1 = (C8873bb1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c8873bb1.f17080a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f15911w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c8873bb1).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c8873bb1).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c8873bb1).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: m */
    public void mo9861m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: n */
    public final void m9862n() {
        Iterator it = this.f15876H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.f15875G.f4549b.iterator();
        while (it2.hasNext()) {
            ((C1854cY) ((InterfaceC8594Yq0) it2.next())).f17597a.m10074j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f15876H = currentMenuItems2;
    }

    /* renamed from: o */
    public final boolean m9863o(View view) {
        return view.getParent() == this || this.f15873E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9871w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f15888T);
        m9871w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f15871C = false;
        }
        if (!this.f15871C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f15871C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f15871C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0298 A[LOOP:0: B:233:0x0296->B:234:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02b5 A[LOOP:1: B:236:0x02b3->B:237:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02d3 A[LOOP:2: B:239:0x02d1->B:240:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0321 A[LOOP:3: B:248:0x031f->B:249:0x0321, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iM9851k;
        int iMax;
        int iCombineMeasuredStates;
        int iM9851k2;
        int iM9852l;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = AbstractC7337Al1.f354a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (m9869u(this.f15892d)) {
            m9868t(this.f15892d, i, 0, i2, this.f15903o);
            iM9851k = m9851k(this.f15892d) + this.f15892d.getMeasuredWidth();
            iMax = Math.max(0, m9852l(this.f15892d) + this.f15892d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f15892d.getMeasuredState());
        } else {
            iM9851k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m9869u(this.f15896h)) {
            m9868t(this.f15896h, i, 0, i2, this.f15903o);
            iM9851k = m9851k(this.f15896h) + this.f15896h.getMeasuredWidth();
            iMax = Math.max(iMax, m9852l(this.f15896h) + this.f15896h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15896h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM9851k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM9851k);
        int[] iArr = this.f15874F;
        iArr[c2] = iMax4;
        if (m9869u(this.f15889a)) {
            m9868t(this.f15889a, i, iMax3, i2, this.f15903o);
            iM9851k2 = m9851k(this.f15889a) + this.f15889a.getMeasuredWidth();
            iMax = Math.max(iMax, m9852l(this.f15889a) + this.f15889a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15889a.getMeasuredState());
        } else {
            iM9851k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM9851k2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM9851k2);
        if (m9869u(this.f15897i)) {
            iMax5 += m9867s(this.f15897i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m9852l(this.f15897i) + this.f15897i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15897i.getMeasuredState());
        }
        if (m9869u(this.f15893e)) {
            iMax5 += m9867s(this.f15893e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m9852l(this.f15893e) + this.f15893e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15893e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C8873bb1) childAt.getLayoutParams()).f17081b == 0 && m9869u(childAt)) {
                iMax5 += m9867s(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, m9852l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f15906r + this.f15907s;
        int i6 = this.f15904p + this.f15905q;
        if (m9869u(this.f15890b)) {
            m9867s(this.f15890b, i, iMax5 + i6, i2, i5, iArr);
            int iM9851k3 = m9851k(this.f15890b) + this.f15890b.getMeasuredWidth();
            iM9852l = m9852l(this.f15890b) + this.f15890b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f15890b.getMeasuredState());
            iMax2 = iM9851k3;
        } else {
            iM9852l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m9869u(this.f15891c)) {
            iMax2 = Math.max(iMax2, m9867s(this.f15891c, i, iMax5 + i6, i2, iM9852l + i5, iArr));
            iM9852l = m9852l(this.f15891c) + this.f15891c.getMeasuredHeight() + iM9852l;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f15891c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM9852l);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f15884P) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (m9869u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C9134db1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9134db1 c9134db1 = (C9134db1) parcelable;
        super.onRestoreInstanceState(c9134db1.f44064a);
        ActionMenuView actionMenuView = this.f15889a;
        MenuC7450Cq0 menuC7450Cq0 = actionMenuView != null ? actionMenuView.f15842p : null;
        int i = c9134db1.f26146c;
        if (i != 0 && this.f15881M != null && menuC7450Cq0 != null && (menuItemFindItem = menuC7450Cq0.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c9134db1.f26147d) {
            RunnableC10431nk0 runnableC10431nk0 = this.f15888T;
            removeCallbacks(runnableC10431nk0);
            post(runnableC10431nk0);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m9856d();
        RT0 rt0 = this.f15908t;
        boolean z = i == 1;
        if (z == rt0.f10195g) {
            return;
        }
        rt0.f10195g = z;
        if (!rt0.f10196h) {
            rt0.f10189a = rt0.f10193e;
            rt0.f10190b = rt0.f10194f;
            return;
        }
        if (z) {
            int i2 = rt0.f10192d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = rt0.f10193e;
            }
            rt0.f10189a = i2;
            int i3 = rt0.f10191c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = rt0.f10194f;
            }
            rt0.f10190b = i3;
            return;
        }
        int i4 = rt0.f10191c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = rt0.f10193e;
        }
        rt0.f10189a = i4;
        int i5 = rt0.f10192d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = rt0.f10194f;
        }
        rt0.f10190b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C7866Kq0 c7866Kq0;
        C9134db1 c9134db1 = new C9134db1(super.onSaveInstanceState());
        C8745ab1 c8745ab1 = this.f15881M;
        if (c8745ab1 != null && (c7866Kq0 = c8745ab1.f15580b) != null) {
            c9134db1.f26146c = c7866Kq0.f6332a;
        }
        c9134db1.f26147d = m9864p();
        return c9134db1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15870B = false;
        }
        if (!this.f15870B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f15870B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15870B = false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m9864p() {
        C6527o2 c6527o2;
        ActionMenuView actionMenuView = this.f15889a;
        return (actionMenuView == null || (c6527o2 = actionMenuView.f15846t) == null || !c6527o2.m23312j()) ? false : true;
    }

    /* renamed from: q */
    public final int m9865q(View view, int i, int i2, int[] iArr) {
        C8873bb1 c8873bb1 = (C8873bb1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c8873bb1).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM9860j = m9860j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM9860j, iMax + measuredWidth, view.getMeasuredHeight() + iM9860j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c8873bb1).rightMargin + iMax;
    }

    /* renamed from: r */
    public final int m9866r(View view, int i, int i2, int[] iArr) {
        C8873bb1 c8873bb1 = (C8873bb1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c8873bb1).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM9860j = m9860j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM9860j, iMax, view.getMeasuredHeight() + iM9860j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c8873bb1).leftMargin);
    }

    @Override // p000.InterfaceC7554Eq0
    public final void removeMenuProvider(InterfaceC8594Yq0 interfaceC8594Yq0) {
        this.f15875G.m3608b(interfaceC8594Yq0);
    }

    /* renamed from: s */
    public final int m9867s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f15887S != z) {
            this.f15887S = z;
            m9871w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f15884P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f15910v) {
            this.f15910v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f15909u) {
            this.f15909u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m9859g();
        this.f15892d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC9001cb1 interfaceC9001cb1) {
        this.f15877I = interfaceC9001cb1;
    }

    public void setOverflowIcon(Drawable drawable) {
        m9857e();
        this.f15889a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f15899k != i) {
            this.f15899k = i;
            if (i == 0) {
                this.f15898j = getContext();
            } else {
                this.f15898j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f15907s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f15905q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f15904p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f15906r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final void m9868t(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: u */
    public final boolean m9869u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: v */
    public final boolean m9870v() {
        C6527o2 c6527o2;
        ActionMenuView actionMenuView = this.f15889a;
        return (actionMenuView == null || (c6527o2 = actionMenuView.f15846t) == null || !c6527o2.m23313l()) ? false : true;
    }

    /* renamed from: w */
    public final void m9871w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM9549a = AbstractC8615Za1.m9549a(this);
            C8745ab1 c8745ab1 = this.f15881M;
            boolean z = (c8745ab1 == null || c8745ab1.f15580b == null || onBackInvokedDispatcherM9549a == null || !isAttachedToWindow() || !this.f15887S) ? false : true;
            if (z && this.f15886R == null) {
                if (this.f15885Q == null) {
                    this.f15885Q = AbstractC8615Za1.m9550b(new RunnableC8563Ya1(this, 0));
                }
                AbstractC8615Za1.m9551c(onBackInvokedDispatcherM9549a, this.f15885Q);
                this.f15886R = onBackInvokedDispatcherM9549a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f15886R) == null) {
                return;
            }
            AbstractC8615Za1.m9552d(onBackInvokedDispatcher, this.f15885Q);
            this.f15886R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f15911w = 8388627;
        this.f15872D = new ArrayList();
        this.f15873E = new ArrayList();
        this.f15874F = new int[2];
        this.f15875G = new C7710Hq0(new RunnableC8563Ya1(this, 1));
        this.f15876H = new ArrayList();
        this.f15878J = new C10226m71(1, this);
        this.f15888T = new RunnableC10431nk0(10, this);
        Context context2 = getContext();
        int[] iArr = AbstractC8704aH0.f15447y;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC10944rk1.m24481m(this, context, iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        this.f15900l = typedArray.getResourceId(28, 0);
        this.f15901m = typedArray.getResourceId(19, 0);
        this.f15911w = typedArray.getInteger(0, 8388627);
        this.f15902n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f15907s = dimensionPixelOffset;
        this.f15906r = dimensionPixelOffset;
        this.f15905q = dimensionPixelOffset;
        this.f15904p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f15904p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f15905q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f15906r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f15907s = dimensionPixelOffset5;
        }
        this.f15903o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m9856d();
        RT0 rt0 = this.f15908t;
        rt0.f10196h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            rt0.f10193e = dimensionPixelSize;
            rt0.f10189a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            rt0.f10194f = dimensionPixelSize2;
            rt0.f10190b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            rt0.m7018a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f15909u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f15910v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f15894f = c8539Xo1M9117J.m9121C(4);
        this.f15895g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f15898j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM9121C = c8539Xo1M9117J.m9121C(16);
        if (drawableM9121C != null) {
            setNavigationIcon(drawableM9121C);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM9121C2 = c8539Xo1M9117J.m9121C(11);
        if (drawableM9121C2 != null) {
            setLogo(drawableM9121C2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c8539Xo1M9117J.m9120B(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c8539Xo1M9117J.m9120B(20));
        }
        if (typedArray.hasValue(14)) {
            mo9861m(typedArray.getResourceId(14, 0));
        }
        c8539Xo1M9117J.m9130M();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C8873bb1 c8873bb1 = new C8873bb1(context, attributeSet);
        c8873bb1.f17080a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15424b);
        c8873bb1.f17080a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c8873bb1.f17081b = 0;
        return c8873bb1;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m9855c();
        }
        C0825N6 c0825n6 = this.f15896h;
        if (c0825n6 != null) {
            c0825n6.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m9855c();
            this.f15896h.setImageDrawable(drawable);
        } else {
            C0825N6 c0825n6 = this.f15896h;
            if (c0825n6 != null) {
                c0825n6.setImageDrawable(this.f15894f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f15893e == null) {
                this.f15893e = new C0888O6(getContext());
            }
            if (!m9863o(this.f15893e)) {
                m9854b(this.f15893e, true);
            }
        } else {
            C0888O6 c0888o6 = this.f15893e;
            if (c0888o6 != null && m9863o(c0888o6)) {
                removeView(this.f15893e);
                this.f15873E.remove(this.f15893e);
            }
        }
        C0888O6 c0888o62 = this.f15893e;
        if (c0888o62 != null) {
            c0888o62.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f15893e == null) {
            this.f15893e = new C0888O6(getContext());
        }
        C0888O6 c0888o6 = this.f15893e;
        if (c0888o6 != null) {
            c0888o6.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m9859g();
        }
        C0825N6 c0825n6 = this.f15892d;
        if (c0825n6 != null) {
            c0825n6.setContentDescription(charSequence);
            KY1.m4672b(this.f15892d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m9859g();
            if (!m9863o(this.f15892d)) {
                m9854b(this.f15892d, true);
            }
        } else {
            C0825N6 c0825n6 = this.f15892d;
            if (c0825n6 != null && m9863o(c0825n6)) {
                removeView(this.f15892d);
                this.f15873E.remove(this.f15892d);
            }
        }
        C0825N6 c0825n62 = this.f15892d;
        if (c0825n62 != null) {
            c0825n62.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C6803s7 c6803s7 = this.f15891c;
            if (c6803s7 != null && m9863o(c6803s7)) {
                removeView(this.f15891c);
                this.f15873E.remove(this.f15891c);
            }
        } else {
            if (this.f15891c == null) {
                Context context = getContext();
                C6803s7 c6803s72 = new C6803s7(context, null);
                this.f15891c = c6803s72;
                c6803s72.setSingleLine();
                this.f15891c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f15901m;
                if (i != 0) {
                    this.f15891c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f15869A;
                if (colorStateList != null) {
                    this.f15891c.setTextColor(colorStateList);
                }
            }
            if (!m9863o(this.f15891c)) {
                m9854b(this.f15891c, true);
            }
        }
        C6803s7 c6803s73 = this.f15891c;
        if (c6803s73 != null) {
            c6803s73.setText(charSequence);
        }
        this.f15913y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f15869A = colorStateList;
        C6803s7 c6803s7 = this.f15891c;
        if (c6803s7 != null) {
            c6803s7.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C6803s7 c6803s7 = this.f15890b;
            if (c6803s7 != null && m9863o(c6803s7)) {
                removeView(this.f15890b);
                this.f15873E.remove(this.f15890b);
            }
        } else {
            if (this.f15890b == null) {
                Context context = getContext();
                C6803s7 c6803s72 = new C6803s7(context, null);
                this.f15890b = c6803s72;
                c6803s72.setSingleLine();
                this.f15890b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f15900l;
                if (i != 0) {
                    this.f15890b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f15914z;
                if (colorStateList != null) {
                    this.f15890b.setTextColor(colorStateList);
                }
            }
            if (!m9863o(this.f15890b)) {
                m9854b(this.f15890b, true);
            }
        }
        C6803s7 c6803s73 = this.f15890b;
        if (c6803s73 != null) {
            c6803s73.setText(charSequence);
        }
        this.f15912x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f15914z = colorStateList;
        C6803s7 c6803s7 = this.f15890b;
        if (c6803s7 != null) {
            c6803s7.setTextColor(colorStateList);
        }
    }
}
