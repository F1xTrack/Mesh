package io.appmetrica.analytics.billinginterface.internal;

import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    public final Period introductoryPricePeriod;
    public final String priceCurrency;
    public final long priceMicros;
    public final String purchaseOriginalJson;
    public final long purchaseTime;
    public final String purchaseToken;
    public final int quantity;
    public final String signature;
    public final String sku;
    public final Period subscriptionPeriod;
    public final ProductType type;

    public ProductInfo(ProductType productType, String str, int i, long j, String str2, long j2, Period period, int i2, Period period2, String str3, String str4, long j3, boolean z, String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i;
        this.priceMicros = j;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j2;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i2;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j3;
        this.autoRenewing = z;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (this.signature.equals(productInfo.signature) && this.purchaseToken.equals(productInfo.purchaseToken)) {
            return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int iM8586e = (AbstractC1374Vq.m8586e(this.type.hashCode() * 31, 31, this.sku) + this.quantity) * 31;
        long j = this.priceMicros;
        int iM8586e2 = AbstractC1374Vq.m8586e((iM8586e + ((int) (j ^ (j >>> 32)))) * 31, 31, this.priceCurrency);
        long j2 = this.introductoryPriceMicros;
        int i = (iM8586e2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Period period = this.introductoryPricePeriod;
        int iHashCode = (((i + (period != null ? period.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31;
        Period period2 = this.subscriptionPeriod;
        int iM8586e3 = AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e((iHashCode + (period2 != null ? period2.hashCode() : 0)) * 31, 31, this.signature), 31, this.purchaseToken);
        long j3 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((iM8586e3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductInfo{type=");
        sb.append(this.type);
        sb.append(", sku='");
        sb.append(this.sku);
        sb.append("', quantity=");
        sb.append(this.quantity);
        sb.append(", priceMicros=");
        sb.append(this.priceMicros);
        sb.append(", priceCurrency='");
        sb.append(this.priceCurrency);
        sb.append("', introductoryPriceMicros=");
        sb.append(this.introductoryPriceMicros);
        sb.append(", introductoryPricePeriod=");
        sb.append(this.introductoryPricePeriod);
        sb.append(", introductoryPriceCycles=");
        sb.append(this.introductoryPriceCycles);
        sb.append(", subscriptionPeriod=");
        sb.append(this.subscriptionPeriod);
        sb.append(", signature='");
        sb.append(this.signature);
        sb.append("', purchaseToken='");
        sb.append(this.purchaseToken);
        sb.append("', purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append(", autoRenewing=");
        sb.append(this.autoRenewing);
        sb.append(", purchaseOriginalJson='");
        return AbstractC1374Vq.m8593l(sb, this.purchaseOriginalJson, "'}");
    }
}
