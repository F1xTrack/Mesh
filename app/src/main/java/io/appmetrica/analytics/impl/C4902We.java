package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.We */
/* loaded from: classes2.dex */
public final class C4902We {

    /* renamed from: a */
    public final String f30980a;

    /* renamed from: b */
    public final String f30981b;

    /* renamed from: c */
    public final List f30982c;

    /* renamed from: d */
    public final Map f30983d;

    /* renamed from: e */
    public final C4735Pe f30984e;

    /* renamed from: f */
    public final C4735Pe f30985f;

    /* renamed from: g */
    public final List f30986g;

    public C4902We(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C4735Pe(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C4735Pe(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductWrapper{sku='");
        sb.append(this.f30980a);
        sb.append("', name='");
        sb.append(this.f30981b);
        sb.append("', categoriesPath=");
        sb.append(this.f30982c);
        sb.append(", payload=");
        sb.append(this.f30983d);
        sb.append(", actualPrice=");
        sb.append(this.f30984e);
        sb.append(", originalPrice=");
        sb.append(this.f30985f);
        sb.append(", promocodes=");
        return AbstractC11153tN0.m24883A(sb, this.f30986g, '}');
    }

    public C4902We(String str, String str2, List list, Map map, C4735Pe c4735Pe, C4735Pe c4735Pe2, List list2) {
        this.f30980a = str;
        this.f30981b = str2;
        this.f30982c = list;
        this.f30983d = map;
        this.f30984e = c4735Pe;
        this.f30985f = c4735Pe2;
        this.f30986g = list2;
    }
}
