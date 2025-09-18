package com.yandex.metrica.gpllibrary;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.yandex.metrica.impl.ob.C3061rn;
import defpackage.EnumC5388jq1;
import defpackage.InterfaceC3472ds1;
import defpackage.S11;

/* loaded from: classes2.dex */
public final class a implements InterfaceC3472ds1 {
    public final FusedLocationProviderClient a;
    public final LocationListener b;
    public final LocationCallback c;
    public final Looper d;
    public final C3061rn e;
    public final long f;

    public a(Context context, LocationListener locationListener, Looper looper, C3061rn c3061rn, long j) {
        this.a = new S11(context).a();
        this.b = locationListener;
        this.d = looper;
        this.e = c3061rn;
        this.f = j;
        this.c = new GplLocationCallback(locationListener);
    }

    @Override // defpackage.InterfaceC3472ds1
    public final void startLocationUpdates(EnumC5388jq1 enumC5388jq1) {
        LocationRequest interval = LocationRequest.create().setInterval(this.f);
        int iOrdinal = enumC5388jq1.ordinal();
        this.a.requestLocationUpdates(interval.setPriority(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? 105 : 100 : 102 : 104), this.c, this.d);
    }

    @Override // defpackage.InterfaceC3472ds1
    public final void stopLocationUpdates() {
        this.a.removeLocationUpdates(this.c);
    }

    @Override // defpackage.InterfaceC3472ds1
    public final void updateLastKnownLocation() {
        this.a.getLastLocation().e(this.e, new GplOnSuccessListener(this.b));
    }
}
