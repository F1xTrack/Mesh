package com.yandex.metrica.gpllibrary;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.yandex.metrica.impl.p022ob.C3581rn;
import p000.EnumC9932jq1;
import p000.InterfaceC9168ds1;
import p000.S11;

/* renamed from: com.yandex.metrica.gpllibrary.a */
/* loaded from: classes2.dex */
public final class C2463a implements InterfaceC9168ds1 {

    /* renamed from: a */
    public final FusedLocationProviderClient f20814a;

    /* renamed from: b */
    public final LocationListener f20815b;

    /* renamed from: c */
    public final LocationCallback f20816c;

    /* renamed from: d */
    public final Looper f20817d;

    /* renamed from: e */
    public final C3581rn f20818e;

    /* renamed from: f */
    public final long f20819f;

    public C2463a(Context context, LocationListener locationListener, Looper looper, C3581rn c3581rn, long j) {
        this.f20814a = new S11(context).m7148a();
        this.f20815b = locationListener;
        this.f20817d = looper;
        this.f20818e = c3581rn;
        this.f20819f = j;
        this.f20816c = new GplLocationCallback(locationListener);
    }

    @Override // p000.InterfaceC9168ds1
    public final void startLocationUpdates(EnumC9932jq1 enumC9932jq1) {
        LocationRequest interval = LocationRequest.create().setInterval(this.f20819f);
        int iOrdinal = enumC9932jq1.ordinal();
        this.f20814a.requestLocationUpdates(interval.setPriority(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? 105 : 100 : 102 : 104), this.f20816c, this.f20817d);
    }

    @Override // p000.InterfaceC9168ds1
    public final void stopLocationUpdates() {
        this.f20814a.removeLocationUpdates(this.f20816c);
    }

    @Override // p000.InterfaceC9168ds1
    public final void updateLastKnownLocation() {
        this.f20814a.getLastLocation().mo11138e(this.f20818e, new GplOnSuccessListener(this.f20815b));
    }
}
