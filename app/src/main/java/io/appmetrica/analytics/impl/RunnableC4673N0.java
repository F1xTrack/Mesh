package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.N0 */
/* loaded from: classes2.dex */
public final class RunnableC4673N0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f30497a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30498b;

    public RunnableC4673N0(C5185i1 c5185i1, AdRevenue adRevenue) {
        this.f30498b = c5185i1;
        this.f30497a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f30498b).reportAdRevenue(this.f30497a);
    }
}
