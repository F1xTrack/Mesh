package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.coreutils.impl.l */
/* loaded from: classes2.dex */
public final class RunnableC4325l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ActivationBarrierCallback f29700a;

    public RunnableC4325l(ActivationBarrierCallback activationBarrierCallback) {
        this.f29700a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29700a.onWaitFinished();
    }
}
