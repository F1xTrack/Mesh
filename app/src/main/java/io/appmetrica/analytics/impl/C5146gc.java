package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.gc */
/* loaded from: classes2.dex */
public final class C5146gc {

    /* renamed from: a */
    public final Context f31759a;

    /* renamed from: b */
    public final C4690Nh f31760b;

    /* renamed from: c */
    public final C5097ed f31761c;

    /* renamed from: d */
    public final C4586J9 f31762d;

    /* renamed from: e */
    public final C4952Yg f31763e;

    /* renamed from: f */
    public final C5111f2 f31764f;

    /* renamed from: g */
    public final C4851Ub f31765g;

    /* renamed from: h */
    public final C5408r f31766h;

    /* renamed from: i */
    public final C5023be f31767i;

    /* renamed from: j */
    public final C4695Nm f31768j;

    /* renamed from: k */
    public final C4879Vf f31769k;

    /* renamed from: l */
    public final C5515v6 f31770l;

    /* renamed from: m */
    public final C4935Y f31771m;

    public C5146gc(Context context, C4782Re c4782Re, C4690Nh c4690Nh, C4741Pk c4741Pk) {
        this.f31759a = context;
        this.f31760b = c4690Nh;
        this.f31761c = new C5097ed(c4782Re);
        C4586J9 c4586j9 = new C4586J9(context);
        this.f31762d = c4586j9;
        this.f31763e = new C4952Yg(c4782Re, new CounterConfiguration(CounterConfigurationReporterType.MAIN));
        this.f31764f = new C5111f2();
        this.f31765g = C5388q4.m20928h().m20940k();
        this.f31766h = new C5408r();
        this.f31767i = new C5023be(c4586j9);
        this.f31768j = new C4695Nm();
        this.f31769k = new C4879Vf();
        this.f31770l = new C5515v6();
        this.f31771m = new C4935Y();
    }

    /* renamed from: a */
    public final C4935Y m20451a() {
        return this.f31771m;
    }

    /* renamed from: b */
    public final Context m20453b() {
        return this.f31759a;
    }

    /* renamed from: c */
    public final C5515v6 m20454c() {
        return this.f31770l;
    }

    /* renamed from: d */
    public final C4586J9 m20455d() {
        return this.f31762d;
    }

    /* renamed from: e */
    public final C5023be m20456e() {
        return this.f31767i;
    }

    /* renamed from: f */
    public final C4851Ub m20457f() {
        return this.f31765g;
    }

    /* renamed from: g */
    public final C4879Vf m20458g() {
        return this.f31769k;
    }

    /* renamed from: h */
    public final C4952Yg m20459h() {
        return this.f31763e;
    }

    /* renamed from: i */
    public final C4690Nh m20460i() {
        return this.f31760b;
    }

    /* renamed from: j */
    public final C4695Nm m20461j() {
        return this.f31768j;
    }

    /* renamed from: a */
    public final void m20452a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f31763e.f31090b.applyFromConfig(appMetricaConfig);
        C4952Yg c4952Yg = this.f31763e;
        String str = appMetricaConfig.userProfileID;
        synchronized (c4952Yg) {
            c4952Yg.f31119f = str;
        }
        C4952Yg c4952Yg2 = this.f31763e;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        c4952Yg2.f31117d = new C4639Le(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
