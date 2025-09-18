package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* loaded from: classes2.dex */
public final class Tb extends Sm {
    public final AppMetricaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(Qa qa, AppMetricaConfig appMetricaConfig) {
        super(qa);
        String str = appMetricaConfig.apiKey;
        this.b = appMetricaConfig;
    }

    public final Ra a() {
        return this.a.a().b(this.b);
    }
}
