package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;

/* renamed from: io.appmetrica.analytics.impl.h3 */
/* loaded from: classes2.dex */
public final class C4589h3 implements ApplicationStateObserver {
    public final /* synthetic */ C4613i3 a;

    public C4589h3(C4613i3 c4613i3) {
        this.a = c4613i3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final void onApplicationStateChanged(ApplicationState applicationState) {
        C4613i3 c4613i3 = this.a;
        c4613i3.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = c4613i3.a;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
