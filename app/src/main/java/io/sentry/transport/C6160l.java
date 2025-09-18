package io.sentry.transport;

import com.yandex.metrica.C2460e;
import io.sentry.AbstractC5827a1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5981b1;
import io.sentry.ThreadFactoryC5748A;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.transport.l */
/* loaded from: classes2.dex */
public final class C6160l extends ThreadPoolExecutor {

    /* renamed from: a */
    public final int f34644a;

    /* renamed from: b */
    public AbstractC5827a1 f34645b;

    /* renamed from: c */
    public final ILogger f34646c;

    /* renamed from: d */
    public final InterfaceC5981b1 f34647d;

    /* renamed from: e */
    public final C2460e f34648e;

    public C6160l(int i, ThreadFactoryC5748A threadFactoryC5748A, RejectedExecutionHandlerC6149a rejectedExecutionHandlerC6149a, ILogger iLogger, InterfaceC5981b1 interfaceC5981b1) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC5748A, rejectedExecutionHandlerC6149a);
        this.f34645b = null;
        this.f34648e = new C2460e(9, false);
        this.f34644a = i;
        this.f34646c = iLogger;
        this.f34647d = interfaceC5981b1;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        C2460e c2460e = this.f34648e;
        try {
            super.afterExecute(runnable, th);
        } finally {
            c2460e.getClass();
            int i = C6162n.f34655a;
            ((C6162n) c2460e.f20786a).releaseShared(1);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        C2460e c2460e = this.f34648e;
        if (C6162n.m21875a((C6162n) c2460e.f20786a) < this.f34644a) {
            C6162n.m21876b((C6162n) c2460e.f20786a);
            return super.submit(runnable);
        }
        this.f34645b = this.f34647d.now();
        this.f34646c.mo21407k(EnumC6069n1.WARNING, "Submit cancelled", new Object[0]);
        return new FutureC6159k();
    }
}
