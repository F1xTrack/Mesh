package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: u12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC11236u12 extends AbstractBinderC9194e32 implements InterfaceC8802b22 {
    @Override // p000.AbstractBinderC9194e32
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC10858r32.m24151a(parcel, Bundle.CREATOR);
        AbstractC10858r32.m24152b(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
