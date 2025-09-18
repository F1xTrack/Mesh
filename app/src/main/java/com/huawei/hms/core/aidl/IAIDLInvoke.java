package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.core.aidl.IAIDLCallback;

/* loaded from: classes.dex */
public interface IAIDLInvoke extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hms.core.aidl.IAIDLInvoke";

    public static abstract class Stub extends Binder implements IAIDLInvoke {

        /* renamed from: com.huawei.hms.core.aidl.IAIDLInvoke$Stub$a */
        public static class C2075a implements IAIDLInvoke {

            /* renamed from: a */
            private IBinder f18989a;

            public C2075a(IBinder iBinder) {
                this.f18989a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18989a;
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void asyncCall(DataBuffer dataBuffer, IAIDLCallback iAIDLCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIDLInvoke.DESCRIPTOR);
                    C2076a.m11651b(parcelObtain, dataBuffer, 0);
                    parcelObtain.writeStrongInterface(iAIDLCallback);
                    this.f18989a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void syncCall(DataBuffer dataBuffer) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIDLInvoke.DESCRIPTOR);
                    C2076a.m11651b(parcelObtain, dataBuffer, 0);
                    this.f18989a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAIDLInvoke.DESCRIPTOR);
        }

        public static IAIDLInvoke asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAIDLInvoke.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAIDLInvoke)) ? new C2075a(iBinder) : (IAIDLInvoke) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAIDLInvoke.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAIDLInvoke.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                syncCall((DataBuffer) C2076a.m11650b(parcel, DataBuffer.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                asyncCall((DataBuffer) C2076a.m11650b(parcel, DataBuffer.CREATOR), IAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    /* renamed from: com.huawei.hms.core.aidl.IAIDLInvoke$a */
    public static class C2076a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T> T m11650b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T extends Parcelable> void m11651b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    void asyncCall(DataBuffer dataBuffer, IAIDLCallback iAIDLCallback) throws RemoteException;

    void syncCall(DataBuffer dataBuffer) throws RemoteException;
}
