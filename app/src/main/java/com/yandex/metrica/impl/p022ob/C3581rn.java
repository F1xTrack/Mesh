package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.rn */
/* loaded from: classes2.dex */
public class C3581rn implements InterfaceExecutorC3607sn {

    /* renamed from: a */
    private final Looper f24624a;

    /* renamed from: b */
    private final Handler f24625b;

    /* renamed from: c */
    private final HandlerThreadC3659un f24626c;

    public C3581rn(String str) {
        this(m16700a(str));
    }

    /* renamed from: a */
    public Handler m16701a() {
        return this.f24625b;
    }

    /* renamed from: b */
    public Looper m16706b() {
        return this.f24624a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3633tn
    /* renamed from: c */
    public boolean mo16707c() {
        return this.f24626c.mo16707c();
    }

    /* renamed from: d */
    public void m16708d() {
        this.f24625b.removeCallbacksAndMessages(null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24625b.post(runnable);
    }

    public C3581rn(HandlerThreadC3659un handlerThreadC3659un) {
        this(handlerThreadC3659un, handlerThreadC3659un.getLooper(), new Handler(handlerThreadC3659un.getLooper()));
    }

    /* renamed from: a */
    public <T> Future<T> m16702a(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f24625b.post(futureTask);
        return futureTask;
    }

    public C3581rn(HandlerThreadC3659un handlerThreadC3659un, Looper looper, Handler handler) {
        this.f24626c = handlerThreadC3659un;
        this.f24624a = looper;
        this.f24625b = handler;
    }

    /* renamed from: a */
    public void m16704a(Runnable runnable, long j) {
        this.f24625b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    /* renamed from: a */
    public void m16705a(Runnable runnable, long j, TimeUnit timeUnit) {
        this.f24625b.postDelayed(runnable, timeUnit.toMillis(j));
    }

    /* renamed from: a */
    public void m16703a(Runnable runnable) {
        this.f24625b.removeCallbacks(runnable);
    }

    /* renamed from: a */
    private static HandlerThreadC3659un m16700a(String str) {
        HandlerThreadC3659un handlerThreadC3659unM17154b = new ThreadFactoryC3711wn(str).m17154b();
        handlerThreadC3659unM17154b.start();
        return handlerThreadC3659unM17154b;
    }
}
