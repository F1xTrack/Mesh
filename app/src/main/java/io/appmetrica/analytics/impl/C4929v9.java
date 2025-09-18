package io.appmetrica.analytics.impl;

import android.os.Handler;
import defpackage.NX;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4929v9 implements ExecutorProvider {
    public final C4915uj a;
    public final IHandlerExecutor b;

    public C4929v9() {
        C4915uj c4915ujU = C4667ka.h().u();
        this.a = c4915ujU;
        this.b = c4915ujU.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        StringBuilder sbK = NX.k(str + '-' + str2, "-");
        sbK.append(ThreadFactoryC4477cd.a.incrementAndGet());
        return new InterruptionSafeThread(runnable, sbK.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C4915uj c4915uj = this.a;
        if (c4915uj.f == null) {
            synchronized (c4915uj) {
                try {
                    if (c4915uj.f == null) {
                        c4915uj.a.getClass();
                        Xa xaA = C4953w9.a("IAA-SIO");
                        c4915uj.f = new C4953w9(xaA, xaA.getLooper(), new Handler(xaA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c4915uj.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        return this.a.f();
    }
}
