package com.yandex.metrica.impl.p022ob;

import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Dc */
/* loaded from: classes2.dex */
public class C2554Dc {

    /* renamed from: a */
    public final long f21017a;

    /* renamed from: b */
    public final long f21018b;

    public C2554Dc(long j, long j2) {
        this.f21017a = j;
        this.f21018b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2554Dc.class != obj.getClass()) {
            return false;
        }
        C2554Dc c2554Dc = (C2554Dc) obj;
        return this.f21017a == c2554Dc.f21017a && this.f21018b == c2554Dc.f21018b;
    }

    public int hashCode() {
        long j = this.f21017a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f21018b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForcedCollectingArguments{durationSeconds=");
        sb.append(this.f21017a);
        sb.append(", intervalSeconds=");
        return AbstractC11153tN0.m24913y(sb, this.f21018b, '}');
    }
}
