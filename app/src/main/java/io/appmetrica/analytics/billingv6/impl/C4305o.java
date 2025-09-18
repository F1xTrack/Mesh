package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC7293zu;

/* renamed from: io.appmetrica.analytics.billingv6.impl.o */
/* loaded from: classes2.dex */
public final class C4305o extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4306p f29606a;

    /* renamed from: b */
    public final /* synthetic */ List f29607b;

    /* renamed from: c */
    public final /* synthetic */ C4301k f29608c;

    public C4305o(C4306p c4306p, List list, C4301k c4301k) {
        this.f29606a = c4306p;
        this.f29607b = list;
        this.f29608c = c4301k;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (!this.f29606a.f29610b.isReady()) {
            this.f29606a.f29611c.getWorkerExecutor().execute(new C4304n(this.f29606a, this.f29608c));
            return;
        }
        BillingClient billingClient = this.f29606a.f29610b;
        QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
        List list = this.f29607b;
        C4306p c4306p = this.f29606a;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(c4306p.f29612d).build());
        }
        billingClient.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), this.f29608c);
    }
}
