package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: iu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9812iu1 implements InterfaceC8239Ru1, IInterface {

    /* renamed from: a */
    public final IBinder f34797a;

    public C9812iu1(IBinder iBinder) {
        this.f34797a = iBinder;
    }

    @Override // p000.InterfaceC8239Ru1
    /* renamed from: C */
    public final void mo7127C(Bundle bundle, BinderC11480vw1 binderC11480vw1) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
        int i = AbstractC7975Ms1.f7377a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC11480vw1);
        try {
            this.f34797a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34797a;
    }
}
