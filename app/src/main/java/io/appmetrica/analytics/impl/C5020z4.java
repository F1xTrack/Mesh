package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5020z4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;

    public C5020z4(C4972x4 c4972x4) {
        this.a = c4972x4.a;
        this.b = c4972x4.b;
        this.c = c4972x4.c;
        this.d = c4972x4.d;
        this.e = c4972x4.e;
        this.f = c4972x4.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5020z4.class != obj.getClass()) {
            return false;
        }
        C5020z4 c5020z4 = (C5020z4) obj;
        if (this.a != c5020z4.a || this.b != c5020z4.b || this.c != c5020z4.c || this.d != c5020z4.d || this.e != c5020z4.e) {
            return false;
        }
        Boolean bool = this.f;
        Boolean bool2 = c5020z4.f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int i = (((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        Boolean bool = this.f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.a + ", featuresCollectingEnabled=" + this.b + ", googleAid=" + this.c + ", simInfo=" + this.d + ", huaweiOaid=" + this.e + ", sslPinning=" + this.f + '}';
    }
}
