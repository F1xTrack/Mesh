package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.rn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3061rn implements InterfaceExecutorC3086sn {
    private final Looper a;
    private final Handler b;
    private final HandlerThreadC3136un c;

    public C3061rn(String str) {
        this(a(str));
    }

    public Handler a() {
        return this.b;
    }

    public Looper b() {
        return this.a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3111tn
    public boolean c() {
        return this.c.c();
    }

    public void d() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    public C3061rn(HandlerThreadC3136un handlerThreadC3136un) {
        this(handlerThreadC3136un, handlerThreadC3136un.getLooper(), new Handler(handlerThreadC3136un.getLooper()));
    }

    public <T> Future<T> a(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.b.post(futureTask);
        return futureTask;
    }

    public C3061rn(HandlerThreadC3136un handlerThreadC3136un, Looper looper, Handler handler) {
        this.c = handlerThreadC3136un;
        this.a = looper;
        this.b = handler;
    }

    public void a(Runnable runnable, long j) {
        this.b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    public void a(Runnable runnable, long j, TimeUnit timeUnit) {
        this.b.postDelayed(runnable, timeUnit.toMillis(j));
    }

    public void a(Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    private static HandlerThreadC3136un a(String str) {
        HandlerThreadC3136un handlerThreadC3136unB = new ThreadFactoryC3191wn(str).b();
        handlerThreadC3136unB.start();
        return handlerThreadC3136unB;
    }
}
