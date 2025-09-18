package io.appmetrica.analytics.impl;

import defpackage.AbstractC8235ym;

/* renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4975x7 {
    public final long a;
    public final int b;

    public C4975x7(int i, long j) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4975x7)) {
            return false;
        }
        C4975x7 c4975x7 = (C4975x7) obj;
        return this.a == c4975x7.a && this.b == c4975x7.b;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.a);
        sb.append(", exponent=");
        return AbstractC8235ym.l(sb, this.b, ')');
    }
}
