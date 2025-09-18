package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class MZ1 implements M02, IInterface {

    /* renamed from: a */
    public final IBinder f7228a;

    public MZ1(IBinder iBinder) {
        this.f7228a = iBinder;
    }

    /* renamed from: G */
    public final int m5400G(String str, int i, String str2, Bundle bundle) {
        Parcel parcelM5403J = m5403J();
        parcelM5403J.writeInt(i);
        parcelM5403J.writeString(str);
        parcelM5403J.writeString(str2);
        int i2 = AbstractC10858r32.f41324a;
        parcelM5403J.writeInt(1);
        bundle.writeToParcel(parcelM5403J, 0);
        Parcel parcelM5404K = m5404K(10, parcelM5403J);
        int i3 = parcelM5404K.readInt();
        parcelM5404K.recycle();
        return i3;
    }

    /* renamed from: H */
    public final Bundle m5401H(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM5403J = m5403J();
        parcelM5403J.writeInt(i);
        parcelM5403J.writeString(str);
        parcelM5403J.writeString(str2);
        int i2 = AbstractC10858r32.f41324a;
        parcelM5403J.writeInt(1);
        bundle.writeToParcel(parcelM5403J, 0);
        parcelM5403J.writeInt(1);
        bundle2.writeToParcel(parcelM5403J, 0);
        Parcel parcelM5404K = m5404K(901, parcelM5403J);
        Bundle bundle3 = (Bundle) AbstractC10858r32.m24151a(parcelM5404K, Bundle.CREATOR);
        parcelM5404K.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public final void m5402I(String str, Bundle bundle, InterfaceC10520oQ1 interfaceC10520oQ1) {
        Parcel parcelM5403J = m5403J();
        parcelM5403J.writeInt(18);
        parcelM5403J.writeString(str);
        int i = AbstractC10858r32.f41324a;
        parcelM5403J.writeInt(1);
        bundle.writeToParcel(parcelM5403J, 0);
        parcelM5403J.writeStrongBinder(interfaceC10520oQ1);
        m5405L(1301, parcelM5403J);
    }

    /* renamed from: J */
    public final Parcel m5403J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return parcelObtain;
    }

    /* renamed from: K */
    public final Parcel m5404K(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7228a.transact(i, parcel, parcelObtain, 0);
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

    /* renamed from: L */
    public final void m5405L(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f7228a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* renamed from: M */
    public final void m5406M(int i, Parcel parcel) {
        try {
            this.f7228a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7228a;
    }
}
