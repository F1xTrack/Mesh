package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.jc */
/* loaded from: classes2.dex */
public final class C5221jc extends AbstractC4747Q2 {
    public C5221jc(Context context, C4782Re c4782Re, ReporterConfig reporterConfig, C4690Nh c4690Nh, C4586J9 c4586j9) {
        this(context, c4690Nh, new C4952Yg(c4782Re, new CounterConfiguration(reporterConfig), reporterConfig.userProfileID), c4586j9, C5388q4.m20928h().m20940k(), new C4695Nm(), new C4879Vf(), new C5515v6(), new C4935Y(), new C5023be(c4586j9));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4747Q2
    /* renamed from: k */
    public final String mo19738k() {
        return "[ManualReporter]";
    }

    public C5221jc(Context context, C4690Nh c4690Nh, C4952Yg c4952Yg, C4586J9 c4586j9, C4851Ub c4851Ub, C4695Nm c4695Nm, C4879Vf c4879Vf, C5515v6 c5515v6, C4935Y c4935y, C5023be c5023be) {
        super(context, c4690Nh, c4952Yg, c4586j9, c4851Ub, c4695Nm, c4879Vf, c5515v6, c4935y, c5023be);
        C5388q4.m20928h().getClass();
    }
}
