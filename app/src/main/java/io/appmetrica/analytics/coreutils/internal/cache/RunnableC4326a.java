package io.appmetrica.analytics.coreutils.internal.cache;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.a */
/* loaded from: classes2.dex */
public final class RunnableC4326a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f29712a;

    public RunnableC4326a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f29712a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29712a.f29708b.updateLastKnown();
    }
}
