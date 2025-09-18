package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.timepicker.h;

/* renamed from: sa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7058sa1 extends N91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C7058sa1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws NumberFormatException {
        switch (this.a) {
            case 0:
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(editable);
                    h hVar = (h) this.b;
                    if (zIsEmpty) {
                        hVar.b.d(0);
                    } else {
                        hVar.b.d(Integer.parseInt(editable.toString()));
                    }
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case 1:
                try {
                    boolean zIsEmpty2 = TextUtils.isEmpty(editable);
                    h hVar2 = (h) this.b;
                    if (zIsEmpty2) {
                        hVar2.b.c(0);
                    } else {
                        hVar2.b.c(Integer.parseInt(editable.toString()));
                    }
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
            default:
                ((BO) this.b).b().a();
                break;
        }
    }

    @Override // defpackage.N91, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 2:
                ((BO) this.b).b().b();
                break;
        }
    }
}
