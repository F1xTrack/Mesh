package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;

/* renamed from: io.appmetrica.analytics.impl.y9 */
/* loaded from: classes2.dex */
public final class C5001y9 {
    public final long a;

    public C5001y9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5001y9) && this.a == ((C5001y9) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC7209tN0.y(new StringBuilder("ExternalAttributionConfig(collectingInterval="), this.a, ')');
    }
}
