package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;

/* loaded from: classes2.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* renamed from: a */
    private CacheUpdateScheduler f29706a;
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j, long j2, String str) {
        this.mCachedData = new CachedDataProvider.CachedData<>(j, j2, str);
    }

    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f29706a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(CacheUpdateScheduler cacheUpdateScheduler) {
        this.f29706a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    public abstract boolean shouldUpdate(T t);

    public void updateCacheControl(long j, long j2) {
        this.mCachedData.setExpirationPolicy(j, j2);
    }

    public void updateData(T t) {
        if (shouldUpdate(t)) {
            this.mCachedData.setData(t);
            CacheUpdateScheduler cacheUpdateScheduler = this.f29706a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
