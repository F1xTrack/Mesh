package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.j */
/* loaded from: classes2.dex */
public final class C4300j extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4301k f29590a;

    /* renamed from: b */
    public final /* synthetic */ C4308r f29591b;

    public C4300j(C4301k c4301k, C4308r c4308r) {
        this.f29590a = c4301k;
        this.f29591b = c4308r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f29590a.f29593b.isReady()) {
            this.f29590a.f29593b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(this.f29590a.f29592a).build(), this.f29591b);
        } else {
            this.f29590a.f29594c.getWorkerExecutor().execute(new C4299i(this.f29590a, this.f29591b));
        }
    }
}
