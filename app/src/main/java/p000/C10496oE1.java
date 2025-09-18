package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: oE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10496oE1 implements InterfaceC8707aI1, IInterface {

    /* renamed from: a */
    public final IBinder f38901a;

    public C10496oE1(IBinder iBinder) {
        this.f38901a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38901a;
    }

    @Override // p000.InterfaceC8707aI1
    /* renamed from: i */
    public final void mo9700i(String str, Bundle bundle, KM1 km1) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i = CC1.f1252a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(km1);
        try {
            this.f38901a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
