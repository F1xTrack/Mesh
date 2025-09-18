package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public final class Pe {
    public final W a;
    public final List b;

    public Pe(ECommercePrice eCommercePrice) {
        this(new W(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new W(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceWrapper{fiat=");
        sb.append(this.a);
        sb.append(", internalComponents=");
        return AbstractC7209tN0.A(sb, this.b, '}');
    }

    public Pe(W w, LinkedList linkedList) {
        this.a = w;
        this.b = linkedList;
    }
}
