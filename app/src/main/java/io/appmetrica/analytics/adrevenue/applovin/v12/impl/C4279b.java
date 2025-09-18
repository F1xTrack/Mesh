package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.yandex.varioqub.config.model.ConfigValue;
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
import p000.AbstractC0576J8;
import p000.AbstractC11077sn0;
import p000.AbstractC8869bZ1;
import p000.O90;

/* renamed from: io.appmetrica.analytics.adrevenue.applovin.v12.impl.b */
/* loaded from: classes2.dex */
public final class C4279b implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final C4278a f29550a;

    /* renamed from: b */
    public final ClientContext f29551b;

    public C4279b(C4278a c4278a, ClientContext clientContext) {
        this.f29550a = c4278a;
        this.f29551b = clientContext;
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
        Object objM4191r = AbstractC0576J8.m4191r(0, objArr);
        if (objM4191r == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) objM4191r;
        Object objM4191r2 = AbstractC0576J8.m4191r(1, objArr);
        if (objM4191r2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) objM4191r2;
        this.f29550a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : O90.m5963a(format, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : O90.m5963a(format, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : O90.m5963a(format, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : O90.m5963a(format, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : O90.m5963a(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        LinkedHashMap linkedHashMapM24781i = AbstractC11077sn0.m24781i(AbstractC8869bZ1.m10460b("countryCode", appLovinSdk.getConfiguration().getCountryCode()));
        if (moduleAdType == ModuleAdType.OTHER) {
            linkedHashMapM24781i.put("adType", maxAd.getFormat().getLabel());
        }
        this.f29551b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), ConfigValue.DOUBLE_DEFAULT_VALUE)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), linkedHashMapM24781i, false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
