package io.sentry.exception;

import io.sentry.protocol.j;

/* loaded from: classes2.dex */
public final class a extends RuntimeException {
    public final j a;
    public final Throwable b;
    public final Thread c;
    public final boolean d;

    public a(j jVar, Throwable th, Thread thread, boolean z) {
        this.a = jVar;
        io.sentry.config.a.D(th, "Throwable is required.");
        this.b = th;
        io.sentry.config.a.D(thread, "Thread is required.");
        this.c = thread;
        this.d = z;
    }
}
