package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: n6 */
/* loaded from: classes.dex */
public class C6012n6 extends CheckBox implements InterfaceC0957Ma1, InterfaceC1035Na1 {
    public final C6394p6 a;
    public final C4271i3 b;
    public final C6206o7 c;
    public M6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6012n6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0802Ka1.a(context);
        R91.a(this, getContext());
        C6394p6 c6394p6 = new C6394p6(this, 1);
        this.a = c6394p6;
        c6394p6.h(attributeSet, i);
        C4271i3 c4271i3 = new C4271i3(this);
        this.b = c4271i3;
        c4271i3.l(attributeSet, i);
        C6206o7 c6206o7 = new C6206o7(this);
        this.c = c6206o7;
        c6206o7.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private M6 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new M6(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            c4271i3.a();
        }
        C6206o7 c6206o7 = this.c;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            return c4271i3.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            return c4271i3.j();
        }
        return null;
    }

    @Override // defpackage.InterfaceC0957Ma1
    public ColorStateList getSupportButtonTintList() {
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            return (ColorStateList) c6394p6.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            return (PorterDuff.Mode) c6394p6.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            c4271i3.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            c4271i3.p(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            if (c6394p6.f) {
                c6394p6.f = false;
            } else {
                c6394p6.f = true;
                c6394p6.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.c;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.c;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            c4271i3.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            c4271i3.v(mode);
        }
    }

    @Override // defpackage.InterfaceC0957Ma1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            c6394p6.b = colorStateList;
            c6394p6.d = true;
            c6394p6.a();
        }
    }

    @Override // defpackage.InterfaceC0957Ma1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            c6394p6.c = mode;
            c6394p6.e = true;
            c6394p6.a();
        }
    }

    @Override // defpackage.InterfaceC1035Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6206o7 c6206o7 = this.c;
        c6206o7.l(colorStateList);
        c6206o7.b();
    }

    @Override // defpackage.InterfaceC1035Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6206o7 c6206o7 = this.c;
        c6206o7.m(mode);
        c6206o7.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC8352zN1.b(getContext(), i));
    }
}
