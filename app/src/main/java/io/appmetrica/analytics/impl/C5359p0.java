package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.p0 */
/* loaded from: classes2.dex */
public final class C5359p0 implements InterfaceC5171hc {

    /* renamed from: a */
    public final /* synthetic */ C5409r0 f32370a;

    /* renamed from: b */
    public final /* synthetic */ AppMetricaConfig f32371b;

    /* renamed from: c */
    public final /* synthetic */ PublicLogger f32372c;

    public C5359p0(C5409r0 c5409r0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f32370a = c5409r0;
        this.f32371b = appMetricaConfig;
        this.f32372c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5171hc
    /* renamed from: a */
    public final C4899Wb mo20499a() {
        C5409r0 c5409r0 = this.f32370a;
        return c5409r0.f32484g.mo19241b(this.f32371b, this.f32372c, c5409r0.f32486i.f30005f);
    }
}
