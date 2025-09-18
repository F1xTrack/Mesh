package io.sentry.android.core;

/* renamed from: io.sentry.android.core.z */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5917z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33865a;

    /* renamed from: b */
    public final /* synthetic */ AppLifecycleIntegration f33866b;

    public /* synthetic */ RunnableC5917z(AppLifecycleIntegration appLifecycleIntegration, int i) {
        this.f33865a = i;
        this.f33866b = appLifecycleIntegration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33865a) {
            case 0:
                this.f33866b.m21511n();
                break;
            default:
                this.f33866b.m21510m();
                break;
        }
    }
}
