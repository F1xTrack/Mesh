package com.p019vk.push.core.push;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p019vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public interface PushProvider extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.push.PushProvider";

    public static class Default implements PushProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p019vk.push.core.push.PushProvider
        public void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements PushProvider {
        public Stub() {
            attachInterface(this, PushProvider.DESCRIPTOR);
        }

        public static PushProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PushProvider.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof PushProvider)) {
                return (PushProvider) iInterfaceQueryLocalInterface;
            }
            C2421b c2421b = new C2421b();
            c2421b.f20491a = iBinder;
            return c2421b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PushProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PushProvider.DESCRIPTOR);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            registerForPushes(parcel.readString(), parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }
    }

    void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException;
}
