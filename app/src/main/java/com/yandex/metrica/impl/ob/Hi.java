package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* loaded from: classes2.dex */
public enum Hi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);

    private int a;

    Hi(int i) {
        this.a = i;
    }

    public Bundle a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.a);
        return bundle;
    }
}
