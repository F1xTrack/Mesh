package com.p019vk.push.core.test;

import android.os.IBinder;
import android.os.Parcel;
import com.p019vk.push.core.base.AsyncCallback;

/* renamed from: com.vk.push.core.test.a */
/* loaded from: classes2.dex */
public final class C2426a implements TestPushProvider {

    /* renamed from: a */
    public IBinder f20586a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20586a;
    }

    @Override // com.p019vk.push.core.test.TestPushProvider
    public final void getIntermediateToken(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20586a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.test.TestPushProvider
    public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(TestPushProvider.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20586a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.test.TestPushProvider
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
            this.f20586a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
