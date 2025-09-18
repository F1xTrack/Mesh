package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes2.dex */
public interface Pa extends Qa {
    Fa a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z);

    @Override // io.appmetrica.analytics.impl.Qa
    /* synthetic */ Pa a();

    void a(ReporterConfig reporterConfig);

    Fa b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z);

    Oa b(ReporterConfig reporterConfig);

    Ra b(AppMetricaConfig appMetricaConfig);
}
