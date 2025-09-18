package defpackage;

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

/* loaded from: classes.dex */
public final class P6 extends MultiAutoCompleteTextView implements InterfaceC1035Na1 {
    public static final int[] d = {R.attr.popupBackground};
    public final C4271i3 a;
    public final C6206o7 b;
    public final CC0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        AbstractC0802Ka1.a(context);
        R91.a(this, getContext());
        C1857Xo1 c1857Xo1J = C1857Xo1.J(getContext(), attributeSet, d, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c1857Xo1J.c).hasValue(0)) {
            setDropDownBackgroundDrawable(c1857Xo1J.C(0));
        }
        c1857Xo1J.M();
        C4271i3 c4271i3 = new C4271i3(this);
        this.a = c4271i3;
        c4271i3.l(attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        C6206o7 c6206o7 = new C6206o7(this);
        this.b = c6206o7;
        c6206o7.f(attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        c6206o7.b();
        CC0 cc0 = new CC0(this);
        this.c = cc0;
        cc0.c1(attributeSet, ru.mes.dnevnik.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerX0 = cc0.X0(keyListener);
        if (keyListenerX0 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerX0);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC7592vN1.b(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.e1(inputConnectionOnCreateInputConnection, editorInfo);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC8352zN1.b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.m1(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.X0(keyListener));
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
}
