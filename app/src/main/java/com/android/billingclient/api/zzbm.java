package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import p000.AbstractBinderC9638hX1;
import p000.BA1;

/* loaded from: classes.dex */
final class zzbm extends AbstractBinderC9638hX1 {
    final ExternalOfferAvailabilityListener zza;
    final zzby zzb;

    public zzbm(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzby zzbyVar, zzbl zzblVar) {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzbyVar;
    }

    @Override // p000.DY1
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzbyVar = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(92, 23, billingResult));
            this.zza.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iM534a = BA1.m534a(bundle, "BillingClient");
        BillingResult billingResultZza = zzca.zza(iM534a, BA1.m537d(bundle, "BillingClient"));
        if (iM534a != 0) {
            this.zzb.zza(zzbx.zzb(23, 23, billingResultZza));
        }
        this.zza.onExternalOfferAvailabilityResponse(billingResultZza);
    }
}
