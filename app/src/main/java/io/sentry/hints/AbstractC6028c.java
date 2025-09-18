package io.sentry.hints;

import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.protocol.C6104t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.hints.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6028c implements InterfaceC6031f {

    /* renamed from: a */
    public final CountDownLatch f34180a = new CountDownLatch(1);

    /* renamed from: b */
    public final long f34181b;

    /* renamed from: c */
    public final ILogger f34182c;

    public AbstractC6028c(long j, ILogger iLogger) {
        this.f34181b = j;
        this.f34182c = iLogger;
    }

    @Override // io.sentry.hints.InterfaceC6031f
    /* renamed from: d */
    public final boolean mo21532d() {
        try {
            return this.f34180a.await(this.f34181b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f34182c.mo21406d(EnumC6069n1.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    /* renamed from: f */
    public abstract boolean mo21645f(C6104t c6104t);

    /* renamed from: g */
    public abstract void mo21646g(C6104t c6104t);
}
