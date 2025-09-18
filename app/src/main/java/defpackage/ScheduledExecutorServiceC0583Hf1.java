package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: Hf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC0583Hf1 extends AbstractExecutorService implements ScheduledExecutorService {
    public static ScheduledExecutorServiceC0583Hf1 b;
    public final Handler a;

    public ScheduledExecutorServiceC0583Hf1(Handler handler) {
        this.a = handler;
    }

    public final void a(Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.a.getLooper().getThread()) {
            runnable.run();
        } else {
            a(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC7995xV0(runnable, obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC7995xV0 runnableFutureC7995xV0 = new RunnableFutureC7995xV0(runnable, null);
        this.a.postDelayed(runnableFutureC7995xV0, timeUnit.toMillis(j));
        return runnableFutureC7995xV0;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        RunnableFutureC7995xV0 runnableFutureC7995xV0 = new RunnableFutureC7995xV0(runnable, null);
        execute(runnableFutureC7995xV0);
        return runnableFutureC7995xV0;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC7995xV0(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC7995xV0 runnableFutureC7995xV0 = new RunnableFutureC7995xV0(callable);
        this.a.postDelayed(runnableFutureC7995xV0, timeUnit.toMillis(j));
        return runnableFutureC7995xV0;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        RunnableFutureC7995xV0 runnableFutureC7995xV0 = new RunnableFutureC7995xV0(runnable, obj);
        execute(runnableFutureC7995xV0);
        return runnableFutureC7995xV0;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        RunnableFutureC7995xV0 runnableFutureC7995xV0 = new RunnableFutureC7995xV0(callable);
        execute(runnableFutureC7995xV0);
        return runnableFutureC7995xV0;
    }
}
