package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: Cn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216Cn0 implements TextWatcher {
    public final EditText a;
    public final C7859wn0 b;
    public String c;

    public C0216Cn0(EditText editText, C7859wn0 c7859wn0) {
        O90.f(c7859wn0, "options");
        this.a = editText;
        this.b = c7859wn0;
        this.c = "";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.a;
        C7859wn0 c7859wn0 = this.b;
        if (editable == null || !O90.a(editable.toString(), this.c)) {
            String str = AbstractC8239yn0.a;
            editText.setText(AbstractC7811wX0.a(String.valueOf(editable), c7859wn0));
        } else {
            int length = this.c.length() - c7859wn0.d.length();
            if (length > 0) {
                editText.setSelection(length);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null) {
            return;
        }
        this.c = charSequence.subSequence(i, i2 + i).toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
