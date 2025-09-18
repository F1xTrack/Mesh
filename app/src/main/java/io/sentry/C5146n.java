package io.sentry;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5146n implements io.sentry.hints.d, io.sentry.hints.g, io.sentry.hints.j, io.sentry.hints.f {
    public boolean a = false;
    public boolean b = false;
    public final CountDownLatch c = new CountDownLatch(1);
    public final long d;
    public final ILogger e;
    public final String f;
    public final W1 g;

    public C5146n(long j, ILogger iLogger, String str, W1 w1) {
        this.d = j;
        this.f = str;
        this.g = w1;
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
