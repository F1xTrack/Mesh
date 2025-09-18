package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: s7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6969s7 extends TextView implements InterfaceC1035Na1 {
    public final C4271i3 a;
    public final C6206o7 b;
    public final C0999Mo1 c;
    public M6 d;
    public boolean e;
    public C0136Bm1 f;
    public Future g;

    public C6969s7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private M6 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new M6(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.a();
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    public final void g() {
        Future future = this.g;
        if (future == null) {
            return;
        }
        try {
            this.g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC8183yU1.b(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC0055Al1.c) {
            return super.getAutoSizeMaxTextSize();
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            return Math.round(c6206o7.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC0055Al1.c) {
            return super.getAutoSizeMinTextSize();
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            return Math.round(c6206o7.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC0055Al1.c) {
            return super.getAutoSizeStepGranularity();
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            return Math.round(c6206o7.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0055Al1.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C6206o7 c6206o7 = this.b;
        return c6206o7 != null ? c6206o7.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0055Al1.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            return c6206o7.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC8183yU1.f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC6397p7 getSuperCaller() {
        if (this.f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f = new C6778r7(this);
            } else if (i >= 28) {
                this.f = new C6588q7(this);
            } else if (i >= 26) {
                this.f = new C0136Bm1(3, this);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            return c4271i3.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            return c4271i3.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0999Mo1 c0999Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c0999Mo1 = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0999Mo1.b;
        return textClassifier == null ? AbstractC4093h7.a((TextView) c0999Mo1.a) : textClassifier;
    }

    public C7176tC0 getTextMetricsParamsCompat() {
        return AbstractC8183yU1.b(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        C6206o7.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC7592vN1.b(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 == null || AbstractC0055Al1.c) {
            return;
        }
        c6206o7.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 == null || AbstractC0055Al1.c) {
            return;
        }
        C7922x7 c7922x7 = c6206o7.i;
        if (c7922x7.f()) {
            c7922x7.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC0055Al1.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC0055Al1.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC0055Al1.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC8183yU1.h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i);
        } else {
            AbstractC8183yU1.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            AbstractC8183yU1.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC8183yU1.e(this, i);
    }

    public void setPrecomputedText(AbstractC7367uC0 abstractC7367uC0) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC8183yU1.b(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.v(mode);
        }
    }

    @Override // defpackage.InterfaceC1035Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6206o7 c6206o7 = this.b;
        c6206o7.l(colorStateList);
        c6206o7.b();
    }

    @Override // defpackage.InterfaceC1035Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6206o7 c6206o7 = this.b;
        c6206o7.m(mode);
        c6206o7.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0999Mo1 c0999Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c0999Mo1 = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0999Mo1.b = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC7367uC0> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C7176tC0 c7176tC0) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c7176tC0.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c7176tC0.a);
        H91.e(this, c7176tC0.c);
        H91.h(this, c7176tC0.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = AbstractC0055Al1.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C6206o7 c6206o7 = this.b;
        if (c6206o7 == null || z) {
            return;
        }
        C7922x7 c7922x7 = c6206o7.i;
        if (c7922x7.f()) {
            return;
        }
        c7922x7.g(f, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            GZ1 gz1 = AbstractC0814Ke1.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6969s7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0802Ka1.a(context);
        this.e = false;
        this.f = null;
        R91.a(this, getContext());
        C4271i3 c4271i3 = new C4271i3(this);
        this.a = c4271i3;
        c4271i3.l(attributeSet, i);
        C6206o7 c6206o7 = new C6206o7(this);
        this.b = c6206o7;
        c6206o7.f(attributeSet, i);
        c6206o7.b();
        C0999Mo1 c0999Mo1 = new C0999Mo1();
        c0999Mo1.a = this;
        this.c = c0999Mo1;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().n(i, f);
        } else if (i2 >= 34) {
            K91.a(this, i, f);
        } else {
            AbstractC8183yU1.e(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC8352zN1.b(context, i) : null, i2 != 0 ? AbstractC8352zN1.b(context, i2) : null, i3 != 0 ? AbstractC8352zN1.b(context, i3) : null, i4 != 0 ? AbstractC8352zN1.b(context, i4) : null);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC8352zN1.b(context, i) : null, i2 != 0 ? AbstractC8352zN1.b(context, i2) : null, i3 != 0 ? AbstractC8352zN1.b(context, i3) : null, i4 != 0 ? AbstractC8352zN1.b(context, i4) : null);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }
}
