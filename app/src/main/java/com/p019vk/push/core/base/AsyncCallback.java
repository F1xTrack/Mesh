package com.p019vk.push.core.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface AsyncCallback extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.base.AsyncCallback";

    public static class Default implements AsyncCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p019vk.push.core.base.AsyncCallback
        public void onResult(AidlResult aidlResult) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements AsyncCallback {
        public Stub() {
            attachInterface(this, AsyncCallback.DESCRIPTOR);
        }

        public static AsyncCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(AsyncCallback.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof AsyncCallback)) {
                return (AsyncCallback) iInterfaceQueryLocalInterface;
            }
            C2417a c2417a = new C2417a();
            c2417a.f20341a = iBinder;
            return c2417a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(AsyncCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(AsyncCallback.DESCRIPTOR);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt() != 0 ? AidlResult.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
    }

    public static class _Parcel {
    }

    void onResult(AidlResult aidlResult) throws RemoteException;
}
