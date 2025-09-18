package com.vk.push.core.auth;

import android.os.IBinder;
import android.os.Parcel;
import com.vk.push.core.base.AsyncCallback;

/* loaded from: classes2.dex */
public final class a implements Auth {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.vk.push.core.auth.Auth
    public final void getIntermediateToken(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(Auth.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.vk.push.core.auth.Auth
    public final void isUserAuthorized(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(Auth.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
