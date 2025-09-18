package p000;

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

/* renamed from: o6 */
/* loaded from: classes.dex */
public final class C6531o6 extends CheckedTextView implements InterfaceC7991Na1 {

    /* renamed from: a */
    public final C6596p6 f38799a;

    /* renamed from: b */
    public final C4218i3 f38800b;

    /* renamed from: c */
    public final C6532o7 f38801c;

    /* renamed from: d */
    public C0762M6 f38802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6531o6(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC7835Ka1.m4676a(context);
        R91.m6917a(this, getContext());
        C6532o7 c6532o7 = new C6532o7(this);
        this.f38801c = c6532o7;
        c6532o7.m23347f(attributeSet, R.attr.checkedTextViewStyle);
        c6532o7.m23344b();
        C4218i3 c4218i3 = new C4218i3(this);
        this.f38800b = c4218i3;
        c4218i3.m18947l(attributeSet, R.attr.checkedTextViewStyle);
        this.f38799a = new C6596p6(this, 0);
        Context context2 = getContext();
        int[] iArr = AbstractC8704aH0.f15434l;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        AbstractC10944rk1.m24481m(this, getContext(), iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC11918zN1.m26394b(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC11918zN1.m26394b(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c8539Xo1M9117J.m9120B(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC6737rL.m24317c(typedArray.getInt(3, -1), null));
            }
            c8539Xo1M9117J.m9130M();
            getEmojiTextViewHelper().m5262b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c8539Xo1M9117J.m9130M();
            throw th;
        }
    }

    private C0762M6 getEmojiTextViewHelper() {
        if (this.f38802d == null) {
            this.f38802d = new C0762M6(this);
        }
        return this.f38802d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C6532o7 c6532o7 = this.f38801c;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
        C4218i3 c4218i3 = this.f38800b;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C6596p6 c6596p6 = this.f38799a;
        if (c6596p6 != null) {
            c6596p6.m23612b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11805yU1.m26158f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f38800b;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f38800b;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C6596p6 c6596p6 = this.f38799a;
        if (c6596p6 != null) {
            return (ColorStateList) c6596p6.f39833b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C6596p6 c6596p6 = this.f38799a;
        if (c6596p6 != null) {
            return (PorterDuff.Mode) c6596p6.f39834c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f38801c.m23345d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f38801c.m23346e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC11410vN1.m25407b(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m5263c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f38800b;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f38800b;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C6596p6 c6596p6 = this.f38799a;
        if (c6596p6 != null) {
            if (c6596p6.f39837f) {
                c6596p6.f39837f = false;
            } else {
                c6596p6.f39837f = true;
                c6596p6.m23612b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f38801c;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f38801c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f38800b;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f38800b;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C6596p6 c6596p6 = this.f38799a;
        if (c6596p6 != null) {
            c6596p6.f39833b = colorStateList;
            c6596p6.f39835d = true;
            c6596p6.m23612b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C6596p6 c6596p6 = this.f38799a;
        if (c6596p6 != null) {
            c6596p6.f39834c = mode;
            c6596p6.f39836e = true;
            c6596p6.m23612b();
        }
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6532o7 c6532o7 = this.f38801c;
        c6532o7.m23352l(colorStateList);
        c6532o7.m23344b();
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6532o7 c6532o7 = this.f38801c;
        c6532o7.m23353m(mode);
        c6532o7.m23344b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6532o7 c6532o7 = this.f38801c;
        if (c6532o7 != null) {
            c6532o7.m23348g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC11918zN1.m26394b(getContext(), i));
    }
}
