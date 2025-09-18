package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11256uA1;
import p000.AbstractC11767yB1;
import p000.AbstractC11918zN1;
import p000.AbstractC3982eJ;
import p000.AbstractC4173hL;
import p000.AbstractC7222ym;
import p000.AbstractC8259Se1;
import p000.AbstractC8593Yp1;
import p000.C6342l6;
import p000.C7110x;
import p000.C8328Tn0;
import p000.C8380Un0;
import p000.C8435Vo1;
import p000.DJ1;
import p000.InterfaceC8276Sn0;
import p000.InterfaceC9824j01;
import p000.LZ0;
import p000.NG0;
import p000.QQ0;
import p000.S02;

/* loaded from: classes.dex */
public class MaterialButton extends C6342l6 implements Checkable, InterfaceC9824j01 {

    /* renamed from: r */
    public static final int[] f18146r = {R.attr.state_checkable};

    /* renamed from: s */
    public static final int[] f18147s = {R.attr.state_checked};

    /* renamed from: d */
    public final C8380Un0 f18148d;

    /* renamed from: e */
    public final LinkedHashSet f18149e;

    /* renamed from: f */
    public InterfaceC8276Sn0 f18150f;

    /* renamed from: g */
    public PorterDuff.Mode f18151g;

    /* renamed from: h */
    public ColorStateList f18152h;

    /* renamed from: i */
    public Drawable f18153i;

    /* renamed from: j */
    public String f18154j;

    /* renamed from: k */
    public int f18155k;

    /* renamed from: l */
    public int f18156l;

    /* renamed from: m */
    public int f18157m;

    /* renamed from: n */
    public int f18158n;

    /* renamed from: o */
    public boolean f18159o;

    /* renamed from: p */
    public boolean f18160p;

