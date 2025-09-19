package com.android.billingclient.api;

import java.util.List;
import p000.AbstractC10078kz1;
import p000.C10382nL1;
import p000.C9748iO1;
import p000.C9848jA1;
import p000.DL1;
import p000.EnumC10768qM1;

/* loaded from: classes.dex */
interface zzby {
    public static final AbstractC10078kz1 zza = C9848jA1.m21983a(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", EnumC10768qM1.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", EnumC10768qM1.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", EnumC10768qM1.ALTERNATIVE_BILLING_ACTION}, null);

    void zza(C10382nL1 c10382nL1);

    void zzb(DL1 dl1);

    void zzc(byte[] bArr);

    void zzd(C9748iO1 c9748iO1);

    void zze(int i, List list, boolean z, boolean z2);

    void zzf(int i, List list, List list2, BillingResult billingResult, boolean z, boolean z2);
}
