package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import defpackage.InterfaceC3472ds1;

/* loaded from: classes2.dex */
public class Kc extends AbstractC2902ld<Jc> {
    private final InterfaceC3472ds1 f;

    public Kc(Context context, C3206xd c3206xd, C3061rn c3061rn, C2754fe c2754fe) {
        this(context, c3206xd, c3061rn, c2754fe, new C2617a2());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2902ld
    public boolean a(Jc jc) {
        Jc jc2 = jc;
        if (jc2.b != null && this.b.a(this.a)) {
            try {
                this.f.startLocationUpdates(jc2.b.a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2902ld
    public void b() {
        if (this.b.a(this.a)) {
            try {
                this.f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }

    private Kc(Context context, C3206xd c3206xd, C3061rn c3061rn, C2754fe c2754fe, C2617a2 c2617a2) {
        this(context, c3061rn, new C2803hd(c3206xd), c2617a2.a(c2754fe));
    }

    public Kc(Context context, C3061rn c3061rn, LocationListener locationListener, InterfaceC2779ge interfaceC2779ge) {
        this(context, c3061rn.b(), locationListener, interfaceC2779ge, a(context, locationListener, c3061rn));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2902ld
    public void a() {
        try {
            this.f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    private static InterfaceC3472ds1 a(Context context, LocationListener locationListener, C3061rn c3061rn) {
        if (B2.a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new com.yandex.metrica.gpllibrary.a(context, locationListener, c3061rn.b(), c3061rn, AbstractC2902ld.e);
            } catch (Throwable unused) {
            }
        }
        return new Ac();
    }

    public Kc(Context context, Looper looper, LocationListener locationListener, InterfaceC2779ge interfaceC2779ge, InterfaceC3472ds1 interfaceC3472ds1) {
        super(context, locationListener, interfaceC2779ge, looper);
        this.f = interfaceC3472ds1;
    }
}
