package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import p000.AbstractC11153tN0;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.Mb */
/* loaded from: classes2.dex */
public final class C4660Mb implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b */
    public static final C4636Lb f30476b = new C4636Lb();

    /* renamed from: c */
    public static final List f30477c = AbstractC7230yu.m26275f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a */
    public volatile boolean f30478a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f30477c.contains(str)) {
            return !this.f30478a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f30478a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f30478a = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationFlagStrategy(enabled=");
        sb.append(this.f30478a);
        sb.append(", locationPermissions=");
        return AbstractC11153tN0.m24883A(sb, f30477c, ')');
    }
}
