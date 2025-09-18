package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: az1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8793az1 extends AbstractC10714px1 implements InterfaceC10718pz1 {
    /* renamed from: O */
    public final C8403Uy1 m10398O(BinderC8916bx0 binderC8916bx0, C7675Gy1 c7675Gy1) {
        C8403Uy1 c8403Uy1;
        Parcel parcelM23900I = m23900I();
        NC1.m5582a(parcelM23900I, binderC8916bx0);
        parcelM23900I.writeInt(1);
        c7675Gy1.writeToParcel(parcelM23900I, 0);
        Parcel parcelM23902K = m23902K(1, parcelM23900I);
        IBinder strongBinder = parcelM23902K.readStrongBinder();
        if (strongBinder == null) {
            c8403Uy1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c8403Uy1 = iInterfaceQueryLocalInterface instanceof C8403Uy1 ? (C8403Uy1) iInterfaceQueryLocalInterface : new C8403Uy1(strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 1);
        }
        parcelM23902K.recycle();
        return c8403Uy1;
    }
}
