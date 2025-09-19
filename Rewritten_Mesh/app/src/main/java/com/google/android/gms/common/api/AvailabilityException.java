package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC7222ym;
import p000.C6867t8;
import p000.C7119x8;

/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final C7119x8 zaa;

    public AvailabilityException(C7119x8 c7119x8) {
        this.zaa = c7119x8;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        C7119x8 c7119x8 = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        Object orDefault = c7119x8.getOrDefault(apiKey, null);
        Preconditions.checkArgument(orDefault != null, AbstractC7222ym.m26234k("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C6867t8) this.zaa.keySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
            z &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        C7119x8 c7119x8 = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        Object orDefault = c7119x8.getOrDefault(apiKey, null);
        Preconditions.checkArgument(orDefault != null, AbstractC7222ym.m26234k("The given API (", apiKey.zaa(), ") was not part of the availability request."));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }
}
