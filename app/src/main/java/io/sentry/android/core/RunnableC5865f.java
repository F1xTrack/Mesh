package io.sentry.android.core;

import io.sentry.InterfaceC5804T;

/* renamed from: io.sentry.android.core.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5865f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33684a;

    /* renamed from: b */
    public final /* synthetic */ ActivityLifecycleIntegration f33685b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5804T f33686c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC5804T f33687d;

    public /* synthetic */ RunnableC5865f(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC5804T interfaceC5804T, InterfaceC5804T interfaceC5804T2, int i) {
        this.f33684a = i;
        this.f33685b = activityLifecycleIntegration;
        this.f33686c = interfaceC5804T;
        this.f33687d = interfaceC5804T2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33684a) {
            case 0:
                this.f33685b.m21505w(this.f33686c, this.f33687d);
                break;
            case 1:
                this.f33685b.m21505w(this.f33686c, this.f33687d);
                break;
            default:
                this.f33685b.getClass();
                ActivityLifecycleIntegration.m21500n(this.f33686c, this.f33687d);
                break;
        }
    }
}
