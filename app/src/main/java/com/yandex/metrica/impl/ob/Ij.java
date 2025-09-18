package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class Ij implements Cj {
    private final F9 a;

    public Ij(F9 f9) {
        this.a = f9;
    }

    @Override // com.yandex.metrica.impl.ob.Cj
    public String a() {
        C2766g1 c2766g1T = this.a.t();
        String str = !TextUtils.isEmpty(c2766g1T.a) ? c2766g1T.a : null;
        if (str != null) {
            return str;
        }
        String strM = this.a.m(null);
        return !TextUtils.isEmpty(strM) ? strM : str;
    }
}
