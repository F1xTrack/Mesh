package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.AbstractC8349Tx1;
import p000.BinderC8916bx0;
import p000.InterfaceC9197e50;

/* loaded from: classes.dex */
public final class zzy extends AbstractC8349Tx1 implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final InterfaceC9197e50 zzd() throws RemoteException {
        Parcel parcelZzB = zzB(1, zza());
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC9197e50M10546G;
    }
}