    /* renamed from: q */
    public int f18161q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC11256uA1.m25127b(context, attributeSet, ru.mes.dnevnik.R.attr.materialButtonStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Button), attributeSet, ru.mes.dnevnik.R.attr.materialButtonStyle);
        this.f18149e = new LinkedHashSet();
        this.f18159o = false;
        this.f18160p = false;
        Context context2 = getContext();
        TypedArray typedArrayM1627d = DJ1.m1627d(context2, attributeSet, NG0.f7699m, ru.mes.dnevnik.R.attr.materialButtonStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f18158n = typedArrayM1627d.getDimensionPixelSize(12, 0);
        int i = typedArrayM1627d.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f18151g = S02.m7147c(i, mode);
        this.f18152h = AbstractC8259Se1.m7406e(getContext(), typedArrayM1627d, 14);
        this.f18153i = AbstractC8259Se1.m7407f(getContext(), typedArrayM1627d, 10);
        this.f18161q = typedArrayM1627d.getInteger(11, 1);
        this.f18155k = typedArrayM1627d.getDimensionPixelSize(13, 0);
        C8380Un0 c8380Un0 = new C8380Un0(this, LZ0.m5024b(context2, attributeSet, ru.mes.dnevnik.R.attr.materialButtonStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Button).m8561c());
        this.f18148d = c8380Un0;
        c8380Un0.f12049c = typedArrayM1627d.getDimensionPixelOffset(1, 0);
        c8380Un0.f12050d = typedArrayM1627d.getDimensionPixelOffset(2, 0);
        c8380Un0.f12051e = typedArrayM1627d.getDimensionPixelOffset(3, 0);
        c8380Un0.f12052f = typedArrayM1627d.getDimensionPixelOffset(4, 0);
        if (typedArrayM1627d.hasValue(8)) {
            int dimensionPixelSize = typedArrayM1627d.getDimensionPixelSize(8, -1);
            c8380Un0.f12053g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C8435Vo1 c8435Vo1M5027e = c8380Un0.f12048b.m5027e();
            c8435Vo1M5027e.f12767e = new C7110x(f);
            c8435Vo1M5027e.f12768f = new C7110x(f);
            c8435Vo1M5027e.f12769g = new C7110x(f);
            c8435Vo1M5027e.f12770h = new C7110x(f);
            c8380Un0.m8148c(c8435Vo1M5027e.m8561c());
            c8380Un0.f12062p = true;
        }
        c8380Un0.f12054h = typedArrayM1627d.getDimensionPixelSize(20, 0);
        c8380Un0.f12055i = S02.m7147c(typedArrayM1627d.getInt(7, -1), mode);
        c8380Un0.f12056j = AbstractC8259Se1.m7406e(getContext(), typedArrayM1627d, 6);
        c8380Un0.f12057k = AbstractC8259Se1.m7406e(getContext(), typedArrayM1627d, 19);
        c8380Un0.f12058l = AbstractC8259Se1.m7406e(getContext(), typedArrayM1627d, 16);
        c8380Un0.f12063q = typedArrayM1627d.getBoolean(5, false);
        c8380Un0.f12066t = typedArrayM1627d.getDimensionPixelSize(9, 0);
        c8380Un0.f12064r = typedArrayM1627d.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM1627d.hasValue(0)) {
            c8380Un0.f12061o = true;
            setSupportBackgroundTintList(c8380Un0.f12056j);
            setSupportBackgroundTintMode(c8380Un0.f12055i);
        } else {
            c8380Un0.m8150e();
        }
        setPaddingRelative(paddingStart + c8380Un0.f12049c, paddingTop + c8380Un0.f12051e, paddingEnd + c8380Un0.f12050d, paddingBottom + c8380Un0.f12052f);
        typedArrayM1627d.recycle();
        setCompoundDrawablePadding(this.f18158n);
        m11217d(this.f18153i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    /* renamed from: a */
    public final boolean m11214a() {
        C8380Un0 c8380Un0 = this.f18148d;
        return c8380Un0 != null && c8380Un0.f12063q;
    }

    /* renamed from: b */
    public final boolean m11215b() {
        C8380Un0 c8380Un0 = this.f18148d;
        return (c8380Un0 == null || c8380Un0.f12061o) ? false : true;
    }

    /* renamed from: c */
    public final void m11216c() {
        int i = this.f18161q;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.f18153i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f18153i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f18153i, null, null);
        }
    }

    /* renamed from: d */
    public final void m11217d(boolean z) {
        Drawable drawable = this.f18153i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f18153i = drawableMutate;
            AbstractC4173hL.m18806h(drawableMutate, this.f18152h);
            PorterDuff.Mode mode = this.f18151g;
            if (mode != null) {
                AbstractC4173hL.m18807i(this.f18153i, mode);
            }
            int intrinsicWidth = this.f18155k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f18153i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f18155k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f18153i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f18153i;
            int i = this.f18156l;
            int i2 = this.f18157m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f18153i.setVisible(true, z);
        }
        if (z) {
            m11216c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f18161q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f18153i) || (((i3 == 3 || i3 == 4) && drawable5 != this.f18153i) || ((i3 == 16 || i3 == 32) && drawable4 != this.f18153i))) {
            m11216c();
        }
    }

    /* renamed from: e */
    public final void m11218e(int i, int i2) {
        if (this.f18153i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f18161q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f18156l = 0;
                if (i3 == 16) {
                    this.f18157m = 0;
                    m11217d(false);
                    return;
                }
                int intrinsicHeight = this.f18155k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f18153i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f18158n) - getPaddingBottom()) / 2);
                if (this.f18157m != iMax) {
                    this.f18157m = iMax;
                    m11217d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f18157m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f18161q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f18156l = 0;
            m11217d(false);
            return;
        }
        int intrinsicWidth = this.f18155k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f18153i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f18158n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f18161q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f18156l != paddingEnd) {
            this.f18156l = paddingEnd;
            m11217d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f18154j)) {
            return (m11214a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f18154j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m11215b()) {
            return this.f18148d.f12053g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f18153i;
    }

    public int getIconGravity() {
        return this.f18161q;
    }

    public int getIconPadding() {
        return this.f18158n;
    }

    public int getIconSize() {
        return this.f18155k;
    }

    public ColorStateList getIconTint() {
        return this.f18152h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f18151g;
    }

    public int getInsetBottom() {
        return this.f18148d.f12052f;
    }

    public int getInsetTop() {
        return this.f18148d.f12051e;
    }

    public ColorStateList getRippleColor() {
        if (m11215b()) {
            return this.f18148d.f12058l;
        }
        return null;
    }

    public LZ0 getShapeAppearanceModel() {
        if (m11215b()) {
            return this.f18148d.f12048b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m11215b()) {
            return this.f18148d.f12057k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m11215b()) {
            return this.f18148d.f12054h;
        }
        return 0;
    }

    @Override // p000.C6342l6
    public ColorStateList getSupportBackgroundTintList() {
        return m11215b() ? this.f18148d.f12056j : super.getSupportBackgroundTintList();
    }

    @Override // p000.C6342l6
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m11215b() ? this.f18148d.f12055i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18159o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m11215b()) {
            AbstractC8593Yp1.m9386b(this, this.f18148d.m8147b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m11214a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18146r);
        }
        if (this.f18159o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18147s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.C6342l6, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f18159o);
    }

    @Override // p000.C6342l6, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m11214a());
        accessibilityNodeInfo.setChecked(this.f18159o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.C6342l6, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m11218e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8328Tn0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8328Tn0 c8328Tn0 = (C8328Tn0) parcelable;
        super.onRestoreInstanceState(c8328Tn0.f44064a);
        setChecked(c8328Tn0.f11516c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C8328Tn0 c8328Tn0 = new C8328Tn0(super.onSaveInstanceState());
        c8328Tn0.f11516c = this.f18159o;
        return c8328Tn0;
    }

    @Override // p000.C6342l6, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m11218e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f18148d.f12064r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f18153i != null) {
            if (this.f18153i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f18154j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m11215b()) {
            super.setBackgroundColor(i);
            return;
        }
        C8380Un0 c8380Un0 = this.f18148d;
        if (c8380Un0.m8147b(false) != null) {
            c8380Un0.m8147b(false).setTint(i);
        }
    }

    @Override // p000.C6342l6, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m11215b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        C8380Un0 c8380Un0 = this.f18148d;
        c8380Un0.f12061o = true;
        ColorStateList colorStateList = c8380Un0.f12056j;
        MaterialButton materialButton = c8380Un0.f12047a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c8380Un0.f12055i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.C6342l6, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC11918zN1.m26394b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m11215b()) {
            this.f18148d.f12063q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m11214a() && isEnabled() && this.f18159o != z) {
            this.f18159o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.f18159o;
                if (!materialButtonToggleGroup.f18168f) {
                    materialButtonToggleGroup.m11220b(getId(), z2);
                }
            }
            if (this.f18160p) {
                return;
            }
            this.f18160p = true;
            Iterator it = this.f18149e.iterator();
            if (it.hasNext()) {
                throw AbstractC7222ym.m26227d(it);
            }
            this.f18160p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m11215b()) {
            C8380Un0 c8380Un0 = this.f18148d;
            if (c8380Un0.f12062p && c8380Un0.f12053g == i) {
                return;
            }
            c8380Un0.f12053g = i;
            c8380Un0.f12062p = true;
            float f = i;
            C8435Vo1 c8435Vo1M5027e = c8380Un0.f12048b.m5027e();
            c8435Vo1M5027e.f12767e = new C7110x(f);
            c8435Vo1M5027e.f12768f = new C7110x(f);
            c8435Vo1M5027e.f12769g = new C7110x(f);
            c8435Vo1M5027e.f12770h = new C7110x(f);
            c8380Un0.m8148c(c8435Vo1M5027e.m8561c());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m11215b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m11215b()) {
            this.f18148d.m8147b(false).m23237i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f18153i != drawable) {
            this.f18153i = drawable;
            m11217d(true);
            m11218e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f18161q != i) {
            this.f18161q = i;
            m11218e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f18158n != i) {
            this.f18158n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC11918zN1.m26394b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f18155k != i) {
            this.f18155k = i;
            m11217d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f18152h != colorStateList) {
            this.f18152h = colorStateList;
            m11217d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f18151g != mode) {
            this.f18151g = mode;
            m11217d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC3982eJ.m17900b(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C8380Un0 c8380Un0 = this.f18148d;
        c8380Un0.m8149d(c8380Un0.f12051e, i);
    }

    public void setInsetTop(int i) {
        C8380Un0 c8380Un0 = this.f18148d;
        c8380Un0.m8149d(i, c8380Un0.f12052f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC8276Sn0 interfaceC8276Sn0) {
        this.f18150f = interfaceC8276Sn0;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC8276Sn0 interfaceC8276Sn0 = this.f18150f;
        if (interfaceC8276Sn0 != null) {
            ((MaterialButtonToggleGroup) ((QQ0) interfaceC8276Sn0).f9619a).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m11215b()) {
            C8380Un0 c8380Un0 = this.f18148d;
            if (c8380Un0.f12058l != colorStateList) {
                c8380Un0.f12058l = colorStateList;
                MaterialButton materialButton = c8380Un0.f12047a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC11767yB1.m26092b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m11215b()) {
            setRippleColor(AbstractC3982eJ.m17900b(getContext(), i));
        }
    }

    @Override // p000.InterfaceC9824j01
    public void setShapeAppearanceModel(LZ0 lz0) {
        if (!m11215b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f18148d.m8148c(lz0);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m11215b()) {
            C8380Un0 c8380Un0 = this.f18148d;
            c8380Un0.f12060n = z;
            c8380Un0.m8151f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m11215b()) {
            C8380Un0 c8380Un0 = this.f18148d;
            if (c8380Un0.f12057k != colorStateList) {
                c8380Un0.f12057k = colorStateList;
                c8380Un0.m8151f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m11215b()) {
            setStrokeColor(AbstractC3982eJ.m17900b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m11215b()) {
            C8380Un0 c8380Un0 = this.f18148d;
            if (c8380Un0.f12054h != i) {
                c8380Un0.f12054h = i;
                c8380Un0.m8151f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m11215b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.C6342l6
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m11215b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C8380Un0 c8380Un0 = this.f18148d;
        if (c8380Un0.f12056j != colorStateList) {
            c8380Un0.f12056j = colorStateList;
            if (c8380Un0.m8147b(false) != null) {
                AbstractC4173hL.m18806h(c8380Un0.m8147b(false), c8380Un0.f12056j);
            }
        }
    }

    @Override // p000.C6342l6
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m11215b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C8380Un0 c8380Un0 = this.f18148d;
        if (c8380Un0.f12055i != mode) {
            c8380Un0.f12055i = mode;
            if (c8380Un0.m8147b(false) == null || c8380Un0.f12055i == null) {
                return;
            }
            AbstractC4173hL.m18807i(c8380Un0.m8147b(false), c8380Un0.f12055i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m11218e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f18148d.f12064r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f18159o);
    }
}
