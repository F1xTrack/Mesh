package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.AbstractC8349Tx1;
import p000.InterfaceC9197e50;
import p000.KC1;

/* loaded from: classes.dex */
public final class zzae extends AbstractC8349Tx1 implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4578c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(6, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) KC1.m4576a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4578c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) KC1.m4576a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzB = zzB(9, zza());
        int i = KC1.f5943a;
        boolean z = parcelZzB.readInt() != 0;
        parcelZzB.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, InterfaceC9197e50 interfaceC9197e50) throws RemoteException {
        Parcel parcelZza = zza();
        KC1.m4578c(parcelZza, zzsVar);
        KC1.m4579d(parcelZza, interfaceC9197e50);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean z = parcelZzB.readInt() != 0;
        parcelZzB.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzi() throws RemoteException {
        Parcel parcelZzB = zzB(7, zza());
        int i = KC1.f5943a;
        boolean z = parcelZzB.readInt() != 0;
        parcelZzB.recycle();
        return z;
    }
}
