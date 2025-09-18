package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public final class YW0 implements TextWatcher {
    public final /* synthetic */ NB a;

    public YW0(NB nb) {
        this.a = nb;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        NB nb = this.a;
        Editable text = nb.p.getText();
        nb.b0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        nb.y(!zIsEmpty);
        int i4 = 8;
        if (nb.W && !nb.P && zIsEmpty) {
            nb.u.setVisibility(8);
            i4 = 0;
        }
        nb.w.setVisibility(i4);
        nb.u();
        nb.x();
        if (nb.K != null && !TextUtils.equals(charSequence, nb.a0)) {
            InterfaceC3790fX0 interfaceC3790fX0 = nb.K;
            String string = charSequence.toString();
            XW0 xw0 = (XW0) ((GQ0) interfaceC3790fX0).b;
            xw0.s(new PW(xw0.m, xw0.getId(), 5, string));
        }
        nb.a0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
