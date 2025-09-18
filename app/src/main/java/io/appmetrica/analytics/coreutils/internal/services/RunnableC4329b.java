package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.b */
/* loaded from: classes2.dex */
public final class RunnableC4329b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f29752a;

    public RunnableC4329b(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.f29752a = activationBarrierHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4328a c4328a = this.f29752a.f29748b;
        c4328a.f29751b.f29747a = true;
        c4328a.f29750a.run();
    }
}
