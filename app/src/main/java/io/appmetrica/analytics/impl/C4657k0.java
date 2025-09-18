package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4657k0 implements InterfaceC5002ya {
    public final Handler a;
    public final IHandlerExecutor b;
    public final C4852s4 c;

    public C4657k0() {
        IHandlerExecutor iHandlerExecutorA = C4805q4.h().e().a();
        this.b = iHandlerExecutorA;
        this.a = iHandlerExecutorA.getHandler();
        this.c = new C4852s4();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final void a(AppMetricaConfig appMetricaConfig, Qa qa) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final Handler b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final T1 c() {
        return new T1();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final C4549fb d() {
        return new C4549fb();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final C4852s4 a() {
        return this.c;
    }
}
