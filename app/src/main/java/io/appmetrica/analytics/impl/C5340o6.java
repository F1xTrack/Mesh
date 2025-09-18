package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.o6 */
/* loaded from: classes2.dex */
public final class C5340o6 extends AbstractC4747Q2 {

    /* renamed from: o */
    public final C5365p6 f32319o;

    /* renamed from: p */
    public final C4719Om f32320p;

    public C5340o6(Context context, C4782Re c4782Re, AppMetricaConfig appMetricaConfig, C4690Nh c4690Nh, C4586J9 c4586j9) {
        this(context, c4690Nh, new C4952Yg(c4782Re, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), appMetricaConfig.userProfileID), c4586j9, new C5365p6(context), new C4719Om(), C5388q4.m20928h().m20940k(), new C4695Nm(), new C4879Vf(), new C5515v6(), new C4935Y(), new C5023be(c4586j9));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4747Q2, io.appmetrica.analytics.impl.InterfaceC4707Oa, io.appmetrica.analytics.impl.InterfaceC4778Ra
    /* renamed from: a */
    public final void mo19683a(C4671Mm c4671Mm) {
        this.f32319o.m20903a(this.f32320p.m19704a(c4671Mm, this.f30644b));
        this.f30645c.info("Unhandled exception received: " + c4671Mm, new Object[0]);
    }

    /* renamed from: b */
    public final void m20848b(AppMetricaConfig appMetricaConfig) {
        m19735b(appMetricaConfig.errorEnvironment);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4747Q2
    /* renamed from: k */
    public final String mo19738k() {
        return "[CrashReporter]";
    }

    public C5340o6(Context context, C4690Nh c4690Nh, C4952Yg c4952Yg, C4586J9 c4586j9, C5365p6 c5365p6, C4719Om c4719Om, C4851Ub c4851Ub, C4695Nm c4695Nm, C4879Vf c4879Vf, C5515v6 c5515v6, C4935Y c4935y, C5023be c5023be) {
        super(context, c4690Nh, c4952Yg, c4586j9, c4851Ub, c4695Nm, c4879Vf, c5515v6, c4935y, c5023be);
        this.f32319o = c5365p6;
        this.f32320p = c4719Om;
        C5388q4.m20928h().getClass();
    }
}
