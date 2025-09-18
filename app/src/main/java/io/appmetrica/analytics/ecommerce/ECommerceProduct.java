package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;
import p000.AbstractC11153tN0;

/* loaded from: classes2.dex */
public class ECommerceProduct {

    /* renamed from: a */
    private final String f29786a;

    /* renamed from: b */
    private String f29787b;

    /* renamed from: c */
    private List f29788c;

    /* renamed from: d */
    private Map f29789d;

    /* renamed from: e */
    private ECommercePrice f29790e;

    /* renamed from: f */
    private ECommercePrice f29791f;

    /* renamed from: g */
    private List f29792g;

    public ECommerceProduct(String str) {
        this.f29786a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f29790e;
    }

    public List<String> getCategoriesPath() {
        return this.f29788c;
    }

    public String getName() {
        return this.f29787b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f29791f;
    }

    public Map<String, String> getPayload() {
        return this.f29789d;
    }

    public List<String> getPromocodes() {
        return this.f29792g;
    }

    public String getSku() {
        return this.f29786a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f29790e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f29788c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f29787b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f29791f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f29789d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f29792g = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceProduct{sku='");
        sb.append(this.f29786a);
        sb.append("', name='");
        sb.append(this.f29787b);
        sb.append("', categoriesPath=");
        sb.append(this.f29788c);
        sb.append(", payload=");
        sb.append(this.f29789d);
        sb.append(", actualPrice=");
        sb.append(this.f29790e);
        sb.append(", originalPrice=");
        sb.append(this.f29791f);
        sb.append(", promocodes=");
        return AbstractC11153tN0.m24883A(sb, this.f29792g, '}');
    }
}
