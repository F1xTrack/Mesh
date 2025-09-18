package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: Gw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7671Gw1 implements InterfaceC7879Kw1 {

    /* renamed from: a */
    public final IBinder f3969a;

    public C7671Gw1(IBinder iBinder) {
        this.f3969a = iBinder;
    }

    /* renamed from: G */
    public final void m3199G(Bundle bundle, String str, BinderC10193lt0 binderC10193lt0) {
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
            parcelObtain.writeStrongInterface(binderC10193lt0);
            this.f3969a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* renamed from: H */
    public final void m3200H(String str, BinderC10193lt0 binderC10193lt0) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(binderC10193lt0);
            this.f3969a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3969a;
    }
}
