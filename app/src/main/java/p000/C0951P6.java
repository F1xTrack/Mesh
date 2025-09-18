package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: P6 */
/* loaded from: classes.dex */
public final class C0951P6 extends MultiAutoCompleteTextView implements InterfaceC7991Na1 {

    /* renamed from: d */
    public static final int[] f8853d = {R.attr.popupBackground};

    /* renamed from: a */
    public final C4218i3 f8854a;

    /* renamed from: b */
    public final C6532o7 f8855b;

    /* renamed from: c */
    public final CC0 f8856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0951P6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        AbstractC7835Ka1.m4676a(context);
        R91.m6917a(this, getContext());
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(getContext(), attributeSet, f8853d, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c8539Xo1M9117J.f13982c).hasValue(0)) {
            setDropDownBackgroundDrawable(c8539Xo1M9117J.m9121C(0));
        }
        c8539Xo1M9117J.m9130M();
        C4218i3 c4218i3 = new C4218i3(this);
        this.f8854a = c4218i3;
        c4218i3.m18947l(attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        C6532o7 c6532o7 = new C6532o7(this);
        this.f8855b = c6532o7;
        c6532o7.m23347f(attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        c6532o7.m23344b();
        CC0 cc0 = new CC0(this);
        this.f8856c = cc0;
        cc0.mo1061c1(attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM1050X0 = cc0.m1050X0(keyListener);
        if (keyListenerM1050X0 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1050X0);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f8854a;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C6532o7 c6532o7 = this.f8855b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f8854a;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f8854a;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8855b.m23345d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8855b.m23346e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC11410vN1.m25407b(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f8856c.m1067e1(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f8854a;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f8854a;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f8855b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f8855b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f8856c.m1091m1(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8856c.m1050X0(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f8854a;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f8854a;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6532o7 c6532o7 = this.f8855b;
        c6532o7.m23352l(colorStateList);
        c6532o7.m23344b();
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6532o7 c6532o7 = this.f8855b;
        c6532o7.m23353m(mode);
        c6532o7.m23344b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6532o7 c6532o7 = this.f8855b;
        if (c6532o7 != null) {
            c6532o7.m23348g(context, i);
        }
    }
}
