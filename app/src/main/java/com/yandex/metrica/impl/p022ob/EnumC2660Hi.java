package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Hi */
/* loaded from: classes2.dex */
public enum EnumC2660Hi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);


    /* renamed from: a */
    private int f21370a;

    EnumC2660Hi(int i) {
        this.f21370a = i;
    }

    /* renamed from: a */
    public Bundle m14265a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f21370a);
        return bundle;
    }
}
