package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Ij */
/* loaded from: classes2.dex */
public class C2686Ij implements InterfaceC2536Cj {

    /* renamed from: a */
    private final C2601F9 f21445a;

    public C2686Ij(C2601F9 c2601f9) {
        this.f21445a = c2601f9;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2536Cj
    /* renamed from: a */
    public String mo13970a() {
        C3273g1 c3273g1M14124t = this.f21445a.m14124t();
        String str = !TextUtils.isEmpty(c3273g1M14124t.f23462a) ? c3273g1M14124t.f23462a : null;
        if (str != null) {
            return str;
        }
        String strM14111m = this.f21445a.m14111m(null);
        return !TextUtils.isEmpty(strM14111m) ? strM14111m : str;
    }
}
