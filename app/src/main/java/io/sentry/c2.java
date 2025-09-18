package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c2 extends io.sentry.hints.c implements io.sentry.hints.h, io.sentry.hints.k {
    public final AtomicReference d;

    public c2(long j, ILogger iLogger) {
        super(j, iLogger);
        this.d = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.t tVar) {
        io.sentry.protocol.t tVar2 = (io.sentry.protocol.t) this.d.get();
        return tVar2 != null && tVar2.equals(tVar);
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.t tVar) {
        this.d.set(tVar);
    }
}
