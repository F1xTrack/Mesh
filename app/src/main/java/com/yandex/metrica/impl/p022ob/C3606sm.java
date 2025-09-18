package com.yandex.metrica.impl.p022ob;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.sm */
/* loaded from: classes2.dex */
public final class C3606sm {

    /* renamed from: c */
    public static final a f24784c = new a(null);

    /* renamed from: a */
    private final long f24785a;

    /* renamed from: b */
    private final int f24786b;

    /* renamed from: com.yandex.metrica.impl.ob.sm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3606sm(long j, int i) {
        this.f24785a = j;
        this.f24786b = i;
    }

    /* renamed from: a */
    public final int m16800a() {
        return this.f24786b;
    }

    /* renamed from: b */
    public final long m16801b() {
        return this.f24785a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3606sm)) {
            return false;
        }
        C3606sm c3606sm = (C3606sm) obj;
        return this.f24785a == c3606sm.f24785a && this.f24786b == c3606sm.f24786b;
    }

    public int hashCode() {
        long j = this.f24785a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f24786b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.f24785a);
        sb.append(", exponent=");
        return AbstractC1374Vq.m8591j(sb, this.f24786b, ")");
    }
}
