package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import p000.AbstractC8139Pw1;
import p000.AbstractC8399Uw1;

/* loaded from: classes.dex */
public final class zaf extends AbstractC8139Pw1 implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8205d(parcelZaa, zaeVar);
        AbstractC8399Uw1.m8204c(parcelZaa, apiFeatureRequest);
        zac(1, parcelZaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8205d(parcelZaa, zaeVar);
        AbstractC8399Uw1.m8204c(parcelZaa, apiFeatureRequest);
        zac(3, parcelZaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8205d(parcelZaa, zaeVar);
        AbstractC8399Uw1.m8204c(parcelZaa, apiFeatureRequest);
        AbstractC8399Uw1.m8205d(parcelZaa, zahVar);
        zac(2, parcelZaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8205d(parcelZaa, iStatusCallback);
        AbstractC8399Uw1.m8204c(parcelZaa, apiFeatureRequest);
        zac(4, parcelZaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8205d(parcelZaa, iStatusCallback);
        AbstractC8399Uw1.m8205d(parcelZaa, zahVar);
        zac(6, parcelZaa);
    }
}
