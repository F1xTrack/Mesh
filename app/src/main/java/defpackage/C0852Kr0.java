package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.huawei.hms.push.AttributionReporter;

/* renamed from: Kr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0852Kr0 implements LocationListener {
    public final S91 a;
    public final LocationManager b;
    public Location c;

    public C0852Kr0(S91 s91) {
        O90.f(s91, "context");
        this.a = s91;
        Object systemService = s91.getSystemService("location");
        O90.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.b = (LocationManager) systemService;
    }

    public final void a(boolean z) throws C6526po {
        LocationManager locationManager = this.b;
        if (!z) {
            locationManager.removeUpdates(this);
            return;
        }
        S91 s91 = this.a;
        int iA = AbstractC3556eJ.a(s91, "android.permission.ACCESS_FINE_LOCATION");
        int iA2 = AbstractC3556eJ.a(s91, "android.permission.ACCESS_COARSE_LOCATION");
        if (iA != 0 && iA2 != 0) {
            throw new C6526po(AttributionReporter.SYSTEM_PERMISSION, "location-permission-denied", "The Location permission was denied! If you want to capture photos or videos without location tags, pass `enableLocation={false}`.", null);
        }
        this.b.requestLocationUpdates("gps", 5000L, 5.0f, this);
        this.c = locationManager.getLastKnownLocation("gps");
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        O90.f(location, "location");
        location.getLatitude();
        location.getLongitude();
        this.c = location;
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        O90.f(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        O90.f(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
