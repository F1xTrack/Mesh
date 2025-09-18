package io.sentry.android.core;

import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.config.AbstractC6003a;
import io.sentry.hints.InterfaceC6029d;
import io.sentry.hints.InterfaceC6031f;
import io.sentry.hints.InterfaceC6032g;
import io.sentry.hints.InterfaceC6035j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.I */
/* loaded from: classes2.dex */
public final class C5837I implements InterfaceC6029d, InterfaceC6032g, InterfaceC6035j, InterfaceC6031f {

    /* renamed from: d */
    public final long f33544d;

    /* renamed from: e */
    public final ILogger f33545e;

    /* renamed from: c */
    public CountDownLatch f33543c = new CountDownLatch(1);

    /* renamed from: a */
    public boolean f33541a = false;

    /* renamed from: b */
    public boolean f33542b = false;

    public C5837I(long j, ILogger iLogger) {
        this.f33544d = j;
        AbstractC6003a.m21735D(iLogger, "ILogger is required.");
        this.f33545e = iLogger;
    }

    @Override // io.sentry.hints.InterfaceC6032g
    /* renamed from: a */
    public final boolean mo21529a() {
        return this.f33541a;
    }

    @Override // io.sentry.hints.InterfaceC6035j
    /* renamed from: b */
    public final void mo21530b(boolean z) {
        this.f33542b = z;
        this.f33543c.countDown();
    }

    @Override // io.sentry.hints.InterfaceC6032g
    /* renamed from: c */
    public final void mo21531c(boolean z) {
        this.f33541a = z;
    }

    @Override // io.sentry.hints.InterfaceC6031f
    /* renamed from: d */
    public final boolean mo21532d() {
        try {
            return this.f33543c.await(this.f33544d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f33545e.mo21406d(EnumC6069n1.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.InterfaceC6035j
    /* renamed from: e */
    public final boolean mo21533e() {
        return this.f33542b;
    }
}
