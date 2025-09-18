package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes2.dex */
public class Kb extends ECommerceEvent {
    public final Hb b;
    private final InterfaceC2900lb<Kb> c;

    public Kb(Hb hb, InterfaceC2900lb<Kb> interfaceC2900lb) {
        this.b = hb;
        this.c = interfaceC2900lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown screen info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C3099tb<Rf, Fn>> toProto() {
        return this.c.b(this);
    }

    public String toString() {
        return "ShownScreenInfoEvent{screen=" + this.b + ", converter=" + this.c + '}';
    }
}
