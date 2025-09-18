package io.appmetrica.analytics.adrevenue.fyber.p023v3.impl;

import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.impl.c */
/* loaded from: classes2.dex */
public final class C4284c implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final C4283b f29554a;

    /* renamed from: b */
    public final ClientContext f29555b;

    public C4284c(C4283b c4283b, ClientContext clientContext) {
        this.f29554a = c4283b;
        this.f29555b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "Fyber";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ModuleAdType moduleAdType;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, ImpressionData.class)) {
            return false;
        }
        ImpressionData impressionData = (ImpressionData) objArr[0];
        ModuleAdRevenueReporter adRevenueReporter = this.f29555b.getModuleAdRevenueContext().getAdRevenueReporter();
        this.f29554a.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getNetPayout(), ConfigValue.DOUBLE_DEFAULT_VALUE));
        Currency currency = Currency.getInstance(impressionData.getCurrency());
        PlacementType placementType = impressionData.getPlacementType();
        if (placementType == null) {
            moduleAdType = null;
        } else {
            int i = AbstractC4282a.f29553a[placementType.ordinal()];
            moduleAdType = i != 1 ? i != 2 ? i != 3 ? ModuleAdType.OTHER : ModuleAdType.INTERSTITIAL : ModuleAdType.REWARDED : ModuleAdType.BANNER;
        }
        adRevenueReporter.reportAutoAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, impressionData.getDemandSource(), impressionData.getCreativeId(), null, null, null, impressionData.getPriceAccuracy().toString(), null, true));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new Object[0]);
        return true;
    }
}
