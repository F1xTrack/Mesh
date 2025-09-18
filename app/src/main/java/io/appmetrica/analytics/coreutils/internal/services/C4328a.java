package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.a */
/* loaded from: classes2.dex */
public final class C4328a implements ActivationBarrierCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f29750a;

    /* renamed from: b */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f29751b;

    public C4328a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.f29751b = activationBarrierHelper;
        this.f29750a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f29751b.f29747a = true;
        this.f29750a.run();
    }
}
