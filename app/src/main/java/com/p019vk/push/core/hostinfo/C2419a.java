package com.p019vk.push.core.hostinfo;

import android.os.IBinder;
import android.os.Parcel;
import com.p019vk.push.core.base.AsyncCallback;

/* renamed from: com.vk.push.core.hostinfo.a */
/* loaded from: classes2.dex */
public final class C2419a implements MasterElections {

    /* renamed from: a */
    public IBinder f20437a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20437a;
    }

    @Override // com.p019vk.push.core.hostinfo.MasterElections
    public final void getHostInfo(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20437a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.hostinfo.MasterElections
    public final void getMaster(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20437a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.hostinfo.MasterElections
    public final void notifyOldMaster(String str, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20437a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.hostinfo.MasterElections
    public final void sendRequestToInitiateElections(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(MasterElections.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20437a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
