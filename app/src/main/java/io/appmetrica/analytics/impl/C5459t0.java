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

/* renamed from: io.appmetrica.analytics.impl.t0 */
/* loaded from: classes2.dex */
public final class C5459t0 implements InterfaceC5619za {
    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC4363A6
    /* renamed from: a */
    public final void mo19185a(int i, Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: c */
    public final InterfaceC4707Oa mo20996c(ReporterConfig reporterConfig) {
        return new C5626zh();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: d */
    public final C4849U9 mo20997d() {
        return new C4849U9();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: e */
    public final void mo20998e() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: f */
    public final String mo20999f() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: h */
    public final Map<String, String> mo21000h() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: i */
    public final AdvIdentifiersResult mo21001i() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: j */
    public final C4947Yb mo21002j() {
        C5196ic c5196ic = new C5196ic();
        return new C4947Yb(c5196ic, new C5616z7(c5196ic));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19312a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20989a(AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20991a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20992a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20993a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19314a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    public final void mo19315a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za
    /* renamed from: a */
    public final void mo20994a(StartupParamsCallback startupParamsCallback, List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5619za, io.appmetrica.analytics.impl.InterfaceC4755Qa
    /* renamed from: a */
    public final InterfaceC4731Pa mo19238a() {
        return new C4424Ch();
    }
}
