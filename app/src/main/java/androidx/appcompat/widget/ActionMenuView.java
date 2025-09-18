package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p000.AbstractC7337Al1;
import p000.AbstractC8474Wi0;
import p000.C0926Oi;
import p000.C6338l2;
import p000.C6464n2;
import p000.C6527o2;
import p000.C6655q2;
import p000.C7391Bm1;
import p000.C7616Fv0;
import p000.C7866Kq0;
import p000.C8422Vi0;
import p000.InterfaceC6592p2;
import p000.InterfaceC6718r2;
import p000.InterfaceC7346Aq0;
import p000.InterfaceC7398Bq0;
import p000.InterfaceC8490Wq0;
import p000.InterfaceC8776ar0;
import p000.MenuC7450Cq0;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC8474Wi0 implements InterfaceC7398Bq0, InterfaceC8776ar0 {

    /* renamed from: A */
    public InterfaceC6718r2 f15841A;

    /* renamed from: p */
    public MenuC7450Cq0 f15842p;

    /* renamed from: q */
    public Context f15843q;

    /* renamed from: r */
    public int f15844r;

    /* renamed from: s */
    public boolean f15845s;

    /* renamed from: t */
    public C6527o2 f15846t;

    /* renamed from: u */
    public C0926Oi f15847u;

    /* renamed from: v */
    public InterfaceC7346Aq0 f15848v;

    /* renamed from: w */
    public boolean f15849w;

    /* renamed from: x */
    public int f15850x;

    /* renamed from: y */
    public final int f15851y;

    /* renamed from: z */
    public final int f15852z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f15851y = (int) (56.0f * f);
        this.f15852z = (int) (f * 4.0f);
        this.f15843q = context;
        this.f15844r = 0;
    }

    /* renamed from: l */
    public static C6655q2 m9844l() {
        C6655q2 c6655q2 = new C6655q2(-2, -2);
        c6655q2.f40501a = false;
        ((LinearLayout.LayoutParams) c6655q2).gravity = 16;
        return c6655q2;
    }

    /* renamed from: m */
    public static C6655q2 m9845m(ViewGroup.LayoutParams layoutParams) {
        C6655q2 c6655q2;
        if (layoutParams == null) {
            return m9844l();
        }
        if (layoutParams instanceof C6655q2) {
            C6655q2 c6655q22 = (C6655q2) layoutParams;
            c6655q2 = new C6655q2(c6655q22);
            c6655q2.f40501a = c6655q22.f40501a;
        } else {
            c6655q2 = new C6655q2(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c6655q2).gravity <= 0) {
            ((LinearLayout.LayoutParams) c6655q2).gravity = 16;
        }
        return c6655q2;
    }

    @Override // p000.InterfaceC7398Bq0
    /* renamed from: a */
    public final boolean mo892a(C7866Kq0 c7866Kq0) {
        return this.f15842p.m1418q(c7866Kq0, null, 0);
    }

    @Override // p000.InterfaceC8776ar0
    /* renamed from: b */
    public final void mo9828b(MenuC7450Cq0 menuC7450Cq0) {
        this.f15842p = menuC7450Cq0;
    }

    @Override // p000.AbstractC8474Wi0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6655q2;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.AbstractC8474Wi0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m9844l();
    }

    @Override // p000.AbstractC8474Wi0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m9845m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f15842p == null) {
            Context context = getContext();
            MenuC7450Cq0 menuC7450Cq0 = new MenuC7450Cq0(context);
            this.f15842p = menuC7450Cq0;
            menuC7450Cq0.f1706e = new C7391Bm1(2, this);
            C6527o2 c6527o2 = new C6527o2(context);
            this.f15846t = c6527o2;
            c6527o2.f38701l = true;
            c6527o2.f38702m = true;
            InterfaceC8490Wq0 c7616Fv0 = this.f15847u;
            if (c7616Fv0 == null) {
                c7616Fv0 = new C7616Fv0(7);
            }
            c6527o2.f38694e = c7616Fv0;
            this.f15842p.m1403b(c6527o2, this.f15843q);
            C6527o2 c6527o22 = this.f15846t;
            c6527o22.f38697h = this;
            this.f15842p = c6527o22.f38692c;
        }
        return this.f15842p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C6527o2 c6527o2 = this.f15846t;
        C6464n2 c6464n2 = c6527o2.f38698i;
        if (c6464n2 != null) {
            return c6464n2.getDrawable();
        }
        if (c6527o2.f38700k) {
            return c6527o2.f38699j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f15844r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p000.AbstractC8474Wi0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C8422Vi0 generateDefaultLayoutParams() {
        return m9844l();
    }

    @Override // p000.AbstractC8474Wi0
    /* renamed from: i */
    public final C8422Vi0 generateLayoutParams(AttributeSet attributeSet) {
        return new C6655q2(getContext(), attributeSet);
    }

    @Override // p000.AbstractC8474Wi0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C8422Vi0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m9845m(layoutParams);
    }

    /* renamed from: n */
    public final boolean m9846n(int i) {
        boolean zMo9824a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC6592p2)) {
            zMo9824a = ((InterfaceC6592p2) childAt).mo9824a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC6592p2)) ? zMo9824a : zMo9824a | ((InterfaceC6592p2) childAt2).mo9825b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6527o2 c6527o2 = this.f15846t;
        if (c6527o2 != null) {
            c6527o2.mo307i();
            if (this.f15846t.m23312j()) {
                this.f15846t.m23311b();
                this.f15846t.m23313l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6527o2 c6527o2 = this.f15846t;
        if (c6527o2 != null) {
            c6527o2.m23311b();
            C6338l2 c6338l2 = c6527o2.f38709t;
            if (c6338l2 == null || !c6338l2.m7121b()) {
                return;
            }
            c6338l2.f10453i.dismiss();
        }
    }

    @Override // p000.AbstractC8474Wi0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f15849w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = AbstractC7337Al1.f354a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C6655q2 c6655q2 = (C6655q2) childAt.getLayoutParams();
                if (c6655q2.f40501a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m9846n(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c6655q2).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c6655q2).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c6655q2).leftMargin) + ((LinearLayout.LayoutParams) c6655q2).rightMargin;
                    m9846n(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C6655q2 c6655q22 = (C6655q2) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c6655q22.f40501a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c6655q22).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c6655q22).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C6655q2 c6655q23 = (C6655q2) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c6655q23.f40501a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c6655q23).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c6655q23).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p000.AbstractC8474Wi0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC7450Cq0 menuC7450Cq0;
        boolean z3 = this.f15849w;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f15849w = z4;
        if (z3 != z4) {
            this.f15850x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f15849w && (menuC7450Cq0 = this.f15842p) != null && size != this.f15850x) {
            this.f15850x = size;
            menuC7450Cq0.m1417p(true);
        }
        int childCount = getChildCount();
        if (!this.f15849w || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C6655q2 c6655q2 = (C6655q2) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c6655q2).rightMargin = 0;
                ((LinearLayout.LayoutParams) c6655q2).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f15851y;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i17 = 0;
        int iMax2 = 0;
        int i18 = 0;
        boolean z5 = false;
        int i19 = 0;
        long j = 0;
        while (true) {
            i3 = this.f15852z;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i22 = i17 + 1;
                if (z6) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C6655q2 c6655q22 = (C6655q2) childAt.getLayoutParams();
                c6655q22.f40506f = false;
                c6655q22.f40503c = 0;
                c6655q22.f40502b = 0;
                c6655q22.f40504d = false;
                ((LinearLayout.LayoutParams) c6655q22).leftMargin = 0;
                ((LinearLayout.LayoutParams) c6655q22).rightMargin = 0;
                c6655q22.f40505e = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c6655q22.f40501a ? 1 : i14;
                C6655q2 c6655q23 = (C6655q2) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i23 <= 0 || (z7 && i23 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i16, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z7 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c6655q23.f40504d = !c6655q23.f40501a && z7;
                c6655q23.f40502b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i10);
                if (c6655q22.f40504d) {
                    i19++;
                }
                if (c6655q22.f40501a) {
                    z5 = true;
                }
                i14 -= i10;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j |= 1 << i18;
                }
                i17 = i22;
            }
            i18++;
            size3 = i20;
            i12 = i21;
            paddingBottom = i9;
            mode = i8;
        }
        int i24 = mode;
        int i25 = i12;
        int i26 = size3;
        boolean z8 = z5 && i17 == 2;
        boolean z9 = false;
        while (i19 > 0 && i14 > 0) {
            int i27 = Integer.MAX_VALUE;
            int i28 = 0;
            int i29 = 0;
            long j2 = 0;
            while (i29 < childCount2) {
                C6655q2 c6655q24 = (C6655q2) getChildAt(i29).getLayoutParams();
                boolean z10 = z9;
                if (c6655q24.f40504d) {
                    int i30 = c6655q24.f40502b;
                    if (i30 < i27) {
                        j2 = 1 << i29;
                        i27 = i30;
                        i28 = 1;
                    } else if (i30 == i27) {
                        j2 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z9 = z10;
            }
            z = z9;
            j |= j2;
            if (i28 > i14) {
                break;
            }
            int i31 = i27 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                C6655q2 c6655q25 = (C6655q2) childAt2.getLayoutParams();
                int i33 = iMax;
                int i34 = childMeasureSpec;
                int i35 = childCount2;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z8 && c6655q25.f40505e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c6655q25.f40502b += r4;
                    c6655q25.f40506f = r4;
                    i14--;
                } else if (c6655q25.f40502b == i31) {
                    j |= j3;
                }
                i32++;
                childMeasureSpec = i34;
                iMax = i33;
                childCount2 = i35;
            }
            z9 = true;
        }
        z = z9;
        int i36 = iMax;
        int i37 = childMeasureSpec;
        int i38 = childCount2;
        boolean z11 = !z5 && i17 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i17 - 1 && !z11 && iMax2 <= 1)) {
            i4 = i38;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((C6655q2) getChildAt(0).getLayoutParams()).f40505e) {
                    fBitCount -= 0.5f;
                }
                int i39 = i38 - 1;
                if ((j & (1 << i39)) != 0 && !((C6655q2) getChildAt(i39).getLayoutParams()).f40505e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i14 * i16) / fBitCount) : 0;
            boolean z12 = z;
            i4 = i38;
            for (int i41 = 0; i41 < i4; i41++) {
                if ((j & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    C6655q2 c6655q26 = (C6655q2) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c6655q26.f40503c = i40;
                        c6655q26.f40506f = true;
                        if (i41 == 0 && !c6655q26.f40505e) {
                            ((LinearLayout.LayoutParams) c6655q26).leftMargin = (-i40) / 2;
                        }
                        z12 = true;
                    } else {
                        if (c6655q26.f40501a) {
                            c6655q26.f40503c = i40;
                            c6655q26.f40506f = true;
                            ((LinearLayout.LayoutParams) c6655q26).rightMargin = (-i40) / 2;
                            z12 = true;
                        } else {
                            if (i41 != 0) {
                                ((LinearLayout.LayoutParams) c6655q26).leftMargin = i40 / 2;
                            }
                            if (i41 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c6655q26).rightMargin = i40 / 2;
                            }
                        }
                    }
                }
            }
            z2 = z12;
        }
        if (z2) {
            int i42 = 0;
            while (i42 < i4) {
                View childAt4 = getChildAt(i42);
                C6655q2 c6655q27 = (C6655q2) childAt4.getLayoutParams();
                if (c6655q27.f40506f) {
                    i7 = i37;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c6655q27.f40502b * i16) + c6655q27.f40503c, 1073741824), i7);
                } else {
                    i7 = i37;
                }
                i42++;
                i37 = i7;
            }
        }
        if (i24 != 1073741824) {
            i6 = i25;
            i5 = i36;
        } else {
            i5 = i26;
            i6 = i25;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f15846t.f38706q = z;
    }

    public void setOnMenuItemClickListener(InterfaceC6718r2 interfaceC6718r2) {
        this.f15841A = interfaceC6718r2;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C6527o2 c6527o2 = this.f15846t;
        C6464n2 c6464n2 = c6527o2.f38698i;
        if (c6464n2 != null) {
            c6464n2.setImageDrawable(drawable);
        } else {
            c6527o2.f38700k = true;
            c6527o2.f38699j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f15845s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f15844r != i) {
            this.f15844r = i;
            if (i == 0) {
                this.f15843q = getContext();
            } else {
                this.f15843q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C6527o2 c6527o2) {
        this.f15846t = c6527o2;
        c6527o2.f38697h = this;
        this.f15842p = c6527o2.f38692c;
    }

    @Override // p000.AbstractC8474Wi0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6655q2(getContext(), attributeSet);
    }
}
