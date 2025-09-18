package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: iu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5209iu1 implements InterfaceC1407Ru1, IInterface {
    public final IBinder a;

    public C5209iu1(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.InterfaceC1407Ru1
    public final void C(Bundle bundle, BinderC7697vw1 binderC7697vw1) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
        int i = AbstractC1011Ms1.a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC7697vw1);
        try {
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
