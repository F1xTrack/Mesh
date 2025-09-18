package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Jc */
/* loaded from: classes2.dex */
public class C2704Jc {

    /* renamed from: a */
    public final C3753yd f21549a;

    /* renamed from: b */
    public final C2654Hc f21550b;

    public C2704Jc(C3753yd c3753yd, C2654Hc c2654Hc) {
        this.f21549a = c3753yd;
        this.f21550b = c2654Hc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2704Jc.class != obj.getClass()) {
            return false;
        }
        C2704Jc c2704Jc = (C2704Jc) obj;
        if (!this.f21549a.equals(c2704Jc.f21549a)) {
            return false;
        }
        C2654Hc c2654Hc = this.f21550b;
        C2654Hc c2654Hc2 = c2704Jc.f21550b;
        return c2654Hc != null ? c2654Hc.equals(c2654Hc2) : c2654Hc2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f21549a.hashCode() * 31;
        C2654Hc c2654Hc = this.f21550b;
        return iHashCode + (c2654Hc != null ? c2654Hc.hashCode() : 0);
    }

    public String toString() {
        return "GplCollectingConfig{providerAccessFlags=" + this.f21549a + ", arguments=" + this.f21550b + '}';
    }
}
