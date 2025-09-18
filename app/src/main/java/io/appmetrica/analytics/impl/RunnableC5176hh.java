package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.hh */
/* loaded from: classes2.dex */
public final class RunnableC5176hh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f31862a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f31863b;

    public RunnableC5176hh(C5601yh c5601yh, AdRevenue adRevenue) {
        this.f31863b = c5601yh;
        this.f31862a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31863b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportAdRevenue(this.f31862a);
    }
}
