package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public class Cb {
    public final String a;
    public final String b;
    public final List<Ab> c;
    public final Map<String, String> d;

    public Cb(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), U2.c(eCommerceOrder.getPayload()));
    }

    private static List<Ab> a(List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ECommerceCartItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Ab(it.next()));
        }
        return arrayList;
    }

    public String toString() {
        return "OrderWrapper{uuid='" + this.a + "', identifier='" + this.b + "', cartItems=" + this.c + ", payload=" + this.d + '}';
    }

    public Cb(String str, String str2, List<Ab> list, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = map;
    }
}
