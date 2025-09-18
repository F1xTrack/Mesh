package com.vk.push.core.test;

import android.os.IBinder;
import android.os.Parcel;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public final class a implements TestPushProvider {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.vk.push.core.test.TestPushProvider
    public final void getIntermediateToken(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.vk.push.core.test.TestPushProvider
    public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.vk.push.core.test.TestPushProvider
    public final void sendTestPush(String str, TestPushPayload testPushPayload, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
            parcelObtain.writeString(str);
            if (testPushPayload != null) {
                parcelObtain.writeInt(1);
                testPushPayload.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
