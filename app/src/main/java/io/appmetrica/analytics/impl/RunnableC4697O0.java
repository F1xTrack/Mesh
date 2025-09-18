package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.O0 */
/* loaded from: classes2.dex */
public final class RunnableC4697O0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f30538a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30539b;

    public RunnableC4697O0(C5185i1 c5185i1, ECommerceEvent eCommerceEvent) {
        this.f30539b = c5185i1;
        this.f30538a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f30539b).reportECommerce(this.f30538a);
    }
}
