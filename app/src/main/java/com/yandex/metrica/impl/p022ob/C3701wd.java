package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.wd */
/* loaded from: classes2.dex */
public class C3701wd {

    /* renamed from: a */
    private final LocationManager f25176a;

    /* renamed from: b */
    private final C3145b3 f25177b;

    /* renamed from: c */
    private final C3760yk f25178c = C2842P0.m14728i().m14752w();

    public C3701wd(Context context) {
        this.f25176a = (LocationManager) context.getSystemService("location");
        this.f25177b = C3145b3.m15668a(context);
    }

    /* renamed from: a */
    public LocationManager m17128a() {
        return this.f25176a;
    }

    /* renamed from: b */
    public C3760yk m17129b() {
        return this.f25178c;
    }

    /* renamed from: c */
    public C3145b3 m17130c() {
        return this.f25177b;
    }
}
