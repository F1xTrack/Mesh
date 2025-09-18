package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000.AbstractC10944rk1;
import p000.AbstractC11918zN1;
import p000.AbstractC6798s2;
import p000.AbstractC7337Al1;
import p000.AbstractC8704aH0;
import p000.C10690pl1;
import p000.C6338l2;
import p000.C6527o2;
import p000.C6795s;
import p000.InterfaceC8776ar0;
import p000.MenuC7450Cq0;
import p000.ViewOnClickListenerC1822c2;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a */
    public final C6795s f15790a;

    /* renamed from: b */
    public final Context f15791b;

    /* renamed from: c */
    public ActionMenuView f15792c;

    /* renamed from: d */
    public C6527o2 f15793d;

    /* renamed from: e */
    public int f15794e;

    /* renamed from: f */
    public C10690pl1 f15795f;

    /* renamed from: g */
    public boolean f15796g;

    /* renamed from: h */
    public boolean f15797h;

    /* renamed from: i */
    public CharSequence f15798i;

    /* renamed from: j */
    public CharSequence f15799j;

    /* renamed from: k */
    public View f15800k;

    /* renamed from: l */
    public View f15801l;

    /* renamed from: m */
    public View f15802m;

    /* renamed from: n */
    public LinearLayout f15803n;

    /* renamed from: o */
    public TextView f15804o;

    /* renamed from: p */
    public TextView f15805p;

    /* renamed from: q */
    public final int f15806q;

    /* renamed from: r */
    public final int f15807r;

    /* renamed from: s */
    public boolean f15808s;

    /* renamed from: t */
    public final int f15809t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f15790a = new C6795s(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f15791b = context;
        } else {
            this.f15791b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15426d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC11918zN1.m26394b(context, resourceId));
        this.f15806q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f15807r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f15794e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f15809t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public static int m9831f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: g */
    public static int m9832g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: c */
    public final void m9833c(AbstractC6798s2 abstractC6798s2) {
        View view = this.f15800k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f15809t, (ViewGroup) this, false);
            this.f15800k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f15800k);
        }
        View viewFindViewById = this.f15800k.findViewById(R.id.action_mode_close_button);
        this.f15801l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1822c2(0, abstractC6798s2));
        MenuC7450Cq0 menuC7450Cq0Mo18165e = abstractC6798s2.mo18165e();
        C6527o2 c6527o2 = this.f15793d;
        if (c6527o2 != null) {
            c6527o2.m23311b();
            C6338l2 c6338l2 = c6527o2.f38709t;
            if (c6338l2 != null && c6338l2.m7121b()) {
                c6338l2.f10453i.dismiss();
            }
        }
        C6527o2 c6527o22 = new C6527o2(getContext());
        this.f15793d = c6527o22;
        c6527o22.f38701l = true;
        c6527o22.f38702m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC7450Cq0Mo18165e.m1403b(this.f15793d, this.f15791b);
        C6527o2 c6527o23 = this.f15793d;
        InterfaceC8776ar0 interfaceC8776ar0 = c6527o23.f38697h;
        if (interfaceC8776ar0 == null) {
            InterfaceC8776ar0 interfaceC8776ar02 = (InterfaceC8776ar0) c6527o23.f38693d.inflate(c6527o23.f38695f, (ViewGroup) this, false);
            c6527o23.f38697h = interfaceC8776ar02;
            interfaceC8776ar02.mo9828b(c6527o23.f38692c);
            c6527o23.mo307i();
        }
        InterfaceC8776ar0 interfaceC8776ar03 = c6527o23.f38697h;
        if (interfaceC8776ar0 != interfaceC8776ar03) {
            ((ActionMenuView) interfaceC8776ar03).setPresenter(c6527o23);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC8776ar03;
        this.f15792c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f15792c, layoutParams);
    }

    /* renamed from: d */
    public final void m9834d() {
        if (this.f15803n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f15803n = linearLayout;
            this.f15804o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f15805p = (TextView) this.f15803n.findViewById(R.id.action_bar_subtitle);
            int i = this.f15806q;
            if (i != 0) {
                this.f15804o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f15807r;
            if (i2 != 0) {
                this.f15805p.setTextAppearance(getContext(), i2);
            }
        }
        this.f15804o.setText(this.f15798i);
        this.f15805p.setText(this.f15799j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f15798i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f15799j);
        this.f15805p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f15803n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f15803n.getParent() == null) {
            addView(this.f15803n);
        }
    }

    /* renamed from: e */
    public final void m9835e() {
        removeAllViews();
        this.f15802m = null;
        this.f15792c = null;
        this.f15793d = null;
        View view = this.f15801l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f15795f != null ? this.f15790a.f42187a : getVisibility();
    }

    public int getContentHeight() {
        return this.f15794e;
    }

    public CharSequence getSubtitle() {
        return this.f15799j;
    }

    public CharSequence getTitle() {
        return this.f15798i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C10690pl1 c10690pl1 = this.f15795f;
            if (c10690pl1 != null) {
                c10690pl1.m23871b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: i */
    public final C10690pl1 m9837i(int i, long j) {
        C10690pl1 c10690pl1 = this.f15795f;
        if (c10690pl1 != null) {
            c10690pl1.m23871b();
        }
        C6795s c6795s = this.f15790a;
        if (i != 0) {
            C10690pl1 c10690pl1M24469a = AbstractC10944rk1.m24469a(this);
            c10690pl1M24469a.m23870a(0.0f);
            c10690pl1M24469a.m23872c(j);
            ((ActionBarContextView) c6795s.f42189c).f15795f = c10690pl1M24469a;
            c6795s.f42187a = i;
            c10690pl1M24469a.m23873d(c6795s);
            return c10690pl1M24469a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C10690pl1 c10690pl1M24469a2 = AbstractC10944rk1.m24469a(this);
        c10690pl1M24469a2.m23870a(1.0f);
        c10690pl1M24469a2.m23872c(j);
        ((ActionBarContextView) c6795s.f42189c).f15795f = c10690pl1M24469a2;
        c6795s.f42187a = i;
        c10690pl1M24469a2.m23873d(c6795s);
        return c10690pl1M24469a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC8704aH0.f15423a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C6527o2 c6527o2 = this.f15793d;
        if (c6527o2 != null) {
            Configuration configuration2 = c6527o2.f38691b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c6527o2.f38705p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC7450Cq0 menuC7450Cq0 = c6527o2.f38692c;
            if (menuC7450Cq0 != null) {
                menuC7450Cq0.m1417p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6527o2 c6527o2 = this.f15793d;
        if (c6527o2 != null) {
            c6527o2.m23311b();
            C6338l2 c6338l2 = this.f15793d.f38709t;
            if (c6338l2 == null || !c6338l2.m7121b()) {
                return;
            }
            c6338l2.f10453i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f15797h = false;
        }
        if (!this.f15797h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f15797h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f15797h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = AbstractC7337Al1.f354a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f15800k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15800k.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iM9832g = m9832g(this.f15800k, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iM9832g - i6 : iM9832g + i6;
        }
        LinearLayout linearLayout = this.f15803n;
        if (linearLayout != null && this.f15802m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m9832g(this.f15803n, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.f15802m;
        if (view2 != null) {
            m9832g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f15792c;
        if (actionMenuView != null) {
            m9832g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f15794e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f15800k;
        if (view != null) {
            int iM9831f = m9831f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15800k.getLayoutParams();
            paddingLeft = iM9831f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f15792c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m9831f(this.f15792c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f15803n;
        if (linearLayout != null && this.f15802m == null) {
            if (this.f15808s) {
                this.f15803n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f15803n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f15803n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m9831f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f15802m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f15802m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f15794e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15796g = false;
        }
        if (!this.f15796g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f15796g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15796g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f15794e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f15802m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f15802m = view;
        if (view != null && (linearLayout = this.f15803n) != null) {
            removeView(linearLayout);
            this.f15803n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f15799j = charSequence;
        m9834d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f15798i = charSequence;
        m9834d();
        AbstractC10944rk1.m24483o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f15808s) {
            requestLayout();
        }
        this.f15808s = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
