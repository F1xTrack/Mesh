package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.n */
/* loaded from: classes2.dex */
public final class C4304n extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4306p f29604a;

    /* renamed from: b */
    public final /* synthetic */ C4301k f29605b;

    public C4304n(C4306p c4306p, C4301k c4301k) {
        this.f29604a = c4306p;
        this.f29605b = c4301k;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f29604a.f29613e.m19153a(this.f29605b);
    }
}
