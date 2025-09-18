package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;

/* renamed from: io.appmetrica.analytics.impl.u3 */
/* loaded from: classes2.dex */
public final class C4899u3 {
    public final long a;

    public C4899u3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4899u3.class == obj.getClass() && this.a == ((C4899u3) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC7209tN0.y(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.a, '}');
    }
}
