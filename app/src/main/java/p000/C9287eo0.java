package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import ru.mes.dnevnik.R;

/* renamed from: eo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9287eo0 extends C6468n6 {

    /* renamed from: e */
    public final LinkedHashSet f26869e;

    /* renamed from: f */
    public final LinkedHashSet f26870f;

    /* renamed from: g */
    public ColorStateList f26871g;

    /* renamed from: h */
    public boolean f26872h;

    /* renamed from: i */
    public boolean f26873i;

    /* renamed from: j */
    public boolean f26874j;

    /* renamed from: k */
    public CharSequence f26875k;

    /* renamed from: l */
    public Drawable f26876l;

    /* renamed from: m */
    public Drawable f26877m;

    /* renamed from: n */
    public boolean f26878n;

    /* renamed from: o */
    public ColorStateList f26879o;

    /* renamed from: p */
    public ColorStateList f26880p;

    /* renamed from: q */
    public PorterDuff.Mode f26881q;

    /* renamed from: r */
    public int f26882r;

    /* renamed from: s */
    public int[] f26883s;

    /* renamed from: t */
    public boolean f26884t;

    /* renamed from: u */
    public CharSequence f26885u;

    /* renamed from: v */
    public CompoundButton.OnCheckedChangeListener f26886v;

    /* renamed from: w */
    public final C3906d5 f26887w;

    /* renamed from: x */
    public final C9026co0 f26888x;

    /* renamed from: y */
    public static final int[] f26867y = {R.attr.state_indeterminate};

    /* renamed from: z */
    public static final int[] f26868z = {R.attr.state_error};

    /* renamed from: A */
    public static final int[][] f26865A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B */
    public static final int f26866B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", ConstantDeviceInfo.APP_PLATFORM);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9287eo0(Context context, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        C3906d5 c3906d5;
        int next;
        super(AbstractC11256uA1.m25127b(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        int i = 0;
        this.f26869e = new LinkedHashSet();
        this.f26870f = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            c3906d5 = new C3906d5(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = ES0.f2702a;
            Drawable drawableM26438a = AbstractC11927zS0.m26438a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            c3906d5.f37260a = drawableM26438a;
            drawableM26438a.setCallback(c3906d5.f25807f);
            new C1825c5(i, c3906d5.f37260a.getConstantState());
        } else {
            int i2 = C3906d5.f25802g;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                C3906d5 c3906d52 = new C3906d5(context2);
                c3906d52.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                c3906d5 = c3906d52;
            } catch (IOException | XmlPullParserException unused) {
                c3906d5 = null;
            }
        }
        this.f26887w = c3906d5;
        this.f26888x = new C9026co0(this);
        Context context3 = getContext();
        this.f26876l = AbstractC6331kw.m22312a(this);
        this.f26879o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = NG0.f7703q;
        DJ1.m1624a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        DJ1.m1625b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C8539Xo1 c8539Xo1 = new C8539Xo1(context3, typedArrayObtainStyledAttributes);
        this.f26877m = c8539Xo1.m9121C(2);
        if (this.f26876l != null && AbstractC9900ja1.m22073b(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f26866B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f26876l = AbstractC11918zN1.m26394b(context3, R.drawable.mtrl_checkbox_button);
                this.f26878n = true;
                if (this.f26877m == null) {
                    this.f26877m = AbstractC11918zN1.m26394b(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f26880p = AbstractC8259Se1.m7405d(context3, c8539Xo1, 3);
        this.f26881q = S02.m7147c(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f26872h = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f26873i = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f26874j = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f26875k = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c8539Xo1.m9130M();
        m18034a();
    }

    private String getButtonStateDescription() {
        int i = this.f26882r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f26871g == null) {
            int iM22230e = AbstractC10036ke1.m22230e(R.attr.colorControlActivated, this);
            int iM22230e2 = AbstractC10036ke1.m22230e(R.attr.colorError, this);
            int iM22230e3 = AbstractC10036ke1.m22230e(R.attr.colorSurface, this);
            int iM22230e4 = AbstractC10036ke1.m22230e(R.attr.colorOnSurface, this);
            this.f26871g = new ColorStateList(f26865A, new int[]{AbstractC10036ke1.m22234i(iM22230e3, 1.0f, iM22230e2), AbstractC10036ke1.m22234i(iM22230e3, 1.0f, iM22230e), AbstractC10036ke1.m22234i(iM22230e3, 0.54f, iM22230e4), AbstractC10036ke1.m22234i(iM22230e3, 0.38f, iM22230e4), AbstractC10036ke1.m22234i(iM22230e3, 0.38f, iM22230e4)});
        }
        return this.f26871g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f26879o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: a */
    public final void m18034a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C3903d2 c3903d2;
        Drawable drawableMutate = this.f26876l;
        ColorStateList colorStateList3 = this.f26879o;
        PorterDuff.Mode modeM22122b = AbstractC6268jw.m22122b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeM22122b != null) {
                AbstractC4173hL.m18807i(drawableMutate, modeM22122b);
            }
        }
        this.f26876l = drawableMutate;
        Drawable drawableMutate2 = this.f26877m;
        ColorStateList colorStateList4 = this.f26880p;
        PorterDuff.Mode mode = this.f26881q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                AbstractC4173hL.m18807i(drawableMutate2, mode);
            }
        }
        this.f26877m = drawableMutate2;
        if (this.f26878n) {
            C3906d5 c3906d5 = this.f26887w;
            if (c3906d5 != null) {
                Drawable drawable = c3906d5.f37260a;
                C9026co0 c9026co0 = this.f26888x;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c9026co0.f17765a == null) {
                        c9026co0.f17765a = new C0572J4(c9026co0);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c9026co0.f17765a);
                }
                ArrayList arrayList = c3906d5.f25806e;
                C1763b5 c1763b5 = c3906d5.f25803b;
                if (arrayList != null && c9026co0 != null) {
                    arrayList.remove(c9026co0);
                    if (c3906d5.f25806e.size() == 0 && (c3903d2 = c3906d5.f25805d) != null) {
                        c1763b5.f16738b.removeListener(c3903d2);
                        c3906d5.f25805d = null;
                    }
                }
                Drawable drawable2 = c3906d5.f37260a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c9026co0.f17765a == null) {
                        c9026co0.f17765a = new C0572J4(c9026co0);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c9026co0.f17765a);
                } else if (c9026co0 != null) {
                    if (c3906d5.f25806e == null) {
                        c3906d5.f25806e = new ArrayList();
                    }
                    if (!c3906d5.f25806e.contains(c9026co0)) {
                        c3906d5.f25806e.add(c9026co0);
                        if (c3906d5.f25805d == null) {
                            c3906d5.f25805d = new C3903d2(1, c3906d5);
                        }
                        c1763b5.f16738b.addListener(c3906d5.f25805d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f26876l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && c3906d5 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c3906d5, false);
                    ((AnimatedStateListDrawable) this.f26876l).addTransition(R.id.indeterminate, R.id.unchecked, c3906d5, false);
                }
            }
        }
        Drawable drawable4 = this.f26876l;
        if (drawable4 != null && (colorStateList2 = this.f26879o) != null) {
            AbstractC4173hL.m18806h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f26877m;
        if (drawable5 != null && (colorStateList = this.f26880p) != null) {
            AbstractC4173hL.m18806h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f26876l;
        Drawable drawable7 = this.f26877m;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f26876l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f26877m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f26880p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f26881q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f26879o;
    }

    public int getCheckedState() {
        return this.f26882r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f26875k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f26882r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f26872h && this.f26879o == null && this.f26880p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26867y);
        }
        if (this.f26874j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26868z);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f26883s = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM22312a;
        if (!this.f26873i || !TextUtils.isEmpty(getText()) || (drawableM22312a = AbstractC6331kw.m22312a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM22312a.getIntrinsicWidth()) / 2) * (S02.m7146b(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM22312a.getBounds();
            AbstractC4173hL.m18804f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f26874j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f26875k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C9159do0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9159do0 c9159do0 = (C9159do0) parcelable;
        super.onRestoreInstanceState(c9159do0.getSuperState());
        setCheckedState(c9159do0.f26278a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C9159do0 c9159do0 = new C9159do0(super.onSaveInstanceState());
        c9159do0.f26278a = getCheckedState();
        return c9159do0;
    }

    @Override // p000.C6468n6, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f26877m = drawable;
        m18034a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f26880p == colorStateList) {
            return;
        }
        this.f26880p = colorStateList;
        m18034a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f26881q == mode) {
            return;
        }
        this.f26881q = mode;
        m18034a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f26879o == colorStateList) {
            return;
        }
        this.f26879o = colorStateList;
        m18034a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m18034a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f26873i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f26882r != i) {
            this.f26882r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.f26885u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f26884t) {
                return;
            }
            this.f26884t = true;
            LinkedHashSet linkedHashSet = this.f26870f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC7222ym.m26227d(it);
                }
            }
            if (this.f26882r != 2 && (onCheckedChangeListener = this.f26886v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f26884t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f26875k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f26874j == z) {
            return;
        }
        this.f26874j = z;
        refreshDrawableState();
        Iterator it = this.f26869e.iterator();
        if (it.hasNext()) {
            AbstractC1374Vq.m8597p(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f26886v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f26885u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f26872h = z;
        if (z) {
            AbstractC6268jw.m22123c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC6268jw.m22123c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p000.C6468n6, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f26876l = drawable;
        this.f26878n = false;
        m18034a();
    }
}
