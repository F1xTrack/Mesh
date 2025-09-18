package io.appmetrica.analytics.billingv6.impl;

import defpackage.O90;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class u implements UpdatePolicy {
    public final SystemTimeProvider a;

    public u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy
    public final Map<String, BillingInfo> getBillingInfoToUpdate(BillingConfig billingConfig, Map<String, ? extends BillingInfo> map, BillingInfoManager billingInfoManager) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends BillingInfo> entry : map.entrySet()) {
            BillingInfo value = entry.getValue();
            long jCurrentTimeMillis = this.a.currentTimeMillis();
            if (value.type != ProductType.INAPP || billingInfoManager.isFirstInappCheckOccurred()) {
                BillingInfo billingInfo = billingInfoManager.get(value.productId);
                if (billingInfo == null || !O90.a(billingInfo.purchaseToken, value.purchaseToken) || (value.type == ProductType.SUBS && jCurrentTimeMillis - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (jCurrentTimeMillis - value.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public u(SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }

    public /* synthetic */ u(SystemTimeProvider systemTimeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SystemTimeProvider() : systemTimeProvider);
    }
}
