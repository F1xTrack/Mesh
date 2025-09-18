package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.b */
/* loaded from: classes2.dex */
public final class C4292b extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4294d f29569a;

    /* renamed from: b */
    public final /* synthetic */ C4306p f29570b;

    public C4292b(C4294d c4294d, C4306p c4306p) {
        this.f29569a = c4294d;
        this.f29570b = c4306p;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f29569a.f29577d.m19153a(this.f29570b);
    }
}
