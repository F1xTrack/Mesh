package com.p019vk.push.core.push;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p019vk.push.common.messaging.RemoteMessage;
import com.p019vk.push.core.base.AsyncCallback;
import java.util.List;

/* loaded from: classes2.dex */
public interface PushClient extends IInterface {
    public static final String DESCRIPTOR = "com.vk.push.core.push.PushClient";

    public static class Default implements PushClient {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p019vk.push.core.push.PushClient
        public void isPushTokenExist(String str, AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.push.PushClient
        public void onDeletedMessages(AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.push.PushClient
        public void onMessagesReceived(List<RemoteMessage> list, AsyncCallback asyncCallback) throws RemoteException {
        }

        @Override // com.p019vk.push.core.push.PushClient
        public void onTokenInvalidated(AsyncCallback asyncCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements PushClient {
        public Stub() {
            attachInterface(this, PushClient.DESCRIPTOR);
        }

        public static PushClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PushClient.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof PushClient)) {
                return (PushClient) iInterfaceQueryLocalInterface;
            }
            C2420a c2420a = new C2420a();
            c2420a.f20490a = iBinder;
            return c2420a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PushClient.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PushClient.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                onMessagesReceived(parcel.createTypedArrayList(RemoteMessage.INSTANCE), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                onTokenInvalidated(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 4) {
                onDeletedMessages(AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                isPushTokenExist(parcel.readString(), AsyncCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    public static class _Parcel {
    }

    void isPushTokenExist(String str, AsyncCallback asyncCallback) throws RemoteException;

    void onDeletedMessages(AsyncCallback asyncCallback) throws RemoteException;

    void onMessagesReceived(List<RemoteMessage> list, AsyncCallback asyncCallback) throws RemoteException;

    void onTokenInvalidated(AsyncCallback asyncCallback) throws RemoteException;
}
