package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class MZ1 implements M02, IInterface {
    public final IBinder a;

    public MZ1(IBinder iBinder) {
        this.a = iBinder;
    }

    public final int G(String str, int i, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        int i2 = AbstractC6768r32.a;
        parcelJ.writeInt(1);
        bundle.writeToParcel(parcelJ, 0);
        Parcel parcelK = K(10, parcelJ);
        int i3 = parcelK.readInt();
        parcelK.recycle();
        return i3;
    }

    public final Bundle H(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        int i2 = AbstractC6768r32.a;
        parcelJ.writeInt(1);
        bundle.writeToParcel(parcelJ, 0);
        parcelJ.writeInt(1);
        bundle2.writeToParcel(parcelJ, 0);
        Parcel parcelK = K(901, parcelJ);
        Bundle bundle3 = (Bundle) AbstractC6768r32.a(parcelK, Bundle.CREATOR);
        parcelK.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(String str, Bundle bundle, InterfaceC6265oQ1 interfaceC6265oQ1) {
        Parcel parcelJ = J();
        parcelJ.writeInt(18);
        parcelJ.writeString(str);
        int i = AbstractC6768r32.a;
        parcelJ.writeInt(1);
        bundle.writeToParcel(parcelJ, 0);
        parcelJ.writeStrongBinder(interfaceC6265oQ1);
        L(1301, parcelJ);
    }

    public final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return parcelObtain;
    }

    public final Parcel K(int i, Parcel parcel) {
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

    public final void L(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void M(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
