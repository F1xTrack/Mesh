package io.appmetrica.analytics.impl;

import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.y9 */
/* loaded from: classes2.dex */
public final class C5593y9 {

    /* renamed from: a */
    public final long f32852a;

    public C5593y9(long j) {
        this.f32852a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5593y9) && this.f32852a == ((C5593y9) obj).f32852a;
    }

    public final int hashCode() {
        long j = this.f32852a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC11153tN0.m24913y(new StringBuilder("ExternalAttributionConfig(collectingInterval="), this.f32852a, ')');
    }
}
