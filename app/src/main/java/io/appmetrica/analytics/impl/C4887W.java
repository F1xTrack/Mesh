package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;
import p000.AbstractC1374Vq;

/* renamed from: io.appmetrica.analytics.impl.W */
/* loaded from: classes2.dex */
public final class C4887W {

    /* renamed from: a */
    public final BigDecimal f30877a;

    /* renamed from: b */
    public final String f30878b;

    public C4887W(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f30877a);
        sb.append(", unit='");
        return AbstractC1374Vq.m8593l(sb, this.f30878b, "'}");
    }

    public C4887W(BigDecimal bigDecimal, String str) {
        this.f30877a = bigDecimal;
        this.f30878b = str;
    }
}
