package p000;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cK0 */
/* loaded from: classes.dex */
public final class C8966cK0 implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ C9099dK0 f17430a;

    public C8966cK0(C9099dK0 c9099dK0) {
        this.f17430a = c9099dK0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ArrayList arrayList;
        C9099dK0 c9099dK0 = this.f17430a;
        if (c9099dK0.f25957i || (arrayList = c9099dK0.f25961m) == null) {
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
        C9099dK0 c9099dK0 = this.f17430a;
        if (c9099dK0.f25957i || (arrayList = c9099dK0.f25961m) == null) {
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
        C9099dK0 c9099dK0 = this.f17430a;
        if (!c9099dK0.f25957i && (arrayList = c9099dK0.f25961m) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
        }
        c9099dK0.m17541j();
        c9099dK0.m17538g();
    }
}
