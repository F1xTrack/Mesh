package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public class Di {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public Di(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Di.class != obj.getClass()) {
            return false;
        }
        Di di = (Di) obj;
        return this.a == di.a && this.b == di.b && this.c == di.c && this.d == di.d;
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
        StringBuilder sb = new StringBuilder("SdkFingerprintingConfig{minCollectingInterval=");
        sb.append(this.a);
        sb.append(", minFirstCollectingDelay=");
        sb.append(this.b);
        sb.append(", minCollectingDelayAfterLaunch=");
        sb.append(this.c);
        sb.append(", minRequestRetryInterval=");
        return AbstractC7209tN0.y(sb, this.d, '}');
    }
}
