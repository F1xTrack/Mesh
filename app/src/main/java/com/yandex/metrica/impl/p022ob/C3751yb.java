package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.yb */
/* loaded from: classes2.dex */
public class C3751yb {

    /* renamed from: a */
    public final BigDecimal f25301a;

    /* renamed from: b */
    public final String f25302b;

    public C3751yb(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f25301a);
        sb.append(", unit='");
        return AbstractC1374Vq.m8593l(sb, this.f25302b, "'}");
    }

    public C3751yb(BigDecimal bigDecimal, String str) {
        this.f25301a = bigDecimal;
        this.f25302b = str;
    }
}
