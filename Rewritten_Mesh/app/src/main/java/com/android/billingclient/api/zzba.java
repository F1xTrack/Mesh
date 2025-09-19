package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;
import p000.AC1;
import p000.BA1;

/* loaded from: classes.dex */
final class zzba extends AC1 {
    final AlternativeBillingOnlyReportingDetailsListener zza;
    final zzby zzb;

    public zzba(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, zzby zzbyVar, zzaz zzazVar) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback");
        this.zza = alternativeBillingOnlyReportingDetailsListener;
        this.zzb = zzbyVar;
    }

    @Override // p000.InterfaceC11392vE1
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzbyVar = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(71, 15, billingResult));
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int iM534a = BA1.m534a(bundle, "BillingClient");
        BillingResult billingResultZza = zzca.zza(iM534a, BA1.m537d(bundle, "BillingClient"));
        if (iM534a != 0) {
            this.zzb.zza(zzbx.zzb(23, 15, billingResultZza));
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResultZza, null);
            return;
        }
        try {
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResultZza, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException unused) {
            int i = BA1.f614a;
            zzby zzbyVar2 = this.zzb;
            BillingResult billingResult2 = zzca.zzj;
            zzbyVar2.zza(zzbx.zzb(72, 15, billingResult2));
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
