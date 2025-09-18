package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.hd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2803hd implements LocationListener {
    private final C3206xd a;

    public C2803hd(C3206xd c3206xd) {
        this.a = c3206xd;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location != null) {
            this.a.a(location);
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
