package com.p019vk.push.core.auth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p019vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public interface Auth extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.auth.Auth";

    public static class Default implements Auth {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p019vk.push.core.auth.Auth
        public void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.auth.Auth
        public void isUserAuthorized(AsyncCallback asyncCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements Auth {
        public Stub() {
            attachInterface(this, Auth.DESCRIPTOR);
        }

        public static Auth asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(Auth.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof Auth)) {
                return (Auth) iInterfaceQueryLocalInterface;
            }
            C2416a c2416a = new C2416a();
            c2416a.f20323a = iBinder;
            return c2416a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(Auth.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(Auth.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                getIntermediateToken(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                isUserAuthorized(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException;

    void isUserAuthorized(AsyncCallback asyncCallback) throws RemoteException;
}
