package com.yandex.metrica.impl.ob;

import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.kd */
/* loaded from: classes2.dex */
public class C2877kd {
    public final C3255zc a;
    public final LocationManager b;
    public final Uc c;

    public C2877kd(C3255zc c3255zc, Qi qi, Uc uc, LocationManager locationManager, Ad ad, C3230yc c3230yc) {
        this.a = c3255zc;
        this.c = uc;
        this.b = locationManager;
    }

    public static C2877kd a(C3151vd c3151vd, Ad ad, C3230yc c3230yc, LocationManager locationManager) {
        return new C2877kd(c3151vd.a, c3151vd.b, c3151vd.c, locationManager, ad, c3230yc);
    }
}
