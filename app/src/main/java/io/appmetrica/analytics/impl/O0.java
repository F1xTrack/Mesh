package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes2.dex */
public final class O0 implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ C4611i1 b;

    public O0(C4611i1 c4611i1, ECommerceEvent eCommerceEvent) {
        this.b = c4611i1;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).reportECommerce(this.a);
    }
}
