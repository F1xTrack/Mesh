package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.f */
/* loaded from: classes2.dex */
public final class C4296f extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4297g f29581a;

    public C4296f(C4297g c4297g) {
        this.f29581a = c4297g;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f29581a.f29582a.endConnection();
    }
}
