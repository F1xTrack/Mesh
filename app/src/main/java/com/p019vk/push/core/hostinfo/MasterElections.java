package com.p019vk.push.core.hostinfo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p019vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public interface MasterElections extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.hostinfo.MasterElections";

    public static class Default implements MasterElections {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p019vk.push.core.hostinfo.MasterElections
        public void getHostInfo(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.hostinfo.MasterElections
        public void getMaster(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.hostinfo.MasterElections
        public void notifyOldMaster(String str, AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.hostinfo.MasterElections
        public void sendRequestToInitiateElections(AsyncCallback asyncCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements MasterElections {
        public Stub() {
            attachInterface(this, MasterElections.DESCRIPTOR);
        }

        public static MasterElections asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(MasterElections.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof MasterElections)) {
                return (MasterElections) iInterfaceQueryLocalInterface;
            }
            C2419a c2419a = new C2419a();
            c2419a.f20437a = iBinder;
            return c2419a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(MasterElections.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(MasterElections.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                getHostInfo(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                sendRequestToInitiateElections(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 4) {
                getMaster(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                notifyOldMaster(parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    void getHostInfo(AsyncCallback asyncCallback) throws RemoteException;

    void getMaster(AsyncCallback asyncCallback) throws RemoteException;

    void notifyOldMaster(String str, AsyncCallback asyncCallback) throws RemoteException;

    void sendRequestToInitiateElections(AsyncCallback asyncCallback) throws RemoteException;
}
