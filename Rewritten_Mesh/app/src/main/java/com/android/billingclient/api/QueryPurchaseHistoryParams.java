package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class QueryPurchaseHistoryParams {
    private final String zza;

    public static class Builder {
        private String zza;

        private Builder() {
        }

        public QueryPurchaseHistoryParams build() {
            if (this.zza != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzde zzdeVar) {
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzdf zzdfVar) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final String zza() {
        return this.zza;
    }
}
