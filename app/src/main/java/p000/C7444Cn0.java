package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: Cn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7444Cn0 implements TextWatcher {

    /* renamed from: a */
    public final EditText f1654a;

    /* renamed from: b */
    public final C11588wn0 f1655b;

    /* renamed from: c */
    public String f1656c;

    public C7444Cn0(EditText editText, C11588wn0 c11588wn0) {
        O90.m5968f(c11588wn0, "options");
        this.f1654a = editText;
        this.f1655b = c11588wn0;
        this.f1656c = "";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.f1654a;
        C11588wn0 c11588wn0 = this.f1655b;
        if (editable == null || !O90.m5963a(editable.toString(), this.f1656c)) {
            String str = AbstractC11842yn0.f46457a;
            editText.setText(AbstractC11556wX0.m25644a(String.valueOf(editable), c11588wn0));
        } else {
            int length = this.f1656c.length() - c11588wn0.f45101d.length();
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
        this.f1656c = charSequence.subSequence(i, i2 + i).toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
