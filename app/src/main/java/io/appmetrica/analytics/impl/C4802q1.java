package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.q1 */
/* loaded from: classes2.dex */
public final class C4802q1 extends SafeRunnable {
    public final /* synthetic */ C5017z1 a;

    public C4802q1(C5017z1 c5017z1) {
        this.a = c5017z1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.a) {
            try {
                C5017z1 c5017z1 = this.a;
                if (c5017z1.c) {
                    c5017z1.b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
