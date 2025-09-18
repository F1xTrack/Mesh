package com.p019vk.push.core.push;

import android.os.IBinder;
import android.os.Parcel;
import com.p019vk.push.core.base.AsyncCallback;

/* renamed from: com.vk.push.core.push.b */
/* loaded from: classes2.dex */
public final class C2421b implements PushProvider {

    /* renamed from: a */
    public IBinder f20491a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20491a;
    }

    @Override // com.p019vk.push.core.push.PushProvider
    public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(PushProvider.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20491a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
