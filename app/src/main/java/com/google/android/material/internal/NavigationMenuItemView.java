package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11927zS0;
import p000.AbstractC4173hL;
import p000.AbstractC6558oX;
import p000.C10895rM0;
import p000.C7866Kq0;
import p000.C8422Vi0;
import p000.ES0;
import p000.InterfaceC8646Zq0;
import p000.KY1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC6558oX implements InterfaceC8646Zq0 {

    /* renamed from: G */
    public static final int[] f18219G = {R.attr.state_checked};

    /* renamed from: A */
    public FrameLayout f18220A;

    /* renamed from: B */
    public C7866Kq0 f18221B;

    /* renamed from: C */
    public ColorStateList f18222C;

    /* renamed from: D */
    public boolean f18223D;

    /* renamed from: E */
    public Drawable f18224E;

    /* renamed from: F */
    public final C10895rM0 f18225F;

    /* renamed from: v */
    public int f18226v;

    /* renamed from: w */
    public boolean f18227w;

    /* renamed from: x */
    public boolean f18228x;

    /* renamed from: y */
    public final boolean f18229y;

    /* renamed from: z */
    public final CheckedTextView f18230z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18229y = true;
        C10895rM0 c10895rM0 = new C10895rM0(4, this);
        this.f18225F = c10895rM0;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ru.mes.dnevnik.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ru.mes.dnevnik.R.id.design_menu_item_text);
        this.f18230z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC10944rk1.m24482n(checkedTextView, c10895rM0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f18220A == null) {
                this.f18220A = (FrameLayout) ((ViewStub) findViewById(ru.mes.dnevnik.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f18220A.removeAllViews();
            this.f18220A.addView(view);
        }
    }

    @Override // p000.InterfaceC8646Zq0
    /* renamed from: c */
    public final void mo9614c(C7866Kq0 c7866Kq0) {
        StateListDrawable stateListDrawable;
        this.f18221B = c7866Kq0;
        int i = c7866Kq0.f6332a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c7866Kq0.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(ru.mes.dnevnik.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f18219G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            setBackground(stateListDrawable);
        }
        setCheckable(c7866Kq0.isCheckable());
        setChecked(c7866Kq0.isChecked());
        setEnabled(c7866Kq0.isEnabled());
        setTitle(c7866Kq0.f6336e);
        setIcon(c7866Kq0.getIcon());
        setActionView(c7866Kq0.getActionView());
        setContentDescription(c7866Kq0.f6348q);
        KY1.m4672b(this, c7866Kq0.f6349r);
        C7866Kq0 c7866Kq02 = this.f18221B;
        CharSequence charSequence = c7866Kq02.f6336e;
        CheckedTextView checkedTextView = this.f18230z;
        if (charSequence == null && c7866Kq02.getIcon() == null && this.f18221B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f18220A;
            if (frameLayout != null) {
                C8422Vi0 c8422Vi0 = (C8422Vi0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c8422Vi0).width = -1;
                this.f18220A.setLayoutParams(c8422Vi0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f18220A;
        if (frameLayout2 != null) {
            C8422Vi0 c8422Vi02 = (C8422Vi0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c8422Vi02).width = -2;
            this.f18220A.setLayoutParams(c8422Vi02);
        }
    }

    @Override // p000.InterfaceC8646Zq0
    public C7866Kq0 getItemData() {
        return this.f18221B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C7866Kq0 c7866Kq0 = this.f18221B;
        if (c7866Kq0 != null && c7866Kq0.isCheckable() && this.f18221B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18219G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f18228x != z) {
            this.f18228x = z;
            this.f18225F.mo15h(this.f18230z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f18230z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f18229y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f18223D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC4173hL.m18806h(drawable, this.f18222C);
            }
            int i = this.f18226v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f18227w) {
            if (this.f18224E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = ES0.f2702a;
                Drawable drawableM26438a = AbstractC11927zS0.m26438a(resources, ru.mes.dnevnik.R.drawable.navigation_empty_icon, theme);
                this.f18224E = drawableM26438a;
                if (drawableM26438a != null) {
                    int i2 = this.f18226v;
                    drawableM26438a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f18224E;
        }
        this.f18230z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f18230z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f18226v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f18222C = colorStateList;
        this.f18223D = colorStateList != null;
        C7866Kq0 c7866Kq0 = this.f18221B;
        if (c7866Kq0 != null) {
            setIcon(c7866Kq0.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f18230z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f18227w = z;
    }

    public void setTextAppearance(int i) {
        this.f18230z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f18230z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f18230z.setText(charSequence);
    }
}
