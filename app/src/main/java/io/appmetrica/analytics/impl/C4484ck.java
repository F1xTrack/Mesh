package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ck */
/* loaded from: classes2.dex */
public final class C4484ck extends ECommerceEvent {
    public final We a;
    public final C4866si b;
    public final Z7 c;

    public C4484ck(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new We(eCommerceProduct), new C4866si(eCommerceScreen), new C4509dk());
    }

    public final Z7 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Ze
    public final List<Th> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.a + ", screen=" + this.b + ", converter=" + this.c + '}';
    }

    public C4484ck(We we, C4866si c4866si, Z7 z7) {
        this.a = we;
        this.b = c4866si;
        this.c = z7;
    }
}
