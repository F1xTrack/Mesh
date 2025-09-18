package io.appmetrica.analytics.coreutils.internal.cache;

import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a */
        private final String f29701a;

        /* renamed from: b */
        private volatile long f29702b;

        /* renamed from: c */
        private volatile long f29703c;

        /* renamed from: d */
        private long f29704d = 0;

        /* renamed from: e */
        private Object f29705e = null;

        public CachedData(long j, long j2, String str) {
            this.f29701a = AbstractC7222ym.m26234k("[CachedData-", str, "]");
            this.f29702b = j;
            this.f29703c = j2;
        }

        public T getData() {
            return (T) this.f29705e;
        }

        public long getExpiryTime() {
            return this.f29703c;
        }

        public long getRefreshTime() {
            return this.f29702b;
        }

        public final boolean isEmpty() {
            return this.f29705e == null;
        }

        public void setData(T t) {
            this.f29705e = t;
            this.f29704d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j, long j2) {
            this.f29702b = j;
            this.f29703c = j2;
        }

        public final boolean shouldClearData() {
            if (this.f29704d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f29704d;
            return jCurrentTimeMillis > this.f29703c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f29704d;
            return jCurrentTimeMillis > this.f29702b || jCurrentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f29701a + "', refreshTime=" + this.f29702b + ", expiryTime=" + this.f29703c + ", mCachedTime=" + this.f29704d + ", mCachedData=" + this.f29705e + '}';
        }
    }
}
