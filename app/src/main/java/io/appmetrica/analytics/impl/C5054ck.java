package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ck */
/* loaded from: classes2.dex */
public final class C5054ck extends ECommerceEvent {

    /* renamed from: a */
    public final C4902We f31434a;

    /* renamed from: b */
    public final C5452si f31435b;

    /* renamed from: c */
    public final InterfaceC4967Z7 f31436c;

    public C5054ck(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new C4902We(eCommerceProduct), new C5452si(eCommerceScreen), new C5079dk());
    }

    /* renamed from: a */
    public final InterfaceC4967Z7 m20240a() {
        return this.f31436c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC4974Ze
    public final List<C4833Th> toProto() {
        return (List) this.f31436c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f31434a + ", screen=" + this.f31435b + ", converter=" + this.f31436c + '}';
    }

    public C5054ck(C4902We c4902We, C5452si c5452si, InterfaceC4967Z7 interfaceC4967Z7) {
        this.f31434a = c4902We;
        this.f31435b = c5452si;
        this.f31436c = interfaceC4967Z7;
    }
}
