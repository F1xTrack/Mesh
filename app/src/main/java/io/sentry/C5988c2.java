package io.sentry;

import io.sentry.hints.AbstractC6028c;
import io.sentry.hints.InterfaceC6033h;
import io.sentry.hints.InterfaceC6036k;
import io.sentry.protocol.C6104t;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.sentry.c2 */
/* loaded from: classes2.dex */
public final class C5988c2 extends AbstractC6028c implements InterfaceC6033h, InterfaceC6036k {

    /* renamed from: d */
    public final AtomicReference f34095d;

    public C5988c2(long j, ILogger iLogger) {
        super(j, iLogger);
        this.f34095d = new AtomicReference();
    }

    @Override // io.sentry.hints.AbstractC6028c
    /* renamed from: f */
    public final boolean mo21645f(C6104t c6104t) {
        C6104t c6104t2 = (C6104t) this.f34095d.get();
        return c6104t2 != null && c6104t2.equals(c6104t);
    }

    @Override // io.sentry.hints.AbstractC6028c
    /* renamed from: g */
    public final void mo21646g(C6104t c6104t) {
        this.f34095d.set(c6104t);
    }
}
