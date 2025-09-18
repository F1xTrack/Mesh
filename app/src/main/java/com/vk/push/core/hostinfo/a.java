package com.vk.push.core.hostinfo;

import android.os.IBinder;
import android.os.Parcel;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public final class a implements MasterElections {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void getHostInfo(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void getMaster(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void notifyOldMaster(String str, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void sendRequestToInitiateElections(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
