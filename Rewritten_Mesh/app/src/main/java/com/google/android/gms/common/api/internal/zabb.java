package com.google.android.gms.common.api.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import p000.Y41;

/* loaded from: classes.dex */
final class zabb implements ResultCallback {
    final /* synthetic */ StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ GoogleApiClient zac;
    final /* synthetic */ zabe zad;

    public zabb(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.zad = zabeVar;
        this.zaa = statusPendingResult;
        this.zab = z;
        this.zac = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(Result result) {
        Status status = (Status) result;
        Y41 y41M9209a = Y41.m9209a(this.zad.zan);
        String strM9214e = y41M9209a.m9214e("defaultGoogleSignInAccount");
        y41M9209a.m9215f("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM9214e)) {
            y41M9209a.m9215f(Y41.m9210h("googleSignInAccount", strM9214e));
            y41M9209a.m9215f(Y41.m9210h("googleSignInOptions", strM9214e));
        }
        if (status.isSuccess() && this.zad.isConnected()) {
            zabe zabeVar = this.zad;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.zaa.setResult(status);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}
