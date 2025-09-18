package com.android.billingclient.api;

import java.util.concurrent.Callable;
import p000.AbstractC8091Oy1;
import p000.C7519Dy1;
import p000.C7729Hz1;

/* loaded from: classes.dex */
final class zzaq implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    public zzaq(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zza = str;
        this.zzb = purchasesResponseListener;
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        zzcx zzcxVarZzaf = BillingClientImpl.zzaf(this.zzc, this.zza, 9);
        if (zzcxVarZzaf.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzcxVarZzaf.zza(), zzcxVarZzaf.zzb());
            return null;
        }
        PurchasesResponseListener purchasesResponseListener = this.zzb;
        BillingResult billingResultZza = zzcxVarZzaf.zza();
        C7519Dy1 c7519Dy1 = AbstractC8091Oy1.f8764b;
        purchasesResponseListener.onQueryPurchasesResponse(billingResultZza, C7729Hz1.f4623e);
        return null;
    }
}
