package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ek */
/* loaded from: classes2.dex */
public final class C5104ek extends ECommerceEvent {

    /* renamed from: a */
    public final C4902We f31611a;

    /* renamed from: b */
    public final C4712Of f31612b;

    /* renamed from: c */
    public final InterfaceC4967Z7 f31613c;

    public C5104ek(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new C4902We(eCommerceProduct), eCommerceReferrer == null ? null : new C4712Of(eCommerceReferrer), new C5129fk());
    }

    /* renamed from: a */
    public final InterfaceC4967Z7 m20350a() {
        return this.f31613c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC4974Ze
    public final List<C4833Th> toProto() {
        return (List) this.f31613c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f31611a + ", referrer=" + this.f31612b + ", converter=" + this.f31613c + '}';
    }

    public C5104ek(C4902We c4902We, C4712Of c4712Of, InterfaceC4967Z7 interfaceC4967Z7) {
        this.f31611a = c4902We;
        this.f31612b = c4712Of;
        this.f31613c = interfaceC4967Z7;
    }
}
