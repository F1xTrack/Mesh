package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: u41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11244u41 extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f43485a;

    /* renamed from: b */
    public final C6803s7 f43486b;

    /* renamed from: c */
    public CharSequence f43487c;

    /* renamed from: d */
    public final CheckableImageButton f43488d;

    /* renamed from: e */
    public ColorStateList f43489e;

    /* renamed from: f */
    public PorterDuff.Mode f43490f;

    /* renamed from: g */
    public int f43491g;

    /* renamed from: h */
    public ImageView.ScaleType f43492h;

    /* renamed from: i */
    public View.OnLongClickListener f43493i;

    /* renamed from: j */
    public boolean f43494j;

    public C11244u41(TextInputLayout textInputLayout, C8539Xo1 c8539Xo1) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f43485a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f43488d = checkableImageButton;
        C6803s7 c6803s7 = new C6803s7(getContext(), null);
        this.f43486b = c6803s7;
        if (AbstractC8259Se1.m7409h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f43493i;
        checkableImageButton.setOnClickListener(null);
        T12.m7523d(checkableImageButton, onLongClickListener);
        this.f43493i = null;
        checkableImageButton.setOnLongClickListener(null);
        T12.m7523d(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c8539Xo1.f13982c;
        if (typedArray.hasValue(69)) {
            this.f43489e = AbstractC8259Se1.m7405d(getContext(), c8539Xo1, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f43490f = S02.m7147c(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m25102b(c8539Xo1.m9121C(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f43491g) {
            this.f43491g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeM7521b = T12.m7521b(typedArray.getInt(68, -1));
            this.f43492h = scaleTypeM7521b;
            checkableImageButton.setScaleType(scaleTypeM7521b);
        }
        c6803s7.setVisibility(8);
        c6803s7.setId(R.id.textinput_prefix_text);
        c6803s7.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        c6803s7.setAccessibilityLiveRegion(1);
        c6803s7.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c6803s7.setTextColor(c8539Xo1.m9120B(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f43487c = TextUtils.isEmpty(text2) ? null : text2;
        c6803s7.setText(text2);
        m25105e();
        addView(checkableImageButton);
        addView(c6803s7);
    }

    /* renamed from: a */
    public final int m25101a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f43488d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        return this.f43486b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* renamed from: b */
    public final void m25102b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f43488d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f43489e;
            PorterDuff.Mode mode = this.f43490f;
            TextInputLayout textInputLayout = this.f43485a;
            T12.m7520a(textInputLayout, checkableImageButton, colorStateList, mode);
            m25103c(true);
            T12.m7522c(textInputLayout, checkableImageButton, this.f43489e);
            return;
        }
        m25103c(false);
        View.OnLongClickListener onLongClickListener = this.f43493i;
        checkableImageButton.setOnClickListener(null);
        T12.m7523d(checkableImageButton, onLongClickListener);
        this.f43493i = null;
        checkableImageButton.setOnLongClickListener(null);
        T12.m7523d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: c */
    public final void m25103c(boolean z) {
        CheckableImageButton checkableImageButton = this.f43488d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            m25104d();
            m25105e();
        }
    }

    /* renamed from: d */
    public final void m25104d() throws Resources.NotFoundException {
        int paddingStart;
        EditText editText = this.f43485a.f18304d;
        if (editText == null) {
            return;
        }
        if (this.f43488d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
        this.f43486b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: e */
    public final void m25105e() {
        int i = (this.f43487c == null || this.f43494j) ? 8 : 0;
        setVisibility((this.f43488d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f43486b.setVisibility(i);
        this.f43485a.m11269q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        m25104d();
    }
}
