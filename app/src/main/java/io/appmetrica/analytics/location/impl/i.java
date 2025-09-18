package io.appmetrica.analytics.location.impl;

import defpackage.O90;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* loaded from: classes2.dex */
public final class i {
    public final LocationFilter a;
    public final CacheArguments b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.a = locationFilter;
        this.b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return O90.a(this.a, iVar.a) && O90.a(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.a + ", cacheArguments=" + this.b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
