package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import p000.AbstractBinderC8295Sw1;
import p000.AbstractC8399Uw1;

/* loaded from: classes.dex */
public abstract class zad extends AbstractBinderC8295Sw1 implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // p000.AbstractBinderC8295Sw1
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) AbstractC8399Uw1.m8202a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) AbstractC8399Uw1.m8202a(parcel, ModuleAvailabilityResponse.CREATOR);
            AbstractC8399Uw1.m8203b(parcel);
            zae(status, moduleAvailabilityResponse);
        } else if (i == 2) {
            Status status2 = (Status) AbstractC8399Uw1.m8202a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) AbstractC8399Uw1.m8202a(parcel, ModuleInstallResponse.CREATOR);
            AbstractC8399Uw1.m8203b(parcel);
            zad(status2, moduleInstallResponse);
        } else if (i == 3) {
            Status status3 = (Status) AbstractC8399Uw1.m8202a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) AbstractC8399Uw1.m8202a(parcel, ModuleInstallIntentResponse.CREATOR);
            AbstractC8399Uw1.m8203b(parcel);
            zac(status3, moduleInstallIntentResponse);
        } else {
            if (i != 4) {
                return false;
            }
            Status status4 = (Status) AbstractC8399Uw1.m8202a(parcel, Status.CREATOR);
            AbstractC8399Uw1.m8203b(parcel);
            zab(status4);
        }
        return true;
    }
}
