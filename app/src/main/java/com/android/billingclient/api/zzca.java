package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;
import p000.F91;

/* loaded from: classes.dex */
final class zzca {
    static final BillingResult zzA;
    static final BillingResult zzB;
    static final BillingResult zzC;
    static final BillingResult zzD;
    static final BillingResult zzE;
    static final BillingResult zzF;
    public static final /* synthetic */ int zzG = 0;
    static final BillingResult zza = F91.m2537t(3, "Google Play In-app Billing API version is less than 3");
    static final BillingResult zzb = F91.m2537t(3, "Google Play In-app Billing API version is less than 9");
    static final BillingResult zzc = F91.m2537t(3, "Billing service unavailable on device.");
    static final BillingResult zzd = F91.m2537t(5, "Client is already in the process of connecting to billing service.");
    static final BillingResult zze = F91.m2537t(5, "The list of SKUs can't be empty.");
    static final BillingResult zzf = F91.m2537t(5, "SKU type can't be empty.");
    static final BillingResult zzg = F91.m2537t(5, "Product type can't be empty.");
    static final BillingResult zzh = F91.m2537t(-2, "Client does not support extra params.");
    static final BillingResult zzi = F91.m2537t(5, "Invalid purchase token.");
    static final BillingResult zzj = F91.m2537t(6, "An internal error occurred.");
    static final BillingResult zzk = F91.m2537t(5, "SKU can't be null.");
    static final BillingResult zzl;
    static final BillingResult zzm;
    static final BillingResult zzn;
    static final BillingResult zzo;
    static final BillingResult zzp;
    static final BillingResult zzq;
    static final BillingResult zzr;
    static final BillingResult zzs;
    static final BillingResult zzt;
    static final BillingResult zzu;
    static final BillingResult zzv;
    static final BillingResult zzw;
    static final BillingResult zzx;
    static final BillingResult zzy;
    static final BillingResult zzz;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(0);
        zzl = builderNewBuilder.build();
        zzm = F91.m2537t(-1, "Service connection is disconnected.");
        zzn = F91.m2537t(2, "Timeout communicating with service.");
        zzo = F91.m2537t(-2, "Client does not support subscriptions.");
        zzp = F91.m2537t(-2, "Client does not support subscriptions update.");
        zzq = F91.m2537t(-2, "Client does not support get purchase history.");
        zzr = F91.m2537t(-2, "Client does not support price change confirmation.");
        zzs = F91.m2537t(-2, "Play Store version installed does not support cross selling products.");
        zzt = F91.m2537t(-2, "Client does not support multi-item purchases.");
        zzu = F91.m2537t(-2, "Client does not support offer_id_token.");
        zzv = F91.m2537t(-2, "Client does not support ProductDetails.");
        zzw = F91.m2537t(-2, "Client does not support in-app messages.");
        zzx = F91.m2537t(-2, "Client does not support user choice billing.");
        zzy = F91.m2537t(-2, "Play Store version installed does not support external offer.");
        zzz = F91.m2537t(5, "Unknown feature");
        zzA = F91.m2537t(-2, "Play Store version installed does not support get billing config.");
        zzB = F91.m2537t(-2, "Query product details with serialized docid is not supported.");
        zzC = F91.m2537t(4, "Item is unavailable for purchase.");
        zzD = F91.m2537t(-2, "Query product details with developer specified account is not supported.");
        zzE = F91.m2537t(-2, "Play Store version installed does not support alternative billing only.");
        zzF = F91.m2537t(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
    }

    public static BillingResult zza(int i, String str) {
        return F91.m2537t(i, str);
    }
}
