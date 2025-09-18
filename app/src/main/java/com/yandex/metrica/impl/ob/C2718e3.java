package com.yandex.metrica.impl.ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2718e3 extends Location {
    private final String a;

    private C2718e3(Location location, String str) {
        super(location);
        this.a = str;
    }

    public static C2718e3 b(Location location) {
        return new C2718e3(new Location(location), "");
    }

    public String a() {
        return this.a;
    }

    public static C2718e3 a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C2718e3(location2, provider);
    }
}
