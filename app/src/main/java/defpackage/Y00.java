package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;

/* loaded from: classes.dex */
public final class Y00 implements LocationListener {
    public boolean a = false;
    public final /* synthetic */ Promise b;
    public final /* synthetic */ C2053a10 c;

    public Y00(C2053a10 c2053a10, Promise promise) {
        this.c = c2053a10;
        this.b = promise;
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (location != null) {
            if (!this.a) {
                this.a = true;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("provider", location.getProvider());
                writableNativeMap.putDouble("latitude", location.getLatitude());
                writableNativeMap.putDouble("longitude", location.getLongitude());
                writableNativeMap.putDouble("accuracy", location.getAccuracy());
                writableNativeMap.putDouble("altitude", location.getAltitude());
                writableNativeMap.putDouble("speed", location.getSpeed());
                writableNativeMap.putDouble("bearing", location.getBearing());
                writableNativeMap.putDouble(CrashHianalyticsData.TIME, location.getTime());
                this.b.resolve(writableNativeMap);
                this.c.a();
                C2053a10 c2053a10 = this.c;
                c2053a10.d = null;
                c2053a10.b = null;
                c2053a10.c = null;
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
