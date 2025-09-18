package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.B3 */
/* loaded from: classes2.dex */
public final class C4385B3 {

    /* renamed from: a */
    public final C4902We f29889a;

    /* renamed from: b */
    public final BigDecimal f29890b;

    /* renamed from: c */
    public final C4735Pe f29891c;

    /* renamed from: d */
    public final C4712Of f29892d;

    public C4385B3(ECommerceCartItem eCommerceCartItem) {
        this(new C4902We(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C4735Pe(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C4712Of(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f29889a + ", quantity=" + this.f29890b + ", revenue=" + this.f29891c + ", referrer=" + this.f29892d + '}';
    }

    public C4385B3(C4902We c4902We, BigDecimal bigDecimal, C4735Pe c4735Pe, C4712Of c4712Of) {
        this.f29889a = c4902We;
        this.f29890b = bigDecimal;
        this.f29891c = c4735Pe;
        this.f29892d = c4712Of;
    }
}
