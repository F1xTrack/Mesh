package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcs {
    private final String zza;
    private final String zzb;

    public zzcs(JSONObject jSONObject) throws JSONException {
        this.zza = jSONObject.getString("rentalPeriod");
        String strOptString = jSONObject.optString("rentalExpirationPeriod");
        this.zzb = true == strOptString.isEmpty() ? null : strOptString;
    }
}
