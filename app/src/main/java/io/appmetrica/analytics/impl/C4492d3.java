package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.d3 */
/* loaded from: classes2.dex */
public final class C4492d3 implements BillingInfoSender {
    public final Ma a;
    public final ICommonExecutor b;

    public C4492d3(Ma ma) {
        this(ma, C4667ka.h().u().e());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<ProductInfo> list) {
        Iterator<ProductInfo> it = list.iterator();
        while (it.hasNext()) {
            this.b.execute(new C4467c3(this, it.next()));
        }
    }

    public C4492d3(Ma ma, ICommonExecutor iCommonExecutor) {
        this.a = ma;
        this.b = iCommonExecutor;
    }
}
