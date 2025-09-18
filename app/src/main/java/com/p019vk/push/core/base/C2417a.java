package com.p019vk.push.core.base;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.vk.push.core.base.a */
/* loaded from: classes2.dex */
public final class C2417a implements AsyncCallback {

    /* renamed from: a */
    public IBinder f20341a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20341a;
    }

    @Override // com.p019vk.push.core.base.AsyncCallback
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
            this.f20341a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
