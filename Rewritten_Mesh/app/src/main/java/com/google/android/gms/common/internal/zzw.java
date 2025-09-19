package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.AbstractC8349Tx1;
import p000.KC1;

/* loaded from: classes.dex */
public final class zzw extends AbstractC8349Tx1 implements IAccountAccessor {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) KC1.m4576a(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
