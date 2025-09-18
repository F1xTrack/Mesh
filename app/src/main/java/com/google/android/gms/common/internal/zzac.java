package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.KC1;
import p000.NA1;

/* loaded from: classes.dex */
public abstract class zzac extends NA1 implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p000.NA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) KC1.m4576a(parcel, Bundle.CREATOR);
            KC1.m4577b(parcel);
            onPostInitComplete(i3, strongBinder, bundle);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            Bundle bundle2 = (Bundle) KC1.m4576a(parcel, Bundle.CREATOR);
            KC1.m4577b(parcel);
            zzb(i4, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) KC1.m4576a(parcel, zzk.CREATOR);
            KC1.m4577b(parcel);
            zzc(i5, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
