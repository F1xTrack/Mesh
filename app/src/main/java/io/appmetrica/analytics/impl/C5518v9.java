package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import p000.AbstractC0852NX;

/* renamed from: io.appmetrica.analytics.impl.v9 */
/* loaded from: classes2.dex */
public final class C5518v9 implements ExecutorProvider {

    /* renamed from: a */
    public final C5503uj f32723a;

    /* renamed from: b */
    public final IHandlerExecutor f32724b;

    public C5518v9() {
        C5503uj c5503ujM20636u = C5244ka.m20614h().m20636u();
        this.f32723a = c5503ujM20636u;
        this.f32724b = c5503ujM20636u.m21140c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f32723a.m21138a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str + '-' + str2, "-");
        sbM5762k.append(ThreadFactoryC5047cd.f31411a.incrementAndGet());
        return new InterruptionSafeThread(runnable, sbM5762k.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f32724b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C5503uj c5503uj = this.f32723a;
        if (c5503uj.f32702f == null) {
            synchronized (c5503uj) {
                try {
                    if (c5503uj.f32702f == null) {
                        c5503uj.f32697a.getClass();
                        HandlerThreadC4922Xa handlerThreadC4922XaM21177a = C5543w9.m21177a("IAA-SIO");
                        c5503uj.f32702f = new C5543w9(handlerThreadC4922XaM21177a, handlerThreadC4922XaM21177a.getLooper(), new Handler(handlerThreadC4922XaM21177a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c5503uj.f32702f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        return this.f32723a.m21143f();
    }
}
