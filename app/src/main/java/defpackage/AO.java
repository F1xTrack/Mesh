package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class AO {
    public final /* synthetic */ BO a;

    public AO(BO bo) {
        this.a = bo;
    }

    public final void a(TextInputLayout textInputLayout) {
        BO bo = this.a;
        if (bo.s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = bo.s;
        C7058sa1 c7058sa1 = bo.v;
        if (editText != null) {
            editText.removeTextChangedListener(c7058sa1);
            if (bo.s.getOnFocusChangeListener() == bo.b().e()) {
                bo.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        bo.s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c7058sa1);
        }
        bo.b().m(bo.s);
        bo.j(bo.b());
    }
}
