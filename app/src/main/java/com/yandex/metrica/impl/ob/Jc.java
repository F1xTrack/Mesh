package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Jc {
    public final C3231yd a;
    public final Hc b;

    public Jc(C3231yd c3231yd, Hc hc) {
        this.a = c3231yd;
        this.b = hc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Jc.class != obj.getClass()) {
            return false;
        }
        Jc jc = (Jc) obj;
        if (!this.a.equals(jc.a)) {
            return false;
        }
        Hc hc = this.b;
        Hc hc2 = jc.b;
        return hc != null ? hc.equals(hc2) : hc2 == null;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Hc hc = this.b;
        return iHashCode + (hc != null ? hc.hashCode() : 0);
    }

    public String toString() {
        return "GplCollectingConfig{providerAccessFlags=" + this.a + ", arguments=" + this.b + '}';
    }
}
