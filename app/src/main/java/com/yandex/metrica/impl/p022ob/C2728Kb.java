package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Kb */
/* loaded from: classes2.dex */
public class C2728Kb extends ECommerceEvent {

    /* renamed from: b */
    public final C2653Hb f21581b;

    /* renamed from: c */
    private final InterfaceC3413lb<C2728Kb> f21582c;

    public C2728Kb(C2653Hb c2653Hb, InterfaceC3413lb<C2728Kb> interfaceC3413lb) {
        this.f21581b = c2653Hb;
        this.f21582c = interfaceC3413lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown screen info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p022ob.InterfaceC2603Fb
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> toProto() {
        return this.f21582c.mo13847b(this);
    }

    public String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f21581b + ", converter=" + this.f21582c + '}';
    }
}
