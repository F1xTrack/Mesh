package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: AO */
/* loaded from: classes.dex */
public final class C0025AO {

    /* renamed from: a */
    public final /* synthetic */ C0088BO f181a;

    public C0025AO(C0088BO c0088bo) {
        this.f181a = c0088bo;
    }

    /* renamed from: a */
    public final void m172a(TextInputLayout textInputLayout) {
        C0088BO c0088bo = this.f181a;
        if (c0088bo.f794s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0088bo.f794s;
        C11052sa1 c11052sa1 = c0088bo.f797v;
        if (editText != null) {
            editText.removeTextChangedListener(c11052sa1);
            if (c0088bo.f794s.getOnFocusChangeListener() == c0088bo.m699b().mo1164e()) {
                c0088bo.f794s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0088bo.f794s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c11052sa1);
        }
        c0088bo.m699b().mo1172m(c0088bo.f794s);
        c0088bo.m707j(c0088bo.m699b());
    }
}
