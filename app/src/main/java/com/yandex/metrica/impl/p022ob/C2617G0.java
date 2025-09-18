package com.yandex.metrica.impl.p022ob;

import p000.AbstractC0852NX;

/* renamed from: com.yandex.metrica.impl.ob.G0 */
/* loaded from: classes2.dex */
public final class C2617G0 {

    /* renamed from: a */
    private final long f21239a;

    public C2617G0(long j) {
        this.f21239a = j;
    }

    /* renamed from: a */
    public final long m14149a() {
        return this.f21239a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2617G0) && this.f21239a == ((C2617G0) obj).f21239a;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f21239a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return AbstractC0852NX.m5760i(new StringBuilder("EasyCollectingConfig(firstLaunchDelaySeconds="), this.f21239a, ")");
    }
}
