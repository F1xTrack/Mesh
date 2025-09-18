package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.hd */
/* loaded from: classes2.dex */
public class C3311hd implements LocationListener {

    /* renamed from: a */
    private final C3727xd f23575a;

    public C3311hd(C3727xd c3727xd) {
        this.f23575a = c3727xd;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location != null) {
            this.f23575a.m17176a(location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
