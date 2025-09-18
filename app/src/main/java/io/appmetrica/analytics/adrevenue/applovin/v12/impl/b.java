package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.yandex.varioqub.config.model.ConfigValue;
import defpackage.AbstractC2350bZ1;
import defpackage.AbstractC7096sn0;
import defpackage.J8;
import defpackage.O90;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class b implements ModuleAdRevenueProcessor {
    public final a a;
    public final ClientContext b;

    public b(a aVar, ClientContext clientContext) {
        this.a = aVar;
        this.b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object objR = J8.r(0, objArr);
        if (objR == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) objR;
        Object objR2 = J8.r(1, objArr);
        if (objR2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) objR2;
        this.a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : O90.a(format, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : O90.a(format, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : O90.a(format, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : O90.a(format, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : O90.a(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        LinkedHashMap linkedHashMapI = AbstractC7096sn0.i(AbstractC2350bZ1.b("countryCode", appLovinSdk.getConfiguration().getCountryCode()));
        if (moduleAdType == ModuleAdType.OTHER) {
            linkedHashMapI.put("adType", maxAd.getFormat().getLabel());
        }
        this.b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), ConfigValue.DOUBLE_DEFAULT_VALUE)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), linkedHashMapI, false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
