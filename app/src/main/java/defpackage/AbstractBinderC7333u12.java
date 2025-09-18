package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: u12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7333u12 extends AbstractBinderC3510e32 implements InterfaceC2250b22 {
    @Override // defpackage.AbstractBinderC3510e32
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC6768r32.a(parcel, Bundle.CREATOR);
        AbstractC6768r32.b(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
