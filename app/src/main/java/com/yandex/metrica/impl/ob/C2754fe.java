package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2754fe {
    private InterfaceC2704de a;

    public C2754fe(InterfaceC2704de interfaceC2704de) {
        this.a = interfaceC2704de;
    }

    public void a(InterfaceC2704de interfaceC2704de) {
        this.a = interfaceC2704de;
    }

    public boolean b(Context context) {
        if (this.a.a("android.permission.READ_PHONE_STATE")) {
            return C2679ce.a(context, "android.permission.READ_PHONE_STATE");
        }
        return false;
    }

    public boolean c(Context context) {
        if (this.a.a("android.permission.ACCESS_WIFI_STATE")) {
            return C2679ce.a(context, "android.permission.ACCESS_WIFI_STATE");
        }
        return false;
    }

    public boolean a(Context context) {
        if (this.a.a("android.permission.ACCESS_COARSE_LOCATION")) {
            return C2679ce.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        }
        return false;
    }
}
