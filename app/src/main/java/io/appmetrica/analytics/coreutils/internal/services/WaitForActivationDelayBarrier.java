package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.RunnableC4325l;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes2.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a */
    private long f29745a;

    /* renamed from: b */
    private final SystemTimeProvider f29746b;

    public static class ActivationBarrierHelper {

        /* renamed from: a */
        private boolean f29747a = false;

        /* renamed from: b */
        private final C4328a f29748b;

        /* renamed from: c */
        private final WaitForActivationDelayBarrier f29749c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f29748b = new C4328a(this, runnable);
            this.f29749c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j, ICommonExecutor iCommonExecutor) {
            if (this.f29747a) {
                iCommonExecutor.execute(new RunnableC4329b(this));
            } else {
                this.f29749c.subscribe(j, iCommonExecutor, this.f29748b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f29745a = this.f29746b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new RunnableC4325l(activationBarrierCallback), Math.max(j - (this.f29746b.currentTimeMillis() - this.f29745a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f29746b = systemTimeProvider;
    }
}
