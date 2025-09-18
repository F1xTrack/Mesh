package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.za */
/* loaded from: classes2.dex */
public interface InterfaceC5026za extends InterfaceC4860sc, A6, Qa {
    /* synthetic */ Pa a();

    /* synthetic */ void a(int i, Bundle bundle);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void a(Location location);

    void a(AppMetricaConfig appMetricaConfig);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(ReporterConfig reporterConfig);

    void a(StartupParamsCallback startupParamsCallback, List<String> list);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void a(boolean z);

    Oa c(ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void clearAppEnvironment();

    U9 d();

    void e();

    String f();

    Map<String, String> h();

    AdvIdentifiersResult i();

    Yb j();

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void setDataSendingEnabled(boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void setUserProfileID(String str);
}
