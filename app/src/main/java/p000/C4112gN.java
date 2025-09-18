package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: gN */
/* loaded from: classes2.dex */
public final class C4112gN implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ TO0 f27705a;

    /* renamed from: b */
    public final /* synthetic */ C7236z f27706b;

    public C4112gN(TO0 to0, C7236z c7236z) {
        this.f27705a = to0;
        this.f27706b = c7236z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strValueOf = String.valueOf(charSequence);
        TO0 to0 = this.f27705a;
        if (strValueOf.equals(to0.f11337a)) {
            return;
        }
        to0.f11337a = strValueOf;
        this.f27706b.invoke(strValueOf);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
