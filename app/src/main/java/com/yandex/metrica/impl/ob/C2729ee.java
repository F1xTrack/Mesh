package com.yandex.metrica.impl.ob;

import defpackage.F91;

/* renamed from: com.yandex.metrica.impl.ob.ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2729ee implements InterfaceC2704de {
    private final boolean a;

    public C2729ee(boolean z) {
        this.a = z;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2704de
    public boolean a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.a;
        }
        return true;
    }

    public String toString() {
        return F91.w(new StringBuilder("LocationFlagStrategy{mEnabled="), this.a, '}');
    }
}
