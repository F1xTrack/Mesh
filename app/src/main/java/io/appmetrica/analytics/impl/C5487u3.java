package io.appmetrica.analytics.impl;

import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.u3 */
/* loaded from: classes2.dex */
public final class C5487u3 {

    /* renamed from: a */
    public final long f32671a;

    public C5487u3(long j) {
        this.f32671a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5487u3.class == obj.getClass() && this.f32671a == ((C5487u3) obj).f32671a;
    }

    public final int hashCode() {
        long j = this.f32671a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC11153tN0.m24913y(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.f32671a, '}');
    }
}
