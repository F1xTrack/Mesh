package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.Ni */
/* loaded from: classes2.dex */
public final class C4691Ni implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f30528a;

    public C4691Ni(ECommerceEvent eCommerceEvent) {
        this.f30528a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportECommerce(this.f30528a);
    }
}
