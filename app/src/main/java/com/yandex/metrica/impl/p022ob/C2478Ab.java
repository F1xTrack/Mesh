package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: com.yandex.metrica.impl.ob.Ab */
/* loaded from: classes2.dex */
public class C2478Ab {

    /* renamed from: a */
    public final C2578Eb f20841a;

    /* renamed from: b */
    public final BigDecimal f20842b;

    /* renamed from: c */
    public final C2553Db f20843c;

    /* renamed from: d */
    public final C2628Gb f20844d;

    public C2478Ab(ECommerceCartItem eCommerceCartItem) {
        this(new C2578Eb(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C2553Db(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C2628Gb(eCommerceCartItem.getReferrer()));
    }

    public String toString() {
        return "CartItemWrapper{product=" + this.f20841a + ", quantity=" + this.f20842b + ", revenue=" + this.f20843c + ", referrer=" + this.f20844d + '}';
    }

    public C2478Ab(C2578Eb c2578Eb, BigDecimal bigDecimal, C2553Db c2553Db, C2628Gb c2628Gb) {
        this.f20841a = c2578Eb;
        this.f20842b = bigDecimal;
        this.f20843c = c2553Db;
        this.f20844d = c2628Gb;
    }
}
