package p000;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.huawei.hms.push.AttributionReporter;

/* renamed from: Kr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7868Kr0 implements LocationListener {

    /* renamed from: a */
    public final S91 f6360a;

    /* renamed from: b */
    public final LocationManager f6361b;

    /* renamed from: c */
    public Location f6362c;

    public C7868Kr0(S91 s91) {
        O90.m5968f(s91, "context");
        this.f6360a = s91;
        Object systemService = s91.getSystemService("location");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.f6361b = (LocationManager) systemService;
    }

    /* renamed from: a */
    public final void m4772a(boolean z) throws C6640po {
        LocationManager locationManager = this.f6361b;
        if (!z) {
            locationManager.removeUpdates(this);
            return;
        }
        S91 s91 = this.f6360a;
        int iM17899a = AbstractC3982eJ.m17899a(s91, "android.permission.ACCESS_FINE_LOCATION");
        int iM17899a2 = AbstractC3982eJ.m17899a(s91, "android.permission.ACCESS_COARSE_LOCATION");
        if (iM17899a != 0 && iM17899a2 != 0) {
            throw new C6640po(AttributionReporter.SYSTEM_PERMISSION, "location-permission-denied", "The Location permission was denied! If you want to capture photos or videos without location tags, pass `enableLocation={false}`.", null);
        }
        this.f6361b.requestLocationUpdates("gps", 5000L, 5.0f, this);
        this.f6362c = locationManager.getLastKnownLocation("gps");
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        O90.m5968f(location, "location");
        location.getLatitude();
        location.getLongitude();
        this.f6362c = location;
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        O90.m5968f(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        O90.m5968f(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
