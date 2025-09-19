package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import p000.BA1;
import p000.PU1;

/* loaded from: classes.dex */
final class zzbk extends PU1 {
    final AlternativeBillingOnlyAvailabilityListener zza;
    final zzby zzb;

    public zzbk(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, zzby zzbyVar, zzbj zzbjVar) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback");
        this.zza = alternativeBillingOnlyAvailabilityListener;
        this.zzb = zzbyVar;
    }

    @Override // p000.InterfaceC9380fW1
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzby zzbyVar = this.zzb;
            BillingResult billingResult = zzca.zzj;
            zzbyVar.zza(zzbx.zzb(67, 14, billingResult));
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iM534a = BA1.m534a(bundle, "BillingClient");
        BillingResult billingResultZza = zzca.zza(iM534a, BA1.m537d(bundle, "BillingClient"));
        if (iM534a != 0) {
            this.zzb.zza(zzbx.zzb(23, 14, billingResultZza));
        }
        this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResultZza);
    }
}
