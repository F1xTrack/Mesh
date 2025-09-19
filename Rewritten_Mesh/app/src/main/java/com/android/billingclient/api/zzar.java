package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzar implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchaseHistoryResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    public zzar(BillingClientImpl billingClientImpl, String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = str;
        this.zzb = purchaseHistoryResponseListener;
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbp zzbpVarZzg = BillingClientImpl.zzg(this.zzc, this.zza);
        this.zzb.onPurchaseHistoryResponse(zzbpVarZzg.zza(), zzbpVarZzg.zzb());
        return null;
    }
}
