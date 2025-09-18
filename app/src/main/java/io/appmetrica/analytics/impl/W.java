package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class W {
    public final BigDecimal a;
    public final String b;

    public W(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.a);
        sb.append(", unit='");
        return AbstractC1705Vq.l(sb, this.b, "'}");
    }

    public W(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }
}
