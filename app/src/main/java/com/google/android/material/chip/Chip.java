package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p000.AbstractC10102l91;
import p000.AbstractC10944rk1;
import p000.AbstractC11256uA1;
import p000.AbstractC11767yB1;
import p000.AbstractC11918zN1;
import p000.AbstractC3982eJ;
import p000.AbstractC4236iL;
import p000.AbstractC8259Se1;
import p000.AbstractC8593Yp1;
import p000.AbstractC9536gk1;
import p000.C0621Jr;
import p000.C0684Kr;
import p000.C0746Lr;
import p000.C0872Nr;
import p000.C0926Oi;
import p000.C10358n91;
import p000.C4006eh;
import p000.C6468n6;
import p000.C8442Vs0;
import p000.C9590h91;
import p000.DJ1;
import p000.InterfaceC0809Mr;
import p000.InterfaceC9415fo0;
import p000.InterfaceC9418fp1;
import p000.InterfaceC9824j01;
import p000.LZ0;
import p000.NG0;

/* loaded from: classes.dex */
public class Chip extends C6468n6 implements InterfaceC0809Mr, InterfaceC9824j01, Checkable {

    /* renamed from: w */
    public static final Rect f18176w = new Rect();

    /* renamed from: x */
    public static final int[] f18177x = {R.attr.state_selected};

    /* renamed from: y */
    public static final int[] f18178y = {R.attr.state_checkable};

    /* renamed from: e */
    public C0872Nr f18179e;

    /* renamed from: f */
    public InsetDrawable f18180f;

    /* renamed from: g */
    public RippleDrawable f18181g;

    /* renamed from: h */
    public View.OnClickListener f18182h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f18183i;

    /* renamed from: j */
    public boolean f18184j;

    /* renamed from: k */
    public boolean f18185k;

    /* renamed from: l */
    public boolean f18186l;

    /* renamed from: m */
    public boolean f18187m;

    /* renamed from: n */
    public boolean f18188n;

    /* renamed from: o */
    public int f18189o;

    /* renamed from: p */
    public int f18190p;

    /* renamed from: q */
    public CharSequence f18191q;

    /* renamed from: r */
    public final C0746Lr f18192r;

    /* renamed from: s */
    public boolean f18193s;

    /* renamed from: t */
    public final Rect f18194t;

    /* renamed from: u */
    public final RectF f18195u;

