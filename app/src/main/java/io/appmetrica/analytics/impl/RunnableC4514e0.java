package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e0 */
/* loaded from: classes2.dex */
public final class RunnableC4514e0 implements Runnable {
    public final /* synthetic */ C4562g0 a;

    public RunnableC4514e0(C4562g0 c4562g0) {
        this.a = c4562g0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4562g0 c4562g0 = this.a;
        synchronized (c4562g0) {
            if (c4562g0.a != null && c4562g0.a()) {
                try {
                    c4562g0.d = null;
                    c4562g0.a.unbindService(c4562g0.i);
                } catch (Throwable unused) {
                }
            }
            c4562g0.d = null;
        }
    }
}
