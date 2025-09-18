package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class B3 {
    public final We a;
    public final BigDecimal b;
    public final Pe c;
    public final Of d;

    public B3(ECommerceCartItem eCommerceCartItem) {
        this(new We(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Pe(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Of(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + '}';
    }

    public B3(We we, BigDecimal bigDecimal, Pe pe, Of of) {
        this.a = we;
        this.b = bigDecimal;
        this.c = pe;
        this.d = of;
    }
}
