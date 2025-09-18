package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes2.dex */
public final class P0 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkParametersListener a;
    public final /* synthetic */ C4611i1 b;

    public P0(C4611i1 c4611i1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.b = c4611i1;
        this.a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        C4729n0 c4729n0 = C4729n0.e;
        c4729n0.k().a(this.a);
    }
}
