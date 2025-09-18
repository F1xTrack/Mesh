package com.yandex.runtime.sensors.internal;

import android.location.Location;
import android.location.LocationManager;
import com.yandex.runtime.Runtime;

/* loaded from: classes2.dex */
public class LastKnownLocation {
    private static final String TAG = "com.yandex.runtime.sensors.internal.LastKnownLocation";

    public static Location getLastKnownLocation() {
        LocationManager locationManager = (LocationManager) Runtime.getApplicationContext().getSystemService("location");
        if (locationManager == null) {
            throw new RuntimeException("Can't get LocationManager. Missed permission?");
        }
        try {
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            return lastKnownLocation != null ? lastKnownLocation : locationManager.getLastKnownLocation("network");
        } catch (SecurityException e) {
            e.toString();
            return null;
        }
    }
}
