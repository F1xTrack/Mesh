package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: n6 */
/* loaded from: classes.dex */
public class C6468n6 extends CheckBox implements InterfaceC7939Ma1, InterfaceC7991Na1 {

    /* renamed from: a */
    public final C6596p6 f38100a;

    /* renamed from: b */
    public final C4218i3 f38101b;

    /* renamed from: c */
    public final C6532o7 f38102c;

    /* renamed from: d */
    public C0762M6 f38103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6468n6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC7835Ka1.m4676a(context);
        R91.m6917a(this, getContext());
        C6596p6 c6596p6 = new C6596p6(this, 1);
        this.f38100a = c6596p6;
        c6596p6.m23618h(attributeSet, i);
        C4218i3 c4218i3 = new C4218i3(this);
        this.f38101b = c4218i3;
        c4218i3.m18947l(attributeSet, i);
        C6532o7 c6532o7 = new C6532o7(this);
        this.f38102c = c6532o7;
        c6532o7.m23347f(attributeSet, i);
        getEmojiTextViewHelper().m5262b(attributeSet, i);
    }

    private C0762M6 getEmojiTextViewHelper() {
        if (this.f38103d == null) {
            this.f38103d = new C0762M6(this);
        }
        return this.f38103d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f38101b;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C6532o7 c6532o7 = this.f38102c;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f38101b;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f38101b;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    @Override // p000.InterfaceC7939Ma1
    public ColorStateList getSupportButtonTintList() {
        C6596p6 c6596p6 = this.f38100a;
        if (c6596p6 != null) {
            return (ColorStateList) c6596p6.f39833b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C6596p6 c6596p6 = this.f38100a;
        if (c6596p6 != null) {
            return (PorterDuff.Mode) c6596p6.f39834c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f38102c.m23345d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f38102c.m23346e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m5263c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f38101b;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f38101b;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C6596p6 c6596p6 = this.f38100a;
        if (c6596p6 != null) {
            if (c6596p6.f39837f) {
                c6596p6.f39837f = false;
            } else {
                c6596p6.f39837f = true;
                c6596p6.m23611a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f38102c;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f38102c;
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
        C4218i3 c4218i3 = this.f38101b;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f38101b;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    @Override // p000.InterfaceC7939Ma1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C6596p6 c6596p6 = this.f38100a;
        if (c6596p6 != null) {
            c6596p6.f39833b = colorStateList;
            c6596p6.f39835d = true;
            c6596p6.m23611a();
        }
    }

    @Override // p000.InterfaceC7939Ma1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C6596p6 c6596p6 = this.f38100a;
        if (c6596p6 != null) {
            c6596p6.f39834c = mode;
            c6596p6.f39836e = true;
            c6596p6.m23611a();
        }
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6532o7 c6532o7 = this.f38102c;
        c6532o7.m23352l(colorStateList);
        c6532o7.m23344b();
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6532o7 c6532o7 = this.f38102c;
        c6532o7.m23353m(mode);
        c6532o7.m23344b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }
}
