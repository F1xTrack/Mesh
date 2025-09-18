package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0852NX;

/* renamed from: io.appmetrica.analytics.impl.w9 */
/* loaded from: classes2.dex */
public final class C5543w9 implements IHandlerExecutor {

    /* renamed from: a */
    public final Looper f32760a;

    /* renamed from: b */
    public final Handler f32761b;

    /* renamed from: c */
    public final HandlerThreadC4922Xa f32762c;

    public C5543w9(String str) {
        this(m21177a(str));
    }

    /* renamed from: a */
    public static HandlerThreadC4922Xa m21177a(String str) {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, "-");
        sbM5762k.append(ThreadFactoryC5047cd.f31411a.incrementAndGet());
        HandlerThreadC4922Xa handlerThreadC4922Xa = new HandlerThreadC4922Xa(sbM5762k.toString());
        handlerThreadC4922Xa.start();
        return handlerThreadC4922Xa;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f32761b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j) {
        this.f32761b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f32761b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f32760a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC4922Xa handlerThreadC4922Xa = this.f32762c;
        synchronized (handlerThreadC4922Xa) {
            z = handlerThreadC4922Xa.f31028a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f32761b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f32761b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC4922Xa handlerThreadC4922Xa = this.f32762c;
        synchronized (handlerThreadC4922Xa) {
            handlerThreadC4922Xa.f31028a = false;
            handlerThreadC4922Xa.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f32761b.post(futureTask);
        return futureTask;
    }

    public C5543w9(HandlerThreadC4922Xa handlerThreadC4922Xa) {
        this(handlerThreadC4922Xa, handlerThreadC4922Xa.getLooper(), new Handler(handlerThreadC4922Xa.getLooper()));
    }

    public C5543w9(HandlerThreadC4922Xa handlerThreadC4922Xa, Looper looper, Handler handler) {
        this.f32762c = handlerThreadC4922Xa;
        this.f32760a = looper;
        this.f32761b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j, TimeUnit timeUnit) {
        this.f32761b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
