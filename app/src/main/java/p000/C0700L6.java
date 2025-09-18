package p000;

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

/* renamed from: L6 */
/* loaded from: classes.dex */
public class C0700L6 extends EditText implements InterfaceC8790ay0, InterfaceC7991Na1 {

    /* renamed from: a */
    public final C4218i3 f6484a;

    /* renamed from: b */
    public final C6532o7 f6485b;

    /* renamed from: c */
    public final C7967Mo1 f6486c;

    /* renamed from: d */
    public final M91 f6487d;

    /* renamed from: e */
    public final CC0 f6488e;

    /* renamed from: f */
    public C0637K6 f6489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0700L6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC7835Ka1.m4676a(context);
        R91.m6917a(this, getContext());
        C4218i3 c4218i3 = new C4218i3(this);
        this.f6484a = c4218i3;
        c4218i3.m18947l(attributeSet, R.attr.editTextStyle);
        C6532o7 c6532o7 = new C6532o7(this);
        this.f6485b = c6532o7;
        c6532o7.m23347f(attributeSet, R.attr.editTextStyle);
        c6532o7.m23344b();
        C7967Mo1 c7967Mo1 = new C7967Mo1();
        c7967Mo1.f7362a = this;
        this.f6486c = c7967Mo1;
        this.f6487d = new M91();
        CC0 cc0 = new CC0(this);
        this.f6488e = cc0;
        cc0.mo1061c1(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM1050X0 = cc0.m1050X0(keyListener);
        if (keyListenerM1050X0 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM1050X0);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C0637K6 getSuperCaller() {
        if (this.f6489f == null) {
            this.f6489f = new C0637K6(this);
        }
        return this.f6489f;
    }

    @Override // p000.InterfaceC8790ay0
    /* renamed from: a */
    public final C0061Ay mo4900a(C0061Ay c0061Ay) {
        return this.f6487d.m5279a(this, c0061Ay);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f6484a;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
        C6532o7 c6532o7 = this.f6485b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11805yU1.m26158f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f6484a;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f6484a;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6485b.m23345d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6485b.m23346e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C7967Mo1 c7967Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c7967Mo1 = this.f6486c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c7967Mo1.f7363b;
        return textClassifier == null ? AbstractC4159h7.m18724a((TextView) c7967Mo1.f7362a) : textClassifier;
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
            o7 r1 = r7.f6485b
            r1.getClass()
            p000.C6532o7.m23342h(r8, r0, r7)
            p000.AbstractC11410vN1.m25407b(r8, r0, r7)
            if (r0 == 0) goto L78
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L78
            java.lang.String[] r2 = p000.AbstractC10944rk1.m24475g(r7)
            if (r2 == 0) goto L78
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            p000.AbstractC4175hN.m18808a(r8, r2)
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
            java.lang.String[] r6 = p000.AbstractC10036ke1.f36590a
            if (r1 < r5) goto L5a
            java.lang.String[] r1 = p000.AbstractC4175hN.m18809b(r8)
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
            CC0 r1 = r7.f6488e
            vN r8 = r1.m1067e1(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0700L6.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
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
        boolean zM7546a = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC10944rk1.m24475g(this) != null) {
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
                zM7546a = AbstractC1202T6.m7546a(dragEvent, this, activity);
            }
        }
        if (zM7546a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        InterfaceC7171xy c9196e41;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC10944rk1.m24475g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c9196e41 = new C9196e41(primaryClip, 1);
            } else {
                C7234yy c7234yy = new C7234yy();
                c7234yy.f46552b = primaryClip;
                c7234yy.f46553c = 1;
                c9196e41 = c7234yy;
            }
            c9196e41.mo17852P(i == 16908322 ? 0 : 1);
            AbstractC10944rk1.m24478j(this, c9196e41.mo17858a());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f6484a;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f6484a;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f6485b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C6532o7 c6532o7 = this.f6485b;
        if (c6532o7 != null) {
            c6532o7.m23344b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11805yU1.m26160h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f6488e.m1091m1(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6488e.m1050X0(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f6484a;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f6484a;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C6532o7 c6532o7 = this.f6485b;
        c6532o7.m23352l(colorStateList);
        c6532o7.m23344b();
    }

    @Override // p000.InterfaceC7991Na1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C6532o7 c6532o7 = this.f6485b;
        c6532o7.m23353m(mode);
        c6532o7.m23344b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C6532o7 c6532o7 = this.f6485b;
        if (c6532o7 != null) {
            c6532o7.m23348g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C7967Mo1 c7967Mo1;
        if (Build.VERSION.SDK_INT >= 28 || (c7967Mo1 = this.f6486c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c7967Mo1.f7363b = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
