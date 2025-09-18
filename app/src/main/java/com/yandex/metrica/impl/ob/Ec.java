package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Ec {
    public final C3231yd a;
    public final Dc b;

    public Ec(C3231yd c3231yd, Dc dc) {
        this.a = c3231yd;
        this.b = dc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ec.class != obj.getClass()) {
            return false;
        }
        Ec ec = (Ec) obj;
        if (!this.a.equals(ec.a)) {
            return false;
        }
        Dc dc = this.b;
        Dc dc2 = ec.b;
        return dc != null ? dc.equals(dc2) : dc2 == null;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Dc dc = this.b;
        return iHashCode + (dc != null ? dc.hashCode() : 0);
    }

    public String toString() {
        return "ForcedCollectingConfig{providerAccessFlags=" + this.a + ", arguments=" + this.b + '}';
    }
}
