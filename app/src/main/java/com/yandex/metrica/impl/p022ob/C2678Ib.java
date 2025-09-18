package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ib */
/* loaded from: classes2.dex */
public class C2678Ib extends ECommerceEvent {

    /* renamed from: b */
    public final C2578Eb f21425b;

    /* renamed from: c */
    public final C2653Hb f21426c;

    /* renamed from: d */
    private final InterfaceC3413lb<C2678Ib> f21427d;

    public C2678Ib(C2578Eb c2578Eb, C2653Hb c2653Hb, InterfaceC3413lb<C2678Ib> interfaceC3413lb) {
        this.f21425b = c2578Eb;
        this.f21426c = c2653Hb;
        this.f21427d = interfaceC3413lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown product card info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p022ob.InterfaceC2603Fb
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> toProto() {
        return this.f21427d.mo13847b(this);
    }

    public String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f21425b + ", screen=" + this.f21426c + ", converter=" + this.f21427d + '}';
    }
}
