package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.location.impl.m */
/* loaded from: classes2.dex */
public final class C5649m extends SynchronizedDataCache {

    /* renamed from: d */
    public static final long f32981d = 200;

    /* renamed from: e */
    public static final long f32982e = 50;

    /* renamed from: a */
    public final C5648l f32984a;

    /* renamed from: b */
    public static final long f32979b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static final long f32980c = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f */
    public static final List<String> f32983f = Arrays.asList("gps", "network");

    public C5649m() {
        C5648l c5648l = new C5648l(f32980c);
        long j = f32979b;
        this(c5648l, j, 2 * j);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(Location location) {
        return f32983f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || m21270a(location, (Location) this.mCachedData.getData(), this.f32984a.f32978a, 200L));
    }

    public C5649m(C5648l c5648l, long j, long j2) {
        super(j, j2, "location");
        this.f32984a = c5648l;
    }

    /* renamed from: a */
    public static boolean m21270a(Location location, Location location2, long j, long j2) {
        boolean zEquals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j;
        boolean z2 = time < (-j);
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = ((long) accuracy) > j2;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            zEquals = provider2 == null;
        } else {
            zEquals = provider.equals(provider2);
        }
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && zEquals;
        }
        return true;
    }
}
