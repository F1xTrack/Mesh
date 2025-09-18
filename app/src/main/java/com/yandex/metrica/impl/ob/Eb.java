package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceProduct;
import defpackage.AbstractC7209tN0;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Eb {
    public final String a;
    public final String b;
    public final List<String> c;
    public final Map<String, String> d;
    public final Db e;
    public final Db f;
    public final List<String> g;

    public Eb(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), U2.a((Collection) eCommerceProduct.getCategoriesPath()), U2.c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Db(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Db(eCommerceProduct.getOriginalPrice()), U2.a((Collection) eCommerceProduct.getPromocodes()));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductWrapper{sku='");
        sb.append(this.a);
        sb.append("', name='");
        sb.append(this.b);
        sb.append("', categoriesPath=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", actualPrice=");
        sb.append(this.e);
        sb.append(", originalPrice=");
        sb.append(this.f);
        sb.append(", promocodes=");
        return AbstractC7209tN0.A(sb, this.g, '}');
    }

    public Eb(String str, String str2, List<String> list, Map<String, String> map, Db db, Db db2, List<String> list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = map;
        this.e = db;
        this.f = db2;
        this.g = list2;
    }
}
