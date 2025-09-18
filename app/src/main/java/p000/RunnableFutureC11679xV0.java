package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: xV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableFutureC11679xV0 implements RunnableFuture, ScheduledFuture {

    /* renamed from: a */
    public final FutureTask f45663a;

    public RunnableFutureC11679xV0(Callable callable) {
        this.f45663a = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f45663a.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f45663a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f45663a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f45663a.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.f45663a.run();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f45663a.get(j, timeUnit);
    }

    public RunnableFutureC11679xV0(Runnable runnable, Object obj) {
        this.f45663a = new FutureTask(runnable, obj);
    }
}
