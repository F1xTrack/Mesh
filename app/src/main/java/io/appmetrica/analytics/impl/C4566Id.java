package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Id */
/* loaded from: classes2.dex */
public final class C4566Id extends ECommerceEvent {

    /* renamed from: d */
    public static final int f30283d = 6;

    /* renamed from: e */
    public static final int f30284e = 7;

    /* renamed from: a */
    public final int f30285a;

    /* renamed from: b */
    public final C4614Kd f30286b;

    /* renamed from: c */
    public final InterfaceC4967Z7 f30287c;

    public C4566Id(int i, ECommerceOrder eCommerceOrder) {
        this(i, new C4614Kd(eCommerceOrder), new C4590Jd());
    }

    /* renamed from: a */
    public final InterfaceC4967Z7 m19504a() {
        return this.f30287c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC4974Ze
    public final List<C4833Th> toProto() {
        return (List) this.f30287c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f30285a + ", order=" + this.f30286b + ", converter=" + this.f30287c + '}';
    }

    public C4566Id(int i, C4614Kd c4614Kd, InterfaceC4967Z7 interfaceC4967Z7) {
        this.f30285a = i;
        this.f30286b = c4614Kd;
        this.f30287c = interfaceC4967Z7;
    }
}
