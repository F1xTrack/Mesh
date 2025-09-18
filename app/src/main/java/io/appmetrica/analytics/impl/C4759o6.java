package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.o6 */
/* loaded from: classes2.dex */
public final class C4759o6 extends Q2 {
    public final C4783p6 o;
    public final Om p;

    public C4759o6(Context context, Re re, AppMetricaConfig appMetricaConfig, Nh nh, J9 j9) {
        this(context, nh, new Yg(re, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), appMetricaConfig.userProfileID), j9, new C4783p6(context), new Om(), C4805q4.h().k(), new Nm(), new Vf(), new C4926v6(), new Y(), new C4453be(j9));
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.impl.Oa, io.appmetrica.analytics.impl.Ra
    public final void a(Mm mm) {
        this.o.a(this.p.a(mm, this.b));
        this.c.info("Unhandled exception received: " + mm, new Object[0]);
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        b(appMetricaConfig.errorEnvironment);
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String k() {
        return "[CrashReporter]";
    }

    public C4759o6(Context context, Nh nh, Yg yg, J9 j9, C4783p6 c4783p6, Om om, Ub ub, Nm nm, Vf vf, C4926v6 c4926v6, Y y, C4453be c4453be) {
        super(context, nh, yg, j9, ub, nm, vf, c4926v6, y, c4453be);
        this.o = c4783p6;
        this.p = om;
        C4805q4.h().getClass();
    }
}
