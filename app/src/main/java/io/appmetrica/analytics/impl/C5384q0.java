package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.q0 */
/* loaded from: classes2.dex */
public final class C5384q0 implements InterfaceC5171hc {

    /* renamed from: a */
    public final /* synthetic */ C5409r0 f32412a;

    /* renamed from: b */
    public final /* synthetic */ AppMetricaConfig f32413b;

    /* renamed from: c */
    public final /* synthetic */ PublicLogger f32414c;

    public C5384q0(C5409r0 c5409r0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f32412a = c5409r0;
        this.f32413b = appMetricaConfig;
        this.f32414c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5171hc
    /* renamed from: a */
    public final C4899Wb mo20499a() {
        C5409r0 c5409r0 = this.f32412a;
        return c5409r0.f32484g.mo19237a(this.f32413b, this.f32414c, c5409r0.f32486i.f30005f);
    }
}
