package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import p000.AbstractC1374Vq;
import p000.C10584ow1;
import p000.C8313Tf1;

/* renamed from: io.appmetrica.analytics.location.impl.r */
/* loaded from: classes2.dex */
public final class C5654r extends C5657u implements LocationReceiver {

    /* renamed from: e */
    public final Looper f32994e;

    /* renamed from: f */
    public final long f32995f;

    public C5654r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f32994e = looper;
        this.f32995f = TimeUnit.SECONDS.toMillis(1L);
    }

    /* renamed from: a */
    public static final C8313Tf1 m21277a(C5654r c5654r, LocationManager locationManager) {
        locationManager.requestLocationUpdates(c5654r.f33004d, c5654r.f32995f, 0.0f, c5654r.f33003c, c5654r.f32994e);
        return C8313Tf1.f11463a;
    }

    /* renamed from: b */
    public static final C8313Tf1 m21278b(C5654r c5654r, LocationManager locationManager) {
        locationManager.removeUpdates(c5654r.f33003c);
        return C8313Tf1.f11463a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f33002b.hasNecessaryPermissions(this.f33001a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f33001a, "location", AbstractC1374Vq.m8593l(new StringBuilder("request location updates for "), this.f33004d, " provider"), "location manager", new C10584ow1(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f33001a, "location", "stop location updates for passive provider", "location manager", new C10584ow1(this, 0));
    }
}
