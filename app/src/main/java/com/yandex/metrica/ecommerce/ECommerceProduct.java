package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;
import p000.AbstractC11153tN0;

/* loaded from: classes2.dex */
public class ECommerceProduct {

    /* renamed from: a */
    public final String f20799a;

    /* renamed from: b */
    public String f20800b;

    /* renamed from: c */
    public List f20801c;

    /* renamed from: d */
    public Map f20802d;

    /* renamed from: e */
    public ECommercePrice f20803e;

    /* renamed from: f */
    public ECommercePrice f20804f;

    /* renamed from: g */
    public List f20805g;

    public ECommerceProduct(String str) {
        this.f20799a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f20803e;
    }

    public List<String> getCategoriesPath() {
        return this.f20801c;
    }

    public String getName() {
        return this.f20800b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f20804f;
    }

    public Map<String, String> getPayload() {
        return this.f20802d;
    }

    public List<String> getPromocodes() {
        return this.f20805g;
    }

    public String getSku() {
        return this.f20799a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f20803e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f20801c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f20800b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f20804f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f20802d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f20805g = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceProduct{sku='");
        sb.append(this.f20799a);
        sb.append("', name='");
        sb.append(this.f20800b);
        sb.append("', categoriesPath=");
        sb.append(this.f20801c);
        sb.append(", payload=");
        sb.append(this.f20802d);
        sb.append(", actualPrice=");
        sb.append(this.f20803e);
        sb.append(", originalPrice=");
        sb.append(this.f20804f);
        sb.append(", promocodes=");
        return AbstractC11153tN0.m24883A(sb, this.f20805g, '}');
    }
}
