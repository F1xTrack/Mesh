package com.yandex.metrica.impl.p022ob;

import p000.F91;

/* renamed from: com.yandex.metrica.impl.ob.ee */
/* loaded from: classes2.dex */
class C3234ee implements InterfaceC3208de {

    /* renamed from: a */
    private final boolean f23360a;

    public C3234ee(boolean z) {
        this.f23360a = z;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3208de
    /* renamed from: a */
    public boolean mo15685a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f23360a;
        }
        return true;
    }

    public String toString() {
        return F91.m2540w(new StringBuilder("LocationFlagStrategy{mEnabled="), this.f23360a, '}');
    }
}
