package p000;

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

/* renamed from: BO */
/* loaded from: classes.dex */
public final class C0088BO extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f776a;

    /* renamed from: b */
    public final FrameLayout f777b;

    /* renamed from: c */
    public final CheckableImageButton f778c;

    /* renamed from: d */
    public ColorStateList f779d;

    /* renamed from: e */
    public PorterDuff.Mode f780e;

    /* renamed from: f */
    public View.OnLongClickListener f781f;

    /* renamed from: g */
    public final CheckableImageButton f782g;

    /* renamed from: h */
    public final C0577J9 f783h;

    /* renamed from: i */
    public int f784i;

    /* renamed from: j */
    public final LinkedHashSet f785j;

    /* renamed from: k */
    public ColorStateList f786k;

    /* renamed from: l */
    public PorterDuff.Mode f787l;

    /* renamed from: m */
    public int f788m;

    /* renamed from: n */
    public ImageView.ScaleType f789n;

    /* renamed from: o */
    public View.OnLongClickListener f790o;

    /* renamed from: p */
    public CharSequence f791p;

    /* renamed from: q */
    public final C6803s7 f792q;

    /* renamed from: r */
    public boolean f793r;

    /* renamed from: s */
    public EditText f794s;

    /* renamed from: t */
    public final AccessibilityManager f795t;

    /* renamed from: u */
    public C0267EE f796u;

    /* renamed from: v */
    public final C11052sa1 f797v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088BO(TextInputLayout textInputLayout, C8539Xo1 c8539Xo1) {
        CharSequence text;
        super(textInputLayout.getContext());
        int i = 1;
        this.f784i = 0;
        this.f785j = new LinkedHashSet();
        this.f797v = new C11052sa1(2, this);
        C0025AO c0025ao = new C0025AO(this);
        this.f795t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f776a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f777b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM698a = m698a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f778c = checkableImageButtonM698a;
        CheckableImageButton checkableImageButtonM698a2 = m698a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f782g = checkableImageButtonM698a2;
        C0577J9 c0577j9 = new C0577J9();
        c0577j9.f5359c = new SparseArray();
        c0577j9.f5360d = this;
        TypedArray typedArray = (TypedArray) c8539Xo1.f13982c;
        c0577j9.f5357a = typedArray.getResourceId(28, 0);
        c0577j9.f5358b = typedArray.getResourceId(52, 0);
        this.f783h = c0577j9;
        C6803s7 c6803s7 = new C6803s7(getContext(), null);
        this.f792q = c6803s7;
        TypedArray typedArray2 = (TypedArray) c8539Xo1.f13982c;
        if (typedArray2.hasValue(38)) {
            this.f779d = AbstractC8259Se1.m7405d(getContext(), c8539Xo1, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f780e = S02.m7147c(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            m706i(c8539Xo1.m9121C(37));
        }
        checkableImageButtonM698a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        checkableImageButtonM698a.setImportantForAccessibility(2);
        checkableImageButtonM698a.setClickable(false);
        checkableImageButtonM698a.setPressable(false);
        checkableImageButtonM698a.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f786k = AbstractC8259Se1.m7405d(getContext(), c8539Xo1, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f787l = S02.m7147c(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            m704g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonM698a2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonM698a2.setContentDescription(text);
            }
            checkableImageButtonM698a2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f786k = AbstractC8259Se1.m7405d(getContext(), c8539Xo1, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f787l = S02.m7147c(typedArray2.getInt(55, -1), null);
            }
            m704g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButtonM698a2.getContentDescription() != text2) {
                checkableImageButtonM698a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f788m) {
            this.f788m = dimensionPixelSize;
            checkableImageButtonM698a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM698a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM698a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM698a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeM7521b = T12.m7521b(typedArray2.getInt(31, -1));
            this.f789n = scaleTypeM7521b;
            checkableImageButtonM698a2.setScaleType(scaleTypeM7521b);
            checkableImageButtonM698a.setScaleType(scaleTypeM7521b);
        }
        c6803s7.setVisibility(8);
        c6803s7.setId(R.id.textinput_suffix_text);
        c6803s7.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c6803s7.setAccessibilityLiveRegion(1);
        c6803s7.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            c6803s7.setTextColor(c8539Xo1.m9120B(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f791p = TextUtils.isEmpty(text3) ? null : text3;
        c6803s7.setText(text3);
        m711n();
        frameLayout.addView(checkableImageButtonM698a2);
        addView(c6803s7);
        addView(frameLayout);
        addView(checkableImageButtonM698a);
        textInputLayout.f18307e0.add(c0025ao);
        if (textInputLayout.f18304d != null) {
            c0025ao.m172a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7226yq(i, this));
    }

    /* renamed from: a */
    public final CheckableImageButton m698a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC8259Se1.m7409h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0151CO m699b() {
        AbstractC0151CO c0390gb;
        int i = this.f784i;
        C0577J9 c0577j9 = this.f783h;
        SparseArray sparseArray = (SparseArray) c0577j9.f5359c;
        AbstractC0151CO c10487oA0 = (AbstractC0151CO) sparseArray.get(i);
        if (c10487oA0 == null) {
            C0088BO c0088bo = (C0088BO) c0577j9.f5360d;
            if (i == -1) {
                c0390gb = new C0390GB(c0088bo, 0);
            } else if (i == 0) {
                c0390gb = new C0390GB(c0088bo, 1);
            } else if (i == 1) {
                c10487oA0 = new C10487oA0(c0088bo, c0577j9.f5358b);
                sparseArray.append(i, c10487oA0);
            } else if (i == 2) {
                c0390gb = new C1502Xs(c0088bo);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Invalid end icon mode: "));
                }
                c0390gb = new C4237iM(c0088bo);
            }
            c10487oA0 = c0390gb;
            sparseArray.append(i, c10487oA0);
        }
        return c10487oA0;
    }

    /* renamed from: c */
    public final int m700c() {
        int marginStart;
        if (m701d() || m702e()) {
            CheckableImageButton checkableImageButton = this.f782g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        return this.f792q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: d */
    public final boolean m701d() {
        return this.f777b.getVisibility() == 0 && this.f782g.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m702e() {
        return this.f778c.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m703f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC0151CO abstractC0151COM699b = m699b();
        boolean zMo1170k = abstractC0151COM699b.mo1170k();
        CheckableImageButton checkableImageButton = this.f782g;
        boolean z4 = true;
        if (!zMo1170k || (z3 = checkableImageButton.f18216d) == abstractC0151COM699b.mo1171l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC0151COM699b instanceof C4237iM) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0151COM699b.mo1169j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            T12.m7522c(this.f776a, checkableImageButton, this.f786k);
        }
    }

    /* renamed from: g */
    public final void m704g(int i) {
        if (this.f784i == i) {
            return;
        }
        AbstractC0151CO abstractC0151COM699b = m699b();
        C0267EE c0267ee = this.f796u;
        AccessibilityManager accessibilityManager = this.f795t;
        if (c0267ee != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0380G1(c0267ee));
        }
        this.f796u = null;
        abstractC0151COM699b.mo1178s();
        this.f784i = i;
        Iterator it = this.f785j.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
        m705h(i != 0);
        AbstractC0151CO abstractC0151COM699b2 = m699b();
        int iMo1163d = this.f783h.f5357a;
        if (iMo1163d == 0) {
            iMo1163d = abstractC0151COM699b2.mo1163d();
        }
        Drawable drawableM26394b = iMo1163d != 0 ? AbstractC11918zN1.m26394b(getContext(), iMo1163d) : null;
        CheckableImageButton checkableImageButton = this.f782g;
        checkableImageButton.setImageDrawable(drawableM26394b);
        TextInputLayout textInputLayout = this.f776a;
        if (drawableM26394b != null) {
            T12.m7520a(textInputLayout, checkableImageButton, this.f786k, this.f787l);
            T12.m7522c(textInputLayout, checkableImageButton, this.f786k);
        }
        int iMo1162c = abstractC0151COM699b2.mo1162c();
        CharSequence text = iMo1162c != 0 ? getResources().getText(iMo1162c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0151COM699b2.mo1170k());
        if (!abstractC0151COM699b2.mo1168i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0151COM699b2.mo1177r();
        C0267EE c0267eeMo1167h = abstractC0151COM699b2.mo1167h();
        this.f796u = c0267eeMo1167h;
        if (c0267eeMo1167h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0380G1(this.f796u));
            }
        }
        View.OnClickListener onClickListenerMo1165f = abstractC0151COM699b2.mo1165f();
        View.OnLongClickListener onLongClickListener = this.f790o;
        checkableImageButton.setOnClickListener(onClickListenerMo1165f);
        T12.m7523d(checkableImageButton, onLongClickListener);
        EditText editText = this.f794s;
        if (editText != null) {
            abstractC0151COM699b2.mo1172m(editText);
            m707j(abstractC0151COM699b2);
        }
        T12.m7520a(textInputLayout, checkableImageButton, this.f786k, this.f787l);
        m703f(true);
    }

    /* renamed from: h */
    public final void m705h(boolean z) {
        if (m701d() != z) {
            this.f782g.setVisibility(z ? 0 : 8);
            m708k();
            m710m();
            this.f776a.m11269q();
        }
    }

    /* renamed from: i */
    public final void m706i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f778c;
        checkableImageButton.setImageDrawable(drawable);
        m709l();
        T12.m7520a(this.f776a, checkableImageButton, this.f779d, this.f780e);
    }

    /* renamed from: j */
    public final void m707j(AbstractC0151CO abstractC0151CO) {
        if (this.f794s == null) {
            return;
        }
        if (abstractC0151CO.mo1164e() != null) {
            this.f794s.setOnFocusChangeListener(abstractC0151CO.mo1164e());
        }
        if (abstractC0151CO.mo1166g() != null) {
            this.f782g.setOnFocusChangeListener(abstractC0151CO.mo1166g());
        }
    }

    /* renamed from: k */
    public final void m708k() {
        this.f777b.setVisibility((this.f782g.getVisibility() != 0 || m702e()) ? 8 : 0);
        setVisibility((m701d() || m702e() || !((this.f791p == null || this.f793r) ? 8 : false)) ? 0 : 8);
    }

    /* renamed from: l */
    public final void m709l() {
        CheckableImageButton checkableImageButton = this.f778c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f776a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f18312j.f37514q && textInputLayout.m11265m()) ? 0 : 8);
        m708k();
        m710m();
        if (this.f784i != 0) {
            return;
        }
        textInputLayout.m11269q();
    }

    /* renamed from: m */
    public final void m710m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f776a;
        if (textInputLayout.f18304d == null) {
            return;
        }
        if (m701d() || m702e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f18304d;
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f18304d.getPaddingTop();
        int paddingBottom = textInputLayout.f18304d.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
        this.f792q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: n */
    public final void m711n() {
        C6803s7 c6803s7 = this.f792q;
        int visibility = c6803s7.getVisibility();
        int i = (this.f791p == null || this.f793r) ? 8 : 0;
        if (visibility != i) {
            m699b().mo1175p(i == 0);
        }
        m708k();
        c6803s7.setVisibility(i);
        this.f776a.m11269q();
    }
}
