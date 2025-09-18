package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.AbstractC8139Pw1;
import p000.AbstractC8399Uw1;
import p000.BinderC8916bx0;
import p000.InterfaceC9197e50;

/* loaded from: classes.dex */
public final class zam extends AbstractC8139Pw1 implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final InterfaceC9197e50 zae(InterfaceC9197e50 interfaceC9197e50, zax zaxVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        AbstractC8399Uw1.m8205d(parcelZaa, interfaceC9197e50);
        AbstractC8399Uw1.m8204c(parcelZaa, zaxVar);
        Parcel parcelZab = zab(2, parcelZaa);
        InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcelZab.readStrongBinder());
        parcelZab.recycle();
        return interfaceC9197e50M10546G;
    }
}
