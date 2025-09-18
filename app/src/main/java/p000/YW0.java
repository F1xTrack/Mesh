package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes.dex */
public final class YW0 implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ C0830NB f14329a;

    public YW0(C0830NB c0830nb) {
        this.f14329a = c0830nb;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C0830NB c0830nb = this.f14329a;
        Editable text = c0830nb.f35204p.getText();
        c0830nb.f35200b0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        c0830nb.m22067y(!zIsEmpty);
        int i4 = 8;
        if (c0830nb.f35198W && !c0830nb.f35191P && zIsEmpty) {
            c0830nb.f35213u.setVisibility(8);
            i4 = 0;
        }
        c0830nb.f35215w.setVisibility(i4);
        c0830nb.m22063u();
        c0830nb.m22066x();
        if (c0830nb.f35186K != null && !TextUtils.equals(charSequence, c0830nb.f35199a0)) {
            InterfaceC9381fX0 interfaceC9381fX0 = c0830nb.f35186K;
            String string = charSequence.toString();
            XW0 xw0 = (XW0) ((GQ0) interfaceC9381fX0).f3735b;
            xw0.m9068s(new C0977PW(xw0.f13827m, xw0.getId(), 5, string));
        }
        c0830nb.f35199a0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
