package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p022ob.C2968U2;
import com.yandex.varioqub.config.model.ConfigValue;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class ECommerceCartItem {

    /* renamed from: a */
    public final ECommerceProduct f20789a;

    /* renamed from: b */
    public final BigDecimal f20790b;

    /* renamed from: c */
    public final ECommercePrice f20791c;

    /* renamed from: d */
    public ECommerceReferrer f20792d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, C2968U2.m15233a(j));
    }

    public ECommerceProduct getProduct() {
        return this.f20789a;
    }

    public BigDecimal getQuantity() {
        return this.f20790b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f20792d;
    }

    public ECommercePrice getRevenue() {
        return this.f20791c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f20792d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f20789a + ", quantity=" + this.f20790b + ", revenue=" + this.f20791c + ", referrer=" + this.f20792d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(C2968U2.m15227a(d, ConfigValue.DOUBLE_DEFAULT_VALUE)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f20789a = eCommerceProduct;
        this.f20790b = bigDecimal;
        this.f20791c = eCommercePrice;
    }
}
