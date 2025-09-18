package p000;

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

/* renamed from: s7 */
/* loaded from: classes.dex */
public class C6803s7 extends TextView implements InterfaceC7991Na1 {

    /* renamed from: a */
    public final C4218i3 f42260a;

    /* renamed from: b */
    public final C6532o7 f42261b;

    /* renamed from: c */
    public final C7967Mo1 f42262c;

    /* renamed from: d */
    public C0762M6 f42263d;

    /* renamed from: e */
    public boolean f42264e;

    /* renamed from: f */
    public C7391Bm1 f42265f;

    /* renamed from: g */
    public Future f42266g;

    public C6803s7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0762M6 getEmojiTextViewHelper() {
        if (this.f42263d == null) {
            this.f42263d = new C0762M6(this);
        }
        return this.f42263d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f42260a;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    /* renamed from: g */
    public final void m24619g() {
        Future future = this.f42266g;
        if (future == null) {
            return;
        }
        try {
            this.f42266g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC11805yU1.m26154b(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC7337Al1.f356c) {
            return super.getAutoSizeMaxTextSize();
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            return Math.round(c6532o7.f38813i.f45404e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC7337Al1.f356c) {
            return super.getAutoSizeMinTextSize();
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            return Math.round(c6532o7.f38813i.f45403d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC7337Al1.f356c) {
            return super.getAutoSizeStepGranularity();
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            return Math.round(c6532o7.f38813i.f45402c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC7337Al1.f356c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C6532o7 c6532o7 = this.f42261b;
        return c6532o7 != null ? c6532o7.f38813i.f45405f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC7337Al1.f356c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            return c6532o7.f38813i.f45400a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11805yU1.m26158f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC6597p7 getSuperCaller() {
        if (this.f42265f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f42265f = new C6723r7(this);
            } else if (i >= 28) {
                this.f42265f = new C6660q7(this);
            } else if (i >= 26) {
                this.f42265f = new C7391Bm1(3, this);
            }
        }
        return this.f42265f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f42260a;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f42260a;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f42261b.m23345d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f42261b.m23346e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m24619g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C7967Mo1 c7967Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c7967Mo1 = this.f42262c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c7967Mo1.f7363b;
        return textClassifier == null ? AbstractC4159h7.m18724a((TextView) c7967Mo1.f7362a) : textClassifier;
    }

    public C11131tC0 getTextMetricsParamsCompat() {
        return AbstractC11805yU1.m26154b(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f42261b.getClass();
        C6532o7.m23342h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC11410vN1.m25407b(editorInfo, inputConnectionOnCreateInputConnection, this);
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
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 == null || AbstractC7337Al1.f356c) {
            return;
        }
        c6532o7.f38813i.m25765a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m24619g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 == null || AbstractC7337Al1.f356c) {
            return;
        }
        C7118x7 c7118x7 = c6532o7.f38813i;
        if (c7118x7.m25767f()) {
            c7118x7.m25765a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m5263c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC7337Al1.f356c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23349i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC7337Al1.f356c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23350j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC7337Al1.f356c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23351k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f42260a;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f42260a;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11805yU1.m26160h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m5264d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m5261a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo867l(i);
        } else {
            AbstractC11805yU1.m26155c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo863f(i);
        } else {
            AbstractC11805yU1.m26156d(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC11805yU1.m26157e(this, i);
    }

    public void setPrecomputedText(AbstractC11259uC0 abstractC11259uC0) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC11805yU1.m26154b(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f42260a;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f42260a;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6532o7 c6532o7 = this.f42261b;
        c6532o7.m23352l(colorStateList);
        c6532o7.m23344b();
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6532o7 c6532o7 = this.f42261b;
        c6532o7.m23353m(mode);
        c6532o7.m23344b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23348g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C7967Mo1 c7967Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c7967Mo1 = this.f42262c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c7967Mo1.f7363b = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC11259uC0> future) {
        this.f42266g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C11131tC0 c11131tC0) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c11131tC0.f42946b;
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
        getPaint().set(c11131tC0.f42945a);
        H91.m3325e(this, c11131tC0.f42947c);
        H91.m3328h(this, c11131tC0.f42948d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = AbstractC7337Al1.f356c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 == null || z) {
            return;
        }
        C7118x7 c7118x7 = c6532o7.f38813i;
        if (c7118x7.m25767f()) {
            return;
        }
        c7118x7.m25768g(f, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f42264e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            GZ1 gz1 = AbstractC7843Ke1.f6246a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f42264e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f42264e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6803s7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC7835Ka1.m4676a(context);
        this.f42264e = false;
        this.f42265f = null;
        R91.m6917a(this, getContext());
        C4218i3 c4218i3 = new C4218i3(this);
        this.f42260a = c4218i3;
        c4218i3.m18947l(attributeSet, i);
        C6532o7 c6532o7 = new C6532o7(this);
        this.f42261b = c6532o7;
        c6532o7.m23347f(attributeSet, i);
        c6532o7.m23344b();
        C7967Mo1 c7967Mo1 = new C7967Mo1();
        c7967Mo1.f7362a = this;
        this.f42262c = c7967Mo1;
        getEmojiTextViewHelper().m5262b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo869n(i, f);
        } else if (i2 >= 34) {
            K91.m4575a(this, i, f);
        } else {
            AbstractC11805yU1.m26157e(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC11918zN1.m26394b(context, i) : null, i2 != 0 ? AbstractC11918zN1.m26394b(context, i2) : null, i3 != 0 ? AbstractC11918zN1.m26394b(context, i3) : null, i4 != 0 ? AbstractC11918zN1.m26394b(context, i4) : null);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC11918zN1.m26394b(context, i) : null, i2 != 0 ? AbstractC11918zN1.m26394b(context, i2) : null, i3 != 0 ? AbstractC11918zN1.m26394b(context, i3) : null, i4 != 0 ? AbstractC11918zN1.m26394b(context, i4) : null);
        C6532o7 c6532o7 = this.f42261b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }
}
