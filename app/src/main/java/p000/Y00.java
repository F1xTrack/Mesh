package p000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes.dex */
public final class Y00 implements LocationListener {

    /* renamed from: a */
    public boolean f14090a = false;

    /* renamed from: b */
    public final /* synthetic */ Promise f14091b;

    /* renamed from: c */
    public final /* synthetic */ C8669a10 f14092c;

    public Y00(C8669a10 c8669a10, Promise promise) {
        this.f14092c = c8669a10;
        this.f14091b = promise;
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (location != null) {
            if (!this.f14090a) {
                this.f14090a = true;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("provider", location.getProvider());
                writableNativeMap.putDouble("latitude", location.getLatitude());
                writableNativeMap.putDouble("longitude", location.getLongitude());
                writableNativeMap.putDouble("accuracy", location.getAccuracy());
                writableNativeMap.putDouble("altitude", location.getAltitude());
                writableNativeMap.putDouble("speed", location.getSpeed());
                writableNativeMap.putDouble("bearing", location.getBearing());
                writableNativeMap.putDouble(CrashHianalyticsData.TIME, location.getTime());
                this.f14091b.resolve(writableNativeMap);
                this.f14092c.m9661a();
                C8669a10 c8669a10 = this.f14092c;
                c8669a10.f15287d = null;
                c8669a10.f15285b = null;
                c8669a10.f15286c = null;
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