    /* renamed from: v */
    public final C0621Jr f18196v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC11256uA1.m25127b(context, attributeSet, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, ru.mes.dnevnik.R.attr.chipStyle);
        this.f18194t = new Rect();
        this.f18195u = new RectF();
        this.f18196v = new C0621Jr(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        C0872Nr c0872Nr = new C0872Nr(context2, attributeSet);
        int[] iArr = NG0.f7691e;
        TypedArray typedArrayM1627d = DJ1.m1627d(c0872Nr.f8082q1, attributeSet, iArr, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0872Nr.f8067Q1 = typedArrayM1627d.hasValue(37);
        Context context3 = c0872Nr.f8082q1;
        ColorStateList colorStateListM7406e = AbstractC8259Se1.m7406e(context3, typedArrayM1627d, 24);
        if (c0872Nr.f8090y != colorStateListM7406e) {
            c0872Nr.f8090y = colorStateListM7406e;
            c0872Nr.onStateChange(c0872Nr.getState());
        }
        ColorStateList colorStateListM7406e2 = AbstractC8259Se1.m7406e(context3, typedArrayM1627d, 11);
        if (c0872Nr.f8092z != colorStateListM7406e2) {
            c0872Nr.f8092z = colorStateListM7406e2;
            c0872Nr.onStateChange(c0872Nr.getState());
        }
        float dimension = typedArrayM1627d.getDimension(19, 0.0f);
        if (c0872Nr.f8034A != dimension) {
            c0872Nr.f8034A = dimension;
            c0872Nr.invalidateSelf();
            c0872Nr.m5889u();
        }
        if (typedArrayM1627d.hasValue(12)) {
            c0872Nr.m5864A(typedArrayM1627d.getDimension(12, 0.0f));
        }
        c0872Nr.m5869F(AbstractC8259Se1.m7406e(context3, typedArrayM1627d, 22));
        c0872Nr.m5870G(typedArrayM1627d.getDimension(23, 0.0f));
        c0872Nr.m5879P(AbstractC8259Se1.m7406e(context3, typedArrayM1627d, 36));
        String text = typedArrayM1627d.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c0872Nr.f8044F, text)) {
            c0872Nr.f8044F = text;
            c0872Nr.f8088w1.f38152d = true;
            c0872Nr.invalidateSelf();
            c0872Nr.m5889u();
        }
        C9590h91 c9590h91 = (!typedArrayM1627d.hasValue(0) || (resourceId3 = typedArrayM1627d.getResourceId(0, 0)) == 0) ? null : new C9590h91(context3, resourceId3);
        c9590h91.f28285k = typedArrayM1627d.getDimension(1, c9590h91.f28285k);
        c0872Nr.m5880Q(c9590h91);
        int i = typedArrayM1627d.getInt(3, 0);
        if (i == 1) {
            c0872Nr.f8061N1 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0872Nr.f8061N1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0872Nr.f8061N1 = TextUtils.TruncateAt.END;
        }
        c0872Nr.m5868E(typedArrayM1627d.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0872Nr.m5868E(typedArrayM1627d.getBoolean(15, false));
        }
        c0872Nr.m5865B(AbstractC8259Se1.m7407f(context3, typedArrayM1627d, 14));
        if (typedArrayM1627d.hasValue(17)) {
            c0872Nr.m5867D(AbstractC8259Se1.m7406e(context3, typedArrayM1627d, 17));
        }
        c0872Nr.m5866C(typedArrayM1627d.getDimension(16, -1.0f));
        c0872Nr.m5876M(typedArrayM1627d.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0872Nr.m5876M(typedArrayM1627d.getBoolean(26, false));
        }
        c0872Nr.m5871H(AbstractC8259Se1.m7407f(context3, typedArrayM1627d, 25));
        c0872Nr.m5875L(AbstractC8259Se1.m7406e(context3, typedArrayM1627d, 30));
        c0872Nr.m5873J(typedArrayM1627d.getDimension(28, 0.0f));
        c0872Nr.m5891w(typedArrayM1627d.getBoolean(6, false));
        c0872Nr.m5894z(typedArrayM1627d.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0872Nr.m5894z(typedArrayM1627d.getBoolean(8, false));
        }
        c0872Nr.m5892x(AbstractC8259Se1.m7407f(context3, typedArrayM1627d, 7));
        if (typedArrayM1627d.hasValue(9)) {
            c0872Nr.m5893y(AbstractC8259Se1.m7406e(context3, typedArrayM1627d, 9));
        }
        c0872Nr.f8072V = (!typedArrayM1627d.hasValue(39) || (resourceId2 = typedArrayM1627d.getResourceId(39, 0)) == 0) ? null : C8442Vs0.m8612a(context3, resourceId2);
        c0872Nr.f8073W = (!typedArrayM1627d.hasValue(33) || (resourceId = typedArrayM1627d.getResourceId(33, 0)) == 0) ? null : C8442Vs0.m8612a(context3, resourceId);
        float dimension2 = typedArrayM1627d.getDimension(21, 0.0f);
        if (c0872Nr.f8074X != dimension2) {
            c0872Nr.f8074X = dimension2;
            c0872Nr.invalidateSelf();
            c0872Nr.m5889u();
        }
        c0872Nr.m5878O(typedArrayM1627d.getDimension(35, 0.0f));
        c0872Nr.m5877N(typedArrayM1627d.getDimension(34, 0.0f));
        float dimension3 = typedArrayM1627d.getDimension(41, 0.0f);
        if (c0872Nr.f8077a0 != dimension3) {
            c0872Nr.f8077a0 = dimension3;
            c0872Nr.invalidateSelf();
            c0872Nr.m5889u();
        }
        float dimension4 = typedArrayM1627d.getDimension(40, 0.0f);
        if (c0872Nr.f8078b0 != dimension4) {
            c0872Nr.f8078b0 = dimension4;
            c0872Nr.invalidateSelf();
            c0872Nr.m5889u();
        }
        c0872Nr.m5874K(typedArrayM1627d.getDimension(29, 0.0f));
        c0872Nr.m5872I(typedArrayM1627d.getDimension(27, 0.0f));
        float dimension5 = typedArrayM1627d.getDimension(13, 0.0f);
        if (c0872Nr.f8081e0 != dimension5) {
            c0872Nr.f8081e0 = dimension5;
            c0872Nr.invalidateSelf();
            c0872Nr.m5889u();
        }
        c0872Nr.f8065P1 = typedArrayM1627d.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM1627d.recycle();
        DJ1.m1624a(context2, attributeSet, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action);
        DJ1.m1625b(context2, attributeSet, iArr, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action);
        this.f18188n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f18190p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c0872Nr);
        c0872Nr.m23237i(AbstractC9536gk1.m18614i(this));
        DJ1.m1624a(context2, attributeSet, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action);
        DJ1.m1625b(context2, attributeSet, iArr, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, ru.mes.dnevnik.R.attr.chipStyle, ru.mes.dnevnik.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f18192r = new C0746Lr(this, this);
        m11235f();
        if (!zHasValue) {
            setOutlineProvider(new C0684Kr(this));
        }
        setChecked(this.f18184j);
        setText(c0872Nr.f8044F);
        setEllipsize(c0872Nr.f8061N1);
        m11238i();
        if (!this.f18179e.f8063O1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m11237h();
        if (this.f18188n) {
            setMinHeight(this.f18190p);
        }
        this.f18189o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Ir
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f5171a.f18183i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f18195u;
        rectF.setEmpty();
        if (m11233d() && this.f18182h != null) {
            C0872Nr c0872Nr = this.f18179e;
            Rect bounds = c0872Nr.getBounds();
            rectF.setEmpty();
            if (c0872Nr.m5883T()) {
                float f = c0872Nr.f8081e0 + c0872Nr.f8080d0 + c0872Nr.f8064P + c0872Nr.f8079c0 + c0872Nr.f8078b0;
                if (AbstractC4236iL.m19003a(c0872Nr) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f18194t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C9590h91 getTextAppearance() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8088w1.f38154f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f18186l != z) {
            this.f18186l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f18185k != z) {
            this.f18185k = z;
            refreshDrawableState();
        }
    }

    /* renamed from: c */
    public final void m11232c(int i) {
        this.f18190p = i;
        if (!this.f18188n) {
            InsetDrawable insetDrawable = this.f18180f;
            if (insetDrawable == null) {
                m11236g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f18180f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m11236g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f18179e.f8034A));
        int iMax2 = Math.max(0, i - this.f18179e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f18180f;
            if (insetDrawable2 == null) {
                m11236g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f18180f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m11236g();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f18180f != null) {
            Rect rect = new Rect();
            this.f18180f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m11236g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f18180f = new InsetDrawable((Drawable) this.f18179e, i2, i3, i2, i3);
        m11236g();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0011 A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11233d() {
        /*
            r2 = this;
            Nr r0 = r2.f18179e
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.f8058M
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof p000.InterfaceC9418fp1
            if (r1 == 0) goto Lf
            fp1 r0 = (p000.InterfaceC9418fp1) r0
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m11233d():boolean");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f18193s ? super.dispatchHoverEvent(motionEvent) : this.f18192r.m22821l(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f18193s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            Lr r0 = r9.f18192r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r1 == r2) goto L85
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6f
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L85
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L85
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.m22822o(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r2
            goto L49
        L55:
            r4 = r7
            goto L85
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L85
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L85
            int r1 = r0.f37696l
            if (r1 == r3) goto L6d
            r4 = 16
            boolean r1 = r0.mo5120q(r1, r4)
        L6d:
            r4 = r2
            goto L85
        L6f:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7b
            r1 = 2
            boolean r4 = r0.m22822o(r1, r6)
            goto L85
        L7b:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto L85
            boolean r4 = r0.m22822o(r2, r6)
        L85:
            if (r4 == 0) goto L8c
            int r0 = r0.f37696l
            if (r0 == r3) goto L8c
            return r2
        L8c:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.C6468n6, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0872Nr c0872Nr = this.f18179e;
        boolean zM5890v = false;
        if (c0872Nr != null && C0872Nr.m5863t(c0872Nr.f8058M)) {
            C0872Nr c0872Nr2 = this.f18179e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.f18187m) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.f18186l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f18185k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f18187m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f18186l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f18185k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0872Nr2.f8055K1, iArr)) {
                c0872Nr2.f8055K1 = iArr;
                if (c0872Nr2.m5883T()) {
                    zM5890v = c0872Nr2.m5890v(c0872Nr2.getState(), iArr);
                }
            }
        }
        if (zM5890v) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean m11234e() {
        C0872Nr c0872Nr = this.f18179e;
        return c0872Nr != null && c0872Nr.f8068R;
    }

    /* renamed from: f */
    public final void m11235f() {
        C0872Nr c0872Nr;
        if (!m11233d() || (c0872Nr = this.f18179e) == null || !c0872Nr.f8056L || this.f18182h == null) {
            AbstractC10944rk1.m24482n(this, null);
            this.f18193s = false;
        } else {
            AbstractC10944rk1.m24482n(this, this.f18192r);
            this.f18193s = true;
        }
    }

    /* renamed from: g */
    public final void m11236g() {
        this.f18181g = new RippleDrawable(AbstractC11767yB1.m26092b(this.f18179e.f8042E), getBackgroundDrawable(), null);
        this.f18179e.getClass();
        RippleDrawable rippleDrawable = this.f18181g;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        setBackground(rippleDrawable);
        m11237h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f18191q)) {
            return this.f18191q;
        }
        if (!m11234e()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f18180f;
        return insetDrawable == null ? this.f18179e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8070T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8071U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8092z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return Math.max(0.0f, c0872Nr.m5888r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f18179e;
    }

    public float getChipEndPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8081e0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || (drawable = c0872Nr.f8048H) == 0) {
            return null;
        }
        boolean z = drawable instanceof InterfaceC9418fp1;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8052J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8050I;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8034A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8074X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8038C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8040D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || (drawable = c0872Nr.f8058M) == 0) {
            return null;
        }
        boolean z = drawable instanceof InterfaceC9418fp1;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8066Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8080d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8064P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8079c0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8062O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8061N1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f18193s) {
            C0746Lr c0746Lr = this.f18192r;
            if (c0746Lr.f37696l == 1 || c0746Lr.f37695k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C8442Vs0 getHideMotionSpec() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8073W;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8076Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8075Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8042E;
        }
        return null;
    }

    public LZ0 getShapeAppearanceModel() {
        return this.f18179e.f38516a.f37931a;
    }

    public C8442Vs0 getShowMotionSpec() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8072V;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8078b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            return c0872Nr.f8077a0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m11237h() {
        C0872Nr c0872Nr;
        if (TextUtils.isEmpty(getText()) || (c0872Nr = this.f18179e) == null) {
            return;
        }
        int iM5887q = (int) (c0872Nr.m5887q() + c0872Nr.f8081e0 + c0872Nr.f8078b0);
        C0872Nr c0872Nr2 = this.f18179e;
        int iM5886p = (int) (c0872Nr2.m5886p() + c0872Nr2.f8074X + c0872Nr2.f8077a0);
        if (this.f18180f != null) {
            Rect rect = new Rect();
            this.f18180f.getPadding(rect);
            iM5886p += rect.left;
            iM5887q += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        setPaddingRelative(iM5886p, paddingTop, iM5887q, paddingBottom);
    }

    /* renamed from: i */
    public final void m11238i() {
        TextPaint paint = getPaint();
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            paint.drawableState = c0872Nr.getState();
        }
        C9590h91 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m18732e(getContext(), paint, this.f18196v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC8593Yp1.m9386b(this, this.f18179e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18177x);
        }
        if (m11234e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18178y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f18193s) {
            C0746Lr c0746Lr = this.f18192r;
            int i2 = c0746Lr.f37696l;
            if (i2 != Integer.MIN_VALUE) {
                c0746Lr.m22819j(i2);
            }
            if (z) {
                c0746Lr.m22822o(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m11234e());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f18189o != i) {
            this.f18189o = i;
            m11237h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x001e, code lost:
    
        if (r0 != 3) goto L63;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f18185k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f18185k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f18182h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f18193s
            if (r0 == 0) goto L43
            Lr r0 = r5.f18192r
            r0.m22825v(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f18191q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f18181g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // p000.C6468n6, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f18181g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p000.C6468n6, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5891w(z);
        }
    }

    public void setCheckableResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5891w(c0872Nr.f8082q1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null) {
            this.f18184j = z;
        } else if (c0872Nr.f8068R) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5892x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5892x(AbstractC11918zN1.m26394b(c0872Nr.f8082q1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5893y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5893y(AbstractC3982eJ.m17900b(c0872Nr.f8082q1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5894z(c0872Nr.f8082q1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8092z == colorStateList) {
            return;
        }
        c0872Nr.f8092z = colorStateList;
        c0872Nr.onStateChange(c0872Nr.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM17900b;
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8092z == (colorStateListM17900b = AbstractC3982eJ.m17900b(c0872Nr.f8082q1, i))) {
            return;
        }
        c0872Nr.f8092z = colorStateListM17900b;
        c0872Nr.onStateChange(c0872Nr.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5864A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5864A(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0872Nr c0872Nr) {
        C0872Nr c0872Nr2 = this.f18179e;
        if (c0872Nr2 != c0872Nr) {
            if (c0872Nr2 != null) {
                c0872Nr2.f8059M1 = new WeakReference(null);
            }
            this.f18179e = c0872Nr;
            c0872Nr.f8063O1 = false;
            c0872Nr.f8059M1 = new WeakReference(this);
            m11232c(this.f18190p);
        }
    }

    public void setChipEndPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8081e0 == f) {
            return;
        }
        c0872Nr.f8081e0 = f;
        c0872Nr.invalidateSelf();
        c0872Nr.m5889u();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            float dimension = c0872Nr.f8082q1.getResources().getDimension(i);
            if (c0872Nr.f8081e0 != dimension) {
                c0872Nr.f8081e0 = dimension;
                c0872Nr.invalidateSelf();
                c0872Nr.m5889u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5865B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5865B(AbstractC11918zN1.m26394b(c0872Nr.f8082q1, i));
        }
    }

    public void setChipIconSize(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5866C(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5866C(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5867D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5867D(AbstractC3982eJ.m17900b(c0872Nr.f8082q1, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5868E(c0872Nr.f8082q1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8034A == f) {
            return;
        }
        c0872Nr.f8034A = f;
        c0872Nr.invalidateSelf();
        c0872Nr.m5889u();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            float dimension = c0872Nr.f8082q1.getResources().getDimension(i);
            if (c0872Nr.f8034A != dimension) {
                c0872Nr.f8034A = dimension;
                c0872Nr.invalidateSelf();
                c0872Nr.m5889u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8074X == f) {
            return;
        }
        c0872Nr.f8074X = f;
        c0872Nr.invalidateSelf();
        c0872Nr.m5889u();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            float dimension = c0872Nr.f8082q1.getResources().getDimension(i);
            if (c0872Nr.f8074X != dimension) {
                c0872Nr.f8074X = dimension;
                c0872Nr.invalidateSelf();
                c0872Nr.m5889u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5869F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5869F(AbstractC3982eJ.m17900b(c0872Nr.f8082q1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5870G(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5870G(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5871H(drawable);
        }
        m11235f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8066Q == charSequence) {
            return;
        }
        String str = C4006eh.f26805b;
        C4006eh c4006eh = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C4006eh.f26808e : C4006eh.f26807d;
        c4006eh.getClass();
        C0926Oi c0926Oi = AbstractC10102l91.f36924a;
        c0872Nr.f8066Q = c4006eh.m18020c(charSequence);
        c0872Nr.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5872I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5872I(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5871H(AbstractC11918zN1.m26394b(c0872Nr.f8082q1, i));
        }
        m11235f();
    }

    public void setCloseIconSize(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5873J(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5873J(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5874K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5874K(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5875L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5875L(AbstractC3982eJ.m17900b(c0872Nr.f8082q1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000.C6468n6, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000.C6468n6, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m23237i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f18179e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.f8061N1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f18188n = z;
        m11232c(this.f18190p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C8442Vs0 c8442Vs0) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.f8073W = c8442Vs0;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.f8073W = C8442Vs0.m8612a(c0872Nr.f8082q1, i);
        }
    }

    public void setIconEndPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5877N(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5877N(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5878O(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5878O(c0872Nr.f8082q1.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f18179e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.f8065P1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f18183i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f18182h = onClickListener;
        m11235f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5879P(colorStateList);
        }
        this.f18179e.getClass();
        m11236g();
    }

    public void setRippleColorResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5879P(AbstractC3982eJ.m17900b(c0872Nr.f8082q1, i));
            this.f18179e.getClass();
            m11236g();
        }
    }

    @Override // p000.InterfaceC9824j01
    public void setShapeAppearanceModel(LZ0 lz0) {
        this.f18179e.setShapeAppearanceModel(lz0);
    }

    public void setShowMotionSpec(C8442Vs0 c8442Vs0) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.f8072V = c8442Vs0;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.f8072V = C8442Vs0.m8612a(c0872Nr.f8082q1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0872Nr.f8063O1 ? null : charSequence, bufferType);
        C0872Nr c0872Nr2 = this.f18179e;
        if (c0872Nr2 == null || TextUtils.equals(c0872Nr2.f8044F, charSequence)) {
            return;
        }
        c0872Nr2.f8044F = charSequence;
        c0872Nr2.f8088w1.f38152d = true;
        c0872Nr2.invalidateSelf();
        c0872Nr2.m5889u();
    }

    public void setTextAppearance(C9590h91 c9590h91) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5880Q(c9590h91);
        }
        m11238i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8078b0 == f) {
            return;
        }
        c0872Nr.f8078b0 = f;
        c0872Nr.invalidateSelf();
        c0872Nr.m5889u();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            float dimension = c0872Nr.f8082q1.getResources().getDimension(i);
            if (c0872Nr.f8078b0 != dimension) {
                c0872Nr.f8078b0 = dimension;
                c0872Nr.invalidateSelf();
                c0872Nr.m5889u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C10358n91 c10358n91 = c0872Nr.f8088w1;
            C9590h91 c9590h91 = c10358n91.f38154f;
            if (c9590h91 != null) {
                c9590h91.f28285k = fApplyDimension;
                c10358n91.f38149a.setTextSize(fApplyDimension);
                c0872Nr.m5889u();
                c0872Nr.invalidateSelf();
            }
        }
        m11238i();
    }

    public void setTextStartPadding(float f) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr == null || c0872Nr.f8077a0 == f) {
            return;
        }
        c0872Nr.f8077a0 = f;
        c0872Nr.invalidateSelf();
        c0872Nr.m5889u();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            float dimension = c0872Nr.f8082q1.getResources().getDimension(i);
            if (c0872Nr.f8077a0 != dimension) {
                c0872Nr.f8077a0 = dimension;
                c0872Nr.invalidateSelf();
                c0872Nr.m5889u();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5876M(z);
        }
        m11235f();
    }

    public void setCheckedIconVisible(boolean z) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5894z(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5868E(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5880Q(new C9590h91(c0872Nr.f8082q1, i));
        }
        m11238i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0872Nr c0872Nr = this.f18179e;
        if (c0872Nr != null) {
            c0872Nr.m5880Q(new C9590h91(c0872Nr.f8082q1, i));
        }
        m11238i();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC9415fo0 interfaceC9415fo0) {
    }
}
