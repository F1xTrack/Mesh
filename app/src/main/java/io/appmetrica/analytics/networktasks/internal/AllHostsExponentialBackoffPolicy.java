package io.appmetrica.analytics.networktasks.internal;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m22267d2 = {"Lio/appmetrica/analytics/networktasks/internal/AllHostsExponentialBackoffPolicy;", "Lio/appmetrica/analytics/networktasks/internal/ExponentialBackoffPolicy;", "Lio/appmetrica/analytics/networktasks/internal/ExponentialBackoffDataHolder;", "exponentialBackoffDataHolder", "<init>", "(Lio/appmetrica/analytics/networktasks/internal/ExponentialBackoffDataHolder;)V", "", "success", "LTf1;", "onHostAttemptFinished", "(Z)V", "onAllHostsAttemptsFinished", "Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;", "retryPolicyConfig", "canBeExecuted", "(Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;)Z", "network-tasks_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AllHostsExponentialBackoffPolicy implements ExponentialBackoffPolicy {

    /* renamed from: a */
    private final ExponentialBackoffDataHolder f33095a;

    public AllHostsExponentialBackoffPolicy(ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f33095a = exponentialBackoffDataHolder;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig) {
        return this.f33095a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onAllHostsAttemptsFinished(boolean success) {
        if (success) {
            this.f33095a.reset();
        } else {
            this.f33095a.updateLastAttemptInfo();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onHostAttemptFinished(boolean success) {
    }
}
