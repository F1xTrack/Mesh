package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4579gh implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4579gh(C5009yh c5009yh, Revenue revenue) {
        this.b = c5009yh;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportRevenue(this.a);
    }
}
