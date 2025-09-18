package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4467c3 extends SafeRunnable {
    public final /* synthetic */ ProductInfo a;
    public final /* synthetic */ C4492d3 b;

    public C4467c3(C4492d3 c4492d3, ProductInfo productInfo) {
        this.b = c4492d3;
        this.a = productInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ((C4567g5) this.b.a).a(T5.a(new Ve(this.a)));
    }
}
