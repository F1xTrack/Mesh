package io.sentry;

import io.sentry.hints.InterfaceC6029d;
import io.sentry.hints.InterfaceC6031f;
import io.sentry.hints.InterfaceC6032g;
import io.sentry.hints.InterfaceC6035j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.n */
/* loaded from: classes2.dex */
public final class C6067n implements InterfaceC6029d, InterfaceC6032g, InterfaceC6035j, InterfaceC6031f {

    /* renamed from: a */
    public boolean f34246a = false;

    /* renamed from: b */
    public boolean f34247b = false;

    /* renamed from: c */
    public final CountDownLatch f34248c = new CountDownLatch(1);

    /* renamed from: d */
    public final long f34249d;

    /* renamed from: e */
    public final ILogger f34250e;

    /* renamed from: f */
    public final String f34251f;

    /* renamed from: g */
    public final C5815W1 f34252g;

    public C6067n(long j, ILogger iLogger, String str, C5815W1 c5815w1) {
        this.f34249d = j;
        this.f34251f = str;
        this.f34252g = c5815w1;
        this.f34250e = iLogger;
    }

    @Override // io.sentry.hints.InterfaceC6032g
    /* renamed from: a */
    public final boolean mo21529a() {
        return this.f34246a;
    }

    @Override // io.sentry.hints.InterfaceC6035j
    /* renamed from: b */
    public final void mo21530b(boolean z) {
        this.f34247b = z;
        this.f34248c.countDown();
    }

    @Override // io.sentry.hints.InterfaceC6032g
    /* renamed from: c */
    public final void mo21531c(boolean z) {
        this.f34246a = z;
    }

    @Override // io.sentry.hints.InterfaceC6031f
    /* renamed from: d */
    public final boolean mo21532d() {
        try {
            return this.f34248c.await(this.f34249d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f34250e.mo21406d(EnumC6069n1.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.InterfaceC6035j
    /* renamed from: e */
    public final boolean mo21533e() {
        return this.f34247b;
    }
}
