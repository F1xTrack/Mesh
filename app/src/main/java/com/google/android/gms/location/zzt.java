package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.LC1;
import p000.OA1;

/* loaded from: classes.dex */
public abstract class zzt extends OA1 implements zzu {
    public zzt() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzu zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof zzu ? (zzu) iInterfaceQueryLocalInterface : new zzs(iBinder);
    }

    @Override // p000.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Location location = (Location) LC1.m4923a(parcel, Location.CREATOR);
            LC1.m4924b(parcel);
            zzd(location);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
