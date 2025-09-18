package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;

/* renamed from: com.yandex.metrica.impl.ob.pi */
/* loaded from: classes2.dex */
public class C3007pi {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public C3007pi(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3007pi.class != obj.getClass()) {
            return false;
        }
        C3007pi c3007pi = (C3007pi) obj;
        return this.a == c3007pi.a && this.b == c3007pi.b && this.c == c3007pi.c && this.d == c3007pi.d;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.d;
        return i2 + ((int) ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CacheControl{cellsAroundTtl=");
        sb.append(this.a);
        sb.append(", wifiNetworksTtl=");
        sb.append(this.b);
        sb.append(", lastKnownLocationTtl=");
        sb.append(this.c);
        sb.append(", netInterfacesTtl=");
        return AbstractC7209tN0.y(sb, this.d, '}');
    }
}
