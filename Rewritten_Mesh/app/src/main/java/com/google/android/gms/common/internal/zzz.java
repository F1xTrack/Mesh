package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.InterfaceC9197e50;
import p000.KC1;
import p000.NA1;

/* loaded from: classes.dex */
public abstract class zzz extends NA1 implements zzaa {
    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzaa zzg(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof zzaa ? (zzaa) iInterfaceQueryLocalInterface : new zzy(iBinder);
    }

    @Override // p000.NA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC9197e50 interfaceC9197e50Zzd = zzd();
            parcel2.writeNoException();
            KC1.m4579d(parcel2, interfaceC9197e50Zzd);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
