package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import defpackage.AbstractC1705Vq;
import defpackage.C1518Tf1;
import defpackage.C6361ow1;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class r extends u implements LocationReceiver {
    public final Looper e;
    public final long f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.e = looper;
        this.f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final C1518Tf1 a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.d, rVar.f, 0.0f, rVar.c, rVar.e);
        return C1518Tf1.a;
    }

    public static final C1518Tf1 b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.c);
        return C1518Tf1.a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.b.hasNecessaryPermissions(this.a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", AbstractC1705Vq.l(new StringBuilder("request location updates for "), this.d, " provider"), "location manager", new C6361ow1(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", "stop location updates for passive provider", "location manager", new C6361ow1(this, 0));
    }
}
