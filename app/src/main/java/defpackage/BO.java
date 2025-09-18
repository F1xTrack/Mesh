package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class BO extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final J9 h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final C6969s7 q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public EE u;
    public final C7058sa1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BO(TextInputLayout textInputLayout, C1857Xo1 c1857Xo1) {
        CharSequence text;
        super(textInputLayout.getContext());
        int i = 1;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new C7058sa1(2, this);
        AO ao = new AO(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.g = checkableImageButtonA2;
        J9 j9 = new J9();
        j9.c = new SparseArray();
        j9.d = this;
        TypedArray typedArray = (TypedArray) c1857Xo1.c;
        j9.a = typedArray.getResourceId(28, 0);
        j9.b = typedArray.getResourceId(52, 0);
        this.h = j9;
        C6969s7 c6969s7 = new C6969s7(getContext(), null);
        this.q = c6969s7;
        TypedArray typedArray2 = (TypedArray) c1857Xo1.c;
        if (typedArray2.hasValue(38)) {
            this.d = AbstractC1437Se1.d(getContext(), c1857Xo1, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.e = S02.c(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(c1857Xo1.C(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.k = AbstractC1437Se1.d(getContext(), c1857Xo1, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.l = S02.c(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.k = AbstractC1437Se1.d(getContext(), c1857Xo1, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.l = S02.c(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = T12.b(typedArray2.getInt(31, -1));
            this.n = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        c6969s7.setVisibility(8);
        c6969s7.setId(R.id.textinput_suffix_text);
        c6969s7.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c6969s7.setAccessibilityLiveRegion(1);
        c6969s7.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c6969s7.setTextColor(c1857Xo1.B(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.p = TextUtils.isEmpty(text3) ? null : text3;
        c6969s7.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(c6969s7);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.e0.add(ao);
        if (textInputLayout.d != null) {
            ao.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8247yq(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC1437Se1.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final CO b() {
        CO gb;
        int i = this.i;
        J9 j9 = this.h;
        SparseArray sparseArray = (SparseArray) j9.c;
        CO c6216oA0 = (CO) sparseArray.get(i);
        if (c6216oA0 == null) {
            BO bo = (BO) j9.d;
            if (i == -1) {
                gb = new GB(bo, 0);
            } else if (i == 0) {
                gb = new GB(bo, 1);
            } else if (i == 1) {
                c6216oA0 = new C6216oA0(bo, j9.b);
                sparseArray.append(i, c6216oA0);
            } else if (i == 2) {
                gb = new C1867Xs(bo);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Invalid end icon mode: "));
                }
                gb = new C4329iM(bo);
            }
            c6216oA0 = gb;
            sparseArray.append(i, c6216oA0);
        }
        return c6216oA0;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        CO coB = b();
        boolean zK = coB.k();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (!zK || (z3 = checkableImageButton.d) == coB.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(coB instanceof C4329iM) || (zIsActivated = checkableImageButton.isActivated()) == coB.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            T12.c(this.a, checkableImageButton, this.k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        CO coB = b();
        EE ee = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (ee != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new G1(ee));
        }
        this.u = null;
        coB.s();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
        h(i != 0);
        CO coB2 = b();
        int iD = this.h.a;
        if (iD == 0) {
            iD = coB2.d();
        }
        Drawable drawableB = iD != 0 ? AbstractC8352zN1.b(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawableB);
        TextInputLayout textInputLayout = this.a;
        if (drawableB != null) {
            T12.a(textInputLayout, checkableImageButton, this.k, this.l);
            T12.c(textInputLayout, checkableImageButton, this.k);
        }
        int iC = coB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(coB2.k());
        if (!coB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        coB2.r();
        EE eeH = coB2.h();
        this.u = eeH;
        if (eeH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new G1(this.u));
            }
        }
        View.OnClickListener onClickListenerF = coB2.f();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        T12.d(checkableImageButton, onLongClickListener);
        EditText editText = this.s;
        if (editText != null) {
            coB2.m(editText);
            j(coB2);
        }
        T12.a(textInputLayout, checkableImageButton, this.k, this.l);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.g.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        T12.a(this.a, checkableImageButton, this.d, this.e);
    }

    public final void j(CO co) {
        if (this.s == null) {
            return;
        }
        if (co.e() != null) {
            this.s.setOnFocusChangeListener(co.e());
        }
        if (co.g() != null) {
            this.g.setOnFocusChangeListener(co.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.p == null || this.r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.j.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
        this.q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        C6969s7 c6969s7 = this.q;
        int visibility = c6969s7.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c6969s7.setVisibility(i);
        this.a.q();
    }
}
