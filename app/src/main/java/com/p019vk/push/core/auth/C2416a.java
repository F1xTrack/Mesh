package com.p019vk.push.core.auth;

import android.os.IBinder;
import android.os.Parcel;
import com.p019vk.push.core.base.AsyncCallback;

/* renamed from: com.vk.push.core.auth.a */
/* loaded from: classes2.dex */
public final class C2416a implements Auth {

    /* renamed from: a */
    public IBinder f20323a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20323a;
    }

    @Override // com.p019vk.push.core.auth.Auth
    public final void getIntermediateToken(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(Auth.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20323a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.auth.Auth
    public final void isUserAuthorized(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(Auth.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20323a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
