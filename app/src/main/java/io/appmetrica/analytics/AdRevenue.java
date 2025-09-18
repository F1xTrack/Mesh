package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC5182hn;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a */
        private final BigDecimal f29454a;

        /* renamed from: b */
        private final Currency f29455b;

        /* renamed from: c */
        private AdType f29456c;

        /* renamed from: d */
        private String f29457d;

        /* renamed from: e */
        private String f29458e;

        /* renamed from: f */
        private String f29459f;

        /* renamed from: g */
        private String f29460g;

        /* renamed from: h */
        private String f29461h;

        /* renamed from: i */
        private String f29462i;

        /* renamed from: j */
        private Map f29463j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f29454a, this.f29455b, this.f29456c, this.f29457d, this.f29458e, this.f29459f, this.f29460g, this.f29461h, this.f29462i, this.f29463j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f29457d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f29460g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f29461h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f29456c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f29458e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f29459f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f29463j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f29462i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f29454a = bigDecimal;
            this.f29455b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j, Currency currency) {
        return new Builder(AbstractC5182hn.m20508a(j), currency, 0);
    }

    public static Builder newBuilder(double d, Currency currency) {
        return new Builder(new BigDecimal(AbstractC5182hn.m20507a(d)), currency, 0);
    }
}
