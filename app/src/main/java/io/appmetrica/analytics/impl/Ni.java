package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes2.dex */
public final class Ni implements Na {
    public final /* synthetic */ ECommerceEvent a;

    public Ni(ECommerceEvent eCommerceEvent) {
        this.a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportECommerce(this.a);
    }
}
