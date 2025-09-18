package io.sentry.cache;

import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.L0;
import io.sentry.N0;
import io.sentry.Q1;
import io.sentry.W1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.r;
import io.sentry.protocol.C5157c;
import io.sentry.protocol.E;
import io.sentry.protocol.t;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class h extends N0 {
    public final SentryAndroidOptions a;

    public h(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public static Object l(D1 d1, String str, Class cls) {
        return a.b(d1, ".scope-cache", str, cls, null);
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void b(t tVar) {
        m(new f(this, 5, tVar));
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void c(ConcurrentHashMap concurrentHashMap) {
        m(new g(this, concurrentHashMap, 0));
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void d(Q1 q1, L0 l0) {
        m(new r(this, q1, l0, 2));
    }

    @Override // io.sentry.P
    public final void e(E e) {
        m(new f(this, 0, e));
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void f(C5157c c5157c) {
        m(new f(this, 1, c5157c));
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void g(ConcurrentHashMap concurrentHashMap) {
        m(new g(this, concurrentHashMap, 1));
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void h(String str) {
        m(new f(this, 3, str));
    }

    @Override // io.sentry.N0, io.sentry.P
    public final void k(W1 w1) {
        m(new f(this, 2, w1));
    }

    public final void m(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (Thread.currentThread().getName().contains("SentryExecutor")) {
            runnable.run();
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new f(this, 4, runnable));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(EnumC5148n1.ERROR, "Serialization task could not be scheduled", th);
        }
    }

    public final void n(Object obj, String str) {
        a.c(this.a, obj, ".scope-cache", str);
    }
}
