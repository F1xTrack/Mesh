package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gk */
/* loaded from: classes2.dex */
public final class C4582gk extends ECommerceEvent {
    public final C4866si a;
    public final Z7 b;

    public C4582gk(ECommerceScreen eCommerceScreen) {
        this(new C4866si(eCommerceScreen), new C4606hk());
    }

    public final Z7 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Ze
    public final List<Th> toProto() {
        return (List) this.b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.a + ", converter=" + this.b + '}';
    }

    public C4582gk(C4866si c4866si, Z7 z7) {
        this.a = c4866si;
        this.b = z7;
    }
}
