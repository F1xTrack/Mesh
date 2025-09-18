package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ECommerceScreen {

    /* renamed from: a */
    private String f29796a;

    /* renamed from: b */
    private List f29797b;

    /* renamed from: c */
    private String f29798c;

    /* renamed from: d */
    private Map f29799d;

    public List<String> getCategoriesPath() {
        return this.f29797b;
    }

    public String getName() {
        return this.f29796a;
    }

    public Map<String, String> getPayload() {
        return this.f29799d;
    }

    public String getSearchQuery() {
        return this.f29798c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f29797b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f29796a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f29799d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f29798c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f29796a + "', categoriesPath=" + this.f29797b + ", searchQuery='" + this.f29798c + "', payload=" + this.f29799d + '}';
    }
}
