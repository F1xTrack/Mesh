package p000;

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
public final class ScheduledExecutorServiceC7689Hf1 extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b */
    public static ScheduledExecutorServiceC7689Hf1 f4396b;

    /* renamed from: a */
    public final Handler f4397a;

    public ScheduledExecutorServiceC7689Hf1(Handler handler) {
        this.f4397a = handler;
    }

    /* renamed from: a */
    public final void m3539a(Runnable runnable) {
        this.f4397a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f4397a.getLooper().getThread()) {
            runnable.run();
        } else {
            m3539a(runnable);
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
        return new RunnableFutureC11679xV0(runnable, obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC11679xV0 runnableFutureC11679xV0 = new RunnableFutureC11679xV0(runnable, null);
        this.f4397a.postDelayed(runnableFutureC11679xV0, timeUnit.toMillis(j));
        return runnableFutureC11679xV0;
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
        RunnableFutureC11679xV0 runnableFutureC11679xV0 = new RunnableFutureC11679xV0(runnable, null);
        execute(runnableFutureC11679xV0);
        return runnableFutureC11679xV0;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC11679xV0(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC11679xV0 runnableFutureC11679xV0 = new RunnableFutureC11679xV0(callable);
        this.f4397a.postDelayed(runnableFutureC11679xV0, timeUnit.toMillis(j));
        return runnableFutureC11679xV0;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        RunnableFutureC11679xV0 runnableFutureC11679xV0 = new RunnableFutureC11679xV0(runnable, obj);
        execute(runnableFutureC11679xV0);
        return runnableFutureC11679xV0;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        RunnableFutureC11679xV0 runnableFutureC11679xV0 = new RunnableFutureC11679xV0(callable);
        execute(runnableFutureC11679xV0);
        return runnableFutureC11679xV0;
    }
}
