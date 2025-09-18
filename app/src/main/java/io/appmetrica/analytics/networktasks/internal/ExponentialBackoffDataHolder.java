package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes2.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a */
    private final TimePassedChecker f33107a;

    /* renamed from: b */
    private final TimeProvider f33108b;

    /* renamed from: c */
    private final HostRetryInfoProvider f33109c;

    /* renamed from: d */
    private long f33110d;

    /* renamed from: e */
    private int f33111e;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker());
    }

    public void reset() {
        this.f33111e = 1;
        this.f33110d = 0L;
        this.f33109c.saveNextSendAttemptNumber(1);
        this.f33109c.saveLastAttemptTimeSeconds(this.f33110d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f33108b.currentTimeSeconds();
        this.f33110d = jCurrentTimeSeconds;
        this.f33111e++;
        this.f33109c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f33109c.saveNextSendAttemptNumber(this.f33111e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j = this.f33110d;
            if (j != 0) {
                TimePassedChecker timePassedChecker = this.f33107a;
                int i = ((1 << (this.f33111e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i2 = retryPolicyConfig.maxIntervalSeconds;
                if (i > i2) {
                    i = i2;
                }
                return timePassedChecker.didTimePassSeconds(j, i, "last send attempt");
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker) {
        this.f33109c = hostRetryInfoProvider;
        this.f33108b = systemTimeProvider;
        this.f33107a = timePassedChecker;
        this.f33110d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f33111e = hostRetryInfoProvider.getNextSendAttemptNumber();
    }
}
