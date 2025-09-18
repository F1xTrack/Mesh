package com.yandex.metrica.impl.p022ob;

import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.pi */
/* loaded from: classes2.dex */
public class C3524pi {

    /* renamed from: a */
    public final long f24510a;

    /* renamed from: b */
    public final long f24511b;

    /* renamed from: c */
    public final long f24512c;

    /* renamed from: d */
    public final long f24513d;

    public C3524pi(long j, long j2, long j3, long j4) {
        this.f24510a = j;
        this.f24511b = j2;
        this.f24512c = j3;
        this.f24513d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3524pi.class != obj.getClass()) {
            return false;
        }
        C3524pi c3524pi = (C3524pi) obj;
        return this.f24510a == c3524pi.f24510a && this.f24511b == c3524pi.f24511b && this.f24512c == c3524pi.f24512c && this.f24513d == c3524pi.f24513d;
    }

    public int hashCode() {
        long j = this.f24510a;
        long j2 = this.f24511b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f24512c;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f24513d;
        return i2 + ((int) ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CacheControl{cellsAroundTtl=");
        sb.append(this.f24510a);
        sb.append(", wifiNetworksTtl=");
        sb.append(this.f24511b);
        sb.append(", lastKnownLocationTtl=");
        sb.append(this.f24512c);
        sb.append(", netInterfacesTtl=");
        return AbstractC11153tN0.m24913y(sb, this.f24513d, '}');
    }
}
