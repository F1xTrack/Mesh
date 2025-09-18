package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.gc */
/* loaded from: classes2.dex */
public final class C4574gc {
    public final Context a;
    public final Nh b;
    public final C4527ed c;
    public final J9 d;
    public final Yg e;
    public final C4540f2 f;
    public final Ub g;
    public final r h;
    public final C4453be i;
    public final Nm j;
    public final Vf k;
    public final C4926v6 l;
    public final Y m;

    public C4574gc(Context context, Re re, Nh nh, Pk pk) {
        this.a = context;
        this.b = nh;
        this.c = new C4527ed(re);
        J9 j9 = new J9(context);
        this.d = j9;
        this.e = new Yg(re, new CounterConfiguration(CounterConfigurationReporterType.MAIN));
        this.f = new C4540f2();
        this.g = C4805q4.h().k();
        this.h = new r();
        this.i = new C4453be(j9);
        this.j = new Nm();
        this.k = new Vf();
        this.l = new C4926v6();
        this.m = new Y();
    }

    public final Y a() {
        return this.m;
    }

    public final Context b() {
        return this.a;
    }

    public final C4926v6 c() {
        return this.l;
    }

    public final J9 d() {
        return this.d;
    }

    public final C4453be e() {
        return this.i;
    }

    public final Ub f() {
        return this.g;
    }

    public final Vf g() {
        return this.k;
    }

    public final Yg h() {
        return this.e;
    }

    public final Nh i() {
        return this.b;
    }

    public final Nm j() {
        return this.j;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.e.b.applyFromConfig(appMetricaConfig);
        Yg yg = this.e;
        String str = appMetricaConfig.userProfileID;
        synchronized (yg) {
            yg.f = str;
        }
        Yg yg2 = this.e;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        yg2.d = new Le(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
