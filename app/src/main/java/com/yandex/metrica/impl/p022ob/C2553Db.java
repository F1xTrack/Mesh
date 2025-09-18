package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.LinkedList;
import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Db */
/* loaded from: classes2.dex */
public class C2553Db {

    /* renamed from: a */
    public final C3751yb f21015a;

    /* renamed from: b */
    public final List<C3751yb> f21016b;

    public C2553Db(ECommercePrice eCommercePrice) {
        this(new C3751yb(eCommercePrice.getFiat()), m13992a(eCommercePrice.getInternalComponents()));
    }

    /* renamed from: a */
    public static List<C3751yb> m13992a(List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount eCommerceAmount : list) {
            linkedList.add(new C3751yb(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PriceWrapper{fiat=");
        sb.append(this.f21015a);
        sb.append(", internalComponents=");
        return AbstractC11153tN0.m24883A(sb, this.f21016b, '}');
    }

    public C2553Db(C3751yb c3751yb, List<C3751yb> list) {
        this.f21015a = c3751yb;
        this.f21016b = list;
    }
}
