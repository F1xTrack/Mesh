package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: e32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC9194e32 extends Binder implements IInterface {
    public AbstractBinderC9194e32(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return zzb(i, parcel, parcel2, i2);
    }

    public abstract boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
