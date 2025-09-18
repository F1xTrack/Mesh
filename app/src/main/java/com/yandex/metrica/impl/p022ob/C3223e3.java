package com.yandex.metrica.impl.p022ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.e3 */
/* loaded from: classes2.dex */
public final class C3223e3 extends Location {

    /* renamed from: a */
    private final String f23292a;

    private C3223e3(Location location, String str) {
        super(location);
        this.f23292a = str;
    }

    /* renamed from: b */
    public static C3223e3 m15815b(Location location) {
        return new C3223e3(new Location(location), "");
    }

    /* renamed from: a */
    public String m15816a() {
        return this.f23292a;
    }

    /* renamed from: a */
    public static C3223e3 m15814a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C3223e3(location2, provider);
    }
}
