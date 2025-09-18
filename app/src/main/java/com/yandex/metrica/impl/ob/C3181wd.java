package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.wd */
/* loaded from: classes2.dex */
public class C3181wd {
    private final LocationManager a;
    private final C2643b3 b;
    private final C3238yk c = P0.i().w();

    public C3181wd(Context context) {
        this.a = (LocationManager) context.getSystemService("location");
        this.b = C2643b3.a(context);
    }

    public LocationManager a() {
        return this.a;
    }

    public C3238yk b() {
        return this.c;
    }

    public C2643b3 c() {
        return this.b;
    }
}
