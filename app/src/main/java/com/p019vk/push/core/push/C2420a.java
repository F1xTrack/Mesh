package com.p019vk.push.core.push;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.p019vk.push.core.base.AsyncCallback;
import java.util.List;

/* renamed from: com.vk.push.core.push.a */
/* loaded from: classes2.dex */
public final class C2420a implements PushClient {

    /* renamed from: a */
    public IBinder f20490a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20490a;
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void isPushTokenExist(String str, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(PushClient.DESCRIPTOR);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20490a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void onDeletedMessages(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(PushClient.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20490a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void onMessagesReceived(List list, AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(PushClient.DESCRIPTOR);
            if (list == null) {
                parcelObtain.writeInt(-1);
            } else {
                int size = list.size();
                parcelObtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    Parcelable parcelable = (Parcelable) list.get(i);
                    if (parcelable != null) {
                        parcelObtain.writeInt(1);
                        parcelable.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                }
            }
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20490a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.p019vk.push.core.push.PushClient
    public final void onTokenInvalidated(AsyncCallback asyncCallback) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(PushClient.DESCRIPTOR);
            parcelObtain.writeStrongInterface(asyncCallback);
            this.f20490a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
