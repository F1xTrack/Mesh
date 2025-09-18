package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.zb */
/* loaded from: classes2.dex */
public class C3777zb extends ECommerceEvent {

    /* renamed from: b */
    public final int f25412b;

    /* renamed from: c */
    public final C2478Ab f25413c;

    /* renamed from: d */
    private final InterfaceC3413lb<C3777zb> f25414d;

    public C3777zb(int i, C2478Ab c2478Ab, InterfaceC3413lb<C3777zb> interfaceC3413lb) {
        this.f25412b = i;
        this.f25413c = c2478Ab;
        this.f25414d = interfaceC3413lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        int i = this.f25412b;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p022ob.InterfaceC2603Fb
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> toProto() {
        return this.f25414d.mo13847b(this);
    }

    public String toString() {
        return "CartActionInfoEvent{eventType=" + this.f25412b + ", cartItem=" + this.f25413c + ", converter=" + this.f25414d + '}';
    }
}
