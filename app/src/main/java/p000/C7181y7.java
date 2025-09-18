package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: y7 */
/* loaded from: classes.dex */
public final class C7181y7 extends ToggleButton implements InterfaceC7991Na1 {

    /* renamed from: a */
    public final C4218i3 f46096a;

    /* renamed from: b */
    public final C6532o7 f46097b;

    /* renamed from: c */
    public C0762M6 f46098c;

    public C7181y7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        R91.m6917a(this, getContext());
        C4218i3 c4218i3 = new C4218i3(this);
        this.f46096a = c4218i3;
        c4218i3.m18947l(attributeSet, R.attr.buttonStyleToggle);
        C6532o7 c6532o7 = new C6532o7(this);
        this.f46097b = c6532o7;
        c6532o7.m23347f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m5262b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0762M6 getEmojiTextViewHelper() {
        if (this.f46098c == null) {
            this.f46098c = new C0762M6(this);
        }
        return this.f46098c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f46096a;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C6532o7 c6532o7 = this.f46097b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f46096a;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f46096a;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f46097b.m23345d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f46097b.m23346e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m5263c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f46096a;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f46096a;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f46097b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f46097b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m5264d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m5261a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f46096a;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f46096a;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6532o7 c6532o7 = this.f46097b;
        c6532o7.m23352l(colorStateList);
        c6532o7.m23344b();
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6532o7 c6532o7 = this.f46097b;
        c6532o7.m23353m(mode);
        c6532o7.m23344b();
    }
}
