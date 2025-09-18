package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import p000.O91;

/* renamed from: com.my.tracker.obfuscated.b1 */
/* loaded from: classes2.dex */
public final class C2296b1 {

    /* renamed from: a */
    protected Location f19762a;

    /* renamed from: c */
    LocationManager f19764c;

    /* renamed from: d */
    int f19765d = -1;

    /* renamed from: b */
    protected final LocationListener f19763b = new a();

    /* renamed from: com.my.tracker.obfuscated.b1$a */
    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            AbstractC2391y2.m13568a("LocationDataProvider: location has been updated");
            C2296b1 c2296b1 = C2296b1.this;
            c2296b1.f19762a = location;
            LocationManager locationManager = c2296b1.f19764c;
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            AbstractC2391y2.m13568a("LocationDataProvider: onProviderDisabled, provider – " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            AbstractC2391y2.m13568a("LocationDataProvider: onProviderEnabled, provider –" + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            AbstractC2391y2.m13568a("LocationDataProvider: onStatusChanged, provider – " + str + ", status – " + i + ", extras – " + bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public C2291a1 m12794a(int i, Context context) {
        float accuracy;
        long time;
        String provider;
        int i2;
        int i3 = 1;
        if (i == 0) {
            return C2291a1.f19753g;
        }
        this.f19765d = -1;
        if (!AbstractC2346n1.m13340a("android.permission.ACCESS_FINE_LOCATION", context) || !AbstractC2346n1.m13340a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            return C2291a1.f19753g;
        }
        if (AbstractC2346n1.m13339a()) {
            return C2291a1.f19753g;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        this.f19764c = locationManager;
        if (locationManager == null) {
            return C2291a1.f19753g;
        }
        if (i == 2) {
            m12795a();
        }
        Location location = this.f19762a;
        if (location != null) {
            accuracy = location.getAccuracy();
            time = location.getTime();
            provider = location.getProvider();
        } else {
            location = null;
            accuracy = Float.MAX_VALUE;
            time = 0;
            provider = null;
        }
        for (String str : this.f19764c.getAllProviders()) {
            try {
                Location lastKnownLocation = this.f19764c.getLastKnownLocation(str);
                if (lastKnownLocation != null) {
                    float accuracy2 = lastKnownLocation.getAccuracy();
                    long time2 = lastKnownLocation.getTime();
                    if (location == null || (time2 > time && accuracy2 < accuracy)) {
                        provider = str;
                        location = lastKnownLocation;
                        accuracy = accuracy2;
                        time = time2;
                    }
                }
            } catch (SecurityException unused) {
                AbstractC2391y2.m13568a("LocationDataProvider: Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
            }
        }
        if (location == null) {
            return C2291a1.f19753g;
        }
        provider.getClass();
        switch (provider) {
            case "passive":
                i3 = 4;
                i2 = i3;
                break;
            case "gps":
                i2 = 2;
                break;
            case "network":
                i3 = 3;
                i2 = i3;
                break;
            default:
                i2 = i3;
                break;
        }
        return new C2291a1(i2, location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), location.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m12793a(String str) {
        this.f19764c.requestLocationUpdates(str, 2000L, 0.0f, this.f19763b);
    }

    /* renamed from: a */
    public void m12795a() {
        if (this.f19764c != null) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            String bestProvider = this.f19764c.getBestProvider(criteria, true);
            AbstractC2391y2.m13568a("LocationDataProvider: best provider is " + bestProvider);
            if (bestProvider != null) {
                AbstractC2340m.m13295f(new O91(this, 13, bestProvider));
            }
        }
    }
}
