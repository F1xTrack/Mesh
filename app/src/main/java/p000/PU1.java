package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class PU1 extends AbstractBinderC9194e32 implements InterfaceC9380fW1 {
    @Override // p000.AbstractBinderC9194e32
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC10858r32.m24151a(parcel, Bundle.CREATOR);
        AbstractC10858r32.m24152b(parcel);
        zza(bundle);
        return true;
    }
}
