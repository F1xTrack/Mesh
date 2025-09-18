package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC5182hn;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class ECommerceCartItem {

    /* renamed from: a */
    private final ECommerceProduct f29777a;

    /* renamed from: b */
    private final BigDecimal f29778b;

    /* renamed from: c */
    private final ECommercePrice f29779c;

    /* renamed from: d */
    private ECommerceReferrer f29780d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, AbstractC5182hn.m20508a(j));
    }

    public ECommerceProduct getProduct() {
        return this.f29777a;
    }

    public BigDecimal getQuantity() {
        return this.f29778b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f29780d;
    }

    public ECommercePrice getRevenue() {
        return this.f29779c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f29780d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f29777a + ", quantity=" + this.f29778b + ", revenue=" + this.f29779c + ", referrer=" + this.f29780d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC5182hn.m20507a(d)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f29777a = eCommerceProduct;
        this.f29778b = bigDecimal;
        this.f29779c = eCommercePrice;
    }
}
