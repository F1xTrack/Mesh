package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import p000.O90;

/* renamed from: io.appmetrica.analytics.location.impl.i */
/* loaded from: classes2.dex */
public final class C5645i {

    /* renamed from: a */
    public final LocationFilter f32965a;

    /* renamed from: b */
    public final CacheArguments f32966b;

    public C5645i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f32965a = locationFilter;
        this.f32966b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5645i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        C5645i c5645i = (C5645i) obj;
        return O90.m5963a(this.f32965a, c5645i.f32965a) && O90.m5963a(this.f32966b, c5645i.f32966b);
    }

    public final int hashCode() {
        return this.f32966b.hashCode() + (this.f32965a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f32965a + ", cacheArguments=" + this.f32966b + ')';
    }

    public /* synthetic */ C5645i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
