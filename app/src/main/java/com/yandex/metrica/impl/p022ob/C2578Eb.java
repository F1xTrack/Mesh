package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceProduct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Eb */
/* loaded from: classes2.dex */
public class C2578Eb {

    /* renamed from: a */
    public final String f21104a;

    /* renamed from: b */
    public final String f21105b;

    /* renamed from: c */
    public final List<String> f21106c;

    /* renamed from: d */
    public final Map<String, String> f21107d;

    /* renamed from: e */
    public final C2553Db f21108e;

    /* renamed from: f */
    public final C2553Db f21109f;

    /* renamed from: g */
    public final List<String> f21110g;

    public C2578Eb(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), C2968U2.m15234a((Collection) eCommerceProduct.getCategoriesPath()), C2968U2.m15251c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C2553Db(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C2553Db(eCommerceProduct.getOriginalPrice()), C2968U2.m15234a((Collection) eCommerceProduct.getPromocodes()));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductWrapper{sku='");
        sb.append(this.f21104a);
        sb.append("', name='");
        sb.append(this.f21105b);
        sb.append("', categoriesPath=");
        sb.append(this.f21106c);
        sb.append(", payload=");
        sb.append(this.f21107d);
        sb.append(", actualPrice=");
        sb.append(this.f21108e);
        sb.append(", originalPrice=");
        sb.append(this.f21109f);
        sb.append(", promocodes=");
        return AbstractC11153tN0.m24883A(sb, this.f21110g, '}');
    }

    public C2578Eb(String str, String str2, List<String> list, Map<String, String> map, C2553Db c2553Db, C2553Db c2553Db2, List<String> list2) {
        this.f21104a = str;
        this.f21105b = str2;
        this.f21106c = list;
        this.f21107d = map;
        this.f21108e = c2553Db;
        this.f21109f = c2553Db2;
        this.f21110g = list2;
    }
}
