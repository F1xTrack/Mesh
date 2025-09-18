package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e0 */
/* loaded from: classes2.dex */
public final class RunnableC5084e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5134g0 f31513a;

    public RunnableC5084e0(C5134g0 c5134g0) {
        this.f31513a = c5134g0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5134g0 c5134g0 = this.f31513a;
        synchronized (c5134g0) {
            if (c5134g0.f31706a != null && c5134g0.m20402a()) {
                try {
                    c5134g0.f31709d = null;
                    c5134g0.f31706a.unbindService(c5134g0.f31714i);
                } catch (Throwable unused) {
                }
            }
            c5134g0.f31709d = null;
        }
    }
}
