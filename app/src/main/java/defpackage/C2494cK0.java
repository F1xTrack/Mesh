package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2494cK0 implements TextWatcher {
    public final /* synthetic */ C3370dK0 a;

    public C2494cK0(C3370dK0 c3370dK0) {
        this.a = c3370dK0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ArrayList arrayList;
        C3370dK0 c3370dK0 = this.a;
        if (c3370dK0.i || (arrayList = c3370dK0.m) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        C3370dK0 c3370dK0 = this.a;
        if (c3370dK0.i || (arrayList = c3370dK0.m) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        C3370dK0 c3370dK0 = this.a;
        if (!c3370dK0.i && (arrayList = c3370dK0.m) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
        }
        c3370dK0.j();
        c3370dK0.g();
    }
}
