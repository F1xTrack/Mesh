package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
class GplLocationCallback extends LocationCallback {

    /* renamed from: a */
    private final LocationListener f29809a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f29809a = locationListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.f29809a.onLocationChanged(locationResult.getLastLocation());
    }
}
