package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ECommerceScreen {

    /* renamed from: a */
    public String f20809a;

    /* renamed from: b */
    public List f20810b;

    /* renamed from: c */
    public String f20811c;

    /* renamed from: d */
    public Map f20812d;

    public List<String> getCategoriesPath() {
        return this.f20810b;
    }

    public String getName() {
        return this.f20809a;
    }

    public Map<String, String> getPayload() {
        return this.f20812d;
    }

    public String getSearchQuery() {
        return this.f20811c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f20810b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f20809a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f20812d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f20811c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f20809a + "', categoriesPath=" + this.f20810b + ", searchQuery='" + this.f20811c + "', payload=" + this.f20812d + '}';
    }
}
