package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes2.dex */
public final class Ch implements Pa {
    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Qa
    public final Pa a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final Fa b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        return new C4622ic();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final Oa b(ReporterConfig reporterConfig) {
        return new C5033zh();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final Fa a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        return new C4622ic();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final Ra b(AppMetricaConfig appMetricaConfig) {
        return new C5033zh();
    }
}
