package io.sentry;

import defpackage.CallableC0437Fj;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class B {
    public static final long g = TimeUnit.HOURS.toMillis(5);
    public static final long h = TimeUnit.SECONDS.toMillis(1);
    public static B i;
    public final long a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final CallableC5188z e;
    public final ExecutorService f;

    public B() throws ExecutionException, InterruptedException, TimeoutException {
        CallableC5188z callableC5188z = new CallableC5188z(0);
        this.d = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor(new A(0));
        this.a = g;
        this.e = callableC5188z;
        a();
    }

    public final void a() throws ExecutionException, InterruptedException, TimeoutException {
        try {
            this.f.submit(new CallableC0437Fj(10, this)).get(h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
