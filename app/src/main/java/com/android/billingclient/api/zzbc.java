package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;
import p000.AbstractBinderC9988kG1;
import p000.BA1;

/* loaded from: classes.dex */
final class zzbc extends AbstractBinderC9988kG1 {
    final ExternalOfferReportingDetailsListener zza;
    final zzby zzb;

    public zzbc(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, zzby zzbyVar, zzbb zzbbVar) {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");
        this.zza = externalOfferReportingDetailsListener;
        this.zzb = zzbyVar;
    }

    @Override // p000.InterfaceC9480gI1
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzbyVar = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(95, 24, billingResult));
            this.zza.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iM534a = BA1.m534a(bundle, "BillingClient");
        BillingResult billingResultZza = zzca.zza(iM534a, BA1.m537d(bundle, "BillingClient"));
        if (iM534a != 0) {
            this.zzb.zza(zzbx.zzb(23, 24, billingResultZza));
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, null);
            return;
        }
        try {
            this.zza.onExternalOfferReportingDetailsResponse(billingResultZza, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException unused) {
            int i = BA1.f614a;
            zzby zzbyVar2 = this.zzb;
            BillingResult billingResult2 = zzca.zzj;
            zzbyVar2.zza(zzbx.zzb(104, 24, billingResult2));
            this.zza.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
