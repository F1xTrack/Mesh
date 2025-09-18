package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.Tb */
/* loaded from: classes2.dex */
public final class C4827Tb extends AbstractC4814Sm {

    /* renamed from: b */
    public final AppMetricaConfig f30778b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4827Tb(InterfaceC4755Qa interfaceC4755Qa, AppMetricaConfig appMetricaConfig) {
        super(interfaceC4755Qa);
        String str = appMetricaConfig.apiKey;
        this.f30778b = appMetricaConfig;
    }

    /* renamed from: a */
    public final InterfaceC4778Ra m19872a() {
        return this.f30751a.mo19238a().mo19243b(this.f30778b);
    }
}
