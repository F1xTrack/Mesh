package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Ch */
/* loaded from: classes2.dex */
public final class C4424Ch implements InterfaceC4731Pa {
    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa, io.appmetrica.analytics.impl.InterfaceC4755Qa
    /* renamed from: a */
    public final InterfaceC4731Pa mo19238a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: b */
    public final InterfaceC4491Fa mo19241b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        return new C5196ic();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: a */
    public final void mo19239a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: b */
    public final InterfaceC4707Oa mo19242b(ReporterConfig reporterConfig) {
        return new C5626zh();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: a */
    public final InterfaceC4491Fa mo19237a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        return new C5196ic();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: b */
    public final InterfaceC4778Ra mo19243b(AppMetricaConfig appMetricaConfig) {
        return new C5626zh();
    }
}
