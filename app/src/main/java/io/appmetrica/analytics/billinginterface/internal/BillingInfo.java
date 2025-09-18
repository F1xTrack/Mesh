package io.appmetrica.analytics.billinginterface.internal;

import p000.AbstractC0852NX;

/* loaded from: classes2.dex */
public class BillingInfo {
    public final String productId;
    public final long purchaseTime;
    public final String purchaseToken;
    public long sendTime;
    public final ProductType type;

    public BillingInfo(ProductType productType, String str, String str2, long j, long j2) {
        this.type = productType;
        this.productId = str;
        this.purchaseToken = str2;
        this.purchaseTime = j;
        this.sendTime = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillingInfo{type=");
        sb.append(this.type);
        sb.append("productId='");
        sb.append(this.productId);
        sb.append("'purchaseToken='");
        sb.append(this.purchaseToken);
        sb.append("'purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append("sendTime=");
        return AbstractC0852NX.m5760i(sb, this.sendTime, "}");
    }
}
