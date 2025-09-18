package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class L6 extends EditText implements InterfaceC2233ay0, InterfaceC1035Na1 {
    public final C4271i3 a;
    public final C6206o7 b;
    public final C0999Mo1 c;
    public final M91 d;
    public final CC0 e;
    public K6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC0802Ka1.a(context);
        R91.a(this, getContext());
        C4271i3 c4271i3 = new C4271i3(this);
        this.a = c4271i3;
        c4271i3.l(attributeSet, R.attr.editTextStyle);
        C6206o7 c6206o7 = new C6206o7(this);
        this.b = c6206o7;
        c6206o7.f(attributeSet, R.attr.editTextStyle);
        c6206o7.b();
        C0999Mo1 c0999Mo1 = new C0999Mo1();
        c0999Mo1.a = this;
        this.c = c0999Mo1;
        this.d = new M91();
        CC0 cc0 = new CC0(this);
        this.e = cc0;
        cc0.c1(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerX0 = cc0.X0(keyListener);
        if (keyListenerX0 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerX0);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private K6 getSuperCaller() {
        if (this.f == null) {
            this.f = new K6(this);
        }
        return this.f;
    }

    @Override // defpackage.InterfaceC2233ay0
    public final C0092Ay a(C0092Ay c0092Ay) {
        return this.d.a(this, c0092Ay);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0999Mo1 c0999Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c0999Mo1 = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0999Mo1.b;
        return textClassifier == null ? AbstractC4093h7.a((TextView) c0999Mo1.a) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[PHI: r1
  0x0058: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006b, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            o7 r1 = r7.b
            r1.getClass()
            defpackage.C6206o7.h(r8, r0, r7)
            defpackage.AbstractC7592vN1.b(r8, r0, r7)
            if (r0 == 0) goto L78
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L78
            java.lang.String[] r2 = defpackage.AbstractC6897rk1.g(r7)
            if (r2 == 0) goto L78
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            defpackage.AbstractC4141hN.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            EE r2 = new EE
            r6 = 21
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4e
            A80 r1 = new A80
            r1.<init>(r0, r2)
        L4c:
            r0 = r1
            goto L78
        L4e:
            java.lang.String[] r6 = defpackage.AbstractC5543ke1.a
            if (r1 < r5) goto L5a
            java.lang.String[] r1 = defpackage.AbstractC4141hN.b(r8)
            if (r1 == 0) goto L6e
        L58:
            r6 = r1
            goto L6e
        L5a:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5f
            goto L6e
        L5f:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6b
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6b:
            if (r1 == 0) goto L6e
            goto L58
        L6e:
            int r1 = r6.length
            if (r1 != 0) goto L72
            goto L78
        L72:
            B80 r1 = new B80
            r1.<init>(r0, r2)
            goto L4c
        L78:
            CC0 r1 = r7.e
            vN r8 = r1.e1(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.L6.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC6897rk1.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = T6.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        InterfaceC8081xy c3513e41;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC6897rk1.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c3513e41 = new C3513e41(primaryClip, 1);
            } else {
                C8271yy c8271yy = new C8271yy();
                c8271yy.b = primaryClip;
                c8271yy.c = 1;
                c3513e41 = c8271yy;
            }
            c3513e41.P(i == 16908322 ? 0 : 1);
            AbstractC6897rk1.j(this, c3513e41.a());
        }
        return true;
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC8183yU1.h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.m1(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.X0(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        C0999Mo1 c0999Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c0999Mo1 = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0999Mo1.b = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
