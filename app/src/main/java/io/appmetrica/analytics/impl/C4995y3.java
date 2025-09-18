package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.y3 */
/* loaded from: classes2.dex */
public final class C4995y3 extends ECommerceEvent {
    public static final int d = 4;
    public static final int e = 5;
    public final int a;
    public final B3 b;
    public final Z7 c;

    public C4995y3(int i, ECommerceCartItem eCommerceCartItem) {
        this(i, new B3(eCommerceCartItem), new C5019z3());
    }

    public final Z7 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i = this.a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Ze
    public final List<Th> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.a + ", cartItem=" + this.b + ", converter=" + this.c + '}';
    }

    public C4995y3(int i, B3 b3, Z7 z7) {
        this.a = i;
        this.b = b3;
        this.c = z7;
    }
}
