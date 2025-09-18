package com.my.tracker.obfuscated;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import defpackage.O91;

/* loaded from: classes2.dex */
public final class b1 {
    protected Location a;
    LocationManager c;
    int d = -1;
    protected final LocationListener b = new a();

    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            y2.a("LocationDataProvider: location has been updated");
            b1 b1Var = b1.this;
            b1Var.a = location;
            LocationManager locationManager = b1Var.c;
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            y2.a("LocationDataProvider: onProviderDisabled, provider – " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            y2.a("LocationDataProvider: onProviderEnabled, provider –" + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            y2.a("LocationDataProvider: onStatusChanged, provider – " + str + ", status – " + i + ", extras – " + bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a1 a(int i, Context context) {
        float accuracy;
        long time;
        String provider;
        int i2;
        int i3 = 1;
        if (i == 0) {
            return a1.g;
        }
        this.d = -1;
        if (!n1.a("android.permission.ACCESS_FINE_LOCATION", context) || !n1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            return a1.g;
        }
        if (n1.a()) {
            return a1.g;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        this.c = locationManager;
        if (locationManager == null) {
            return a1.g;
        }
        if (i == 2) {
            a();
        }
        Location location = this.a;
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
        for (String str : this.c.getAllProviders()) {
            try {
                Location lastKnownLocation = this.c.getLastKnownLocation(str);
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
                y2.a("LocationDataProvider: Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
            }
        }
        if (location == null) {
            return a1.g;
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
        return new a1(i2, location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), location.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.requestLocationUpdates(str, 2000L, 0.0f, this.b);
    }

    public void a() {
        if (this.c != null) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            String bestProvider = this.c.getBestProvider(criteria, true);
            y2.a("LocationDataProvider: best provider is " + bestProvider);
            if (bestProvider != null) {
                m.f(new O91(this, 13, bestProvider));
            }
        }
    }
}
