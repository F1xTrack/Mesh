package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: eK0 */
/* loaded from: classes.dex */
public final class C3560eK0 extends InputConnectionWrapper {
    public C3370dK0 a;
    public InterfaceC7405uP b;
    public boolean c;
    public String d;

    public final void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        PW pw = new PW(-1, this.a.getId(), 3);
        pw.b = str;
        this.b.g(pw);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.equals("")) {
                string = "Backspace";
            }
            if (this.c) {
                this.d = string;
            } else {
                a(string);
            }
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        a("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        this.c = false;
        String str = this.d;
        if (str != null) {
            a(str);
            this.d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                a("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                a("Enter");
            } else if (z) {
                a(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C3370dK0 c3370dK0 = this.a;
        int selectionStart = c3370dK0.getSelectionStart();
        int selectionEnd = c3370dK0.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = c3370dK0.getSelectionStart();
        String strValueOf = (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(c3370dK0.getText().charAt(selectionStart2 - 1));
        if (this.c) {
            this.d = strValueOf;
        } else {
            a(strValueOf);
        }
        return composingText;
    }
}
