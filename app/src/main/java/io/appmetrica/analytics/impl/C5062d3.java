package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.d3 */
/* loaded from: classes2.dex */
public final class C5062d3 implements BillingInfoSender {

    /* renamed from: a */
    public final InterfaceC4659Ma f31461a;

    /* renamed from: b */
    public final ICommonExecutor f31462b;

    public C5062d3(InterfaceC4659Ma interfaceC4659Ma) {
        this(interfaceC4659Ma, C5244ka.m20614h().m20636u().m21142e());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(List<ProductInfo> list) {
        Iterator<ProductInfo> it = list.iterator();
        while (it.hasNext()) {
            this.f31462b.execute(new C5037c3(this, it.next()));
        }
    }

    public C5062d3(InterfaceC4659Ma interfaceC4659Ma, ICommonExecutor iCommonExecutor) {
        this.f31461a = interfaceC4659Ma;
        this.f31462b = iCommonExecutor;
    }
}
