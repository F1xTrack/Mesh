package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.Kd */
/* loaded from: classes2.dex */
public final class C4614Kd {

    /* renamed from: a */
    public final String f30400a;

    /* renamed from: b */
    public final String f30401b;

    /* renamed from: c */
    public final List f30402c;

    /* renamed from: d */
    public final Map f30403d;

    public C4614Kd(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m19557a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    /* renamed from: a */
    public static ArrayList m19557a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4385B3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f30400a + "', identifier='" + this.f30401b + "', cartItems=" + this.f30402c + ", payload=" + this.f30403d + '}';
    }

    public C4614Kd(String str, String str2, ArrayList arrayList, Map map) {
        this.f30400a = str;
        this.f30401b = str2;
        this.f30402c = arrayList;
        this.f30403d = map;
    }
}
