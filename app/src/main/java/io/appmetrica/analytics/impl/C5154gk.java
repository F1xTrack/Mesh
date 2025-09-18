package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gk */
/* loaded from: classes2.dex */
public final class C5154gk extends ECommerceEvent {

    /* renamed from: a */
    public final C5452si f31777a;

    /* renamed from: b */
    public final InterfaceC4967Z7 f31778b;

    public C5154gk(ECommerceScreen eCommerceScreen) {
        this(new C5452si(eCommerceScreen), new C5179hk());
    }

    /* renamed from: a */
    public final InterfaceC4967Z7 m20464a() {
        return this.f31778b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC4974Ze
    public final List<C4833Th> toProto() {
        return (List) this.f31778b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f31777a + ", converter=" + this.f31778b + '}';
    }

    public C5154gk(C5452si c5452si, InterfaceC4967Z7 interfaceC4967Z7) {
        this.f31777a = c5452si;
        this.f31778b = interfaceC4967Z7;
    }
}
