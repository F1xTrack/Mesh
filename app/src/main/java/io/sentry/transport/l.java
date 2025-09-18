package io.sentry.transport;

import io.sentry.A;
import io.sentry.AbstractC5083a1;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5112b1;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l extends ThreadPoolExecutor {
    public final int a;
    public AbstractC5083a1 b;
    public final ILogger c;
    public final InterfaceC5112b1 d;
    public final com.yandex.metrica.e e;

    public l(int i, A a, a aVar, ILogger iLogger, InterfaceC5112b1 interfaceC5112b1) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), a, aVar);
        this.b = null;
        this.e = new com.yandex.metrica.e(9, false);
        this.a = i;
        this.c = iLogger;
        this.d = interfaceC5112b1;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        com.yandex.metrica.e eVar = this.e;
        try {
            super.afterExecute(runnable, th);
        } finally {
            eVar.getClass();
            int i = n.a;
            ((n) eVar.a).releaseShared(1);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        com.yandex.metrica.e eVar = this.e;
        if (n.a((n) eVar.a) < this.a) {
            n.b((n) eVar.a);
            return super.submit(runnable);
        }
        this.b = this.d.now();
        this.c.k(EnumC5148n1.WARNING, "Submit cancelled", new Object[0]);
        return new k();
    }
}
