package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p000.NA1;

/* loaded from: classes.dex */
public abstract class zzaf extends NA1 implements zzag {
    public static zzag zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof zzag ? (zzag) iInterfaceQueryLocalInterface : new zzae(iBinder);
    }
}
