package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes2.dex */
public final class a implements Runnable {
    public final /* synthetic */ LocationDataCacheUpdateScheduler a;

    public a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.updateLastKnown();
    }
}
