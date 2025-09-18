package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import p000.C7655Go1;

/* renamed from: io.appmetrica.analytics.location.impl.u */
/* loaded from: classes2.dex */
public class C5657u implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f33001a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f33002b;

    /* renamed from: c */
    public final LocationListener f33003c;

    /* renamed from: d */
    public final String f33004d;

    public C5657u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f33001a = context;
        this.f33002b = permissionResolutionStrategy;
        this.f33003c = locationListener;
        this.f33004d = str;
    }

    /* renamed from: a */
    public final Context m21280a() {
        return this.f33001a;
    }

    /* renamed from: b */
    public final LocationListener m21281b() {
        return this.f33003c;
    }

    /* renamed from: c */
    public final PermissionResolutionStrategy m21282c() {
        return this.f33002b;
    }

    /* renamed from: d */
    public final String m21283d() {
        return this.f33004d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f33002b.hasNecessaryPermissions(this.f33001a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f33001a, "location", "getting last known location for provider " + this.f33004d, "location manager", new C7655Go1(12, this));
            if (location != null) {
                this.f33003c.onLocationChanged(location);
            }
        }
    }

    /* renamed from: a */
    public static final Location m21279a(C5657u c5657u, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(c5657u.f33004d);
    }
}
