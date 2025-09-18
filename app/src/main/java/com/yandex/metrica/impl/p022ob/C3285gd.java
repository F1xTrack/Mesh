package com.yandex.metrica.impl.p022ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.gd */
/* loaded from: classes2.dex */
class C3285gd {

    /* renamed from: a */
    private C2978Uc f23508a;

    /* renamed from: b */
    private AbstractC3194d0 f23509b;

    /* renamed from: c */
    private Location f23510c = null;

    /* renamed from: d */
    private long f23511d;

    /* renamed from: e */
    private C2893R2 f23512e;

    /* renamed from: f */
    private C2480Ad f23513f;

    /* renamed from: g */
    private C3752yc f23514g;

    public C3285gd(C2978Uc c2978Uc, AbstractC3194d0 abstractC3194d0, Location location, long j, C2893R2 c2893r2, C2480Ad c2480Ad, C3752yc c3752yc) {
        this.f23508a = c2978Uc;
        this.f23509b = abstractC3194d0;
        this.f23511d = j;
        this.f23512e = c2893r2;
        this.f23513f = c2480Ad;
        this.f23514g = c3752yc;
    }

    /* renamed from: b */
    private boolean m15993b(Location location) {
        C2978Uc c2978Uc;
        if (location == null || (c2978Uc = this.f23508a) == null) {
            return false;
        }
        if (this.f23510c != null) {
            boolean zM14969a = this.f23512e.m14969a(this.f23511d, c2978Uc.f22439a, "isSavedLocationOutdated");
            boolean z = location.distanceTo(this.f23510c) > this.f23508a.f22440b;
            boolean z2 = this.f23510c == null || location.getTime() - this.f23510c.getTime() >= 0;
            if ((!zM14969a && !z) || !z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m15994a(Location location) {
        if (m15993b(location)) {
            this.f23510c = location;
            this.f23511d = System.currentTimeMillis();
            this.f23509b.m15722a(location);
            this.f23513f.mo13856a();
            this.f23514g.m17232a();
        }
    }

    /* renamed from: a */
    public void m15995a(C2978Uc c2978Uc) {
        this.f23508a = c2978Uc;
    }
}
