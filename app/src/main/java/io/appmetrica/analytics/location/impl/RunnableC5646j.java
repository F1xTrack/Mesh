package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* renamed from: io.appmetrica.analytics.location.impl.j */
/* loaded from: classes2.dex */
public final class RunnableC5646j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5645i f32967a;

    /* renamed from: b */
    public final /* synthetic */ C5647k f32968b;

    public RunnableC5646j(C5647k c5647k, C5645i c5645i) {
        this.f32968b = c5647k;
        this.f32967a = c5645i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5652p c5652p = this.f32968b.f32971c;
        C5645i c5645i = this.f32967a;
        c5652p.f32987a = c5645i;
        CacheArguments cacheArguments = c5645i.f32966b;
        c5652p.f32988b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
