package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.Bd */
/* loaded from: classes2.dex */
class C2505Bd extends AbstractC3415ld<C2579Ec> {

    /* renamed from: f */
    private final LocationManager f20928f;

    /* renamed from: g */
    private final String f20929g;

    public C2505Bd(Context context, Looper looper, LocationManager locationManager, InterfaceC3286ge interfaceC3286ge, String str, LocationListener locationListener) {
        super(context, locationListener, interfaceC3286ge, looper);
        this.f20928f = locationManager;
        this.f20929g = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3415ld
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo13928a(C2579Ec c2579Ec) {
        return m13930c();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3415ld
    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public void mo13929b() {
        Location lastKnownLocation;
        if (this.f24187b.mo15433a(this.f24186a)) {
            LocationManager locationManager = this.f20928f;
            if (locationManager != null) {
                try {
                    lastKnownLocation = locationManager.getLastKnownLocation(this.f20929g);
                } catch (Throwable unused) {
                }
            } else {
                lastKnownLocation = null;
            }
            this.f24188c.onLocationChanged(lastKnownLocation);
        }
    }

    /* renamed from: c */
    public boolean m13930c() {
        if (!this.f24187b.mo15433a(this.f24186a)) {
            return false;
        }
        String str = this.f20929g;
        long j = AbstractC3415ld.f24185e;
        LocationListener locationListener = this.f24188c;
        Looper looper = this.f24189d;
        LocationManager locationManager = this.f20928f;
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

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3415ld
    /* renamed from: a */
    public void mo13927a() {
        LocationManager locationManager = this.f20928f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f24188c);
            } catch (Throwable unused) {
            }
        }
    }
}
