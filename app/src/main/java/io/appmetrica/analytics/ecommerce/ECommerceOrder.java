package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ECommerceOrder {

    /* renamed from: a */
    private final String f29781a;

    /* renamed from: b */
    private final List f29782b;

    /* renamed from: c */
    private Map f29783c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f29781a = str;
        this.f29782b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f29782b;
    }

    public String getIdentifier() {
        return this.f29781a;
    }

    public Map<String, String> getPayload() {
        return this.f29783c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f29783c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f29781a + "', cartItems=" + this.f29782b + ", payload=" + this.f29783c + '}';
    }
}
