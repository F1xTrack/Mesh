package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Bb */
/* loaded from: classes2.dex */
public class C2503Bb extends ECommerceEvent {

    /* renamed from: b */
    public final int f20923b;

    /* renamed from: c */
    public final C2528Cb f20924c;

    /* renamed from: d */
    private final InterfaceC3413lb<C2503Bb> f20925d;

    public C2503Bb(int i, C2528Cb c2528Cb, InterfaceC3413lb<C2503Bb> interfaceC3413lb) {
        this.f20923b = i;
        this.f20924c = c2528Cb;
        this.f20925d = interfaceC3413lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "order info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p022ob.InterfaceC2603Fb
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> toProto() {
        return this.f20925d.mo13847b(this);
    }

    public String toString() {
        return "OrderInfoEvent{eventType=" + this.f20923b + ", order=" + this.f20924c + ", converter=" + this.f20925d + '}';
    }
}
