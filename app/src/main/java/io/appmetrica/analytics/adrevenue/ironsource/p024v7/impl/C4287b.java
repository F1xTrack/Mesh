package io.appmetrica.analytics.adrevenue.ironsource.p024v7.impl;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* renamed from: io.appmetrica.analytics.adrevenue.ironsource.v7.impl.b */
/* loaded from: classes2.dex */
public final class C4287b implements ImpressionDataListener {

    /* renamed from: a */
    public final ClientContext f29556a;

    /* renamed from: b */
    public final C4286a f29557b = new C4286a();

    public C4287b(ClientContext clientContext) {
        this.f29556a = clientContext;
    }

    public final void onImpressionSuccess(ImpressionData impressionData) {
        ModuleAdType moduleAdType;
        if (impressionData != null) {
            ModuleAdRevenueReporter adRevenueReporter = this.f29556a.getModuleAdRevenueContext().getAdRevenueReporter();
            this.f29557b.getClass();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getRevenue().doubleValue(), ConfigValue.DOUBLE_DEFAULT_VALUE));
            Currency currency = Currency.getInstance("USD");
            String adUnit = impressionData.getAdUnit();
            if (adUnit != null) {
                switch (adUnit) {
                    case "Rewarded Video":
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    case "Interstitial":
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    case "Banner":
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    default:
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            adRevenueReporter.reportAutoAdRevenue(new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), null, true));
        }
    }
}
