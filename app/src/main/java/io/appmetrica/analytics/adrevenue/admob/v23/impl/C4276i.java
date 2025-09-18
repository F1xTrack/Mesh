package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.i */
/* loaded from: classes2.dex */
public final class C4276i extends AbstractC4272e {
    public C4276i(C4269b c4269b, ClientContext clientContext) {
        super(c4269b, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, RewardedInterstitialAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue) objArr[0];
        RewardedInterstitialAd rewardedInterstitialAd = (RewardedInterstitialAd) objArr[1];
        this.f29548a.getClass();
        m19152a(C4269b.m19151a(adValue, ModuleAdType.OTHER, rewardedInterstitialAd.getResponseInfo(), rewardedInterstitialAd.getAdUnitId()));
        return true;
    }
}
