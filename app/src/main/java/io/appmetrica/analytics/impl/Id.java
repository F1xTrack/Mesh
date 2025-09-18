package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* loaded from: classes2.dex */
public final class Id extends ECommerceEvent {
    public static final int d = 6;
    public static final int e = 7;
    public final int a;
    public final Kd b;
    public final Z7 c;

    public Id(int i, ECommerceOrder eCommerceOrder) {
        this(i, new Kd(eCommerceOrder), new Jd());
    }

    public final Z7 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Ze
    public final List<Th> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.a + ", order=" + this.b + ", converter=" + this.c + '}';
    }

    public Id(int i, Kd kd, Z7 z7) {
        this.a = i;
        this.b = kd;
        this.c = z7;
    }
}
