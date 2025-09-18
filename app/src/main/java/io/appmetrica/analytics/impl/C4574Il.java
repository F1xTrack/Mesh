package io.appmetrica.analytics.impl;

import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.Il */
/* loaded from: classes2.dex */
public final class C4574Il {

    /* renamed from: a */
    public final long f30322a;

    public C4574Il(long j) {
        this.f30322a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4574Il.class == obj.getClass() && this.f30322a == ((C4574Il) obj).f30322a;
    }

    public final int hashCode() {
        long j = this.f30322a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC11153tN0.m24913y(new StringBuilder("StatSending{disabledReportingInterval="), this.f30322a, '}');
    }
}
