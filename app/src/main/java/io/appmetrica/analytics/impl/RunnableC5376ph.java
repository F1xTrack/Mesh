package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ph */
/* loaded from: classes2.dex */
public final class RunnableC5376ph implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f32400a;

    /* renamed from: b */
    public final /* synthetic */ boolean f32401b;

    /* renamed from: c */
    public final /* synthetic */ C5601yh f32402c;

    public RunnableC5376ph(C5601yh c5601yh, AdRevenue adRevenue, boolean z) {
        this.f32402c = c5601yh;
        this.f32400a = adRevenue;
        this.f32401b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32402c;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportAdRevenue(this.f32400a, this.f32401b);
    }
}
