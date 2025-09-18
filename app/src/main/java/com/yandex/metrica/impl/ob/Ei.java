package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;
import defpackage.AbstractC7209tN0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class Ei {
    public final long a;
    public final String b;
    public final List<Integer> c;
    public final List<Integer> d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public Ei(long j, String str, List<Integer> list, List<Integer> list2, long j2, int i, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = str;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = j2;
        this.f = i;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ei.class != obj.getClass()) {
            return false;
        }
        Ei ei = (Ei) obj;
        if (this.a == ei.a && this.e == ei.e && this.f == ei.f && this.g == ei.g && this.h == ei.h && this.i == ei.i && this.j == ei.j && this.b.equals(ei.b) && this.c.equals(ei.c)) {
            return this.d.equals(ei.d);
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + AbstractC1705Vq.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b)) * 31)) * 31;
        long j2 = this.e;
        int i = (((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f) * 31;
        long j3 = this.g;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.h;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.i;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.j;
        return i4 + ((int) ((j6 >>> 32) ^ j6));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocketConfig{secondsToLive=");
        sb.append(this.a);
        sb.append(", token='");
        sb.append(this.b);
        sb.append("', ports=");
        sb.append(this.c);
        sb.append(", portsHttp=");
        sb.append(this.d);
        sb.append(", firstDelaySeconds=");
        sb.append(this.e);
        sb.append(", launchDelaySeconds=");
        sb.append(this.f);
        sb.append(", openEventIntervalSeconds=");
        sb.append(this.g);
        sb.append(", minFailedRequestIntervalSeconds=");
        sb.append(this.h);
        sb.append(", minSuccessfulRequestIntervalSeconds=");
        sb.append(this.i);
        sb.append(", openRetryIntervalSeconds=");
        return AbstractC7209tN0.y(sb, this.j, '}');
    }
}
