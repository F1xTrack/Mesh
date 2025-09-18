package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: sE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6992sE1 implements InterfaceC3365dI1, IInterface {
    public final IBinder a;

    public C6992sE1(IBinder iBinder) {
        this.a = iBinder;
    }

    public final Parcel G(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
