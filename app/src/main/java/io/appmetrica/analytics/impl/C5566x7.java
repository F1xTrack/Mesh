package io.appmetrica.analytics.impl;

import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.x7 */
/* loaded from: classes2.dex */
public final class C5566x7 {

    /* renamed from: a */
    public final long f32807a;

    /* renamed from: b */
    public final int f32808b;

    public C5566x7(int i, long j) {
        this.f32807a = j;
        this.f32808b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5566x7)) {
            return false;
        }
        C5566x7 c5566x7 = (C5566x7) obj;
        return this.f32807a == c5566x7.f32807a && this.f32808b == c5566x7.f32808b;
    }

    public final int hashCode() {
        long j = this.f32807a;
        return this.f32808b + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.f32807a);
        sb.append(", exponent=");
        return AbstractC7222ym.m26235l(sb, this.f32808b, ')');
    }
}
