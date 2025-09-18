package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import defpackage.AbstractC7209tN0;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class Db {
    public final C3229yb a;
    public final List<C3229yb> b;

    public Db(ECommercePrice eCommercePrice) {
        this(new C3229yb(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static List<C3229yb> a(List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount eCommerceAmount : list) {
            linkedList.add(new C3229yb(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PriceWrapper{fiat=");
        sb.append(this.a);
        sb.append(", internalComponents=");
        return AbstractC7209tN0.A(sb, this.b, '}');
    }

    public Db(C3229yb c3229yb, List<C3229yb> list) {
        this.a = c3229yb;
        this.b = list;
    }
}
