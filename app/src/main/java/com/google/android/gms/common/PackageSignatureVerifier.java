package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class PackageSignatureVerifier {
    static volatile zzab zza;
    private static zzac zzb;

    private static zzac zza(Context context) {
        zzac zzacVar;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (zzb == null) {
                    zzb = new zzac(context);
                }
                zzacVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzacVar;
    }

    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(Context context, String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!zzn.zzf()) {
            throw new zzad();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : ResultCode.ERROR);
        if (zza != null && zza.zza.equals(strConcat)) {
            return zza.zzb;
        }
        zza(context);
        zzw zzwVarZzc = zzn.zzc(str, zHonorsDebugCertificates, false, false);
        if (zzwVarZzc.zza) {
            zza = new zzab(strConcat, PackageVerificationResult.zzd(str, zzwVarZzc.zzd));
            return zza.zzb;
        }
        Preconditions.checkNotNull(zzwVarZzc.zzb);
        return PackageVerificationResult.zza(str, zzwVarZzc.zzb, zzwVarZzc.zzc);
    }

    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException unused) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (packageVerificationResultQueryPackageSignatureVerified2.zzc()) {
            }
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
