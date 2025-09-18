package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;

/* renamed from: l6 */
/* loaded from: classes.dex */
public class C5630l6 extends Button implements InterfaceC1035Na1 {
    public final C4271i3 a;
    public final C6206o7 b;
    public M6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5630l6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0802Ka1.a(context);
        R91.a(this, getContext());
        C4271i3 c4271i3 = new C4271i3(this);
        this.a = c4271i3;
        c4271i3.l(attributeSet, i);
        C6206o7 c6206o7 = new C6206o7(this);
        this.b = c6206o7;
        c6206o7.f(attributeSet, i);
        c6206o7.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private M6 getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new M6(this);
        }
        return this.c;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
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

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

    public void setSupportAllCaps(boolean z) {
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.a.setAllCaps(z);
        }
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6206o7 c6206o7 = this.b;
        if (c6206o7 != null) {
            c6206o7.g(context, i);
        }
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
}
