package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import defpackage.AbstractC1705Vq;
import java.math.BigDecimal;

/* renamed from: com.yandex.metrica.impl.ob.yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3229yb {
    public final BigDecimal a;
    public final String b;

    public C3229yb(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.a);
        sb.append(", unit='");
        return AbstractC1705Vq.l(sb, this.b, "'}");
    }

    public C3229yb(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }
}
