package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4794ph implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C5009yh c;

    public RunnableC4794ph(C5009yh c5009yh, AdRevenue adRevenue, boolean z) {
        this.c = c5009yh;
        this.a = adRevenue;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.c;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportAdRevenue(this.a, this.b);
    }
}
