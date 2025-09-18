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

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4872t0 implements InterfaceC5026za {
    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.A6
    public final void a(int i, Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final Oa c(ReporterConfig reporterConfig) {
        return new C5033zh();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final U9 d() {
        return new U9();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void e() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final String f() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final Map<String, String> h() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final AdvIdentifiersResult i() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final Yb j() {
        C4622ic c4622ic = new C4622ic();
        return new Yb(c4622ic, new C5023z7(c4622ic));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.InterfaceC4860sc
    public final void a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5026za, io.appmetrica.analytics.impl.Qa
    public final Pa a() {
        return new Ch();
    }
}
