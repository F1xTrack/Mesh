package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ek */
/* loaded from: classes2.dex */
public final class C4534ek extends ECommerceEvent {
    public final We a;
    public final Of b;
    public final Z7 c;

    public C4534ek(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new We(eCommerceProduct), eCommerceReferrer == null ? null : new Of(eCommerceReferrer), new C4558fk());
    }

    public final Z7 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Ze
    public final List<Th> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.a + ", referrer=" + this.b + ", converter=" + this.c + '}';
    }

    public C4534ek(We we, Of of, Z7 z7) {
        this.a = we;
        this.b = of;
        this.c = z7;
    }
}
