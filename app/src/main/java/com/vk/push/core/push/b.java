package com.vk.push.core.push;

import android.os.IBinder;
import android.os.Parcel;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public final class b implements PushProvider {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.vk.push.core.push.PushProvider
    public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(PushProvider.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
