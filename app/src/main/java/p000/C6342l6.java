package p000;

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
public class C6342l6 extends Button implements InterfaceC7991Na1 {

    /* renamed from: a */
    public final C4218i3 f36889a;

    /* renamed from: b */
    public final C6532o7 f36890b;

    /* renamed from: c */
    public C0762M6 f36891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6342l6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC7835Ka1.m4676a(context);
        R91.m6917a(this, getContext());
        C4218i3 c4218i3 = new C4218i3(this);
        this.f36889a = c4218i3;
        c4218i3.m18947l(attributeSet, i);
        C6532o7 c6532o7 = new C6532o7(this);
        this.f36890b = c6532o7;
        c6532o7.m23347f(attributeSet, i);
        c6532o7.m23344b();
        getEmojiTextViewHelper().m5262b(attributeSet, i);
    }

    private C0762M6 getEmojiTextViewHelper() {
        if (this.f36891c == null) {
            this.f36891c = new C0762M6(this);
        }
        return this.f36891c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f36889a;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C6532o7 c6532o7 = this.f36890b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC7337Al1.f356c) {
            return super.getAutoSizeMaxTextSize();
        }
        C6532o7 c6532o7 = this.f36890b;
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
        C6532o7 c6532o7 = this.f36890b;
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
        C6532o7 c6532o7 = this.f36890b;
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
        C6532o7 c6532o7 = this.f36890b;
        return c6532o7 != null ? c6532o7.f38813i.f45405f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC7337Al1.f356c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C6532o7 c6532o7 = this.f36890b;
        if (c6532o7 != null) {
            return c6532o7.f38813i.f45400a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11805yU1.m26158f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f36889a;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f36889a;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f36890b.m23345d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f36890b.m23346e();
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
        C6532o7 c6532o7 = this.f36890b;
        if (c6532o7 == null || AbstractC7337Al1.f356c) {
            return;
        }
        c6532o7.f38813i.m25765a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C6532o7 c6532o7 = this.f36890b;
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
        C6532o7 c6532o7 = this.f36890b;
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
        C6532o7 c6532o7 = this.f36890b;
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
        C6532o7 c6532o7 = this.f36890b;
        if (c6532o7 != null) {
            c6532o7.m23351k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f36889a;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f36889a;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
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

    public void setSupportAllCaps(boolean z) {
        C6532o7 c6532o7 = this.f36890b;
        if (c6532o7 != null) {
            c6532o7.f38805a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f36889a;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f36889a;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6532o7 c6532o7 = this.f36890b;
        c6532o7.m23352l(colorStateList);
        c6532o7.m23344b();
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6532o7 c6532o7 = this.f36890b;
        c6532o7.m23353m(mode);
        c6532o7.m23344b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6532o7 c6532o7 = this.f36890b;
        if (c6532o7 != null) {
            c6532o7.m23348g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = AbstractC7337Al1.f356c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C6532o7 c6532o7 = this.f36890b;
        if (c6532o7 == null || z) {
            return;
        }
        C7118x7 c7118x7 = c6532o7.f38813i;
        if (c7118x7.m25767f()) {
            return;
        }
        c7118x7.m25768g(f, i);
    }
}
