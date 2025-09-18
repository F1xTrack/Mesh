package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import org.json.JSONException;
import p000.BA1;
import p000.QO1;

/* loaded from: classes.dex */
final class zzbg extends QO1 {
    final BillingConfigResponseListener zza;
    final zzby zzb;

    public zzbg(BillingConfigResponseListener billingConfigResponseListener, zzby zzbyVar, zzbf zzbfVar) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
        this.zza = billingConfigResponseListener;
        this.zzb = zzbyVar;
    }

    @Override // p000.InterfaceC10520oQ1
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzbyVar = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(63, 13, billingResult));
            this.zza.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iM534a = BA1.m534a(bundle, "BillingClient");
        String strM537d = BA1.m537d(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iM534a);
        builderNewBuilder.setDebugMessage(strM537d);
        if (iM534a != 0) {
            BillingResult billingResultBuild = builderNewBuilder.build();
            this.zzb.zza(zzbx.zzb(23, 13, billingResultBuild));
            this.zza.onBillingConfigResponse(billingResultBuild, null);
        } else {
            if (!bundle.containsKey("BILLING_CONFIG")) {
                builderNewBuilder.setResponseCode(6);
                BillingResult billingResultBuild2 = builderNewBuilder.build();
                this.zzb.zza(zzbx.zzb(64, 13, billingResultBuild2));
                this.zza.onBillingConfigResponse(billingResultBuild2, null);
                return;
            }
            try {
                this.zza.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
            } catch (JSONException unused) {
                int i = BA1.f614a;
                zzby zzbyVar2 = this.zzb;
                BillingResult billingResult2 = zzca.zzj;
                zzbyVar2.zza(zzbx.zzb(65, 13, billingResult2));
                this.zza.onBillingConfigResponse(billingResult2, null);
            }
        }
    }
}
