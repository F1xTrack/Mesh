package com.yandex.metrica.impl.ob;

import defpackage.AbstractC7209tN0;
import defpackage.EnumC5388jq1;

/* loaded from: classes2.dex */
public class Hc {
    public final EnumC5388jq1 a;
    public final long b;
    public final long c;

    public Hc(EnumC5388jq1 enumC5388jq1, long j, long j2) {
        this.a = enumC5388jq1;
        this.b = j;
        this.c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Hc.class != obj.getClass()) {
            return false;
        }
        Hc hc = (Hc) obj;
        return this.b == hc.b && this.c == hc.c && this.a == hc.a;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GplArguments{priority=");
        sb.append(this.a);
        sb.append(", durationSeconds=");
        sb.append(this.b);
        sb.append(", intervalSeconds=");
        return AbstractC7209tN0.y(sb, this.c, '}');
    }
}
