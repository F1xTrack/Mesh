package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import p000.AbstractBinderC8295Sw1;
import p000.AbstractC8399Uw1;

/* loaded from: classes.dex */
public abstract class zag extends AbstractBinderC8295Sw1 implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // p000.AbstractBinderC8295Sw1
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) AbstractC8399Uw1.m8202a(parcel, ModuleInstallStatusUpdate.CREATOR);
        AbstractC8399Uw1.m8203b(parcel);
        zab(moduleInstallStatusUpdate);
        return true;
    }
}
