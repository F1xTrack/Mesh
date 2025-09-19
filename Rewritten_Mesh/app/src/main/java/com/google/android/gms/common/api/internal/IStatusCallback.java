package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p000.AbstractBinderC8295Sw1;
import p000.AbstractC8399Uw1;

/* loaded from: classes.dex */
public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends AbstractBinderC8295Sw1 implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static IStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof IStatusCallback ? (IStatusCallback) iInterfaceQueryLocalInterface : new zaby(iBinder);
        }

        @Override // p000.AbstractBinderC8295Sw1
        public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Status status = (Status) AbstractC8399Uw1.m8202a(parcel, Status.CREATOR);
            AbstractC8399Uw1.m8203b(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(Status status) throws RemoteException;
}
