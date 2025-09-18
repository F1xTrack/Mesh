package io.sentry.android.core;

import io.sentry.C5782L0;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5785M0;
import io.sentry.InterfaceC5807U;

/* renamed from: io.sentry.android.core.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5867g implements InterfaceC5785M0 {

    /* renamed from: a */
    public final /* synthetic */ int f33693a;

    /* renamed from: b */
    public final /* synthetic */ ActivityLifecycleIntegration f33694b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5807U f33695c;

    public /* synthetic */ C5867g(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC5807U interfaceC5807U, int i) {
        this.f33693a = i;
        this.f33694b = activityLifecycleIntegration;
        this.f33695c = interfaceC5807U;
    }

    /* renamed from: a */
    private final void m21568a(C5782L0 c5782l0) {
        ActivityLifecycleIntegration activityLifecycleIntegration = this.f33694b;
        InterfaceC5807U interfaceC5807U = this.f33695c;
        activityLifecycleIntegration.getClass();
        synchronized (c5782l0.f33317m) {
            if (c5782l0.f33305a == interfaceC5807U) {
                c5782l0.m21412c();
            }
        }
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public final void mo3170b(C5782L0 c5782l0) {
        switch (this.f33693a) {
            case 0:
                m21568a(c5782l0);
                return;
            default:
                ActivityLifecycleIntegration activityLifecycleIntegration = this.f33694b;
                InterfaceC5807U interfaceC5807U = this.f33695c;
                activityLifecycleIntegration.getClass();
                synchronized (c5782l0.f33317m) {
                    if (c5782l0.f33305a == null) {
                        c5782l0.m21415f(interfaceC5807U);
                    } else {
                        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f33486d;
                        if (sentryAndroidOptions != null) {
                            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC5807U.getName());
                        }
                    }
                }
                return;
        }
    }
}
