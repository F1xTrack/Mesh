package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import p000.AbstractC8349Tx1;

/* loaded from: classes.dex */
public final class zzx extends AbstractC8349Tx1 implements ICancelToken {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
