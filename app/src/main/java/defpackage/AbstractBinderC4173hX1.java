package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: hX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4173hX1 extends AbstractBinderC3510e32 implements DY1 {
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
