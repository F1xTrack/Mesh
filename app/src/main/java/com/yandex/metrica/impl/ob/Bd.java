package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;

/* loaded from: classes2.dex */
class Bd extends AbstractC2902ld<Ec> {
    private final LocationManager f;
    private final String g;

    public Bd(Context context, Looper looper, LocationManager locationManager, InterfaceC2779ge interfaceC2779ge, String str, LocationListener locationListener) {
        super(context, locationListener, interfaceC2779ge, looper);
        this.f = locationManager;
        this.g = str;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2902ld
    public /* bridge */ /* synthetic */ boolean a(Ec ec) {
        return c();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2902ld
    @SuppressLint({"MissingPermission"})
    public void b() {
        Location lastKnownLocation;
        if (this.b.a(this.a)) {
            LocationManager locationManager = this.f;
            if (locationManager != null) {
                try {
                    lastKnownLocation = locationManager.getLastKnownLocation(this.g);
                } catch (Throwable unused) {
                }
            } else {
                lastKnownLocation = null;
            }
            this.c.onLocationChanged(lastKnownLocation);
        }
    }

    public boolean c() {
        if (!this.b.a(this.a)) {
            return false;
        }
        String str = this.g;
        long j = AbstractC2902ld.e;
        LocationListener locationListener = this.c;
        Looper looper = this.d;
        LocationManager locationManager = this.f;
        if (locationManager == null) {
            return false;
        }
        try {
            locationManager.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2902ld
    public void a() {
        LocationManager locationManager = this.f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.c);
            } catch (Throwable unused) {
            }
        }
    }
}
