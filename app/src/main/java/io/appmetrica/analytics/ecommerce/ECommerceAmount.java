package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC5182hn;
import java.math.BigDecimal;
import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public class ECommerceAmount {

    /* renamed from: a */
    private final BigDecimal f29775a;

    /* renamed from: b */
    private final String f29776b;

    public ECommerceAmount(long j, String str) {
        this(AbstractC5182hn.m20508a(j), str);
    }

    public BigDecimal getAmount() {
        return this.f29775a;
    }

    public String getUnit() {
        return this.f29776b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f29775a);
        sb.append(", unit='");
        return AbstractC1374Vq.m8593l(sb, this.f29776b, "'}");
    }

    public ECommerceAmount(double d, String str) {
        this(new BigDecimal(AbstractC5182hn.m20507a(d)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f29775a = bigDecimal;
        this.f29776b = str;
    }
}
