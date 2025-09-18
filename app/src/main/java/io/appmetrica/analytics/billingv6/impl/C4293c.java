package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.c */
/* loaded from: classes2.dex */
public final class C4293c extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4294d f29571a;

    /* renamed from: b */
    public final /* synthetic */ String f29572b;

    /* renamed from: c */
    public final /* synthetic */ C4306p f29573c;

    public C4293c(C4294d c4294d, String str, C4306p c4306p) {
        this.f29571a = c4294d;
        this.f29572b = str;
        this.f29573c = c4306p;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (this.f29571a.f29575b.isReady()) {
            this.f29571a.f29575b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(this.f29572b).build(), this.f29573c);
        } else {
            this.f29571a.f29576c.getWorkerExecutor().execute(new C4292b(this.f29571a, this.f29573c));
        }
    }
}
