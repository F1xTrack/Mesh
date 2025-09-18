package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.P0 */
/* loaded from: classes2.dex */
public final class RunnableC4721P0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeferredDeeplinkParametersListener f30591a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30592b;

    public RunnableC4721P0(C5185i1 c5185i1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f30592b = c5185i1;
        this.f30591a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30592b.f31880a.getClass();
        C5309n0 c5309n0 = C5309n0.f32234e;
        c5309n0.m20789k().mo20992a(this.f30591a);
    }
}
