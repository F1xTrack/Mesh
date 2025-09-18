package p000;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: eK0 */
/* loaded from: classes.dex */
public final class C9227eK0 extends InputConnectionWrapper {

    /* renamed from: a */
    public C9099dK0 f26659a;

    /* renamed from: b */
    public InterfaceC6947uP f26660b;

    /* renamed from: c */
    public boolean f26661c;

    /* renamed from: d */
    public String f26662d;

    /* renamed from: a */
    public final void m17911a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        C0977PW c0977pw = new C0977PW(-1, this.f26659a.getId(), 3);
        c0977pw.f9103b = str;
        this.f26660b.mo11046g(c0977pw);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f26661c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.equals("")) {
                string = "Backspace";
            }
            if (this.f26661c) {
                this.f26662d = string;
            } else {
                m17911a(string);
            }
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        m17911a("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        this.f26661c = false;
        String str = this.f26662d;
        if (str != null) {
            m17911a(str);
            this.f26662d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                m17911a("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                m17911a("Enter");
            } else if (z) {
                m17911a(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C9099dK0 c9099dK0 = this.f26659a;
        int selectionStart = c9099dK0.getSelectionStart();
        int selectionEnd = c9099dK0.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = c9099dK0.getSelectionStart();
        String strValueOf = (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(c9099dK0.getText().charAt(selectionStart2 - 1));
        if (this.f26661c) {
            this.f26662d = strValueOf;
        } else {
            m17911a(strValueOf);
        }
        return composingText;
    }
}
