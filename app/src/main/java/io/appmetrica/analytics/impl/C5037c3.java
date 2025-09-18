package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.c3 */
/* loaded from: classes2.dex */
public final class C5037c3 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ ProductInfo f31349a;

    /* renamed from: b */
    public final /* synthetic */ C5062d3 f31350b;

    public C5037c3(C5062d3 c5062d3, ProductInfo productInfo) {
        this.f31350b = c5062d3;
        this.f31349a = productInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ((C5139g5) this.f31350b.f31461a).mo19635a(C4821T5.m19839a(new C4878Ve(this.f31349a)));
    }
}
