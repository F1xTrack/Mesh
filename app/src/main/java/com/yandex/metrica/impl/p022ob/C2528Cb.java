package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.Cb */
/* loaded from: classes2.dex */
public class C2528Cb {

    /* renamed from: a */
    public final String f20976a;

    /* renamed from: b */
    public final String f20977b;

    /* renamed from: c */
    public final List<C2478Ab> f20978c;

    /* renamed from: d */
    public final Map<String, String> f20979d;

    public C2528Cb(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m13961a(eCommerceOrder.getCartItems()), C2968U2.m15251c(eCommerceOrder.getPayload()));
    }

    /* renamed from: a */
    private static List<C2478Ab> m13961a(List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ECommerceCartItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2478Ab(it.next()));
        }
        return arrayList;
    }

    public String toString() {
        return "OrderWrapper{uuid='" + this.f20976a + "', identifier='" + this.f20977b + "', cartItems=" + this.f20978c + ", payload=" + this.f20979d + '}';
    }

    public C2528Cb(String str, String str2, List<C2478Ab> list, Map<String, String> map) {
        this.f20976a = str;
        this.f20977b = str2;
        this.f20978c = list;
        this.f20979d = map;
    }
}
