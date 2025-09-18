package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.ih */
/* loaded from: classes2.dex */
public final class RunnableC5201ih implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f31943a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f31944b;

    public RunnableC5201ih(C5601yh c5601yh, ECommerceEvent eCommerceEvent) {
        this.f31944b = c5601yh;
        this.f31943a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31944b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportECommerce(this.f31943a);
    }
}
