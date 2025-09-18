package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Jb */
/* loaded from: classes2.dex */
public class C2703Jb extends ECommerceEvent {

    /* renamed from: b */
    public final C2578Eb f21546b;

    /* renamed from: c */
    public final C2628Gb f21547c;

    /* renamed from: d */
    private final InterfaceC3413lb<C2703Jb> f21548d;

    public C2703Jb(C2578Eb c2578Eb, C2628Gb c2628Gb, InterfaceC3413lb<C2703Jb> interfaceC3413lb) {
        this.f21546b = c2578Eb;
        this.f21547c = c2628Gb;
        this.f21548d = interfaceC3413lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown product details info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.p022ob.InterfaceC2603Fb
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> toProto() {
        return this.f21548d.mo13847b(this);
    }

    public String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f21546b + ", referrer=" + this.f21547c + ", converter=" + this.f21548d + '}';
    }
}
