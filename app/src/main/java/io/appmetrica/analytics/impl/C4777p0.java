package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.p0 */
/* loaded from: classes2.dex */
public final class C4777p0 implements InterfaceC4598hc {
    public final /* synthetic */ C4824r0 a;
    public final /* synthetic */ AppMetricaConfig b;
    public final /* synthetic */ PublicLogger c;

    public C4777p0(C4824r0 c4824r0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.a = c4824r0;
        this.b = appMetricaConfig;
        this.c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4598hc
    public final Wb a() {
        C4824r0 c4824r0 = this.a;
        return c4824r0.g.b(this.b, this.c, c4824r0.i.f);
    }
}
