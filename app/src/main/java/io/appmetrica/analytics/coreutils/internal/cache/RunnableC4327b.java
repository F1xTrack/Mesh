package io.appmetrica.analytics.coreutils.internal.cache;

/* renamed from: io.appmetrica.analytics.coreutils.internal.cache.b */
/* loaded from: classes2.dex */
public final class RunnableC4327b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f29713a;

    public RunnableC4327b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f29713a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29713a.f29709c.shouldUpdate()) {
            this.f29713a.f29710d.f29712a.f29708b.updateLastKnown();
        }
    }
}
