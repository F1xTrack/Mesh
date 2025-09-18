package io.sentry.transport;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.transport.k */
/* loaded from: classes2.dex */
public final class FutureC6159k implements Future {
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        throw new CancellationException();
    }
}
