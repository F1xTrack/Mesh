package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.L0 */
/* loaded from: classes2.dex */
public final class RunnableC4625L0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Revenue f30413a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30414b;

    public RunnableC4625L0(C5185i1 c5185i1, Revenue revenue) {
        this.f30414b = c5185i1;
        this.f30413a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f30414b).reportRevenue(this.f30413a);
    }
}
