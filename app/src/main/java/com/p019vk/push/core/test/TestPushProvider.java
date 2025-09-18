package com.p019vk.push.core.test;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p019vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public interface TestPushProvider extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.test.TestPushProvider";

    public static class Default implements TestPushProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p019vk.push.core.test.TestPushProvider
        public void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.test.TestPushProvider
        public void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.test.TestPushProvider
        public void sendTestPush(String str, TestPushPayload testPushPayload, AsyncCallback asyncCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements TestPushProvider {
        public Stub() {
            attachInterface(this, TestPushProvider.DESCRIPTOR);
        }

        public static TestPushProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(TestPushProvider.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof TestPushProvider)) {
                return (TestPushProvider) iInterfaceQueryLocalInterface;
            }
            C2426a c2426a = new C2426a();
            c2426a.f20586a = iBinder;
            return c2426a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(TestPushProvider.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(TestPushProvider.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                registerForPushes(parcel.readString(), parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                sendTestPush(parcel.readString(), parcel.readInt() != 0 ? TestPushPayload.INSTANCE.createFromParcel(parcel) : null, AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                getIntermediateToken(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    public static class _Parcel {
    }

    void getIntermediateToken(AsyncCallback asyncCallback) throws RemoteException;

    void registerForPushes(String str, String str2, AsyncCallback asyncCallback) throws RemoteException;

    void sendTestPush(String str, TestPushPayload testPushPayload, AsyncCallback asyncCallback) throws RemoteException;
}
