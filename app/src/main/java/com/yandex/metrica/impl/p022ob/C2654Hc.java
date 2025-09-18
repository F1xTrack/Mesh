package com.yandex.metrica.impl.p022ob;

import p000.AbstractC11153tN0;
import p000.EnumC9932jq1;

/* renamed from: com.yandex.metrica.impl.ob.Hc */
/* loaded from: classes2.dex */
public class C2654Hc {

    /* renamed from: a */
    public final EnumC9932jq1 f21359a;

    /* renamed from: b */
    public final long f21360b;

    /* renamed from: c */
    public final long f21361c;

    public C2654Hc(EnumC9932jq1 enumC9932jq1, long j, long j2) {
        this.f21359a = enumC9932jq1;
        this.f21360b = j;
        this.f21361c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2654Hc.class != obj.getClass()) {
            return false;
        }
        C2654Hc c2654Hc = (C2654Hc) obj;
        return this.f21360b == c2654Hc.f21360b && this.f21361c == c2654Hc.f21361c && this.f21359a == c2654Hc.f21359a;
    }

    public int hashCode() {
        int iHashCode = this.f21359a.hashCode() * 31;
        long j = this.f21360b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f21361c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GplArguments{priority=");
        sb.append(this.f21359a);
        sb.append(", durationSeconds=");
        sb.append(this.f21360b);
        sb.append(", intervalSeconds=");
        return AbstractC11153tN0.m24913y(sb, this.f21361c, '}');
    }
}
