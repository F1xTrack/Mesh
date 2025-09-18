package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: gN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3950gN implements TextWatcher {
    public final /* synthetic */ TO0 a;
    public final /* synthetic */ C8277z b;

    public C3950gN(TO0 to0, C8277z c8277z) {
        this.a = to0;
        this.b = c8277z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strValueOf = String.valueOf(charSequence);
        TO0 to0 = this.a;
        if (strValueOf.equals(to0.a)) {
            return;
        }
        to0.a = strValueOf;
        this.b.invoke(strValueOf);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
