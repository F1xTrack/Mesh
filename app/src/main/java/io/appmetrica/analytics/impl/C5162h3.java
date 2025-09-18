package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;

/* renamed from: io.appmetrica.analytics.impl.h3 */
/* loaded from: classes2.dex */
public final class C5162h3 implements ApplicationStateObserver {

    /* renamed from: a */
    public final /* synthetic */ C5187i3 f31825a;

    public C5162h3(C5187i3 c5187i3) {
        this.f31825a = c5187i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final void onApplicationStateChanged(ApplicationState applicationState) {
        C5187i3 c5187i3 = this.f31825a;
        c5187i3.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = c5187i3.f31890a;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
