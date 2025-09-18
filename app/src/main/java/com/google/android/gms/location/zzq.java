package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.LC1;
import p000.OA1;

/* loaded from: classes.dex */
public abstract class zzq extends OA1 implements zzr {
    public zzq() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzr zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder);
    }

    @Override // p000.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) LC1.m4923a(parcel, LocationResult.CREATOR);
            LC1.m4924b(parcel);
            zze(locationResult);
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) LC1.m4923a(parcel, LocationAvailability.CREATOR);
            LC1.m4924b(parcel);
            zzd(locationAvailability);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
