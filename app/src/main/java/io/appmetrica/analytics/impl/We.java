package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class We {
    public final String a;
    public final String b;
    public final List c;
    public final Map d;
    public final Pe e;
    public final Pe f;
    public final List g;

    public We(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Pe(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Pe(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
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

    public We(String str, String str2, List list, Map map, Pe pe, Pe pe2, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = map;
        this.e = pe;
        this.f = pe2;
        this.g = list2;
    }
}
