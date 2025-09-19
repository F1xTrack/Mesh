package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import p000.AbstractC8139Pw1;
import p000.AbstractC8399Uw1;

/* loaded from: classes.dex */
public final class zai extends AbstractC8139Pw1 implements IInterface {
    public zai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(TelemetryData telemetryData) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8204c(parcelZaa, telemetryData);
        zad(1, parcelZaa);
    }
}
