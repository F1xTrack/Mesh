package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: io.appmetrica.analytics.identifiers.impl.n */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4348n extends Binder implements InterfaceC4349o {
    public AbstractBinderC4348n() {
        attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    /* renamed from: a */
    public static InterfaceC4349o m19178a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4349o)) ? new C4347m(iBinder) : (InterfaceC4349o) iInterfaceQueryLocalInterface;
    }

    /* renamed from: a */
    public abstract /* synthetic */ String m19179a() throws RemoteException;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: b */
    public abstract /* synthetic */ boolean m19180b() throws RemoteException;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            String strM19179a = m19179a();
            parcel2.writeNoException();
            parcel2.writeString(strM19179a);
            return true;
        }
        if (i != 2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return true;
        }
        parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        boolean zM19180b = m19180b();
        parcel2.writeNoException();
        parcel2.writeInt(zM19180b ? 1 : 0);
        return true;
    }
}
