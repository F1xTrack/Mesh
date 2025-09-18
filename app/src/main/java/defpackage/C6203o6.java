package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import ru.mes.dnevnik.R;

/* renamed from: o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6203o6 extends CheckedTextView implements InterfaceC1035Na1 {
    public final C6394p6 a;
    public final C4271i3 b;
    public final C6206o7 c;
    public M6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6203o6(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC0802Ka1.a(context);
        R91.a(this, getContext());
        C6206o7 c6206o7 = new C6206o7(this);
        this.c = c6206o7;
        c6206o7.f(attributeSet, R.attr.checkedTextViewStyle);
        c6206o7.b();
        C4271i3 c4271i3 = new C4271i3(this);
        this.b = c4271i3;
        c4271i3.l(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new C6394p6(this, 0);
        Context context2 = getContext();
        int[] iArr = AbstractC2104aH0.l;
        C1857Xo1 c1857Xo1J = C1857Xo1.J(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c1857Xo1J.c;
        AbstractC6897rk1.m(this, getContext(), iArr, attributeSet, (TypedArray) c1857Xo1J.c, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC8352zN1.b(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC8352zN1.b(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c1857Xo1J.B(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC6820rL.c(typedArray.getInt(3, -1), null));
            }
            c1857Xo1J.M();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c1857Xo1J.M();
            throw th;
        }
    }

    private M6 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new M6(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C6206o7 c6206o7 = this.c;
        if (c6206o7 != null) {
            c6206o7.b();
        }
        C4271i3 c4271i3 = this.b;
        if (c4271i3 != null) {
            c4271i3.a();
        }
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            c6394p6.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC8183yU1.f(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            return (ColorStateList) c6394p6.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC7592vN1.b(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            if (c6394p6.f) {
                c6394p6.f = false;
            } else {
                c6394p6.f = true;
                c6394p6.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.c;
        if (c6206o7 != null) {
            c6206o7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6206o7 c6206o7 = this.c;
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            c6394p6.b = colorStateList;
            c6394p6.d = true;
            c6394p6.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C6394p6 c6394p6 = this.a;
        if (c6394p6 != null) {
            c6394p6.c = mode;
            c6394p6.e = true;
            c6394p6.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6206o7 c6206o7 = this.c;
        if (c6206o7 != null) {
            c6206o7.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC8352zN1.b(getContext(), i));
    }
}
