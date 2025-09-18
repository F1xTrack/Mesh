package com.yandex.metrica.impl.p022ob;

import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.Ti */
/* loaded from: classes2.dex */
public final class C2959Ti {

    /* renamed from: a */
    private final int f22410a;

    public C2959Ti(int i) {
        this.f22410a = i;
    }

    /* renamed from: a */
    public final int m15198a() {
        return this.f22410a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2959Ti) && this.f22410a == ((C2959Ti) obj).f22410a;
        }
        return true;
    }

    public int hashCode() {
        return this.f22410a;
    }

    public String toString() {
        return AbstractC1374Vq.m8591j(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.f22410a, ")");
    }
}
