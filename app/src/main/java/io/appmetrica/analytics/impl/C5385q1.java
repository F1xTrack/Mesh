package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.q1 */
/* loaded from: classes2.dex */
public final class C5385q1 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C5610z1 f32415a;

    public C5385q1(C5610z1 c5610z1) {
        this.f32415a = c5610z1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f32415a) {
            try {
                C5610z1 c5610z1 = this.f32415a;
                if (c5610z1.f32902c) {
                    c5610z1.f32901b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
