package com.yandex.metrica.impl.p022ob;

import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Di */
/* loaded from: classes2.dex */
public class C2560Di {

    /* renamed from: a */
    public final long f21049a;

    /* renamed from: b */
    public final long f21050b;

    /* renamed from: c */
    public final long f21051c;

    /* renamed from: d */
    public final long f21052d;

    public C2560Di(long j, long j2, long j3, long j4) {
        this.f21049a = j;
        this.f21050b = j2;
        this.f21051c = j3;
        this.f21052d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2560Di.class != obj.getClass()) {
            return false;
        }
        C2560Di c2560Di = (C2560Di) obj;
        return this.f21049a == c2560Di.f21049a && this.f21050b == c2560Di.f21050b && this.f21051c == c2560Di.f21051c && this.f21052d == c2560Di.f21052d;
    }

    public int hashCode() {
        long j = this.f21049a;
        long j2 = this.f21050b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f21051c;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f21052d;
        return i2 + ((int) ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkFingerprintingConfig{minCollectingInterval=");
        sb.append(this.f21049a);
        sb.append(", minFirstCollectingDelay=");
        sb.append(this.f21050b);
        sb.append(", minCollectingDelayAfterLaunch=");
        sb.append(this.f21051c);
        sb.append(", minRequestRetryInterval=");
        return AbstractC11153tN0.m24913y(sb, this.f21052d, '}');
    }
}
