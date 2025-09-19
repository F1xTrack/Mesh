package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;
import p000.AbstractC8091Oy1;

/* loaded from: classes.dex */
public final class QueryProductDetailsParams {
    private final AbstractC8091Oy1 zza;

    public static class Builder {
        private AbstractC8091Oy1 zza;

        private Builder() {
        }

        public QueryProductDetailsParams build() {
            return new QueryProductDetailsParams(this, null);
        }

        public Builder setProductList(List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.zza = AbstractC8091Oy1.m6190s(list);
            return this;
        }

        public /* synthetic */ Builder(zzda zzdaVar) {
        }
    }

    public static class Product {
        private final String zza;
        private final String zzb;

        public static class Builder {
            private String zza;
            private String zzb;

            private Builder() {
            }

            public Product build() {
                if ("first_party".equals(this.zzb)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.zza == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.zzb != null) {
                    return new Product(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public Builder setProductId(String str) {
                this.zza = str;
                return this;
            }

            public Builder setProductType(String str) {
                this.zzb = str;
                return this;
            }

            public /* synthetic */ Builder(zzdb zzdbVar) {
            }
        }

        public /* synthetic */ Product(Builder builder, zzdc zzdcVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public final String zza() {
            return this.zza;
        }

        public final String zzb() {
            return this.zzb;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, zzdd zzddVar) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final AbstractC8091Oy1 zza() {
        return this.zza;
    }

    public final String zzb() {
        return ((Product) this.zza.get(0)).zzb();
    }
}
