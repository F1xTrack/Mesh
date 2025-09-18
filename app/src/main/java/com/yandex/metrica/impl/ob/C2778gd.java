package com.yandex.metrica.impl.ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.gd */
/* loaded from: classes2.dex */
class C2778gd {
    private Uc a;
    private AbstractC2690d0 b;
    private Location c = null;
    private long d;
    private R2 e;
    private Ad f;
    private C3230yc g;

    public C2778gd(Uc uc, AbstractC2690d0 abstractC2690d0, Location location, long j, R2 r2, Ad ad, C3230yc c3230yc) {
        this.a = uc;
        this.b = abstractC2690d0;
        this.d = j;
        this.e = r2;
        this.f = ad;
        this.g = c3230yc;
    }

    private boolean b(Location location) {
        Uc uc;
        if (location == null || (uc = this.a) == null) {
            return false;
        }
        if (this.c != null) {
            boolean zA = this.e.a(this.d, uc.a, "isSavedLocationOutdated");
            boolean z = location.distanceTo(this.c) > this.a.b;
            boolean z2 = this.c == null || location.getTime() - this.c.getTime() >= 0;
            if ((!zA && !z) || !z2) {
                return false;
            }
        }
        return true;
    }

    public void a(Location location) {
        if (b(location)) {
            this.c = location;
            this.d = System.currentTimeMillis();
            this.b.a(location);
            this.f.a();
            this.g.a();
        }
    }

    public void a(Uc uc) {
        this.a = uc;
    }
}
