package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes2.dex */
public class Ib extends ECommerceEvent {
    public final Eb b;
    public final Hb c;
    private final InterfaceC2900lb<Ib> d;

    public Ib(Eb eb, Hb hb, InterfaceC2900lb<Ib> interfaceC2900lb) {
        this.b = eb;
        this.c = hb;
        this.d = interfaceC2900lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown product card info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C3099tb<Rf, Fn>> toProto() {
        return this.d.b(this);
    }

    public String toString() {
        return "ShownProductCardInfoEvent{product=" + this.b + ", screen=" + this.c + ", converter=" + this.d + '}';
    }
}
