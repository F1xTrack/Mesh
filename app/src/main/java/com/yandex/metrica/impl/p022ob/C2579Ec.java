package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Ec */
/* loaded from: classes2.dex */
public class C2579Ec {

    /* renamed from: a */
    public final C3753yd f21111a;

    /* renamed from: b */
    public final C2554Dc f21112b;

    public C2579Ec(C3753yd c3753yd, C2554Dc c2554Dc) {
        this.f21111a = c3753yd;
        this.f21112b = c2554Dc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2579Ec.class != obj.getClass()) {
            return false;
        }
        C2579Ec c2579Ec = (C2579Ec) obj;
        if (!this.f21111a.equals(c2579Ec.f21111a)) {
            return false;
        }
        C2554Dc c2554Dc = this.f21112b;
        C2554Dc c2554Dc2 = c2579Ec.f21112b;
        return c2554Dc != null ? c2554Dc.equals(c2554Dc2) : c2554Dc2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f21111a.hashCode() * 31;
        C2554Dc c2554Dc = this.f21112b;
        return iHashCode + (c2554Dc != null ? c2554Dc.hashCode() : 0);
    }

    public String toString() {
        return "ForcedCollectingConfig{providerAccessFlags=" + this.f21111a + ", arguments=" + this.f21112b + '}';
    }
}
