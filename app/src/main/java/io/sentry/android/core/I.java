package io.sentry.android.core;

import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class I implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {
    public final long d;
    public final ILogger e;
    public CountDownLatch c = new CountDownLatch(1);
    public boolean a = false;
    public boolean b = false;

    public I(long j, ILogger iLogger) {
        this.d = j;
        io.sentry.config.a.D(iLogger, "ILogger is required.");
        this.e = iLogger;
    }

    @Override // io.sentry.hints.g
    public final boolean a() {
        return this.a;
    }

    @Override // io.sentry.hints.j
    public final void b(boolean z) {
        this.b = z;
        this.c.countDown();
    }

    @Override // io.sentry.hints.g
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.c.await(this.d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.e.d(EnumC5148n1.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.j
    public final boolean e() {
        return this.b;
    }
}
