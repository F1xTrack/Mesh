package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: io.appmetrica.analytics.impl.Pe */
/* loaded from: classes2.dex */
public final class C4735Pe {

    /* renamed from: a */
    public final C4887W f30618a;

    /* renamed from: b */
    public final List f30619b;

    public C4735Pe(ECommercePrice eCommercePrice) {
        this(new C4887W(eCommercePrice.getFiat()), m19707a(eCommercePrice.getInternalComponents()));
    }

    /* renamed from: a */
    public static LinkedList m19707a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new C4887W(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceWrapper{fiat=");
        sb.append(this.f30618a);
        sb.append(", internalComponents=");
        return AbstractC11153tN0.m24883A(sb, this.f30619b, '}');
    }

    public C4735Pe(C4887W c4887w, LinkedList linkedList) {
        this.f30618a = c4887w;
        this.f30619b = linkedList;
    }
}
