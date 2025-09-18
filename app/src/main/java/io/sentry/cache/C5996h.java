package io.sentry.cache;

import io.sentry.AbstractC5788N0;
import io.sentry.C5759D1;
import io.sentry.C5782L0;
import io.sentry.C5798Q1;
import io.sentry.C5815W1;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.RunnableC5958r;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6104t;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.cache.h */
/* loaded from: classes2.dex */
public final class C5996h extends AbstractC5788N0 {

    /* renamed from: a */
    public final SentryAndroidOptions f34111a;

    public C5996h(SentryAndroidOptions sentryAndroidOptions) {
        this.f34111a = sentryAndroidOptions;
    }

    /* renamed from: l */
    public static Object m21716l(C5759D1 c5759d1, String str, Class cls) {
        return AbstractC5989a.m21705b(c5759d1, ".scope-cache", str, cls, null);
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: b */
    public final void mo21441b(C6104t c6104t) {
        m21717m(new RunnableC5994f(this, 5, c6104t));
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: c */
    public final void mo21442c(ConcurrentHashMap concurrentHashMap) {
        m21717m(new RunnableC5995g(this, concurrentHashMap, 0));
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: d */
    public final void mo21443d(C5798Q1 c5798q1, C5782L0 c5782l0) {
        m21717m(new RunnableC5958r(this, c5798q1, c5782l0, 2));
    }

    @Override // io.sentry.InterfaceC5793P
    /* renamed from: e */
    public final void mo21456e(C6082E c6082e) {
        m21717m(new RunnableC5994f(this, 0, c6082e));
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: f */
    public final void mo21444f(C6087c c6087c) {
        m21717m(new RunnableC5994f(this, 1, c6087c));
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: g */
    public final void mo21445g(ConcurrentHashMap concurrentHashMap) {
        m21717m(new RunnableC5995g(this, concurrentHashMap, 1));
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: h */
    public final void mo21446h(String str) {
        m21717m(new RunnableC5994f(this, 3, str));
    }

    @Override // io.sentry.AbstractC5788N0, io.sentry.InterfaceC5793P
    /* renamed from: k */
    public final void mo21449k(C5815W1 c5815w1) {
        m21717m(new RunnableC5994f(this, 2, c5815w1));
    }

    /* renamed from: m */
    public final void m21717m(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f34111a;
        if (Thread.currentThread().getName().contains("SentryExecutor")) {
            runnable.run();
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC5994f(this, 4, runnable));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Serialization task could not be scheduled", th);
        }
    }

    /* renamed from: n */
    public final void m21718n(Object obj, String str) {
        AbstractC5989a.m21706c(this.f34111a, obj, ".scope-cache", str);
    }
}
