package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes2.dex */
public class Jb extends ECommerceEvent {
    public final Eb b;
    public final Gb c;
    private final InterfaceC2900lb<Jb> d;

    public Jb(Eb eb, Gb gb, InterfaceC2900lb<Jb> interfaceC2900lb) {
        this.b = eb;
        this.c = gb;
        this.d = interfaceC2900lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown product details info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C3099tb<Rf, Fn>> toProto() {
        return this.d.b(this);
    }

    public String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.b + ", referrer=" + this.c + ", converter=" + this.d + '}';
    }
}
