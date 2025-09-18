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
public interface InterfaceC5619za extends InterfaceC5446sc, InterfaceC4363A6, InterfaceC4755Qa {
    /* renamed from: a */
    /* synthetic */ InterfaceC4731Pa mo19238a();

    /* renamed from: a */
    /* synthetic */ void mo19185a(int i, Bundle bundle);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    /* synthetic */ void mo19312a(Location location);

    /* renamed from: a */
    void mo20989a(AppMetricaConfig appMetricaConfig);

    /* renamed from: a */
    void mo20991a(DeferredDeeplinkListener deferredDeeplinkListener);

    /* renamed from: a */
    void mo20992a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    /* renamed from: a */
    void mo20993a(ReporterConfig reporterConfig);

    /* renamed from: a */
    void mo20994a(StartupParamsCallback startupParamsCallback, List<String> list);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    /* synthetic */ void mo19314a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    /* synthetic */ void mo19315a(boolean z);

    /* renamed from: c */
    InterfaceC4707Oa mo20996c(ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* synthetic */ void clearAppEnvironment();

    /* renamed from: d */
    C4849U9 mo20997d();

    /* renamed from: e */
    void mo20998e();

    /* renamed from: f */
    String mo20999f();

    /* renamed from: h */
    Map<String, String> mo21000h();

    /* renamed from: i */
    AdvIdentifiersResult mo21001i();

    /* renamed from: j */
    C4947Yb mo21002j();

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* synthetic */ void setDataSendingEnabled(boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* synthetic */ void setUserProfileID(String str);
}
