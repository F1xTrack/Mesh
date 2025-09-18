package com.vk.push.core.base;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class a implements AsyncCallback {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.vk.push.core.base.AsyncCallback
    public final void onResult(AidlResult aidlResult) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(AsyncCallback.DESCRIPTOR);
            if (aidlResult != null) {
                parcelObtain.writeInt(1);
                aidlResult.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
