package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.fe */
/* loaded from: classes2.dex */
public class C3260fe {

    /* renamed from: a */
    private InterfaceC3208de f23437a;

    public C3260fe(InterfaceC3208de interfaceC3208de) {
        this.f23437a = interfaceC3208de;
    }

    /* renamed from: a */
    public void m15931a(InterfaceC3208de interfaceC3208de) {
        this.f23437a = interfaceC3208de;
    }

    /* renamed from: b */
    public boolean m15933b(Context context) {
        if (this.f23437a.mo15685a("android.permission.READ_PHONE_STATE")) {
            return C3182ce.m15708a(context, "android.permission.READ_PHONE_STATE");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m15934c(Context context) {
        if (this.f23437a.mo15685a("android.permission.ACCESS_WIFI_STATE")) {
            return C3182ce.m15708a(context, "android.permission.ACCESS_WIFI_STATE");
        }
        return false;
    }

    /* renamed from: a */
    public boolean m15932a(Context context) {
        if (this.f23437a.mo15685a("android.permission.ACCESS_COARSE_LOCATION")) {
            return C3182ce.m15708a(context, "android.permission.ACCESS_COARSE_LOCATION");
        }
        return false;
    }
}
