package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.gh */
/* loaded from: classes2.dex */
public final class RunnableC5151gh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Revenue f31775a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f31776b;

    public RunnableC5151gh(C5601yh c5601yh, Revenue revenue) {
        this.f31776b = c5601yh;
        this.f31775a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31776b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportRevenue(this.f31775a);
    }
}
