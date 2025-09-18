package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import p000.AbstractBinderC8295Sw1;
import p000.AbstractC8399Uw1;

/* loaded from: classes.dex */
public abstract class zaj extends AbstractBinderC8295Sw1 implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // p000.AbstractBinderC8295Sw1
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        AbstractC8399Uw1.m8203b(parcel);
        zab(i3);
        return true;
    }
}
