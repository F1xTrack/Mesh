package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes2.dex */
public class Bb extends ECommerceEvent {
    public final int b;
    public final Cb c;
    private final InterfaceC2900lb<Bb> d;

    public Bb(int i, Cb cb, InterfaceC2900lb<Bb> interfaceC2900lb) {
        this.b = i;
        this.c = cb;
        this.d = interfaceC2900lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "order info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C3099tb<Rf, Fn>> toProto() {
        return this.d.b(this);
    }

    public String toString() {
        return "OrderInfoEvent{eventType=" + this.b + ", order=" + this.c + ", converter=" + this.d + '}';
    }
}
