package io.sentry.android.core;

/* renamed from: io.sentry.android.core.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5089f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityLifecycleIntegration b;
    public final /* synthetic */ io.sentry.T c;
    public final /* synthetic */ io.sentry.T d;

    public /* synthetic */ RunnableC5089f(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.T t, io.sentry.T t2, int i) {
        this.a = i;
        this.b = activityLifecycleIntegration;
        this.c = t;
        this.d = t2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w(this.c, this.d);
                break;
            case 1:
                this.b.w(this.c, this.d);
                break;
            default:
                this.b.getClass();
                ActivityLifecycleIntegration.n(this.c, this.d);
                break;
        }
    }
}
