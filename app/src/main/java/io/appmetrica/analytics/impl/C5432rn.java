package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.impl.rn */
/* loaded from: classes2.dex */
public final class C5432rn extends SimpleThreadSafeToggle implements ApplicationStateObserver {
    public C5432rn() {
        super(false, "[VisibleAppStateOnlyTrackingStatusToggle]");
        synchronized (this) {
            m21025a(C5244ka.m20614h().m20619c().registerStickyObserver(this));
        }
    }

    /* renamed from: a */
    public final void m21025a(ApplicationState applicationState) {
        updateState(applicationState == ApplicationState.VISIBLE);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(ApplicationState applicationState) {
        m21025a(applicationState);
    }
}
