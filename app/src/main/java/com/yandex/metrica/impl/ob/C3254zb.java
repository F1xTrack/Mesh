package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.zb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3254zb extends ECommerceEvent {
    public final int b;
    public final Ab c;
    private final InterfaceC2900lb<C3254zb> d;

    public C3254zb(int i, Ab ab, InterfaceC2900lb<C3254zb> interfaceC2900lb) {
        this.b = i;
        this.c = ab;
        this.d = interfaceC2900lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        int i = this.b;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C3099tb<Rf, Fn>> toProto() {
        return this.d.b(this);
    }

    public String toString() {
        return "CartActionInfoEvent{eventType=" + this.b + ", cartItem=" + this.c + ", converter=" + this.d + '}';
    }
}
