package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import p000.InterfaceC9307ey0;

/* loaded from: classes2.dex */
class GplOnSuccessListener implements InterfaceC9307ey0 {

    /* renamed from: a */
    private final LocationListener f29810a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f29810a = locationListener;
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Location location) {
        this.f29810a.onLocationChanged(location);
    }
}
