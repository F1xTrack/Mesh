package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.impl.C4324k;
import kotlin.Lazy;
import kotlin.Metadata;
import p000.AbstractC0705LB;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceProvider;", "", "<init>", "()V", "LTf1;", "initAsync", "Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceConfiguration;", "configuration", "updateConfiguration", "(Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceConfiguration;)V", "Lio/appmetrica/analytics/coreutils/internal/services/FirstExecutionConditionServiceImpl;", "a", "Lkotlin/Lazy;", "getFirstExecutionService", "()Lio/appmetrica/analytics/coreutils/internal/services/FirstExecutionConditionServiceImpl;", "firstExecutionService", "Lio/appmetrica/analytics/coreutils/internal/services/WaitForActivationDelayBarrier;", "b", "Lio/appmetrica/analytics/coreutils/internal/services/WaitForActivationDelayBarrier;", "getActivationBarrier", "()Lio/appmetrica/analytics/coreutils/internal/services/WaitForActivationDelayBarrier;", "activationBarrier", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: from kotlin metadata */
    private final Lazy firstExecutionService = AbstractC0705LB.m4915b(new C4324k(this));

    /* renamed from: b, reason: from kotlin metadata */
    private final WaitForActivationDelayBarrier activationBarrier = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.activationBarrier;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.firstExecutionService.getValue();
    }

    public final void initAsync() {
        this.activationBarrier.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration configuration) {
        getFirstExecutionService().updateConfig(configuration);
    }
}
