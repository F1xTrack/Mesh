package p000;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.timepicker.C1952h;

/* renamed from: sa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11052sa1 extends N91 {

    /* renamed from: a */
    public final /* synthetic */ int f42487a;

    /* renamed from: b */
    public final /* synthetic */ Object f42488b;

    public /* synthetic */ C11052sa1(int i, Object obj) {
        this.f42487a = i;
        this.f42488b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws NumberFormatException {
        switch (this.f42487a) {
            case 0:
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(editable);
                    C1952h c1952h = (C1952h) this.f42488b;
                    if (zIsEmpty) {
                        c1952h.f18430b.m22513d(0);
                    } else {
                        c1952h.f18430b.m22513d(Integer.parseInt(editable.toString()));
                    }
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case 1:
                try {
                    boolean zIsEmpty2 = TextUtils.isEmpty(editable);
                    C1952h c1952h2 = (C1952h) this.f42488b;
                    if (zIsEmpty2) {
                        c1952h2.f18430b.m22512c(0);
                    } else {
                        c1952h2.f18430b.m22512c(Integer.parseInt(editable.toString()));
                    }
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
            default:
                ((C0088BO) this.f42488b).m699b().mo1160a();
                break;
        }
    }

    @Override // p000.N91, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f42487a) {
            case 2:
                ((C0088BO) this.f42488b).m699b().mo1161b();
                break;
        }
    }
}
