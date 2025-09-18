package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes2.dex */
public final class Q0 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkListener a;
    public final /* synthetic */ C4611i1 b;

    public Q0(C4611i1 c4611i1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.b = c4611i1;
        this.a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        C4729n0 c4729n0 = C4729n0.e;
        c4729n0.k().a(this.a);
    }
}
