package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.rewarded.RewardedAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* loaded from: classes2.dex */
public final class h extends e {
    public h(b bVar, ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, RewardedAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        RewardedAd rewardedAd = (RewardedAd) objArr[1];
        this.a.getClass();
        a(b.a(adValue, ModuleAdType.REWARDED, rewardedAd.getResponseInfo(), rewardedAd.getAdUnitId()));
        return true;
    }
}
