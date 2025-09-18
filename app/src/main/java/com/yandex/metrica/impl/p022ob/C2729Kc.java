package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.yandex.metrica.gpllibrary.C2463a;
import p000.InterfaceC9168ds1;

/* renamed from: com.yandex.metrica.impl.ob.Kc */
/* loaded from: classes2.dex */
public class C2729Kc extends AbstractC3415ld<C2704Jc> {

    /* renamed from: f */
    private final InterfaceC9168ds1 f21583f;

    public C2729Kc(Context context, C3727xd c3727xd, C3581rn c3581rn, C3260fe c3260fe) {
        this(context, c3727xd, c3581rn, c3260fe, new C3118a2());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3415ld
    /* renamed from: a */
    public boolean mo13928a(C2704Jc c2704Jc) {
        C2704Jc c2704Jc2 = c2704Jc;
        if (c2704Jc2.f21550b != null && this.f24187b.mo15433a(this.f24186a)) {
            try {
                this.f21583f.startLocationUpdates(c2704Jc2.f21550b.f21359a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3415ld
    /* renamed from: b */
    public void mo13929b() {
        if (this.f24187b.mo15433a(this.f24186a)) {
            try {
                this.f21583f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }

    private C2729Kc(Context context, C3727xd c3727xd, C3581rn c3581rn, C3260fe c3260fe, C3118a2 c3118a2) {
        this(context, c3581rn, new C3311hd(c3727xd), c3118a2.m15595a(c3260fe));
    }

    public C2729Kc(Context context, C3581rn c3581rn, LocationListener locationListener, InterfaceC3286ge interfaceC3286ge) {
        this(context, c3581rn.m16706b(), locationListener, interfaceC3286ge, m14474a(context, locationListener, c3581rn));
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3415ld
    /* renamed from: a */
    public void mo13927a() {
        try {
            this.f21583f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static InterfaceC9168ds1 m14474a(Context context, LocationListener locationListener, C3581rn c3581rn) {
        if (C2494B2.m13908a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new C2463a(context, locationListener, c3581rn.m16706b(), c3581rn, AbstractC3415ld.f24185e);
            } catch (Throwable unused) {
            }
        }
        return new C2479Ac();
    }

    public C2729Kc(Context context, Looper looper, LocationListener locationListener, InterfaceC3286ge interfaceC3286ge, InterfaceC9168ds1 interfaceC9168ds1) {
        super(context, locationListener, interfaceC3286ge, looper);
        this.f21583f = interfaceC9168ds1;
    }
}
