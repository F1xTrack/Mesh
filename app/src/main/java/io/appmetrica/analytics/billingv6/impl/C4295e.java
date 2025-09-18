package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC7167xu;

/* renamed from: io.appmetrica.analytics.billingv6.impl.e */
/* loaded from: classes2.dex */
public final class C4295e implements BillingInfoManager {

    /* renamed from: a */
    public final BillingInfoStorage f29578a;

    /* renamed from: b */
    public boolean f29579b;

    /* renamed from: c */
    public final LinkedHashMap f29580c;

    public C4295e(BillingInfoStorage billingInfoStorage) {
        this.f29578a = billingInfoStorage;
        this.f29579b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f29580c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f29580c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f29579b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f29579b) {
            return;
        }
        this.f29579b = true;
        this.f29578a.saveInfo(AbstractC7167xu.m25982b0(this.f29580c.values()), this.f29579b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f29580c.put(billingInfo.productId, billingInfo);
        }
        this.f29578a.saveInfo(AbstractC7167xu.m25982b0(this.f29580c.values()), this.f29579b);
    }
}
