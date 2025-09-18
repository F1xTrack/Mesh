package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class Ab {
    public final Eb a;
    public final BigDecimal b;
    public final Db c;
    public final Gb d;

    public Ab(ECommerceCartItem eCommerceCartItem) {
        this(new Eb(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Db(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Gb(eCommerceCartItem.getReferrer()));
    }

    public String toString() {
        return "CartItemWrapper{product=" + this.a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + '}';
    }

    public Ab(Eb eb, BigDecimal bigDecimal, Db db, Gb gb) {
        this.a = eb;
        this.b = bigDecimal;
        this.c = db;
        this.d = gb;
    }
}
