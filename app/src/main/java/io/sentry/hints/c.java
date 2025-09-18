package io.sentry.hints;

import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.protocol.t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class c implements f {
    public final CountDownLatch a = new CountDownLatch(1);
    public final long b;
    public final ILogger c;

    public c(long j, ILogger iLogger) {
        this.b = j;
        this.c = iLogger;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.a.await(this.b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.c.d(EnumC5148n1.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public abstract boolean f(t tVar);

    public abstract void g(t tVar);
}
