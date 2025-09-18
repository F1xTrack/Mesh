package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.i */
/* loaded from: classes2.dex */
public final class C4299i extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4301k f29588a;

    /* renamed from: b */
    public final /* synthetic */ C4308r f29589b;

    public C4299i(C4301k c4301k, C4308r c4308r) {
        this.f29588a = c4301k;
        this.f29589b = c4308r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f29588a.f29597f.m19153a(this.f29589b);
    }
}
