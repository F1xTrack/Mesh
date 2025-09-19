package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.HashMap;
import p000.AbstractC9438fz1;
import p000.C8195Qy1;
import p000.L12;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GmsSignatureVerifier {
    private static final zzaa zza;
    private static final zzaa zzb;
    private static final HashMap zzc;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zzd("com.google.android.gms");
        zzyVar.zza(204200000L);
        zzl zzlVar = zzn.zzd;
        byte[] bArrZzf = zzlVar.zzf();
        byte[] bArrZzf2 = zzn.zzb.zzf();
        C8195Qy1 c8195Qy1 = AbstractC9438fz1.f27517b;
        Object[] objArr = {bArrZzf, bArrZzf2};
        L12.m4865c(2, objArr);
        zzyVar.zzc(AbstractC9438fz1.m18340r(2, objArr));
        zzl zzlVar2 = zzn.zzc;
        Object[] objArr2 = {zzlVar2.zzf(), zzn.zza.zzf()};
        L12.m4865c(2, objArr2);
        zzyVar.zzb(AbstractC9438fz1.m18340r(2, objArr2));
        zza = zzyVar.zze();
        zzy zzyVar2 = new zzy();
        zzyVar2.zzd("com.android.vending");
        zzyVar2.zza(82240000L);
        Object[] objArr3 = {zzlVar.zzf()};
        L12.m4865c(1, objArr3);
        zzyVar2.zzc(AbstractC9438fz1.m18340r(1, objArr3));
        Object[] objArr4 = {zzlVar2.zzf()};
        L12.m4865c(1, objArr4);
        zzyVar2.zzb(AbstractC9438fz1.m18340r(1, objArr4));
        zzb = zzyVar2.zze();
        zzc = new HashMap();
    }
}
