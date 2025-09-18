package com.yandex.metrica.ecommerce;

import java.util.List;
import p000.AbstractC11153tN0;

/* loaded from: classes2.dex */
public class ECommercePrice {

    /* renamed from: a */
    public final ECommerceAmount f20797a;

    /* renamed from: b */
    public List f20798b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f20797a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f20797a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f20798b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f20798b = list;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommercePrice{fiat=");
        sb.append(this.f20797a);
        sb.append(", internalComponents=");
        return AbstractC11153tN0.m24883A(sb, this.f20798b, '}');
    }
}
