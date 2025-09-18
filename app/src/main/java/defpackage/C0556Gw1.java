package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: Gw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0556Gw1 implements InterfaceC0868Kw1 {
    public final IBinder a;

    public C0556Gw1(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void G(Bundle bundle, String str, BinderC5778lt0 binderC5778lt0) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(binderC5778lt0);
            this.a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    public final void H(String str, BinderC5778lt0 binderC5778lt0) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(binderC5778lt0);
            this.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
