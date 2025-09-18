package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: sE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11008sE1 implements InterfaceC9096dI1, IInterface {

    /* renamed from: a */
    public final IBinder f42333a;

    public C11008sE1(IBinder iBinder) {
        this.f42333a = iBinder;
    }

    /* renamed from: G */
    public final Parcel m24683G(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f42333a.transact(i, parcel, parcelObtain, 0);
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
        return this.f42333a;
    }
}
