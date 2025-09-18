package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p022ob.C2968U2;
import com.yandex.varioqub.config.model.ConfigValue;
import java.math.BigDecimal;
import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public class ECommerceAmount {

    /* renamed from: a */
    public final BigDecimal f20787a;

    /* renamed from: b */
    public final String f20788b;

    public ECommerceAmount(long j, String str) {
        this(C2968U2.m15233a(j), str);
    }

    public BigDecimal getAmount() {
        return this.f20787a;
    }

    public String getUnit() {
        return this.f20788b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f20787a);
        sb.append(", unit='");
        return AbstractC1374Vq.m8593l(sb, this.f20788b, "'}");
    }

    public ECommerceAmount(double d, String str) {
        this(new BigDecimal(C2968U2.m15227a(d, ConfigValue.DOUBLE_DEFAULT_VALUE)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f20787a = bigDecimal;
        this.f20788b = str;
    }
}
