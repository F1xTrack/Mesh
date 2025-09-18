package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC1374Vq;
import p000.F91;

@zzd
@Deprecated
/* loaded from: classes.dex */
public final class AlternativeChoiceDetails {
    private final String zza;
    private final JSONObject zzb;
    private final List zzc;

    @zzd
    public static class Product {
        private final String zza;
        private final String zzb;
        private final String zzc;

        public /* synthetic */ Product(JSONObject jSONObject, zzc zzcVar) {
            this.zza = jSONObject.optString("productId");
            this.zzb = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.zzc = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.zza.equals(product.getId()) && this.zzb.equals(product.getType()) && Objects.equals(this.zzc, product.getOfferToken());
        }

        @zzd
        public String getId() {
            return this.zza;
        }

        @zzd
        public String getOfferToken() {
            return this.zzc;
        }

        @zzd
        public String getType() {
            return this.zzb;
        }

        public int hashCode() {
            return Objects.hash(this.zza, this.zzb, this.zzc);
        }

        public String toString() {
            String str = this.zza;
            String str2 = this.zzb;
            return AbstractC1374Vq.m8593l(F91.m2541x("{id: ", str, ", type: ", str2, ", offer token: "), this.zzc, "}");
        }
    }

    public AlternativeChoiceDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject, null));
                }
            }
        }
        this.zzc = arrayList;
    }

    @zzd
    public String getExternalTransactionToken() {
        return this.zzb.optString("externalTransactionToken");
    }

    @zzd
    public String getOriginalExternalTransactionId() {
        String strOptString = this.zzb.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @zzd
    public List<Product> getProducts() {
        return this.zzc;
    }
}
