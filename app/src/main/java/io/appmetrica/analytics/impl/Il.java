package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public final class Il {
    public final long a;

    public Il(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Il.class == obj.getClass() && this.a == ((Il) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC7209tN0.y(new StringBuilder("StatSending{disabledReportingInterval="), this.a, '}');
    }
}
