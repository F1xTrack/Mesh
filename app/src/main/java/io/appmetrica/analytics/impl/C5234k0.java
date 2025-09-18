package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.k0 */
/* loaded from: classes2.dex */
public final class C5234k0 implements InterfaceC5594ya {

    /* renamed from: a */
    public final Handler f32023a;

    /* renamed from: b */
    public final IHandlerExecutor f32024b;

    /* renamed from: c */
    public final C5438s4 f32025c;

    public C5234k0() {
        IHandlerExecutor iHandlerExecutorM20407a = C5388q4.m20928h().m20935e().m20407a();
        this.f32024b = iHandlerExecutorM20407a;
        this.f32023a = iHandlerExecutorM20407a.getHandler();
        this.f32025c = new C5438s4();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: a */
    public final void mo20472a(AppMetricaConfig appMetricaConfig, InterfaceC4755Qa interfaceC4755Qa) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: b */
    public final Handler mo20473b() {
        return this.f32023a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: c */
    public final C4817T1 mo20474c() {
        return new C4817T1();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: d */
    public final C5120fb mo20475d() {
        return new C5120fb();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    public final ICommonExecutor getDefaultExecutor() {
        return this.f32024b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: a */
    public final C5438s4 mo20471a() {
        return this.f32025c;
    }
}
