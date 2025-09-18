package com.yandex.metrica.gpllibrary;

import android.location.Location;
import android.location.LocationListener;
import p000.InterfaceC9307ey0;

/* loaded from: classes2.dex */
class GplOnSuccessListener implements InterfaceC9307ey0 {
    private final LocationListener mLocationListener;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Location location) {
        this.mLocationListener.onLocationChanged(location);
    }
}
