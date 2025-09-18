package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a */
    private final ICommonExecutor f29707a;

    /* renamed from: b */
    private final ILastKnownUpdater f29708b;

    /* renamed from: c */
    private final UpdateConditionsChecker f29709c;

    /* renamed from: d */
    private final RunnableC4326a f29710d = new RunnableC4326a(this);

    /* renamed from: e */
    private final RunnableC4327b f29711e = new RunnableC4327b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f29707a = iCommonExecutor;
        this.f29708b = iLastKnownUpdater;
        this.f29709c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f29707a.remove(this.f29710d);
        this.f29707a.executeDelayed(this.f29710d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f29707a.execute(this.f29711e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f29707a.remove(this.f29710d);
        this.f29707a.remove(this.f29711e);
    }
}
