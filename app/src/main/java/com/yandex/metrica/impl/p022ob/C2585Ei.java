package com.yandex.metrica.impl.p022ob;

import java.util.Collections;
import java.util.List;
import p000.AbstractC11153tN0;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.Ei */
/* loaded from: classes2.dex */
public class C2585Ei {

    /* renamed from: a */
    public final long f21122a;

    /* renamed from: b */
    public final String f21123b;

    /* renamed from: c */
    public final List<Integer> f21124c;

    /* renamed from: d */
    public final List<Integer> f21125d;

    /* renamed from: e */
    public final long f21126e;

    /* renamed from: f */
    public final int f21127f;

    /* renamed from: g */
    public final long f21128g;

    /* renamed from: h */
    public final long f21129h;

    /* renamed from: i */
    public final long f21130i;

    /* renamed from: j */
    public final long f21131j;

    public C2585Ei(long j, String str, List<Integer> list, List<Integer> list2, long j2, int i, long j3, long j4, long j5, long j6) {
        this.f21122a = j;
        this.f21123b = str;
        this.f21124c = Collections.unmodifiableList(list);
        this.f21125d = Collections.unmodifiableList(list2);
        this.f21126e = j2;
        this.f21127f = i;
        this.f21128g = j3;
        this.f21129h = j4;
        this.f21130i = j5;
        this.f21131j = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2585Ei.class != obj.getClass()) {
            return false;
        }
        C2585Ei c2585Ei = (C2585Ei) obj;
        if (this.f21122a == c2585Ei.f21122a && this.f21126e == c2585Ei.f21126e && this.f21127f == c2585Ei.f21127f && this.f21128g == c2585Ei.f21128g && this.f21129h == c2585Ei.f21129h && this.f21130i == c2585Ei.f21130i && this.f21131j == c2585Ei.f21131j && this.f21123b.equals(c2585Ei.f21123b) && this.f21124c.equals(c2585Ei.f21124c)) {
            return this.f21125d.equals(c2585Ei.f21125d);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f21122a;
        int iHashCode = (this.f21125d.hashCode() + ((this.f21124c.hashCode() + AbstractC1374Vq.m8586e(((int) (j ^ (j >>> 32))) * 31, 31, this.f21123b)) * 31)) * 31;
        long j2 = this.f21126e;
        int i = (((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f21127f) * 31;
        long j3 = this.f21128g;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f21129h;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f21130i;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f21131j;
        return i4 + ((int) ((j6 >>> 32) ^ j6));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocketConfig{secondsToLive=");
        sb.append(this.f21122a);
        sb.append(", token='");
        sb.append(this.f21123b);
        sb.append("', ports=");
        sb.append(this.f21124c);
        sb.append(", portsHttp=");
        sb.append(this.f21125d);
        sb.append(", firstDelaySeconds=");
        sb.append(this.f21126e);
        sb.append(", launchDelaySeconds=");
        sb.append(this.f21127f);
        sb.append(", openEventIntervalSeconds=");
        sb.append(this.f21128g);
        sb.append(", minFailedRequestIntervalSeconds=");
        sb.append(this.f21129h);
        sb.append(", minSuccessfulRequestIntervalSeconds=");
        sb.append(this.f21130i);
        sb.append(", openRetryIntervalSeconds=");
        return AbstractC11153tN0.m24913y(sb, this.f21131j, '}');
    }
}
