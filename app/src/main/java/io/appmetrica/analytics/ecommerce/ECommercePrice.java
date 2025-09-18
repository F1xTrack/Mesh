package io.appmetrica.analytics.ecommerce;

import java.util.List;
import p000.AbstractC11153tN0;

/* loaded from: classes2.dex */
public class ECommercePrice {

    /* renamed from: a */
    private final ECommerceAmount f29784a;

    /* renamed from: b */
    private List f29785b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f29784a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f29784a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f29785b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f29785b = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommercePrice{fiat=");
        sb.append(this.f29784a);
        sb.append(", internalComponents=");
        return AbstractC11153tN0.m24883A(sb, this.f29785b, '}');
    }
}
