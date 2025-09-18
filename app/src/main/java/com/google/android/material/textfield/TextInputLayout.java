package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import p000.AbstractC0691Ky;
import p000.AbstractC0749Lu;
import p000.AbstractC10036ke1;
import p000.AbstractC10102l91;
import p000.AbstractC10490oB1;
import p000.AbstractC10784qU1;
import p000.AbstractC10944rk1;
import p000.AbstractC11105t02;
import p000.AbstractC11256uA1;
import p000.AbstractC11918zN1;
import p000.AbstractC1374Vq;
import p000.AbstractC1655aI;
import p000.AbstractC3982eJ;
import p000.AbstractC4173hL;
import p000.AbstractC6467n5;
import p000.AbstractC6737rL;
import p000.AbstractC7787Jc1;
import p000.AbstractC8259Se1;
import p000.AbstractC8593Yp1;
import p000.AbstractC9792ik1;
import p000.AbstractC9900ja1;
import p000.C0025AO;
import p000.C0088BO;
import p000.C0367Fp;
import p000.C0574J6;
import p000.C0863Ni;
import p000.C0926Oi;
import p000.C10099l80;
import p000.C10227m80;
import p000.C10311mo0;
import p000.C10439no0;
import p000.C11126t91;
import p000.C11244u41;
import p000.C11254u91;
import p000.C11509w91;
import p000.C3975eC;
import p000.C4006eh;
import p000.C4038fC;
import p000.C4049fN;
import p000.C4237iM;
import p000.C6490nS;
import p000.C6803s7;
import p000.C6852su;
import p000.C7110x;
import p000.C7754Im0;
import p000.C8224Rn0;
import p000.C8435Vo1;
import p000.C8539Xo1;
import p000.C9590h91;
import p000.DJ1;
import p000.GT0;
import p000.InterfaceC11382v91;
import p000.InterfaceC7235yz;
import p000.LZ0;
import p000.N61;
import p000.NG0;
import p000.QQ0;
import p000.RunnableC10431nk0;
import p000.S02;
import p000.T12;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: N1 */
    public static final int[][] f18261N1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    public ColorStateList f18262A;

    /* renamed from: A1 */
    public int f18263A1;

    /* renamed from: B */
    public ColorStateList f18264B;

    /* renamed from: B1 */
    public int f18265B1;

    /* renamed from: C */
    public boolean f18266C;

    /* renamed from: C1 */
    public int f18267C1;

    /* renamed from: D */
    public CharSequence f18268D;

    /* renamed from: D1 */
    public int f18269D1;

    /* renamed from: E */
    public boolean f18270E;

    /* renamed from: E1 */
    public int f18271E1;

    /* renamed from: F */
    public C10439no0 f18272F;

    /* renamed from: F1 */
    public boolean f18273F1;

    /* renamed from: G */
    public C10439no0 f18274G;

    /* renamed from: G1 */
    public final C6852su f18275G1;

    /* renamed from: H */
    public StateListDrawable f18276H;

    /* renamed from: H1 */
    public boolean f18277H1;

    /* renamed from: I */
    public boolean f18278I;

    /* renamed from: I1 */
    public boolean f18279I1;

    /* renamed from: J */
    public C10439no0 f18280J;

    /* renamed from: J1 */
    public ValueAnimator f18281J1;

    /* renamed from: K */
    public C10439no0 f18282K;

    /* renamed from: K1 */
    public boolean f18283K1;

    /* renamed from: L */
    public LZ0 f18284L;

    /* renamed from: L1 */
    public boolean f18285L1;

    /* renamed from: M */
    public boolean f18286M;

    /* renamed from: M1 */
    public boolean f18287M1;

    /* renamed from: N */
    public final int f18288N;

    /* renamed from: O */
    public int f18289O;

    /* renamed from: P */
    public int f18290P;

    /* renamed from: Q */
    public int f18291Q;

    /* renamed from: R */
    public int f18292R;

    /* renamed from: S */
    public int f18293S;

    /* renamed from: T */
    public int f18294T;

    /* renamed from: U */
    public int f18295U;

    /* renamed from: V */
    public final Rect f18296V;

    /* renamed from: W */
    public final Rect f18297W;

    /* renamed from: a */
    public final FrameLayout f18298a;

    /* renamed from: a0 */
    public final RectF f18299a0;

    /* renamed from: b */
    public final C11244u41 f18300b;

    /* renamed from: b0 */
    public Typeface f18301b0;

    /* renamed from: c */
    public final C0088BO f18302c;

    /* renamed from: c0 */
    public ColorDrawable f18303c0;

    /* renamed from: d */
    public EditText f18304d;

    /* renamed from: d0 */
    public int f18305d0;

    /* renamed from: e */
    public CharSequence f18306e;

    /* renamed from: e0 */
    public final LinkedHashSet f18307e0;

    /* renamed from: f */
    public int f18308f;

    /* renamed from: g */
    public int f18309g;

    /* renamed from: h */
    public int f18310h;

    /* renamed from: i */
    public int f18311i;

    /* renamed from: j */
    public final C10227m80 f18312j;

    /* renamed from: k */
    public boolean f18313k;

    /* renamed from: l */
    public int f18314l;

    /* renamed from: m */
    public boolean f18315m;

    /* renamed from: n */
    public InterfaceC11382v91 f18316n;

    /* renamed from: o */
    public C6803s7 f18317o;

    /* renamed from: p */
    public int f18318p;

    /* renamed from: q */
    public int f18319q;

    /* renamed from: q1 */
    public ColorDrawable f18320q1;

    /* renamed from: r */
    public CharSequence f18321r;

    /* renamed from: r1 */
    public int f18322r1;

    /* renamed from: s */
    public boolean f18323s;

    /* renamed from: s1 */
    public Drawable f18324s1;

    /* renamed from: t */
    public C6803s7 f18325t;

    /* renamed from: t1 */
    public ColorStateList f18326t1;

    /* renamed from: u */
    public ColorStateList f18327u;

    /* renamed from: u1 */
    public ColorStateList f18328u1;

    /* renamed from: v */
    public int f18329v;

    /* renamed from: v1 */
    public int f18330v1;

    /* renamed from: w */
    public C6490nS f18331w;

    /* renamed from: w1 */
    public int f18332w1;

    /* renamed from: x */
    public C6490nS f18333x;

    /* renamed from: x1 */
    public int f18334x1;

    /* renamed from: y */
    public ColorStateList f18335y;

    /* renamed from: y1 */
    public ColorStateList f18336y1;

    /* renamed from: z */
    public ColorStateList f18337z;

    /* renamed from: z1 */
    public int f18338z1;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC11256uA1.m25127b(context, attributeSet, ru.mes.dnevnik.R.attr.textInputStyle, ru.mes.dnevnik.R.style.Widget_Design_TextInputLayout), attributeSet, ru.mes.dnevnik.R.attr.textInputStyle);
        this.f18308f = -1;
        this.f18309g = -1;
        this.f18310h = -1;
        this.f18311i = -1;
        this.f18312j = new C10227m80(this);
        this.f18316n = new C7754Im0(22);
        this.f18296V = new Rect();
        this.f18297W = new Rect();
        this.f18299a0 = new RectF();
        this.f18307e0 = new LinkedHashSet();
        C6852su c6852su = new C6852su(this);
        this.f18275G1 = c6852su;
        this.f18287M1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f18298a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC6467n5.f38090a;
        c6852su.f42671Q = linearInterpolator;
        c6852su.m24803h(false);
        c6852su.f42670P = linearInterpolator;
        c6852su.m24803h(false);
        if (c6852su.f42693g != 8388659) {
            c6852su.f42693g = 8388659;
            c6852su.m24803h(false);
        }
        int[] iArr = NG0.f7685E;
        DJ1.m1624a(context2, attributeSet, ru.mes.dnevnik.R.attr.textInputStyle, ru.mes.dnevnik.R.style.Widget_Design_TextInputLayout);
        DJ1.m1625b(context2, attributeSet, iArr, ru.mes.dnevnik.R.attr.textInputStyle, ru.mes.dnevnik.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ru.mes.dnevnik.R.attr.textInputStyle, ru.mes.dnevnik.R.style.Widget_Design_TextInputLayout);
        C8539Xo1 c8539Xo1 = new C8539Xo1(context2, typedArrayObtainStyledAttributes);
        C11244u41 c11244u41 = new C11244u41(this, c8539Xo1);
        this.f18300b = c11244u41;
        this.f18266C = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f18279I1 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f18277H1 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f18284L = LZ0.m5024b(context2, attributeSet, ru.mes.dnevnik.R.attr.textInputStyle, ru.mes.dnevnik.R.style.Widget_Design_TextInputLayout).m8561c();
        this.f18288N = context2.getResources().getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f18290P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f18292R = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f18293S = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f18291Q = this.f18292R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C8435Vo1 c8435Vo1M5027e = this.f18284L.m5027e();
        if (dimension >= 0.0f) {
            c8435Vo1M5027e.f12767e = new C7110x(dimension);
        }
        if (dimension2 >= 0.0f) {
            c8435Vo1M5027e.f12768f = new C7110x(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c8435Vo1M5027e.f12769g = new C7110x(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c8435Vo1M5027e.f12770h = new C7110x(dimension4);
        }
        this.f18284L = c8435Vo1M5027e.m8561c();
        ColorStateList colorStateListM7405d = AbstractC8259Se1.m7405d(context2, c8539Xo1, 7);
        if (colorStateListM7405d != null) {
            int defaultColor = colorStateListM7405d.getDefaultColor();
            this.f18338z1 = defaultColor;
            this.f18295U = defaultColor;
            if (colorStateListM7405d.isStateful()) {
                this.f18263A1 = colorStateListM7405d.getColorForState(new int[]{-16842910}, -1);
                this.f18265B1 = colorStateListM7405d.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f18267C1 = colorStateListM7405d.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f18265B1 = this.f18338z1;
                ColorStateList colorStateListM17900b = AbstractC3982eJ.m17900b(context2, ru.mes.dnevnik.R.color.mtrl_filled_background_color);
                this.f18263A1 = colorStateListM17900b.getColorForState(new int[]{-16842910}, -1);
                this.f18267C1 = colorStateListM17900b.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f18295U = 0;
            this.f18338z1 = 0;
            this.f18263A1 = 0;
            this.f18265B1 = 0;
            this.f18267C1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM9120B = c8539Xo1.m9120B(1);
            this.f18328u1 = colorStateListM9120B;
            this.f18326t1 = colorStateListM9120B;
        }
        ColorStateList colorStateListM7405d2 = AbstractC8259Se1.m7405d(context2, c8539Xo1, 14);
        this.f18334x1 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f18330v1 = AbstractC0691Ky.m4783a(context2, ru.mes.dnevnik.R.color.mtrl_textinput_default_box_stroke_color);
        this.f18269D1 = AbstractC0691Ky.m4783a(context2, ru.mes.dnevnik.R.color.mtrl_textinput_disabled_color);
        this.f18332w1 = AbstractC0691Ky.m4783a(context2, ru.mes.dnevnik.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM7405d2 != null) {
            setBoxStrokeColorStateList(colorStateListM7405d2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC8259Se1.m7405d(context2, c8539Xo1, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f18262A = c8539Xo1.m9120B(24);
        this.f18264B = c8539Xo1.m9120B(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f18319q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f18318p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f18318p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f18319q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c8539Xo1.m9120B(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c8539Xo1.m9120B(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c8539Xo1.m9120B(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c8539Xo1.m9120B(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c8539Xo1.m9120B(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c8539Xo1.m9120B(58));
        }
        C0088BO c0088bo = new C0088BO(this, c8539Xo1);
        this.f18302c = c0088bo;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c8539Xo1.m9130M();
        setImportantForAccessibility(2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 >= 26) {
            AbstractC9792ik1.m19086m(this, 1);
        }
        frameLayout.addView(c11244u41);
        frameLayout.addView(c0088bo);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f18304d;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC11105t02.m24824c(editText)) {
            return this.f18272F;
        }
        int iM22230e = AbstractC10036ke1.m22230e(ru.mes.dnevnik.R.attr.colorControlHighlight, this.f18304d);
        int i = this.f18289O;
        int[][] iArr = f18261N1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C10439no0 c10439no0 = this.f18272F;
            int i2 = this.f18295U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC10036ke1.m22234i(iM22230e, 0.1f, i2), i2}), c10439no0, c10439no0);
        }
        Context context = getContext();
        C10439no0 c10439no02 = this.f18272F;
        TypedValue typedValueM22074c = AbstractC9900ja1.m22074c(context, ru.mes.dnevnik.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM22074c.resourceId;
        int iM4783a = i3 != 0 ? AbstractC0691Ky.m4783a(context, i3) : typedValueM22074c.data;
        C10439no0 c10439no03 = new C10439no0(c10439no02.f38516a.f37931a);
        int iM22234i = AbstractC10036ke1.m22234i(iM22230e, 0.1f, iM4783a);
        c10439no03.m23238j(new ColorStateList(iArr, new int[]{iM22234i, 0}));
        c10439no03.setTint(iM4783a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM22234i, iM4783a});
        C10439no0 c10439no04 = new C10439no0(c10439no02.f38516a.f37931a);
        c10439no04.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c10439no03, c10439no04), c10439no02});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f18276H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f18276H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f18276H.addState(new int[0], m11259f(false));
        }
        return this.f18276H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f18274G == null) {
            this.f18274G = m11259f(true);
        }
        return this.f18274G;
    }

    /* renamed from: k */
    public static void m11253k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m11253k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f18304d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.f18304d = editText;
        int i = this.f18308f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f18310h);
        }
        int i2 = this.f18309g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f18311i);
        }
        this.f18278I = false;
        m11262i();
        setTextInputAccessibilityDelegate(new C11254u91(this));
        Typeface typeface = this.f18304d.getTypeface();
        C6852su c6852su = this.f18275G1;
        c6852su.m24808m(typeface);
        float textSize = this.f18304d.getTextSize();
        if (c6852su.f42694h != textSize) {
            c6852su.f42694h = textSize;
            c6852su.m24803h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f18304d.getLetterSpacing();
        if (c6852su.f42677W != letterSpacing) {
            c6852su.f42677W = letterSpacing;
            c6852su.m24803h(false);
        }
        int gravity = this.f18304d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c6852su.f42693g != i4) {
            c6852su.f42693g = i4;
            c6852su.m24803h(false);
        }
        if (c6852su.f42691f != gravity) {
            c6852su.f42691f = gravity;
            c6852su.m24803h(false);
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        this.f18271E1 = editText.getMinimumHeight();
        this.f18304d.addTextChangedListener(new C11126t91(this, editText));
        if (this.f18326t1 == null) {
            this.f18326t1 = this.f18304d.getHintTextColors();
        }
        if (this.f18266C) {
            if (TextUtils.isEmpty(this.f18268D)) {
                CharSequence hint = this.f18304d.getHint();
                this.f18306e = hint;
                setHint(hint);
                this.f18304d.setHint((CharSequence) null);
            }
            this.f18270E = true;
        }
        if (i3 >= 29) {
            m11268p();
        }
        if (this.f18317o != null) {
            m11266n(this.f18304d.getText());
        }
        m11270r();
        this.f18312j.m22684b();
        this.f18300b.bringToFront();
        C0088BO c0088bo = this.f18302c;
        c0088bo.bringToFront();
        Iterator it = this.f18307e0.iterator();
        while (it.hasNext()) {
            ((C0025AO) it.next()).m172a(this);
        }
        c0088bo.m710m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m11273u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f18268D)) {
            return;
        }
        this.f18268D = charSequence;
        C6852su c6852su = this.f18275G1;
        if (charSequence == null || !TextUtils.equals(c6852su.f42655A, charSequence)) {
            c6852su.f42655A = charSequence;
            c6852su.f42656B = null;
            Bitmap bitmap = c6852su.f42659E;
            if (bitmap != null) {
                bitmap.recycle();
                c6852su.f42659E = null;
            }
            c6852su.m24803h(false);
        }
        if (this.f18273F1) {
            return;
        }
        m11263j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f18323s == z) {
            return;
        }
        if (z) {
            C6803s7 c6803s7 = this.f18325t;
            if (c6803s7 != null) {
                this.f18298a.addView(c6803s7);
                this.f18325t.setVisibility(0);
            }
        } else {
            C6803s7 c6803s72 = this.f18325t;
            if (c6803s72 != null) {
                c6803s72.setVisibility(8);
            }
            this.f18325t = null;
        }
        this.f18323s = z;
    }

    /* renamed from: a */
    public final void m11254a(float f) {
        C6852su c6852su = this.f18275G1;
        if (c6852su.f42683b == f) {
            return;
        }
        if (this.f18281J1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18281J1 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC10490oB1.m23360e(getContext(), ru.mes.dnevnik.R.attr.motionEasingEmphasizedInterpolator, AbstractC6467n5.f38091b));
            this.f18281J1.setDuration(AbstractC10490oB1.m23359d(getContext(), ru.mes.dnevnik.R.attr.motionDurationMedium4, 167));
            this.f18281J1.addUpdateListener(new C0863Ni(2, this));
        }
        this.f18281J1.setFloatValues(c6852su.f42683b, f);
        this.f18281J1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f18298a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m11272t();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m11255b() {
        int i;
        int i2;
        C10439no0 c10439no0 = this.f18272F;
        if (c10439no0 == null) {
            return;
        }
        LZ0 lz0 = c10439no0.f38516a.f37931a;
        LZ0 lz02 = this.f18284L;
        if (lz0 != lz02) {
            c10439no0.setShapeAppearanceModel(lz02);
        }
        if (this.f18289O == 2 && (i = this.f18291Q) > -1 && (i2 = this.f18294T) != 0) {
            C10439no0 c10439no02 = this.f18272F;
            c10439no02.f38516a.f37940j = i;
            c10439no02.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C10311mo0 c10311mo0 = c10439no02.f38516a;
            if (c10311mo0.f37934d != colorStateListValueOf) {
                c10311mo0.f37934d = colorStateListValueOf;
                c10439no02.onStateChange(c10439no02.getState());
            }
        }
        int iM5131d = this.f18295U;
        if (this.f18289O == 1) {
            iM5131d = AbstractC0749Lu.m5131d(this.f18295U, AbstractC10036ke1.m22231f(getContext(), ru.mes.dnevnik.R.attr.colorSurface, 0));
        }
        this.f18295U = iM5131d;
        this.f18272F.m23238j(ColorStateList.valueOf(iM5131d));
        C10439no0 c10439no03 = this.f18280J;
        if (c10439no03 != null && this.f18282K != null) {
            if (this.f18291Q > -1 && this.f18294T != 0) {
                c10439no03.m23238j(this.f18304d.isFocused() ? ColorStateList.valueOf(this.f18330v1) : ColorStateList.valueOf(this.f18294T));
                this.f18282K.m23238j(ColorStateList.valueOf(this.f18294T));
            }
            invalidate();
        }
        m11271s();
    }

    /* renamed from: c */
    public final int m11256c() {
        float fM24800d;
        if (!this.f18266C) {
            return 0;
        }
        int i = this.f18289O;
        C6852su c6852su = this.f18275G1;
        if (i == 0) {
            fM24800d = c6852su.m24800d();
        } else {
            if (i != 2) {
                return 0;
            }
            fM24800d = c6852su.m24800d() / 2.0f;
        }
        return (int) fM24800d;
    }

    /* renamed from: d */
    public final C6490nS m11257d() {
        C6490nS c6490nS = new C6490nS();
        c6490nS.f3338c = AbstractC10490oB1.m23359d(getContext(), ru.mes.dnevnik.R.attr.motionDurationShort2, 87);
        c6490nS.f3339d = AbstractC10490oB1.m23360e(getContext(), ru.mes.dnevnik.R.attr.motionEasingLinearInterpolator, AbstractC6467n5.f38090a);
        return c6490nS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f18304d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f18306e != null) {
            boolean z = this.f18270E;
            this.f18270E = false;
            CharSequence hint = editText.getHint();
            this.f18304d.setHint(this.f18306e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f18304d.setHint(hint);
                this.f18270E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f18298a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f18304d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f18285L1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f18285L1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C10439no0 c10439no0;
        int i;
        super.draw(canvas);
        boolean z = this.f18266C;
        C6852su c6852su = this.f18275G1;
        if (z) {
            c6852su.getClass();
            int iSave = canvas.save();
            if (c6852su.f42656B != null) {
                RectF rectF = c6852su.f42689e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c6852su.f42668N;
                    textPaint.setTextSize(c6852su.f42661G);
                    float f = c6852su.f42702p;
                    float f2 = c6852su.f42703q;
                    float f3 = c6852su.f42660F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (c6852su.f42688d0 <= 1 || c6852su.f42657C) {
                        canvas.translate(f, f2);
                        c6852su.f42679Y.draw(canvas);
                    } else {
                        float lineStart = c6852su.f42702p - c6852su.f42679Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c6852su.f42684b0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c6852su.f42662H;
                            float f6 = c6852su.f42663I;
                            float f7 = c6852su.f42664J;
                            int i3 = c6852su.f42665K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0749Lu.m5133f(i3, (textPaint.getAlpha() * Color.alpha(i3)) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        c6852su.f42679Y.draw(canvas);
                        textPaint.setAlpha((int) (c6852su.f42682a0 * f4));
                        if (i2 >= 31) {
                            float f8 = c6852su.f42662H;
                            float f9 = c6852su.f42663I;
                            float f10 = c6852su.f42664J;
                            int i4 = c6852su.f42665K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0749Lu.m5133f(i4, (Color.alpha(i4) * textPaint.getAlpha()) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        int lineBaseline = c6852su.f42679Y.getLineBaseline(0);
                        CharSequence charSequence = c6852su.f42686c0;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c6852su.f42662H, c6852su.f42663I, c6852su.f42664J, c6852su.f42665K);
                        }
                        String strTrim = c6852su.f42686c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c6852su.f42679Y.getLineEnd(i), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f18282K == null || (c10439no0 = this.f18280J) == null) {
            return;
        }
        c10439no0.draw(canvas);
        if (this.f18304d.isFocused()) {
            Rect bounds = this.f18282K.getBounds();
            Rect bounds2 = this.f18280J.getBounds();
            float f12 = c6852su.f42683b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC6467n5.m23075c(iCenterX, f12, bounds2.left);
            bounds.right = AbstractC6467n5.m23075c(iCenterX, f12, bounds2.right);
            this.f18282K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.f18283K1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f18283K1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            su r3 = r4.f18275G1
            if (r3 == 0) goto L2f
            r3.f42666L = r1
            android.content.res.ColorStateList r1 = r3.f42697k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f42696j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m24803h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f18304d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = p000.AbstractC10944rk1.f41842a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.m11273u(r0, r2)
        L47:
            r4.m11270r()
            r4.m11276x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f18283K1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final boolean m11258e() {
        return this.f18266C && !TextUtils.isEmpty(this.f18268D) && (this.f18272F instanceof C4038fC);
    }

    /* renamed from: f */
    public final C10439no0 m11259f(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f18304d;
        float popupElevation = editText instanceof C8224Rn0 ? ((C8224Rn0) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        GT0 gt0 = new GT0();
        GT0 gt02 = new GT0();
        GT0 gt03 = new GT0();
        GT0 gt04 = new GT0();
        C4049fN c4049fN = new C4049fN(0);
        C4049fN c4049fN2 = new C4049fN(0);
        C4049fN c4049fN3 = new C4049fN(0);
        C4049fN c4049fN4 = new C4049fN(0);
        C7110x c7110x = new C7110x(f);
        C7110x c7110x2 = new C7110x(f);
        C7110x c7110x3 = new C7110x(dimensionPixelOffset);
        C7110x c7110x4 = new C7110x(dimensionPixelOffset);
        LZ0 lz0 = new LZ0();
        lz0.f6714a = gt0;
        lz0.f6715b = gt02;
        lz0.f6716c = gt03;
        lz0.f6717d = gt04;
        lz0.f6718e = c7110x;
        lz0.f6719f = c7110x2;
        lz0.f6720g = c7110x4;
        lz0.f6721h = c7110x3;
        lz0.f6722i = c4049fN;
        lz0.f6723j = c4049fN2;
        lz0.f6724k = c4049fN3;
        lz0.f6725l = c4049fN4;
        EditText editText2 = this.f18304d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C8224Rn0 ? ((C8224Rn0) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C10439no0.f38515x;
            TypedValue typedValueM22074c = AbstractC9900ja1.m22074c(context, ru.mes.dnevnik.R.attr.colorSurface, C10439no0.class.getSimpleName());
            int i = typedValueM22074c.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? AbstractC0691Ky.m4783a(context, i) : typedValueM22074c.data);
        }
        C10439no0 c10439no0 = new C10439no0();
        c10439no0.m23236h(context);
        c10439no0.m23238j(dropDownBackgroundTintList);
        c10439no0.m23237i(popupElevation);
        c10439no0.setShapeAppearanceModel(lz0);
        C10311mo0 c10311mo0 = c10439no0.f38516a;
        if (c10311mo0.f37937g == null) {
            c10311mo0.f37937g = new Rect();
        }
        c10439no0.f38516a.f37937g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c10439no0.invalidateSelf();
        return c10439no0;
    }

    /* renamed from: g */
    public final int m11260g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f18304d.getCompoundPaddingLeft() : this.f18302c.m700c() : this.f18300b.m25101a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f18304d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m11256c() + getPaddingTop() + editText.getBaseline();
    }

    public C10439no0 getBoxBackground() {
        int i = this.f18289O;
        if (i == 1 || i == 2) {
            return this.f18272F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f18295U;
    }

    public int getBoxBackgroundMode() {
        return this.f18289O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f18290P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM7146b = S02.m7146b(this);
        RectF rectF = this.f18299a0;
        return zM7146b ? this.f18284L.f6721h.mo22818a(rectF) : this.f18284L.f6720g.mo22818a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM7146b = S02.m7146b(this);
        RectF rectF = this.f18299a0;
        return zM7146b ? this.f18284L.f6720g.mo22818a(rectF) : this.f18284L.f6721h.mo22818a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM7146b = S02.m7146b(this);
        RectF rectF = this.f18299a0;
        return zM7146b ? this.f18284L.f6718e.mo22818a(rectF) : this.f18284L.f6719f.mo22818a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM7146b = S02.m7146b(this);
        RectF rectF = this.f18299a0;
        return zM7146b ? this.f18284L.f6719f.mo22818a(rectF) : this.f18284L.f6718e.mo22818a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f18334x1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f18336y1;
    }

    public int getBoxStrokeWidth() {
        return this.f18292R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f18293S;
    }

    public int getCounterMaxLength() {
        return this.f18314l;
    }

    public CharSequence getCounterOverflowDescription() {
        C6803s7 c6803s7;
        if (this.f18313k && this.f18315m && (c6803s7 = this.f18317o) != null) {
            return c6803s7.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f18337z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f18335y;
    }

    public ColorStateList getCursorColor() {
        return this.f18262A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f18264B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f18326t1;
    }

    public EditText getEditText() {
        return this.f18304d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f18302c.f782g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f18302c.f782g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f18302c.f788m;
    }

    public int getEndIconMode() {
        return this.f18302c.f784i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f18302c.f789n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f18302c.f782g;
    }

    public CharSequence getError() {
        C10227m80 c10227m80 = this.f18312j;
        if (c10227m80.f37514q) {
            return c10227m80.f37513p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f18312j.f37517t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f18312j.f37516s;
    }

    public int getErrorCurrentTextColors() {
        C6803s7 c6803s7 = this.f18312j.f37515r;
        if (c6803s7 != null) {
            return c6803s7.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f18302c.f778c.getDrawable();
    }

    public CharSequence getHelperText() {
        C10227m80 c10227m80 = this.f18312j;
        if (c10227m80.f37521x) {
            return c10227m80.f37520w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C6803s7 c6803s7 = this.f18312j.f37522y;
        if (c6803s7 != null) {
            return c6803s7.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f18266C) {
            return this.f18268D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f18275G1.m24800d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C6852su c6852su = this.f18275G1;
        return c6852su.m24801e(c6852su.f42697k);
    }

    public ColorStateList getHintTextColor() {
        return this.f18328u1;
    }

    public InterfaceC11382v91 getLengthCounter() {
        return this.f18316n;
    }

    public int getMaxEms() {
        return this.f18309g;
    }

    public int getMaxWidth() {
        return this.f18311i;
    }

    public int getMinEms() {
        return this.f18308f;
    }

    public int getMinWidth() {
        return this.f18310h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f18302c.f782g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f18302c.f782g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f18323s) {
            return this.f18321r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f18329v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f18327u;
    }

    public CharSequence getPrefixText() {
        return this.f18300b.f43487c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f18300b.f43486b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f18300b.f43486b;
    }

    public LZ0 getShapeAppearanceModel() {
        return this.f18284L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f18300b.f43488d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f18300b.f43488d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f18300b.f43491g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f18300b.f43492h;
    }

    public CharSequence getSuffixText() {
        return this.f18302c.f791p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f18302c.f792q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f18302c.f792q;
    }

    public Typeface getTypeface() {
        return this.f18301b0;
    }

    /* renamed from: h */
    public final int m11261h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f18304d.getCompoundPaddingRight() : this.f18300b.m25101a() : this.f18302c.m700c());
    }

    /* renamed from: i */
    public final void m11262i() throws Resources.NotFoundException {
        int i = this.f18289O;
        if (i == 0) {
            this.f18272F = null;
            this.f18280J = null;
            this.f18282K = null;
        } else if (i == 1) {
            this.f18272F = new C10439no0(this.f18284L);
            this.f18280J = new C10439no0();
            this.f18282K = new C10439no0();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC1374Vq.m8591j(new StringBuilder(), this.f18289O, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f18266C || (this.f18272F instanceof C4038fC)) {
                this.f18272F = new C10439no0(this.f18284L);
            } else {
                LZ0 lz0 = this.f18284L;
                int i2 = C4038fC.f27107z;
                if (lz0 == null) {
                    lz0 = new LZ0();
                }
                C3975eC c3975eC = new C3975eC(lz0, new RectF());
                C4038fC c4038fC = new C4038fC(c3975eC);
                c4038fC.f27108y = c3975eC;
                this.f18272F = c4038fC;
            }
            this.f18280J = null;
            this.f18282K = null;
        }
        m11271s();
        m11276x();
        if (this.f18289O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f18290P = getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC8259Se1.m7409h(getContext())) {
                this.f18290P = getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f18304d != null && this.f18289O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f18304d;
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f18304d.getPaddingEnd(), getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC8259Se1.m7409h(getContext())) {
                EditText editText2 = this.f18304d;
                WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f18304d.getPaddingEnd(), getResources().getDimensionPixelSize(ru.mes.dnevnik.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f18289O != 0) {
            m11272t();
        }
        EditText editText3 = this.f18304d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f18289O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x008d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11263j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m11263j():void");
    }

    /* renamed from: l */
    public final void m11264l(C6803s7 c6803s7, int i) {
        try {
            c6803s7.setTextAppearance(i);
            if (c6803s7.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c6803s7.setTextAppearance(ru.mes.dnevnik.R.style.TextAppearance_AppCompat_Caption);
        c6803s7.setTextColor(AbstractC0691Ky.m4783a(getContext(), ru.mes.dnevnik.R.color.design_error));
    }

    /* renamed from: m */
    public final boolean m11265m() {
        C10227m80 c10227m80 = this.f18312j;
        return (c10227m80.f37512o != 1 || c10227m80.f37515r == null || TextUtils.isEmpty(c10227m80.f37513p)) ? false : true;
    }

    /* renamed from: n */
    public final void m11266n(Editable editable) throws Resources.NotFoundException {
        ((C7754Im0) this.f18316n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f18315m;
        int i = this.f18314l;
        String string = null;
        if (i == -1) {
            this.f18317o.setText(String.valueOf(length));
            this.f18317o.setContentDescription(null);
            this.f18315m = false;
        } else {
            this.f18315m = length > i;
            Context context = getContext();
            this.f18317o.setContentDescription(context.getString(this.f18315m ? ru.mes.dnevnik.R.string.character_counter_overflowed_content_description : ru.mes.dnevnik.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f18314l)));
            if (z != this.f18315m) {
                m11267o();
            }
            String str = C4006eh.f26805b;
            C4006eh c4006eh = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C4006eh.f26808e : C4006eh.f26807d;
            C6803s7 c6803s7 = this.f18317o;
            String string2 = getContext().getString(ru.mes.dnevnik.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f18314l));
            if (string2 == null) {
                c4006eh.getClass();
            } else {
                c4006eh.getClass();
                C0926Oi c0926Oi = AbstractC10102l91.f36924a;
                string = c4006eh.m18020c(string2).toString();
            }
            c6803s7.setText(string);
        }
        if (this.f18304d == null || z == this.f18315m) {
            return;
        }
        m11273u(false, false);
        m11276x();
        m11270r();
    }

    /* renamed from: o */
    public final void m11267o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C6803s7 c6803s7 = this.f18317o;
        if (c6803s7 != null) {
            m11264l(c6803s7, this.f18315m ? this.f18318p : this.f18319q);
            if (!this.f18315m && (colorStateList2 = this.f18335y) != null) {
                this.f18317o.setTextColor(colorStateList2);
            }
            if (!this.f18315m || (colorStateList = this.f18337z) == null) {
                return;
            }
            this.f18317o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18275G1.m24802g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0088BO c0088bo = this.f18302c;
        c0088bo.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f18287M1 = false;
        if (this.f18304d != null && this.f18304d.getMeasuredHeight() < (iMax = Math.max(c0088bo.getMeasuredHeight(), this.f18300b.getMeasuredHeight()))) {
            this.f18304d.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM11269q = m11269q();
        if (z || zM11269q) {
            this.f18304d.post(new N61(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f18304d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC1655aI.f15457a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f18296V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC1655aI.f15457a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC1655aI.m9699a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC1655aI.f15458b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C10439no0 c10439no0 = this.f18280J;
            if (c10439no0 != null) {
                int i5 = rect.bottom;
                c10439no0.setBounds(rect.left, i5 - this.f18292R, rect.right, i5);
            }
            C10439no0 c10439no02 = this.f18282K;
            if (c10439no02 != null) {
                int i6 = rect.bottom;
                c10439no02.setBounds(rect.left, i6 - this.f18293S, rect.right, i6);
            }
            if (this.f18266C) {
                float textSize = this.f18304d.getTextSize();
                C6852su c6852su = this.f18275G1;
                if (c6852su.f42694h != textSize) {
                    c6852su.f42694h = textSize;
                    c6852su.m24803h(false);
                }
                int gravity = this.f18304d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c6852su.f42693g != i7) {
                    c6852su.f42693g = i7;
                    c6852su.m24803h(false);
                }
                if (c6852su.f42691f != gravity) {
                    c6852su.f42691f = gravity;
                    c6852su.m24803h(false);
                }
                if (this.f18304d == null) {
                    throw new IllegalStateException();
                }
                boolean zM7146b = S02.m7146b(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f18297W;
                rect2.bottom = i8;
                int i9 = this.f18289O;
                if (i9 == 1) {
                    rect2.left = m11260g(rect.left, zM7146b);
                    rect2.top = rect.top + this.f18290P;
                    rect2.right = m11261h(rect.right, zM7146b);
                } else if (i9 != 2) {
                    rect2.left = m11260g(rect.left, zM7146b);
                    rect2.top = getPaddingTop();
                    rect2.right = m11261h(rect.right, zM7146b);
                } else {
                    rect2.left = this.f18304d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m11256c();
                    rect2.right = rect.right - this.f18304d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c6852su.f42687d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c6852su.f42667M = true;
                }
                if (this.f18304d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c6852su.f42669O;
                textPaint.setTextSize(c6852su.f42694h);
                textPaint.setTypeface(c6852su.f42707u);
                textPaint.setLetterSpacing(c6852su.f42677W);
                float f = -textPaint.ascent();
                rect2.left = this.f18304d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f18289O != 1 || this.f18304d.getMinLines() > 1) ? rect.top + this.f18304d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f18304d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f18289O != 1 || this.f18304d.getMinLines() > 1) ? rect.bottom - this.f18304d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c6852su.f42685c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c6852su.f42667M = true;
                }
                c6852su.m24803h(false);
                if (!m11258e() || this.f18273F1) {
                    return;
                }
                m11263j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f18287M1;
        C0088BO c0088bo = this.f18302c;
        if (!z) {
            c0088bo.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f18287M1 = true;
        }
        if (this.f18325t != null && (editText = this.f18304d) != null) {
            this.f18325t.setGravity(editText.getGravity());
            this.f18325t.setPadding(this.f18304d.getCompoundPaddingLeft(), this.f18304d.getCompoundPaddingTop(), this.f18304d.getCompoundPaddingRight(), this.f18304d.getCompoundPaddingBottom());
        }
        c0088bo.m710m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C11509w91)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C11509w91 c11509w91 = (C11509w91) parcelable;
        super.onRestoreInstanceState(c11509w91.f44064a);
        setError(c11509w91.f44701c);
        if (c11509w91.f44702d) {
            post(new RunnableC10431nk0(9, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f18286M) {
            InterfaceC7235yz interfaceC7235yz = this.f18284L.f6718e;
            RectF rectF = this.f18299a0;
            float fMo22818a = interfaceC7235yz.mo22818a(rectF);
            float fMo22818a2 = this.f18284L.f6719f.mo22818a(rectF);
            float fMo22818a3 = this.f18284L.f6721h.mo22818a(rectF);
            float fMo22818a4 = this.f18284L.f6720g.mo22818a(rectF);
            LZ0 lz0 = this.f18284L;
            AbstractC10784qU1 abstractC10784qU1 = lz0.f6714a;
            AbstractC10784qU1 abstractC10784qU12 = lz0.f6715b;
            AbstractC10784qU1 abstractC10784qU13 = lz0.f6717d;
            AbstractC10784qU1 abstractC10784qU14 = lz0.f6716c;
            C4049fN c4049fN = new C4049fN(0);
            C4049fN c4049fN2 = new C4049fN(0);
            C4049fN c4049fN3 = new C4049fN(0);
            C4049fN c4049fN4 = new C4049fN(0);
            C8435Vo1.m8558d(abstractC10784qU12);
            C8435Vo1.m8558d(abstractC10784qU1);
            C8435Vo1.m8558d(abstractC10784qU14);
            C8435Vo1.m8558d(abstractC10784qU13);
            C7110x c7110x = new C7110x(fMo22818a2);
            C7110x c7110x2 = new C7110x(fMo22818a);
            C7110x c7110x3 = new C7110x(fMo22818a4);
            C7110x c7110x4 = new C7110x(fMo22818a3);
            LZ0 lz02 = new LZ0();
            lz02.f6714a = abstractC10784qU12;
            lz02.f6715b = abstractC10784qU1;
            lz02.f6716c = abstractC10784qU13;
            lz02.f6717d = abstractC10784qU14;
            lz02.f6718e = c7110x;
            lz02.f6719f = c7110x2;
            lz02.f6720g = c7110x4;
            lz02.f6721h = c7110x3;
            lz02.f6722i = c4049fN;
            lz02.f6723j = c4049fN2;
            lz02.f6724k = c4049fN3;
            lz02.f6725l = c4049fN4;
            this.f18286M = z;
            setShapeAppearanceModel(lz02);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C11509w91 c11509w91 = new C11509w91(super.onSaveInstanceState());
        if (m11265m()) {
            c11509w91.f44701c = getError();
        }
        C0088BO c0088bo = this.f18302c;
        c11509w91.f44702d = c0088bo.f784i != 0 && c0088bo.f782g.f18216d;
        return c11509w91;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11268p() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f18262A
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968819(0x7f0400f3, float:1.7546302E38)
            android.util.TypedValue r1 = p000.AbstractC9900ja1.m22072a(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = p000.AbstractC3982eJ.m17900b(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f18304d
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = p000.AbstractC10998s91.m24630g(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f18304d
            android.graphics.drawable.Drawable r1 = p000.AbstractC10998s91.m24630g(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m11265m()
            if (r2 != 0) goto L49
            s7 r2 = r4.f18317o
            if (r2 == 0) goto L4e
            boolean r2 = r4.f18315m
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.f18264B
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            p000.AbstractC4173hL.m18806h(r1, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m11268p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x005f  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11269q() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m11269q():boolean");
    }

    /* renamed from: r */
    public final void m11270r() {
        Drawable background;
        C6803s7 c6803s7;
        EditText editText = this.f18304d;
        if (editText == null || this.f18289O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC6737rL.f41601a;
        Drawable drawableMutate = background.mutate();
        if (m11265m()) {
            drawableMutate.setColorFilter(C0574J6.m4155c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f18315m && (c6803s7 = this.f18317o) != null) {
            drawableMutate.setColorFilter(C0574J6.m4155c(c6803s7.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f18304d.refreshDrawableState();
        }
    }

    /* renamed from: s */
    public final void m11271s() {
        EditText editText = this.f18304d;
        if (editText == null || this.f18272F == null) {
            return;
        }
        if ((this.f18278I || editText.getBackground() == null) && this.f18289O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f18304d;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            editText2.setBackground(editTextBoxBackground);
            this.f18278I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f18295U != i) {
            this.f18295U = i;
            this.f18338z1 = i;
            this.f18265B1 = i;
            this.f18267C1 = i;
            m11255b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC0691Ky.m4783a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f18338z1 = defaultColor;
        this.f18295U = defaultColor;
        this.f18263A1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f18265B1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f18267C1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m11255b();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.f18289O) {
            return;
        }
        this.f18289O = i;
        if (this.f18304d != null) {
            m11262i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f18290P = i;
    }

    public void setBoxCornerFamily(int i) {
        C8435Vo1 c8435Vo1M5027e = this.f18284L.m5027e();
        InterfaceC7235yz interfaceC7235yz = this.f18284L.f6718e;
        AbstractC10784qU1 abstractC10784qU1M9385a = AbstractC8593Yp1.m9385a(i);
        c8435Vo1M5027e.f12763a = abstractC10784qU1M9385a;
        C8435Vo1.m8558d(abstractC10784qU1M9385a);
        c8435Vo1M5027e.f12767e = interfaceC7235yz;
        InterfaceC7235yz interfaceC7235yz2 = this.f18284L.f6719f;
        AbstractC10784qU1 abstractC10784qU1M9385a2 = AbstractC8593Yp1.m9385a(i);
        c8435Vo1M5027e.f12764b = abstractC10784qU1M9385a2;
        C8435Vo1.m8558d(abstractC10784qU1M9385a2);
        c8435Vo1M5027e.f12768f = interfaceC7235yz2;
        InterfaceC7235yz interfaceC7235yz3 = this.f18284L.f6721h;
        AbstractC10784qU1 abstractC10784qU1M9385a3 = AbstractC8593Yp1.m9385a(i);
        c8435Vo1M5027e.f12766d = abstractC10784qU1M9385a3;
        C8435Vo1.m8558d(abstractC10784qU1M9385a3);
        c8435Vo1M5027e.f12770h = interfaceC7235yz3;
        InterfaceC7235yz interfaceC7235yz4 = this.f18284L.f6720g;
        AbstractC10784qU1 abstractC10784qU1M9385a4 = AbstractC8593Yp1.m9385a(i);
        c8435Vo1M5027e.f12765c = abstractC10784qU1M9385a4;
        C8435Vo1.m8558d(abstractC10784qU1M9385a4);
        c8435Vo1M5027e.f12769g = interfaceC7235yz4;
        this.f18284L = c8435Vo1M5027e.m8561c();
        m11255b();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.f18334x1 != i) {
            this.f18334x1 = i;
            m11276x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.f18330v1 = colorStateList.getDefaultColor();
            this.f18269D1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f18332w1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f18334x1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f18334x1 != colorStateList.getDefaultColor()) {
            this.f18334x1 = colorStateList.getDefaultColor();
        }
        m11276x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f18336y1 != colorStateList) {
            this.f18336y1 = colorStateList;
            m11276x();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.f18292R = i;
        m11276x();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.f18293S = i;
        m11276x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) throws Resources.NotFoundException {
        if (this.f18313k != z) {
            C10227m80 c10227m80 = this.f18312j;
            if (z) {
                C6803s7 c6803s7 = new C6803s7(getContext(), null);
                this.f18317o = c6803s7;
                c6803s7.setId(ru.mes.dnevnik.R.id.textinput_counter);
                Typeface typeface = this.f18301b0;
                if (typeface != null) {
                    this.f18317o.setTypeface(typeface);
                }
                this.f18317o.setMaxLines(1);
                c10227m80.m22683a(this.f18317o, 2);
                ((ViewGroup.MarginLayoutParams) this.f18317o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(ru.mes.dnevnik.R.dimen.mtrl_textinput_counter_margin_start));
                m11267o();
                if (this.f18317o != null) {
                    EditText editText = this.f18304d;
                    m11266n(editText != null ? editText.getText() : null);
                }
            } else {
                c10227m80.m22689g(this.f18317o, 2);
                this.f18317o = null;
            }
            this.f18313k = z;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.f18314l != i) {
            if (i > 0) {
                this.f18314l = i;
            } else {
                this.f18314l = -1;
            }
            if (!this.f18313k || this.f18317o == null) {
                return;
            }
            EditText editText = this.f18304d;
            m11266n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f18318p != i) {
            this.f18318p = i;
            m11267o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f18337z != colorStateList) {
            this.f18337z = colorStateList;
            m11267o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f18319q != i) {
            this.f18319q = i;
            m11267o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f18335y != colorStateList) {
            this.f18335y = colorStateList;
            m11267o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f18262A != colorStateList) {
            this.f18262A = colorStateList;
            m11268p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f18264B != colorStateList) {
            this.f18264B = colorStateList;
            if (m11265m() || (this.f18317o != null && this.f18315m)) {
                m11268p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f18326t1 = colorStateList;
        this.f18328u1 = colorStateList;
        if (this.f18304d != null) {
            m11273u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m11253k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f18302c.f782g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f18302c.f782g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C0088BO c0088bo = this.f18302c;
        CharSequence text = i != 0 ? c0088bo.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0088bo.f782g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0088BO c0088bo = this.f18302c;
        Drawable drawableM26394b = i != 0 ? AbstractC11918zN1.m26394b(c0088bo.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c0088bo.f782g;
        checkableImageButton.setImageDrawable(drawableM26394b);
        if (drawableM26394b != null) {
            ColorStateList colorStateList = c0088bo.f786k;
            PorterDuff.Mode mode = c0088bo.f787l;
            TextInputLayout textInputLayout = c0088bo.f776a;
            T12.m7520a(textInputLayout, checkableImageButton, colorStateList, mode);
            T12.m7522c(textInputLayout, checkableImageButton, c0088bo.f786k);
        }
    }

    public void setEndIconMinSize(int i) {
        C0088BO c0088bo = this.f18302c;
        if (i < 0) {
            c0088bo.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0088bo.f788m) {
            c0088bo.f788m = i;
            CheckableImageButton checkableImageButton = c0088bo.f782g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0088bo.f778c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f18302c.m704g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0088BO c0088bo = this.f18302c;
        View.OnLongClickListener onLongClickListener = c0088bo.f790o;
        CheckableImageButton checkableImageButton = c0088bo.f782g;
        checkableImageButton.setOnClickListener(onClickListener);
        T12.m7523d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.f790o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0088bo.f782g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        T12.m7523d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.f789n = scaleType;
        c0088bo.f782g.setScaleType(scaleType);
        c0088bo.f778c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0088BO c0088bo = this.f18302c;
        if (c0088bo.f786k != colorStateList) {
            c0088bo.f786k = colorStateList;
            T12.m7520a(c0088bo.f776a, c0088bo.f782g, colorStateList, c0088bo.f787l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0088BO c0088bo = this.f18302c;
        if (c0088bo.f787l != mode) {
            c0088bo.f787l = mode;
            T12.m7520a(c0088bo.f776a, c0088bo.f782g, c0088bo.f786k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f18302c.m705h(z);
    }

    public void setError(CharSequence charSequence) {
        C10227m80 c10227m80 = this.f18312j;
        if (!c10227m80.f37514q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c10227m80.m22688f();
            return;
        }
        c10227m80.m22685c();
        c10227m80.f37513p = charSequence;
        c10227m80.f37515r.setText(charSequence);
        int i = c10227m80.f37511n;
        if (i != 1) {
            c10227m80.f37512o = 1;
        }
        c10227m80.m22691i(i, c10227m80.f37512o, c10227m80.m22690h(c10227m80.f37515r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C10227m80 c10227m80 = this.f18312j;
        c10227m80.f37517t = i;
        C6803s7 c6803s7 = c10227m80.f37515r;
        if (c6803s7 != null) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            c6803s7.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C10227m80 c10227m80 = this.f18312j;
        c10227m80.f37516s = charSequence;
        C6803s7 c6803s7 = c10227m80.f37515r;
        if (c6803s7 != null) {
            c6803s7.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) throws Resources.NotFoundException {
        C10227m80 c10227m80 = this.f18312j;
        if (c10227m80.f37514q == z) {
            return;
        }
        c10227m80.m22685c();
        TextInputLayout textInputLayout = c10227m80.f37505h;
        if (z) {
            C6803s7 c6803s7 = new C6803s7(c10227m80.f37504g, null);
            c10227m80.f37515r = c6803s7;
            c6803s7.setId(ru.mes.dnevnik.R.id.textinput_error);
            c10227m80.f37515r.setTextAlignment(5);
            Typeface typeface = c10227m80.f37497B;
            if (typeface != null) {
                c10227m80.f37515r.setTypeface(typeface);
            }
            int i = c10227m80.f37518u;
            c10227m80.f37518u = i;
            C6803s7 c6803s72 = c10227m80.f37515r;
            if (c6803s72 != null) {
                textInputLayout.m11264l(c6803s72, i);
            }
            ColorStateList colorStateList = c10227m80.f37519v;
            c10227m80.f37519v = colorStateList;
            C6803s7 c6803s73 = c10227m80.f37515r;
            if (c6803s73 != null && colorStateList != null) {
                c6803s73.setTextColor(colorStateList);
            }
            CharSequence charSequence = c10227m80.f37516s;
            c10227m80.f37516s = charSequence;
            C6803s7 c6803s74 = c10227m80.f37515r;
            if (c6803s74 != null) {
                c6803s74.setContentDescription(charSequence);
            }
            int i2 = c10227m80.f37517t;
            c10227m80.f37517t = i2;
            C6803s7 c6803s75 = c10227m80.f37515r;
            if (c6803s75 != null) {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                c6803s75.setAccessibilityLiveRegion(i2);
            }
            c10227m80.f37515r.setVisibility(4);
            c10227m80.m22683a(c10227m80.f37515r, 0);
        } else {
            c10227m80.m22688f();
            c10227m80.m22689g(c10227m80.f37515r, 0);
            c10227m80.f37515r = null;
            textInputLayout.m11270r();
            textInputLayout.m11276x();
        }
        c10227m80.f37514q = z;
    }

    public void setErrorIconDrawable(int i) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.m706i(i != 0 ? AbstractC11918zN1.m26394b(c0088bo.getContext(), i) : null);
        T12.m7522c(c0088bo.f776a, c0088bo.f778c, c0088bo.f779d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0088BO c0088bo = this.f18302c;
        CheckableImageButton checkableImageButton = c0088bo.f778c;
        View.OnLongClickListener onLongClickListener = c0088bo.f781f;
        checkableImageButton.setOnClickListener(onClickListener);
        T12.m7523d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.f781f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0088bo.f778c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        T12.m7523d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0088BO c0088bo = this.f18302c;
        if (c0088bo.f779d != colorStateList) {
            c0088bo.f779d = colorStateList;
            T12.m7520a(c0088bo.f776a, c0088bo.f778c, colorStateList, c0088bo.f780e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0088BO c0088bo = this.f18302c;
        if (c0088bo.f780e != mode) {
            c0088bo.f780e = mode;
            T12.m7520a(c0088bo.f776a, c0088bo.f778c, c0088bo.f779d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C10227m80 c10227m80 = this.f18312j;
        c10227m80.f37518u = i;
        C6803s7 c6803s7 = c10227m80.f37515r;
        if (c6803s7 != null) {
            c10227m80.f37505h.m11264l(c6803s7, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C10227m80 c10227m80 = this.f18312j;
        c10227m80.f37519v = colorStateList;
        C6803s7 c6803s7 = c10227m80.f37515r;
        if (c6803s7 == null || colorStateList == null) {
            return;
        }
        c6803s7.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f18277H1 != z) {
            this.f18277H1 = z;
            m11273u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C10227m80 c10227m80 = this.f18312j;
        if (zIsEmpty) {
            if (c10227m80.f37521x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c10227m80.f37521x) {
            setHelperTextEnabled(true);
        }
        c10227m80.m22685c();
        c10227m80.f37520w = charSequence;
        c10227m80.f37522y.setText(charSequence);
        int i = c10227m80.f37511n;
        if (i != 2) {
            c10227m80.f37512o = 2;
        }
        c10227m80.m22691i(i, c10227m80.f37512o, c10227m80.m22690h(c10227m80.f37522y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C10227m80 c10227m80 = this.f18312j;
        c10227m80.f37496A = colorStateList;
        C6803s7 c6803s7 = c10227m80.f37522y;
        if (c6803s7 == null || colorStateList == null) {
            return;
        }
        c6803s7.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) throws Resources.NotFoundException {
        C10227m80 c10227m80 = this.f18312j;
        if (c10227m80.f37521x == z) {
            return;
        }
        c10227m80.m22685c();
        if (z) {
            C6803s7 c6803s7 = new C6803s7(c10227m80.f37504g, null);
            c10227m80.f37522y = c6803s7;
            c6803s7.setId(ru.mes.dnevnik.R.id.textinput_helper_text);
            c10227m80.f37522y.setTextAlignment(5);
            Typeface typeface = c10227m80.f37497B;
            if (typeface != null) {
                c10227m80.f37522y.setTypeface(typeface);
            }
            c10227m80.f37522y.setVisibility(4);
            c10227m80.f37522y.setAccessibilityLiveRegion(1);
            int i = c10227m80.f37523z;
            c10227m80.f37523z = i;
            C6803s7 c6803s72 = c10227m80.f37522y;
            if (c6803s72 != null) {
                c6803s72.setTextAppearance(i);
            }
            ColorStateList colorStateList = c10227m80.f37496A;
            c10227m80.f37496A = colorStateList;
            C6803s7 c6803s73 = c10227m80.f37522y;
            if (c6803s73 != null && colorStateList != null) {
                c6803s73.setTextColor(colorStateList);
            }
            c10227m80.m22683a(c10227m80.f37522y, 1);
            c10227m80.f37522y.setAccessibilityDelegate(new C10099l80(c10227m80));
        } else {
            c10227m80.m22685c();
            int i2 = c10227m80.f37511n;
            if (i2 == 2) {
                c10227m80.f37512o = 0;
            }
            c10227m80.m22691i(i2, c10227m80.f37512o, c10227m80.m22690h(c10227m80.f37522y, ""));
            c10227m80.m22689g(c10227m80.f37522y, 1);
            c10227m80.f37522y = null;
            TextInputLayout textInputLayout = c10227m80.f37505h;
            textInputLayout.m11270r();
            textInputLayout.m11276x();
        }
        c10227m80.f37521x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C10227m80 c10227m80 = this.f18312j;
        c10227m80.f37523z = i;
        C6803s7 c6803s7 = c10227m80.f37522y;
        if (c6803s7 != null) {
            c6803s7.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f18266C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f18279I1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f18266C) {
            this.f18266C = z;
            if (z) {
                CharSequence hint = this.f18304d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f18268D)) {
                        setHint(hint);
                    }
                    this.f18304d.setHint((CharSequence) null);
                }
                this.f18270E = true;
            } else {
                this.f18270E = false;
                if (!TextUtils.isEmpty(this.f18268D) && TextUtils.isEmpty(this.f18304d.getHint())) {
                    this.f18304d.setHint(this.f18268D);
                }
                setHintInternal(null);
            }
            if (this.f18304d != null) {
                m11272t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C6852su c6852su = this.f18275G1;
        TextInputLayout textInputLayout = c6852su.f42681a;
        C9590h91 c9590h91 = new C9590h91(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c9590h91.f28284j;
        if (colorStateList != null) {
            c6852su.f42697k = colorStateList;
        }
        float f = c9590h91.f28285k;
        if (f != 0.0f) {
            c6852su.f42695i = f;
        }
        ColorStateList colorStateList2 = c9590h91.f28275a;
        if (colorStateList2 != null) {
            c6852su.f42675U = colorStateList2;
        }
        c6852su.f42673S = c9590h91.f28279e;
        c6852su.f42674T = c9590h91.f28280f;
        c6852su.f42672R = c9590h91.f28281g;
        c6852su.f42676V = c9590h91.f28283i;
        C0367Fp c0367Fp = c6852su.f42711y;
        if (c0367Fp != null) {
            c0367Fp.f3429c = true;
        }
        QQ0 qq0 = new QQ0(c6852su);
        c9590h91.m18728a();
        c6852su.f42711y = new C0367Fp(qq0, c9590h91.f28288n);
        c9590h91.m18730c(textInputLayout.getContext(), c6852su.f42711y);
        c6852su.m24803h(false);
        this.f18328u1 = c6852su.f42697k;
        if (this.f18304d != null) {
            m11273u(false, false);
            m11272t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f18328u1 != colorStateList) {
            if (this.f18326t1 == null) {
                C6852su c6852su = this.f18275G1;
                if (c6852su.f42697k != colorStateList) {
                    c6852su.f42697k = colorStateList;
                    c6852su.m24803h(false);
                }
            }
            this.f18328u1 = colorStateList;
            if (this.f18304d != null) {
                m11273u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC11382v91 interfaceC11382v91) {
        this.f18316n = interfaceC11382v91;
    }

    public void setMaxEms(int i) {
        this.f18309g = i;
        EditText editText = this.f18304d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f18311i = i;
        EditText editText = this.f18304d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f18308f = i;
        EditText editText = this.f18304d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f18310h = i;
        EditText editText = this.f18304d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.f782g.setContentDescription(i != 0 ? c0088bo.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.f782g.setImageDrawable(i != 0 ? AbstractC11918zN1.m26394b(c0088bo.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C0088BO c0088bo = this.f18302c;
        if (z && c0088bo.f784i != 1) {
            c0088bo.m704g(1);
        } else if (z) {
            c0088bo.getClass();
        } else {
            c0088bo.m704g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.f786k = colorStateList;
        T12.m7520a(c0088bo.f776a, c0088bo.f782g, colorStateList, c0088bo.f787l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.f787l = mode;
        T12.m7520a(c0088bo.f776a, c0088bo.f782g, c0088bo.f786k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f18325t == null) {
            C6803s7 c6803s7 = new C6803s7(getContext(), null);
            this.f18325t = c6803s7;
            c6803s7.setId(ru.mes.dnevnik.R.id.textinput_placeholder);
            this.f18325t.setImportantForAccessibility(2);
            C6490nS c6490nSM11257d = m11257d();
            this.f18331w = c6490nSM11257d;
            c6490nSM11257d.f3337b = 67L;
            this.f18333x = m11257d();
            setPlaceholderTextAppearance(this.f18329v);
            setPlaceholderTextColor(this.f18327u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f18323s) {
                setPlaceholderTextEnabled(true);
            }
            this.f18321r = charSequence;
        }
        EditText editText = this.f18304d;
        m11274v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f18329v = i;
        C6803s7 c6803s7 = this.f18325t;
        if (c6803s7 != null) {
            c6803s7.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f18327u != colorStateList) {
            this.f18327u = colorStateList;
            C6803s7 c6803s7 = this.f18325t;
            if (c6803s7 == null || colorStateList == null) {
                return;
            }
            c6803s7.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C11244u41 c11244u41 = this.f18300b;
        c11244u41.getClass();
        c11244u41.f43487c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c11244u41.f43486b.setText(charSequence);
        c11244u41.m25105e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f18300b.f43486b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f18300b.f43486b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(LZ0 lz0) {
        C10439no0 c10439no0 = this.f18272F;
        if (c10439no0 == null || c10439no0.f38516a.f37931a == lz0) {
            return;
        }
        this.f18284L = lz0;
        m11255b();
    }

    public void setStartIconCheckable(boolean z) {
        this.f18300b.f43488d.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f18300b.f43488d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC11918zN1.m26394b(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C11244u41 c11244u41 = this.f18300b;
        if (i < 0) {
            c11244u41.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c11244u41.f43491g) {
            c11244u41.f43491g = i;
            CheckableImageButton checkableImageButton = c11244u41.f43488d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C11244u41 c11244u41 = this.f18300b;
        View.OnLongClickListener onLongClickListener = c11244u41.f43493i;
        CheckableImageButton checkableImageButton = c11244u41.f43488d;
        checkableImageButton.setOnClickListener(onClickListener);
        T12.m7523d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C11244u41 c11244u41 = this.f18300b;
        c11244u41.f43493i = onLongClickListener;
        CheckableImageButton checkableImageButton = c11244u41.f43488d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        T12.m7523d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C11244u41 c11244u41 = this.f18300b;
        c11244u41.f43492h = scaleType;
        c11244u41.f43488d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C11244u41 c11244u41 = this.f18300b;
        if (c11244u41.f43489e != colorStateList) {
            c11244u41.f43489e = colorStateList;
            T12.m7520a(c11244u41.f43485a, c11244u41.f43488d, colorStateList, c11244u41.f43490f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C11244u41 c11244u41 = this.f18300b;
        if (c11244u41.f43490f != mode) {
            c11244u41.f43490f = mode;
            T12.m7520a(c11244u41.f43485a, c11244u41.f43488d, c11244u41.f43489e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f18300b.m25103c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0088BO c0088bo = this.f18302c;
        c0088bo.getClass();
        c0088bo.f791p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0088bo.f792q.setText(charSequence);
        c0088bo.m711n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f18302c.f792q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f18302c.f792q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C11254u91 c11254u91) {
        EditText editText = this.f18304d;
        if (editText != null) {
            AbstractC10944rk1.m24482n(editText, c11254u91);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f18301b0) {
            this.f18301b0 = typeface;
            this.f18275G1.m24808m(typeface);
            C10227m80 c10227m80 = this.f18312j;
            if (typeface != c10227m80.f37497B) {
                c10227m80.f37497B = typeface;
                C6803s7 c6803s7 = c10227m80.f37515r;
                if (c6803s7 != null) {
                    c6803s7.setTypeface(typeface);
                }
                C6803s7 c6803s72 = c10227m80.f37522y;
                if (c6803s72 != null) {
                    c6803s72.setTypeface(typeface);
                }
            }
            C6803s7 c6803s73 = this.f18317o;
            if (c6803s73 != null) {
                c6803s73.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m11272t() {
        if (this.f18289O != 1) {
            FrameLayout frameLayout = this.f18298a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM11256c = m11256c();
            if (iM11256c != layoutParams.topMargin) {
                layoutParams.topMargin = iM11256c;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: u */
    public final void m11273u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C6803s7 c6803s7;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f18304d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f18304d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f18326t1;
        C6852su c6852su = this.f18275G1;
        if (colorStateList2 != null) {
            c6852su.m24804i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f18326t1;
            c6852su.m24804i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f18269D1) : this.f18269D1));
        } else if (m11265m()) {
            C6803s7 c6803s72 = this.f18312j.f37515r;
            c6852su.m24804i(c6803s72 != null ? c6803s72.getTextColors() : null);
        } else if (this.f18315m && (c6803s7 = this.f18317o) != null) {
            c6852su.m24804i(c6803s7.getTextColors());
        } else if (z4 && (colorStateList = this.f18328u1) != null && c6852su.f42697k != colorStateList) {
            c6852su.f42697k = colorStateList;
            c6852su.m24803h(false);
        }
        C0088BO c0088bo = this.f18302c;
        C11244u41 c11244u41 = this.f18300b;
        if (z3 || !this.f18277H1 || (isEnabled() && z4)) {
            if (z2 || this.f18273F1) {
                ValueAnimator valueAnimator = this.f18281J1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f18281J1.cancel();
                }
                if (z && this.f18279I1) {
                    m11254a(1.0f);
                } else {
                    c6852su.m24806k(1.0f);
                }
                this.f18273F1 = false;
                if (m11258e()) {
                    m11263j();
                }
                EditText editText3 = this.f18304d;
                m11274v(editText3 != null ? editText3.getText() : null);
                c11244u41.f43494j = false;
                c11244u41.m25105e();
                c0088bo.f793r = false;
                c0088bo.m711n();
                return;
            }
            return;
        }
        if (z2 || !this.f18273F1) {
            ValueAnimator valueAnimator2 = this.f18281J1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f18281J1.cancel();
            }
            if (z && this.f18279I1) {
                m11254a(0.0f);
            } else {
                c6852su.m24806k(0.0f);
            }
            if (m11258e() && !((C4038fC) this.f18272F).f27108y.f26589q.isEmpty() && m11258e()) {
                ((C4038fC) this.f18272F).m18195n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f18273F1 = true;
            C6803s7 c6803s73 = this.f18325t;
            if (c6803s73 != null && this.f18323s) {
                c6803s73.setText((CharSequence) null);
                AbstractC7787Jc1.m4368a(this.f18298a, this.f18333x);
                this.f18325t.setVisibility(4);
            }
            c11244u41.f43494j = true;
            c11244u41.m25105e();
            c0088bo.f793r = true;
            c0088bo.m711n();
        }
    }

    /* renamed from: v */
    public final void m11274v(Editable editable) {
        ((C7754Im0) this.f18316n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f18298a;
        if (length != 0 || this.f18273F1) {
            C6803s7 c6803s7 = this.f18325t;
            if (c6803s7 == null || !this.f18323s) {
                return;
            }
            c6803s7.setText((CharSequence) null);
            AbstractC7787Jc1.m4368a(frameLayout, this.f18333x);
            this.f18325t.setVisibility(4);
            return;
        }
        if (this.f18325t == null || !this.f18323s || TextUtils.isEmpty(this.f18321r)) {
            return;
        }
        this.f18325t.setText(this.f18321r);
        AbstractC7787Jc1.m4368a(frameLayout, this.f18331w);
        this.f18325t.setVisibility(0);
        this.f18325t.bringToFront();
        announceForAccessibility(this.f18321r);
    }

    /* renamed from: w */
    public final void m11275w(boolean z, boolean z2) {
        int defaultColor = this.f18336y1.getDefaultColor();
        int colorForState = this.f18336y1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f18336y1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f18294T = colorForState2;
        } else if (z2) {
            this.f18294T = colorForState;
        } else {
            this.f18294T = defaultColor;
        }
    }

    /* renamed from: x */
    public final void m11276x() throws Resources.NotFoundException {
        C6803s7 c6803s7;
        EditText editText;
        EditText editText2;
        if (this.f18272F == null || this.f18289O == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f18304d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f18304d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f18294T = this.f18269D1;
        } else if (m11265m()) {
            if (this.f18336y1 != null) {
                m11275w(z2, z);
            } else {
                this.f18294T = getErrorCurrentTextColors();
            }
        } else if (!this.f18315m || (c6803s7 = this.f18317o) == null) {
            if (z2) {
                this.f18294T = this.f18334x1;
            } else if (z) {
                this.f18294T = this.f18332w1;
            } else {
                this.f18294T = this.f18330v1;
            }
        } else if (this.f18336y1 != null) {
            m11275w(z2, z);
        } else {
            this.f18294T = c6803s7.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m11268p();
        }
        C0088BO c0088bo = this.f18302c;
        c0088bo.m709l();
        CheckableImageButton checkableImageButton = c0088bo.f778c;
        ColorStateList colorStateList = c0088bo.f779d;
        TextInputLayout textInputLayout = c0088bo.f776a;
        T12.m7522c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0088bo.f786k;
        CheckableImageButton checkableImageButton2 = c0088bo.f782g;
        T12.m7522c(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0088bo.m699b() instanceof C4237iM) {
            if (!textInputLayout.m11265m() || checkableImageButton2.getDrawable() == null) {
                T12.m7520a(textInputLayout, checkableImageButton2, c0088bo.f786k, c0088bo.f787l);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                AbstractC4173hL.m18805g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C11244u41 c11244u41 = this.f18300b;
        T12.m7522c(c11244u41.f43485a, c11244u41.f43488d, c11244u41.f43489e);
        if (this.f18289O == 2) {
            int i = this.f18291Q;
            if (z2 && isEnabled()) {
                this.f18291Q = this.f18293S;
            } else {
                this.f18291Q = this.f18292R;
            }
            if (this.f18291Q != i && m11258e() && !this.f18273F1) {
                if (m11258e()) {
                    ((C4038fC) this.f18272F).m18195n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m11263j();
            }
        }
        if (this.f18289O == 1) {
            if (!isEnabled()) {
                this.f18295U = this.f18263A1;
            } else if (z && !z2) {
                this.f18295U = this.f18267C1;
            } else if (z2) {
                this.f18295U = this.f18265B1;
            } else {
                this.f18295U = this.f18338z1;
            }
        }
        m11255b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f18300b.m25102b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f18302c.f782g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f18302c.f782g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f18302c.m706i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f18302c.f782g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0088BO c0088bo = this.f18302c;
        CheckableImageButton checkableImageButton = c0088bo.f782g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0088bo.f786k;
            PorterDuff.Mode mode = c0088bo.f787l;
            TextInputLayout textInputLayout = c0088bo.f776a;
            T12.m7520a(textInputLayout, checkableImageButton, colorStateList, mode);
            T12.m7522c(textInputLayout, checkableImageButton, c0088bo.f786k);
        }
    }
}
