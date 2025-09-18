package com.android.billingclient.api;

import p000.AbstractC1374Vq;
import p000.BA1;
import p000.C9848jA1;
import p000.EnumC7829Jx1;

/* loaded from: classes.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }

        public /* synthetic */ Builder(zzbz zzbzVar) {
        }
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public String toString() {
        int i = this.zza;
        int i2 = BA1.f614a;
        C9848jA1 c9848jA1 = EnumC7829Jx1.f5816c;
        Integer numValueOf = Integer.valueOf(i);
        return AbstractC1374Vq.m8590i("Response Code: ", (!c9848jA1.containsKey(numValueOf) ? EnumC7829Jx1.RESPONSE_CODE_UNSPECIFIED : (EnumC7829Jx1) c9848jA1.get(numValueOf)).toString(), ", Debug Message: ", this.zzb);
    }
}
