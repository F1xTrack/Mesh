package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.y3 */
/* loaded from: classes2.dex */
public final class C5587y3 extends ECommerceEvent {

    /* renamed from: d */
    public static final int f32837d = 4;

    /* renamed from: e */
    public static final int f32838e = 5;

    /* renamed from: a */
    public final int f32839a;

    /* renamed from: b */
    public final C4385B3 f32840b;

    /* renamed from: c */
    public final InterfaceC4967Z7 f32841c;

    public C5587y3(int i, ECommerceCartItem eCommerceCartItem) {
        this(i, new C4385B3(eCommerceCartItem), new C5612z3());
    }

    /* renamed from: a */
    public final InterfaceC4967Z7 m21216a() {
        return this.f32841c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i = this.f32839a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC4974Ze
    public final List<C4833Th> toProto() {
        return (List) this.f32841c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f32839a + ", cartItem=" + this.f32840b + ", converter=" + this.f32841c + '}';
    }

    public C5587y3(int i, C4385B3 c4385b3, InterfaceC4967Z7 interfaceC4967Z7) {
        this.f32839a = i;
        this.f32840b = c4385b3;
        this.f32841c = interfaceC4967Z7;
    }
}
