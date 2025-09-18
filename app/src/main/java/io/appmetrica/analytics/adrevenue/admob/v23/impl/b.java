package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.ResponseInfo;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;

/* loaded from: classes2.dex */
public final class b {
    public static ModuleAdRevenue a(AdValue adValue, ModuleAdType moduleAdType, ResponseInfo responseInfo, String str) {
        AdapterResponseInfo loadedAdapterResponseInfo;
        double finiteDoubleOrDefault = WrapUtils.getFiniteDoubleOrDefault(adValue.getValueMicros() / 1000000.0d, ConfigValue.DOUBLE_DEFAULT_VALUE);
        String str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        if (responseInfo == null || (loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo()) == null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(finiteDoubleOrDefault);
            Currency currency = Currency.getInstance(adValue.getCurrencyCode());
            int precisionType = adValue.getPrecisionType();
            if (precisionType != 0) {
                str2 = precisionType == 1 ? "ESTIMATED" : precisionType == 2 ? "PUBLISHER_PROVIDED" : precisionType == 3 ? "PRECISE" : "";
            }
            return new ModuleAdRevenue(bigDecimalValueOf, currency, moduleAdType, null, str, null, null, null, str2, null, false);
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(finiteDoubleOrDefault);
        Currency currency2 = Currency.getInstance(adValue.getCurrencyCode());
        String adapterClassName = loadedAdapterResponseInfo.getAdapterClassName();
        String adSourceInstanceId = loadedAdapterResponseInfo.getAdSourceInstanceId();
        String adSourceInstanceName = loadedAdapterResponseInfo.getAdSourceInstanceName();
        int precisionType2 = adValue.getPrecisionType();
        return new ModuleAdRevenue(bigDecimalValueOf2, currency2, moduleAdType, adapterClassName, str, null, adSourceInstanceId, adSourceInstanceName, precisionType2 == 0 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : precisionType2 == 1 ? "ESTIMATED" : precisionType2 == 2 ? "PUBLISHER_PROVIDED" : precisionType2 == 3 ? "PRECISE" : "", null, false);
    }
}
