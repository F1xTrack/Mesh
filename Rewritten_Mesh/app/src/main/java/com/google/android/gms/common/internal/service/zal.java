package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.AbstractC8139Pw1;
import p000.AbstractC8399Uw1;

/* loaded from: classes.dex */
public final class zal extends AbstractC8139Pw1 implements IInterface {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8205d(parcelZaa, zakVar);
        zad(1, parcelZaa);
    }
}
