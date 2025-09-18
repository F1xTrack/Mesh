package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ECommerceOrder {

    /* renamed from: a */
    public final String f20794a;

    /* renamed from: b */
    public final List f20795b;

    /* renamed from: c */
    public Map f20796c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f20794a = str;
        this.f20795b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f20795b;
    }

    public String getIdentifier() {
        return this.f20794a;
    }

    public Map<String, String> getPayload() {
        return this.f20796c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f20796c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f20794a + "', cartItems=" + this.f20795b + ", payload=" + this.f20796c + '}';
    }
}
