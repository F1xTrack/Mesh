package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.yandex.metrica.impl.ob.sm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3085sm {
    public static final a c = new a(null);
    private final long a;
    private final int b;

    /* renamed from: com.yandex.metrica.impl.ob.sm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3085sm(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3085sm)) {
            return false;
        }
        C3085sm c3085sm = (C3085sm) obj;
        return this.a == c3085sm.a && this.b == c3085sm.b;
    }

    public int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.a);
        sb.append(", exponent=");
        return AbstractC1705Vq.j(sb, this.b, ")");
    }
}
