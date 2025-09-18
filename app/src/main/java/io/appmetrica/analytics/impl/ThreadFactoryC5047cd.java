package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.cd */
/* loaded from: classes2.dex */
public final class ThreadFactoryC5047cd implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f31411a = new AtomicInteger(0);

    /* renamed from: a */
    public static int m20234a() {
        return f31411a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, "null-" + f31411a.incrementAndGet());
    }
}
