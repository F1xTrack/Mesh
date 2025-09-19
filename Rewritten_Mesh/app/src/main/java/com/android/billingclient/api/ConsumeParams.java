package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class ConsumeParams {
    private String zza;

    public static final class Builder {
        private String zza;

        private Builder() {
        }

        public ConsumeParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            consumeParams.zza = str;
            return consumeParams;
        }

        public Builder setPurchaseToken(String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(zzcb zzcbVar) {
        }
    }

    private ConsumeParams() {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getPurchaseToken() {
        return this.zza;
    }

    public /* synthetic */ ConsumeParams(zzcc zzccVar) {
    }
}
