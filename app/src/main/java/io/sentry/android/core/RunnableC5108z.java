package io.sentry.android.core;

/* renamed from: io.sentry.android.core.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5108z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppLifecycleIntegration b;

    public /* synthetic */ RunnableC5108z(AppLifecycleIntegration appLifecycleIntegration, int i) {
        this.a = i;
        this.b = appLifecycleIntegration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            default:
                this.b.m();
                break;
        }
    }
}
