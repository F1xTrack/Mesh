package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes2.dex */
public final class L0 implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ C4611i1 b;

    public L0(C4611i1 c4611i1, Revenue revenue) {
        this.b = c4611i1;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).reportRevenue(this.a);
    }
}
