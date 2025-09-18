package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: kG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5471kG1 extends AbstractBinderC3510e32 implements InterfaceC3937gI1 {
    @Override // defpackage.AbstractBinderC3510e32
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC6768r32.a(parcel, Bundle.CREATOR);
        AbstractC6768r32.b(parcel);
        zza(bundle);
        return true;
    }
}
