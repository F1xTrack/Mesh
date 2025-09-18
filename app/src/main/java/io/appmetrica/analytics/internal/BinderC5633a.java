package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.internal.a */
/* loaded from: classes2.dex */
public final class BinderC5633a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        AppMetricaService.f32942c.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i, Bundle bundle) {
        AppMetricaService.f32942c.reportData(i, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        AppMetricaService.f32942c.resumeUserSession(bundle);
    }
}
