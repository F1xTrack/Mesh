package io.sentry.android.core;

import io.sentry.EnumC5148n1;
import io.sentry.L0;
import io.sentry.M0;

/* renamed from: io.sentry.android.core.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5090g implements M0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityLifecycleIntegration b;
    public final /* synthetic */ io.sentry.U c;

    public /* synthetic */ C5090g(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.U u, int i) {
        this.a = i;
        this.b = activityLifecycleIntegration;
        this.c = u;
    }

    private final void a(L0 l0) {
        ActivityLifecycleIntegration activityLifecycleIntegration = this.b;
        io.sentry.U u = this.c;
        activityLifecycleIntegration.getClass();
        synchronized (l0.m) {
            if (l0.a == u) {
                l0.c();
            }
        }
    }

    @Override // io.sentry.M0
    public final void b(L0 l0) {
        switch (this.a) {
            case 0:
                a(l0);
                return;
            default:
                ActivityLifecycleIntegration activityLifecycleIntegration = this.b;
                io.sentry.U u = this.c;
                activityLifecycleIntegration.getClass();
                synchronized (l0.m) {
                    if (l0.a == null) {
                        l0.f(u);
                    } else {
                        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.d;
                        if (sentryAndroidOptions != null) {
                            sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", u.getName());
                        }
                    }
                }
                return;
        }
    }
}
