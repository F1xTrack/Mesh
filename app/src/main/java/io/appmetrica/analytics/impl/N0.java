package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes2.dex */
public final class N0 implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ C4611i1 b;

    public N0(C4611i1 c4611i1, AdRevenue adRevenue) {
        this.b = c4611i1;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).reportAdRevenue(this.a);
    }
}
